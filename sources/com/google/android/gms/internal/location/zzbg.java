package com.google.android.gms.internal.location;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C301145yd;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.Pxh;
import X.Pxi;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;

public final class zzbg extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(24);
    public final String A00;
    public final double A01;
    public final double A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final short A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof zzbg)) {
                zzbg zzbg = (zzbg) obj;
                if (!(this.A03 == zzbg.A03 && this.A01 == zzbg.A01 && this.A02 == zzbg.A02 && this.A08 == zzbg.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.A01);
        return ((AnonymousClass7TF.A00(AnonymousClass7TF.A01(Double.doubleToLongBits(this.A02), (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31), this.A03) + this.A08) * 31) + this.A04;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        if (this.A08 != 1) {
            str = null;
        } else {
            str = "CIRCLE";
        }
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", new Object[]{str, this.A00.replaceAll("\\p{C}", "?"), Integer.valueOf(this.A04), Double.valueOf(this.A01), Double.valueOf(this.A02), Float.valueOf(this.A03), Integer.valueOf(this.A05 / IgNetworkConsentStorage.MAX_ENTRIES), Integer.valueOf(this.A06), Long.valueOf(this.A07)});
    }

    public zzbg(String str, double d, double d2, float f, int i, int i2, int i3, long j, short s) {
        if (str == null || str.length() > 100) {
            throw AnonymousClass7TE.A0w(Pxh.A0m("requestId is null or too long: ", str));
        } else if (f <= 0.0f) {
            StringBuilder A14 = Pxe.A14(31);
            A14.append("invalid radius: ");
            A14.append(f);
            throw AnonymousClass7TE.A0w(A14.toString());
        } else if (d > 90.0d || d < -90.0d) {
            StringBuilder A142 = Pxe.A14(42);
            A142.append("invalid latitude: ");
            A142.append(d);
            throw AnonymousClass7TE.A0w(A142.toString());
        } else if (d2 > 180.0d || d2 < -180.0d) {
            StringBuilder A143 = Pxe.A14(43);
            A143.append("invalid longitude: ");
            A143.append(d2);
            throw AnonymousClass7TE.A0w(A143.toString());
        } else {
            int i4 = i & 7;
            if (i4 != 0) {
                this.A08 = s;
                this.A00 = str;
                this.A01 = d;
                this.A02 = d2;
                this.A03 = f;
                this.A07 = j;
                this.A04 = i4;
                this.A05 = i2;
                this.A06 = i3;
                return;
            }
            throw AnonymousClass7TE.A0w(Pxg.A0t("No supported transition specified: ", Pxe.A14(46), i));
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        Pxi.A13(parcel, this.A00);
        C301145yd.A08(parcel, 2, this.A07);
        short s = this.A08;
        parcel.writeInt(262147);
        parcel.writeInt(s);
        double d = this.A01;
        parcel.writeInt(524292);
        parcel.writeDouble(d);
        double d2 = this.A02;
        parcel.writeInt(524293);
        parcel.writeDouble(d2);
        C301145yd.A04(parcel, this.A03, 6);
        C301145yd.A07(parcel, 7, this.A04);
        C301145yd.A07(parcel, 8, this.A05);
        C301145yd.A07(parcel, 9, this.A06);
        C301145yd.A06(parcel, A032);
    }
}
