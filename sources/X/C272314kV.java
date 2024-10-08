package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.MonetizationEligibilityDecision;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;
import java.util.List;

/* renamed from: X.4kV  reason: invalid class name and case insensitive filesystem */
public final class C272314kV extends 1P0 {
    public final /* synthetic */ 2AY A00;
    public final /* synthetic */ 0sP A01;

    public C272314kV(2AY r1, 0sP r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-419180308);
        C272294kT r12 = (C272294kT) obj;
        int A032 = AnonymousClass0fD.A03(1579222484);
        0qQ.A0B(r12, 0);
        C272544kv r0 = r12.A00;
        if (r0 == null) {
            0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw AnonymousClass00P.createAndThrow();
        }
        List<C272534ku> list = r0.A00;
        UserSession userSession = this.A00.A00;
        MonetizationRepository A002 = AnonymousClass2o3.A00(userSession);
        1Av A003 = 1Au.A00(userSession);
        for (C272534ku r8 : list) {
            C272524kt r82 = (C272524kt) r8;
            UserMonetizationProductType userMonetizationProductType = r82.A01;
            boolean z = r82.A04;
            0qQ.A0B(userMonetizationProductType, 0);
            A002.A0D.put(userMonetizationProductType, Boolean.valueOf(z));
            A002.A03(userMonetizationProductType, r82.A03);
            boolean z2 = r82.A02;
            A002.A02(userMonetizationProductType, z2);
            if (userMonetizationProductType == UserMonetizationProductType.BRANDED_CONTENT) {
                MonetizationEligibilityDecision monetizationEligibilityDecision = r82.A00;
                0qQ.A0B(monetizationEligibilityDecision, 0);
                A002.A09.A0s(monetizationEligibilityDecision.A00);
                A003.A0U.Epx(A003, Boolean.valueOf(z2), 1Av.A8a[135]);
            }
            this.A01.invoke(r82.A00);
        }
        AnonymousClass0fD.A0A(-1299240707, A032);
        AnonymousClass0fD.A0A(335568, A03);
    }
}
