package com.facebook.proxygen;

import X.002;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;

public class GoodputQueryOptions {
    public final boolean hostMustHaveQuicSocket;
    public String hostname;
    public final double percentile;

    public class Builder {
        public boolean mHostMustHaveQuicSocket = false;
        public String mHostname = null;
        public double mPercentile = 0.5d;

        public GoodputQueryOptions build() {
            return new GoodputQueryOptions(this);
        }

        public Builder setPercentile(double d) {
            if (d < 0.0d || d > 1.0d) {
                throw AnonymousClass7TE.A0w(002.A0M("Percentile must be within [0,1] range inclusive. Provided percentile ", d));
            }
            this.mPercentile = d;
            return this;
        }

        public Builder setHostMustHaveQuicSocket(boolean z) {
            this.mHostMustHaveQuicSocket = z;
            return this;
        }

        public Builder setHostname(String str) {
            this.mHostname = str;
            return this;
        }
    }

    public GoodputQueryOptions(Builder builder) {
        this.percentile = builder.mPercentile;
        this.hostname = builder.mHostname;
        this.hostMustHaveQuicSocket = builder.mHostMustHaveQuicSocket;
    }

    public String getHostname() {
        return this.hostname;
    }

    public double getPercentile() {
        return this.percentile;
    }

    public boolean mustHostHaveQuicSocket() {
        return this.hostMustHaveQuicSocket;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("GoodputQueryOptions(percentile=");
        A1A.append(this.percentile);
        A1A.append(",hostname=");
        A1A.append(this.hostname);
        A1A.append(",mustHaveQuicSocket=");
        A1A.append(this.hostMustHaveQuicSocket);
        return AnonymousClass7TF.A0l(")", A1A);
    }
}
