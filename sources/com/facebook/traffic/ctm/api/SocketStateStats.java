package com.facebook.traffic.ctm.api;

public class SocketStateStats {
    public final long downlinkThrottlingEnabled;
    public final long open;
    public final long uplinkThrottlingEnabled;

    public final class Builder {
        public long downlinkThrottlingEnabled = 0;
        public long open = 0;
        public long uplinkThrottlingEnabled = 0;

        public SocketStateStats build() {
            return new SocketStateStats(this);
        }

        public Builder downlinkThrottlingEnabled(long j) {
            this.downlinkThrottlingEnabled = j;
            return this;
        }

        public Builder open(long j) {
            this.open = j;
            return this;
        }

        public Builder uplinkThrottlingEnabled(long j) {
            this.uplinkThrottlingEnabled = j;
            return this;
        }
    }

    public SocketStateStats() {
        this.open = 0;
        this.downlinkThrottlingEnabled = 0;
        this.uplinkThrottlingEnabled = 0;
    }

    public SocketStateStats(Builder builder) {
        this.open = builder.open;
        this.downlinkThrottlingEnabled = builder.downlinkThrottlingEnabled;
        this.uplinkThrottlingEnabled = builder.uplinkThrottlingEnabled;
    }

    public long getOpenSockets() {
        return this.open;
    }

    public long getSocketsWithDownlinkThrottle() {
        return this.downlinkThrottlingEnabled;
    }

    public long getSocketsWithUplinkThrottle() {
        return this.uplinkThrottlingEnabled;
    }
}
