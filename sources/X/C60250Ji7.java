package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.Ji7  reason: case insensitive filesystem */
public final class C60250Ji7 extends 2YL {
    public C62874Kno A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final 2Fk A04;
    public final 2Fk A05;
    public final 2Fk A06;
    public final 2Fk A07;
    public final 2Fk A08;
    public final 2Fk A09;
    public final AnonymousClass2Fj A0A;
    public final AnonymousClass2Fj A0B;
    public final AnonymousClass2Fj A0C;
    public final C13830Ti1 A0D;
    public final LA8 A0E;
    public final C249513ju A0F;
    public final AnonymousClass0r6 A0G;
    public final 05G A0H;
    public final 05G A0I;
    public final AnonymousClass2Fj A0J;
    public final AnonymousClass2Fj A0K;
    public final UserSession A0L;

    public C60250Ji7(UserSession userSession, C13830Ti1 ti1, LA8 la8, float f, int i, int i2) {
        AnonymousClass7TG.A1S(la8, userSession);
        this.A0D = ti1;
        this.A01 = f;
        this.A03 = i;
        this.A02 = i2;
        this.A0E = la8;
        this.A0L = userSession;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = 1HR.A05;
        AnonymousClass3FN r0 = C249513ju.A00;
        1HR A1G = JTO.A1G(AnonymousClass3FN.A00);
        this.A0F = A1G;
        this.A0G = 0u9.A04(A1G);
        C62123KaZ kaZ = C62123KaZ.A00;
        02z A012 = 106.A01(kaZ);
        this.A0H = A012;
        this.A00 = kaZ;
        02z A10 = DbS.A10(false);
        this.A0I = A10;
        C61820pm A032 = AnonymousClass10H.A03(new C66189MHa(this, (AnonymousClass4D7) null, 2), A012, A10);
        this.A09 = DbT.A0G(10b.A02(new C61082JwK((C62874Kno) kaZ, true), C318116oQ.A00(this), A032, AnonymousClass10A.A00));
        AnonymousClass2Fj A0K2 = JTO.A0K();
        this.A0B = A0K2;
        this.A07 = A0K2;
        2Fk r02 = new 2Fk(0);
        this.A0J = r02;
        this.A05 = r02;
        2Fk r03 = new 2Fk(0);
        this.A0K = r03;
        this.A06 = r03;
        2Fk r04 = new 2Fk(false);
        this.A0C = r04;
        this.A08 = r04;
        AnonymousClass2Fj A0K3 = JTO.A0K();
        this.A0A = A0K3;
        this.A04 = A0K3;
    }

    public final void A00(int i, boolean z) {
        JTP.A19(this.A0K, i);
        int i2 = this.A03;
        int i3 = i2 + (((this.A02 - i2) * i) / 100);
        JTP.A19(this.A0J, i3);
        this.A0I.Epw(false);
        this.A0C.A0B(false);
        if (!z) {
            C62124Kaa kaa = C62124Kaa.A00;
            05G r1 = this.A0H;
            this.A00 = (C62874Kno) r1.getValue();
            r1.Epw(kaa);
        }
        C66164MGb.A00(this, C318116oQ.A00(this), i3, 31);
    }
}
