package usr.article.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
@Setter
public class ArticleDto {

    private long id;
    private String title;
    private String body;

}
