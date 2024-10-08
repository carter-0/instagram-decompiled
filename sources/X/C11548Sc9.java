package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.Sc9  reason: case insensitive filesystem */
public final class C11548Sc9 implements 1MD {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C11548Sc9(Object obj, String str, String str2, String str3, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = str3;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Object obj2 = obj;
        if (this.A00 != 0) {
            C10491Rt6 rt6 = ((S2S) this.A01).A03;
            String str = this.A04;
            String str2 = this.A03;
            String str3 = this.A02;
            0Df A032 = C41845B3m.A03(GraphQlCallInput.A02, AnonymousClass7TF.A0b(), "client_mutation_id");
            0Df.A00(A032, rt6.A00.A06, "actor_id");
            0Df.A00(A032, str, "logging_id");
            0Df.A00(A032, "FBPAY_HUB", "payment_type");
            0Df.A00(A032, str2, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
            2IS A0D = JTQ.A0D(A032, str3, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
            return C8294Qna.A01((S4g) obj2, rt6.A01, new PandoGraphQLRequest(C41847B3o.A04(A032, A0D, "input"), "IGFBPayCompleteShopPayInitMutation", A0D.getParamsCopy(), C41845B3m.A04().getParamsCopy(), Bl4.class, true, (PandoRealtimeInfoJNI) null, 12, "input", (String) null, AnonymousClass7TE.A1C()), new DGM(rt6, 5), C10034RlW.A00);
        }
        S4g s4g = (S4g) obj2;
        ((C12415Sts) this.A01).A00.getValue();
        String str4 = this.A03;
        String str5 = this.A02;
        String str6 = this.A04;
        AnonymousClass2E0.A00();
        try {
            C12103Smy smy = (C12103Smy) C41847B3o.A16(C11072S8s.class);
            2IS r2 = smy.A00;
            r2.A04("interface_type", "IG_ANDROID");
            smy.A02 = true;
            r2.A04("fe_id", str5);
            r2.A04("page_id", str4);
            r2.A04(Py7.A00(), str6);
            2IV A0R = Pxe.A0R();
            A0R.A09("62c196cc283670265c8243af7482f62f8856499ba6f7f01c5067e75d05225969", "bloks_versioning_id");
            r2.A00(A0R, "input");
            return C8294Qna.A00(s4g, C41847B3o.A0t(), smy.build(), C12603Szh.A00);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw C41845B3m.A0j(e);
        }
    }
}
