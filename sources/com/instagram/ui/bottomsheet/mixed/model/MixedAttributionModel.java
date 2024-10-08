package com.instagram.ui.bottomsheet.mixed.model;

import X.002;
import X.0oU;
import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C232262tL;
import X.Pxg;
import X.W6F;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

public class MixedAttributionModel implements C232262tL, Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(75);
    public Drawable A00;
    public Object A01;
    public final ImageUrl A02;
    public final MixedAttributionType A03;
    public final String A04;
    public final String A05;

    public enum MixedAttributionType implements Parcelable {
        MUSIC_ATTRIBUTION,
        EFFECT_ATTRIBUTION,
        CAMERA_FORMAT_ATTRIBUTION,
        AVATAR_ATTRIBUTION;
        
        public static final Parcelable.Creator CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        /* access modifiers changed from: public */
        static {
            MixedAttributionType[] mixedAttributionTypeArr;
            A00 = 0oU.A00(mixedAttributionTypeArr);
            CREATOR = new W6F(76);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            Pxg.A1G(parcel, this);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        this.A03.writeToParcel(parcel, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A02, i);
    }

    public final void A00(Drawable drawable, Object obj) {
        this.A01 = obj;
        if (drawable != null) {
            this.A00 = drawable;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* renamed from: A01 */
    public boolean isContentSame(MixedAttributionModel mixedAttributionModel) {
        String str;
        if (mixedAttributionModel != null) {
            str = 002.A0R(mixedAttributionModel.A04, mixedAttributionModel.A05);
        } else {
            str = null;
        }
        return 0qQ.A0K(str, 002.A0R(this.A04, this.A05));
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return 002.A0R(this.A04, this.A05);
    }

    public MixedAttributionModel(ImageUrl imageUrl, MixedAttributionType mixedAttributionType, String str, String str2) {
        AnonymousClass7TG.A1U(mixedAttributionType, str, str2);
        this.A03 = mixedAttributionType;
        this.A04 = str;
        this.A05 = str2;
        this.A02 = imageUrl;
    }
}
