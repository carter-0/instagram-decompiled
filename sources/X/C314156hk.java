package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6hk  reason: invalid class name and case insensitive filesystem */
public final class C314156hk {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = -1;
    public boolean A03;
    public boolean A04;
    public final C313056fm A05;
    public final boolean A06;
    public final UserSession A07;

    public C314156hk(UserSession userSession, C313056fm r5) {
        0qQ.A0B(r5, 1);
        0qQ.A0B(userSession, 2);
        this.A05 = r5;
        this.A07 = userSession;
        this.A06 = 182.A06(0Tu.A06, userSession, 36324840528359838L);
    }

    private final void A00(int i) {
        View A0D;
        if ((this.A00 - i) % 2 == 0 && (A0D = ((C313046fl) this.A05).A04.A0D(i - 1)) != null && A0D.getAlpha() == 0.0f) {
            A0D.setAlpha(1.0f);
            this.A04 = false;
        }
    }

    public static final void A01(C314156hk r4, int i) {
        View A0D = ((C313046fl) r4.A05).A04.A0D(i);
        if (A0D != null && A0D.getAlpha() == 0.0f) {
            r4.A04 = true;
            if (r4.A06) {
                r4.A03 = true;
            }
            A0D.setAlpha(1.0f);
        }
    }

    public final void A02(int i) {
        View A0D;
        boolean z = this.A06;
        boolean z2 = this.A04;
        if (!z) {
            if (z2) {
                A00(i);
            }
        } else if (z2 || this.A03) {
            A00(i);
            int i2 = this.A00;
            if (i2 > 4 && (i2 - i) % 4 == 0 && (A0D = ((C313046fl) this.A05).A04.A0D(i - 1)) != null && A0D.getAlpha() == 0.0f) {
                A0D.setAlpha(1.0f);
                this.A03 = false;
            }
        }
    }
}
