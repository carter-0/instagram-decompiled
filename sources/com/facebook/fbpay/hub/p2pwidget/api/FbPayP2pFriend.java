package com.facebook.fbpay.hub.p2pwidget.api;

import X.0qQ;
import X.C11367SPk;
import X.C51971G9r;
import X.Pxf;
import X.Pxj;
import X.SWS;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public class FbPayP2pFriend implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(84);
    public final Uri A00;
    public final Uri A01;
    public final Uri A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayP2pFriend) {
                FbPayP2pFriend fbPayP2pFriend = (FbPayP2pFriend) obj;
                if (!0qQ.A0K(this.A03, fbPayP2pFriend.A03) || !0qQ.A0K(this.A04, fbPayP2pFriend.A04) || !0qQ.A0K(this.A05, fbPayP2pFriend.A05) || !0qQ.A0K(this.A00, fbPayP2pFriend.A00) || !0qQ.A0K(this.A01, fbPayP2pFriend.A01) || !0qQ.A0K(this.A02, fbPayP2pFriend.A02) || !0qQ.A0K(this.A06, fbPayP2pFriend.A06) || !0qQ.A0K(this.A07, fbPayP2pFriend.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((C11367SPk.A01(this.A03) * 31) + C51971G9r.A0E(this.A04)) * 31) + C51971G9r.A0E(this.A05)) * 31) + C51971G9r.A0E(this.A00)) * 31) + C51971G9r.A0E(this.A01)) * 31) + C51971G9r.A0E(this.A02)) * 31) + C51971G9r.A0E(this.A06)) * 31) + C51971G9r.A0E(this.A07);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxj.A1B(parcel, this.A03, 0, 1);
        Pxj.A1B(parcel, this.A04, 0, 1);
        Pxj.A1B(parcel, this.A05, 0, 1);
        Pxj.A18(parcel, this.A00, i);
        Pxj.A18(parcel, this.A01, i);
        Pxj.A18(parcel, this.A02, i);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
    }

    public FbPayP2pFriend(Parcel parcel) {
        ClassLoader A0W = Pxf.A0W(this);
        Uri uri = null;
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (Uri) parcel.readParcelable(A0W);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (Uri) parcel.readParcelable(A0W);
        }
        this.A02 = parcel.readInt() != 0 ? (Uri) parcel.readParcelable(A0W) : uri;
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
    }
}
