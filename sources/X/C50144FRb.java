package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.nux.activity.SignedOutFragmentActivity;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.FRb  reason: case insensitive filesystem */
public abstract class C50144FRb implements CallerContextable {
    public static final String __redex_internal_original_name = "CreateAccountUtil";

    public static void A02(Handler handler, AnonymousClass4DH r20, AnonymousClass0iw r21, AnonymousClass0aP r22, G67 g67, G69 g69, RegFlowExtras regFlowExtras, EEK eek, C46634DiE diE, String str, String str2, boolean z) {
        String str3;
        RegFlowExtras regFlowExtras2 = regFlowExtras;
        EXD A01 = regFlowExtras2.A01();
        double A00 = DbS.A00();
        double A012 = DbS.A01();
        AnonymousClass0aP r8 = r22;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r8), "register_with_ci_option");
        DbZ.A1G(A0e, A012, A00);
        A0e.A7p("is_opted_in", Boolean.valueOf(regFlowExtras2.A0h));
        DbW.A12(A0e, A00);
        DbZ.A1J(A0e, diE.A01);
        boolean z2 = true;
        String str4 = str2;
        A0e.A7p("username_suggestion_avail", Boolean.valueOf(AnonymousClass7TF.A1V(str4)));
        String str5 = str;
        if (str2 == null || str4.equals(str5)) {
            z2 = false;
        }
        A0e.A7p("username_suggestion_changed_by_user", Boolean.valueOf(z2));
        if (A01 != null) {
            DbS.A1G(A0e, A01.A00);
        }
        FH8.A05(A0e);
        A0e.Cgf();
        Handler handler2 = handler;
        AnonymousClass4DH r3 = r20;
        AnonymousClass0iw r222 = r21;
        G69 g692 = g69;
        if (A01 != EXD.A04) {
            02m.A0p.markerPoint(4197923, "queue_signup_runnable");
            handler2.post(new C51552Fvy(handler2, r3, r222, r8, g67, g692, regFlowExtras2, str5, z));
            return;
        }
        Context requireContext = r3.requireContext();
        if (regFlowExtras2.A09 == null || !1AW.A06(0Tu.A05, 2324139969326612992L)) {
            str3 = null;
        } else {
            str3 = regFlowExtras2.A09;
        }
        1OC A0B = FHA.A0B(r8, (Boolean) null, str5, str3, regFlowExtras2.A07, regFlowExtras2.A06, 0qv.A00(requireContext), DbT.A0s(requireContext), (String) null, false, false, regFlowExtras2.A0h, regFlowExtras2.A0r, regFlowExtras2.A0m);
        Context requireContext2 = r3.requireContext();
        CallerContext callerContext = EEM.A0B;
        A0B.A00 = new C47669ECd(requireContext2, handler2, r3, r222, r8, g692, regFlowExtras2, eek);
        r3.schedule(A0B);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r3.A0l != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(android.os.Handler r25, X.AnonymousClass4DH r26, X.AnonymousClass0iw r27, X.AnonymousClass0aP r28, X.G67 r29, X.G69 r30, com.instagram.registration.model.RegFlowExtras r31, java.lang.Integer r32, boolean r33) {
        /*
            r0 = 1
            java.util.concurrent.atomic.AtomicInteger r4 = new java.util.concurrent.atomic.AtomicInteger
            r4.<init>(r0)
            r3 = r31
            X.EXD r18 = r3.A01()
            r18.getClass()
            X.02m r11 = X.02m.A0p
            boolean r0 = r3.A0k
            if (r0 == 0) goto L_0x001b
            boolean r0 = r3.A0l
            r24 = 1
            if (r0 == 0) goto L_0x001d
        L_0x001b:
            r24 = 0
        L_0x001d:
            java.lang.String r2 = r3.A04
            android.os.Parcel r1 = android.os.Parcel.obtain()
            r0 = 0
            r3.writeToParcel(r1, r0)
            r1.setDataPosition(r0)
            android.os.Parcelable$Creator r0 = com.instagram.registration.model.RegFlowExtras.CREATOR
            java.lang.Object r0 = r0.createFromParcel(r1)
            com.instagram.registration.model.RegFlowExtras r0 = (com.instagram.registration.model.RegFlowExtras) r0
            r1.recycle()
            X.EQ2 r6 = new X.EQ2
            r7 = r25
            r8 = r26
            r10 = r27
            r12 = r28
            r14 = r29
            r15 = r30
            r5 = r32
            r25 = r33
            r9 = r8
            r13 = r12
            r19 = r18
            r20 = r5
            r21 = r5
            r22 = r2
            r23 = r4
            r17 = r3
            r16 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            X.Fkp r0 = new X.Fkp
            r0.<init>(r4)
            r6.A01 = r0
            X.Fkr r0 = new X.Fkr
            r13 = r0
            r14 = r8
            r15 = r12
            r16 = r6
            r19 = r5
            r20 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r6.A02 = r0
            r1 = 4197923(0x400e23, float:5.882543E-39)
            java.lang.String r0 = "start_account_creation_request"
            r11.markerPoint(r1, r0)
            A05(r8, r12, r6, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50144FRb.A03(android.os.Handler, X.4DH, X.0iw, X.0aP, X.G67, X.G69, com.instagram.registration.model.RegFlowExtras, java.lang.Integer, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.0Js] */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object, X.0Js] */
    public static void A05(AnonymousClass4DH r11, AnonymousClass0aP r12, C47698EDh eDh, RegFlowExtras regFlowExtras, Integer num) {
        String A0R;
        String str;
        RegFlowExtras regFlowExtras2 = regFlowExtras;
        AnonymousClass4DH r5 = r11;
        AnonymousClass0aP r6 = r12;
        C47698EDh eDh2 = eDh;
        if (A07(regFlowExtras)) {
            AnonymousClass7TG.A1N(r12, r11);
            String str2 = regFlowExtras.A0J;
            C49600EzJ ezJ = new C49600EzJ(r11, eDh, r12, regFlowExtras);
            if (str2 == null || !09i.A0A.A0A(new Object(), (0Jv) null, ezJ, str2)) {
                A0R = 002.A0R("Failed to add create secondary account operation in non-linking simple SAC. Last logged-in userid is: ", str2);
                str = "SecondaryAccountApi";
            } else {
                return;
            }
        } else {
            String str3 = regFlowExtras.A0J;
            Integer num2 = num;
            if (EXD.SAC == regFlowExtras.A01() && str3 != null) {
                F0S f0s = new F0S(r5, r6, eDh2, regFlowExtras2, num2, str3);
                if (!09i.A0A.A0A(new Object(), (0Jv) null, f0s, str3)) {
                    A0R = 002.A0R("Failed to add create secondary account operation in non linking SAC. The last logged in account id is: ", str3);
                    str = __redex_internal_original_name;
                } else {
                    return;
                }
            } else if (182.A06(0Tu.A05, r12, 36311487471551009L)) {
                0nY.A00().ATE(new EIG(r5, r6, eDh2, regFlowExtras2, num2));
                return;
            } else {
                1OC A00 = C49107EpW.A00(r11.requireContext(), r12, regFlowExtras2, num, (String) null, (String) null);
                A00.A00 = eDh2;
                r5.schedule(A00);
                return;
            }
        }
        0wb.A03(str, A0R);
    }

    public static Integer A00() {
        for (Integer num : AnonymousClass05K.A00(3)) {
            if (0qQ.A0K(C49108EpX.A00(num), NetInfoModule.CONNECTION_TYPE_NONE)) {
                return num;
            }
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append('\'');
        A1A.append(NetInfoModule.CONNECTION_TYPE_NONE);
        throw AnonymousClass7TE.A0w(AnonymousClass7TF.A0l("' is not a valid retry strategy name.", A1A));
    }

    public static void A06(UserSession userSession) {
        if (182.A06(0Tu.A06, userSession, 36330097564860873L)) {
            1Av A00 = 1Au.A00(userSession);
            long currentTimeMillis = System.currentTimeMillis();
            0xY A0p = AnonymousClass7TE.A0p(A00);
            A0p.E5c("nux_started_timestamp", currentTimeMillis);
            A0p.apply();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r4.A0J == null) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A07(com.instagram.registration.model.RegFlowExtras r4) {
        /*
            boolean r0 = r4.A0u
            r3 = 1
            if (r0 == 0) goto L_0x000a
            java.lang.String r0 = r4.A0J
            r2 = 1
            if (r0 != 0) goto L_0x000b
        L_0x000a:
            r2 = 0
        L_0x000b:
            X.EXD r1 = X.EXD.SAC
            X.EXD r0 = r4.A01()
            if (r1 != r0) goto L_0x0016
            if (r2 == 0) goto L_0x0016
            return r3
        L_0x0016:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50144FRb.A07(com.instagram.registration.model.RegFlowExtras):boolean");
    }

    public static Integer A01(RegFlowExtras regFlowExtras) {
        EXD A01 = regFlowExtras.A01();
        EXD exd = EXD.SAC;
        if (A01 == exd) {
            if (regFlowExtras.A0t && regFlowExtras.A0y) {
                return AnonymousClass05K.A0j;
            }
            if (A07(regFlowExtras)) {
                return AnonymousClass05K.A0N;
            }
        }
        if (A01 == EXD.PHONE || (A01 == exd && regFlowExtras.A02() == AnonymousClass05K.A01)) {
            return AnonymousClass05K.A01;
        }
        if (A01 != EXD.A03) {
            if (A01 != exd) {
                return AnonymousClass05K.A0u;
            }
            if (regFlowExtras.A02() != AnonymousClass05K.A00) {
                return AnonymousClass05K.A0C;
            }
        }
        return AnonymousClass05K.A00;
    }

    public static void A04(Fragment fragment, AnonymousClass0iw r12, EXD exd, Integer num, Integer num2, String str) {
        FragmentActivity requireActivity = fragment.requireActivity();
        Bundle A0C = DbX.A0C(str);
        A0C.putBoolean("IS_SIGN_UP_FLOW", true);
        UserSession A0U = DbS.A0U(A0C);
        if (requireActivity instanceof G53) {
            ((SignedOutFragmentActivity) ((G53) requireActivity)).A0A = true;
        }
        AnonymousClass3FH.A02(AnonymousClass05K.A1F);
        C49843F9i.A00 = null;
        C49913FEl.A02(requireActivity);
        double A01 = DbS.A01();
        double A00 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(A0U), "ig_nux_started");
        DbT.A1P(A0e);
        DbZ.A1G(A0e, A01, A00);
        EXD exd2 = exd;
        DbS.A1G(A0e, exd.A00);
        A0e.A7p("from_server", true);
        FH8.A05(A0e);
        DbZ.A1F(A0e, A00);
        FH8.A0C(A0e, A0U);
        A06(A0U);
        1ES.A03(C49026Eo2.A00(requireActivity, A0U, AnonymousClass1G3.A03()));
        AnonymousClass35B.A00().A03(requireActivity, A0U, new C50635Ffu(requireActivity, r12, A0U, exd2), exd2, num, num2, false, false);
        02m.A0p.markerEnd(4197923, 2);
    }
}
