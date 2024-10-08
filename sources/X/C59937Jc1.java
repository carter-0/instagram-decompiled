package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.activity.ComponentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.Jc1  reason: case insensitive filesystem */
public final class C59937Jc1 {
    public boolean A00;
    public boolean A01 = true;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final C340297l2 A06;
    public final UserSession A07;
    public final C59938Jc2 A08;
    public final C59936Jc0 A09;
    public final C59939Jc3 A0A;
    public final AnonymousClass80U A0B;
    public final Runnable A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H;
    public final AnonymousClass0eM A0I;
    public final 0sL A0J;
    public final ComponentActivity A0K;

    public static final void A01(C59937Jc1 jc1) {
        jc1.A01 = false;
        C340297l2 r2 = jc1.A06;
        r2.A0H.A00().setVisibility(4);
        View view = r2.A0F;
        0qQ.A07(view);
        0nA.A0g(view, jc1.A05, jc1.A04);
        AnonymousClass8LZ.A00(view);
        view.setX(0.0f);
        view.setY(0.0f);
        11Z.A04(new C65874M2p(jc1), 170);
    }

    public C59937Jc1(Activity activity, ViewGroup viewGroup, C340297l2 r20, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass80U r23, Runnable runnable, 0sL r25) {
        Activity activity2 = activity;
        TargetViewSizeProvider targetViewSizeProvider2 = targetViewSizeProvider;
        0qQ.A0B(activity2, 1);
        ViewGroup viewGroup2 = viewGroup;
        C340297l2 r12 = r20;
        UserSession userSession2 = userSession;
        AnonymousClass80U r2 = r23;
        C51974G9v.A1S(userSession2, r12, r2, targetViewSizeProvider2, viewGroup2);
        this.A07 = userSession2;
        this.A06 = r12;
        this.A0B = r2;
        this.A0C = runnable;
        this.A0J = r25;
        ComponentActivity componentActivity = (ComponentActivity) activity2;
        this.A0K = componentActivity;
        this.A0I = DbS.A0I(new C66295MMe(componentActivity, 43), new C66295MMe(this, 45), new MJ9(42, (Object) null, componentActivity), DbS.A0z(JYE.class));
        this.A09 = new C59936Jc0(viewGroup2, userSession2, targetViewSizeProvider2, new C66295MMe(this, 36));
        this.A0G = C66295MMe.A00(viewGroup2, 40);
        this.A0F = C66295MMe.A00(this, 39);
        this.A0E = C66295MMe.A00(viewGroup2, 38);
        this.A0D = C66295MMe.A00(this, 37);
        this.A0H = C66295MMe.A00(viewGroup2, 44);
        float A002 = 0nA.A00(componentActivity, 296.0f);
        this.A03 = A002;
        float f = A002 / 2.0f;
        this.A02 = f;
        AnonymousClass81W r0 = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider2).A0K;
        int width = r0.getWidth();
        this.A05 = width;
        int height = r0.getHeight();
        this.A04 = height;
        this.A08 = new C59938Jc2(AnonymousClass7TE.A0c(this.A0D), AnonymousClass7TE.A0c(this.A0F), viewGroup2, r12, f, (int) A002, width, height);
        this.A0A = new C59939Jc3(componentActivity, userSession2, (IgTextView) this.A0H.getValue());
        r2.A7w(new C59966Jcb(this, 2));
    }

    public static final void A00(Bitmap bitmap, C59937Jc1 jc1) {
        Bitmap A012 = LTL.A01(jc1.A0K, bitmap, jc1.A05, jc1.A04, -16777216, false);
        AnonymousClass0eM r1 = jc1.A0F;
        ((ImageView) r1.getValue()).setImageBitmap(A012);
        AnonymousClass8LZ.A00(AnonymousClass7TE.A0c(r1));
        AnonymousClass7TE.A0c(r1).setVisibility(4);
        AnonymousClass0eM r12 = jc1.A0D;
        ((ImageView) r12.getValue()).setImageBitmap(bitmap);
        AnonymousClass8LZ.A00(AnonymousClass7TE.A0c(r12));
        DbW.A1R(r12, 0);
    }

    public static final void A02(C59937Jc1 jc1, boolean z) {
        if (z) {
            jc1.A01 = false;
            jc1.A06.A0H.A00().setVisibility(4);
            if (!AnonymousClass7TE.A1a(jc1.A0J.invoke(new C65871M2m(jc1), new C65872M2n(jc1)))) {
                jc1.A00 = false;
                ((JYE) jc1.A0I.getValue()).A00();
                return;
            }
            return;
        }
        A01(jc1);
    }

    public final void A03() {
        if (!this.A00) {
            JYE jye = (JYE) this.A0I.getValue();
            05G r3 = jye.A04;
            String str = ((JZA) r3.getValue()).A00;
            boolean z = ((JZA) r3.getValue()).A01;
            r3.getValue();
            0qQ.A0B(str, 1);
            r3.Epw(new JZA(str, true, z));
            C262204Co r0 = jye.A00;
            if (r0 == null || !r0.isActive()) {
                jye.A00 = C51966G9m.A1L(new MGA(jye, (AnonymousClass4D7) null, 16), C318116oQ.A00(jye));
            }
            this.A00 = true;
            A02(this, this.A06.CPy());
            C49093EpI.A00(this.A0K, this.A07);
            this.A0A.A00();
        }
    }
}
