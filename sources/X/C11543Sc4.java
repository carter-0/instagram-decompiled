package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.Sc4  reason: case insensitive filesystem */
public final class C11543Sc4 implements 1MD {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C11543Sc4(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
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
                ((C12418Stv) this.A01).A00.getValue();
                String str = this.A02;
                try {
                    C12100Smv smv = (C12100Smv) Pxj.A0l((Object) null, C11063S8i.class, "create");
                    2IS r3 = smv.A00;
                    r3.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
                    smv.A02 = true;
                    r3.A03("first", 10);
                    pandoGraphQLRequest = smv.build();
                    0qQ.A07(pandoGraphQLRequest);
                    r2 = C41847B3o.A0t();
                    r1 = Szk.A00;
                    break;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    throw C41845B3m.A0j(e);
                }
            case 1:
                s4g = (S4g) obj2;
                IGPaymentMethodsAPI iGPaymentMethodsAPI = ((S2Q) this.A01).A01;
                String str2 = this.A02;
                2IS A04 = C41845B3m.A04();
                2IS A042 = C41845B3m.A04();
                0Df A03 = C41845B3m.A03(GraphQlCallInput.A02, "FBPAY_HUB", "payment_type");
                0Df.A00(A03, str2, "ba_token");
                0Df.A00(A03, RealtimeSubscription.GRAPHQL_MQTT_VERSION, "client_mutation_id");
                0Df.A00(A03, RealtimeSubscription.GRAPHQL_MQTT_VERSION, Py7.A00());
                pandoGraphQLRequest = new PandoGraphQLRequest(C41847B3o.A04(A03, A04, "data"), "IGFBPayCompletePaypalLinkingMutation", A04.getParamsCopy(), A042.getParamsCopy(), C43246Bv8.class, true, (PandoRealtimeInfoJNI) null, 96, (String) null, "complete_paypal_linking", AnonymousClass7TE.A1C());
                r2 = iGPaymentMethodsAPI.A04;
                r1 = C10125Rn2.A01;
                break;
            case 2:
                s4g = (S4g) obj2;
                IGPaymentMethodsAPI iGPaymentMethodsAPI2 = ((S2Q) this.A01).A01;
                String str3 = this.A02;
                0qQ.A0B(str3, 0);
                2IS A043 = C41845B3m.A04();
                2IS A044 = C41845B3m.A04();
                0Df A032 = C41845B3m.A03(GraphQlCallInput.A02, "FBPAY_HUB", "payment_type");
                0Df.A00(A032, str3, "billing_agreement_id");
                0Df.A00(A032, RealtimeSubscription.GRAPHQL_MQTT_VERSION, "client_mutation_id");
                pandoGraphQLRequest = new PandoGraphQLRequest(C41847B3o.A04(A032, A043, "data"), "IGFBPayCancelPayPalMutation", A043.getParamsCopy(), A044.getParamsCopy(), C43243Bv5.class, true, (PandoRealtimeInfoJNI) null, 40, "data", "cancel_paypal_ba", AnonymousClass7TE.A1C());
                r2 = iGPaymentMethodsAPI2.A04;
                r1 = C10125Rn2.A00;
                break;
            default:
                C10491Rt6 rt6 = ((S2S) this.A01).A03;
                String str4 = this.A02;
                0Df A033 = C41845B3m.A03(GraphQlCallInput.A02, AnonymousClass7TF.A0b(), "client_mutation_id");
                0Df.A00(A033, rt6.A00.A06, "actor_id");
                0Df.A00(A033, str4, "logging_id");
                0Df.A00(A033, str4, Py7.A00());
                0Df.A00(A033, "instagram://shop_pay_did_finish", "app_url");
                2IS A0D = JTQ.A0D(A033, "FBPAY_HUB", "payment_type");
                return C8294Qna.A01((S4g) obj2, rt6.A01, new PandoGraphQLRequest(C41847B3o.A04(A033, A0D, "input"), "IGFBPayShopPayInitLinkMutation", A0D.getParamsCopy(), C41845B3m.A04().getParamsCopy(), Bl5.class, true, (PandoRealtimeInfoJNI) null, 12, "input", (String) null, AnonymousClass7TE.A1C()), new DGM(rt6, 4), C10034RlW.A00);
        }
        return C8294Qna.A00(s4g, r2, pandoGraphQLRequest, r1);
    }
}
