package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.ISa  reason: case insensitive filesystem */
public final class C57187ISa implements C3252171m {
    public final boolean A00;
    public final /* synthetic */ AnonymousClass32L A01;

    public C57187ISa(AnonymousClass32L r3) {
        this.A01 = r3;
        boolean z = AnonymousClass1B0.A05;
        this.A00 = AnonymousClass1B1.A00(r3.getSession()).A00(1B2.A0E);
    }

    public final int Bju() {
        long j;
        boolean z = this.A00;
        UserSession A03 = this.A01.getSession();
        0Tu r2 = 0Tu.A05;
        if (z) {
            j = 36598906683526455L;
        } else {
            j = 36598906683460918L;
        }
        return DbS.A04(r2, A03, j);
    }
}
