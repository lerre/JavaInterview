package com.kxw.pattern.factory.abs;

/**
 * Created by kangxiongwei3 on 2017/5/17 17:43.
 */
public class SouthFruitFactory implements AbstractFruitFactory {

    @Override
    public Apple getApple() {
        return new SouthApple();
    }

    @Override
    public Banana getBanana() {
        return new SouthBanana();
    }
}
