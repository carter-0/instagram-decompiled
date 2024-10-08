package X;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.List;
import java.util.Set;

/* renamed from: X.Agh  reason: case insensitive filesystem */
public final class C40667Agh implements AnonymousClass88G {
    public final ColorDrawable A00;
    public final UserSession A01;
    public final C310416b1 A02;
    public final InteractiveDrawableContainer A03;
    public final AnonymousClass0eM A04 = C41656Ay8.A00(this, 33);
    public final AnonymousClass0eM A05 = C41656Ay8.A00(this, 34);
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07 = C41656Ay8.A00(this, 36);
    public final AnonymousClass0eM A08;

    public final /* synthetic */ void CtK(Drawable drawable) {
    }

    public final /* synthetic */ void CtX() {
    }

    public final /* synthetic */ void CtY() {
    }

    public final /* synthetic */ void CuV(Drawable drawable, int i) {
    }

    public final /* synthetic */ void DAq(Drawable drawable, int i) {
    }

    public final /* synthetic */ void DAr(float f, float f2) {
    }

    public final /* synthetic */ void DAs(Drawable drawable) {
    }

    public final /* synthetic */ void DP7(Drawable drawable, int i, float f, float f2) {
    }

    public final /* synthetic */ void DPH() {
    }

    public final /* synthetic */ void DdI(Drawable drawable, int i, boolean z) {
    }

    public final /* synthetic */ void DhH(Drawable drawable, float f, float f2, float f3, float f4) {
    }

    public final void DlC(Drawable drawable, int i, float f, float f2) {
        Object value;
        Set set;
        0qQ.A0B(drawable, 1);
        AnonymousClass9YC r4 = (AnonymousClass9YC) this.A08.getValue();
        05G r3 = r4.A03;
        do {
            value = r3.getValue();
            AnonymousClass8C5 r6 = r4.A01;
            if (!(drawable instanceof C321026tS) || !((C321026tS) drawable).CZ7(r6.A01)) {
                set = r6.A00;
            } else {
                Set set2 = r6.A00;
                Integer valueOf = Integer.valueOf(i);
                boolean contains = set2.contains(valueOf);
                Set set3 = r6.A00;
                if (contains) {
                    set = 094.A03(valueOf, set3);
                } else {
                    set = 094.A01(valueOf, set3);
                }
                r6.A00 = set;
            }
        } while (!r3.AIY(value, new C61772KLl(set, false)));
    }

    public final /* synthetic */ void DlE(Drawable drawable, float f, float f2, float f3, float f4, int i) {
    }

    public final /* synthetic */ void Dsb() {
    }

    public C40667Agh(View view, AnonymousClass4DH r39, UserSession userSession, AnonymousClass8B3 r41, AnonymousClass80W r42, InteractiveDrawableContainer interactiveDrawableContainer) {
        UserSession userSession2 = userSession;
        AnonymousClass80W r4 = r42;
        InteractiveDrawableContainer interactiveDrawableContainer2 = interactiveDrawableContainer;
        AnonymousClass7TG.A1U(interactiveDrawableContainer2, userSession2, r4);
        AnonymousClass4DH r6 = r39;
        AnonymousClass8B3 r10 = r41;
        AnonymousClass7TG.A1R(r6, r10);
        View view2 = view;
        0qQ.A0B(view2, 6);
        this.A03 = interactiveDrawableContainer2;
        this.A01 = userSession2;
        0Yh r9 = new 0Yh(AnonymousClass9YC.class);
        C40065APv aPv = new C40065APv(userSession2, r4);
        2YS r7 = new 2YS(r10.A01);
        r7.A01(C40068APy.A00, aPv);
        this.A08 = new C227862kA(new C66300MMj(r10, 28), new C66300MMj(r10, 29), new C66300MMj(r7, 30), r9);
        this.A06 = C41656Ay8.A00(view2, 35);
        ColorDrawable colorDrawable = new ColorDrawable(interactiveDrawableContainer2.getContext().getColor(R.color.black_60_transparent));
        colorDrawable.setBounds(new Rect(0, 0, interactiveDrawableContainer2.getWidth(), interactiveDrawableContainer2.getHeight()));
        this.A00 = colorDrawable;
        Integer num = AnonymousClass05K.A00;
        this.A02 = new C310416b1((AnonymousClass8BH) new C16336Ut6(colorDrawable.getBounds()), (AnonymousClass8DA) null, (C3510487j) null, num, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 8, false, false, false, false, false, false, false, true, true, true, true, true, false, false);
        07U r72 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r6.getViewLifecycleOwner();
        AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
        1Eo.A03(num, 19B.A00, new MHJ((Object) viewLifecycleOwner, (Object) r72, (Object) this, (AnonymousClass4D7) null, 10), A002);
    }
}
