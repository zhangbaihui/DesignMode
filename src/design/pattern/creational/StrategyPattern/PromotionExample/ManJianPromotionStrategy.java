package design.pattern.creational.StrategyPattern.PromotionExample;

public class ManJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("满减促销,满200减20");
    }
}
