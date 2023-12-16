package lesson7.tech.skelar.TestRepository;

public class GetChaptersResponse {
    private int price;
    private String id;
    private String title;
    private int wordsCount;

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setWordsCount(int wordsCount) {
        this.wordsCount = wordsCount;
    }

    public int getWordsCount() {
        return wordsCount;
    }
}
