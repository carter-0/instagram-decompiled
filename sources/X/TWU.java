package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

public final class TWU extends 0Yg implements 0sP {
    public final /* synthetic */ C2818659w A00;
    public final /* synthetic */ OMB A01;
    public final /* synthetic */ 2Mg A02;
    public final /* synthetic */ C12512Svp A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TWU(C2818659w r2, OMB omb, 2Mg r4, C12512Svp svp, String str, String str2, String str3, String str4) {
        super(1);
        this.A04 = str;
        this.A05 = str2;
        this.A02 = r4;
        this.A06 = str3;
        this.A07 = str4;
        this.A03 = svp;
        this.A00 = r2;
        this.A01 = omb;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        2HJ r1 = (2HJ) obj;
        0qQ.A0B(r1, 0);
        AnonymousClass0K0 r5 = GraphQlCallInput.A02;
        0Df A032 = C41845B3m.A03(r5, this.A04, "credit_card_id");
        A032.A0E(C41845B3m.A03(r5, this.A05, "sensitive_string_value"), "csc");
        0Df.A00(A032, this.A02.A00(), "device_key_pub");
        0Df.A00(A032, r1.A00(), "encryption_key_pub");
        0Df.A00(A032, this.A06, "encryption_key_signature");
        String str2 = this.A07;
        if (str2 != null) {
            A032.A0E(C41845B3m.A03(r5, str2, "sensitive_string_value"), "platform_trust_token");
        }
        C12512Svp svp = this.A03;
        19i A012 = svp.A00.A01(19f.A1k);
        if (!(A012 == null || (str = A012.A01) == null)) {
            0Df.A00(A032, str, "family_device_id");
        }
        2IS A042 = C41845B3m.A04();
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41847B3o.A04(A032, A042, "input"), "GetEncryptedCardNumber", A042.getParamsCopy(), C41845B3m.A04().getParamsCopy(), QX0.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "autofill_encrypted_credit_card", AnonymousClass7TE.A1C());
        1vn r6 = svp.A02;
        C2818659w r52 = this.A00;
        OMB omb = this.A01;
        C8294Qna.A01((S4g) null, r6, pandoGraphQLRequest, new AWH(1, omb, r1, r52), new AWH(2, svp, r52, omb));
        return C60340gF.A00;
    }
}
