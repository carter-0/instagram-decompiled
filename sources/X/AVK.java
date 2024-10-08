package X;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.ui.swipenavigation.PositionConfig;

public final class AVK implements C252203oj {
    public Bitmap A00;
    public C49688F1y A01;
    public final RectF A02 = AnonymousClass7TE.A0Y();
    public final RectF A03 = AnonymousClass7TE.A0Y();
    public final ViewGroup A04;
    public final ImageView A05;
    public final 2cs A06;
    public final C40315AaA A07;

    public AVK(ViewGroup viewGroup, C40315AaA aaA) {
        0qQ.A0B(viewGroup, 1);
        this.A04 = viewGroup;
        this.A07 = aaA;
        ImageView imageView = new ImageView(viewGroup.getContext());
        this.A05 = imageView;
        imageView.setVisibility(8);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        viewGroup.addView(imageView);
        2cs A0J = AnonymousClass7TF.A0J();
        A0J.A06 = true;
        A0J.A09(C71392co.A01());
        this.A06 = A0J;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0093, code lost:
        if (r1.equals(r0) == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009c, code lost:
        if (r1.equals("action_story_share_threads") != false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009e, code lost:
        r2.Cpi(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.graphics.Bitmap r10, com.instagram.common.session.UserSession r11, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r12, java.util.List r13) {
        /*
            r9 = this;
            r8 = 0
            r0 = 1
            X.0qQ.A0B(r12, r0)
            android.widget.ImageView r6 = r9.A05
            android.view.ViewParent r0 = r6.getParent()
            if (r0 != 0) goto L_0x0012
            android.view.ViewGroup r0 = r9.A04
            r0.addView(r6)
        L_0x0012:
            if (r10 == 0) goto L_0x0023
            android.view.ViewGroup r0 = r9.A04
            android.content.res.Resources r0 = r0.getResources()
            X.0qQ.A07(r0)
            android.graphics.Bitmap r0 = X.C394309xs.A00(r0, r10)
            r9.A00 = r0
        L_0x0023:
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r12 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r12
            X.81W r0 = r12.A0K
            int r7 = r0.getWidth()
            int r5 = r0.getHeight()
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r7, r5)
            int r1 = r12.A01
            int r0 = r12.A05
            r2.setMargins(r1, r0, r8, r8)
            r6.setLayoutParams(r2)
            android.graphics.RectF r4 = r9.A02
            float r3 = (float) r1
            float r2 = (float) r0
            int r1 = r1 + r7
            float r1 = (float) r1
            int r0 = r0 + r5
            float r0 = (float) r0
            r4.set(r3, r2, r1, r0)
            r6.setVisibility(r8)
            r0 = 0
            r6.setTranslationX(r0)
            r6.setTranslationY(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.setScaleX(r0)
            r6.setScaleY(r0)
            r6.setImageBitmap(r10)
            X.AaA r2 = r9.A07
            if (r2 == 0) goto L_0x006d
            X.2bE r0 = r2.A02
            java.lang.String r1 = r0.A02
            int r0 = r1.hashCode()
            switch(r0) {
                case -2075285002: goto L_0x0096;
                case -811302394: goto L_0x007a;
                case -471528113: goto L_0x007d;
                case -104996226: goto L_0x0080;
                case 179250025: goto L_0x0087;
                case 1364086253: goto L_0x008a;
                case 1965399843: goto L_0x008d;
                default: goto L_0x006d;
            }
        L_0x006d:
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r11)
            X.3DR r0 = new X.3DR
            r0.<init>(r13)
            r1.A00(r0)
            return
        L_0x007a:
            java.lang.String r0 = "story_share_intent"
            goto L_0x008f
        L_0x007d:
            java.lang.String r0 = "camera_tab_bar"
            goto L_0x008f
        L_0x0080:
            r0 = 136(0x88, float:1.9E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x008f
        L_0x0087:
            java.lang.String r0 = "promote_media_picker_create_story"
            goto L_0x008f
        L_0x008a:
            java.lang.String r0 = "third_party_intent"
            goto L_0x008f
        L_0x008d:
            java.lang.String r0 = "profile_picture_tap_on_self_profile"
        L_0x008f:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x009e
            goto L_0x006d
        L_0x0096:
            java.lang.String r0 = "action_story_share_threads"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006d
        L_0x009e:
            r2.Cpi(r1)
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AVK.A00(android.graphics.Bitmap, com.instagram.common.session.UserSession, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, java.util.List):void");
    }

    public final void DmB(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r14) {
        0qQ.A0B(r14, 0);
        double d = (double) ((float) r14.A09.A00);
        float A032 = (float) AnonymousClass37Q.A03(d, 1.0d, 0.05d);
        RectF rectF = this.A03;
        float centerX = rectF.centerX();
        RectF rectF2 = this.A02;
        float A012 = (float) AnonymousClass37Q.A01(d, (double) (centerX - rectF2.centerX()));
        ImageView imageView = this.A05;
        imageView.setVisibility(0);
        imageView.setTranslationX(A012);
        imageView.setTranslationY((float) AnonymousClass37Q.A01(d, (double) (rectF.centerY() - rectF2.centerY())));
        imageView.setScaleX(A032);
        imageView.setScaleY(A032);
    }

    public final void A01(RectF rectF, C49688F1y f1y) {
        this.A03.set(rectF);
        this.A01 = f1y;
        2cs r3 = this.A06;
        r3.A08(0.0d, true);
        r3.A0A(this);
        r3.A03();
    }

    public final void A02(String str) {
        ViewGroup viewGroup = this.A04;
        ImageView imageView = this.A05;
        viewGroup.removeView(imageView);
        imageView.setVisibility(8);
        imageView.setImageBitmap((Bitmap) null);
        A03(!str.equals(AnonymousClass000.A00(136)), str);
    }

    public final void A03(boolean z, String str) {
        String str2;
        if (str.equals(AnonymousClass000.A00(136))) {
            str2 = "story_posted_from_organic_insights";
        } else {
            str2 = "story_posted_from_camera";
        }
        C40315AaA aaA = this.A07;
        if (aaA != null && !str2.equals("story_posted_from_organic_insights")) {
            aaA.A01.FLD(new PositionConfig((AnonymousClass57C) null, (CameraConfiguration) null, (AnonymousClass3QO) null, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, z));
        }
    }

    public final void DmC(2cs r4) {
        ViewGroup viewGroup = this.A04;
        ImageView imageView = this.A05;
        viewGroup.removeView(imageView);
        imageView.setVisibility(8);
        imageView.setImageBitmap((Bitmap) null);
        C49688F1y f1y = this.A01;
        if (f1y != null) {
            f1y.A00(this.A00);
        }
        this.A01 = null;
        this.A00 = null;
        this.A06.A0B(this);
    }
}
