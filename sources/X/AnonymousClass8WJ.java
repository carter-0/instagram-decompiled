package X;

import android.app.Activity;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.8WJ  reason: invalid class name */
public final class AnonymousClass8WJ implements AnonymousClass8WK {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public int A03 = -1;
    public Drawable A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final Activity A08;
    public final RectF A09;
    public final RectF A0A;
    public final View A0B;
    public final AnonymousClass4DH A0C;
    public final UserSession A0D;
    public final C356848Vl A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final RectF A0I;
    public final View A0J;
    public final AnonymousClass80D A0K;
    public final AnonymousClass0eK A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0063, code lost:
        if (r4 != null) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void APW() {
        /*
            r10 = this;
            r6 = r10
            X.80D r5 = r10.A0K
            int r2 = r5.A03
            java.lang.String r3 = "story_visual_reply"
            java.lang.String r7 = "story_selfie_reply"
            java.lang.String r4 = "story_remix_reply"
            r1 = 0
            r0 = 7
            if (r2 != r0) goto L_0x0082
            java.lang.String r7 = "permanent_media_send"
        L_0x0011:
            r4 = -1
            if (r1 == 0) goto L_0x0070
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            r0 = 3952(0xf70, float:5.538E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putExtra(r0, r1)
            android.app.Activity r0 = r10.A08
            r0.setResult(r4, r2)
        L_0x0027:
            boolean r0 = r3.equals(r7)
            if (r0 == 0) goto L_0x005c
            boolean r0 = r10.A02
            if (r0 != 0) goto L_0x0058
            r0 = 1
            r10.A02 = r0
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = 1065353216(0x3f800000, float:1.0)
            r10.Cxf(r3, r0)
            android.view.View r1 = r10.A0B
            X.2co r0 = X.C315596kB.A02
            X.5nL r2 = X.C294975nL.A00(r1)
            r1 = 1063675494(0x3f666666, float:0.9)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.A0V(r3, r1, r0)
            r2.A0U(r3, r1, r0)
            X.Ag6 r0 = new X.Ag6
            r0.<init>(r10, r7)
            r2.A05 = r0
            r2.A0H()
        L_0x0058:
            r0 = 1
            r10.A00 = r0
            return
        L_0x005c:
            android.graphics.RectF r4 = r10.A0I
            if (r4 != 0) goto L_0x0065
            android.graphics.RectF r4 = r10.A0A
            r8 = 0
            if (r4 == 0) goto L_0x0066
        L_0x0065:
            r8 = 1
        L_0x0066:
            boolean r0 = r10.A0O
            r9 = r0 ^ 1
            android.view.View r5 = r10.A0B
            A00(r4, r5, r6, r7, r8, r9)
            goto L_0x0058
        L_0x0070:
            boolean r0 = r5.A3B
            if (r0 == 0) goto L_0x007c
            android.app.Activity r1 = r10.A08
            r0 = 101(0x65, float:1.42E-43)
            r1.setResult(r0)
            goto L_0x0027
        L_0x007c:
            android.app.Activity r0 = r10.A08
            r0.setResult(r4)
            goto L_0x0027
        L_0x0082:
            java.lang.String r2 = r5.A2q
            boolean r0 = r4.equals(r2)
            if (r0 == 0) goto L_0x008c
            r7 = r4
            goto L_0x0011
        L_0x008c:
            boolean r0 = r7.equals(r2)
            if (r0 == 0) goto L_0x009c
            X.0eK r0 = r10.A0L
            java.lang.Object r1 = r0.get()
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0011
        L_0x009c:
            boolean r0 = r10.A0M
            if (r0 == 0) goto L_0x00a3
            r7 = r3
            goto L_0x0011
        L_0x00a3:
            java.lang.String r7 = "story_replied"
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8WJ.APW():void");
    }

    public final void DDT(View view, String str, boolean z) {
        View view2 = view;
        boolean z2 = !this.A0O;
        RectF rectF = this.A0A;
        if (view == null) {
            view2 = this.A0B;
        }
        A00(rectF, view2, this, str, z, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r14 != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.graphics.RectF r9, android.view.View r10, X.AnonymousClass8WJ r11, java.lang.String r12, boolean r13, boolean r14) {
        /*
            boolean r0 = r11.A02
            if (r0 != 0) goto L_0x000e
            X.9UJ r5 = new X.9UJ
            r5.<init>(r11, r12)
            if (r13 != 0) goto L_0x000f
            r5.onFinish()
        L_0x000e:
            return
        L_0x000f:
            r7 = 1
            r11.A02 = r7
            java.lang.String r0 = "back"
            boolean r0 = r0.equals(r12)
            if (r9 == 0) goto L_0x0023
            if (r0 == 0) goto L_0x0020
            boolean r0 = r11.A0N
            if (r0 != 0) goto L_0x0023
        L_0x0020:
            r8 = 0
            if (r14 == 0) goto L_0x0024
        L_0x0023:
            r8 = 1
        L_0x0024:
            android.view.View r4 = r11.A0B
            android.content.Context r0 = r4.getContext()
            X.0qQ.A07(r0)
            int r0 = X.0nA.A08(r0)
            float r6 = (float) r0
            r2 = 8
            if (r10 == r4) goto L_0x0039
            r4.setVisibility(r2)
        L_0x0039:
            X.2co r0 = X.C315596kB.A02
            r0 = 0
            X.5nL r1 = X.C294975nL.A01(r10, r0)
            r1.A0G()
            r3 = 0
            if (r8 == 0) goto L_0x0086
            float r0 = r4.getTranslationY()
            float r0 = r0 / r6
        L_0x004b:
            r1.A00 = r0
            if (r8 != 0) goto L_0x0050
            r6 = 0
        L_0x0050:
            r1.A0K(r6)
            r1.A03 = r2
            X.5nL r1 = r1.A0F(r7)
            X.AgB r0 = new X.AgB
            r0.<init>(r11)
            r1.A06 = r0
            r1.A05 = r5
            X.2co r0 = X.C59681JTn.A00
            X.5nL r2 = r1.A0E(r0)
            if (r8 != 0) goto L_0x0082
            if (r9 == 0) goto L_0x0082
            float r1 = r4.getScaleX()
            float r0 = r9.centerX()
            r2.A0U(r1, r3, r0)
            float r1 = r4.getScaleY()
            float r0 = r9.centerY()
            r2.A0V(r1, r3, r0)
        L_0x0082:
            r2.A0H()
            return
        L_0x0086:
            r0 = 0
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8WJ.A00(android.graphics.RectF, android.view.View, X.8WJ, java.lang.String, boolean, boolean):void");
    }

    public final void Cxf(float f, int i) {
        Drawable mutate;
        if (this.A04 == null || this.A03 != -16777216) {
            this.A03 = -16777216;
            ColorDrawable colorDrawable = new ColorDrawable(-16777216);
            this.A04 = colorDrawable;
            View view = this.A0J;
            RectF rectF = 0nA.A01;
            view.setBackground(colorDrawable);
        }
        Drawable drawable = this.A04;
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            mutate.setAlpha((int) (255.0f * f));
        }
    }

    public AnonymousClass8WJ(View view, View view2, AnonymousClass80D r5, C356848Vl r6, AnonymousClass0eK r7, boolean z) {
        this.A0B = view;
        this.A0E = r6;
        this.A0J = view2;
        this.A0K = r5;
        this.A0M = z;
        this.A0L = r7;
        this.A0G = r5.A3H;
        Activity activity = r5.A05;
        0qQ.A07(activity);
        this.A08 = activity;
        r5.A0M.getClass();
        AnonymousClass4DH r0 = r5.A0M;
        0qQ.A07(r0);
        this.A0C = r0;
        UserSession userSession = r5.A0S;
        0qQ.A07(userSession);
        this.A0D = userSession;
        this.A09 = r5.A06;
        this.A0A = r5.A07;
        this.A0I = r5.A08;
        this.A06 = 0nA.A09(activity);
        this.A05 = 0nA.A08(activity);
        this.A0H = r5.A3v;
        this.A07 = r5.A04;
        this.A0N = r5.A3r;
        boolean z2 = r5.A33;
        this.A0F = z2;
        this.A0O = !z2;
    }
}
