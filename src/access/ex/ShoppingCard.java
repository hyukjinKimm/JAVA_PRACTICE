package access.ex;

public class ShoppingCard {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item){
        this.items[itemCount] = item;
        itemCount += 1;
    }
    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        for(int i = 0; i < this.itemCount; i ++){
            System.out.println("상품명: " + items[i].getName() + " 가격: " + items[i].getTotal() );

        }
    }
}
