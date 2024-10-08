package com.facebook.traffic.ctm.api;

public final class CumulativeConnectionStats {
    public final long cumulativeBytesReceived;
    public final long cumulativeBytesSent;
    public final SocketStateStats socketStateStats;
    public final ThrottlingUpdateStats throttlingUpdateStats;

    public final class Builder {
        public long cumulativeBytesReceived = 0;
        public long cumulativeBytesSent = 0;
        public SocketStateStats socketStateStats = new SocketStateStats();
        public ThrottlingUpdateStats throttlingUpdateStats = new ThrottlingUpdateStats();

        public CumulativeConnectionStats build() {
            return new CumulativeConnectionStats(this);
        }

        public Builder cumulativeBytesReceived(long j) {
            this.cumulativeBytesReceived = j;
            return this;
        }

        public Builder cumulativeBytesSent(long j) {
            this.cumulativeBytesSent = j;
            return this;
        }

        public Builder socketStateStats(SocketStateStats socketStateStats2) {
            this.socketStateStats = socketStateStats2;
            return this;
        }

        public Builder throttlingUpdateStats(ThrottlingUpdateStats throttlingUpdateStats2) {
            this.throttlingUpdateStats = throttlingUpdateStats2;
            return this;
        }
    }

    public CumulativeConnectionStats(Builder builder) {
        this.cumulativeBytesSent = builder.cumulativeBytesSent;
        this.cumulativeBytesReceived = builder.cumulativeBytesReceived;
        this.throttlingUpdateStats = builder.throttlingUpdateStats;
        this.socketStateStats = builder.socketStateStats;
    }

    public long getCumulativeBytesReceived() {
        return this.cumulativeBytesReceived;
    }

    public long getCumulativeBytesSent() {
        return this.cumulativeBytesSent;
    }

    public SocketStateStats getSocketStateStats() {
        return this.socketStateStats;
    }

    public ThrottlingUpdateStats getThrottlingUpdateStats() {
        return this.throttlingUpdateStats;
    }
}
