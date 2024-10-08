package X;

import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import java.util.List;

/* renamed from: X.A8g  reason: case insensitive filesystem */
public final class C39766A8g {
    public final /* synthetic */ C232502tp A00;

    public C39766A8g(C232502tp r1) {
        this.A00 = r1;
    }

    public final void A00(RLX rlx, String str) {
        AnonymousClass3X2 r1;
        int i;
        LithoView lithoView;
        List A0R = 00l.A0R(str, new String[]{"/"}, 0);
        if (A0R.size() == 2) {
            Object obj = A0R.get(0);
            Object obj2 = A0R.get(1);
            C232502tp r12 = this.A00;
            if (0qQ.A0K(obj, r12.A04()) && (r1 = (AnonymousClass3X2) r12.A02.A02(obj2)) != null) {
                if (rlx instanceof QPo) {
                    i = -65536;
                } else if (rlx instanceof QPp) {
                    i = -16776961;
                } else {
                    throw AnonymousClass7TE.A1K();
                }
                ComponentTree componentTree = r1.A01;
                if (componentTree != null && (lithoView = componentTree.A08) != null) {
                    lithoView.getViewTreeObserver().addOnPreDrawListener(new WCH(lithoView, i));
                }
            }
        }
    }
}
