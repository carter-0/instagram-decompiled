package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JfL  reason: case insensitive filesystem */
public final class C60079JfL extends 04T {
    public final /* synthetic */ int A00;
    public final /* synthetic */ L64 A01;
    public final /* synthetic */ 1IX A02;

    public final void A04(04a r7) {
        0qQ.A0B(r7, 0);
        L64 l64 = this.A01;
        OI6 oi6 = l64.A01;
        View view = oi6.A03;
        04a.A01(view, (04T) null);
        View view2 = oi6.A05;
        if (view2 == null) {
            view2 = view;
        }
        Drawable background = view2.getBackground();
        if (background != null) {
            background.setAlpha(0);
        }
        oi6.A01.setAlpha(0.0f);
        View view3 = oi6.A00;
        view3.setAlpha(0.0f);
        IgdsMediaButton igdsMediaButton = oi6.A09;
        igdsMediaButton.setAlpha(0.0f);
        float f = (float) this.A00;
        igdsMediaButton.setTranslationY(f);
        view3.setTranslationY(f);
        LO2 lo2 = l64.A02;
        if (LO2.A00(lo2)) {
            Activity activity = lo2.A01;
            C71106Ock.A00(activity, -1);
            if (!lo2.A00) {
                2db.A06(activity, true);
                lo2.A00 = true;
            }
        }
        JTU.A1J((Object) null, this.A02);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60079JfL(L64 l64, 1IX r3, int i) {
        super(0);
        this.A01 = l64;
        this.A00 = i;
        this.A02 = r3;
    }

    public final AnonymousClass04S A01(AnonymousClass04S r5, 04a r6) {
        AnonymousClass7TG.A1N(r6, r5);
        L64 l64 = this.A01;
        OI6 oi6 = l64.A01;
        View view = oi6.A05;
        if (view == null) {
            view = oi6.A03;
        }
        Drawable background = view.getBackground();
        if (background != null) {
            background.setAlpha(255);
        }
        oi6.A01.setAlpha(1.0f);
        oi6.A00.setAlpha(1.0f);
        oi6.A09.setAlpha(1.0f);
        L3X l3x = l64.A00;
        l3x.A00.A01(l3x.A01, (String) null);
        return r5;
    }

    public final 04k A02(04k r8, List list) {
        Object obj;
        AnonymousClass7TG.A1N(r8, list);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if ((((04a) obj).A00.A06() & 8) != 0) {
                break;
            }
        }
        04a r4 = (04a) obj;
        if (r4 != null) {
            float A05 = 1.0f - r4.A00.A05();
            L64 l64 = this.A01;
            OI6 oi6 = l64.A01;
            View view = oi6.A05;
            if (view == null) {
                view = oi6.A03;
            }
            Drawable background = view.getBackground();
            if (background != null) {
                background.setAlpha((int) (255.0f * A05));
            }
            oi6.A01.setAlpha(A05);
            View view2 = oi6.A00;
            view2.setAlpha(A05);
            IgdsMediaButton igdsMediaButton = oi6.A09;
            igdsMediaButton.setAlpha(A05);
            float A052 = ((float) this.A00) * r4.A00.A05();
            igdsMediaButton.setTranslationY(A052);
            view2.setTranslationY(A052);
            l64.A02.A01(r4.A00.A05());
        }
        return r8;
    }
}
