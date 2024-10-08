package X;

import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import java.util.List;

/* renamed from: X.9cI  reason: invalid class name and case insensitive filesystem */
public final class C381769cI extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final MediaUploadMetadata A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final List A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381769cI) {
                C381769cI r5 = (C381769cI) obj;
                if (!(0qQ.A0K(this.A05, r5.A05) && 0qQ.A0K(this.A0A, r5.A0A) && this.A02 == r5.A02 && this.A03 == r5.A03 && 0qQ.A0K(this.A06, r5.A06) && 0qQ.A0K(this.A07, r5.A07) && this.A09 == r5.A09 && this.A08 == r5.A08 && this.A00 == r5.A00 && this.A0B == r5.A0B && this.A01 == r5.A01 && 0qQ.A0K(this.A04, r5.A04))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A05);
        int A092 = AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A08(this.A07, AnonymousClass7TF.A08(this.A06, (((AnonymousClass7TF.A07(this.A0A, A0O) + this.A02) * 31) + this.A03) * 31)));
        boolean z = this.A0B;
        return AnonymousClass7TE.A0N(this.A04, (AnonymousClass7TF.A09(z, (AnonymousClass7TF.A09(this.A08, A092) + this.A00) * 31) + this.A01) * 31);
    }

    public C381769cI(MediaUploadMetadata mediaUploadMetadata, String str, String str2, String str3, List list, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        this.A05 = str;
        this.A0A = list;
        this.A02 = i;
        this.A03 = i2;
        this.A06 = str2;
        this.A07 = str3;
        this.A09 = z;
        this.A08 = z2;
        this.A00 = i3;
        this.A0B = z3;
        this.A01 = i4;
        this.A04 = mediaUploadMetadata;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CloudMediaInfo(id=");
        A1A.append(this.A05);
        A1A.append(", sourceAlbumTypes=");
        A1A.append(this.A0A);
        A1A.append(", height=");
        A1A.append(this.A02);
        A1A.append(", width=");
        A1A.append(this.A03);
        A1A.append(", src=");
        A1A.append(this.A06);
        A1A.append(", thumbnail=");
        A1A.append(this.A07);
        A1A.append(", isVideo=");
        A1A.append(this.A09);
        A1A.append(", hasCtime=");
        A1A.append(this.A08);
        A1A.append(", ctime=");
        A1A.append(this.A00);
        A1A.append(", hasDuration=");
        A1A.append(this.A0B);
        A1A.append(", duration=");
        A1A.append(this.A01);
        A1A.append(C273654mx.A00(449));
        return AnonymousClass7TG.A0n(this.A04, A1A);
    }
}
