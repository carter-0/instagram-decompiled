package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.List;

/* renamed from: X.Wam  reason: case insensitive filesystem */
public final class C19500Wam implements XAT {
    public int A00 = -1;
    public C19498Wak A01;
    public C18739VzK A02;
    public boolean A03;
    public int A04;
    public final View A05;
    public final C357928a5 A06;
    public final boolean A07;

    public final void CMv(List list, int i, int i2, int i3) {
        this.A03 = true;
        this.A04 = i3;
        A01(this);
    }

    public final void DTI(int i) {
        A00(i, true);
    }

    public final void Dld(int i) {
    }

    private final void A00(int i, boolean z) {
        C19498Wak wak = this.A01;
        if (wak == null) {
            return;
        }
        if (this.A02 != null) {
            int AYh = wak.AYh(i);
            if (AYh != this.A00) {
                if (AYh != -1) {
                    C18739VzK vzK = this.A02;
                    if (vzK == null) {
                        throw new IllegalStateException("Required value was null.");
                    } else if (!vzK.A05.isLaidOut()) {
                        vzK.A02 = new C20302Wor(vzK, AYh, z);
                    } else {
                        C18739VzK.A01(vzK, AYh, z);
                    }
                }
                this.A00 = AYh;
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A01(C19500Wam wam) {
        if (wam.A01 != null && wam.A03) {
            C18739VzK vzK = wam.A02;
            if (vzK != null) {
                vzK.A00 = null;
                View view = vzK.A05;
                view.setBackground((Drawable) null);
                view.setOnTouchListener((View.OnTouchListener) null);
            }
            View view2 = wam.A05;
            C19498Wak wak = wam.A01;
            if (wak != null) {
                wam.A02 = new C18739VzK(view2, wak, new VOY(wam), wam.A07);
                wam.A00(wam.A04, false);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void Dle(int i) {
        this.A04 = i;
        A00(i, true);
    }

    public C19500Wam(View view, C357948a7 r3, boolean z) {
        AnonymousClass7TG.A1O(view, r3);
        this.A05 = view;
        this.A07 = z;
        r3.A02.add(this);
        this.A06 = new C19502Wao(r3);
    }
}
