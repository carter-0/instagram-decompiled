package X;

import android.content.Context;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.fbpay.w3c.CardDetails;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.TTf  reason: case insensitive filesystem */
public final class C13286TTf extends 0Yg implements C62320sa {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ C55698Hlv A02;
    public final /* synthetic */ QK7 A03;
    public final /* synthetic */ C55824Ho7 A04;
    public final /* synthetic */ S7D A05;
    public final /* synthetic */ C10996S4q A06;
    public final /* synthetic */ C11290SJq A07;
    public final /* synthetic */ C11288SJh A08;
    public final /* synthetic */ AutofillData A09;
    public final /* synthetic */ CardDetails A0A;
    public final /* synthetic */ Integer A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ Map A0F;
    public final /* synthetic */ Map A0G;
    public final /* synthetic */ Set A0H;
    public final /* synthetic */ boolean A0I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13286TTf(Context context, Bundle bundle, C55698Hlv hlv, QK7 qk7, C55824Ho7 ho7, S7D s7d, C10996S4q s4q, C11290SJq sJq, C11288SJh sJh, AutofillData autofillData, CardDetails cardDetails, Integer num, String str, String str2, String str3, Map map, Map map2, Set set, boolean z) {
        super(0);
        this.A08 = sJh;
        this.A0B = num;
        this.A03 = qk7;
        this.A06 = s4q;
        this.A0G = map;
        this.A0I = z;
        this.A09 = autofillData;
        this.A0C = str;
        this.A0A = cardDetails;
        this.A0E = str2;
        this.A00 = context;
        this.A04 = ho7;
        this.A02 = hlv;
        this.A05 = s7d;
        this.A07 = sJq;
        this.A0F = map2;
        this.A0H = set;
        this.A0D = str3;
        this.A01 = bundle;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        C11288SJh sJh = this.A08;
        Integer num = this.A0B;
        Map map = null;
        sJh.A02(num, (Long) null, "BloksBottomSheetShowInMainThreadStart", 772805755);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        BitSet A0w = DbS.A0w(9);
        QK7 qk7 = this.A03;
        C10996S4q s4q = this.A06;
        Map A002 = SJP.A00(s4q);
        0qQ.A0C(A002, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, java.lang.Object>");
        0qQ.A0B(A002, 0);
        A1H.put("settings", A002);
        A0w.set(8);
        Pxi.A1H("logging_metadata", this.A0G, A0w, A1H);
        if (this.A0I) {
            str = "add_new_card";
        } else {
            str = "opt_in";
        }
        A1H.put("payment_save_action_type", str);
        A0w.set(7);
        AutofillData autofillData = this.A09;
        if (autofillData != null) {
            map = C11384SQx.A02(autofillData);
        }
        A1H.put("contact_info", map);
        0eP A1L = AnonymousClass7TE.A1L("billing_country", Locale.getDefault().getCountry());
        String str2 = this.A0C;
        0eP A1L2 = AnonymousClass7TE.A1L("card_number", str2);
        CardDetails cardDetails = this.A0A;
        Object obj5 = cardDetails.A05;
        Object obj6 = "";
        if (obj5 == null) {
            obj5 = obj6;
        }
        0eP A1L3 = AnonymousClass7TE.A1L("credit_card_issuer", obj5);
        Integer num2 = cardDetails.A04;
        if (num2 == null || (obj = num2.toString()) == null) {
            obj = obj6;
        }
        0eP A1L4 = AnonymousClass7TE.A1L("expiry_year", obj);
        Integer num3 = cardDetails.A03;
        if (num3 == null || (obj2 = num3.toString()) == null) {
            obj2 = obj6;
        }
        0eP A1L5 = AnonymousClass7TE.A1L("expiry_month", obj2);
        Object obj7 = cardDetails.A09;
        if (obj7 == null) {
            obj7 = obj6;
        }
        0eP A1L6 = AnonymousClass7TE.A1L("csc", obj7);
        String str3 = cardDetails.A07;
        if (str3 != null) {
            obj3 = C51967G9n.A0q(str3, 0, 6);
        } else {
            obj3 = obj6;
        }
        0eP A1L7 = AnonymousClass7TE.A1L("credit_card_first_6", obj3);
        Object obj8 = cardDetails.A0A;
        if (obj8 == null) {
            obj8 = obj6;
        }
        0eP A1L8 = AnonymousClass7TE.A1L("credit_card_last4", obj8);
        if (!(autofillData == null || (obj4 = autofillData.A00.get(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) == null)) {
            obj6 = obj4;
        }
        LinkedHashMap A062 = 0Yt.A06(new 0eP[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, AnonymousClass7TE.A1L("cardholder_name", obj6)});
        0qQ.A0C(A062, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, java.lang.Object>");
        0qQ.A0B(A062, 0);
        A1H.put("card_info", A062);
        A0w.set(0);
        String str4 = this.A0E;
        LinkedHashMap A0p = DbY.A0p("partner_api_secret", 002.A0i("proof.", str4, str2, '.'), AnonymousClass7TE.A1L("device_key_pub", str4));
        0qQ.A0C(A0p, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, java.lang.Object>");
        0qQ.A0B(A0p, 0);
        A1H.put("device_secrets", A0p);
        A0w.set(1);
        A1H.put("hybrid_prompt_enabled", true);
        A0w.set(2);
        C55824Ho7 ho7 = this.A04;
        A1H.put("on_save_contact", Q3B.A00(new C59344JFw(ho7, 20), 30));
        A0w.set(5);
        A1H.put("on_save_payment_completed", Q3B.A00(new C52637GaB(0, (Object) autofillData, (Object) ho7), 31));
        A0w.set(6);
        A1H.put("on_decline", Q3B.A00(new C58751Iwy(21, autofillData, s4q, ho7), 27));
        A0w.set(4);
        Q3B.A03(new JJQ(this.A02, 13), A1H, 28);
        S7D s7d = this.A05;
        C11290SJq sJq = this.A07;
        Map map2 = this.A0F;
        Set set = this.A0H;
        Q3B.A02(new C13400TYk(this.A01, s7d, sJq, this.A0D, map2, set, 2), A1H, 29);
        if (A0w.nextClearBit(0) >= 9) {
            C11842ShU shU = new C11842ShU(0Yt.A0B(A1H), 0Yt.A0E());
            Context context = this.A00;
            S0G s0g = qk7.A01;
            shU.E0s(context, s0g.A00(), C48721Ej6.A00(s0g.A00, false));
            sJh.A01(num, (Long) null, 772805755);
            return C60340gF.A00;
        }
        throw DbT.A0n();
    }
}
