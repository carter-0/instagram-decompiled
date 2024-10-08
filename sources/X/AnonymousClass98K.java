package X;

import java.security.GeneralSecurityException;

/* renamed from: X.98K  reason: invalid class name */
public final /* synthetic */ class AnonymousClass98K implements C3739097k {
    public final AnonymousClass97G AMH(AnonymousClass983 r6, Integer num) {
        C3739097k r0 = AnonymousClass98J.A01;
        C384459hM r4 = ((AnonymousClass98L) r6).A00.A00;
        AnonymousClass98M r3 = AnonymousClass98M.A02;
        C3738697g A00 = AnonymousClass98M.A00(r3, r4.typeUrl_);
        if (((Boolean) r3.A01.get(r4.typeUrl_)).booleanValue()) {
            C3741498i CrA = A00.CrA(r4.value_);
            String str = CrA.typeUrl_;
            return new AnonymousClass97F(C375049Ca.A00, C3739997t.A00(CrA.A0F(), r4.A0F(), CrA.value_, num, str));
        }
        throw new GeneralSecurityException("Creating new keys is not allowed.");
    }
}
