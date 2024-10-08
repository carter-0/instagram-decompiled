package com.google.android.gms.auth.api.identity;

import X.AnonymousClass3Qk;
import X.C301145yd;
import X.Pxf;
import X.SA1;
import X.SWW;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

public final class AuthorizationResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(91);
    public final PendingIntent A00;
    public final GoogleSignInAccount A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationResult)) {
            return false;
        }
        AuthorizationResult authorizationResult = (AuthorizationResult) obj;
        if (!SA1.A01(this.A02, authorizationResult.A02) || !SA1.A01(this.A03, authorizationResult.A03) || !SA1.A01(this.A05, authorizationResult.A05) || !SA1.A01(this.A04, authorizationResult.A04) || !SA1.A01(this.A00, authorizationResult.A00)) {
            return false;
        }
        return SA1.A00(this.A01, authorizationResult.A01);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A03, this.A05, this.A04, this.A00, this.A01});
    }

    public AuthorizationResult(PendingIntent pendingIntent, GoogleSignInAccount googleSignInAccount, String str, String str2, String str3, List list) {
        this.A02 = str;
        this.A03 = str2;
        this.A05 = str3;
        AnonymousClass3Qk.A02(list);
        this.A04 = list;
        this.A00 = pendingIntent;
        this.A01 = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        boolean A1S = Pxf.A1S(parcel, this.A02);
        C301145yd.A0B(parcel, this.A03);
        C301145yd.A0C(parcel, this.A05, 3, A1S);
        C301145yd.A0D(parcel, this.A04, 4);
        C301145yd.A0A(parcel, this.A01, 5, i, A1S);
        C301145yd.A0A(parcel, this.A00, 6, i, A1S);
        C301145yd.A06(parcel, A032);
    }
}
