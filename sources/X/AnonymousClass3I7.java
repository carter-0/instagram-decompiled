package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MultiAuthorStoryType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.LocationDictIntf;

/* renamed from: X.3I7  reason: invalid class name */
public final class AnonymousClass3I7 extends AnonymousClass0T0 implements AnonymousClass3I8 {
    public final MultiAuthorStoryType A00;
    public final ImageUrl A01;
    public final LocationDict A02;
    public final Float A03;
    public final Float A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public AnonymousClass3I7(MultiAuthorStoryType multiAuthorStoryType, ImageUrl imageUrl, LocationDict locationDict, Float f, Float f2, String str, String str2, String str3, String str4, String str5) {
        0qQ.A0B(str3, 6);
        this.A05 = str;
        this.A03 = f;
        this.A04 = f2;
        this.A02 = locationDict;
        this.A06 = str2;
        this.A07 = str3;
        this.A01 = imageUrl;
        this.A08 = str4;
        this.A09 = str5;
        this.A00 = multiAuthorStoryType;
    }

    public final AnonymousClass3I7 F8Y() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3I7) {
                AnonymousClass3I7 r5 = (AnonymousClass3I7) obj;
                if (!0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A09, r5.A09) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A05;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.A03;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.A04;
        int hashCode3 = (hashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        LocationDict locationDict = this.A02;
        int hashCode4 = (hashCode3 + (locationDict == null ? 0 : locationDict.hashCode())) * 31;
        String str2 = this.A06;
        int hashCode5 = (((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.A07.hashCode()) * 31;
        ImageUrl imageUrl = this.A01;
        int hashCode6 = (hashCode5 + (imageUrl == null ? 0 : imageUrl.hashCode())) * 31;
        String str3 = this.A08;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A09;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        MultiAuthorStoryType multiAuthorStoryType = this.A00;
        if (multiAuthorStoryType != null) {
            i = multiAuthorStoryType.hashCode();
        }
        return hashCode8 + i;
    }

    public final String Amd() {
        return this.A05;
    }

    public final Float BLV() {
        return this.A03;
    }

    public final Float BNV() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ LocationDictIntf BNj() {
        return this.A02;
    }

    public final ImageUrl Bh3() {
        return this.A01;
    }

    public final String Bh5() {
        return this.A08;
    }

    public final MultiAuthorStoryType CAS() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTReelMasOwnerClientDict", C44306Cco.A00(this));
    }

    public final String getName() {
        return this.A06;
    }

    public final String getPk() {
        return this.A07;
    }

    public final String getShortName() {
        return this.A09;
    }
}
