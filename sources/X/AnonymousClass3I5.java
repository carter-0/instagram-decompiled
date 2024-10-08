package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MetaGalleryAlbumType;
import java.util.List;

/* renamed from: X.3I5  reason: invalid class name */
public final class AnonymousClass3I5 extends AnonymousClass0T0 implements AnonymousClass3I6 {
    public final MetaGalleryAlbumType A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final List A0A;

    public final AnonymousClass3I5 F6B() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3I5) {
                AnonymousClass3I5 r5 = (AnonymousClass3I5) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A0A, r5.A0A) || this.A00 != r5.A00 || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A08, r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A02;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A03;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.A01;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.A04;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A05;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.A09;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.A0A;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        MetaGalleryAlbumType metaGalleryAlbumType = this.A00;
        int hashCode8 = (hashCode7 + (metaGalleryAlbumType == null ? 0 : metaGalleryAlbumType.hashCode())) * 31;
        String str5 = this.A06;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A07;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.A08;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode10 + i;
    }

    public final String Ago() {
        return this.A02;
    }

    public final Integer AzO() {
        return this.A01;
    }

    public final String BCi() {
        return this.A04;
    }

    public final List BQM() {
        return this.A09;
    }

    public final List BR3() {
        return this.A0A;
    }

    public final MetaGalleryAlbumType BSY() {
        return this.A00;
    }

    public final String C7x() {
        return this.A06;
    }

    public final String C8H() {
        return this.A07;
    }

    public final String C9L() {
        return this.A08;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMetaGalleryNetegoInStory", CaR.A00(this));
    }

    public final String getCtaText() {
        return this.A03;
    }

    public final String getId() {
        return this.A05;
    }

    public AnonymousClass3I5(MetaGalleryAlbumType metaGalleryAlbumType, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = num;
        this.A04 = str3;
        this.A05 = str4;
        this.A09 = list;
        this.A0A = list2;
        this.A00 = metaGalleryAlbumType;
        this.A06 = str5;
        this.A07 = str6;
        this.A08 = str7;
    }
}
