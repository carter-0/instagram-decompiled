package com.instagram.common.gallery.metadata;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass3QN;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;

public final class MediaUploadMetadata extends AnonymousClass0T0 implements Parcelable {
    public static final AnonymousClass3QN A0C = new Object();
    public static final Parcelable.Creator CREATOR = new C376419Hx(75);
    public ImmersiveMediaFields A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MediaUploadMetadata) {
                MediaUploadMetadata mediaUploadMetadata = (MediaUploadMetadata) obj;
                if (!0qQ.A0K(this.A03, mediaUploadMetadata.A03) || !0qQ.A0K(this.A02, mediaUploadMetadata.A02) || !0qQ.A0K(this.A09, mediaUploadMetadata.A09) || !0qQ.A0K(this.A01, mediaUploadMetadata.A01) || !0qQ.A0K(this.A08, mediaUploadMetadata.A08) || !0qQ.A0K(this.A0A, mediaUploadMetadata.A0A) || !0qQ.A0K(this.A05, mediaUploadMetadata.A05) || !0qQ.A0K(this.A04, mediaUploadMetadata.A04) || this.A0B != mediaUploadMetadata.A0B || !0qQ.A0K(this.A06, mediaUploadMetadata.A06) || !0qQ.A0K(this.A07, mediaUploadMetadata.A07) || !0qQ.A0K(this.A00, mediaUploadMetadata.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaUploadMetadata(appAttributionNamespace=");
        sb.append(this.A03);
        sb.append(", appAttributionId=");
        sb.append(this.A02);
        sb.append(", uploadMediaSource=");
        sb.append(this.A09);
        sb.append(", albumName=");
        sb.append(this.A01);
        sb.append(", metaGalleryMediaId=");
        sb.append(this.A08);
        sb.append(", wearablesMediaId=");
        sb.append(this.A0A);
        sb.append(", attributedDeviceName=");
        sb.append(this.A05);
        sb.append(", appAttributionRawNamespace=");
        sb.append(this.A04);
        sb.append(", isMetaGallery=");
        sb.append(this.A0B);
        sb.append(", externalShareAppNamespace=");
        sb.append(this.A06);
        sb.append(", horizonWorldId=");
        sb.append(this.A07);
        sb.append(", immersiveMediaFields=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A09);
        parcel.writeString(this.A01);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        ImmersiveMediaFields immersiveMediaFields = this.A00;
        if (immersiveMediaFields == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        immersiveMediaFields.writeToParcel(parcel, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a4, code lost:
        if (r4.A0B != false) goto L_0x00a6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(com.instagram.common.gallery.metadata.MediaUploadMetadata r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x00bb
            java.lang.String r3 = r5.A03
            r2 = 1
            if (r3 == 0) goto L_0x001f
            int r0 = r3.length()
            if (r0 == 0) goto L_0x001f
            X.3QN r1 = A0C
            java.lang.String r0 = r4.A03
            java.lang.String[] r0 = new java.lang.String[]{r0, r3}
            java.util.List r0 = X.0sr.A1P(r0)
            java.lang.String r0 = r1.A01(r0)
            r4.A03 = r0
        L_0x001f:
            java.lang.String r1 = r5.A02
            if (r1 == 0) goto L_0x002b
            int r0 = r1.length()
            if (r0 == 0) goto L_0x002b
            r4.A02 = r1
        L_0x002b:
            java.lang.String r1 = r5.A09
            if (r1 == 0) goto L_0x0037
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0037
            r4.A09 = r1
        L_0x0037:
            java.lang.String r1 = r5.A01
            if (r1 == 0) goto L_0x0061
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = r4.A01
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = X.0sr.A1P(r0)
            java.util.List r1 = X.00k.A0X(r0)
            java.util.List r0 = X.00k.A0W(r1)
            int r0 = r0.size()
            if (r0 != r2) goto L_0x00bc
            java.lang.Object r0 = X.00k.A0I(r1)
            java.lang.String r0 = (java.lang.String) r0
        L_0x005f:
            r4.A01 = r0
        L_0x0061:
            java.lang.String r1 = r5.A08
            if (r1 == 0) goto L_0x006d
            int r0 = r1.length()
            if (r0 == 0) goto L_0x006d
            r4.A08 = r1
        L_0x006d:
            java.lang.String r1 = r5.A0A
            if (r1 == 0) goto L_0x0079
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0079
            r4.A0A = r1
        L_0x0079:
            java.lang.String r1 = r5.A05
            if (r1 == 0) goto L_0x0085
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0085
            r4.A05 = r1
        L_0x0085:
            java.lang.String r1 = r5.A04
            if (r1 == 0) goto L_0x0091
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0091
            r4.A04 = r1
        L_0x0091:
            java.lang.String r1 = r5.A06
            if (r1 == 0) goto L_0x009d
            int r0 = r1.length()
            if (r0 == 0) goto L_0x009d
            r4.A06 = r1
        L_0x009d:
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x00a6
            boolean r1 = r4.A0B
            r0 = 0
            if (r1 == 0) goto L_0x00a7
        L_0x00a6:
            r0 = 1
        L_0x00a7:
            r4.A0B = r0
            java.lang.String r1 = r5.A07
            if (r1 == 0) goto L_0x00b5
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00b5
            r4.A07 = r1
        L_0x00b5:
            com.instagram.common.gallery.metadata.ImmersiveMediaFields r0 = r5.A00
            if (r0 == 0) goto L_0x00bb
            r4.A00 = r0
        L_0x00bb:
            return
        L_0x00bc:
            java.util.List r0 = X.00k.A0W(r1)
            int r0 = r0.size()
            if (r0 <= r2) goto L_0x00c9
            java.lang.String r0 = "MULTIPLE_ALBUM_NAMES"
            goto L_0x005f
        L_0x00c9:
            r0 = 0
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.gallery.metadata.MediaUploadMetadata.A00(com.instagram.common.gallery.metadata.MediaUploadMetadata):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0087, code lost:
        if (r2.A0B != false) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(com.instagram.common.gallery.metadata.MediaUploadMetadata r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x00a2
            java.lang.String r0 = r2.A03
            if (r0 == 0) goto L_0x000c
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0010
        L_0x000c:
            java.lang.String r0 = r3.A03
            r2.A03 = r0
        L_0x0010:
            java.lang.String r0 = r2.A02
            if (r0 == 0) goto L_0x001a
            int r0 = r0.length()
            if (r0 != 0) goto L_0x001e
        L_0x001a:
            java.lang.String r0 = r3.A02
            r2.A02 = r0
        L_0x001e:
            java.lang.String r0 = r2.A09
            if (r0 == 0) goto L_0x0028
            int r0 = r0.length()
            if (r0 != 0) goto L_0x002c
        L_0x0028:
            java.lang.String r0 = r3.A09
            r2.A09 = r0
        L_0x002c:
            java.lang.String r0 = r2.A01
            if (r0 == 0) goto L_0x0036
            int r0 = r0.length()
            if (r0 != 0) goto L_0x003a
        L_0x0036:
            java.lang.String r0 = r3.A01
            r2.A01 = r0
        L_0x003a:
            java.lang.String r0 = r2.A08
            if (r0 == 0) goto L_0x0044
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0048
        L_0x0044:
            java.lang.String r0 = r3.A08
            r2.A08 = r0
        L_0x0048:
            java.lang.String r0 = r2.A0A
            if (r0 == 0) goto L_0x0052
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0056
        L_0x0052:
            java.lang.String r0 = r3.A0A
            r2.A0A = r0
        L_0x0056:
            java.lang.String r0 = r2.A05
            if (r0 == 0) goto L_0x0060
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0064
        L_0x0060:
            java.lang.String r0 = r3.A05
            r2.A05 = r0
        L_0x0064:
            java.lang.String r0 = r2.A04
            if (r0 == 0) goto L_0x006e
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0072
        L_0x006e:
            java.lang.String r0 = r3.A04
            r2.A04 = r0
        L_0x0072:
            java.lang.String r0 = r2.A06
            if (r0 == 0) goto L_0x007c
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0080
        L_0x007c:
            java.lang.String r0 = r3.A06
            r2.A06 = r0
        L_0x0080:
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x0089
            boolean r1 = r2.A0B
            r0 = 0
            if (r1 == 0) goto L_0x008a
        L_0x0089:
            r0 = 1
        L_0x008a:
            r2.A0B = r0
            java.lang.String r0 = r2.A07
            if (r0 == 0) goto L_0x0096
            int r0 = r0.length()
            if (r0 != 0) goto L_0x009a
        L_0x0096:
            java.lang.String r0 = r3.A07
            r2.A07 = r0
        L_0x009a:
            com.instagram.common.gallery.metadata.ImmersiveMediaFields r0 = r2.A00
            if (r0 != 0) goto L_0x00a2
            com.instagram.common.gallery.metadata.ImmersiveMediaFields r0 = r3.A00
            r2.A00 = r0
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.gallery.metadata.MediaUploadMetadata.A01(com.instagram.common.gallery.metadata.MediaUploadMetadata):void");
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        String str = this.A03;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.A02;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.A09;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.A01;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.A08;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str6 = this.A0A;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str7 = this.A05;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str8 = this.A04;
        if (str8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str8.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        int i10 = 1237;
        if (this.A0B) {
            i10 = 1231;
        }
        int i11 = (i9 + i10) * 31;
        String str9 = this.A06;
        if (str9 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str9.hashCode();
        }
        int i12 = (i11 + hashCode9) * 31;
        String str10 = this.A07;
        if (str10 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str10.hashCode();
        }
        int i13 = (i12 + hashCode10) * 31;
        ImmersiveMediaFields immersiveMediaFields = this.A00;
        if (immersiveMediaFields != null) {
            i = immersiveMediaFields.hashCode();
        }
        return i13 + i;
    }

    public MediaUploadMetadata(ImmersiveMediaFields immersiveMediaFields, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z) {
        this.A03 = str;
        this.A02 = str2;
        this.A09 = str3;
        this.A01 = str4;
        this.A08 = str5;
        this.A0A = str6;
        this.A05 = str7;
        this.A04 = str8;
        this.A0B = z;
        this.A06 = str9;
        this.A07 = str10;
        this.A00 = immersiveMediaFields;
    }

    public MediaUploadMetadata() {
        this((ImmersiveMediaFields) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false);
    }
}
