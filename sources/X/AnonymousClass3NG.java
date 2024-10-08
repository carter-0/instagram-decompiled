package X;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3NG  reason: invalid class name */
public final class AnonymousClass3NG {
    public static final C71392co A0F = C71392co.A03(10.0d, 20.0d);
    public double A00 = 0.01d;
    public double A01 = 0.01d;
    public float A02 = 0.9f;
    public C71392co A03 = A0F;
    public AnonymousClass3NL A04;
    public Integer A05;
    public boolean A06 = true;
    public boolean A07;
    public boolean A08 = true;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final View A0D;
    public final List A0E = new ArrayList();

    public AnonymousClass3NG(View view) {
        0qQ.A0B(view, 1);
        this.A0D = view;
        A01(view);
    }

    public final void A01(View view) {
        0qQ.A0B(view, 0);
        List list = this.A0E;
        list.clear();
        list.add(new AnonymousClass3NH(view));
    }

    public final void A02(View... viewArr) {
        0qQ.A0B(viewArr, 0);
        List list = this.A0E;
        list.clear();
        for (View view : viewArr) {
            if (view != null) {
                list.add(new AnonymousClass3NH(view));
            }
        }
    }

    public final AnonymousClass3NM A00() {
        if (!this.A0E.isEmpty()) {
            return new AnonymousClass3NM(this);
        }
        throw new IllegalStateException("Bouncy object(s) should be defined");
    }
}
