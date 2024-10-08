package X;

import java.util.List;

public final class WN7 implements X3A {
    public final String A00;

    public final List FMr(X8K x8k) {
        String str = this.A00;
        boolean z = !AnonymousClass7TF.A1Q(x8k.getStringForKey(str).length());
        StringBuilder sb = new StringBuilder();
        sb.append(x8k.getDisplayName());
        sb.append('.');
        sb.append(str);
        String A0l = AnonymousClass7TF.A0l(" is not null", sb);
        String valueOf = String.valueOf(z);
        List A1I = AnonymousClass7TE.A1I(str);
        AnonymousClass7TG.A1O(A0l, valueOf);
        return AnonymousClass7TE.A1I(new WNE(A1I, z, A0l, valueOf));
    }

    public WN7(String str) {
        this.A00 = str;
    }
}
