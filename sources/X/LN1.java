package X;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.Iterator;
import java.util.List;

public final class LN1 {
    public final InteractiveDrawableContainer A00;
    public final AnonymousClass0eM A01 = C66300MMj.A00(this, 46);
    public final AnonymousClass0eM A02 = C66300MMj.A00(this, 47);
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = C66300MMj.A00(this, 49);
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(new MM9(this, 0));
    public final AnonymousClass0eM A06;

    public LN1(View view, AnonymousClass4DH r13, AnonymousClass80W r14, InteractiveDrawableContainer interactiveDrawableContainer) {
        int A022 = DbW.A02(1, interactiveDrawableContainer, r13);
        int A08 = C51970G9q.A08(3, view, r14);
        this.A00 = interactiveDrawableContainer;
        MM9 mm9 = new MM9(r14, A08);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MM9(new MM9(r13, 1), A022));
        this.A06 = DbS.A0I(new MM9(A002, 3), mm9, new MJ9(18, (Object) null, A002), DbS.A0z(C354648Mv.class));
        this.A03 = C66300MMj.A00(view, 48);
        07U r6 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r13.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MH4(r6, this, viewLifecycleOwner, (AnonymousClass4D7) null, 48), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public static final void A00(LN1 ln1) {
        C354808Nl r1;
        Object obj;
        Object obj2;
        Object A0J = 00k.A0J(ln1.A00.A0T(C64450Lc8.A00));
        if (A0J instanceof C354808Nl) {
            r1 = (C354808Nl) A0J;
        } else {
            r1 = null;
        }
        int i = 1;
        if (r1 == null || C339157j9.A02(r1)) {
            C354648Mv r2 = (C354648Mv) ln1.A06.getValue();
            C354658Mw r5 = r2.A00;
            Iterator it = r5.A04.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C61047Jvl) obj).A00 == r5.A00) {
                    break;
                }
            }
            C61047Jvl jvl = (C61047Jvl) obj;
            if (jvl != null) {
                List list = r5.A05;
                Object A0m = JTT.A0m(list, list.indexOf(jvl.A01) + 1);
                0qQ.A0B(A0m, 0);
                jvl.A01 = A0m;
                if (A0m == r5.A02) {
                    obj2 = jvl.A02;
                } else {
                    obj2 = r5.A03.get(A0m);
                }
                C354648Mv.A00(new C61756KKv((Path) obj2), r2);
            }
            int i2 = Build.VERSION.SDK_INT;
            View A062 = AnonymousClass7TH.A06(ln1.A05);
            if (i2 >= 30) {
                i = 16;
            }
            A062.performHapticFeedback(i);
        }
    }
}
