package com.google.android.gms.fido.fido2.api.common;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C301145yd;
import X.C8970RJl;
import X.C8975RJq;
import X.Pxf;
import X.Pxh;
import X.RJs;
import X.SA1;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(89);
    public final Attachment A00;
    public final Boolean A01;
    public final ResidentKeyRequirement A02;
    public final UserVerificationRequirement A03;

    public final ResidentKeyRequirement A00() {
        ResidentKeyRequirement residentKeyRequirement = this.A02;
        if (residentKeyRequirement != null) {
            return residentKeyRequirement;
        }
        Boolean bool = this.A01;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        if (!SA1.A01(this.A00, authenticatorSelectionCriteria.A00) || !SA1.A01(this.A01, authenticatorSelectionCriteria.A01) || !SA1.A01(this.A03, authenticatorSelectionCriteria.A03)) {
            return false;
        }
        return SA1.A00(A00(), authenticatorSelectionCriteria.A00());
    }

    public final int hashCode() {
        return Pxh.A0A(this.A00, this.A01, this.A03, A00());
    }

    public final String toString() {
        ResidentKeyRequirement residentKeyRequirement = this.A02;
        UserVerificationRequirement userVerificationRequirement = this.A03;
        String valueOf = String.valueOf(this.A00);
        String valueOf2 = String.valueOf(userVerificationRequirement);
        String valueOf3 = String.valueOf(residentKeyRequirement);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AuthenticatorSelectionCriteria{\n attachment=");
        A1A.append(valueOf);
        A1A.append(", \n requireResidentKey=");
        A1A.append(this.A01);
        A1A.append(", \n requireUserVerification=");
        A1A.append(valueOf2);
        A1A.append(", \n residentKeyRequirement=");
        A1A.append(valueOf3);
        return AnonymousClass7TF.A0l("\n }", A1A);
    }

    public AuthenticatorSelectionCriteria(Boolean bool, String str, String str2, String str3) {
        Attachment attachment;
        UserVerificationRequirement userVerificationRequirement;
        ResidentKeyRequirement residentKeyRequirement = null;
        if (str == null) {
            attachment = null;
        } else {
            try {
                attachment = Attachment.A00(str);
            } catch (C8970RJl | C8975RJq | RJs e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.A00 = attachment;
        this.A01 = bool;
        if (str2 == null) {
            userVerificationRequirement = null;
        } else {
            userVerificationRequirement = UserVerificationRequirement.A00(str2);
        }
        this.A03 = userVerificationRequirement;
        this.A02 = str3 != null ? ResidentKeyRequirement.A00(str3) : residentKeyRequirement;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String obj;
        String obj2;
        String obj3;
        int A032 = Pxf.A03(parcel);
        Attachment attachment = this.A00;
        if (attachment == null) {
            obj = null;
        } else {
            obj = attachment.toString();
        }
        C301145yd.A0B(parcel, obj);
        Boolean bool = this.A01;
        if (bool != null) {
            parcel.writeInt(262147);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        UserVerificationRequirement userVerificationRequirement = this.A03;
        if (userVerificationRequirement == null) {
            obj2 = null;
        } else {
            obj2 = userVerificationRequirement.toString();
        }
        C301145yd.A0C(parcel, obj2, 4, false);
        ResidentKeyRequirement A002 = A00();
        if (A002 == null) {
            obj3 = null;
        } else {
            obj3 = A002.toString();
        }
        C301145yd.A0C(parcel, obj3, 5, false);
        C301145yd.A06(parcel, A032);
    }
}
