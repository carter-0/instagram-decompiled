package com.google.android.gms.auth.api.identity;

import X.AnonymousClass3Qk;
import X.AnonymousClass7TE;
import X.C301145yd;
import X.C51968G9o;
import X.Pxf;
import X.Pxg;
import X.Pxh;
import X.SA1;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(92);
    public final int A00;
    public final GoogleIdTokenRequestOptions A01;
    public final PasskeyJsonRequestOptions A02;
    public final PasskeysRequestOptions A03;
    public final PasswordRequestOptions A04;
    public final String A05;
    public final boolean A06;

    public final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = SWW.A00(96);
        public final String A00;
        public final String A01;
        public final String A02;
        public final List A03;
        public final boolean A04;
        public final boolean A05;
        public final boolean A06;

        public final boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            if (this.A04 != googleIdTokenRequestOptions.A04 || !SA1.A01(this.A00, googleIdTokenRequestOptions.A00) || !SA1.A01(this.A01, googleIdTokenRequestOptions.A01) || this.A05 != googleIdTokenRequestOptions.A05 || !SA1.A01(this.A02, googleIdTokenRequestOptions.A02) || !SA1.A01(this.A03, googleIdTokenRequestOptions.A03) || this.A06 != googleIdTokenRequestOptions.A06) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A04), this.A00, this.A01, Boolean.valueOf(this.A05), this.A02, this.A03, Boolean.valueOf(this.A06)});
        }

        public GoogleIdTokenRequestOptions(String str, String str2, String str3, List list, boolean z, boolean z2, boolean z3) {
            boolean z4 = true;
            if (z2 && z3) {
                z4 = false;
            }
            AnonymousClass3Qk.A08(z4, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.A04 = z;
            if (z) {
                AnonymousClass3Qk.A03(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.A00 = str;
            this.A01 = str2;
            this.A05 = z2;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = AnonymousClass7TE.A1D(list);
                Collections.sort(arrayList);
            }
            this.A03 = arrayList;
            this.A02 = str3;
            this.A06 = z3;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int A032 = Pxf.A03(parcel);
            C301145yd.A09(parcel, 1, this.A04);
            C301145yd.A0B(parcel, this.A00);
            C301145yd.A0C(parcel, this.A01, 3, false);
            C301145yd.A09(parcel, 4, this.A05);
            C301145yd.A0C(parcel, this.A02, 5, false);
            C301145yd.A0D(parcel, this.A03, 6);
            C301145yd.A09(parcel, 7, this.A06);
            C301145yd.A06(parcel, A032);
        }
    }

    public final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = SWW.A00(97);
        public final String A00;
        public final boolean A01;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PasskeyJsonRequestOptions) {
                    PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
                    if (this.A01 != passkeyJsonRequestOptions.A01 || !SA1.A01(this.A00, passkeyJsonRequestOptions.A00)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Pxf.A0A(Boolean.valueOf(this.A01), this.A00);
        }

        public PasskeyJsonRequestOptions(boolean z, String str) {
            if (z) {
                AnonymousClass3Qk.A02(str);
            }
            this.A01 = z;
            this.A00 = str;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int A03 = Pxf.A03(parcel);
            C301145yd.A09(parcel, 1, this.A01);
            C301145yd.A0B(parcel, this.A00);
            C301145yd.A06(parcel, A03);
        }
    }

    @Deprecated
    public final class PasskeysRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = SWW.A00(98);
        public final String A00;
        public final boolean A01;
        public final byte[] A02;

        public final boolean equals(Object obj) {
            String str;
            String str2;
            if (this != obj) {
                if (obj instanceof PasskeysRequestOptions) {
                    PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
                    if (this.A01 != passkeysRequestOptions.A01 || !Arrays.equals(this.A02, passkeysRequestOptions.A02) || ((str = this.A00) != (str2 = passkeysRequestOptions.A00) && (str == null || !str.equals(str2)))) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Pxh.A0D(this.A02, Pxf.A0A(Boolean.valueOf(this.A01), this.A00) * 31);
        }

        public PasskeysRequestOptions(String str, byte[] bArr, boolean z) {
            if (z) {
                AnonymousClass3Qk.A02(bArr);
                AnonymousClass3Qk.A02(str);
            }
            this.A01 = z;
            this.A02 = bArr;
            this.A00 = str;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int A03 = Pxf.A03(parcel);
            C301145yd.A09(parcel, 1, this.A01);
            Pxf.A1A(parcel, this.A00, A03, Pxg.A1W(parcel, this.A02));
        }
    }

    public final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = SWW.A00(99);
        public final boolean A00;

        public final boolean equals(Object obj) {
            if (!(obj instanceof PasswordRequestOptions) || this.A00 != ((PasswordRequestOptions) obj).A00) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Arrays.hashCode(C51968G9o.A1b(this.A00));
        }

        public PasswordRequestOptions(boolean z) {
            this.A00 = z;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            Pxg.A1E(parcel, Pxf.A03(parcel), this.A00);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        if (!SA1.A01(this.A04, beginSignInRequest.A04) || !SA1.A01(this.A01, beginSignInRequest.A01) || !SA1.A01(this.A03, beginSignInRequest.A03) || !SA1.A01(this.A02, beginSignInRequest.A02) || !SA1.A01(this.A05, beginSignInRequest.A05) || this.A06 != beginSignInRequest.A06 || this.A00 != beginSignInRequest.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A01, this.A03, this.A02, this.A05, Boolean.valueOf(this.A06)});
    }

    public BeginSignInRequest(GoogleIdTokenRequestOptions googleIdTokenRequestOptions, PasskeyJsonRequestOptions passkeyJsonRequestOptions, PasskeysRequestOptions passkeysRequestOptions, PasswordRequestOptions passwordRequestOptions, String str, int i, boolean z) {
        AnonymousClass3Qk.A02(passwordRequestOptions);
        this.A04 = passwordRequestOptions;
        AnonymousClass3Qk.A02(googleIdTokenRequestOptions);
        this.A01 = googleIdTokenRequestOptions;
        this.A05 = str;
        this.A06 = z;
        this.A00 = i;
        this.A03 = passkeysRequestOptions == null ? new PasskeysRequestOptions((String) null, (byte[]) null, false) : passkeysRequestOptions;
        this.A02 = passkeyJsonRequestOptions == null ? new PasskeyJsonRequestOptions(false, (String) null) : passkeyJsonRequestOptions;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A0A(parcel, this.A04, 1, i, false);
        C301145yd.A0A(parcel, this.A01, 2, i, false);
        C301145yd.A0C(parcel, this.A05, 3, false);
        C301145yd.A09(parcel, 4, this.A06);
        C301145yd.A07(parcel, 5, this.A00);
        C301145yd.A0A(parcel, this.A03, 6, i, false);
        C301145yd.A0A(parcel, this.A02, 7, i, false);
        C301145yd.A06(parcel, A032);
    }
}
