package usr.article;

import usr.Rq;
import usr.article.dto.ArticleDto;

import java.util.ArrayList;
import java.util.List;

public class ArticleController {

    private ArticleService articleService;

    public ArticleController() {
        articleService = new ArticleService();
    }

    public void showList(Rq rq) {
        List<ArticleDto> articleDtos = articleService.findAll();

        rq.setAttr("articles", articleDtos);
        rq.view("usr/article/list");

    }

    public void showWrite(Rq rq) {
        rq.view("usr/article/write");
    }

    public void doWrite(Rq rq) {
        String title = rq.getParam("title", "");
        String body = rq.getParam("body", "");

        long id = articleService.write(title, body);

        rq.appendBody("%d번 게시물이 생성 되었습니다.".formatted(id));
    }

    public void showArticle(Rq rq) {
        String[] pathBits = rq.getPath().split("/");
        int articleNum = Integer.parseInt(pathBits[pathBits.length-1]);

        ArticleDto articleDto = articleService.findByNum(articleNum);

        rq.setAttr("article", articleDto);
    }
}
