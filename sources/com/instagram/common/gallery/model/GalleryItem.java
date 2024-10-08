package com.instagram.common.gallery.model;

import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.AnonymousClass8y3;
import X.C253833rU;
import X.C273654mx;
import X.C349307zv;
import X.C352218Cl;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.gallery.Draft;
import com.instagram.common.gallery.GeneratedMediaMetadata;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.typedurl.ImageUrl;

public class GalleryItem implements Parcelable {
    public static int A0B;
    public Medium A00;
    public final int A01;
    public final Draft A02;
    public final GeneratedMediaMetadata A03;
    public final RemoteMedia A04;
    public final AnonymousClass8y3 A05;
    public final ImageUrl A06;
    public final C352218Cl A07;
    public final C349307zv A08;
    public final Integer A09;
    public final String A0A;

    public final class LocalGalleryMedium extends GalleryItem {
        public final Medium A00;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public LocalGalleryMedium(com.instagram.common.gallery.Medium r13, java.lang.String r14) {
            /*
                r12 = this;
                r0 = 2
                r10 = r14
                X.0qQ.A0B(r14, r0)
                java.lang.Integer r9 = X.AnonymousClass05K.A00
                r1 = 0
                r11 = -1
                r0 = r12
                r3 = r13
                r2 = r1
                r4 = r1
                r5 = r1
                r6 = r1
                r7 = r1
                r8 = r1
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r12.A00 = r13
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.gallery.model.GalleryItem.LocalGalleryMedium.<init>(com.instagram.common.gallery.Medium, java.lang.String):void");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GalleryItem(X.C352218Cl r13, java.lang.String r14) {
        /*
            r12 = this;
            r0 = 2
            r10 = r14
            X.0qQ.A0B(r14, r0)
            java.lang.Integer r9 = X.AnonymousClass05K.A0j
            r1 = 0
            r11 = -1
            r0 = r12
            r7 = r13
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r8 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.gallery.model.GalleryItem.<init>(X.8Cl, java.lang.String):void");
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        r1 = r4.A05;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 0
            r2 = 1
            if (r4 == r5) goto L_0x0037
            boolean r0 = r5 instanceof com.instagram.common.gallery.model.GalleryItem
            if (r0 == 0) goto L_0x0038
            java.lang.String r1 = r4.A0A
            com.instagram.common.gallery.model.GalleryItem r5 = (com.instagram.common.gallery.model.GalleryItem) r5
            java.lang.String r0 = r5.A0A
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0038
            java.lang.Integer r1 = r4.A09
            java.lang.Integer r0 = r5.A09
            if (r1 != r0) goto L_0x0038
            int r1 = r1.intValue()
            if (r1 == r3) goto L_0x003e
            if (r1 == r2) goto L_0x0039
            r0 = 2
            if (r1 == r0) goto L_0x0043
            r0 = 3
            if (r1 == r0) goto L_0x0037
            r0 = 4
            if (r1 != r0) goto L_0x0037
            X.8y3 r1 = r4.A05
            if (r1 == 0) goto L_0x0038
            X.8y3 r0 = r5.A05
            boolean r0 = r1.equals(r0)
            if (r0 != r2) goto L_0x0038
        L_0x0037:
            r3 = 1
        L_0x0038:
            return r3
        L_0x0039:
            com.instagram.common.gallery.Draft r1 = r4.A02
            com.instagram.common.gallery.Draft r0 = r5.A02
            goto L_0x0047
        L_0x003e:
            com.instagram.common.gallery.Medium r1 = r4.A00
            com.instagram.common.gallery.Medium r0 = r5.A00
            goto L_0x0047
        L_0x0043:
            com.instagram.common.gallery.RemoteMedia r1 = r4.A04
            com.instagram.common.gallery.RemoteMedia r0 = r5.A04
        L_0x0047:
            boolean r3 = X.0qQ.A0K(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.gallery.model.GalleryItem.equals(java.lang.Object):boolean");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        String str;
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A04, i);
        switch (this.A09.intValue()) {
            case 1:
                str = "DRAFT";
                break;
            case 2:
                i2 = 2419;
                break;
            case 3:
                i2 = 2122;
                break;
            case 4:
                str = C273654mx.A00(501);
                break;
            case 5:
                i2 = 2119;
                break;
            case 6:
                i2 = 2120;
                break;
            case 7:
                str = "URL";
                break;
            case 8:
                i2 = 2246;
                break;
            default:
                i2 = 2347;
                break;
        }
        str = AnonymousClass000.A00(i2);
        parcel.writeString(str);
    }

    public final boolean A01() {
        switch (this.A09.intValue()) {
            case 0:
                if (this.A00 != null) {
                    return false;
                }
                throw new IllegalStateException("Required value was null.");
            case 1:
                Draft draft = this.A02;
                if (draft != null) {
                    return draft.A05;
                }
                throw new IllegalStateException("Required value was null.");
            case 2:
                if (this.A04 != null) {
                    return false;
                }
                throw new IllegalStateException("Required value was null.");
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
                return false;
            case 4:
                AnonymousClass8y3 r1 = this.A05;
                if (r1 == null || !r1.A03) {
                    return false;
                }
                return true;
            default:
                throw new RuntimeException();
        }
    }

    public final boolean A02() {
        if (this.A09 == AnonymousClass05K.A00) {
            return true;
        }
        return false;
    }

    public final boolean A03() {
        switch (this.A09.intValue()) {
            case 0:
                Medium medium = this.A00;
                if (medium != null) {
                    return medium.A05();
                }
                throw new IllegalStateException("Required value was null.");
            case 1:
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
                return false;
            case 2:
                RemoteMedia remoteMedia = this.A04;
                if (remoteMedia == null) {
                    throw new IllegalStateException("Required value was null.");
                } else if (!remoteMedia.A09) {
                    return true;
                } else {
                    return false;
                }
            case 5:
                break;
            default:
                throw new RuntimeException();
        }
        return true;
    }

    public final boolean A04() {
        if (this.A09 == AnonymousClass05K.A0C) {
            return true;
        }
        return false;
    }

    public final boolean A05() {
        switch (this.A09.intValue()) {
            case 0:
                Medium medium = this.A00;
                if (medium != null) {
                    return medium.isValid();
                }
                throw new IllegalStateException("Required value was null.");
            case 1:
                Draft draft = this.A02;
                if (draft != null) {
                    return draft.isValid();
                }
                throw new IllegalStateException("Required value was null.");
            case 2:
                RemoteMedia remoteMedia = this.A04;
                if (remoteMedia != null) {
                    return !C253833rU.A02(remoteMedia.A04);
                }
                throw new IllegalStateException("Required value was null.");
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
                break;
            case 4:
                AnonymousClass8y3 r1 = this.A05;
                if (r1 == null || r1.A01 == null) {
                    return false;
                }
                break;
            default:
                throw new RuntimeException();
        }
        return true;
    }

    public final boolean A06() {
        switch (this.A09.intValue()) {
            case 0:
                Medium medium = this.A00;
                if (medium != null) {
                    return medium.CeS();
                }
                throw new IllegalStateException("Required value was null.");
            case 1:
                Draft draft = this.A02;
                if (draft != null) {
                    return draft.A06;
                }
                throw new IllegalStateException("Required value was null.");
            case 2:
                RemoteMedia remoteMedia = this.A04;
                if (remoteMedia != null) {
                    return remoteMedia.A09;
                }
                throw new IllegalStateException("Required value was null.");
            case 3:
            case 5:
            case 7:
            case 8:
                return false;
            case 4:
                AnonymousClass8y3 r1 = this.A05;
                if (r1 == null || !r1.A04) {
                    return false;
                }
                break;
            case 6:
                break;
            default:
                throw new RuntimeException();
        }
        return true;
    }

    public final int hashCode() {
        return this.A0A.hashCode();
    }

    public final String A00() {
        if (A02()) {
            Medium medium = this.A00;
            if (medium != null) {
                return medium.A0a;
            }
            throw new IllegalStateException("Required value was null.");
        }
        Draft draft = this.A02;
        if (draft != null) {
            return draft.A03;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public GalleryItem(Draft draft, GeneratedMediaMetadata generatedMediaMetadata, Medium medium, RemoteMedia remoteMedia, AnonymousClass8y3 r5, ImageUrl imageUrl, C352218Cl r7, C349307zv r8, Integer num, String str, int i) {
        this.A09 = num;
        this.A0A = str;
        this.A02 = draft;
        this.A04 = remoteMedia;
        this.A05 = r5;
        this.A07 = r7;
        this.A08 = r8;
        this.A06 = imageUrl;
        this.A01 = i;
        this.A00 = medium;
        this.A03 = generatedMediaMetadata;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GalleryItem(RemoteMedia remoteMedia) {
        this((Draft) null, (GeneratedMediaMetadata) null, (Medium) null, remoteMedia, (AnonymousClass8y3) null, remoteMedia.A03, (C352218Cl) null, (C349307zv) null, AnonymousClass05K.A0C, remoteMedia.A06, -1);
        0qQ.A0B(remoteMedia, 1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GalleryItem(com.instagram.common.typedurl.ImageUrl r13) {
        /*
            r12 = this;
            java.lang.Integer r9 = X.AnonymousClass05K.A15
            r6 = r13
            java.lang.String r10 = r13.getUrl()
            X.0qQ.A07(r10)
            r1 = 0
            r11 = -1
            r0 = r12
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r7 = r1
            r8 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.gallery.model.GalleryItem.<init>(com.instagram.common.typedurl.ImageUrl):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GalleryItem(X.C349307zv r13) {
        /*
            r12 = this;
            r8 = r13
            java.lang.String r10 = r13.A07()
            r0 = 2
            X.0qQ.A0B(r10, r0)
            java.lang.Integer r9 = X.AnonymousClass05K.A0u
            r1 = 0
            r11 = -1
            r0 = r12
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.gallery.model.GalleryItem.<init>(X.7zv):void");
    }
}
