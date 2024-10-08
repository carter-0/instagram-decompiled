package com.google.android.gms.vision.barcode;

import X.C301145yd;
import X.Pxf;
import X.Pxi;
import X.SWR;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class Barcode extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(79);
    public int A00;
    public int A01;
    public CalendarEvent A02;
    public ContactInfo A03;
    public DriverLicense A04;
    public Email A05;
    public GeoPoint A06;
    public Phone A07;
    public Sms A08;
    public UrlBookmark A09;
    public WiFi A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public byte[] A0E;
    public Point[] A0F;

    public class Address extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = SWR.A00(78);
        public int A00;
        public String[] A01;

        public final void writeToParcel(Parcel parcel, int i) {
            int A03 = Pxf.A03(parcel);
            C301145yd.A07(parcel, 2, this.A00);
            C301145yd.A0H(parcel, this.A01, 3);
            C301145yd.A06(parcel, A03);
        }
    }

    public class CalendarDateTime extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = SWR.A00(80);
        public int A00;
        public int A01;
        public int A02;
        public int A03;
        public int A04;
        public int A05;
        public String A06;
        public boolean A07;

        public final void writeToParcel(Parcel parcel, int i) {
            int A032 = Pxf.A03(parcel);
            C301145yd.A07(parcel, 2, this.A05);
            C301145yd.A07(parcel, 3, this.A03);
            C301145yd.A07(parcel, 4, this.A00);
            C301145yd.A07(parcel, 5, this.A01);
            C301145yd.A07(parcel, 6, this.A02);
            C301145yd.A07(parcel, 7, this.A04);
            C301145yd.A09(parcel, 8, this.A07);
            C301145yd.A0C(parcel, this.A06, 9, false);
            C301145yd.A06(parcel, A032);
        }
    }

    public class CalendarEvent extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = SWR.A00(82);
        public CalendarDateTime A00;
        public CalendarDateTime A01;
        public String A02;
        public String A03;
        public String A04;
        public String A05;
        public String A06;

        public final void writeToParcel(Parcel parcel, int i) {
            int A032 = Pxf.A03(parcel);
            C301145yd.A0B(parcel, this.A06);
            C301145yd.A0C(parcel, this.A02, 3, false);
            C301145yd.A0C(parcel, this.A03, 4, false);
            C301145yd.A0C(parcel, this.A04, 5, false);
            C301145yd.A0C(parcel, this.A05, 6, false);
            C301145yd.A0A(parcel, this.A01, 7, i, false);
            C301145yd.A0A(parcel, this.A00, 8, i, false);
            C301145yd.A06(parcel, A032);
        }
    }

    public class ContactInfo extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = SWR.A00(81);
        public PersonName A00;
        public String A01;
        public String A02;
        public Address[] A03;
        public Email[] A04;
        public Phone[] A05;
        public String[] A06;

        public final void writeToParcel(Parcel parcel, int i) {
            int A032 = Pxf.A03(parcel);
            boolean A1R = Pxi.A1R(parcel, this.A00, i);
            C301145yd.A0C(parcel, this.A01, 3, A1R);
            C301145yd.A0C(parcel, this.A02, 4, A1R);
            C301145yd.A0G(parcel, this.A05, 5, i);
            C301145yd.A0G(parcel, this.A04, 6, i);
            C301145yd.A0H(parcel, this.A06, 7);
            C301145yd.A0G(parcel, this.A03, 8, i);
            C301145yd.A06(parcel, A032);
        }
    }

    public class DriverLicense extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = SWR.A00(84);
        public String A00;
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
        public String A0B;
        public String A0C;
        public String A0D;

        public final void writeToParcel(Parcel parcel, int i) {
            int A032 = Pxf.A03(parcel);
            C301145yd.A0B(parcel, this.A05);
            C301145yd.A0C(parcel, this.A07, 3, false);
            C301145yd.A0C(parcel, this.A0D, 4, false);
            C301145yd.A0C(parcel, this.A0B, 5, false);
            C301145yd.A0C(parcel, this.A08, 6, false);
            C301145yd.A0C(parcel, this.A02, 7, false);
            C301145yd.A0C(parcel, this.A00, 8, false);
            C301145yd.A0C(parcel, this.A01, 9, false);
            C301145yd.A0C(parcel, this.A03, 10, false);
            C301145yd.A0C(parcel, this.A0C, 11, false);
            C301145yd.A0C(parcel, this.A09, 12, false);
            C301145yd.A0C(parcel, this.A06, 13, false);
            C301145yd.A0C(parcel, this.A04, 14, false);
            C301145yd.A0C(parcel, this.A0A, 15, false);
            C301145yd.A06(parcel, A032);
        }
    }

    public class Email extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = SWR.A00(83);
        public int A00;
        public String A01;
        public String A02;
        public String A03;

        public final void writeToParcel(Parcel parcel, int i) {
            int A032 = Pxf.A03(parcel);
            C301145yd.A07(parcel, 2, this.A00);
            C301145yd.A0C(parcel, this.A01, 3, false);
            C301145yd.A0C(parcel, this.A03, 4, false);
            C301145yd.A0C(parcel, this.A02, 5, false);
            C301145yd.A06(parcel, A032);
        }
    }

    public class GeoPoint extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = SWR.A00(86);
        public double A00;
        public double A01;

        public final void writeToParcel(Parcel parcel, int i) {
            int A03 = Pxf.A03(parcel);
            double d = this.A00;
            parcel.writeInt(524290);
            parcel.writeDouble(d);
            double d2 = this.A01;
            parcel.writeInt(524291);
            parcel.writeDouble(d2);
            C301145yd.A06(parcel, A03);
        }
    }

    public class PersonName extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = SWR.A00(85);
        public String A00;
        public String A01;
        public String A02;
        public String A03;
        public String A04;
        public String A05;
        public String A06;

        public final void writeToParcel(Parcel parcel, int i) {
            int A032 = Pxf.A03(parcel);
            C301145yd.A0B(parcel, this.A01);
            C301145yd.A0C(parcel, this.A05, 3, false);
            C301145yd.A0C(parcel, this.A04, 4, false);
            C301145yd.A0C(parcel, this.A00, 5, false);
            C301145yd.A0C(parcel, this.A03, 6, false);
            C301145yd.A0C(parcel, this.A02, 7, false);
            C301145yd.A0C(parcel, this.A06, 8, false);
            C301145yd.A06(parcel, A032);
        }
    }

    public class Phone extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = SWR.A00(88);
        public int A00;
        public String A01;

        public final void writeToParcel(Parcel parcel, int i) {
            int A03 = Pxf.A03(parcel);
            C301145yd.A07(parcel, 2, this.A00);
            C301145yd.A0C(parcel, this.A01, 3, false);
            C301145yd.A06(parcel, A03);
        }
    }

    public class Sms extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = SWR.A00(87);
        public String A00;
        public String A01;

        public final void writeToParcel(Parcel parcel, int i) {
            int A03 = Pxf.A03(parcel);
            C301145yd.A0B(parcel, this.A00);
            Pxf.A1A(parcel, this.A01, A03, false);
        }
    }

    public class UrlBookmark extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = SWR.A00(90);
        public String A00;
        public String A01;

        public final void writeToParcel(Parcel parcel, int i) {
            int A03 = Pxf.A03(parcel);
            C301145yd.A0B(parcel, this.A00);
            Pxf.A1A(parcel, this.A01, A03, false);
        }
    }

    public class WiFi extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = SWR.A00(89);
        public int A00;
        public String A01;
        public String A02;

        public final void writeToParcel(Parcel parcel, int i) {
            int A03 = Pxf.A03(parcel);
            C301145yd.A0B(parcel, this.A02);
            C301145yd.A0C(parcel, this.A01, 3, false);
            Pxi.A12(parcel, this.A00, A03);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A07(parcel, 2, this.A00);
        C301145yd.A0C(parcel, this.A0C, 3, false);
        C301145yd.A0C(parcel, this.A0B, 4, false);
        C301145yd.A07(parcel, 5, this.A01);
        C301145yd.A0G(parcel, this.A0F, 6, i);
        C301145yd.A0A(parcel, this.A05, 7, i, false);
        C301145yd.A0A(parcel, this.A07, 8, i, false);
        C301145yd.A0A(parcel, this.A08, 9, i, false);
        C301145yd.A0A(parcel, this.A0A, 10, i, false);
        C301145yd.A0A(parcel, this.A09, 11, i, false);
        C301145yd.A0A(parcel, this.A06, 12, i, false);
        C301145yd.A0A(parcel, this.A02, 13, i, false);
        C301145yd.A0A(parcel, this.A03, 14, i, false);
        C301145yd.A0A(parcel, this.A04, 15, i, false);
        C301145yd.A0F(parcel, this.A0E, 16, false);
        C301145yd.A09(parcel, 17, this.A0D);
        C301145yd.A06(parcel, A032);
    }
}
