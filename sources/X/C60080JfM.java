package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JfM  reason: case insensitive filesystem */
public final class C60080JfM extends 04T {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C63802L7i A01;
    public final /* synthetic */ Float A02;
    public final /* synthetic */ Float A03;
    public final /* synthetic */ 1IX A04;

    public final void A04(04a r12) {
        Float f;
        0qQ.A0B(r12, 0);
        C63802L7i l7i = this.A01;
        C63890LAt lAt = l7i.A02;
        View view = lAt.A02;
        04a.A01(view, (04T) null);
        lAt.A04.setAlpha(0.0f);
        View view2 = lAt.A01;
        view2.setAlpha(0.0f);
        View view3 = lAt.A03;
        view3.setAlpha(0.0f);
        View view4 = lAt.A06;
        view4.setAlpha(0.0f);
        View view5 = lAt.A07;
        view5.setAlpha(0.0f);
        View view6 = lAt.A05;
        if (view6 == null) {
            view6 = view;
        }
        Drawable background = view6.getBackground();
        if (background != null) {
            background.setAlpha(0);
        }
        Float f2 = this.A02;
        if (!(f2 == null || (f = this.A03) == null)) {
            view5.setTranslationX(f2.floatValue());
            view5.setTranslationY(f.floatValue());
            view5.setScaleX(0.5f);
            view5.setScaleY(0.5f);
        }
        float f3 = (float) this.A00;
        view2.setTranslationY(f3);
        view3.setTranslationY(f3);
        view4.setTranslationY(f3);
        LO2 lo2 = l7i.A03;
        if (LO2.A00(lo2)) {
            Activity activity = lo2.A01;
            C71106Ock.A00(activity, -1);
            if (!lo2.A00) {
                2db.A06(activity, true);
                lo2.A00 = true;
            }
        }
        JTU.A1J((Object) null, this.A04);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60080JfM(C63802L7i l7i, Float f, Float f2, 1IX r5, int i) {
        super(0);
        this.A01 = l7i;
        this.A02 = f;
        this.A03 = f2;
        this.A00 = i;
        this.A04 = r5;
    }

    public final AnonymousClass04S A01(AnonymousClass04S r5, 04a r6) {
        AnonymousClass7TG.A1N(r6, r5);
        C63802L7i l7i = this.A01;
        C63890LAt lAt = l7i.A02;
        View view = lAt.A07;
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        View view2 = lAt.A05;
        if (view2 == null) {
            view2 = lAt.A02;
        }
        Drawable background = view2.getBackground();
        if (background != null) {
            background.setAlpha(255);
        }
        L3X l3x = l7i.A01;
        l3x.A00.A01(l3x.A01, (String) null);
        return r5;
    }

    public final 04k A02(04k r11, List list) {
        Object obj;
        Float f;
        AnonymousClass7TG.A1N(r11, list);
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
        04a r5 = (04a) obj;
        if (r5 != null) {
            float A05 = 1.0f - r5.A00.A05();
            C63802L7i l7i = this.A01;
            C63890LAt lAt = l7i.A02;
            lAt.A04.setAlpha(A05);
            View view = lAt.A01;
            view.setAlpha(A05);
            View view2 = lAt.A03;
            view2.setAlpha(A05);
            View view3 = lAt.A06;
            view3.setAlpha(A05);
            View view4 = lAt.A05;
            if (view4 == null) {
                view4 = lAt.A02;
            }
            Drawable background = view4.getBackground();
            if (background != null) {
                background.setAlpha((int) (255.0f * A05));
            }
            View view5 = lAt.A07;
            view5.setAlpha(A05);
            Float f2 = this.A02;
            if (!(f2 == null || (f = this.A03) == null)) {
                view5.setTranslationX(f2.floatValue() * r5.A00.A05());
                view5.setTranslationY(f.floatValue() * r5.A00.A05());
                view5.setScaleX(1.0f - (r5.A00.A05() * 0.5f));
                view5.setScaleY(1.0f - (r5.A00.A05() * 0.5f));
            }
            float A052 = ((float) this.A00) * r5.A00.A05();
            view.setTranslationY(A052);
            view2.setTranslationY(A052);
            view3.setTranslationY(A052);
            l7i.A03.A01(r5.A00.A05());
        }
        return r11;
    }
}
