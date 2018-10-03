public class Book {

    private String title;
    private float price;
    private String isbn;
    private int numPages;

   public Book() {
       this.title = "No Title";
       this.price = 0.0f;
       this.isbn = "No ISBN";
       this.numPages = 0;
   }

    public float getPrice() {
        return price;
    }

    public String getTitle(){
       return title;

}

    public String getIsbn() {
        return isbn;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setTitle(String title){
       this.title = title;
    }

    public void setPrice(float price){
       this.price = price;
    }

    public void setIsbn(String isbn){
       this.isbn = isbn;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public String toString(){
        return "The Book is" + this.getTitle() +"\n" + this.getPrice() + "\n" + this.getNumPages()+ "\n" + this.getIsbn();
    }
}
