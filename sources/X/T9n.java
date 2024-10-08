package X;

import java.io.Serializable;

public final class T9n implements Serializable {
    public static final T9n A07 = new T9n((C269224em) null, (C269224em) null, (C10434RsB) null, Boolean.FALSE, (Integer) null, (String) null, (String) null);
    public static final T9n A08 = new T9n((C269224em) null, (C269224em) null, (C10434RsB) null, Boolean.TRUE, (Integer) null, (String) null, (String) null);
    public static final T9n A09 = new T9n((C269224em) null, (C269224em) null, (C10434RsB) null, (Boolean) null, (Integer) null, (String) null, (String) null);
    public C269224em A00;
    public C269224em A01;
    public final Boolean A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final transient C10434RsB A06;

    public static T9n A00(Boolean bool, Integer num, String str, String str2) {
        if (str != null || num != null || str2 != null) {
            return new T9n((C269224em) null, (C269224em) null, (C10434RsB) null, bool, num, str, str2);
        }
        if (bool == null) {
            return A09;
        }
        if (bool.booleanValue()) {
            return A08;
        }
        return A07;
    }

    public final T9n A01(C10434RsB rsB) {
        Boolean bool = this.A02;
        String str = this.A05;
        return new T9n(this.A01, this.A00, rsB, bool, this.A03, str, this.A04);
    }

    public T9n(C269224em r2, C269224em r3, C10434RsB rsB, Boolean bool, Integer num, String str, String str2) {
        this.A02 = bool;
        this.A05 = str;
        this.A03 = num;
        this.A04 = (str2 == null || str2.isEmpty()) ? null : str2;
        this.A06 = rsB;
        this.A01 = r2;
        this.A00 = r3;
    }
}
