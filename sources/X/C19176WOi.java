package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.AdsManagerBoostingStatusErrorCode;
import com.instagram.business.promote.model.AdsManagerPaymentAnomalyType;
import com.instagram.business.promote.model.InstagramMediaProductType;
import com.instagram.business.promote.model.PromotionMetric;
import com.instagram.business.promote.model.RejectionReason;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.WOi  reason: case insensitive filesystem */
public final class C19176WOi implements C21004X9b {
    public int A00;
    public XIGIGBoostCallToAction A01;
    public XIGIGBoostDestination A02;
    public AdsManagerBoostingStatusErrorCode A03;
    public AdsManagerPaymentAnomalyType A04;
    public InstagramMediaProductType A05;
    public PromotionMetric A06;
    public RejectionReason A07;
    public ImageUrl A08;
    public C16661Uyx A09;
    public C16618UyE A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public List A0N = new ArrayList();
    public List A0O;
    public ImmutableList A0P;

    public final String AdJ() {
        String str = this.A0E;
        if (str != null) {
            return str;
        }
        0qQ.A0F("audienceDisplayNameInAdsManager");
        throw AnonymousClass00P.createAndThrow();
    }

    public final XIGIGBoostCallToAction Awb() {
        return this.A01;
    }

    public final String B7d() {
        return this.A0G;
    }

    public final String B7l() {
        return this.A0H;
    }

    public final InstagramMediaProductType BHn() {
        InstagramMediaProductType instagramMediaProductType = this.A05;
        if (instagramMediaProductType != null) {
            return instagramMediaProductType;
        }
        0qQ.A0F("instagramMediaProductType");
        throw AnonymousClass00P.createAndThrow();
    }

    public final List BHq() {
        return this.A0N;
    }

    public final PromotionMetric BSs() {
        PromotionMetric promotionMetric = this.A06;
        if (promotionMetric != null) {
            return promotionMetric;
        }
        0qQ.A0F("metric");
        throw AnonymousClass00P.createAndThrow();
    }

    public final int BVy() {
        return this.A00;
    }

    public final String BYn() {
        String str = this.A0J;
        if (str != null) {
            return str;
        }
        0qQ.A0F("organicMediaFbId");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String BYo() {
        String str = this.A0K;
        if (str != null) {
            return str;
        }
        0qQ.A0F("organicMediaIgId");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String BdT() {
        return this.A0M;
    }

    public final ImmutableList ByH() {
        Collection collection = this.A0O;
        if (collection == null) {
            collection = ImmutableList.of();
        }
        return DbU.A0K(collection);
    }

    public final ImageUrl C73() {
        ImageUrl imageUrl = this.A08;
        if (imageUrl != null) {
            return imageUrl;
        }
        0qQ.A0F("thumbnailUrl");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CWA() {
        return AnonymousClass7TF.A1W(this.A02, XIGIGBoostDestination.LEAD_GENERATION);
    }

    public C19176WOi() {
        ImmutableList of = ImmutableList.of();
        0qQ.A07(of);
        this.A0P = of;
    }
}
