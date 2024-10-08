package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;

/* renamed from: X.3I3  reason: invalid class name */
public final class AnonymousClass3I3 extends AnonymousClass0T0 implements AnonymousClass3I4 {
    public final long A00;
    public final ImageInfo A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public AnonymousClass3I3(ImageInfo imageInfo, String str, String str2, String str3, long j) {
        0qQ.A0B(str, 2);
        0qQ.A0B(imageInfo, 3);
        0qQ.A0B(str2, 4);
        this.A00 = j;
        this.A02 = str;
        this.A01 = imageInfo;
        this.A03 = str2;
        this.A04 = str3;
    }

    public final AnonymousClass3I3 F5x() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3I3) {
                AnonymousClass3I3 r8 = (AnonymousClass3I3) obj;
                if (this.A00 != r8.A00 || !0qQ.A0K(this.A02, r8.A02) || !0qQ.A0K(this.A01, r8.A01) || !0qQ.A0K(this.A03, r8.A03) || !0qQ.A0K(this.A04, r8.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final long B2m() {
        return this.A00;
    }

    public final ImageInfo BGO() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMediaPreviewClientDict", CaH.A00(this));
    }

    public final String getId() {
        return this.A02;
    }

    public final String getMediaType() {
        return this.A03;
    }

    public final String getPreview() {
        return this.A04;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.A00;
        int hashCode2 = ((((((((int) (j ^ (j >>> 32))) * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A03.hashCode()) * 31;
        String str = this.A04;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }
}
