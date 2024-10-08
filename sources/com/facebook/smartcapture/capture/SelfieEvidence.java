package com.facebook.smartcapture.capture;

import X.0qQ;
import X.AnonymousClass7TG;
import X.C11367SPk;
import X.C249803kO;
import X.C41847B3o;
import X.C41848B3p;
import X.C51971G9r;
import X.Pxi;
import X.Pxj;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

public class SelfieEvidence implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(53);
    public final ImmutableList A00;
    public final Float A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Long A05;
    public final String A06;
    public final String A07;

    public SelfieEvidence(ImmutableList immutableList, Float f, Integer num, Integer num2, Integer num3, Long l, String str, String str2) {
        this.A06 = str;
        this.A00 = immutableList;
        this.A02 = num;
        this.A01 = f;
        this.A03 = num2;
        this.A07 = str2;
        this.A05 = l;
        this.A04 = num3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SelfieEvidence) {
                SelfieEvidence selfieEvidence = (SelfieEvidence) obj;
                if (!0qQ.A0K(this.A06, selfieEvidence.A06) || !0qQ.A0K(this.A00, selfieEvidence.A00) || !0qQ.A0K(this.A02, selfieEvidence.A02) || !0qQ.A0K(this.A01, selfieEvidence.A01) || !0qQ.A0K(this.A03, selfieEvidence.A03) || !0qQ.A0K(this.A07, selfieEvidence.A07) || !0qQ.A0K(this.A05, selfieEvidence.A05) || !0qQ.A0K(this.A04, selfieEvidence.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((C11367SPk.A01(this.A06) * 31) + C51971G9r.A0E(this.A00)) * 31) + C51971G9r.A0E(this.A02)) * 31) + C51971G9r.A0E(this.A01)) * 31) + C51971G9r.A0E(this.A03)) * 31) + C51971G9r.A0E(this.A07)) * 31) + C51971G9r.A0E(this.A05)) * 31) + C51971G9r.A0E(this.A04);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxj.A1B(parcel, this.A06, 0, 1);
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C249803kO A0P = Pxi.A0P(parcel, immutableList);
            while (A0P.hasNext()) {
                Pxi.A15(parcel, A0P);
            }
        }
        AnonymousClass7TG.A16(parcel, this.A02, 0, 1);
        Float f = this.A01;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        AnonymousClass7TG.A16(parcel, this.A03, 0, 1);
        Pxj.A1B(parcel, this.A07, 0, 1);
        C41848B3p.A1K(parcel, this.A05);
        AnonymousClass7TG.A16(parcel, this.A04, 0, 1);
    }

    public SelfieEvidence(Parcel parcel) {
        Integer num = null;
        if (Pxj.A0A(parcel, this) == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            for (int i = 0; i < readInt; i++) {
                strArr[i] = parcel.readString();
            }
            this.A00 = ImmutableList.copyOf((Object[]) strArr);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = C41847B3o.A12(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = Float.valueOf(parcel.readFloat());
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = C41847B3o.A12(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = Pxi.A0T(parcel);
        }
        this.A04 = parcel.readInt() != 0 ? C41847B3o.A12(parcel) : num;
    }
}
