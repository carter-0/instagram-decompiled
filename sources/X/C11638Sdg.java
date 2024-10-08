package X;

import android.util.SparseArray;
import com.facebook.common.locale.Country;
import com.facebook.common.locale.LocaleMember;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Locale;

/* renamed from: X.Sdg  reason: case insensitive filesystem */
public final class C11638Sdg implements AnonymousClass2gO {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C11638Sdg(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A04 = str;
        this.A02 = obj;
        this.A03 = obj2;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C277014uI r2;
        AnonymousClass6Tm r1;
        String A0x;
        String str;
        Object obj2 = obj;
        if (this.A00 != 0) {
            C12485SvH svH = (C12485SvH) this.A01;
            String str2 = this.A04;
            SparseArray sparseArray = (SparseArray) this.A02;
            C2818659w r12 = (C2818659w) this.A03;
            SUj sUj = (SUj) obj2;
            if (SUj.A0V(sUj)) {
                String str3 = (String) SUj.A0D(sUj);
                int A05 = DbX.A05(str2);
                String str4 = null;
                if (A05 < 6) {
                    A0x = null;
                } else {
                    A0x = Pxe.A0x(str2, 6);
                }
                if (A05 >= 4) {
                    str4 = str2.substring(A05 - 4);
                }
                if (sparseArray.get(10) instanceof Country) {
                    str = ((LocaleMember) sparseArray.get(10)).A00.getCountry();
                } else {
                    str = (String) sparseArray.get(21);
                }
                AnonymousClass0K0 r9 = GraphQlCallInput.A02;
                String str5 = svH.A02;
                boolean z = !str5.equals("IAB_AUTOFILL");
                0Df r122 = null;
                if (sparseArray.get(7) != null || z) {
                    String A012 = C12485SvH.A01(sparseArray, 7);
                    r122 = r9.A02();
                    0Df.A00(r122, A012, ServerW3CShippingAddressConstants.CITY);
                }
                if (str == null) {
                    str = "";
                }
                String trim = str.trim();
                if (trim.isEmpty()) {
                    trim = Locale.getDefault().getCountry();
                }
                if (r122 == null) {
                    r122 = r9.A02();
                }
                0Df.A00(r122, trim, "country_code");
                if (sparseArray.get(8) != null || z) {
                    0Df.A00(r122, C12485SvH.A01(sparseArray, 8), IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                }
                if (sparseArray.get(5) != null || z) {
                    0Df.A00(r122, C12485SvH.A01(sparseArray, 5), "street1");
                }
                if (sparseArray.get(6) != null || z) {
                    0Df.A00(r122, C12485SvH.A01(sparseArray, 6), "street2");
                }
                if (sparseArray.get(9) != null || z) {
                    0Df.A00(r122, C12485SvH.A01(sparseArray, 9), ServerW3CShippingAddressConstants.POSTAL_CODE);
                }
                0Df A022 = r9.A02();
                A022.A0E(r122, "billing_address");
                0Df.A00(A022, C12485SvH.A01(sparseArray, 2), "cardholder_name");
                0Df.A00(A022, C41847B3o.A15(sparseArray, 14).toString().substring(0, 2), "expiry_month");
                0Df.A00(A022, C12485SvH.A02(C41847B3o.A15(sparseArray, 14).toString()), "expiry_year");
                0Df.A00(A022, str5, "payment_type");
                0Df.A00(A022, AnonymousClass7TF.A0b(), "client_mutation_id");
                if (str3 != null) {
                    0Df.A00(A022, str3, "platform_trust_token");
                    A022.A0E(C41845B3m.A03(r9, "$e2ee", "sensitive_string_value"), "credit_card_number");
                    A022.A0E(C41845B3m.A03(r9, "$e2ee", "sensitive_string_value"), "csc");
                    if (A0x == null) {
                        A0x = "";
                    }
                    A022.A0E(C41845B3m.A03(r9, A0x, "sensitive_string_value"), "credit_card_first_6");
                    if (str4 == null) {
                        str4 = "";
                    }
                    A022.A0E(C41845B3m.A03(r9, str4, "sensitive_string_value"), "credit_card_last_4");
                } else {
                    0Df.A00(A022, "$e2ee", "credit_card_token");
                }
                2IS A042 = C41845B3m.A04();
                PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41847B3o.A04(A022, A042, "input"), "IGFBPayAddCreditCard", A042.getParamsCopy(), C41845B3m.A04().getParamsCopy(), C86.class, true, (PandoRealtimeInfoJNI) null, 40, "input", "add_credit_card", AnonymousClass7TE.A1C());
                C12090Smk smk = new C12090Smk(r12, 8);
                svH.A01.ATL(smk, new DFW(3, sparseArray, smk, r12, svH), pandoGraphQLRequest);
                return;
            }
            r12.A02(C11097S9y.A01(new Exception("PTT encode failed")));
            return;
        }
        SUj sUj2 = (SUj) obj2;
        0qQ.A0B(sUj2, 0);
        if (SUj.A0V(sUj2)) {
            Object A0D = SUj.A0D(sUj2);
            r2 = (C277014uI) this.A03;
            C308276Tl A0P = DbS.A0P();
            A0P.A03(A0D, 0);
            A0P.A02(this.A04);
            r1 = A0P.A00();
        } else if (SUj.A0S(sUj2)) {
            r2 = (C277014uI) this.A02;
            r1 = AnonymousClass6Tm.A01;
        } else {
            return;
        }
        C299275ur.A00((C307896Rx) this.A01, r1, r2);
    }
}
