package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Lsr  reason: case insensitive filesystem */
public final class C65411Lsr implements MSW {
    public final /* synthetic */ C61941KSq A00;

    public C65411Lsr(C61941KSq kSq) {
        this.A00 = kSq;
    }

    public final void Dg7() {
        C61941KSq kSq = this.A00;
        C64167LRj lRj = new C64167LRj(kSq.requireContext(), C62630Kj1.PEOPLE);
        1Xj r4 = kSq.A0C;
        if (r4 == null) {
            0qQ.A0F("editMedia");
            throw AnonymousClass00P.createAndThrow();
        }
        lRj.A07(r4, (String) null, kSq.A0K, (ArrayList) null, (ArrayList) null, kSq.A0J, (List) null, (List) null, (List) null);
        lRj.A03(AnonymousClass7TE.A0l(kSq.A0Y));
        0kR.A05(kSq, lRj.A02(), IgNetworkConsentStorage.MAX_ENTRIES);
    }
}
