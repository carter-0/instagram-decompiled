package X;

import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.model.shopping.productcollection.ProductCollectionTagInfo;
import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.Venue;
import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import com.instagram.user.model.UpcomingEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Lum  reason: case insensitive filesystem */
public final class C65523Lum implements MW1 {
    public final AnonymousClass3Q2 A00;

    public final List Aat() {
        return this.A00.A47;
    }

    public final String Ac2() {
        return this.A00.A2O;
    }

    public final String Ac3() {
        return this.A00.A13.A03;
    }

    public final String AcI() {
        return this.A00.A2o;
    }

    public final Integer AfK() {
        return this.A00.A27;
    }

    public final String AfL() {
        return this.A00.A2R;
    }

    public final List AfM() {
        return this.A00.A4A;
    }

    public final Boolean AfN() {
        return this.A00.A1r;
    }

    public final List AfO() {
        return this.A00.A4B;
    }

    public final Boolean AfP() {
        return this.A00.A1s;
    }

    public final String AfQ() {
        return this.A00.A2S;
    }

    public final String AfR() {
        return this.A00.A2T;
    }

    public final C42120BHy AfS() {
        return this.A00.A0z;
    }

    public final String Ajo() {
        return this.A00.A2X;
    }

    public final int Alz() {
        return this.A00.A04;
    }

    public final List Amo() {
        return this.A00.A4F;
    }

    public final String Aob() {
        return this.A00.A2d;
    }

    public final List Aoc() {
        List list = this.A00.A4L;
        if (list == null) {
            return 0sn.A00;
        }
        return list;
    }

    public final C61100JxB Aqi() {
        return this.A00.A0v;
    }

    public final boolean AsA() {
        return this.A00.A52;
    }

    public final String AsG() {
        return this.A00.A2g;
    }

    public final String Aun() {
        return this.A00.A2j;
    }

    public final String Ayq() {
        return this.A00.A2l;
    }

    public final String B08() {
        return this.A00.A2n;
    }

    public final C61037Jvb B55() {
        AnonymousClass3Q2 r1 = this.A00;
        C61037Jvb jvb = r1.A0p;
        if (jvb != null) {
            return jvb;
        }
        BFT bft = r1.A0x;
        if (bft != null) {
            return new C61037Jvb(bft.A01, bft.A02, r1.A2r, 2);
        }
        return null;
    }

    public final String B8f() {
        return this.A00.A2y;
    }

    public final MediaGenAIDetectionMethod B8y() {
        return this.A00.A0w;
    }

    public final JV7 B9G() {
        return this.A00.A0o;
    }

    public final List BF9() {
        return this.A00.A4T;
    }

    public final C61000Juw BFj() {
        return this.A00.A1B;
    }

    public final String BMk() {
        return this.A00.A37;
    }

    public final String BSd() {
        return this.A00.A3A;
    }

    public final NewFundraiserInfo BVw() {
        return this.A00.A1E;
    }

    public final String BYT() {
        return this.A00.A3F;
    }

    public final String BYm() {
        return this.A00.A3G;
    }

    public final ArrayList BbX() {
        return this.A00.A40;
    }

    public final ProductCollectionTagInfo Bg3() {
        ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta = this.A00.A1o;
        if (productCollectionFeedTaggingMeta == null) {
            return null;
        }
        return new ProductCollectionTagInfo(Boolean.valueOf(productCollectionFeedTaggingMeta.A05), productCollectionFeedTaggingMeta.A01, productCollectionFeedTaggingMeta.A00.toString(), (String) null, (String) null);
    }

    public final List BgT() {
        return this.A00.A4X;
    }

    public final ArrayList BgW() {
        return this.A00.A41;
    }

    public final int BmG() {
        return this.A00.A0J;
    }

    public final String BmU() {
        return this.A00.A3W;
    }

    public final String BmY() {
        return this.A00.A3X;
    }

    public final boolean BtC() {
        return this.A00.A5s;
    }

    public final String BtM() {
        return this.A00.A3c;
    }

    public final List BtN() {
        return this.A00.A4d;
    }

    public final String Bxk() {
        return this.A00.A3g;
    }

    public final String Bxn() {
        return this.A00.A3h;
    }

    public final String Bxq() {
        return this.A00.A3i;
    }

    public final UpcomingEvent CBy() {
        return this.A00.A1p;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.instagram.model.venue.Venue, java.lang.Object] */
    public final Venue CDg() {
        LocationDict locationDict = this.A00.A1H;
        if (locationDict == null) {
            return null;
        }
        ? obj = new Object();
        obj.A00 = locationDict;
        return obj;
    }

    public final boolean CT1() {
        return this.A00.A5T;
    }

    public final Boolean CUB() {
        return this.A00.A1w;
    }

    public final boolean CVp() {
        return this.A00.A5Z;
    }

    public final boolean CXY() {
        return this.A00.A5c;
    }

    public final boolean CYb() {
        return this.A00.A5f;
    }

    public final boolean Cbj() {
        return this.A00.A5t;
    }

    public final boolean Cd7() {
        1iA r2 = this.A00.A1G;
        if (r2 == 1iA.A0X || r2 == 1iA.A0Y) {
            return true;
        }
        return false;
    }

    public final String getCaptureType() {
        return this.A00.A2V;
    }

    public final boolean getCommentsDisabled() {
        return this.A00.A4y;
    }

    public final String getFundraiserId() {
        return this.A00.A2x;
    }

    public final boolean getLikeAndViewCountsDisabled() {
        return this.A00.A5a;
    }

    public C65523Lum(AnonymousClass3Q2 r1) {
        this.A00 = r1;
    }
}
