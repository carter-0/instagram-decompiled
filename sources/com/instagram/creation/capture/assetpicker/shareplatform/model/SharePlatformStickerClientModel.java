package com.instagram.creation.capture.assetpicker.shareplatform.model;

import X.0qQ;
import X.0sn;
import X.AnonymousClass05K;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C273914nO;
import X.C2802350v;
import X.C391049sG;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import java.util.List;

public final class SharePlatformStickerClientModel extends AnonymousClass0T0 implements Parcelable, C2802350v {
    public static final Parcelable.Creator CREATOR = new LVP(11);
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public MediaUploadMetadata A07;
    public C391049sG A08;
    public String A09;
    public String A0A;
    public boolean A0B;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SharePlatformStickerClientModel) {
                SharePlatformStickerClientModel sharePlatformStickerClientModel = (SharePlatformStickerClientModel) obj;
                if (!(0qQ.A0K(this.A07, sharePlatformStickerClientModel.A07) && 0qQ.A0K(this.A09, sharePlatformStickerClientModel.A09) && 0qQ.A0K(this.A0A, sharePlatformStickerClientModel.A0A) && this.A03 == sharePlatformStickerClientModel.A03 && this.A02 == sharePlatformStickerClientModel.A02 && this.A04 == sharePlatformStickerClientModel.A04 && this.A06 == sharePlatformStickerClientModel.A06 && this.A05 == sharePlatformStickerClientModel.A05 && this.A0B == sharePlatformStickerClientModel.A0B && this.A08 == sharePlatformStickerClientModel.A08 && Float.compare(this.A01, sharePlatformStickerClientModel.A01) == 0 && Float.compare(this.A00, sharePlatformStickerClientModel.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A07, i);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A0B ? 1 : 0);
        AnonymousClass7TE.A1T(parcel, this.A08);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
    }

    public final /* synthetic */ List B5h() {
        return 0sn.A00;
    }

    public final Integer CAk() {
        return AnonymousClass05K.A0m;
    }

    public final int hashCode() {
        String str = this.A0A;
        return AnonymousClass7TF.A00(AnonymousClass7TF.A07(this.A08, AnonymousClass7TF.A09(this.A0B, (((((((((AnonymousClass7TF.A08(str, (AnonymousClass7TE.A0K(this.A07) + AnonymousClass7TG.A0E(this.A09)) * 31) + this.A03) * 31) + this.A02) * 31) + this.A04) * 31) + this.A06) * 31) + this.A05) * 31)), this.A01) + Float.floatToIntBits(this.A00);
    }

    public SharePlatformStickerClientModel(MediaUploadMetadata mediaUploadMetadata, C391049sG r3, String str, String str2, float f, float f2, int i, int i2, int i3, int i4, int i5, boolean z) {
        AnonymousClass7TG.A1P(mediaUploadMetadata, str2);
        0qQ.A0B(r3, 10);
        this.A07 = mediaUploadMetadata;
        this.A09 = str;
        this.A0A = str2;
        this.A03 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A06 = i4;
        this.A05 = i5;
        this.A0B = z;
        this.A08 = r3;
        this.A01 = f;
        this.A00 = f2;
    }

    public final C273914nO BkW() {
        C273914nO A0C = AnonymousClass7TH.A0C();
        A0C.A06 = AnonymousClass7TE.A1I("share_platform_sticker_id");
        return A0C;
    }

    public SharePlatformStickerClientModel() {
        this(new MediaUploadMetadata((ImmersiveMediaFields) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false), C391049sG.UNKNOWN, (String) null, "", 0.0f, 0.0f, 0, 0, 0, 0, 0, false);
    }
}
