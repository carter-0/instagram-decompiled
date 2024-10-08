package X;

import com.facebook.graphql.enums.EnumHelper;

/* renamed from: X.Nl2  reason: case insensitive filesystem */
public enum C69420Nl2 {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    SHARE("SHARE"),
    REPLY("REPLY"),
    REACT("REACT"),
    MENTION("MENTION");
    
    public final String A00;

    public static C69420Nl2 A00(String str) {
        return (C69420Nl2) EnumHelper.A00(str, UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C69420Nl2(String str) {
        this.A00 = str;
    }
}
