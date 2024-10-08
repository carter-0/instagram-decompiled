package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.8H5  reason: invalid class name */
public final class AnonymousClass8H5 {
    public Drawable A00;
    public C356748Vb A01;
    public String A02;
    public final float A03;
    public final float A04;
    public final Activity A05;
    public final UserSession A06;
    public final C3510387i A07;
    public final AnonymousClass8BA A08;
    public final AnonymousClass8H6 A09 = new AnonymousClass8H6(this);
    public final InteractiveDrawableContainer A0A;
    public final boolean A0B;

    public AnonymousClass8H5(C3510387i r4, AnonymousClass8BA r5, AnonymousClass80D r6, InteractiveDrawableContainer interactiveDrawableContainer) {
        0qQ.A0B(interactiveDrawableContainer, 4);
        this.A08 = r5;
        this.A07 = r4;
        this.A0A = interactiveDrawableContainer;
        this.A06 = r6.A0S;
        Activity activity = r6.A05;
        this.A05 = activity;
        this.A0B = "story_selfie_reply".equals(r6.A2q);
        0qQ.A07(activity);
        float A002 = 0nA.A00(activity, 280.0f);
        this.A04 = A002;
        this.A03 = A002 / 2.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007c, code lost:
        r5 = r4.A06();
        r7 = (int) r0.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C365798nh r38, X.AnonymousClass8H5 r39) {
        /*
            r3 = r38
            X.8nd r0 = r3.A05
            int r2 = r0.ordinal()
            r1 = 0
            r0 = r39
            if (r2 == r1) goto L_0x0078
            r16 = 1
            X.7zv r2 = r3.A03
            if (r2 == 0) goto L_0x0147
            com.instagram.common.session.UserSession r9 = r0.A06     // Catch:{ IllegalArgumentException -> 0x0147 }
            X.0qQ.A06(r9)     // Catch:{ IllegalArgumentException -> 0x0147 }
            java.lang.String r3 = r2.A0k     // Catch:{ IllegalArgumentException -> 0x0147 }
            java.io.File r4 = new java.io.File     // Catch:{ IllegalArgumentException -> 0x0147 }
            r4.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x0147 }
            r3 = 3
            com.instagram.common.gallery.Medium r8 = X.C282665Eg.A03(r4, r3, r1)     // Catch:{ IllegalArgumentException -> 0x0147 }
            X.9sQ r10 = X.C391149sQ.ROLL_CALL_STORIES     // Catch:{ IllegalArgumentException -> 0x0147 }
            float r3 = r0.A04     // Catch:{ IllegalArgumentException -> 0x0147 }
            int r14 = (int) r3     // Catch:{ IllegalArgumentException -> 0x0147 }
            float r3 = r0.A03     // Catch:{ IllegalArgumentException -> 0x0147 }
            X.9Hy r7 = new X.9Hy     // Catch:{ IllegalArgumentException -> 0x0147 }
            r15 = r7
            r18 = r3
            r19 = r3
            r20 = r3
            r17 = r3
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ IllegalArgumentException -> 0x0147 }
            java.lang.String r12 = "rollcall_v2_video_sticker"
            r3 = 0
            r13 = 0
            X.9sL r11 = X.C391099sL.NOT_CLIPS     // Catch:{ IllegalArgumentException -> 0x0147 }
            r16 = -1
            r17 = -2147483648(0xffffffff80000000, float:-0.0)
            X.9X8 r6 = new X.9X8     // Catch:{ IllegalArgumentException -> 0x0147 }
            r15 = r14
            r18 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ IllegalArgumentException -> 0x0147 }
            r0.A00 = r6     // Catch:{ IllegalArgumentException -> 0x0147 }
            r4 = 0
            android.graphics.Bitmap r4 = r6.A00(r4)     // Catch:{ IllegalArgumentException -> 0x0147 }
            r0.A02 = r3     // Catch:{ IllegalArgumentException -> 0x0147 }
            if (r4 == 0) goto L_0x0069
            android.app.Activity r1 = r0.A05     // Catch:{ IllegalArgumentException -> 0x0147 }
            java.io.File r3 = X.0mb.A04(r1)     // Catch:{ IllegalArgumentException -> 0x0147 }
            boolean r1 = X.1MF.A0M(r4, r3)     // Catch:{ IllegalArgumentException -> 0x0147 }
            if (r1 == 0) goto L_0x0069
            java.lang.String r1 = r3.getCanonicalPath()     // Catch:{ IllegalArgumentException -> 0x0147 }
            r0.A02 = r1     // Catch:{ IllegalArgumentException -> 0x0147 }
        L_0x0069:
            X.8Vb r0 = r0.A01     // Catch:{ IllegalArgumentException -> 0x0147 }
            if (r0 == 0) goto L_0x0147
            X.8nh r1 = new X.8nh     // Catch:{ IllegalArgumentException -> 0x0147 }
            r1.<init>((X.C349307zv) r2)     // Catch:{ IllegalArgumentException -> 0x0147 }
            X.8VZ r0 = r0.A00     // Catch:{ IllegalArgumentException -> 0x0147 }
            r0.A00(r1)     // Catch:{ IllegalArgumentException -> 0x0147 }
            return
        L_0x0078:
            X.8Cl r4 = r3.A02
            if (r4 == 0) goto L_0x0147
            java.lang.String r5 = r4.A06()
            float r2 = r0.A04
            int r7 = (int) r2
            int r3 = r4.A07
            boolean r2 = r4.A13
            r6 = r7
            r8 = r7
            r9 = r7
            r10 = r3
            r11 = r2
            android.graphics.Bitmap r5 = X.1MF.A0G(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x0147
            android.app.Activity r6 = r0.A05
            X.0qQ.A06(r6)
            java.lang.String r3 = r4.A06()
            java.io.File r2 = new java.io.File
            r2.<init>(r3)
            X.0qQ.A0B(r2, r1)
            r3 = 1
            com.instagram.common.gallery.Medium r13 = X.C282665Eg.A03(r2, r3, r1)
            r9 = 0
            X.8Mx r15 = X.C354668Mx.ROLL_CALL
            X.8vW r2 = new X.8vW
            r14 = r9
            r16 = r9
            r18 = r7
            r20 = r1
            r21 = r1
            r22 = r1
            r10 = r2
            r11 = r6
            r12 = r5
            r17 = r7
            r19 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.8BA r7 = r0.A08
            java.lang.String r38 = "rollcall_v2_photo_sticker"
            java.lang.String[] r8 = new java.lang.String[]{r38}
            java.util.ArrayList r39 = X.0sr.A1M(r8)
            java.lang.Integer r12 = X.AnonymousClass05K.A00
            r18 = 1065353216(0x3f800000, float:1.0)
            r21 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.6b1 r8 = new X.6b1
            r10 = r9
            r11 = r9
            r13 = r9
            r15 = r9
            r17 = r9
            r19 = r18
            r20 = r18
            r22 = r21
            r23 = r1
            r24 = r1
            r25 = r3
            r26 = r1
            r27 = r1
            r28 = r3
            r29 = r1
            r30 = r1
            r31 = r1
            r32 = r1
            r33 = r3
            r34 = r3
            r35 = r1
            r36 = r1
            r37 = r1
            r8.<init>((X.AnonymousClass8BH) r9, (X.AnonymousClass8DA) r10, (X.C3510487j) r11, (java.lang.Integer) r12, (java.lang.Integer) r13, (java.lang.Integer) r14, (java.lang.Object) r15, (java.lang.String) r16, (java.util.List) r17, (float) r18, (float) r19, (float) r20, (float) r21, (float) r22, (int) r23, (boolean) r24, (boolean) r25, (boolean) r26, (boolean) r27, (boolean) r28, (boolean) r29, (boolean) r30, (boolean) r31, (boolean) r32, (boolean) r33, (boolean) r34, (boolean) r35, (boolean) r36, (boolean) r37)
            X.57C r36 = X.AnonymousClass57C.ASSET_PICKER
            r34 = r7
            r35 = r2
            r37 = r8
            r34.A0f(r35, r36, r37, r38, r39)
            r0.A00 = r2
            r0.A02 = r9
            java.io.File r7 = X.0mb.A04(r6)
            boolean r2 = X.1MF.A0M(r5, r7)
            if (r2 == 0) goto L_0x0122
            java.lang.String r2 = r7.getCanonicalPath()
            r0.A02 = r2
        L_0x0122:
            java.lang.String r7 = X.2RR.A01()
            java.io.File r2 = r4.A03()
            java.lang.String r2 = r2.getName()
            java.io.File r4 = new java.io.File
            r4.<init>(r7, r2)
            X.1MF.A0M(r5, r4)
            com.instagram.common.session.UserSession r2 = r0.A06
            X.0qQ.A06(r2)
            X.0qQ.A0B(r4, r1)
            com.instagram.common.gallery.Medium r1 = X.C282665Eg.A03(r4, r3, r1)
            X.8H6 r0 = r0.A09
            X.LI5.A00(r6, r1, r2, r0)
        L_0x0147:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8H5.A00(X.8nh, X.8H5):void");
    }
}
