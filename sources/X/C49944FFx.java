package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.FFx  reason: case insensitive filesystem */
public final class C49944FFx {
    public static final C49944FFx A00 = new Object();

    public final void A03(0lg r13, String str, String str2, String str3) {
        AnonymousClass7TF.A1H(r13, str);
        A00(r13, false, str, str2, str3, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
    }

    public final void A04(0lg r13, String str, String str2, String str3, String str4, String str5) {
        AnonymousClass7TF.A1H(r13, str);
        A00(r13, false, str, str2, str3, str4, str5, (String) null, (String) null, (String) null, (String) null);
    }

    public static final void A01(0lg r6, String str, String str2, String str3, String str4) {
        A00(r6, Boolean.FALSE, str, str2, (String) null, str3, str4, (String) null, (String) null, (String) null, (String) null);
    }

    public static final void A00(0lg r5, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        AnonymousClass7TG.A1N(r5, str);
        double A01 = DbS.A01();
        double A002 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r5), "ig_autoconf_account_recovery");
        DbW.A11(A0e);
        DbY.A1D(A0e, A01, A002);
        DbW.A12(A0e, A002);
        DbS.A1H(A0e, str);
        A0e.AAJ(TraceFieldType.AdhocEventName, str2);
        A0e.AAJ("event_info", str3);
        A0e.AAJ("exception_message", str6);
        A0e.AAJ(Pxd.A00(86), str7);
        A0e.AAJ(TraceFieldType.FailureReason, str8);
        A0e.AAJ("flow_type", str4);
        DbS.A1G(A0e, str5);
        A0e.AAJ(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str9);
        A0e.A7p("is_caa", bool);
        A0e.Cgf();
    }

    public final void A02(0lg r2, String str, String str2) {
        AnonymousClass7TG.A1N(r2, str);
        A01(r2, str, str2, (String) null, (String) null);
    }
}
