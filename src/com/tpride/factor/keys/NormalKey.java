package com.tpride.factor.keys;

public class NormalKey implements Key {
    protected final String key;
    protected final double pow;
    protected final boolean positive;

    public NormalKey(String key, double pow) {
        this(key == null ? null : key.replace("-", "").replace("+", ""), pow, true);
    }

    public NormalKey(String key, double pow, boolean positive) {
        if (key == null || key.length() == 0)
            this.key = "0";
        else
            this.key = key;
        this.pow = pow;
        this.positive = positive;
    }
}