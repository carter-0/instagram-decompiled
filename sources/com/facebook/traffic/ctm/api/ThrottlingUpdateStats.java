package com.facebook.traffic.ctm.api;

public class ThrottlingUpdateStats {
    public final long downlinkDisableCalls;
    public final long downlinkUpdateCalls;
    public final long uplinkDisableCalls;
    public final long uplinkUpdateCalls;

    public final class Builder {
        public long downlinkDisableCalls = 0;
        public long downlinkUpdateCalls = 0;
        public long uplinkDisableCalls = 0;
        public long uplinkUpdateCalls = 0;

        public ThrottlingUpdateStats build() {
            return new ThrottlingUpdateStats(this);
        }

        public Builder downlinkDisableCalls(long j) {
            this.downlinkDisableCalls = j;
            return this;
        }

        public Builder downlinkUpdateCalls(long j) {
            this.downlinkUpdateCalls = j;
            return this;
        }

        public Builder uplinkDisableCalls(long j) {
            this.uplinkDisableCalls = j;
            return this;
        }

        public Builder uplinkUpdateCalls(long j) {
            this.uplinkUpdateCalls = j;
            return this;
        }
    }

    public ThrottlingUpdateStats() {
        this.downlinkUpdateCalls = 0;
        this.downlinkDisableCalls = 0;
        this.uplinkUpdateCalls = 0;
        this.uplinkDisableCalls = 0;
    }

    public ThrottlingUpdateStats(Builder builder) {
        this.downlinkUpdateCalls = builder.downlinkUpdateCalls;
        this.downlinkDisableCalls = builder.downlinkDisableCalls;
        this.uplinkUpdateCalls = builder.uplinkUpdateCalls;
        this.uplinkDisableCalls = builder.uplinkDisableCalls;
    }

    public long getDownlinkDisableCalls() {
        return this.downlinkDisableCalls;
    }

    public long getDownlinkUpdateCalls() {
        return this.downlinkUpdateCalls;
    }

    public long getUplinkDisableCalls() {
        return this.uplinkDisableCalls;
    }

    public long getUplinkUpdateCalls() {
        return this.uplinkUpdateCalls;
    }
}
