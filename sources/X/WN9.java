package X;

import java.util.List;

public final class WN9 implements X3A {
    public final String A00;
    public final String A01;

    public final List FMr(X8K x8k) {
        String str = this.A01;
        11S r1 = new 11S(str);
        String str2 = this.A00;
        boolean A08 = r1.A08(x8k.getStringForKey(str2));
        StringBuilder sb = new StringBuilder();
        sb.append(x8k.getDisplayName());
        sb.append('.');
        sb.append(str2);
        String A0s = Pxg.A0s(" matches ", str, sb);
        String valueOf = String.valueOf(A08);
        List A1I = AnonymousClass7TE.A1I(str2);
        AnonymousClass7TG.A1O(A0s, valueOf);
        return AnonymousClass7TE.A1I(new WNE(A1I, A08, A0s, valueOf));
    }

    public WN9(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
