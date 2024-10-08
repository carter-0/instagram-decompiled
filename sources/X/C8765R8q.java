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

/* renamed from: X.R8q  reason: case insensitive filesystem */
public final class C8765R8q extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C8765R8q(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
    }

    public final void onFail(C268654dm r5) {
        int A002;
        int i;
        Throwable A0i;
        switch (this.A00) {
            case 0:
                A002 = A00(this, 247296007);
                i = 430486731;
                break;
            case 1:
                A002 = A00(this, 1690155318);
                i = -984026071;
                break;
            case 2:
                A002 = A00(this, 1271717260);
                i = 64128462;
                break;
            default:
                A002 = AnonymousClass0fD.A03(-444306651);
                C2818659w r2 = (C2818659w) this.A03;
                Throwable A012 = r5.A01();
                if (A012 != null) {
                    A0i = (Throwable) C10034RlW.A00.apply(A012);
                } else {
                    A0i = Pxe.A0i();
                }
                r2.A02(C11097S9y.A01(A0i));
                i = 749886130;
                break;
        }
        AnonymousClass0fD.A0A(i, A002);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032;
        int i;
        String str;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                A032 = AnonymousClass0fD.A03(-733722269);
                AnonymousClass0fD.A0A(1378875647, A01(this, (C8769R8u) obj2, 1658585040));
                i = -900934929;
                break;
            case 1:
                A032 = AnonymousClass0fD.A03(-487998704);
                AnonymousClass0fD.A0A(323967908, A01(this, (C8769R8u) obj2, 817064330));
                i = -2142078008;
                break;
            case 2:
                A032 = AnonymousClass0fD.A03(-1616812113);
                AnonymousClass0fD.A0A(748228638, A01(this, (C8769R8u) obj2, 804071353));
                i = 508043795;
                break;
            default:
                A032 = AnonymousClass0fD.A03(1277556013);
                int A033 = AnonymousClass0fD.A03(644338919);
                C12485SvH svH = (C12485SvH) this.A01;
                SparseArray sparseArray = (SparseArray) this.A02;
                String str2 = ((C8769R8u) obj2).A00;
                C2818659w r4 = (C2818659w) this.A03;
                0qQ.A0B(sparseArray, 0);
                boolean z = sparseArray.get(10) instanceof Country;
                Object obj3 = sparseArray.get(10);
                if (z) {
                    0qQ.A0C(obj3, "null cannot be cast to non-null type com.facebook.common.locale.Country");
                    str = ((LocaleMember) obj3).A00.getCountry();
                } else {
                    DbS.A1Y(obj3);
                    str = (String) obj3;
                }
                2IS A04 = C41845B3m.A04();
                2IS A042 = C41845B3m.A04();
                AnonymousClass0K0 r14 = GraphQlCallInput.A02;
                String str3 = svH.A02;
                boolean z2 = !str3.equals("IAB_AUTOFILL");
                0Df r12 = null;
                if (sparseArray.get(7) != null || z2) {
                    String A012 = C12485SvH.A01(sparseArray, 7);
                    r12 = r14.A02();
                    0Df.A00(r12, A012, ServerW3CShippingAddressConstants.CITY);
                }
                if (str == null) {
                    str = "";
                }
                String trim = str.trim();
                if (trim.isEmpty()) {
                    trim = Locale.getDefault().getCountry();
                }
                if (r12 == null) {
                    r12 = r14.A02();
                }
                0Df.A00(r12, trim, "country_code");
                if (sparseArray.get(8) != null || z2) {
                    0Df.A00(r12, C12485SvH.A01(sparseArray, 8), IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                }
                if (sparseArray.get(5) != null || z2) {
                    0Df.A00(r12, C12485SvH.A01(sparseArray, 5), "street1");
                }
                if (sparseArray.get(6) != null || z2) {
                    0Df.A00(r12, C12485SvH.A01(sparseArray, 6), "street2");
                }
                if (sparseArray.get(9) != null || z2) {
                    0Df.A00(r12, C12485SvH.A01(sparseArray, 9), ServerW3CShippingAddressConstants.POSTAL_CODE);
                }
                0Df A022 = r14.A02();
                A022.A0E(r12, "billing_address");
                0Df.A00(A022, C12485SvH.A01(sparseArray, 2), "cardholder_name");
                0Df.A00(A022, C12485SvH.A01(sparseArray, 12), "credit_card_id");
                0Df.A00(A022, str2, "credit_card_token");
                0Df.A00(A022, C41847B3o.A15(sparseArray, 14).toString().substring(0, 2), "expiry_month");
                0Df.A00(A022, C12485SvH.A02(C41847B3o.A15(sparseArray, 14).toString()), "expiry_year");
                0Df.A00(A022, str3, "payment_type");
                0Df.A00(A022, AnonymousClass7TF.A0b(), "client_mutation_id");
                PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41847B3o.A04(A022, A04, "input"), "IGFBPayUpdateCreditCard", A04.getParamsCopy(), A042.getParamsCopy(), C88.class, true, (PandoRealtimeInfoJNI) null, 40, "input", "update_credit_card", AnonymousClass7TE.A1C());
                C12090Smk smk = new C12090Smk(r4, 7);
                svH.A01.ATL(smk, new DFQ(7, smk, r4), pandoGraphQLRequest);
                AnonymousClass0fD.A0A(333633915, A033);
                i = -883366143;
                break;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public static int A00(C8765R8q r8q, int i) {
        int A032 = AnonymousClass0fD.A03(i);
        C308206Td.A0E((C307896Rx) r8q.A01, (C277014uI) r8q.A02, new Object[0]);
        return A032;
    }

    public static int A01(C8765R8q r8q, C8769R8u r8u, int i) {
        int A032 = AnonymousClass0fD.A03(i);
        C308206Td.A0E((C307896Rx) r8q.A01, (C277014uI) r8q.A03, r8u.A00);
        return A032;
    }
}
