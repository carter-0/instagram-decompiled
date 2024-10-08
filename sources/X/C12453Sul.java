package X;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.Sul  reason: case insensitive filesystem */
public final class C12453Sul implements C13783Tgy {
    public static final Set A04;
    public C11330SNj A00;
    public final Bundle A01;
    public final QD2 A02;
    public final QDE A03;

    public static void A00(C12453Sul sul, C10257RpH rpH) {
        Bundle bundle;
        String str;
        String str2;
        String str3 = rpH.A00;
        if ("ACTIVE".equalsIgnoreCase(str3) || "DISABLED".equalsIgnoreCase(str3)) {
            bundle = sul.A01;
            SQ8.A03("VERIFY_PIN", bundle);
            str = "verify_pin_display";
        } else if ("LOCKED".equalsIgnoreCase(str3)) {
            bundle = sul.A01;
            String A002 = SQ8.A00(bundle, 1);
            if ("VERIFY_PIN_TO_PAY".equalsIgnoreCase(A002)) {
                str2 = "LOCKED_PIN_RECOVER_WITH_PASSWORD_TO_PAY";
            } else {
                if ("VERIFY_PIN_TO_DISABLE_BIO_HUB".equalsIgnoreCase(A002) || "VERIFY_PIN_TO_DISABLE_PIN_HUB".equalsIgnoreCase(A002) || "VERIFY_PIN_TO_ENABLE_BIO_HUB".equalsIgnoreCase(A002) || "VERIFY_PIN_TO_ENABLE_PIN_HUB".equalsIgnoreCase(A002)) {
                    str2 = "LOCKED_PIN_RECOVER_WITH_PASSWORD_HUB";
                }
                bundle.putBoolean("AUTH_FLOW_UTIL_PIN_LOCKED", true);
                SQ8.A03("RECOVER_PIN", bundle);
                str = "forget_pin_display";
            }
            SQ8.A02(str2, bundle);
            bundle.putBoolean("AUTH_FLOW_UTIL_PIN_LOCKED", true);
            SQ8.A03("RECOVER_PIN", bundle);
            str = "forget_pin_display";
        } else if ("DELETED".equalsIgnoreCase(str3)) {
            bundle = sul.A01;
            SQ8.A03("CREATE_PIN", bundle);
            String[] strArr = {"CREATE_AUTH_TICKET_BASED_FACTOR"};
            HashSet A1F = AnonymousClass7TE.A1F();
            String[] stringArray = bundle.getStringArray("PTT_UTIL_CAP_NAMES");
            if (stringArray != null) {
                Collections.addAll(A1F, stringArray);
            }
            Collections.addAll(A1F, strArr);
            bundle.putStringArray("PTT_UTIL_CAP_NAMES", Pxf.A1b(A1F, 0));
            AnonymousClass2E0.A0D();
            bundle.putBoolean("AUTH_FLOW_UTIL_ASKED_FOR_BIO_SETUP", false);
            str = "create_pin_display";
        } else {
            throw AnonymousClass7TE.A15("Should not be called");
        }
        bundle.putString("FBPAY_AUTH_STEP_SCREEN_DISPLAY_LOG", str);
        SR4.A02(sul.A02.A00, new AnonymousClass34S("AUTH_EDIT_TEXT_SCREEN", Pxe.A0J(bundle)));
    }

    public final C11330SNj BLL() {
        return this.A00;
    }

    public final void DG8(Bundle bundle, C11330SNj sNj) {
        Object obj;
        AnonymousClass2Fj r1;
        String str;
        String str2;
        String str3;
        Bundle bundle2 = this.A01;
        if (!TextUtils.isEmpty(SQ8.A00(bundle2, 2))) {
            String A012 = SQ8.A01(bundle2, 2);
            str = "AUTH_EDIT_TEXT_SCREEN";
            if ("RECOVER_PIN".equalsIgnoreCase(A012)) {
                Pxi.A0x(bundle2, "AUTH_FLOW_UTIL_AUTH_STEP", "CREATE_PIN", 2);
                bundle.getClass();
                bundle2.putString("AUTH_FLOW_UTIL_PASSWORD_ENTERED", DbU.A0l(bundle, "AUTH_FLOW_UTIL_PASSWORD_ENTERED"));
                str2 = "reset_pin_screen_display";
            } else if ("CREATE_PIN".equalsIgnoreCase(A012)) {
                bundle.getClass();
                bundle2.putString("AUTH_FLOW_UTIL_PIN_ENTERED", DbU.A0l(bundle, "AUTH_FLOW_UTIL_PIN_ENTERED"));
                Pxi.A0x(bundle2, "AUTH_FLOW_UTIL_AUTH_STEP", "CONFIRM_PIN", 2);
                str2 = "reset_pin_confirm_display";
            } else if ("CONFIRM_PIN".equalsIgnoreCase(A012)) {
                sNj.getClass();
                r1 = this.A02.A02;
                obj = new AnonymousClass34S(sNj, (Object) null);
                SR4.A02(r1, obj);
                return;
            } else {
                return;
            }
        } else {
            String A013 = SQ8.A01(bundle2, 1);
            A013.getClass();
            str = "AUTH_EDIT_TEXT_SCREEN";
            if (A013.equalsIgnoreCase("CREATE_PIN")) {
                bundle.getClass();
                bundle2.putString("AUTH_FLOW_UTIL_PIN_ENTERED", DbU.A0l(bundle, "AUTH_FLOW_UTIL_PIN_ENTERED"));
                SQ8.A03("CONFIRM_PIN", bundle2);
                str2 = "confirm_pin_display";
            } else if (A013.equalsIgnoreCase("CONFIRM_PIN") || "CONFIRM_PIN".equalsIgnoreCase(SQ8.A01(bundle2, 2))) {
                sNj.getClass();
                AnonymousClass2E0.A0D();
                r1 = this.A02.A02;
                obj = new AnonymousClass34S(sNj, (Object) null);
                SR4.A02(r1, obj);
                return;
            } else {
                str2 = "reset_pin_screen_display";
                if (A013.equalsIgnoreCase("VERIFY_PIN")) {
                    if (sNj != null) {
                        if ("CHANGE_PIN_USING_OLD_PIN".equalsIgnoreCase(SQ8.A00(bundle2, 1))) {
                            this.A00 = sNj;
                            String[] strArr = {sNj.A02};
                            HashSet A1F = AnonymousClass7TE.A1F();
                            String[] stringArray = bundle2.getStringArray("PTT_UTIL_AUTH_AT_ALIASES");
                            if (stringArray != null) {
                                Collections.addAll(A1F, stringArray);
                            }
                            Collections.addAll(A1F, strArr);
                            bundle2.putStringArray("PTT_UTIL_AUTH_AT_ALIASES", Pxf.A1b(A1F, 0));
                            SQ8.A03("CREATE_PIN", bundle2);
                            bundle2.putString("FBPAY_AUTH_STEP_SCREEN_DISPLAY_LOG", str2);
                            ArrayList A1C = AnonymousClass7TE.A1C();
                            String[] stringArray2 = bundle2.getStringArray("PTT_UTIL_CAP_NAMES");
                            if (stringArray2 != null) {
                                Collections.addAll(A1C, stringArray2);
                            }
                            A1C.remove("RESET_FBPAY_PIN");
                            bundle2.putStringArray("PTT_UTIL_CAP_NAMES", Pxf.A1a(A1C, 0));
                            String[] strArr2 = {"CREATE_FBPAY_PIN"};
                            HashSet A1F2 = AnonymousClass7TE.A1F();
                            String[] stringArray3 = bundle2.getStringArray("PTT_UTIL_CAP_NAMES");
                            if (stringArray3 != null) {
                                Collections.addAll(A1F2, stringArray3);
                            }
                            Collections.addAll(A1F2, strArr2);
                            bundle2.putStringArray("PTT_UTIL_CAP_NAMES", Pxf.A1b(A1F2, 0));
                            SR4.A02(this.A02.A00, new AnonymousClass34S(str, Pxe.A0J(bundle2)));
                        }
                        r1 = this.A02.A02;
                        obj = new AnonymousClass34S(sNj, (Object) null);
                        SR4.A02(r1, obj);
                        return;
                    }
                    str2 = "forget_pin_display";
                    if (bundle != null) {
                        if (bundle.getBoolean("AUTH_FLOW_UTIL_PIN_LOCKED")) {
                            if (!A04.contains(SQ8.A00(bundle2, 1))) {
                                bundle2.putBoolean("AUTH_FLOW_UTIL_PIN_LOCKED", true);
                                str3 = "PIN_LOCKED";
                            } else {
                                QD2 qd2 = this.A02;
                                obj = new RuntimeException();
                                r1 = qd2.A01;
                                SR4.A02(r1, obj);
                                return;
                            }
                        } else if (bundle.getBoolean("AUTH_FLOW_UTIL_PIN_FORGOT")) {
                            bundle2.putBoolean("AUTH_FLOW_UTIL_PIN_FORGOT", true);
                            str3 = "FORGOT_PIN";
                        } else {
                            return;
                        }
                        bundle2.putString(002.A0b("AUTH_FLOW_UTIL_AUTH_FLOW", "#", 2), str3);
                        bundle2.putString(002.A0b("AUTH_FLOW_UTIL_AUTH_STEP", "#", 2), "RECOVER_PIN");
                    } else {
                        return;
                    }
                } else if (A013.equalsIgnoreCase("RECOVER_PIN")) {
                    SQ8.A03("CREATE_PIN", bundle2);
                    bundle.getClass();
                    bundle2.putString("AUTH_FLOW_UTIL_PASSWORD_ENTERED", DbU.A0l(bundle, "AUTH_FLOW_UTIL_PASSWORD_ENTERED"));
                } else {
                    return;
                }
            }
        }
        bundle2.putString("FBPAY_AUTH_STEP_SCREEN_DISPLAY_LOG", str2);
        SR4.A02(this.A02.A00, new AnonymousClass34S(str, Pxe.A0J(bundle2)));
    }

    public final void DG9(Throwable th) {
        throw AnonymousClass7TE.A15(C273654mx.A00(60));
    }

    static {
        HashSet A1F = AnonymousClass7TE.A1F();
        A1F.add("CONNECT_FROM_CHECKOUT_PIN_VERIFICATION");
        A1F.add("CONNECT_FROM_CHECKOUT_CVV_VERIFICATION");
        A1F.add("CONNECT_FROM_CHECKOUT_PAYPAL_VERIFICATION");
        A1F.add("CONNECT_FROM_HUB_PIN_VERIFICATION");
        A1F.add("CONNECT_FROM_HUB_CVV_VERIFICATION");
        A1F.add("CONNECT_FROM_HUB_PAYPAL_VERIFICATION");
        A04 = Collections.unmodifiableSet(A1F);
    }

    public C12453Sul(Bundle bundle, QDE qde, QD2 qd2) {
        this.A02 = qd2;
        this.A03 = qde;
        Bundle A0J = Pxe.A0J(bundle);
        this.A01 = A0J;
        if (!A04.contains(SQ8.A00(A0J, 1))) {
            SUj.A0H(qd2.A03.A01(), C11652Sdu.A00(this, 6));
            return;
        }
        A0J.putBoolean("AUTH_FLOW_UTIL_PIN_FORGOT_VISIBLE", false);
        A00(this, new C10257RpH("ACTIVE"));
    }
}
