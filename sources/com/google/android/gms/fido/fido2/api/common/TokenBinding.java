package com.google.android.gms.fido.fido2.api.common;

import X.AnonymousClass3Qk;
import X.C301145yd;
import X.C8976RJr;
import X.Pxf;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class TokenBinding extends AbstractSafeParcelable {
    public static final TokenBinding A02 = new TokenBinding(TokenBindingStatus.NOT_SUPPORTED.toString(), (String) null);
    public static final TokenBinding A03 = new TokenBinding(TokenBindingStatus.SUPPORTED.toString(), (String) null);
    public static final Parcelable.Creator CREATOR = SWX.A00(75);
    public final TokenBindingStatus A00;
    public final String A01;

    public enum TokenBindingStatus implements Parcelable {
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");
        
        public static final Parcelable.Creator CREATOR = null;
        public final String A00;

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return this.A00;
        }

        /* access modifiers changed from: public */
        static {
            CREATOR = SWX.A00(74);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.A00);
        }

        /* access modifiers changed from: public */
        TokenBindingStatus(String str) {
            this.A00 = str;
        }

        public static TokenBindingStatus A00(String str) {
            for (TokenBindingStatus tokenBindingStatus : values()) {
                if (str.equals(tokenBindingStatus.A00)) {
                    return tokenBindingStatus;
                }
            }
            throw new Exception(String.format("TokenBindingStatus %s not supported", new Object[]{str}));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenBinding)) {
            return false;
        }
        TokenBinding tokenBinding = (TokenBinding) obj;
        TokenBindingStatus tokenBindingStatus = this.A00;
        TokenBindingStatus tokenBindingStatus2 = tokenBinding.A00;
        if (tokenBindingStatus != tokenBindingStatus2 && (tokenBindingStatus == null || !tokenBindingStatus.equals(tokenBindingStatus2))) {
            return false;
        }
        String str = this.A01;
        String str2 = tokenBinding.A01;
        if (str == str2 || (str != null && str.equals(str2))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Pxf.A0A(this.A00, this.A01);
    }

    public TokenBinding(String str, String str2) {
        AnonymousClass3Qk.A02(str);
        try {
            this.A00 = TokenBindingStatus.A00(str);
            this.A01 = str2;
        } catch (C8976RJr e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A0B(parcel, this.A00.toString());
        Pxf.A1A(parcel, this.A01, A032, false);
    }
}
