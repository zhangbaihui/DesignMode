package design.pattern.creational.StrategyPattern.PromotionExample;

public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void doExcute() {
        promotionStrategy.doPromotion();
    }
}



