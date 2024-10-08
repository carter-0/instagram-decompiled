package X;

import com.facebook.proxygen.TraceFieldType;
import com.google.android.gms.common.api.Status;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.FGl  reason: case insensitive filesystem */
public final class C49956FGl {
    public static final C49956FGl A00 = new Object();

    public static final void A00(Status status, 0lg r7, String str, int i, boolean z) {
        Boolean bool;
        Long l;
        Boolean bool2;
        Boolean bool3;
        double A002 = DbV.A00(r7, 0);
        double A003 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r7), "ig_android_smart_lock_account_dialog_displayed");
        DbZ.A1H(A0e, A002, A003);
        FH8.A0E(A0e, "step", str);
        Boolean bool4 = null;
        String str2 = null;
        DbS.A1G(A0e, (String) null);
        A0e.A7p("has_status", Boolean.valueOf(AnonymousClass7TF.A1V(status)));
        if (status != null) {
            bool = Boolean.valueOf(AnonymousClass7TF.A1V(status.A01));
        } else {
            bool = null;
        }
        A0e.A7p("has_resolution", bool);
        if (status != null) {
            l = DbS.A0j(status.A00);
        } else {
            l = null;
        }
        A0e.A9F(TraceFieldType.StatusCode, l);
        if (status != null) {
            str2 = status.A03;
        }
        A0e.AAJ(TraceFieldType.StatusMessage, str2);
        if (status != null) {
            bool2 = Boolean.valueOf(AnonymousClass7TF.A1S(status.A00, 16));
        } else {
            bool2 = null;
        }
        A0e.A7p("status_is_cancelled", bool2);
        if (status != null) {
            bool3 = Boolean.valueOf(Dba.A1U(status.A00));
        } else {
            bool3 = null;
        }
        A0e.A7p("status_is_success", bool3);
        if (status != null) {
            bool4 = Boolean.valueOf(AnonymousClass7TF.A1S(status.A00, 14));
        }
        A0e.A7p("status_is_interrupted", bool4);
        A0e.A9F("num_one_tap_accounts", DbS.A0j(i));
        DbW.A10(A0e);
        A0e.A7p("is_auto_login_enable", Boolean.valueOf(z));
        A0e.Cgf();
    }

    public final void A06(Status status, 0lg r7, String str, String str2, String str3, int i, boolean z) {
        0qQ.A0B(r7, 0);
        long currentTimeMillis = System.currentTimeMillis();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r7), "ig_android_smart_lock_error");
        DbZ.A1E(A0e);
        DbY.A1E(A0e, currentTimeMillis, 1Q0.A00());
        DbW.A12(A0e, DbS.A00());
        DbS.A1H(A0e, str);
        DbY.A1A(A0e);
        DbS.A1J(A0e, str2);
        A0e.A9F("num_one_tap_accounts", DbV.A0p(A0e, "error", str3, i));
        A0e.A7p("is_auto_login_enable", Boolean.valueOf(z));
        A0e.A7p("has_status", Boolean.valueOf(AnonymousClass7TF.A1V(status)));
        if (status != null) {
            A0e.A7p("has_resolution", Boolean.valueOf(AnonymousClass7TF.A1V(status.A01)));
            int i2 = status.A00;
            A0e.A9F(TraceFieldType.StatusCode, DbS.A0j(i2));
            A0e.AAJ(TraceFieldType.StatusMessage, status.A03);
            A0e.A7p("status_is_cancelled", Boolean.valueOf(AnonymousClass7TF.A1S(i2, 16)));
            A0e.A7p("status_is_success", Boolean.valueOf(Dba.A1U(i2)));
            A0e.A7p("status_is_interrupted", Boolean.valueOf(AnonymousClass7TF.A1S(i2, 14)));
        }
        A0e.Cgf();
    }

    public static final void A01(0lg r6, String str) {
        double A01 = DbS.A01();
        double A002 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r6), "ig_android_smart_lock_account_dialog_dismissed");
        DbZ.A1H(A0e, A01, A002);
        FH8.A0E(A0e, "step", str);
        DbW.A10(A0e);
        DbS.A1G(A0e, (String) null);
        A0e.Cgf();
    }

    public static final void A02(0lg r6, String str) {
        double A01 = DbS.A01();
        double A002 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r6), "ig_android_smart_lock_dialog_account_selected");
        DbZ.A1H(A0e, A01, A002);
        FH8.A0E(A0e, "step", str);
        DbW.A10(A0e);
        A0e.Cgf();
    }

    public static final void A03(0lg r6, String str) {
        double A01 = DbS.A01();
        double A002 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r6), "ig_android_smart_lock_dialog_no_account_selected");
        DbZ.A1H(A0e, A01, A002);
        FH8.A0E(A0e, "step", str);
        DbW.A10(A0e);
        DbS.A1G(A0e, (String) null);
        A0e.Cgf();
    }

    public static final void A04(0lg r4, String str, String str2, String str3) {
        long currentTimeMillis = System.currentTimeMillis();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r4), "ig_android_smart_lock_error");
        DbZ.A1E(A0e);
        DbY.A1E(A0e, currentTimeMillis, 1Q0.A00());
        DbW.A12(A0e, DbS.A00());
        DbS.A1H(A0e, str);
        DbY.A1A(A0e);
        DbS.A1J(A0e, str2);
        A0e.AAJ("error", str3);
        A0e.Cgf();
    }

    public static final void A05(0lg r5, String str, String str2, boolean z, boolean z2) {
        long currentTimeMillis = System.currentTimeMillis();
        long A002 = 1Q0.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r5), "ig_android_smart_lock_save_password");
        DbZ.A1E(A0e);
        DbY.A1E(A0e, currentTimeMillis, A002);
        DbW.A12(A0e, (double) A002);
        DbS.A1H(A0e, str);
        DbY.A1A(A0e);
        A0e.A7p(RealtimeConstants.SEND_SUCCESS, Boolean.valueOf(z));
        A0e.A7p(C66579MXk.A00(755), Boolean.valueOf(z2));
        if (str2 != null) {
            A0e.AAJ("error", str2);
        }
        A0e.Cgf();
    }
}
