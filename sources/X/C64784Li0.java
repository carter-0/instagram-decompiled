package X;

/* renamed from: X.Li0  reason: case insensitive filesystem */
public final class C64784Li0 implements C232262tL {
    public final String A00;
    public final String A01;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return "EARNINGS_CONTENT_KEY";
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C64784Li0 li0 = (C64784Li0) obj;
        String str2 = this.A00;
        String str3 = null;
        if (li0 != null) {
            str = li0.A00;
        } else {
            str = null;
        }
        if (2PP.A00(str2, str)) {
            String str4 = this.A01;
            if (li0 != null) {
                str3 = li0.A01;
            }
            if (!2PP.A00(str4, str3)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C64784Li0(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
