package X;

import com.facebook.pando.Summary;

/* renamed from: X.7x5  reason: invalid class name and case insensitive filesystem */
public abstract class C347607x5 {
    public static final Integer A00(Summary summary) {
        String str;
        String str2 = summary.source;
        switch (str2.hashCode()) {
            case 461569884:
                if (str2.equals("stale_cache")) {
                    return AnonymousClass05K.A0C;
                }
                break;
            case 1561714200:
                str = AnonymousClass000.A00(2921);
                break;
            case 1782559025:
                str = "fresh_cache";
                break;
            case 1843485230:
                if (str2.equals("network")) {
                    return AnonymousClass05K.A00;
                }
                break;
        }
        if (str2.equals(str)) {
            return AnonymousClass05K.A01;
        }
        return AnonymousClass05K.A0N;
    }
}
