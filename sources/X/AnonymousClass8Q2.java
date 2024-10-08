package X;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem;
import com.instagram.creation.capture.quickcapture.sundial.widget.filmstrip.ClipsTrimFilmstrip;

/* renamed from: X.8Q2  reason: invalid class name */
public final class AnonymousClass8Q2 implements AnonymousClass8Q3 {
    public int A00;
    public ValueAnimator A01;
    public Integer A02 = AnonymousClass05K.A00;
    public boolean A03;
    public boolean A04;
    public final int A05;
    public final int A06;
    public final ConstraintLayout A07;
    public final Fragment A08;
    public final UserSession A09;
    public final CameraToolMenuItem A0A;
    public final CameraToolMenuItem A0B;
    public final CameraToolMenuItem A0C;
    public final C355208Pb A0D;
    public final C353488Hv A0E;
    public final ClipsTrimFilmstrip A0F;
    public final 2Nn A0G;
    public final View A0H;
    public final Animation A0I;
    public final Animation A0J;
    public final TextView A0K;
    public final AnonymousClass8Q9 A0L;
    public final C352308Cv A0M;

    public AnonymousClass8Q2(ConstraintLayout constraintLayout, Fragment fragment, UserSession userSession, C355208Pb r10, C353488Hv r11, 2Nn r12) {
        0qQ.A0B(constraintLayout, 2);
        0qQ.A0B(userSession, 5);
        this.A08 = fragment;
        this.A07 = constraintLayout;
        this.A0G = r12;
        this.A0D = r10;
        this.A09 = userSession;
        this.A0E = r11;
        AnonymousClass8Q4 r2 = new AnonymousClass8Q4(this);
        this.A0M = r2;
        View findViewById = constraintLayout.findViewById(R.id.trim_confirm_button);
        0qQ.A07(findViewById);
        TextView textView = (TextView) findViewById;
        this.A0K = textView;
        AnonymousClass3NG r1 = new AnonymousClass3NG(textView);
        r1.A07 = true;
        r1.A04 = new AnonymousClass8Q5(this);
        r1.A00();
        Integer num = AnonymousClass05K.A01;
        2eS.A04(textView, num);
        View findViewById2 = constraintLayout.findViewById(R.id.trim_cancel_button);
        this.A0H = findViewById2;
        AnonymousClass3NG r13 = new AnonymousClass3NG(findViewById2);
        r13.A07 = true;
        r13.A04 = new AnonymousClass8Q6(this);
        r13.A00();
        2eS.A04(findViewById2, num);
        CameraToolMenuItem cameraToolMenuItem = (CameraToolMenuItem) constraintLayout.requireViewById(R.id.scale_button);
        this.A0C = cameraToolMenuItem;
        AnonymousClass0fU.A00(new AnonymousClass8Q7(this), cameraToolMenuItem);
        2eS.A04(cameraToolMenuItem, num);
        CameraToolMenuItem cameraToolMenuItem2 = (CameraToolMenuItem) constraintLayout.requireViewById(R.id.trim_music_button);
        this.A0B = cameraToolMenuItem2;
        AnonymousClass0fU.A00(new AnonymousClass8Q8(this), cameraToolMenuItem2);
        2eS.A04(cameraToolMenuItem2, num);
        CameraToolMenuItem cameraToolMenuItem3 = (CameraToolMenuItem) constraintLayout.requireViewById(R.id.background_picker_button);
        this.A0A = cameraToolMenuItem3;
        2eS.A04(cameraToolMenuItem3, num);
        this.A0L = new AnonymousClass8Q9(cameraToolMenuItem3);
        Resources resources = constraintLayout.getContext().getResources();
        this.A06 = resources.getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height);
        this.A05 = resources.getDimensionPixelSize(R.dimen.abc_star_medium);
        ClipsTrimFilmstrip clipsTrimFilmstrip = (ClipsTrimFilmstrip) constraintLayout.requireViewById(R.id.clips_review_filmstrip_view);
        this.A0F = clipsTrimFilmstrip;
        clipsTrimFilmstrip.A02 = r2;
        0nA.A0m(clipsTrimFilmstrip, constraintLayout);
        int integer = fragment.requireContext().getResources().getInteger(17694721);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.A0I = alphaAnimation;
        long j = (long) integer;
        alphaAnimation.setDuration(j);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        this.A0J = alphaAnimation2;
        alphaAnimation2.setDuration(j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r3.A03 != false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass8Q2 r3) {
        /*
            android.widget.TextView r2 = r3.A0K
            java.lang.Integer r1 = r3.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x000e
            boolean r0 = r3.A03
            r1 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x0010
        L_0x000e:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0010:
            r2.setAlpha(r1)
            java.lang.Integer r0 = r3.A02
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x0037
            r0 = 2
            if (r1 == r0) goto L_0x0033
            r0 = 0
            if (r1 == r0) goto L_0x0033
            r0 = 3
            if (r1 == r0) goto L_0x002f
            r0 = 4
            if (r1 != r0) goto L_0x003b
            r0 = 2131960992(0x7f1324a0, float:1.9558668E38)
        L_0x002b:
            r2.setText(r0)
            return
        L_0x002f:
            r0 = 2131968361(0x7f134169, float:1.9573614E38)
            goto L_0x002b
        L_0x0033:
            r0 = 2131976511(0x7f13613f, float:1.9590145E38)
            goto L_0x002b
        L_0x0037:
            r0 = 2131952258(0x7f130282, float:1.9540954E38)
            goto L_0x002b
        L_0x003b:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8Q2.A00(X.8Q2):void");
    }

    public final void CL9(boolean z) {
        this.A02 = AnonymousClass05K.A00;
        this.A03 = false;
        this.A04 = false;
        CameraToolMenuItem cameraToolMenuItem = this.A0C;
        cameraToolMenuItem.A04(false, false);
        cameraToolMenuItem.setSelected(this.A04);
        cameraToolMenuItem.setVisibility(8);
        this.A0A.setVisibility(8);
        this.A0B.setVisibility(8);
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.A01 = null;
        }
        C353488Hv r0 = this.A0E;
        if (r0 != null) {
            r0.A0B = false;
        }
        C294975nL.A05(new View[]{this.A07}, z);
    }

    public final void Dxd(int i, int i2, int i3) {
        if (this.A00 > 0) {
            this.A0F.setSeekPosition(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003f, code lost:
        if (r0 != 0) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Eto(X.AnonymousClass51R r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout r5 = r7.A07
            r3 = 0
            r5.setVisibility(r3)
            r2 = 2131443747(0x7f0b4023, float:1.850957E38)
            X.4gb r1 = new X.4gb
            r1.<init>()
            r1.A0I(r5)
            com.instagram.common.session.UserSession r0 = r7.A09
            X.1Av r0 = X.1Au.A00(r0)
            boolean r0 = r0.A1y()
            r6 = 1
            r4 = 2
            if (r0 == 0) goto L_0x00f2
            r1.A09(r2, r6)
            r1.A0C(r2, r4, r3, r4)
        L_0x0025:
            r1.A0G(r5)
            A00(r7)
            android.view.View[] r1 = new android.view.View[]{r5}
            r0 = 0
            X.C294975nL.A04(r0, r1, r9)
            java.lang.Integer r0 = r7.A02
            int r0 = r0.intValue()
            r2 = 8
            if (r0 == r6) goto L_0x0071
            if (r0 == r4) goto L_0x005a
            if (r0 == r3) goto L_0x0066
        L_0x0041:
            X.8Pb r0 = r7.A0D
            X.51M r0 = r0.CEK()
            if (r0 == 0) goto L_0x004d
            int r3 = r0.A0B()
        L_0x004d:
            r7.A00 = r3
            com.instagram.creation.capture.quickcapture.sundial.widget.filmstrip.ClipsTrimFilmstrip r1 = r7.A0F
            X.AkL r0 = new X.AkL
            r0.<init>(r7)
            X.0nA.A0p(r1, r0)
            return
        L_0x005a:
            r7.A04 = r6
            com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r1 = r7.A0C
            r1.A04(r6, r3)
            boolean r0 = r7.A04
            r1.setSelected(r0)
        L_0x0066:
            com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r0 = r7.A0C
            r0.setVisibility(r2)
            com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r0 = r7.A0B
            r0.setVisibility(r2)
            goto L_0x0041
        L_0x0071:
            com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r5 = r7.A0C
            r5.setVisibility(r3)
            X.8Hv r1 = r7.A0E
            if (r1 == 0) goto L_0x0084
            com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r0 = r7.A0B
            if (r10 == 0) goto L_0x007f
            r2 = 0
        L_0x007f:
            r0.setVisibility(r2)
            r1.A0B = r6
        L_0x0084:
            int r0 = r5.getVisibility()
            if (r0 == 0) goto L_0x009a
            com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r0 = r7.A0A
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x009a
            com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r0 = r7.A0B
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0041
        L_0x009a:
            android.animation.ValueAnimator r0 = r7.A01
            if (r0 == 0) goto L_0x00a1
            r0.cancel()
        L_0x00a1:
            int r0 = r5.getVisibility()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L_0x00ac
            r5.setLabelDisplayPercentage(r2)
        L_0x00ac:
            com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r1 = r7.A0A
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x00b7
            r1.setLabelDisplayPercentage(r2)
        L_0x00b7:
            com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r1 = r7.A0B
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x00c2
            r1.setLabelDisplayPercentage(r2)
        L_0x00c2:
            float[] r0 = new float[r4]
            r0 = {1065353216, 0} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            r7.A01 = r2
            if (r2 == 0) goto L_0x00d4
            r0 = 500(0x1f4, double:2.47E-321)
            r2.setDuration(r0)
        L_0x00d4:
            android.animation.ValueAnimator r2 = r7.A01
            if (r2 == 0) goto L_0x00dd
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.setStartDelay(r0)
        L_0x00dd:
            android.animation.ValueAnimator r1 = r7.A01
            if (r1 == 0) goto L_0x00e9
            X.AJP r0 = new X.AJP
            r0.<init>(r7)
            r1.addUpdateListener(r0)
        L_0x00e9:
            android.animation.ValueAnimator r0 = r7.A01
            if (r0 == 0) goto L_0x0041
            r0.start()
            goto L_0x0041
        L_0x00f2:
            r1.A09(r2, r4)
            r1.A0C(r2, r6, r3, r6)
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8Q2.Eto(X.51R, boolean, boolean):void");
    }
}
