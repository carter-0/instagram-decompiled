package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.common.session.UserSession;

public final class IYC implements AnonymousClass2wH {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C15940UlA A01;

    public IYC(UserSession userSession, C15940UlA ulA) {
        this.A00 = userSession;
        this.A01 = ulA;
    }

    public final /* bridge */ /* synthetic */ void D8O(Object obj) {
        Integer num;
        C376509Ig r6 = (C376509Ig) obj;
        0qQ.A0B(r6, 0);
        Object A05 = C296885qo.A05(this.A00, (C295795ov) null, (C295745oq) r6.A02, false);
        C233472vm r0 = (C233472vm) r6.A04;
        if (r0 != null) {
            int A09 = r0.A09();
            num = Integer.valueOf(A09);
            if (num != null && A09 >= 0) {
                C15940UlA ulA = this.A01;
                if (A09 <= ulA.A05()) {
                    if (A05 != null) {
                        ulA.A08(A09, DbX.A02((Number) r6.A03), A05);
                        return;
                    }
                    return;
                }
            }
        } else {
            num = null;
        }
        int A052 = this.A01.A05();
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Attempted to inject a fallback section out of bounds at target position: ");
        A1A.append(num);
        A1A.append(", current grid section size is ");
        A1A.append(A052);
        0wb.A04("grid_acp", A1A.toString(), IgNetworkConsentStorage.MAX_ENTRIES);
    }
}
