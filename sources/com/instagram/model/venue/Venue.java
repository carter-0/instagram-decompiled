package com.instagram.model.venue;

import X.0lg;
import X.2PP;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.AnonymousClass1Nd;
import X.AnonymousClass1Xo;
import X.C21473Xc6;
import X.C243373Ym;
import X.C376399Hv;
import X.WQB;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Venue implements AnonymousClass1Xo, Parcelable {
    public static final Parcelable.Creator CREATOR = new C376399Hv(59);
    public LocationDictIntf A00 = new LocationDict((Boolean) null, (Boolean) null, (Float) null, (Float) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Venue venue = (Venue) obj;
            if (!2PP.A00(this.A00.getName(), venue.A00.getName()) || !2PP.A00(this.A00.getAddress(), venue.A00.getAddress()) || !2PP.A00(A00(), venue.A00()) || !2PP.A00(A01(), venue.A01()) || CbC() != venue.CbC()) {
                return false;
            }
        }
        return true;
    }

    public final Double A00() {
        if (this.A00.BLV() != null) {
            return Double.valueOf(this.A00.BLV().doubleValue());
        }
        return null;
    }

    public final Double A01() {
        if (this.A00.BNV() != null) {
            return Double.valueOf(this.A00.BNV().doubleValue());
        }
        return null;
    }

    public final String A03() {
        String externalSource = this.A00.getExternalSource();
        LocationDictIntf locationDictIntf = this.A00;
        if (externalSource != null) {
            return locationDictIntf.getExternalSource();
        }
        return locationDictIntf.B3A();
    }

    public final String A04() {
        if (this.A00.B3Y() != null) {
            return this.A00.B3Y().toString();
        }
        return null;
    }

    public final String A05() {
        if (this.A00.Bcn() != null) {
            return this.A00.Bcn().toString();
        }
        return "";
    }

    public final void A06(String str) {
        Long valueOf;
        C21473Xc6 AKd = this.A00.AKd();
        if (TextUtils.isEmpty(str)) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(Long.parseLong(str));
        }
        AKd.A03 = valueOf;
        this.A00 = AKd.A00();
    }

    public final C243373Ym BpO() {
        if (this.A00.BCR() == null || !this.A00.BCR().booleanValue()) {
            return C243373Ym.NOT_SAVED;
        }
        return C243373Ym.SAVED;
    }

    public final Collection BpQ() {
        return new ArrayList();
    }

    public final Integer BpT() {
        return AnonymousClass05K.A0C;
    }

    public final boolean CbC() {
        if (this.A00.BCR() == null || !this.A00.BCR().booleanValue()) {
            return false;
        }
        return true;
    }

    public final void EjB(C243373Ym r4) {
        C21473Xc6 AKd = this.A00.AKd();
        boolean z = false;
        if (r4 == C243373Ym.SAVED) {
            z = true;
        }
        AKd.A00 = Boolean.valueOf(z);
        this.A00 = AKd.A00();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00.getName(), this.A00.getAddress(), A00(), A01(), Boolean.valueOf(CbC())});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }

    public final String A02() {
        if (AnonymousClass000.A00(1337).equals(A03()) && this.A00.B3Y() != null) {
            return this.A00.B3Y().toString();
        }
        String B7n = this.A00.B7n();
        LocationDictIntf locationDictIntf = this.A00;
        if (B7n != null) {
            return locationDictIntf.B7n();
        }
        if (locationDictIntf.B39() != null) {
            return this.A00.B39();
        }
        return "";
    }

    public final void AE7(0lg r3) {
        AnonymousClass1Nd.A00(r3).A00(new WQB(this));
    }

    public final String BpP() {
        return A05();
    }
}
