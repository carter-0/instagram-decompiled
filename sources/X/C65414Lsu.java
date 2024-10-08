package X;

import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.util.List;

/* renamed from: X.Lsu  reason: case insensitive filesystem */
public final class C65414Lsu implements MW0 {
    public float A00 = 0.5625f;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06 = 100;
    public BrandedContentGatingInfoIntf A07;
    public BrandedContentProjectMetadataIntf A08;
    public MediaCroppingCoordinates A09;
    public MediaCroppingCoordinates A0A;
    public IGTVShoppingMetadata A0B;
    public C63722L4g A0C;
    public LBS A0D;
    public NewFundraiserInfo A0E;
    public TaggingFeedMultiSelectState A0F;
    public ExistingStandaloneFundraiserForFeedModel A0G;
    public String A0H = "";
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N = "";
    public List A0O = AnonymousClass7TE.A1C();
    public List A0P = AnonymousClass7TE.A1C();
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S = true;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c = true;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public final AnonymousClass2Fj A0j = JTO.A0K();

    public final void ER5(String str) {
        0qQ.A0B(str, 0);
        this.A0H = str;
    }

    public final void EgG(float f) {
        if (f == 0.0f) {
            0wb.A03("IGTVUploadViewStateDelegate.resetViewModel", "aspectRatio cannot be zero");
        } else {
            this.A00 = f;
        }
    }

    public final void setTitle(String str) {
        0qQ.A0B(str, 0);
        this.A0N = str;
    }

    public final void A00(float f) {
        setTitle("");
        ER5("");
        this.A0P = AnonymousClass7TE.A1C();
        this.A0I = null;
        this.A05 = 0;
        this.A06 = 100;
        EgG(f);
        this.A0d = false;
        this.A0Y = false;
        this.A0J = null;
        this.A04 = 0;
        this.A03 = 0;
        this.A02 = 0;
        this.A0Z = false;
        this.A09 = null;
        this.A0A = null;
        this.A0D = null;
        this.A0O = AnonymousClass7TE.A1C();
        this.A0f = false;
        this.A07 = null;
        this.A08 = null;
        this.A0a = false;
        this.A0e = false;
        this.A0Q = false;
        this.A0R = false;
        this.A0X = false;
        this.A0S = true;
        this.A0V = false;
        this.A0T = false;
        this.A0U = false;
        this.A0M = null;
        this.A0h = false;
        this.A0B = null;
        this.A0F = null;
        this.A0E = null;
        this.A0G = null;
        this.A0L = null;
        this.A0i = false;
        this.A0b = false;
        this.A0C = null;
        this.A0K = null;
        this.A0g = false;
    }

    public final boolean AcO() {
        return this.A0Q;
    }

    public final boolean AcP() {
        return this.A0R;
    }

    public final BrandedContentProjectMetadataIntf Aho() {
        return this.A08;
    }

    public final List Ahr() {
        return this.A0O;
    }

    public final String AlL() {
        return this.A0H;
    }

    public final int Arw() {
        return this.A02;
    }

    public final int Arx() {
        return this.A03;
    }

    public final int As0() {
        return this.A04;
    }

    public final boolean B2Q() {
        return this.A0U;
    }

    public final String B2V() {
        return this.A0L;
    }

    public final MediaCroppingCoordinates B5R() {
        return this.A09;
    }

    public final int B5s() {
        return this.A05;
    }

    public final int B5v() {
        return this.A06;
    }

    public final BrandedContentGatingInfoIntf BQ3() {
        return this.A07;
    }

    public final NewFundraiserInfo BVx() {
        return this.A0E;
    }

    public final List BbY() {
        return this.A0P;
    }

    public final float Be4() {
        return this.A00;
    }

    public final LBS BeC() {
        return this.A0D;
    }

    public final AnonymousClass2Fj BeD() {
        return this.A0j;
    }

    public final MediaCroppingCoordinates Bgq() {
        return this.A0A;
    }

    public final boolean BtO() {
        return this.A0h;
    }

    public final IGTVShoppingMetadata Bto() {
        return this.A0B;
    }

    public final boolean CQe() {
        return this.A0Z;
    }

    public final boolean CU6() {
        return this.A0a;
    }

    public final boolean CW4() {
        return this.A0d;
    }

    public final String getTitle() {
        return this.A0N;
    }

    public final boolean isPaidPartnership() {
        return this.A0f;
    }

    public final void EQ1(BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf) {
        this.A08 = brandedContentProjectMetadataIntf;
    }

    public final void EQ2(List list) {
        this.A0O = list;
    }

    public final void ESz(boolean z) {
        this.A0Y = z;
    }

    public final void ET0(String str) {
        this.A0J = str;
    }

    public final void ET1(boolean z) {
        this.A0Z = z;
    }

    public final void ET2(int i) {
        this.A02 = i;
    }

    public final void ET3(int i) {
        this.A03 = i;
    }

    public final void ET6(int i) {
        this.A04 = i;
    }

    public final void EWn(int i) {
        this.A05 = i;
    }

    public final void EWp(int i) {
        this.A06 = i;
    }

    public final void Eah(boolean z) {
        this.A0d = z;
    }

    public final void EfL(boolean z) {
        this.A0f = z;
    }

    public final void EfX(List list) {
        this.A0P = list;
    }

    public final void EkA(boolean z) {
        this.A0h = z;
    }
}
