package com.facebook.compphoto.sdk.hollywood.data;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;

public final class BooleanParam extends AnonymousClass0T0 {
    public final String name;
    public final boolean value;

    public BooleanParam(String str, boolean z) {
        0qQ.A0B(str, 1);
        this.name = str;
        this.value = z;
    }

    public final String component1() {
        return this.name;
    }

    public final boolean component2() {
        return this.value;
    }

    public final BooleanParam copy(String str, boolean z) {
        0qQ.A0B(str, 0);
        return new BooleanParam(str, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BooleanParam) {
                BooleanParam booleanParam = (BooleanParam) obj;
                if (!0qQ.A0K(this.name, booleanParam.name) || this.value != booleanParam.value) {
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

    public static /* synthetic */ BooleanParam copy$default(BooleanParam booleanParam, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = booleanParam.name;
        }
        if ((i & 2) != 0) {
            z = booleanParam.value;
        }
        0qQ.A0B(str, 0);
        return new BooleanParam(str, z);
    }

    public String getName() {
        return this.name;
    }

    public Boolean getValue() {
        return Boolean.valueOf(this.value);
    }

    public int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.name);
        int i = 1237;
        if (this.value) {
            i = 1231;
        }
        return A0O + i;
    }
}
