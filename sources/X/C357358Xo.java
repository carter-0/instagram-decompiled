package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;

/* renamed from: X.8Xo  reason: invalid class name and case insensitive filesystem */
public final class C357358Xo implements AnonymousClass81E {
    public C331157Pu A00;
    public C331127Pr A01;
    public final AnonymousClass86D A02;
    public final C357348Xn A03;
    public final int A04;
    public final UserSession A05;
    public final AnonymousClass86A A06;

    public final void A04(AnonymousClass849 r3) {
        0qQ.A0B(r3, 0);
        this.A02.A09(r3.A00.name());
    }

    public final /* synthetic */ void A7M(Parcelable parcelable) {
    }

    public final AnonymousClass902 A02(AnonymousClass849 r7, String str, int i, boolean z, boolean z2, boolean z3) {
        AnonymousClass902 r4 = new AnonymousClass902();
        Bundle bundle = new Bundle();
        bundle.putInt("effect_discovery_entry_point_key", i);
        bundle.putString("surface", r7.toString());
        r4.setArguments(bundle);
        AnonymousClass86D r5 = this.A02;
        AnonymousClass86A r3 = this.A06;
        r5.A03 = r7;
        r5.A00 = new AnonymousClass904(AnonymousClass903.A00(r7), r5.A0E, r3);
        r5.A0A = z;
        r5.A09 = z3;
        r5.A0K.set(z2);
        if (i == 15) {
            if (str == null) {
                r5.A04.A01(AnonymousClass84B.MINI_GALLERY);
            } else {
                AnonymousClass86D.A02(r5, str);
                return r4;
            }
        }
        return r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0134, code lost:
        r7 = r1.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(android.content.Context r18, X.AnonymousClass849 r19, float r20, float r21, int r22, boolean r23, boolean r24, boolean r25) {
        /*
            r17 = this;
            r6 = r21
            r9 = r20
            r12 = 0
            r5 = 0
            r0 = 2
            r11 = r19
            X.0qQ.A0B(r11, r0)
            r2 = r18
            boolean r0 = X.2eO.A00(r2)
            r13 = r22
            if (r0 == 0) goto L_0x0025
            r1 = 15
            r0 = 1065353216(0x3f800000, float:1.0)
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r13 != r1) goto L_0x0021
            r9 = 1060320051(0x3f333333, float:0.7)
        L_0x0021:
            float r6 = java.lang.Math.max(r0, r0)
        L_0x0025:
            r10 = r17
            X.7Pu r0 = r10.A00
            if (r0 != 0) goto L_0x01ac
            X.86D r7 = r10.A02
            X.80W r0 = r7.A05
            if (r0 == 0) goto L_0x008a
            android.util.Pair r0 = r0.A00
            java.lang.Object r0 = r0.first
        L_0x0035:
            X.80V r1 = X.AnonymousClass80V.CLIPS_EDITOR
            r4 = 1
            r16 = 0
            if (r0 != r1) goto L_0x003e
            r16 = 1
        L_0x003e:
            r14 = r23
            r15 = r24
            X.902 r3 = r10.A02(r11, r12, r13, r14, r15, r16)
            com.instagram.common.session.UserSession r0 = r10.A05
            X.7Pr r8 = new X.7Pr
            r8.<init>(r0)
            r8.A0k = r5
            r8.A0q = r4
            r8.A03 = r9
            r8.A0x = r4
            r8.A03 = r9
            r8.A04 = r6
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r8.A0a = r0
            r6 = 0
            r8.A0T = r3
            X.905 r0 = new X.905
            r0.<init>(r10)
            r8.A0U = r0
            r8.A1O = r5
            if (r25 == 0) goto L_0x0087
            r0 = 2130970166(0x7f040636, float:1.7549034E38)
            int r0 = X.2Yu.A0H(r2, r0)
            int r0 = r2.getColor(r0)
        L_0x0078:
            r8.A06 = r0
            r10.A01 = r8
            X.80W r0 = r7.A05
            if (r0 == 0) goto L_0x01a3
            android.util.Pair r0 = r0.A00
            java.lang.Object r0 = r0.first
            if (r0 != r1) goto L_0x01a3
            goto L_0x008c
        L_0x0087:
            int r0 = r10.A04
            goto L_0x0078
        L_0x008a:
            r0 = 0
            goto L_0x0035
        L_0x008c:
            r0 = 2131099703(0x7f060037, float:1.7811767E38)
            int r7 = r2.getColor(r0)     // Catch:{ Error -> 0x0196 }
            r0 = 2130970183(0x7f040647, float:1.7549069E38)
            int r0 = X.2Yu.A0H(r2, r0)     // Catch:{ Error -> 0x0196 }
            int r1 = r2.getColor(r0)     // Catch:{ Error -> 0x0196 }
            X.Hky r0 = new X.Hky     // Catch:{ Error -> 0x0196 }
            r0.<init>(r7, r1)     // Catch:{ Error -> 0x0196 }
            r8.A0P = r0     // Catch:{ Error -> 0x0196 }
            X.7Pr r1 = r10.A01     // Catch:{ Error -> 0x0196 }
            if (r1 == 0) goto L_0x00b2
            r0 = 2131099703(0x7f060037, float:1.7811767E38)
            int r0 = r2.getColor(r0)     // Catch:{ Error -> 0x0196 }
            r1.A0E = r0     // Catch:{ Error -> 0x0196 }
        L_0x00b2:
            X.8Xn r0 = r10.A03     // Catch:{ Error -> 0x0196 }
            if (r0 == 0) goto L_0x00be
            X.0Ud r0 = X.AnonymousClass8d4.A03     // Catch:{ Error -> 0x0196 }
            java.lang.Object r12 = r0.getValue()     // Catch:{ Error -> 0x0196 }
            com.instagram.camera.effect.models.CameraAREffect r12 = (com.instagram.camera.effect.models.CameraAREffect) r12     // Catch:{ Error -> 0x0196 }
        L_0x00be:
            X.7Pr r7 = r10.A01     // Catch:{ Error -> 0x0196 }
            if (r7 == 0) goto L_0x00d6
            if (r12 == 0) goto L_0x00c9
            java.lang.String r0 = r12.A0S     // Catch:{ Error -> 0x0196 }
            if (r0 == 0) goto L_0x00c9
            goto L_0x00d4
        L_0x00c9:
            android.content.res.Resources r1 = r2.getResources()     // Catch:{ Error -> 0x0196 }
            r0 = 2131955837(0x7f13107d, float:1.9548213E38)
            java.lang.CharSequence r0 = r1.getText(r0)     // Catch:{ Error -> 0x0196 }
        L_0x00d4:
            r7.A0d = r0     // Catch:{ Error -> 0x0196 }
        L_0x00d6:
            if (r12 == 0) goto L_0x0101
            X.7Pr r7 = r10.A01     // Catch:{ Error -> 0x0196 }
            if (r7 == 0) goto L_0x00eb
            r1 = 2131953212(0x7f13063c, float:1.9542889E38)
            java.lang.String r0 = r12.A0C     // Catch:{ Error -> 0x0196 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ Error -> 0x0196 }
            java.lang.String r0 = r2.getString(r1, r0)     // Catch:{ Error -> 0x0196 }
            r7.A0c = r0     // Catch:{ Error -> 0x0196 }
        L_0x00eb:
            X.7Pr r1 = r10.A01     // Catch:{ Error -> 0x0196 }
            if (r1 == 0) goto L_0x00f6
            X.7Pt r0 = A00(r2, r10)     // Catch:{ Error -> 0x0196 }
            r1.A06(r0)     // Catch:{ Error -> 0x0196 }
        L_0x00f6:
            X.7Pr r1 = r10.A01     // Catch:{ Error -> 0x0196 }
            if (r1 == 0) goto L_0x0101
            X.7Pt r0 = A01(r2, r10)     // Catch:{ Error -> 0x0196 }
            r1.A07(r0)     // Catch:{ Error -> 0x0196 }
        L_0x0101:
            X.7Pr r0 = r10.A01     // Catch:{ Error -> 0x0196 }
            if (r0 == 0) goto L_0x0109
            X.7Pu r6 = r0.A00()     // Catch:{ Error -> 0x0196 }
        L_0x0109:
            r10.A00 = r6     // Catch:{ Error -> 0x0196 }
            if (r6 == 0) goto L_0x0110
            r6.A03(r2, r3)     // Catch:{ Error -> 0x0196 }
        L_0x0110:
            X.7Pu r1 = r10.A00     // Catch:{ Error -> 0x0196 }
            if (r1 == 0) goto L_0x011e
            r0 = 1115684864(0x42800000, float:64.0)
            float r0 = X.0nA.A00(r2, r0)     // Catch:{ Error -> 0x0196 }
            int r0 = (int) r0     // Catch:{ Error -> 0x0196 }
            r1.A09(r0)     // Catch:{ Error -> 0x0196 }
        L_0x011e:
            android.content.res.Resources r1 = r2.getResources()     // Catch:{ Error -> 0x0196 }
            r0 = 2131165219(0x7f070023, float:1.7944649E38)
            float r0 = r1.getDimension(r0)     // Catch:{ Error -> 0x0196 }
            int r3 = (int) r0     // Catch:{ Error -> 0x0196 }
            X.7Pu r1 = r10.A00     // Catch:{ Error -> 0x0196 }
            if (r1 == 0) goto L_0x018c
            boolean r0 = r1.A0S()     // Catch:{ Error -> 0x0196 }
            if (r0 == 0) goto L_0x018c
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r7 = r1.A03     // Catch:{ Error -> 0x0196 }
            android.widget.TextView r1 = r7.A0L()     // Catch:{ Error -> 0x0196 }
            if (r1 == 0) goto L_0x018c
            float r8 = r1.getTextSize()     // Catch:{ Error -> 0x0196 }
            r0 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r0
            float r6 = r1.getTextSize()     // Catch:{ Error -> 0x0196 }
            X.3oV r1 = r7.titleTextView     // Catch:{ Error -> 0x0196 }
            boolean r0 = r7.isAdded()     // Catch:{ Error -> 0x0196 }
            if (r0 == 0) goto L_0x016b
            if (r1 == 0) goto L_0x016b
            android.view.View r0 = r1.getView()     // Catch:{ Error -> 0x0196 }
            if (r0 == 0) goto L_0x016b
            android.view.View r0 = r1.getView()     // Catch:{ Error -> 0x0196 }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Error -> 0x0196 }
            r0.setMaxLines(r4)     // Catch:{ Error -> 0x0196 }
            android.view.View r2 = r1.getView()     // Catch:{ Error -> 0x0196 }
            android.widget.TextView r2 = (android.widget.TextView) r2     // Catch:{ Error -> 0x0196 }
            int r1 = (int) r8     // Catch:{ Error -> 0x0196 }
            int r0 = (int) r6     // Catch:{ Error -> 0x0196 }
            r2.setAutoSizeTextTypeUniformWithConfiguration(r1, r0, r4, r5)     // Catch:{ Error -> 0x0196 }
        L_0x016b:
            X.3oV r2 = r7.titleTextView     // Catch:{ Error -> 0x0196 }
            boolean r0 = r7.isAdded()     // Catch:{ Error -> 0x0196 }
            if (r0 == 0) goto L_0x018c
            if (r2 == 0) goto L_0x018c
            android.view.View r0 = r2.getView()     // Catch:{ Error -> 0x0196 }
            if (r0 == 0) goto L_0x018c
            android.view.View r0 = r2.getView()     // Catch:{ Error -> 0x0196 }
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()     // Catch:{ Error -> 0x0196 }
            r1.height = r3     // Catch:{ Error -> 0x0196 }
            android.view.View r0 = r2.getView()     // Catch:{ Error -> 0x0196 }
            r0.setLayoutParams(r1)     // Catch:{ Error -> 0x0196 }
        L_0x018c:
            if (r12 == 0) goto L_0x01ac
            X.7Pu r0 = r10.A00     // Catch:{ Error -> 0x0196 }
            if (r0 == 0) goto L_0x01ac
            r0.A04()     // Catch:{ Error -> 0x0196 }
            return
        L_0x0196:
            r2 = move-exception
            r0 = 980(0x3d4, float:1.373E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "Exception when creating BottomSheet title header"
            X.0wb.A06(r1, r0, r2)
            return
        L_0x01a3:
            X.7Pu r0 = r8.A00()
            r10.A00 = r0
            r0.A0D(r2, r3)
        L_0x01ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C357358Xo.A03(android.content.Context, X.849, float, float, int, boolean, boolean, boolean):void");
    }

    public final void A05(CameraAREffect cameraAREffect) {
        AnonymousClass86D r0 = this.A02;
        if (cameraAREffect != null) {
            AnonymousClass848 r02 = r0.A04;
            String str = cameraAREffect.A0K;
            0qQ.A07(str);
            r02.A00.Epw(new AnonymousClass8YD(AnonymousClass84B.DEFAULT, str, "mini_gallery", (String) null, (String) null, (String) null, (String) null, -1, false));
            return;
        }
        r0.A04.A01(AnonymousClass84B.DEFAULT);
    }

    public final boolean A06() {
        AnonymousClass86D r2 = this.A02;
        if (r2.A0O.getValue() != AnonymousClass86R.OPEN || !r2.A0L.get()) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ Parcelable ANX() {
        return null;
    }

    public C357358Xo(AnonymousClass86D r1, UserSession userSession, AnonymousClass86A r3, C357348Xn r4, int i) {
        this.A05 = userSession;
        this.A02 = r1;
        this.A04 = i;
        this.A06 = r3;
        this.A03 = r4;
    }

    public static final C331147Pt A00(Context context, C357358Xo r6) {
        return new C331137Ps(new AM1(r6), context.getResources().getText(2131955828).toString(), context.getResources().getText(2131955828).toString(), 0, 22).A00();
    }

    public static final C331147Pt A01(Context context, C357358Xo r6) {
        return new C331137Ps(new AM2(r6), context.getResources().getText(2131955829).toString(), context.getResources().getText(2131955829).toString(), 0, 22).A00();
    }
}
