package X;

import com.instagram.business.promote.model.AudienceGeoLocation;
import com.instagram.business.promote.model.PromoteData;

/* renamed from: X.WOa  reason: case insensitive filesystem */
public final class C19168WOa implements X3O {
    public final /* synthetic */ C15285UZp A00;

    public C19168WOa(C15285UZp uZp) {
        this.A00 = uZp;
    }

    public final void CuX(AudienceGeoLocation audienceGeoLocation) {
        C15285UZp uZp = this.A00;
        PromoteData promoteData = uZp.A05;
        if (promoteData == null) {
            0qQ.A0F("promoteData");
            throw AnonymousClass00P.createAndThrow();
        }
        promoteData.A0o.A02 = audienceGeoLocation;
        C15285UZp.A03(uZp);
        C15285UZp.A02(uZp);
    }
}
