package com.google.android.gms.fido.fido2.api.common;

import X.AnonymousClass00P;
import X.AnonymousClass3Qk;
import X.AnonymousClass7TE;
import X.C301145yd;
import X.C3735896d;
import X.C66582MXn;
import X.Pxf;
import X.Pxg;
import X.RJs;
import X.SA1;
import X.SDL;
import X.SWX;
import X.SyE;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.Arrays;
import java.util.List;

public class PublicKeyCredentialRequestOptions extends RequestOptions {
    public static final Parcelable.Creator CREATOR = SWX.A00(68);
    public ResultReceiver A00;
    public final AuthenticationExtensions A01;
    public final TokenBinding A02;
    public final Double A03;
    public final Integer A04;
    public final String A05;
    public final List A06;
    public final byte[] A07;
    public final UserVerificationRequirement A08;
    public final Long A09;

    public final boolean equals(Object obj) {
        if (obj instanceof PublicKeyCredentialRequestOptions) {
            PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
            if (Arrays.equals(this.A07, publicKeyCredentialRequestOptions.A07) && SA1.A01(this.A03, publicKeyCredentialRequestOptions.A03) && SA1.A01(this.A05, publicKeyCredentialRequestOptions.A05)) {
                List list = this.A06;
                List list2 = publicKeyCredentialRequestOptions.A06;
                if (list != null ? !(list2 == null || !list.containsAll(list2) || !list2.containsAll(list)) : list2 == null) {
                    if (SA1.A01(this.A04, publicKeyCredentialRequestOptions.A04) && SA1.A01(this.A02, publicKeyCredentialRequestOptions.A02) && SA1.A01(this.A08, publicKeyCredentialRequestOptions.A08) && SA1.A01(this.A01, publicKeyCredentialRequestOptions.A01)) {
                        return SA1.A00(this.A09, publicKeyCredentialRequestOptions.A09);
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.A07)), this.A03, this.A05, this.A06, this.A04, this.A02, this.A08, this.A01, this.A09});
    }

    public final String toString() {
        AuthenticationExtensions authenticationExtensions = this.A01;
        UserVerificationRequirement userVerificationRequirement = this.A08;
        TokenBinding tokenBinding = this.A02;
        List list = this.A06;
        String A002 = C3735896d.A00(this.A07);
        String valueOf = String.valueOf(list);
        String valueOf2 = String.valueOf(tokenBinding);
        String valueOf3 = String.valueOf(userVerificationRequirement);
        String valueOf4 = String.valueOf(authenticationExtensions);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PublicKeyCredentialRequestOptions{\n challenge=");
        A1A.append(A002);
        A1A.append(", \n timeoutSeconds=");
        A1A.append(this.A03);
        A1A.append(", \n rpId='");
        A1A.append(this.A05);
        A1A.append("', \n allowList=");
        A1A.append(valueOf);
        A1A.append(", \n requestId=");
        A1A.append(this.A04);
        A1A.append(", \n tokenBinding=");
        A1A.append(valueOf2);
        A1A.append(", \n userVerification=");
        A1A.append(valueOf3);
        A1A.append(", \n authenticationExtensions=");
        A1A.append(valueOf4);
        A1A.append(", \n longRequestId=");
        return C66582MXn.A0v(this.A09, A1A);
    }

    public PublicKeyCredentialRequestOptions(ResultReceiver resultReceiver, AuthenticationExtensions authenticationExtensions, TokenBinding tokenBinding, Double d, Integer num, Long l, String str, String str2, String str3, List list, byte[] bArr) {
        this.A00 = resultReceiver;
        if (str3 != null) {
            SyE.A01.A00.FP1();
            SDL.A0A.FP1();
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass3Qk.A02(bArr);
        this.A07 = bArr;
        this.A03 = d;
        AnonymousClass3Qk.A02(str);
        this.A05 = str;
        this.A06 = list;
        this.A04 = num;
        this.A02 = tokenBinding;
        this.A09 = l;
        if (str2 != null) {
            try {
                this.A08 = UserVerificationRequirement.A00(str2);
            } catch (RJs e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.A01 = authenticationExtensions;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        boolean A1W = Pxg.A1W(parcel, this.A07);
        Double d = this.A03;
        if (d != null) {
            Pxg.A1H(parcel, d, 524291);
        }
        C301145yd.A0C(parcel, this.A05, 4, A1W);
        C301145yd.A0E(parcel, this.A06, 5, A1W);
        Integer num = this.A04;
        if (num != null) {
            parcel.writeInt(262150);
            Pxf.A19(parcel, num);
        }
        C301145yd.A0A(parcel, this.A02, 7, i, A1W);
        UserVerificationRequirement userVerificationRequirement = this.A08;
        String str = null;
        if (userVerificationRequirement != null) {
            str = userVerificationRequirement.toString();
        }
        C301145yd.A0C(parcel, str, 8, A1W);
        C301145yd.A0A(parcel, this.A01, 9, i, A1W);
        Long l = this.A09;
        if (l != null) {
            parcel.writeInt(524298);
            Pxf.A18(parcel, l);
        }
        C301145yd.A0A(parcel, this.A00, 12, i, A1W);
        C301145yd.A06(parcel, A032);
    }
}
