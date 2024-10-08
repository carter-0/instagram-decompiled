package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3PF  reason: invalid class name */
public final class AnonymousClass3PF implements Runnable {
    public final /* synthetic */ C2365134a A00;
    public final /* synthetic */ AnonymousClass376 A01;
    public final /* synthetic */ 1OE A02;

    public AnonymousClass3PF(C2365134a r1, AnonymousClass376 r2, 1OE r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void run() {
        C2365134a r9 = this.A00;
        UserSession userSession = r9.A0F;
        UserSession userSession2 = 1NM.A00(userSession).A00;
        0Tu r10 = 0Tu.A05;
        boolean A06 = 182.A06(r10, userSession2, 36323839797636671L);
        1OI A002 = 1OH.A00(userSession);
        1OE r6 = this.A02;
        AnonymousClass376 r3 = this.A01;
        boolean z = r3.A01;
        C2365834h r0 = r9.A0P.A0C;
        if (A06) {
            AnonymousClass3BN r92 = new AnonymousClass3BN(userSession, r0.A02());
            int i = r3.A00;
            synchronized (A002) {
                AnonymousClass3BO r32 = r92.A01;
                AnonymousClass3BP r11 = r32.A01;
                AnonymousClass3BP r33 = r32.A00;
                int i2 = r11.A01 + r11.A03 + r33.A01 + r33.A00 + r11.A00;
                Integer num = AnonymousClass05K.A00;
                Integer num2 = r6.A04;
                if (num == num2 || AnonymousClass05K.A01 == num2) {
                    A002.A01 = 182.A06(r10, 1NM.A00(A002.A06).A00, 36323839797636671L);
                }
                A002.A00 = r92;
                A002.A09(r6, i2, i, z);
            }
            return;
        }
        A002.A09(r6, r0.getItemCount(), r3.A00, z);
    }
}
