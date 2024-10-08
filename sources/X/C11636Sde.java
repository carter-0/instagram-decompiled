package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.Sde  reason: case insensitive filesystem */
public final class C11636Sde implements AnonymousClass2gO {
    public final /* synthetic */ C2818659w A00;
    public final /* synthetic */ C9679Rex A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C11636Sde(C2818659w r1, C9679Rex rex, String str, String str2) {
        this.A01 = rex;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        SUj sUj = (SUj) obj;
        if (SUj.A0V(sUj)) {
            Object A0D = SUj.A0D(sUj);
            String str = this.A03;
            String str2 = this.A02;
            C2818659w r5 = this.A00;
            0Df A032 = C41845B3m.A03(GraphQlCallInput.A02, A0D, "platform_trust_token");
            0Df.A00(A032, str2, "device_key_pub");
            0Df.A00(A032, str, "family_device_id");
            0Df.A00(A032, "IAB_AUTOFILL_UNBOUND_CARD_TRUSTED_DEVICE_CHAIN", "payment_type");
            0Df.A00(A032, AnonymousClass2M6.A00, "session_id_for_logging");
            try {
                Object A17 = C41847B3o.A17(S8T.class, "create", 0);
                0qQ.A0C(A17, "null cannot be cast to non-null type com.fbpay.w3c.api.AddCreditCardsToAutofillMutation.BuilderForInput");
                C12124SnO snO = (C12124SnO) A17;
                2IS r2 = snO.A00;
                DbW.A18(A032, r2, "input");
                snO.A01 = true;
                r2.A04("legacy_dev_pub_key", str2);
                snO.A02 = true;
                r2.A04("shared_dev_pub_key", str2);
                snO.A03 = true;
                PandoGraphQLRequest A002 = snO.build();
                AnonymousClass2E0.A06().A00.A00.ATL(new C12090Smk(r5, 0), new C12093Smn(r5, 0), A002);
            } catch (Exception e) {
                if ((e instanceof ClassNotFoundException) || (e instanceof IllegalAccessException) || (e instanceof InstantiationException) || (e instanceof InvocationTargetException) || (e instanceof NoSuchMethodException)) {
                    throw C41845B3m.A0j(e);
                }
                throw e;
            }
        } else {
            this.A00.A02(C11097S9y.A01(sUj.A02));
        }
    }
}
