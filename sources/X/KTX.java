package X;

import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.common.gallery.Medium;

public final class KTX extends LJ9 {
    public final Medium A00;
    public final MW0 A01;
    public final AnonymousClass3Q2 A02;
    public final boolean A03;

    public KTX(Medium medium, MW0 mw0, AnonymousClass3Q2 r5, boolean z) {
        0qQ.A0B(r5, 3);
        this.A01 = mw0;
        this.A00 = medium;
        this.A02 = r5;
        this.A03 = z;
        String str = r5.A3o;
        String str2 = "";
        mw0.setTitle(str == null ? str2 : str);
        String str3 = r5.A2Z;
        mw0.ER5(str3 != null ? str3 : str2);
        mw0.EgG(r5.A02);
        mw0.Eah(r5.A5x);
        mw0.EfL(r5.A5i);
        mw0.EQ2(r5.A4C);
        mw0.EQ1(r5.A0t);
        mw0.EkA(r5.A5T);
    }

    public final long A00() {
        if (this.A03) {
            return this.A02.A0a;
        }
        return (long) this.A00.A03;
    }

    public final void A01() {
        BrandedContentProjectMetadata brandedContentProjectMetadata;
        AnonymousClass3Q2 r2 = this.A02;
        MW0 mw0 = this.A01;
        r2.A3o = mw0.getTitle();
        r2.A2Z = mw0.AlL();
        r2.A02 = mw0.Be4();
        r2.A5x = mw0.CW4();
        r2.A5i = mw0.isPaidPartnership();
        r2.A4C = mw0.Ahr();
        BrandedContentProjectMetadataIntf Aho = mw0.Aho();
        if (Aho != null) {
            brandedContentProjectMetadata = Aho.F0y();
        } else {
            brandedContentProjectMetadata = null;
        }
        r2.A0t = brandedContentProjectMetadata;
        r2.A5T = mw0.BtO();
        r2.A5L = mw0.CQe();
        r2.A05 = mw0.Arw();
    }
}
