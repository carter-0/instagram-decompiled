package X;

import com.instagram.business.promote.model.AudienceGeoLocation;

public final class WOX implements X3N {
    public final /* synthetic */ UZN A00;

    public WOX(UZN uzn) {
        this.A00 = uzn;
    }

    public final void DLt(AudienceGeoLocation audienceGeoLocation) {
        UZN uzn = this.A00;
        X3O x3o = uzn.A05;
        if (x3o == null) {
            0qQ.A0F("callback");
            throw AnonymousClass00P.createAndThrow();
        }
        x3o.CuX(audienceGeoLocation);
        DbT.A1J(uzn);
    }
}
