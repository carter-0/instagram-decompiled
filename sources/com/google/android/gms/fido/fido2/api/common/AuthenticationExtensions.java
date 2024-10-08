package com.google.android.gms.fido.fido2.api.common;

import X.AnonymousClass7TE;
import X.C301145yd;
import X.C66584MXp;
import X.Pxf;
import X.Pxi;
import X.SA1;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class AuthenticationExtensions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(82);
    public final FidoAppIdExtension A00;
    public final UserVerificationMethodExtension A01;
    public final GoogleThirdPartyPaymentExtension A02;
    public final zzab A03;
    public final zzad A04;
    public final zzag A05;
    public final zzai A06;
    public final zzak A07;
    public final zzaw A08;
    public final zzs A09;
    public final zzu A0A;
    public final zzz A0B;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        if (!SA1.A01(this.A00, authenticationExtensions.A00) || !SA1.A01(this.A09, authenticationExtensions.A09) || !SA1.A01(this.A01, authenticationExtensions.A01) || !SA1.A01(this.A0B, authenticationExtensions.A0B) || !SA1.A01(this.A03, authenticationExtensions.A03) || !SA1.A01(this.A04, authenticationExtensions.A04) || !SA1.A01(this.A0A, authenticationExtensions.A0A) || !SA1.A01(this.A05, authenticationExtensions.A05) || !SA1.A01(this.A02, authenticationExtensions.A02) || !SA1.A01(this.A07, authenticationExtensions.A07) || !SA1.A01(this.A08, authenticationExtensions.A08)) {
            return false;
        }
        return SA1.A00(this.A06, authenticationExtensions.A06);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A09, this.A01, this.A0B, this.A03, this.A04, this.A0A, this.A05, this.A02, this.A07, this.A08, this.A06});
    }

    public final String toString() {
        zzaw zzaw = this.A08;
        zzak zzak = this.A07;
        GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = this.A02;
        zzag zzag = this.A05;
        zzu zzu = this.A0A;
        zzad zzad = this.A04;
        zzab zzab = this.A03;
        zzz zzz = this.A0B;
        UserVerificationMethodExtension userVerificationMethodExtension = this.A01;
        zzs zzs = this.A09;
        String valueOf = String.valueOf(this.A00);
        String valueOf2 = String.valueOf(zzs);
        String valueOf3 = String.valueOf(userVerificationMethodExtension);
        String valueOf4 = String.valueOf(zzz);
        String valueOf5 = String.valueOf(zzab);
        String valueOf6 = String.valueOf(zzad);
        String valueOf7 = String.valueOf(zzu);
        String valueOf8 = String.valueOf(zzag);
        String valueOf9 = String.valueOf(googleThirdPartyPaymentExtension);
        String valueOf10 = String.valueOf(zzak);
        String valueOf11 = String.valueOf(zzaw);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AuthenticationExtensions{\n fidoAppIdExtension=");
        A1A.append(valueOf);
        A1A.append(", \n cableAuthenticationExtension=");
        A1A.append(valueOf2);
        A1A.append(", \n userVerificationMethodExtension=");
        A1A.append(valueOf3);
        A1A.append(", \n googleMultiAssertionExtension=");
        A1A.append(valueOf4);
        A1A.append(", \n googleSessionIdExtension=");
        A1A.append(valueOf5);
        A1A.append(", \n googleSilentVerificationExtension=");
        A1A.append(valueOf6);
        A1A.append(", \n devicePublicKeyExtension=");
        A1A.append(valueOf7);
        A1A.append(", \n googleTunnelServerIdExtension=");
        A1A.append(valueOf8);
        A1A.append(", \n googleThirdPartyPaymentExtension=");
        A1A.append(valueOf9);
        A1A.append(", \n prfExtension=");
        A1A.append(valueOf10);
        A1A.append(", \n simpleTransactionAuthorizationExtension=");
        return C66584MXp.A0a(valueOf11, A1A);
    }

    public AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, UserVerificationMethodExtension userVerificationMethodExtension, zzab zzab, zzad zzad, zzag zzag, zzai zzai, zzak zzak, zzaw zzaw, zzs zzs, zzu zzu, zzz zzz) {
        this.A00 = fidoAppIdExtension;
        this.A01 = userVerificationMethodExtension;
        this.A09 = zzs;
        this.A0B = zzz;
        this.A03 = zzab;
        this.A04 = zzad;
        this.A0A = zzu;
        this.A05 = zzag;
        this.A02 = googleThirdPartyPaymentExtension;
        this.A07 = zzak;
        this.A08 = zzaw;
        this.A06 = zzai;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        boolean A1R = Pxi.A1R(parcel, this.A00, i);
        C301145yd.A0A(parcel, this.A09, 3, i, A1R);
        C301145yd.A0A(parcel, this.A01, 4, i, A1R);
        C301145yd.A0A(parcel, this.A0B, 5, i, A1R);
        C301145yd.A0A(parcel, this.A03, 6, i, A1R);
        C301145yd.A0A(parcel, this.A04, 7, i, A1R);
        C301145yd.A0A(parcel, this.A0A, 8, i, A1R);
        C301145yd.A0A(parcel, this.A05, 9, i, A1R);
        C301145yd.A0A(parcel, this.A02, 10, i, A1R);
        C301145yd.A0A(parcel, this.A07, 11, i, A1R);
        C301145yd.A0A(parcel, this.A08, 12, i, A1R);
        C301145yd.A0A(parcel, this.A06, 13, i, A1R);
        C301145yd.A06(parcel, A032);
    }
}
