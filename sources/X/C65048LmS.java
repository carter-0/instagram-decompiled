package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.Map;
import java.util.Random;

/* renamed from: X.LmS  reason: case insensitive filesystem */
public final class C65048LmS implements B21 {
    public View A00;
    public IgFrameLayout A01;
    public IgSimpleImageView A02;
    public IgTextView A03;
    public String A04;
    public Map A05;
    public AnonymousClass5Gv A06;
    public C62593KiQ A07;
    public final Activity A08;
    public final Context A09;
    public final View A0A;
    public final UserSession A0B;
    public final C40668Agi A0C;
    public final AnonymousClass80U A0D;
    public final InteractiveDrawableContainer A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final View A0H;
    public final ViewStub A0I;
    public final AnonymousClass8MF A0J;
    public final Random A0K = new Random();

    public static final void A00(C65048LmS lmS) {
        int i;
        int i2;
        C65048LmS lmS2 = lmS;
        Random random = lmS.A0K;
        float nextFloat = random.nextFloat();
        if (nextFloat < 0.5f) {
            nextFloat = 0.5f;
        }
        View view = lmS.A00;
        if (view != null) {
            i = view.getWidth();
        } else {
            i = 0;
        }
        float f = (nextFloat * ((float) i)) / 2.0f;
        float f2 = -1.0f;
        if (new Random().nextBoolean()) {
            f2 = 1.0f;
        }
        float f3 = f * f2;
        View view2 = lmS.A00;
        if (view2 != null) {
            i2 = view2.getHeight();
        } else {
            i2 = 0;
        }
        int i3 = i2 / 2;
        float nextInt = (float) random.nextInt(360);
        IgTextView igTextView = new IgTextView(lmS2.A09);
        igTextView.setText(lmS2.A07.A03);
        igTextView.setTextSize(0, (float) DbX.A07(lmS2.A0G));
        igTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        igTextView.setRotation(nextInt);
        IgFrameLayout igFrameLayout = lmS2.A01;
        if (igFrameLayout == null) {
            0qQ.A0F("animationContainer");
            throw AnonymousClass00P.createAndThrow();
        }
        igFrameLayout.addView(igTextView, 0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(1700);
        ofFloat.addUpdateListener(new LTr(igTextView, lmS2, f3, nextInt, i3));
        ofFloat.addListener(new C62149Kb3(0, igTextView, lmS2));
        ofFloat.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.9f, 1.0f});
        ofFloat2.setDuration(500);
        ofFloat2.setInterpolator(new OvershootInterpolator());
        C64205LTv.A01(ofFloat2, lmS2, 2);
        ofFloat2.start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (r1 == null) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C65048LmS r4, X.C62593KiQ r5) {
        /*
            r0 = 0
            r4.A04 = r0
            r4.A07 = r5
            com.instagram.common.ui.base.IgSimpleImageView r2 = r4.A02
            if (r2 != 0) goto L_0x0013
            java.lang.String r3 = "stickerView"
        L_0x000b:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0013:
            android.content.Context r1 = r4.A09
            int r0 = r5.A01
            X.DbU.A13(r1, r2, r0)
            java.util.Map r0 = r4.A05
            java.lang.Object r0 = r0.get(r5)
            X.N4G r0 = (X.N4G) r0
            r2 = 0
            java.lang.String r3 = "likeCount"
            if (r0 == 0) goto L_0x0038
            int r0 = r0.A00
            com.instagram.common.ui.base.IgTextView r1 = r4.A03
            if (r0 <= 0) goto L_0x0030
            if (r1 != 0) goto L_0x004a
            goto L_0x000b
        L_0x0030:
            if (r1 == 0) goto L_0x000b
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0038:
            com.instagram.common.ui.base.IgTextView r1 = r4.A03
            if (r1 == 0) goto L_0x000b
            java.lang.String r0 = r5.name()
            int r0 = r0.hashCode()
            int r0 = r0 % 100
            int r0 = java.lang.Math.abs(r0)
        L_0x004a:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.setText(r0)
            com.instagram.common.ui.base.IgTextView r0 = r4.A03
            if (r0 == 0) goto L_0x000b
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65048LmS.A02(X.LmS, X.KiQ):void");
    }

    public static final void A01(C65048LmS lmS) {
        ViewGroup viewGroup;
        View view = lmS.A00;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            AnonymousClass5Gv r0 = lmS.A06;
            if (r0 != null) {
                r0.A08(false);
            }
            Context context = lmS.A09;
            String str = lmS.A04;
            if (str == null) {
                str = lmS.A07.A03;
            }
            AnonymousClass5Gt r1 = new AnonymousClass5Gt(context, viewGroup, new C315476jx((CharSequence) str));
            IgSimpleImageView igSimpleImageView = lmS.A02;
            if (igSimpleImageView == null) {
                0qQ.A0F("stickerView");
                throw AnonymousClass00P.createAndThrow();
            }
            r1.A03(igSimpleImageView);
            r1.A02();
            r1.A0A = false;
            r1.A0B = false;
            AnonymousClass5Gv A002 = KSP.A00(r1, lmS, 3);
            lmS.A06 = A002;
            A002.A06();
        }
    }

    public final void DCS(Object obj) {
        if (this.A00 == null) {
            this.A00 = this.A0I.inflate();
        }
        AnonymousClass8ME r5 = (AnonymousClass8ME) this.A0J;
        View[] viewArr = {r5.A1k};
        C71392co r0 = C315596kB.A02;
        C294975nL.A04((C295005nO) null, viewArr, false);
        r5.A1Q(true);
        C294975nL.A04((C295005nO) null, new View[]{this.A0H, this.A00}, false);
        View view = this.A00;
        if (view != null) {
            view.postDelayed(new C65862M2d(this), 500);
        }
    }

    public final void DDW() {
        View view = this.A00;
        if (view != null) {
            C294975nL.A05(new View[]{this.A0H, view}, false);
        }
        C40668Agi agi = this.A0C;
        agi.A07.A0y(agi);
        this.A0J.Dn8(new LwM(this.A07, this.A04), C273654mx.A00(2890));
    }

    public C65048LmS(Activity activity, View view, UserSession userSession, AnonymousClass80U r7, AnonymousClass8MF r8, InteractiveDrawableContainer interactiveDrawableContainer) {
        this.A08 = activity;
        this.A0B = userSession;
        this.A0A = view;
        this.A0E = interactiveDrawableContainer;
        this.A0D = r7;
        this.A0J = r8;
        this.A09 = AnonymousClass7TE.A0S(view);
        this.A0H = AnonymousClass7TF.A0G(view, R.id.text_overlay_edit_text_container);
        ViewStub A0X = JTR.A0X(view, R.id.instapal_sticker_editor_stub);
        this.A0I = A0X;
        this.A0C = new C40668Agi(interactiveDrawableContainer);
        this.A0G = AnonymousClass0eN.A01(new MM9(this, 32));
        this.A0F = AnonymousClass0eN.A01(new MM9(this, 31));
        this.A05 = AnonymousClass7TE.A1H();
        this.A07 = C62593KiQ.RUPERT;
        A0X.setOnInflateListener(new C64290LYq(this, 1));
    }
}
