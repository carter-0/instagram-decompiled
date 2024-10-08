package X;

import java.lang.ref.Reference;
import java.util.Set;

/* renamed from: X.6Vu  reason: invalid class name and case insensitive filesystem */
public final class C308836Vu {
    public final /* synthetic */ AnonymousClass3BV A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C308836Vu(AnonymousClass3BV r1, String str, String str2) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }

    public final void A00(boolean z) {
        Set<Reference> set = this.A00.A04;
        for (Reference reference : set) {
            C311566ct r2 = (C311566ct) reference.get();
            if (r2 == null) {
                set.remove(reference);
            } else {
                String str = this.A01;
                String str2 = this.A02;
                if (z) {
                    r2.DQr(str, str2);
                } else {
                    r2.DQ3(str, str2);
                }
            }
        }
    }
}
