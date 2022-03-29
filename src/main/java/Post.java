import com.fasterxml.jackson.annotation.JsonProperty;

public class Post {
    private final String id; // уникальный идентификатор записи
    private final String text; // сообщение
    private final String type; // тип животного
    private final String user; // имя пользователя
    private final Integer upvotes; // голоса

    public Post( // конструктор класса
        @JsonProperty("id") String id,
        @JsonProperty("text") String text,
        @JsonProperty("type") String type,
        @JsonProperty("user") String user,
        @JsonProperty("upvotes") Integer upvotes
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    @Override // переопределяем метод 'toString'
    public String toString() {
        return "Post" +
            "\n id=" + id +
            "\n text=" + text +
            "\n type=" + type +
            "\n user=" + user +
            "\n upvotes=" + upvotes;
    }

}
