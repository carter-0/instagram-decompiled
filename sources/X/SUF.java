package X;

import com.google.gson.Gson;
import java.util.List;

public abstract class SUF {
    public String A00;
    public final Gson A01 = new Gson();

    /* JADX WARNING: type inference failed for: r0v2, types: [X.0iw, java.lang.Object] */
    public final 0wc A0C() {
        return AnonymousClass0kN.A01(new Object(), ((QKY) this).A03);
    }

    public static final 2M7 A03(SUF suf) {
        try {
            return 2M7.valueOf(AnonymousClass7TF.A0k(suf.A00));
        } catch (Exception unused) {
            1Kn.A02("CheckoutShopifySDKLogger", 002.A0R("tryCastPaymentType with invalid paymentType: ", suf.A00));
            return 2M7.A0K;
        }
    }

    public static final String A04(SUF suf) {
        if (0qQ.A0K(suf.A00, 2M7.A0G.toString())) {
            return "lite_checkout";
        }
        return "checkout";
    }

    public static final String A05(SUF suf, String str) {
        if (0qQ.A0K(suf.A00, 2M7.A0G.toString())) {
            str = ((QKY) suf).A02;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.0SC, java.lang.Object] */
    public static final String A06(String str) {
        String A002 = new Object().A03(0cp.A03(str), 0SD.A04).A00();
        0qQ.A07(A002);
        return A002;
    }

    public static final List A07(long j) {
        if (j == 0) {
            return null;
        }
        return AnonymousClass7TE.A1I(Long.valueOf(j));
    }

    public final void A0D(String str) {
        0qQ.A0B(str, 0);
        0wj.A01.AEf(002.A0g(str, " - cspVersion: ", "2024-10"), 37366537).report();
    }

    public final void A0E(String str, long j, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass7TG.A0w(1, str2, str3, str4);
        0qQ.A0B(str5, 5);
        0Aj A0e = AnonymousClass7TE.A0e(A0C(), "client_load_metacheckoutsdk_fail");
        if (A0e.isSampled()) {
            A0e.AAJ(Pxz.A00(9, 10, 87), str2);
            Pxh.A18(A03(this), A0e);
            0bb r4 = new 0bb();
            A09(r4, this, "on_error");
            Pxi.A1B(A0e, r4, DbY.A0q("shopify_sdk_payload", str4, AnonymousClass7TE.A1L("csp_version", "2024-10"), A08(str3)));
            A0e.AAJ("error_message", str4);
            0bb r1 = new 0bb();
            A0B(r1, str6, str, j);
            QKY qky = (QKY) this;
            QKY.A01(r1, qky);
            A0A(r1, this, qky.A01, str);
            Pxj.A1D(A0e, r1, str5);
        }
    }

    public SUF(String str) {
        this.A00 = str;
    }

    public static 0Aj A02(SUF suf) {
        0wc A0C = suf.A0C();
        return A0C.A00(A0C.A00, "client_load_metacheckoutsdk_success");
    }

    public static 0eP A08(String str) {
        return new 0eP("checkout_url", A06(str));
    }

    public static void A09(0bb r2, SUF suf, String str) {
        r2.A06("target_name", str);
        r2.A06("view_name", A04(suf));
    }

    public static void A0A(0bb r2, SUF suf, String str, String str2) {
        r2.A06("navigation_chain", str);
        r2.A06("external_session_id", A05(suf, str2));
    }

    public static void A0B(0bb r2, String str, String str2, long j) {
        r2.A07("seller_ids", A07(j));
        r2.A06("commerce_checkout_session_id", str);
        r2.A06("iaw_session_id", str2);
    }

    public final void A0F(String str, String str2, String str3, String str4, String str5, String str6, 0sm r15) {
        RIW riw;
        0Aj A0e = AnonymousClass7TE.A0e(A0C(), "shopify_onsite_sdk_webview_curl_performed");
        if (A0e.isSampled()) {
            try {
                RIZ valueOf = RIZ.valueOf(str4);
                if (str3 == null || str3.length() == 0) {
                    riw = RIW.CONNECT;
                } else {
                    riw = RIW.valueOf(AnonymousClass7TF.A0k(str3));
                }
                A0e.A8M(riw, "api_request_method");
                A0e.AAJ("api_endpoint", str2);
                if (str5 == null) {
                    str5 = "";
                }
                A0e.AAJ("request_body", str5);
                if (str == null) {
                    str = "";
                }
                A0e.AAJ("checkout_session_id", str);
                0eP A1L = AnonymousClass7TE.A1L("request_api_type", str4);
                0eP A1L2 = AnonymousClass7TE.A1L("headers", String.valueOf(r15));
                String str7 = str6;
                if (str6 == null) {
                    str7 = "";
                }
                A0e.A9H("extra_data", DbY.A0q(AnonymousClass000.A00(789), str7, A1L, A1L2));
                if (str6 == null) {
                    str6 = "";
                }
                A0e.AAJ("request_time_str", str6);
                if (r15 == null) {
                    r15 = 0Yt.A0E();
                }
                A0e.A9H("headers", r15);
                A0e.A8M(valueOf, "request_type");
                A0e.Cgf();
            } catch (Exception e) {
                A0D(AnonymousClass7TG.A0m(e, "CheckoutShopifySDKLogger unable to convert requestApiType to ShopifyOnsiteSDKWebviewRequestType ", AnonymousClass7TE.A1A()));
            }
        }
    }
}
