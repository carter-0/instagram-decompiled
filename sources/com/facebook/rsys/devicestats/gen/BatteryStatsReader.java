package com.facebook.rsys.devicestats.gen;

public abstract class BatteryStatsReader {
    public abstract long getBatteryLevel();

    public abstract boolean isCharging();
}
