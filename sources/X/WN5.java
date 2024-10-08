package X;

import java.util.List;

public final class WN5 implements X39 {
    public final String A00;
    public final String A01;

    public final List FMs(X8K x8k, X8K x8k2) {
        String A0l;
        StringBuilder sb = new StringBuilder();
        sb.append(x8k.getDisplayName());
        sb.append('.');
        String str = this.A00;
        sb.append(str);
        sb.append("==");
        sb.append(x8k2.getDisplayName());
        sb.append('.');
        String str2 = this.A01;
        String A0l2 = AnonymousClass7TF.A0l(str2, sb);
        String stringForKey = x8k.getStringForKey(str);
        String stringForKey2 = x8k2.getStringForKey(str2);
        boolean A0K = 0qQ.A0K(stringForKey, stringForKey2);
        if (A0K) {
            A0l = A0l2;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(x8k.getDisplayName());
            sb2.append('.');
            sb2.append(str);
            sb2.append('=');
            sb2.append(stringForKey);
            sb2.append(',');
            sb2.append(x8k2.getDisplayName());
            sb2.append('.');
            sb2.append(str2);
            sb2.append('=');
            A0l = AnonymousClass7TF.A0l(stringForKey2, sb2);
        }
        List A11 = C66581MXm.A11(str, str2);
        0qQ.A0B(A0l2, 1);
        0qQ.A0B(A0l, 2);
        return AnonymousClass7TE.A1I(new WNE(A11, A0K, A0l2, A0l));
    }

    public WN5(String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
