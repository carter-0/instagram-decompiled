package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IMq  reason: case insensitive filesystem */
public final class C57050IMq implements AnonymousClass32U {
    public S6e A00;
    public float A01 = -1.0f;
    public boolean A02;
    public final UserSession A03;
    public final AnonymousClass37D A04;
    public final GD9 A05;
    public final boolean A06;

    public final /* synthetic */ void DVz(int i) {
    }

    public final /* synthetic */ void DW0(int i) {
    }

    public final /* synthetic */ void DW8(int i, int i2) {
    }

    public final /* synthetic */ void DWA(int i, int i2) {
    }

    public final /* synthetic */ void DWY() {
    }

    public final void DhU(Integer num) {
        1Xj r1;
        S6e s6e;
        0qQ.A0B(num, 0);
        if (num == AnonymousClass05K.A00) {
            AnonymousClass37D r3 = this.A04;
            if (r3 != null) {
                AnonymousClass37F r12 = (AnonymousClass37F) r3;
                if (r12.A0g && this.A02) {
                    if (this.A06) {
                        r3.A0A();
                    } else {
                        r3.A0B();
                    }
                    if ((r12.A0b || !r12.A0g) && (s6e = this.A00) != null) {
                        s6e.A02("secondary_cta", "dismiss", "external_swipe");
                    }
                }
            }
            C267324bN A022 = this.A05.A02();
            if (A022 != null) {
                r1 = A022.A02;
            } else {
                r1 = null;
            }
            this.A02 = GED.A03(this.A03, r1);
            this.A01 = -1.0f;
        }
    }

    public final /* synthetic */ void Dpv() {
    }

    public final /* synthetic */ void Dpy(C267324bN r1, int i) {
    }

    public final void DhG(float f, float f2) {
        AnonymousClass37D r4;
        if (this.A02 && (r4 = this.A04) != null && ((AnonymousClass37F) r4).A0g && this.A06) {
            float f3 = this.A01;
            if (f3 == -1.0f) {
                this.A01 = f2;
                f3 = f2;
            }
            double d = (double) (f2 - f);
            if (f < f3) {
                d = -d;
            }
            r4.A0E(d);
        }
    }

    public C57050IMq(UserSession userSession, AnonymousClass37D r5, GD9 gd9) {
        AnonymousClass7TG.A1Q(gd9, userSession);
        this.A04 = r5;
        this.A05 = gd9;
        this.A03 = userSession;
        this.A06 = 182.A06(0Tu.A06, userSession, 36321584941966906L);
    }
}
