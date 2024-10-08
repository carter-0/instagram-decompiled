package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Handler;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.EDe  reason: case insensitive filesystem */
public class C47695EDe extends 1P0 {
    public String A00;
    public final Activity A01;
    public final Handler A02;
    public final C319616qu A03;
    public final AnonymousClass0iw A04;
    public final AnonymousClass0aP A05;
    public final G8H A06;
    public final C48259Ebe A07;
    public final C46634DiE A08;
    public final Integer A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final EWC A0D;
    public final Uri A0E;
    public final 0wc A0F;

    public final void A02(User user, 1Q0 r15) {
        1Ln r2;
        String str = "";
        if (r15 == 1Q0.A0w) {
            double A012 = DbS.A01();
            double A002 = DbS.A00();
            r2 = new 1Ln(AnonymousClass7TE.A0e(this.A0F, "log_in_sso"), 333);
            r2.A0R("waterfall_id", 1Q0.A01());
            r2.A0R("containermodule", "waterfall_log_in");
            r2.A0P("elapsed_time", Double.valueOf(A012 - A002));
            r2.A0q("unknown");
            r2.A0R("login_userid", user.getId());
            r2.A0P(TraceFieldType.StartTime, Double.valueOf(A002));
            C46634DiE diE = this.A08;
            if (diE != null) {
                str = diE.A01;
            }
            r2.A0R("step", str);
            r2.A0R("guid", FH8.A00());
            AnonymousClass0iw r0 = this.A04;
            r0.getClass();
            r2.A0n(r0.getModuleName());
            AnonymousClass0aP r1 = this.A05;
            0qQ.A0B(r1, 0);
            r2.A0p(DbZ.A0m(r1));
            r2.A0O("multi_tap_enabled", AnonymousClass7TE.A0v());
        } else if (r15 == 1Q0.A0x) {
            double A013 = DbS.A01();
            double A003 = DbS.A00();
            r2 = new 1Ln(AnonymousClass7TE.A0e(this.A0F, "ig_log_in"), 232);
            r2.A0P("current_time", Double.valueOf(A013));
            r2.A0P("elapsed_time", Double.valueOf(A013 - A003));
            r2.A0R("guid", FH8.A00());
            r2.A0R("instagram_id", user.getId());
            r2.A0R("login_type", C48972EnA.A00(this.A09));
            r2.A0P(TraceFieldType.StartTime, Double.valueOf(A003));
            C46634DiE diE2 = this.A08;
            if (diE2 != null) {
                str = diE2.A01;
            }
            r2.A0R("step", str);
            r2.A0R("waterfall_id", 1Q0.A01());
            r2.A0R("containermodule", "waterfall_log_in");
            AnonymousClass0aP r12 = this.A05;
            0qQ.A0B(r12, 0);
            r2.A0p(DbZ.A0m(r12));
        } else {
            AnonymousClass0aP r6 = this.A05;
            C46634DiE diE3 = this.A08;
            if (diE3 != null) {
                str = diE3.A01;
            }
            String id = user.getId();
            AnonymousClass7TG.A1N(r6, str);
            C49216ErL.A00(r6, (C49922FEx) null, str, id, (String) null, (String) null, (String) null);
            return;
        }
        r2.Cgf();
    }

    public void A03(UserSession userSession, User user) {
        Activity activity = this.A01;
        activity.getClass();
        C46413Dea.A06(activity, this.A0E, this.A04, userSession);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.6qu, java.lang.Object] */
    public C47695EDe(Activity activity, Uri uri, AnonymousClass0iw r4, AnonymousClass0aP r5, G8H g8h, C48259Ebe ebe, C46634DiE diE, Integer num, String str, String str2, String str3, EWC ewc) {
        this.A02 = AnonymousClass7TF.A0D();
        this.A03 = new Object();
        this.A00 = "other";
        this.A05 = r5;
        this.A01 = activity;
        this.A08 = diE;
        this.A04 = r4;
        this.A09 = num;
        this.A0A = str;
        this.A06 = g8h;
        this.A0E = uri;
        this.A0F = AnonymousClass0kN.A01(r4, r5);
        this.A0C = str2;
        this.A0B = str3;
        this.A07 = ebe;
        this.A0D = ewc;
    }

    public static int A00(C47695EDe eDe, Object obj, int i) {
        int A032 = AnonymousClass0fD.A03(i);
        eDe.A04((EM4) obj);
        return A032;
    }

    public void A04(EM4 em4) {
        int i;
        int A032 = AnonymousClass0fD.A03(-1814401752);
        Activity activity = this.A01;
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            i = 1332225129;
        } else {
            AnonymousClass0aP r4 = this.A05;
            02m r3 = 02m.A0p;
            Integer num = this.A09;
            if (num != null) {
                r3.markerAnnotate(2293785, "login_type", C48972EnA.A00(num));
            }
            EI1 ei1 = new EI1(em4, this);
            if (182.A06(0Tu.A05, r4, 36311487471419935L)) {
                0nY.A00().ATE(ei1);
            } else {
                ei1.run();
            }
            i = 824890844;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00cc, code lost:
        if ((r4.getCause() instanceof java.lang.SecurityException) == false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ab, code lost:
        if (r3.isCheckpointRequired() != false) goto L_0x00eb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFail(X.C268654dm r26) {
        /*
            r25 = this;
            r0 = 1957365235(0x74ab05f3, float:1.0839886E32)
            int r7 = X.AnonymousClass0fD.A03(r0)
            r0 = r25
            android.app.Activity r1 = r0.A01
            if (r1 == 0) goto L_0x01b3
            boolean r2 = r1.isFinishing()
            if (r2 != 0) goto L_0x01b3
            boolean r2 = r1.isDestroyed()
            if (r2 != 0) goto L_0x01b3
            X.0aP r6 = r0.A05
            X.02m r8 = X.02m.A0p
            java.lang.Integer r5 = r0.A09
            r4 = 2293785(0x230019, float:3.214277E-39)
            if (r5 == 0) goto L_0x002d
            java.lang.String r3 = X.C48972EnA.A00(r5)
            java.lang.String r2 = "login_type"
            r8.markerAnnotate(r4, r2, r3)
        L_0x002d:
            r2 = 3
            r8.markerEnd(r4, r2)
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            if (r5 == r2) goto L_0x0038
            X.FGv.A02()
        L_0x0038:
            java.lang.String r2 = r0.A0B
            if (r2 == 0) goto L_0x0051
            X.FFx r8 = X.C49944FFx.A00
            X.DiE r2 = r0.A08
            if (r2 != 0) goto L_0x01af
            java.lang.String r2 = ""
        L_0x0044:
            java.lang.String r13 = "registration_flow"
            java.lang.String r14 = "ar_code_sms"
            java.lang.String r11 = "client_reg_invalid_login_response"
            java.lang.String r12 = "login failed during auto conf reg"
            r9 = r6
            r10 = r2
            r8.A04(r9, r10, r11, r12, r13, r14)
        L_0x0051:
            r14 = 0
            r20 = 0
            r22 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r18 = 0
            r24 = 0
            r8 = r26
            java.lang.Throwable r4 = r8.A01()
            boolean r15 = X.AnonymousClass7TF.A1V(r4)
            boolean r16 = X.C46413Dea.A09(r8)
            java.lang.Object r12 = r8.A00()
            r3 = r12
            X.1XP r3 = (X.1XP) r3
            boolean r2 = r8 instanceof X.C268674do
            if (r2 == 0) goto L_0x00ab
            if (r3 == 0) goto L_0x00ab
            boolean r22 = r3.isCheckpointRequired()
            java.lang.String r5 = "invalid_one_tap_nonce"
            boolean r21 = r3.hasErrorType(r5)
            java.lang.String r5 = "invalid_google_token_nonce"
            boolean r19 = r3.hasErrorType(r5)
            java.lang.String r5 = "bad_password"
            boolean r20 = r3.hasErrorType(r5)
            java.lang.String r5 = "invalid_user"
            boolean r18 = r3.hasErrorType(r5)
            java.lang.String r5 = "inactive user"
            boolean r17 = r3.hasErrorType(r5)
            java.lang.String r5 = "invalid_trusted_device"
            boolean r23 = r3.hasErrorType(r5)
            java.lang.String r5 = "unusable_password"
            boolean r24 = r3.hasErrorType(r5)
        L_0x00ab:
            X.F2t r13 = new X.F2t
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r9 = r13.toString()
            java.lang.String r5 = "LoginFailed"
            X.0KC.A0F(r5, r9, r4)
            boolean r5 = r13.A01
            if (r5 == 0) goto L_0x00f2
            if (r4 == 0) goto L_0x00ce
            java.lang.Throwable r0 = r4.getCause()
            if (r0 == 0) goto L_0x00ce
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = r0 instanceof java.lang.SecurityException
            r2 = 1
            if (r0 != 0) goto L_0x00cf
        L_0x00ce:
            r2 = 0
        L_0x00cf:
            r0 = 2131961740(0x7f13278c, float:1.9560185E38)
            java.lang.String r3 = r1.getString(r0)
            r0 = 2131968258(0x7f134102, float:1.9573406E38)
            if (r2 == 0) goto L_0x00de
            r0 = 2131972964(0x7f135364, float:1.958295E38)
        L_0x00de:
            java.lang.String r2 = r1.getString(r0)
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L_0x00eb
            X.C49952FGh.A06(r1, r2, r3)
        L_0x00eb:
            r0 = -1027700205(0xffffffffc2be8a13, float:-95.26968)
        L_0x00ee:
            X.AnonymousClass0fD.A0A(r0, r7)
            return
        L_0x00f2:
            X.G8H r9 = r0.A06
            if (r9 == 0) goto L_0x0137
            r4 = r12
            X.Dvv r4 = (X.C47361Dvv) r4
            if (r4 == 0) goto L_0x0137
            X.F19 r10 = r4.A01
            if (r10 == 0) goto L_0x0137
            boolean r5 = r13.A09
            if (r5 == 0) goto L_0x0137
            java.lang.String r1 = "two_factor_required"
            r0.A00 = r1
            java.lang.String r2 = r10.A01
            java.lang.String r1 = r10.A03
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0118
            X.FEz r0 = X.FFR.A02()
            r0.A02(r2, r1)
        L_0x0118:
            X.F19 r1 = r4.A01
            boolean r0 = r1.A09
            if (r0 == 0) goto L_0x0133
            java.lang.String r0 = r1.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0133
            X.FEz r2 = X.FFR.A02()
            X.F19 r0 = r4.A01
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r0.A04
            r2.A03(r1, r0)
        L_0x0133:
            r9.Dmd(r6, r4)
            goto L_0x00eb
        L_0x0137:
            if (r2 == 0) goto L_0x00ce
            boolean r2 = r13.A03
            if (r2 != 0) goto L_0x01a7
            boolean r2 = r13.A06
            if (r2 != 0) goto L_0x01a7
            boolean r2 = r13.A05
            if (r2 != 0) goto L_0x01a7
            r3 = r12
            X.EM4 r3 = (X.EM4) r3
            java.lang.String r11 = r3.A04
            boolean r2 = r13.A02
            if (r2 == 0) goto L_0x0168
            if (r9 == 0) goto L_0x0168
            if (r12 == 0) goto L_0x0177
            boolean r2 = r3.A0D
            if (r2 != 0) goto L_0x0177
        L_0x0156:
            java.lang.String r0 = r0.A0A
            r14 = r1
            r15 = r6
            r16 = r13
            r17 = r3
            r18 = r9
            r19 = r0
            r20 = r11
            X.F6O.A01(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x00eb
        L_0x0168:
            boolean r2 = r13.A07
            if (r2 == 0) goto L_0x0156
            java.lang.String r1 = r13.toString()
            java.lang.String r0 = "Trusted device login"
            X.0wb.A03(r0, r1)
            goto L_0x00eb
        L_0x0177:
            r1 = 0
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r10.<init>(r1)
            android.os.Handler r6 = r0.A02
            X.Fvi r5 = new X.Fvi
            r14 = r5
            r15 = r8
            r16 = r13
            r17 = r0
            r18 = r11
            r19 = r10
            r14.<init>(r15, r16, r17, r18, r19)
            long r1 = android.os.SystemClock.uptimeMillis()
            r3 = 150(0x96, double:7.4E-322)
            long r1 = r1 + r3
            r6.postAtTime(r5, r10, r1)
            X.F2Z r1 = new X.F2Z
            r2 = r8
            r3 = r13
            r4 = r0
            r5 = r11
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r9.DPh(r1)
            goto L_0x00eb
        L_0x01a7:
            boolean r0 = r3.isCheckpointRequired()
            if (r0 == 0) goto L_0x00ce
            goto L_0x00eb
        L_0x01af:
            java.lang.String r2 = r2.A01
            goto L_0x0044
        L_0x01b3:
            r0 = -1245479346(0xffffffffb5c37e4e, float:-1.4565392E-6)
            goto L_0x00ee
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47695EDe.onFail(X.4dm):void");
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass0fD.A0A(-151875483, A00(this, obj, -1616027747));
    }

    public C47695EDe(Activity activity, Uri uri, AnonymousClass0iw r16, AnonymousClass0aP r17, G8H g8h, C46634DiE diE, Integer num, String str) {
        this(activity, uri, r16, r17, g8h, (C48259Ebe) null, diE, num, str, (String) null, (String) null, (EWC) null);
    }
}
