package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class LP8 {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public AnonymousClass55U A04;
    public AnonymousClass3QD A05;
    public AnonymousClass3QD A06;
    public C64386Lb3 A07;
    public Integer A08;
    public List A09;
    public AnonymousClass2Q9 A0A;
    public final Context A0B;
    public final UserSession A0C;
    public final AnonymousClass3Q2 A0D;
    public final C2373837k A0E;
    public final C63949LEr A0F;
    public final C66454MSi A0G;
    public final 1Cn A0H;
    public final String A0I;
    public final String A0J;
    public final List A0K;
    public final Map A0L;
    public final C61410nE A0M = C61410nE.A00;

    public LP8(Context context, UserSession userSession, AnonymousClass3Q2 r5, C2373837k r6, C66454MSi mSi, 1Cn r8, String str, Map map) {
        C51974G9v.A0d(3, r5, r6, str, r8);
        this.A0B = context;
        this.A0C = userSession;
        this.A0D = r5;
        this.A0E = r6;
        this.A0I = str;
        this.A0H = r8;
        this.A0G = mSi;
        this.A0L = map;
        this.A0F = new C63949LEr(r5, r6);
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A0K = A1C;
        this.A07 = new C64386Lb3();
        this.A08 = AnonymousClass05K.A00;
        this.A0J = userSession.A06;
        if (r5.A0u()) {
            A1C.addAll(r5.A0L());
        }
        if (r5.A11()) {
            A1C.addAll(r5.A4m);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass55U A01(X.AnonymousClass1XT r13, X.2ZL r14, java.lang.String r15) {
        /*
            r12 = this;
            r0 = 1
            X.0qQ.A0B(r14, r0)
            java.lang.String r4 = r13.getStatus()
            X.0qQ.A07(r4)
            java.lang.String r3 = r13.getErrorMessage()
            java.lang.String r7 = r13.getErrorType()
            int r0 = r4.length()
            if (r0 != 0) goto L_0x002e
            if (r3 == 0) goto L_0x0021
            int r0 = r3.length()
            if (r0 != 0) goto L_0x002e
        L_0x0021:
            java.lang.String r0 = ": Invalid reply"
            java.lang.String r0 = X.002.A0R(r15, r0)
            X.55U r4 = X.AnonymousClass55V.A00(r14, r0)
        L_0x002b:
            r12.A04 = r4
            return r4
        L_0x002e:
            int r11 = r14.A02
            r6 = 400(0x190, float:5.6E-43)
            if (r11 < r6) goto L_0x0093
            r0 = 500(0x1f4, float:7.0E-43)
            if (r11 >= r0) goto L_0x008c
            boolean r5 = r13.isLoginRequired()
            boolean r2 = r13.isCheckpointRequired()
            boolean r1 = r13.isFeedbackRequired()
            r0 = 429(0x1ad, float:6.01E-43)
            if (r11 == r0) goto L_0x0089
            if (r2 != 0) goto L_0x0089
            if (r5 != 0) goto L_0x0089
            if (r1 != 0) goto L_0x0089
            r0 = 422(0x1a6, float:5.91E-43)
            if (r11 != r0) goto L_0x0081
            X.55S r5 = X.AnonymousClass55S.A09
        L_0x0054:
            X.55S r0 = X.AnonymousClass55S.A0O
            if (r5 == r0) goto L_0x007f
            java.lang.String r8 = r13.getLocalizedErrorMessage()
        L_0x005c:
            java.lang.StringBuilder r1 = X.AnonymousClass7TF.A0n(r15)
            java.lang.String r0 = ": Reply: "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = ", "
            r1.append(r0)
            r1.append(r4)
            r1.append(r0)
            java.lang.String r6 = X.AnonymousClass7TF.A0l(r3, r1)
            r9 = 0
            X.55U r4 = new X.55U
            r10 = r9
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x002b
        L_0x007f:
            r8 = 0
            goto L_0x005c
        L_0x0081:
            if (r11 != r6) goto L_0x0086
            X.55S r5 = X.AnonymousClass55S.A0J
            goto L_0x0054
        L_0x0086:
            X.55S r5 = X.AnonymousClass55S.A0F
            goto L_0x0054
        L_0x0089:
            X.55S r5 = X.AnonymousClass55S.A0B
            goto L_0x0054
        L_0x008c:
            r0 = 600(0x258, float:8.41E-43)
            if (r11 >= r0) goto L_0x0093
            X.55S r5 = X.AnonymousClass55S.A0O
            goto L_0x0054
        L_0x0093:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            java.lang.String r1 = r13.getStatus()
            java.lang.String r0 = r13.getErrorMessage()
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r0}
            java.lang.String r0 = "Unexpected IG Reply %d, %s, %s"
            java.lang.String r1 = X.0mp.A06(r0, r1)
            java.lang.String r0 = "ErrorType"
            X.0wb.A03(r0, r1)
            X.55S r5 = X.AnonymousClass55S.A0B
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LP8.A01(X.1XT, X.2ZL, java.lang.String):X.55U");
    }

    public final AnonymousClass55U A02(AnonymousClass55S r2, String str) {
        0qQ.A0B(str, 1);
        AnonymousClass55U A012 = AnonymousClass55V.A01(r2, str, (String) null, (Throwable) null);
        this.A04 = A012;
        return A012;
    }

    public static String A00(LP8 lp8, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("from ");
        sb.append(lp8.A05);
        sb.append(" to ");
        sb.append(obj);
        return sb.toString();
    }

    public final AnonymousClass55U A03(AnonymousClass55S r16, String str, String str2, Throwable th) {
        Throwable th2;
        AnonymousClass55S r5;
        AnonymousClass55S r1 = r16;
        String str3 = str;
        String str4 = str2;
        AnonymousClass7TG.A1T(r1, str3, str4);
        AnonymousClass55U A012 = AnonymousClass55V.A01(r1, str3, str4, th);
        this.A04 = A012;
        C2373737j r4 = (C2373737j) this.A0E;
        0xI A022 = C2373737j.A02(r4, this, "render_video_failure", str3, -1);
        AnonymousClass55U r0 = this.A04;
        if (r0 != null) {
            A022.A0C("error_type", r0.A01.toString());
        }
        AnonymousClass3Q2 r6 = this.A0D;
        C2373737j.A07(A022, r4);
        AnonymousClass55U r02 = this.A04;
        if (r02 != null) {
            th2 = r02.A08;
        } else {
            th2 = null;
        }
        if (r02 != null) {
            r5 = r02.A01;
        } else {
            r5 = null;
        }
        r4.EG1(r5, r6, str3, str4, th2);
        return A012;
    }

    public final AnonymousClass55U A04(AnonymousClass55S r22, String str, Throwable th) {
        String str2;
        Map A072;
        AnonymousClass55S r0 = r22;
        String str3 = str;
        boolean A1Z = AnonymousClass7TG.A1Z(r0, str3);
        Throwable th2 = th;
        AnonymousClass55U A012 = AnonymousClass55V.A01(r0, str3, (String) null, th2);
        this.A04 = A012;
        C2373737j r9 = (C2373737j) this.A0E;
        0xI A022 = C2373737j.A02(r9, this, "render_video_cancel", str3, -1);
        AnonymousClass55U r02 = this.A04;
        if (r02 != null) {
            A022.A0C("error_type", r02.A01.toString());
        }
        C2373737j.A07(A022, r9);
        AnonymousClass3Q2 r11 = this.A0D;
        0Aj A0e = AnonymousClass7TE.A0e(r9.A01, "ig_video_render_cancel");
        if (A0e.isSampled()) {
            Context context = r9.A00;
            UserSession userSession = r9.A02;
            C59907JbW jbW = new C59907JbW(context, userSession, r11);
            JTS.A1B(A0e, jbW.A02);
            C59908JbX.A05(A0e, jbW, "connection", C61970qY.A08(jbW.A00));
            C59908JbX.A02(A0e, userSession, r11, jbW);
            if (r11.A0E() == ShareType.REEL_SHARE) {
                str2 = C59906JbV.A03(userSession, r11, (ShareType) null, A1Z);
            } else {
                str2 = null;
            }
            A0e.AAJ("target_surface", str2);
            A0e.AAJ("ingest_type", jbW.A0I());
            C59908JbX.A03(A0e, jbW);
            A0e.AAJ("reason", str3);
            if (r11.A5D) {
                A072 = null;
            } else {
                A072 = jbW.A07();
            }
            JTS.A1C(A0e, A072);
            A0e.Cgf();
        }
        if (th2 instanceof AnonymousClass4ZS) {
            r9.Cji((AnonymousClass55S) null, r11, "VIDEO_RENDER_CANCEL", "", th2);
        }
        r9.Cjm(r11, "ig_video_render_cancel", (String) null);
        return A012;
    }
}
