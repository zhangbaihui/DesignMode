package design.pattern.creational.StrategyPattern.PromotionExample;

public class FanXianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
       System.out.println("返现促销,返回的金额放到用户的余额中");
    }
}
