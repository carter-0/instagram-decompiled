package com.facebook.traffic.ctm.api;

public class RsysCallStatus {
    public final long heartbeatMs;
    public final State state;

    public final class Builder {
        public long heartbeatMs = 0;
        public State state = State.ENDED;

        public RsysCallStatus build() {
            return new RsysCallStatus(this);
        }

        public Builder heartbeatMs(long j) {
            this.heartbeatMs = j;
            return this;
        }

        public Builder state(State state2) {
            this.state = state2;
            return this;
        }
    }

    public enum State {
        ONGOING,
        ENDED
    }

    public RsysCallStatus(Builder builder) {
        this.state = builder.state;
        this.heartbeatMs = builder.heartbeatMs;
    }

    public long getHeartbeatMs() {
        return this.heartbeatMs;
    }

    public State getState() {
        return this.state;
    }
}
