package com.instagram.model.mediasize;

import X.AnonymousClass16c;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.GifUrlLoggingExtras;
import java.util.concurrent.TimeUnit;

public final class GifUrlImpl implements Parcelable, AnonymousClass16c {
    public static final Parcelable.Creator CREATOR = new C376399Hv(31);
    public GifUrlLoggingExtras A00;
    public GifUrlImpl A01;
    public Float A02;
    public Float A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public String A08;
    public String A09;
    public String A0A;

    public final int describeContents() {
        return 0;
    }

    public final Long B2i() {
        Long l = this.A07;
        if (l != null) {
            return Long.valueOf(TimeUnit.MICROSECONDS.toMillis(l.longValue()));
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object B3m() {
        return this.A01;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A03.floatValue());
        parcel.writeFloat(this.A02.floatValue());
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A08);
        int i2 = 0;
        if (this.A07 != null) {
            i2 = 1;
        }
        parcel.writeInt(i2);
        Long l = this.A07;
        if (l != null) {
            parcel.writeLong(l.longValue());
        }
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
    }

    public GifUrlImpl(String str, float f, float f2) {
        this.A09 = str;
        this.A03 = Float.valueOf(f);
        this.A02 = Float.valueOf(f2);
    }

    public GifUrlImpl(String str, String str2, float f, float f2) {
        this.A09 = str;
        this.A0A = str2;
        this.A03 = Float.valueOf(f);
        this.A02 = Float.valueOf(f2);
    }

    public GifUrlImpl(Integer num, Integer num2, Integer num3, String str, String str2, String str3, float f, float f2) {
        this.A09 = str;
        this.A0A = str2;
        this.A08 = str3;
        this.A03 = Float.valueOf(f);
        this.A02 = Float.valueOf(f2);
        this.A05 = num;
        this.A06 = num2;
        this.A04 = num3;
    }

    public GifUrlImpl() {
    }
}
