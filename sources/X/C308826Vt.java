package X;

import java.lang.ref.Reference;
import java.util.Set;

/* renamed from: X.6Vt  reason: invalid class name and case insensitive filesystem */
public final class C308826Vt implements AnonymousClass1MK {
    public final /* synthetic */ AnonymousClass3BV A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public final void DK4(C226952iF r1, int i) {
    }

    public C308826Vt(AnonymousClass3BV r1, String str, String str2) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }

    public final void CyF(C226952iF r6, AnonymousClass3LX r7) {
        Set<Reference> set = this.A00.A04;
        for (Reference reference : set) {
            C311566ct r2 = (C311566ct) reference.get();
            if (r2 == null) {
                set.remove(reference);
            } else {
                r2.DQr(this.A01, this.A02);
            }
        }
    }

    public final void DJx(C226952iF r6, C254673sr r7) {
        Set<Reference> set = this.A00.A04;
        for (Reference reference : set) {
            C311566ct r2 = (C311566ct) reference.get();
            if (r2 == null) {
                set.remove(reference);
            } else {
                r2.DQ3(this.A01, this.A02);
            }
        }
    }
}
