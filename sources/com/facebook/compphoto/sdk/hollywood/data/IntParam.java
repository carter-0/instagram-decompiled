package com.facebook.compphoto.sdk.hollywood.data;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;

public final class IntParam extends AnonymousClass0T0 {
    public final String name;
    public final int value;

    public IntParam(String str, int i) {
        0qQ.A0B(str, 1);
        this.name = str;
        this.value = i;
    }

    public final String component1() {
        return this.name;
    }

    public final int component2() {
        return this.value;
    }

    public final IntParam copy(String str, int i) {
        0qQ.A0B(str, 0);
        return new IntParam(str, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IntParam) {
                IntParam intParam = (IntParam) obj;
                if (!0qQ.A0K(this.name, intParam.name) || this.value != intParam.value) {
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

    public static /* synthetic */ IntParam copy$default(IntParam intParam, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = intParam.name;
        }
        if ((i2 & 2) != 0) {
            i = intParam.value;
        }
        0qQ.A0B(str, 0);
        return new IntParam(str, i);
    }

    public String getName() {
        return this.name;
    }

    public Integer getValue() {
        return Integer.valueOf(this.value);
    }

    public int hashCode() {
        return AnonymousClass7TE.A0O(this.name) + this.value;
    }
}
