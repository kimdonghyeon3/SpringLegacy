package usr.article;

import usr.Rq;
import usr.article.dto.ArticleDto;

import java.util.ArrayList;
import java.util.List;

public class ArticleRepository {

    private static List<ArticleDto> datum;
    private static long lastId;

    public static List<ArticleDto> getDatum() {
        return datum;
    }

    static {
        datum = new ArrayList<>();
        lastId = 0;
    }

    public long write(String title, String body) {
        long id = ++lastId;
        ArticleDto newArticleDto = new ArticleDto(id, title, body);

        datum.add(newArticleDto);

        return id;
    }

    public void showList(Rq rq) {
        rq.setAttr("articles", datum);
        rq.view("usr/article/list");
    }

    public List<ArticleDto> findAll() {
        return datum;
    }

    public ArticleDto findById(long id) {
        for ( ArticleDto articleDto : datum ) {
            if ( articleDto.getId() == id ) {
                return articleDto;
            }
        }

        return null;
    }
}
