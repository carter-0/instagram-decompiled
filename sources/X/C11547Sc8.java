package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.Sc8  reason: case insensitive filesystem */
public final class C11547Sc8 implements 1MD {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public C11547Sc8(Object obj, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = str2;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        PandoGraphQLRequest pandoGraphQLRequest;
        1vn r2;
        AnonymousClass2hV r1;
        S4g s4g;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                s4g = (S4g) obj2;
                ((C12412Stp) this.A01).A00.getValue();
                String str = this.A02;
                String str2 = this.A03;
                try {
                    C12105Sn0 sn0 = (C12105Sn0) C41847B3o.A17(C11061S8g.class, "create", 0);
                    2IS r22 = sn0.A00;
                    r22.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
                    sn0.A02 = true;
                    r22.A04("payoutRecordId", str2);
                    sn0.A03 = true;
                    pandoGraphQLRequest = sn0.build();
                    0qQ.A07(pandoGraphQLRequest);
                    r2 = C41847B3o.A0t();
                    r1 = Szd.A00;
                    break;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    throw C41845B3m.A0j(e);
                }
            case 1:
                s4g = (S4g) obj2;
                ((C12413Stq) this.A01).A00.getValue();
                String str3 = this.A02;
                String str4 = this.A03;
                try {
                    C12106Sn1 sn1 = (C12106Sn1) Pxj.A0l((Object) null, C11062S8h.class, "create");
                    2IS r3 = sn1.A00;
                    r3.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str3);
                    sn1.A02 = true;
                    r3.A04("interface_type", "IG_ANDROID");
                    sn1.A03 = true;
                    r3.A03("first", 10);
                    r3.A04("batch_item_id", str4);
                    pandoGraphQLRequest = sn1.build();
                    0qQ.A07(pandoGraphQLRequest);
                    r2 = C41847B3o.A0t();
                    r1 = Szf.A00;
                    break;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                    throw C41845B3m.A0j(e2);
                }
            case 2:
                S4g s4g2 = (S4g) obj2;
                ((C12416Stt) this.A01).A00.getValue();
                String str5 = this.A02;
                String str6 = this.A03;
                try {
                    C12101Smw smw = (C12101Smw) C41847B3o.A16(C11066S8l.class);
                    2IS r23 = smw.A00;
                    r23.A04("interface_type", "IG_ANDROID");
                    smw.A02 = true;
                    r23.A04("page_id", str5);
                    r23.A04(Py7.A00(), str6);
                    return C8294Qna.A00(s4g2, C41847B3o.A0t(), smw.build(), Szi.A00);
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
                    throw C41845B3m.A0j(e3);
                }
            case 3:
                s4g = (S4g) obj2;
                IGPaymentMethodsAPI iGPaymentMethodsAPI = ((S2Q) this.A01).A01;
                String str7 = this.A02;
                String str8 = this.A03;
                0qQ.A0B(str7, 0);
                2IS A04 = C41845B3m.A04();
                2IS A042 = C41845B3m.A04();
                0Df A032 = C41845B3m.A03(GraphQlCallInput.A02, "FBPAY_HUB", "payment_type");
                0Df.A00(A032, AnonymousClass7TF.A0b(), "client_mutation_id");
                0Df.A00(A032, iGPaymentMethodsAPI.A03.A06, "actor_id");
                0Df.A00(A032, str8, "logging_id");
                0Df.A00(A032, str7, "shop_pay_account_id");
                pandoGraphQLRequest = new PandoGraphQLRequest(C41847B3o.A04(A032, A04, "data"), "IGFBPayRemoveShopPayMutation", A04.getParamsCopy(), A042.getParamsCopy(), C43256BvI.class, true, (PandoRealtimeInfoJNI) null, 12, "data", "remove_shop_pay_account", AnonymousClass7TE.A1C());
                r2 = iGPaymentMethodsAPI.A04;
                r1 = C10125Rn2.A02;
                break;
            default:
                C10491Rt6 rt6 = ((S2S) this.A01).A03;
                String str9 = this.A03;
                String str10 = this.A02;
                0Df A033 = C41845B3m.A03(GraphQlCallInput.A02, AnonymousClass7TF.A0b(), "client_mutation_id");
                0Df.A00(A033, str9, "logging_id");
                2IS A0D = JTQ.A0D(A033, str10, "payment_type");
                return C8294Qna.A01((S4g) obj2, rt6.A01, new PandoGraphQLRequest(C41847B3o.A04(A033, A0D, "input"), "IGFBPayAddShopPayQuery", A0D.getParamsCopy(), C41845B3m.A04().getParamsCopy(), Bl3.class, false, (PandoRealtimeInfoJNI) null, 64, (String) null, (String) null, AnonymousClass7TE.A1C()), new DGM(rt6, 3), C10034RlW.A00);
        }
        return C8294Qna.A00(s4g, r2, pandoGraphQLRequest, r1);
    }
}
