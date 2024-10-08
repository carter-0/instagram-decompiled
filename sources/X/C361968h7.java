package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8h7  reason: invalid class name and case insensitive filesystem */
public final class C361968h7 extends 2YL {
    public C279284yO A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public boolean A05;
    public final UserSession A06;
    public final C357638Yz A07;
    public final C361948h5 A08;
    public final AnonymousClass80W A09;
    public final C249513ju A0A;
    public final AnonymousClass0r6 A0B;

    public C361968h7(UserSession userSession, C357638Yz r4, C361948h5 r5, AnonymousClass80W r6) {
        0qQ.A0B(r4, 1);
        0qQ.A0B(r6, 2);
        0qQ.A0B(userSession, 3);
        this.A07 = r4;
        this.A09 = r6;
        this.A06 = userSession;
        this.A08 = r5;
        Integer num = AnonymousClass05K.A0C;
        this.A01 = num;
        this.A02 = num;
        Integer num2 = AnonymousClass05K.A00;
        this.A03 = num2;
        this.A04 = num2;
        1HR r0 = new 1HR(Integer.MAX_VALUE);
        this.A0A = r0;
        this.A0B = 0u9.A04(r0);
        r6.A02(new C361978h8(this));
        r4.A0F(new C361988h9(this));
    }

    public final void A00(boolean z, boolean z2) {
        Integer num;
        Integer num2;
        if (this.A09.A00.first == AnonymousClass80X.PRE_CAPTURE || !0qQ.A0K(this.A07.A08.A00, AnonymousClass9QA.A00) || !C3505585e.A01(this.A06)) {
            Object obj = this.A07.A08.A00;
            if (obj instanceof AnonymousClass80O) {
                if (z) {
                    num2 = AnonymousClass05K.A01;
                } else {
                    num2 = AnonymousClass05K.A0C;
                }
                this.A03 = num2;
            } else if (obj instanceof AnonymousClass9QA) {
                if (z) {
                    num = AnonymousClass05K.A01;
                } else {
                    num = AnonymousClass05K.A0C;
                }
                this.A04 = num;
                if (C3505585e.A01(this.A06)) {
                    this.A05 = z2;
                }
            }
        }
    }
}
