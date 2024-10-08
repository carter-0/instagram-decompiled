package X;

import android.content.Context;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.fbpay.w3c.Address;
import com.fbpay.w3c.CardDetails;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.TTd  reason: case insensitive filesystem */
public final class C13284TTd extends 0Yg implements C62320sa {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ QK8 A02;
    public final /* synthetic */ S7D A03;
    public final /* synthetic */ C10996S4q A04;
    public final /* synthetic */ C11290SJq A05;
    public final /* synthetic */ C11288SJh A06;
    public final /* synthetic */ Integer A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ List A0A;
    public final /* synthetic */ List A0B;
    public final /* synthetic */ Map A0C;
    public final /* synthetic */ Set A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13284TTd(Context context, Bundle bundle, QK8 qk8, S7D s7d, C10996S4q s4q, C11290SJq sJq, C11288SJh sJh, Integer num, String str, String str2, List list, List list2, Map map, Set set) {
        super(0);
        this.A06 = sJh;
        this.A07 = num;
        this.A0C = map;
        this.A08 = str;
        this.A04 = s4q;
        this.A0A = list;
        this.A00 = context;
        this.A0B = list2;
        this.A02 = qk8;
        this.A03 = s7d;
        this.A05 = sJq;
        this.A0D = set;
        this.A09 = str2;
        this.A01 = bundle;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        ArrayList arrayList;
        0sm A062;
        String A12;
        String str;
        C11288SJh sJh = this.A06;
        Integer num = this.A07;
        sJh.A02(num, (Long) null, "BloksBottomSheetShowInMainThreadStart", 772805755);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        BitSet A0w = DbS.A0w(8);
        A1H.put("logging_metadata", this.A0C);
        A0w.set(4);
        Pxi.A1H("is_reoptin", Pxi.A0R(this.A08, "RE_OPT_IN"), A0w, A1H);
        Pxi.A1G("has_accepted_consent", Boolean.valueOf(this.A04.A00), A0w, A1H);
        List<AutofillData> list = this.A0A;
        if (list != null) {
            arrayList = AnonymousClass7TG.A0r(list);
            for (AutofillData A022 : list) {
                arrayList.add(C11384SQx.A02(A022));
            }
        } else {
            arrayList = 0sn.A00;
        }
        0qQ.A0B(arrayList, 0);
        A1H.put("contacts", arrayList);
        A0w.set(1);
        Context context = this.A00;
        List<CardDetails> list2 = this.A0B;
        ArrayList A0r = AnonymousClass7TG.A0r(list2);
        for (CardDetails cardDetails : list2) {
            Address address = cardDetails.A00;
            if (address == null) {
                A062 = 0Yt.A0E();
            } else {
                String str2 = address.A00;
                String str3 = "";
                if (str2 == null) {
                    str2 = str3;
                }
                0eP A1L = AnonymousClass7TE.A1L("care_of", str2);
                String str4 = address.A01;
                if (str4 == null) {
                    str4 = str3;
                }
                0eP A1L2 = AnonymousClass7TE.A1L(ServerW3CShippingAddressConstants.CITY, str4);
                String str5 = address.A04;
                if (str5 == null) {
                    str5 = str3;
                }
                0eP A1L3 = AnonymousClass7TE.A1L(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, str5);
                String str6 = address.A02;
                if (str6 == null) {
                    str6 = str3;
                }
                0eP A1L4 = AnonymousClass7TE.A1L("country", str6);
                String str7 = address.A05;
                if (str7 == null) {
                    str7 = str3;
                }
                0eP A1L5 = AnonymousClass7TE.A1L("street1", str7);
                String str8 = address.A06;
                if (str8 == null) {
                    str8 = str3;
                }
                0eP A1L6 = AnonymousClass7TE.A1L("street2", str8);
                String str9 = address.A07;
                if (str9 == null) {
                    str9 = str3;
                }
                0eP A1L7 = AnonymousClass7TE.A1L(ServerW3CShippingAddressConstants.POSTAL_CODE, str9);
                String str10 = address.A03;
                if (str10 != null) {
                    str3 = str10;
                }
                A062 = 0Yt.A06(new 0eP[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, AnonymousClass7TE.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str3)});
                0qQ.A0C(A062, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, java.lang.Object>");
            }
            boolean A1X = AnonymousClass7TG.A1X(cardDetails.A02);
            0eP A1L8 = AnonymousClass7TE.A1L("billing_address", A062);
            String str11 = cardDetails.A08;
            String str12 = "";
            if (str11 == null) {
                str11 = str12;
            }
            0eP A1L9 = AnonymousClass7TE.A1L("credential_id", str11);
            0eP A1L10 = AnonymousClass7TE.A1L("card_association_name", C11334SNo.A01(cardDetails.A05).A03);
            Integer num2 = cardDetails.A03;
            if (num2 == null) {
                A12 = str12;
            } else {
                A12 = Pxe.A12(AnonymousClass1Q2.A02(), "%02d", C66581MXm.A1b(num2, 1));
            }
            0eP A1L11 = AnonymousClass7TE.A1L("expiry_month", A12);
            Integer num3 = cardDetails.A04;
            if (num3 == null || (str = num3.toString()) == null) {
                str = str12;
            }
            0eP A1L12 = AnonymousClass7TE.A1L("expiry_year", str);
            String str13 = cardDetails.A0A;
            if (str13 == null) {
                str13 = str12;
            }
            0eP A1L13 = AnonymousClass7TE.A1L("last_four_digits", str13);
            String str14 = cardDetails.A06;
            if (str14 == null) {
                str14 = str12;
            }
            0eP A1L14 = AnonymousClass7TE.A1L("card_image_url", str14);
            String str15 = cardDetails.A09;
            if (str15 == null) {
                str15 = str12;
            }
            0eP A1L15 = AnonymousClass7TE.A1L("csc", str15);
            String str16 = cardDetails.A07;
            if (str16 != null) {
                str12 = str16;
            }
            LinkedHashMap A063 = 0Yt.A06(new 0eP[]{A1L8, A1L9, A1L10, A1L11, A1L12, A1L13, A1L14, A1L15, AnonymousClass7TE.A1L("card_number", str12), AnonymousClass7TE.A1L("is_default", Boolean.valueOf(A1X))});
            0qQ.A0C(A063, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, java.lang.Object>");
            A0r.add(A063);
        }
        A1H.put("cards", A0r);
        A0w.set(0);
        C13354TWo tWo = C13354TWo.A00;
        0qQ.A0B(tWo, 0);
        A1H.put("on_accept_payment", Q3B.A00(tWo, 32));
        A0w.set(5);
        TU9 tu9 = TU9.A00;
        0qQ.A0B(tu9, 0);
        A1H.put("on_decline", Q3B.A00(tu9, 33));
        A0w.set(6);
        C13399TYj tYj = C13399TYj.A00;
        0qQ.A0B(tYj, 0);
        Q3B.A03(tYj, A1H, 34);
        A0w.set(7);
        Q3B.A02(new C59434JJj(this.A03, this.A05, this.A0D, this.A01, this.A09, 0), A1H, 35);
        if (A0w.nextClearBit(0) >= 8) {
            C11843ShV shV = new C11843ShV(0Yt.A0B(A1H), 0Yt.A0E());
            S0G s0g = this.A02.A01;
            shV.E0s(context, s0g.A00(), C48721Ej6.A00(s0g.A00, false));
            sJh.A01(num, (Long) null, 772805755);
            return C60340gF.A00;
        }
        throw DbT.A0n();
    }
}
