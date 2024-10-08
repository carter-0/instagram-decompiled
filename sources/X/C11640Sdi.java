package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.Sdi  reason: case insensitive filesystem */
public final class C11640Sdi implements AnonymousClass2gO {
    public final /* synthetic */ C2818659w A00;
    public final /* synthetic */ 2Mg A01;
    public final /* synthetic */ C12512Svp A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C11640Sdi(C2818659w r1, 2Mg r2, C12512Svp svp, String str, String str2) {
        this.A00 = r1;
        this.A02 = svp;
        this.A03 = str;
        this.A01 = r2;
        this.A04 = str2;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        String str;
        SUj sUj = (SUj) obj;
        if (SUj.A0S(sUj)) {
            this.A00.A02(C11097S9y.A01(new RKV(this.A02)));
        } else if (SUj.A0V(sUj)) {
            String str2 = (String) SUj.A0D(sUj);
            C12512Svp svp = this.A02;
            String str3 = this.A03;
            C2818659w r2 = this.A00;
            2Mg r0 = this.A01;
            String str4 = this.A04;
            String A002 = r0.A00();
            0Df A032 = C41845B3m.A03(GraphQlCallInput.A02, str3, "credit_card_id");
            0Df.A00(A032, A002, "device_key_pub");
            2IV A0R = Pxe.A0R();
            A0R.A09("$e2ee", "sensitive_string_value");
            C66580MXl.A1M(A032, A0R, "partner_api_secret");
            if (str2 != null) {
                2IV A0R2 = Pxe.A0R();
                A0R2.A09(str2, "sensitive_string_value");
                C66580MXl.A1M(A032, A0R2, "platform_trust_token");
            }
            19i A012 = svp.A00.A01(19f.A1k);
            if (!(A012 == null || (str = A012.A01) == null)) {
                0Df.A00(A032, str, "family_device_id");
            }
            if (str4 != null) {
                0Df.A00(A032, str4, "payment_type");
            }
            2IS A042 = C41845B3m.A04();
            C8294Qna.A01((S4g) null, svp.A02, new PandoGraphQLRequest(C41847B3o.A04(A032, A042, "input"), "BindCreditCard", A042.getParamsCopy(), C41845B3m.A04().getParamsCopy(), C7788QWz.class, true, (PandoRealtimeInfoJNI) null, 64, (String) null, "add_credit_card_proof_to_autofill", AnonymousClass7TE.A1C()), new C12608Szs((Object) r2, 10), new AWG(1, r2, svp));
        }
    }
}
