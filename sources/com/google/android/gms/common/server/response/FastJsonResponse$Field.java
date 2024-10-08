package com.google.android.gms.common.server.response;

import X.AnonymousClass7TE;
import X.C13472Taz;
import X.C301145yd;
import X.Pxf;
import X.Pxi;
import X.S4O;
import X.SWX;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;

public class FastJsonResponse$Field extends AbstractSafeParcelable {
    public static final SWX CREATOR = SWX.A00(44);
    public zan A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C13472Taz A04;
    public final Class A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final int A0A;

    public static FastJsonResponse$Field A00(String str, int i) {
        return new FastJsonResponse$Field((Class) null, str, 7, 7, i, true, true);
    }

    public final String toString() {
        S4O s4o = new S4O(this);
        s4o.A00(Integer.valueOf(this.A0A), "versionCode");
        s4o.A00(Integer.valueOf(this.A01), "typeIn");
        s4o.A00(Boolean.valueOf(this.A08), "typeInArray");
        s4o.A00(Integer.valueOf(this.A02), "typeOut");
        s4o.A00(Boolean.valueOf(this.A09), "typeOutArray");
        s4o.A00(this.A06, "outputFieldName");
        s4o.A00(Integer.valueOf(this.A03), "safeParcelFieldId");
        String str = this.A07;
        if (str == null) {
            str = null;
        }
        s4o.A00(str, "concreteTypeName");
        Class cls = this.A05;
        if (cls != null) {
            s4o.A00(cls.getCanonicalName(), "concreteType.class");
        }
        C13472Taz taz = this.A04;
        if (taz != null) {
            s4o.A00(Pxf.A0g(taz), "converterName");
        }
        return s4o.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        zaa zaa;
        int A062 = Pxi.A06(parcel, this.A0A);
        C301145yd.A07(parcel, 2, this.A01);
        C301145yd.A09(parcel, 3, this.A08);
        C301145yd.A07(parcel, 4, this.A02);
        C301145yd.A09(parcel, 5, this.A09);
        C301145yd.A0C(parcel, this.A06, 6, false);
        C301145yd.A07(parcel, 7, this.A03);
        String str = this.A07;
        if (str == null) {
            str = null;
        }
        C301145yd.A0C(parcel, str, 8, false);
        C13472Taz taz = this.A04;
        if (taz == null) {
            zaa = null;
        } else if (taz instanceof StringToIntConverter) {
            zaa = new zaa((StringToIntConverter) taz);
        } else {
            throw AnonymousClass7TE.A0w("Unsupported safe parcelable field converter class.");
        }
        C301145yd.A0A(parcel, zaa, 9, i, false);
        C301145yd.A06(parcel, A062);
    }

    public FastJsonResponse$Field(zaa zaa, String str, String str2, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this.A0A = i;
        this.A01 = i2;
        this.A08 = z;
        this.A02 = i3;
        this.A09 = z2;
        this.A06 = str;
        this.A03 = i4;
        StringToIntConverter stringToIntConverter = null;
        if (str2 == null) {
            this.A05 = null;
            this.A07 = null;
        } else {
            this.A05 = SafeParcelResponse.class;
            this.A07 = str2;
        }
        if (zaa == null || (stringToIntConverter = zaa.A01) != null) {
            this.A04 = stringToIntConverter;
            return;
        }
        throw AnonymousClass7TE.A0z("There was no converter wrapped in this ConverterWrapper.");
    }

    public FastJsonResponse$Field(Class cls, String str, int i, int i2, int i3, boolean z, boolean z2) {
        String canonicalName;
        this.A0A = 1;
        this.A01 = i;
        this.A08 = z;
        this.A02 = i2;
        this.A09 = z2;
        this.A06 = str;
        this.A03 = i3;
        this.A05 = cls;
        if (cls == null) {
            canonicalName = null;
        } else {
            canonicalName = cls.getCanonicalName();
        }
        this.A07 = canonicalName;
        this.A04 = null;
    }
}
