package com.instagram.discovery.mediamap.model;

import X.0KC;
import X.17W;
import X.1Xj;
import X.2PP;
import X.AnonymousClass15o;
import X.AnonymousClass3HR;
import X.AnonymousClass3HX;
import X.C16557Ux9;
import X.C18231Vnv;
import X.C232262tL;
import X.C267324bN;
import X.C275974sH;
import X.C276014sL;
import X.C295325ny;
import X.W6E;
import X.XCL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.maps.model.LatLng;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.Venue;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;

public final class MediaMapPin implements C232262tL, Parcelable, XCL {
    public static final Parcelable.Creator CREATOR = new W6E(33);
    public int A00;
    public long A01;
    public LatLng A02;
    public C276014sL A03;
    public ImageUrl A04;
    public ImageUrl A05;
    public LocationPageInformation A06;
    public C16557Ux9 A07;
    public AnonymousClass3HX A08;
    public LocationDict A09;
    public Double A0A;
    public Double A0B;
    public String A0C;
    public String A0D;
    public ArrayList A0E;
    public boolean A0F;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MediaMapPin mediaMapPin = (MediaMapPin) obj;
            if (!2PP.A00(this.A0A, mediaMapPin.A0A) || !2PP.A00(this.A0B, mediaMapPin.A0B) || !2PP.A00(C18231Vnv.A00(this.A09), C18231Vnv.A00(mediaMapPin.A09)) || !2PP.A00(this.A0D, mediaMapPin.A0D) || !2PP.A00(this.A05, mediaMapPin.A05) || !2PP.A00(this.A06, mediaMapPin.A06) || !2PP.A00(this.A02, mediaMapPin.A02) || !2PP.A00(Long.valueOf(this.A01), Long.valueOf(mediaMapPin.A01)) || !2PP.A00(Integer.valueOf(this.A00), Integer.valueOf(mediaMapPin.A00)) || !2PP.A00(this.A0E, mediaMapPin.A0E) || !2PP.A00(this.A0C, mediaMapPin.A0C) || !2PP.A00(this.A04, mediaMapPin.A04) || !2PP.A00(this.A08, mediaMapPin.A08) || !2PP.A00(this.A03, mediaMapPin.A03) || !2PP.A00(this.A07, mediaMapPin.A07)) {
                return false;
            }
        }
        return true;
    }

    public final ImageUrl A00() {
        1Xj r1;
        C276014sL r0 = this.A03;
        if (r0 == null || (r1 = r0.A00) == null) {
            ImageUrl imageUrl = this.A04;
            if (imageUrl == null) {
                return this.A05;
            }
            return imageUrl;
        } else if (r1.A1Q() != null) {
            return r1.A1Q();
        } else {
            return r1.A1l();
        }
    }

    /* renamed from: A01 */
    public final MediaMapPin clone() {
        C267324bN r2;
        Double d = this.A0A;
        Double d2 = this.A0B;
        LocationDict locationDict = this.A09;
        String str = this.A0D;
        ImageUrl imageUrl = this.A05;
        long j = this.A01;
        int i = this.A00;
        ArrayList arrayList = this.A0E;
        String str2 = this.A0C;
        ImageUrl imageUrl2 = this.A04;
        AnonymousClass3HX r7 = this.A08;
        C16557Ux9 ux9 = this.A07;
        LocationPageInformation locationPageInformation = this.A06;
        boolean z = this.A0F;
        C276014sL r1 = this.A03;
        if (r1 != null) {
            r2 = C295325ny.A02(r1);
        } else {
            r2 = null;
        }
        return new MediaMapPin(r2, imageUrl, imageUrl2, locationPageInformation, ux9, r7, locationDict, d, d2, str, str2, arrayList, i, j, z);
    }

    public final LatLng Bdm() {
        LatLng latLng = this.A02;
        if (latLng != null) {
            return latLng;
        }
        LatLng latLng2 = new LatLng(this.A0A.doubleValue(), this.A0B.doubleValue());
        this.A02 = latLng2;
        return latLng2;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = this.A00;
        int i2 = ((MediaMapPin) obj).A00;
        if (i == i2) {
            return 0;
        }
        if (i < i2) {
            return -1;
        }
        return 1;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0A, this.A0B, C18231Vnv.A00(this.A09), this.A0D, this.A05, this.A06, this.A02, Long.valueOf(this.A01), Integer.valueOf(this.A00), this.A0E, this.A0C, this.A04, this.A08, this.A03, this.A07});
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return C18231Vnv.A01((MediaMapPin) obj).equals(C18231Vnv.A01(this));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        double doubleValue;
        parcel.writeParcelable(this.A09, i);
        Double d = this.A0A;
        double d2 = 0.0d;
        if (d == null) {
            doubleValue = 0.0d;
        } else {
            doubleValue = d.doubleValue();
        }
        parcel.writeDouble(doubleValue);
        Double d3 = this.A0B;
        if (d3 != null) {
            d2 = d3.doubleValue();
        }
        parcel.writeDouble(d2);
        parcel.writeString(this.A0D);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A06, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeList(this.A0E);
        parcel.writeString(this.A0C);
        parcel.writeParcelable(this.A04, i);
        AnonymousClass3HX r3 = this.A08;
        String str = null;
        if (r3 != null) {
            try {
                StringWriter stringWriter = new StringWriter();
                17W A0A2 = AnonymousClass15o.A00.A0A(stringWriter);
                AnonymousClass3HR.A00(A0A2, r3);
                A0A2.close();
                str = stringWriter.toString();
            } catch (IOException unused) {
            }
        }
        parcel.writeString(str);
        C276014sL r2 = this.A03;
        String str2 = null;
        if (r2 != null) {
            try {
                StringWriter stringWriter2 = new StringWriter();
                17W A0A3 = AnonymousClass15o.A00.A0A(stringWriter2);
                C275974sH.A00(A0A3, r2);
                A0A3.close();
                str2 = stringWriter2.toString();
            } catch (IOException e) {
                0KC.A0G("MediaMapPin", "failed to parcel clips item to json", e);
            }
        }
        parcel.writeString(str2);
        parcel.writeString(this.A07.A00);
        parcel.writeInt(this.A0F ? 1 : 0);
    }

    public MediaMapPin(C267324bN r5, ImageUrl imageUrl, ImageUrl imageUrl2, LocationPageInformation locationPageInformation, C16557Ux9 ux9, AnonymousClass3HX r10, LocationDict locationDict, Double d, Double d2, String str, String str2, ArrayList arrayList, int i, long j, boolean z) {
        double doubleValue;
        double d3 = 0.0d;
        if (d == null) {
            doubleValue = 0.0d;
        } else {
            doubleValue = d.doubleValue();
        }
        this.A0A = Double.valueOf(doubleValue);
        this.A0B = Double.valueOf(d2 != null ? d2.doubleValue() : d3);
        this.A09 = locationDict;
        this.A0D = str;
        this.A05 = imageUrl;
        this.A01 = j;
        this.A00 = i;
        this.A0E = arrayList;
        this.A0C = str2;
        this.A04 = imageUrl2;
        this.A08 = r10;
        this.A07 = ux9;
        this.A06 = locationPageInformation;
        this.A0F = z;
        this.A03 = C295325ny.A00(r5);
    }

    public final String getId() {
        return C18231Vnv.A01(this);
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return C18231Vnv.A01(this);
    }

    public MediaMapPin(ImageUrl imageUrl, LocationPageInformation locationPageInformation, C16557Ux9 ux9, Venue venue, Double d, Double d2, String str, long j) {
        this((C267324bN) null, imageUrl, (ImageUrl) null, locationPageInformation, ux9, (AnonymousClass3HX) null, venue.A00.FG5(), d, d2, str, (String) null, (ArrayList) null, 0, j, false);
    }

    public MediaMapPin() {
    }
}
