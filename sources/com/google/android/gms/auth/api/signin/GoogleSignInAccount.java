package com.google.android.gms.auth.api.signin;

import X.AnonymousClass7TE;
import X.C12562Sxn;
import X.C13473Tb0;
import X.C301145yd;
import X.C66580MXl;
import X.Pxf;
import X.SWX;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Deprecated
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final C13473Tb0 A0D = C12562Sxn.A00;
    public static final Parcelable.Creator CREATOR = SWX.A00(10);
    public String A00;
    public final int A01;
    public final long A02;
    public final Uri A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final Set A0C = AnonymousClass7TE.A1F();

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj != this) {
                if (obj instanceof GoogleSignInAccount) {
                    GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
                    if (googleSignInAccount.A08.equals(this.A08)) {
                        HashSet A12 = C66580MXl.A12(googleSignInAccount.A0B);
                        A12.addAll(googleSignInAccount.A0C);
                        HashSet A122 = C66580MXl.A12(this.A0B);
                        A122.addAll(this.A0C);
                        if (A12.equals(A122)) {
                            return true;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.A08.hashCode() + 527;
        HashSet A12 = C66580MXl.A12(this.A0B);
        A12.addAll(this.A0C);
        return (hashCode * 31) + A12.hashCode();
    }

    public GoogleSignInAccount(Uri uri, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i, long j) {
        this.A01 = i;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A03 = uri;
        this.A00 = str5;
        this.A02 = j;
        this.A08 = str6;
        this.A0B = list;
        this.A09 = str7;
        this.A0A = str8;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A05(parcel, this.A01);
        C301145yd.A0B(parcel, this.A04);
        C301145yd.A0C(parcel, this.A05, 3, false);
        C301145yd.A0C(parcel, this.A06, 4, false);
        C301145yd.A0C(parcel, this.A07, 5, false);
        C301145yd.A0A(parcel, this.A03, 6, i, false);
        C301145yd.A0C(parcel, this.A00, 7, false);
        C301145yd.A08(parcel, 8, this.A02);
        C301145yd.A0C(parcel, this.A08, 9, false);
        C301145yd.A0E(parcel, this.A0B, 10, false);
        C301145yd.A0C(parcel, this.A09, 11, false);
        C301145yd.A0C(parcel, this.A0A, 12, false);
        C301145yd.A06(parcel, A032);
    }
}
