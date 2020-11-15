package design.pattern.creational.StrategyPattern.PromotionExample;

public class LiJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        //立减的价格放在DB中，或者动态配置
        System.out.println("立减促销,课程的价格直接减去配置的价格");
    }
}
