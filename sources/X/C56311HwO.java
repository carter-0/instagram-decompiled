package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.HwO  reason: case insensitive filesystem */
public abstract class C56311HwO {
    public static final FrameLayout A00(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        Context context = viewGroup.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        0qQ.A07(context);
        C273694n2 r1 = new C273694n2(context);
        frameLayout.addView(r1);
        frameLayout.setTag(new C53128Gj0(frameLayout, r1));
        return frameLayout;
    }

    public static final void A01(C229382nI r3, C270044g6 r4, C53128Gj0 gj0, int i, int i2) {
        DbY.A1S(gj0, r3);
        AnonymousClass6NS r2 = r4.A00;
        if (r2 == null) {
            r2 = AnonymousClass6NS.A00(gj0.A01.getContext(), C3034368u.A02((C361078fd) null, r4.A01.A01()), r3).A00();
            r4.A00 = r2;
            r3.A05(new EED(5, r2, r3, r4));
        }
        AnonymousClass6NS r0 = gj0.A00;
        if (r0 != r2) {
            if (r0 != null) {
                r0.A04();
            }
            gj0.A00 = r2;
            r2.A07(gj0.A02);
        }
        FrameLayout frameLayout = gj0.A01;
        Context context = frameLayout.getContext();
        0qQ.A0A(context);
        frameLayout.setPadding(0, DbS.A02(context, i), 0, DbS.A02(context, i2));
    }
}
