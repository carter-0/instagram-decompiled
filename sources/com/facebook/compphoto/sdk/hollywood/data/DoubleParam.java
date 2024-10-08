package com.facebook.compphoto.sdk.hollywood.data;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.C51968G9o;

public final class DoubleParam extends AnonymousClass0T0 {
    public final String name;
    public final double value;

    public DoubleParam(String str, double d) {
        0qQ.A0B(str, 1);
        this.name = str;
        this.value = d;
    }

    public final String component1() {
        return this.name;
    }

    public final double component2() {
        return this.value;
    }

    public final DoubleParam copy(String str, double d) {
        0qQ.A0B(str, 0);
        return new DoubleParam(str, d);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DoubleParam) {
                DoubleParam doubleParam = (DoubleParam) obj;
                if (!0qQ.A0K(this.name, doubleParam.name) || Double.compare(this.value, doubleParam.value) != 0) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ DoubleParam copy$default(DoubleParam doubleParam, String str, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = doubleParam.name;
        }
        if ((i & 2) != 0) {
            d = doubleParam.value;
        }
        0qQ.A0B(str, 0);
        return new DoubleParam(str, d);
    }

    public String getName() {
        return this.name;
    }

    public Double getValue() {
        return Double.valueOf(this.value);
    }

    public int hashCode() {
        return AnonymousClass7TE.A0O(this.name) + C51968G9o.A03(Double.doubleToLongBits(this.value));
    }
}
