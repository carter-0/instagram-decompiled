package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.InstagramMediaProductType;
import com.instagram.business.promote.model.PromotionMetric;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.WOh  reason: case insensitive filesystem */
public final class C19175WOh implements C21004X9b {
    public XIGIGBoostCallToAction A00;
    public XIGIGBoostDestination A01;
    public InstagramMediaProductType A02;
    public PromotionMetric A03;
    public ImageUrl A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public List A0C = new ArrayList();
    public List A0D;

    public final int BVy() {
        return 0;
    }

    public final String AdJ() {
        String str = this.A05;
        if (str == null) {
            return "--";
        }
        return str;
    }

    public final XIGIGBoostCallToAction Awb() {
        return this.A00;
    }

    public final String B7d() {
        return this.A07;
    }

    public final String B7l() {
        return this.A08;
    }

    public final InstagramMediaProductType BHn() {
        InstagramMediaProductType instagramMediaProductType = this.A02;
        if (instagramMediaProductType != null) {
            return instagramMediaProductType;
        }
        0qQ.A0F("instagramMediaProductType");
        throw AnonymousClass00P.createAndThrow();
    }

    public final List BHq() {
        return this.A0C;
    }

    public final PromotionMetric BSs() {
        PromotionMetric promotionMetric = this.A03;
        if (promotionMetric != null) {
            return promotionMetric;
        }
        0qQ.A0F("metric");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String BYn() {
        String str = this.A09;
        if (str != null) {
            return str;
        }
        0qQ.A0F("organicMediaFbId");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String BYo() {
        String str = this.A0A;
        if (str != null) {
            return str;
        }
        0qQ.A0F("organicMediaIgId");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String BdT() {
        return this.A0B;
    }

    public final ImageUrl C73() {
        ImageUrl imageUrl = this.A04;
        if (imageUrl != null) {
            return imageUrl;
        }
        0qQ.A0F("thumbnailUrl");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CWA() {
        XIGIGBoostDestination xIGIGBoostDestination = this.A01;
        if (xIGIGBoostDestination == null || xIGIGBoostDestination != XIGIGBoostDestination.LEAD_GENERATION) {
            return false;
        }
        return true;
    }

    public final ImmutableList ByH() {
        ImmutableList of = ImmutableList.of();
        0qQ.A07(of);
        return of;
    }
}
