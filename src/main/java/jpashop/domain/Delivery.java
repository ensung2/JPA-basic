package jpashop.domain;

import javax.persistence.*;

@Entity
public class Delivery extends BaseEntity{

    @Id @GeneratedValue
    private Long id;

    // 배송지 정보
    private String city;
    private String street;
    private String zipcode;

    // 배송 상태
    private DeliveryStatus status;

    // 어떤 주문 상태에 관련된 배송인지 조회 (오더와 양방향)
    @OneToOne(mappedBy = "delivery", fetch = FetchType.LAZY)
    private Order order;
}
