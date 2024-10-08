package com.facebook.compphoto.sdk.hollywood.data;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;

public final class StringParam extends AnonymousClass0T0 {
    public final String name;
    public final String value;

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.value;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StringParam) {
                StringParam stringParam = (StringParam) obj;
                if (!0qQ.A0K(this.name, stringParam.name) || !0qQ.A0K(this.value, stringParam.value)) {
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

    public static /* synthetic */ StringParam copy$default(StringParam stringParam, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stringParam.name;
        }
        if ((i & 2) != 0) {
            str2 = stringParam.value;
        }
        AnonymousClass7TG.A1N(str, str2);
        return new StringParam(str, str2);
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return C41845B3m.A01(this.value, AnonymousClass7TE.A0O(this.name));
    }

    public StringParam(String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.name = str;
        this.value = str2;
    }

    public final StringParam copy(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        return new StringParam(str, str2);
    }

    public String getValue() {
        return this.value;
    }
}
