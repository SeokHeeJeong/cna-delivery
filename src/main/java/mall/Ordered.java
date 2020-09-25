
package mall;

public class Ordered extends AbstractEvent {

    /* Order MAS 의 event와 동일하게 있어야함
    * Order MAS의 Ordered 사 수정되어도 동일하게 구성할 필요 없음
    * 기존에 있던 values 등의 스팩만 영향이 없으면 문제 없음
    * */

    private Long id;
    private String productId;
    private Integer qty;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
}
