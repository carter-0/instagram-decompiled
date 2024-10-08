package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.JcW  reason: case insensitive filesystem */
public final class C59963JcW extends 2YL implements AnonymousClass88G, C13907Tl7, B27 {
    public C61074JwC A00 = new C61074JwC((CropInfo) null, (FilterGroupModel) null, (0eP) null, (0eP) null, (DefaultConstructorMarker) null, 15, 8);
    public C66568MWw A01;
    public C66568MWw A02;
    public boolean A03;
    public boolean A04;
    public FilterGroupModel A05;
    public Integer A06;
    public boolean A07;
    public final C348257y9 A08 = new C64716Lgp(this, 2);
    public final UserSession A09;
    public final C3499682q A0A;
    public final C59847JaN A0B;
    public final C249513ju A0C;
    public final C249513ju A0D;
    public final C249513ju A0E;
    public final AnonymousClass0r6 A0F;
    public final AnonymousClass0r6 A0G;
    public final AnonymousClass0r6 A0H;
    public final AnonymousClass0r6 A0I;
    public final AnonymousClass0r6 A0J;
    public final 05G A0K;
    public final 05G A0L;
    public final 05G A0M;
    public final 05G A0N;
    public final 05G A0O;
    public final AnonymousClass0Ud A0P;
    public final AnonymousClass0Ud A0Q;
    public final AnonymousClass0Ud A0R;
    public final boolean A0S;
    public final 05G A0T;

    public C59963JcW(UserSession userSession, C3499682q r19, C59847JaN jaN, boolean z) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        C3499682q r0 = r19;
        C59847JaN jaN2 = jaN;
        AnonymousClass7TF.A1D(r0, 2, jaN2);
        this.A09 = userSession2;
        this.A0A = r0;
        this.A0S = z;
        this.A0B = jaN2;
        02z A10 = DbS.A10(new C59964JcX());
        this.A0M = A10;
        this.A0R = A10;
        1HR A1G = JTO.A1G(0);
        this.A0E = A1G;
        0sn r7 = 0sn.A00;
        02z A012 = 106.A01(r7);
        this.A0N = A012;
        02z A013 = 106.A01(r7);
        this.A0O = A013;
        02z A102 = DbS.A10(new C61080JwI((JVX) null, (DefaultConstructorMarker) null, 1, 38));
        this.A0L = A102;
        this.A0Q = A102;
        this.A0J = 0u9.A04(A1G);
        C61820pm A032 = AnonymousClass10H.A03(MII.A00, A012, A013);
        this.A0F = 10b.A02(new C60911JtV(r7, r7), C318116oQ.A00(this), A032, AnonymousClass10A.A01);
        1HR A1G2 = JTO.A1G(0);
        this.A0D = A1G2;
        this.A0I = 0u9.A04(A1G2);
        1HR A1G3 = JTO.A1G(0);
        this.A0C = A1G3;
        this.A0H = 0u9.A04(A1G3);
        02z A103 = DbS.A10(new C61080JwI((C66534MVo) null, (DefaultConstructorMarker) null, 1, 37));
        this.A0T = A103;
        this.A0P = A103;
        02z A014 = 106.A01((Object) null);
        this.A0K = A014;
        this.A0G = A014;
    }

    public final void A08(Context context, C353838Jj r9, AnonymousClass3Q2 r10, String str) {
        File file;
        String absolutePath;
        Bitmap A022;
        AnonymousClass7TF.A1C(context, 0, str);
        UserSession userSession = this.A09;
        FilterGroupModel A042 = A04();
        0qQ.A0B(A042, 4);
        1GK r6 = null;
        if (!(r9 == null || (A022 = r9.A02(true)) == null)) {
            r6 = AEI.A01(context, A022, userSession, false).A03(new C72221Oyp(r10, 5));
        }
        if (r6 != null) {
            try {
                if (OX4.A02(r6, new OTS(15, TimeUnit.SECONDS)) && (file = (File) r6.A07()) != null && (absolutePath = file.getAbsolutePath()) != null) {
                    C364978mK.A03(userSession, A042, absolutePath);
                }
            } catch (InterruptedException e) {
                0kD.A07(str, "renderDecorImageToFile() failed.", e);
            }
        } else {
            if (r10 != null) {
                r10.A2k = null;
            }
            A042.EWj((FilterModel) null, 26);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (X.182.A06(X.0Tu.A05, r11.A09, 36326541331806019L) == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(boolean r12) {
        /*
            r11 = this;
            r6 = 0
            if (r12 != 0) goto L_0x0017
            boolean r0 = r11.A04
            if (r0 == 0) goto L_0x0017
            com.instagram.common.session.UserSession r3 = r11.A09
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326541331806019(0x810ecc00003743, double:3.0363892412506464E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r10 = 1
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r10 = 0
        L_0x0018:
            X.05G r3 = r11.A0T
            java.lang.Object r0 = r3.getValue()
            X.JwI r0 = (X.C61080JwI) r0
            java.lang.Object r0 = r0.A00
            X.MVo r0 = (X.C66534MVo) r0
            if (r0 == 0) goto L_0x0029
            r0.CuZ(r12)
        L_0x0029:
            java.lang.Object r2 = r3.getValue()
            r9 = 0
            r1 = 37
            X.JwI r0 = new X.JwI
            r0.<init>((java.lang.Object) r9, (int) r1)
            boolean r0 = r3.AIY(r2, r0)
            if (r0 == 0) goto L_0x0029
            X.05G r8 = r11.A0M
        L_0x003d:
            java.lang.Object r7 = r8.getValue()
            r5 = r7
            X.JcX r5 = (X.C59964JcX) r5
            java.lang.Integer r4 = r11.A06
            if (r4 != 0) goto L_0x0054
            X.0Ud r0 = r11.A0R
            java.lang.Object r0 = r0.getValue()
            X.JcX r0 = (X.C59964JcX) r0
            java.lang.Object r4 = r0.A02
            java.lang.Integer r4 = (java.lang.Integer) r4
        L_0x0054:
            java.lang.Object r3 = r5.A02
            java.lang.Integer r3 = (java.lang.Integer) r3
            boolean r2 = r5.A03
            boolean r1 = r5.A04
            boolean r0 = r5.A05
            X.JcX r0 = X.C59964JcX.A00(r3, r4, r2, r1, r0)
            boolean r0 = r8.AIY(r7, r0)
            if (r0 == 0) goto L_0x003d
            r11.A06 = r9
            if (r12 == 0) goto L_0x0072
            X.MWw r0 = r11.A02
            r11.A01 = r0
            r11.A04 = r6
        L_0x0072:
            if (r10 == 0) goto L_0x007f
            X.6oS r1 = X.C318116oQ.A00(r11)
            r0 = 47
            X.C51971G9r.A1Q(r11, r1, r0)
            r11.A04 = r6
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59963JcW.A0A(boolean):void");
    }

    public final /* synthetic */ void CtK(Drawable drawable) {
    }

    public final /* synthetic */ void CtX() {
    }

    public final /* synthetic */ void CtY() {
    }

    public final void CuV(Drawable drawable, int i) {
        Integer num;
        C347017w8 r9;
        C391619tN r1;
        0qQ.A0B(drawable, 1);
        C59847JaN jaN = this.A0B;
        if (drawable instanceof AnonymousClass9UM) {
            num = AnonymousClass05K.A01;
        } else if (drawable instanceof C369898vV) {
            num = AnonymousClass05K.A0C;
        } else {
            Drawable drawable2 = null;
            if ((drawable instanceof C347017w8) && (r9 = (C347017w8) drawable) != null) {
                drawable2 = r9.A04();
            }
            if (drawable2 instanceof C369908vW) {
                num = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A0N;
            }
        }
        String valueOf = String.valueOf(i);
        0qQ.A0B(num, 0);
        0Aj A0e = AnonymousClass7TE.A0e(jaN.A0D, "ig_camera_apply_sticker");
        JTP.A1H(A0e);
        JTO.A1S(A0e, C360918fM.A00(jaN.A0E).A00());
        DbW.A15(A0e, jaN.A0C);
        A0e.AAJ("sticker_id", valueOf);
        int intValue = num.intValue();
        if (intValue == 0) {
            r1 = C391619tN.A07;
        } else if (intValue == 1) {
            r1 = C391619tN.A0C;
        } else if (intValue != 2) {
            r1 = C391619tN.A08;
        } else {
            r1 = C391619tN.A05;
        }
        A0e.A8M(r1, "sticker_type");
        AnonymousClass7TE.A1W(A0e, "sticker_source", 1);
        A0e.Cgf();
        A02(this, false, false);
    }

    public final /* synthetic */ void DAq(Drawable drawable, int i) {
    }

    public final /* synthetic */ void DAr(float f, float f2) {
    }

    public final /* synthetic */ void DAs(Drawable drawable) {
    }

    public final void DDr() {
        A02(this, true, false);
    }

    public final /* synthetic */ void DP7(Drawable drawable, int i, float f, float f2) {
    }

    public final /* synthetic */ void DPH() {
    }

    public final /* synthetic */ void DdI(Drawable drawable, int i, boolean z) {
    }

    public final void DhH(Drawable drawable, float f, float f2, float f3, float f4) {
        Object value;
        C59964JcX jcX;
        this.A07 = true;
        05G r5 = this.A0M;
        do {
            value = r5.getValue();
            jcX = (C59964JcX) value;
        } while (!r5.AIY(value, C59964JcX.A00((Integer) jcX.A02, (Integer) jcX.A01, true, jcX.A04, jcX.A05)));
    }

    public final void DlC(Drawable drawable, int i, float f, float f2) {
        0qQ.A0B(drawable, 1);
        if (drawable instanceof C306386Ly) {
            A02(this, true, false);
        }
    }

    public final void DlE(Drawable drawable, float f, float f2, float f3, float f4, int i) {
        A02(this, false, false);
    }

    public final void Dr5() {
        A02(this, false, false);
    }

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onDestroy(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onPause(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStop(AnonymousClass07Z r1) {
    }

    public static final 0eP A01(AnonymousClass514 r6, C59963JcW jcW, int i) {
        int i2 = i;
        if (r6 == AnonymousClass514.SQUARE) {
            Integer valueOf = Integer.valueOf(i);
            return new 0eP(valueOf, valueOf);
        }
        C3499682q r1 = jcW.A0A;
        CreationSession creationSession = ((JWE) r1).A01;
        AnonymousClass34S A092 = JW0.A09(r6.A00, creationSession.A01(), creationSession.A00(), r1.ATT(), i2, r6.A03, 2Ht.A03(jcW.A09));
        return AnonymousClass7TE.A1L(A092.A00, A092.A01);
    }

    public static final void A02(C59963JcW jcW, boolean z, boolean z2) {
        Object value;
        C59964JcX jcX;
        05G r4 = jcW.A0M;
        do {
            value = r4.getValue();
            jcX = (C59964JcX) value;
        } while (!r4.AIY(value, C59964JcX.A00((Integer) jcX.A02, (Integer) jcX.A01, z, jcX.A04, z2)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r1.A02().A0C == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel A04() {
        /*
            r3 = this;
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r3.A05
            if (r0 != 0) goto L_0x0016
            X.82q r0 = r3.A0A
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r1 = r0.A01
            com.instagram.creation.base.PhotoSession r0 = r1.A02()
            if (r0 == 0) goto L_0x0017
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r0.A07
            if (r0 == 0) goto L_0x0017
            r3.A05 = r0
        L_0x0016:
            return r0
        L_0x0017:
            com.instagram.common.session.UserSession r2 = r3.A09
            com.instagram.creation.base.PhotoSession r0 = r1.A02()
            if (r0 == 0) goto L_0x0028
            com.instagram.creation.base.PhotoSession r0 = r1.A02()
            boolean r1 = r0.A0C
            r0 = 1
            if (r1 != 0) goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r0 = X.C364978mK.A01(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59963JcW.A04():com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel");
    }

    public final void A05() {
        0Aj A0e = AnonymousClass7TE.A0e(this.A0B.A0D, "ig_camera_ui_tool_click");
        JTO.A1O(AnonymousClass80P.TEXT_FORMAT, A0e);
        JTP.A1H(A0e);
        A0e.A8M(C391619tN.A0C, "sticker_type");
        A0e.Cgf();
        A02(this, true, false);
    }

    public final void A06() {
        0Aj A0e = AnonymousClass7TE.A0e(this.A0B.A0D, "ig_camera_ui_tool_click");
        JTO.A1O(AnonymousClass80P.STICKER_TRAY, A0e);
        JTP.A1H(A0e);
        A0e.A8M(C391619tN.A08, "sticker_type");
        A0e.Cgf();
        A02(this, true, true);
    }

    public final void A07() {
        0Aj A0e = AnonymousClass7TE.A0e(this.A0B.A0D, "ig_camera_ui_tool_click");
        JTO.A1O(AnonymousClass80P.STICKER, A0e);
        JTP.A1H(A0e);
        A0e.A8M(C391619tN.A07, "sticker_type");
        A0e.Cgf();
        A02(this, true, false);
    }

    public final void A09(C66534MVo mVo, boolean z) {
        Object value;
        this.A04 = z;
        05G r2 = this.A0T;
        do {
        } while (!C61080JwI.A03(mVo, r2.getValue(), r2, 37));
        UserSession userSession = this.A09;
        0Tu r22 = 0Tu.A05;
        if (!182.A06(r22, userSession, 36328590031338949L) && !182.A06(r22, userSession, 36328590031470023L)) {
            this.A06 = (Integer) ((C59964JcX) this.A0M.getValue()).A01;
        }
        05G r3 = this.A0M;
        do {
            value = r3.getValue();
        } while (!C59964JcX.A01((C59964JcX) value, AnonymousClass05K.A0C, value, r3));
    }

    public final void Dsb() {
        Object value;
        C59964JcX jcX;
        if (this.A07) {
            this.A07 = false;
            05G r5 = this.A0M;
            do {
                value = r5.getValue();
                jcX = (C59964JcX) value;
            } while (!r5.AIY(value, C59964JcX.A00((Integer) jcX.A02, (Integer) jcX.A01, false, jcX.A04, jcX.A05)));
        }
    }

    public final void onResume(AnonymousClass07Z r2) {
        C66534MVo mVo = (C66534MVo) ((C61080JwI) this.A0T.getValue()).A00;
        if (mVo != null) {
            mVo.onResume();
        }
        A02(this, false, false);
    }

    public static C59964JcX A00(C59962JcV jcV) {
        return (C59964JcX) C59962JcV.A01(jcV).A0R.getValue();
    }

    public static boolean A03(C59962JcV jcV) {
        UserSession userSession = C59962JcV.A01(jcV).A09;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36328590031338949L) || 182.A06(r2, userSession, 36328590031470023L)) {
            return true;
        }
        return false;
    }
}
