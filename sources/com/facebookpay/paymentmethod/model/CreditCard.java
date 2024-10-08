package com.facebookpay.paymentmethod.model;

import X.002;
import X.00l;
import X.0qQ;
import X.AnonymousClass7TE;
import X.C13930TlY;
import X.C21267XRm;
import X.C250663lr;
import X.C51967G9n;
import X.C7646QRn;
import X.C7647QRo;
import X.C7648QRp;
import X.C7802QXn;
import X.C8927RFv;
import X.C8935RGd;
import X.C8946RGo;
import X.QRJ;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;

public class CreditCard implements PaymentMethod {
    public static final Parcelable.Creator CREATOR = SWW.A00(11);
    public C13930TlY A00;
    public final QRJ A01;
    public final C7648QRp A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public CreditCard(C7648QRp qRp, boolean z, boolean z2) {
        QRJ qrj;
        0qQ.A0B(qRp, 1);
        this.A02 = qRp;
        this.A05 = z;
        this.A04 = z2;
        C250663lr optionalTreeField = qRp.getOptionalTreeField(13, "billing_address", C7646QRn.class, -213805893);
        if (optionalTreeField != null) {
            C13930TlY tlY = (C13930TlY) optionalTreeField.A01(C7802QXn.class, 1653097835);
            0qQ.A07(tlY);
            this.A00 = tlY;
            String optionalStringField = qRp.getOptionalStringField(14, "card_holder_name");
            this.A03 = optionalStringField == null ? "" : optionalStringField;
            C250663lr optionalTreeField2 = qRp.getOptionalTreeField(8, "fields_needing_verification(product_id:$payment_product_id)", C7647QRo.class, -1386770929);
            if (optionalTreeField2 != null) {
                qrj = (QRJ) optionalTreeField2.A01(QRJ.class, 2109346557);
            } else {
                qrj = null;
            }
            this.A01 = qrj;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final int describeContents() {
        return 0;
    }

    public final C8935RGd A00() {
        C7648QRp qRp = this.A02;
        C8935RGd rGd = C8935RGd.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
        C8935RGd rGd2 = (C8935RGd) qRp.getOptionalEnumField(11, "cc_type", rGd);
        if (rGd2 == null) {
            return rGd;
        }
        return rGd2;
    }

    public final C8946RGo A01() {
        C8927RFv rFv = (C8927RFv) this.A02.getOptionalEnumField(3, "card_association", C8927RFv.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        if (rFv != null) {
            switch (rFv.ordinal()) {
                case 1:
                    return C8946RGo.AMERICAN_EXPRESS;
                case 4:
                    return C8946RGo.DISCOVER;
                case 7:
                    return C8946RGo.JCB;
                case 9:
                    return C8946RGo.MASTERCARD;
                case 11:
                    return C8946RGo.RUPAY;
                case 13:
                    return C8946RGo.VISA;
            }
        }
        return C8946RGo.UNKNOWN;
    }

    public final String A02() {
        String optionalStringField;
        C7648QRp qRp = this.A02;
        String optionalStringField2 = qRp.getOptionalStringField(7, "expiry_month");
        if (optionalStringField2 == null || 00l.A0W(optionalStringField2) || (optionalStringField = qRp.getOptionalStringField(6, "expiry_year")) == null || 00l.A0W(optionalStringField)) {
            return "";
        }
        String optionalStringField3 = qRp.getOptionalStringField(7, "expiry_month");
        if (optionalStringField3 == null) {
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (optionalStringField3.length() != 2) {
            return "";
        } else {
            String optionalStringField4 = qRp.getOptionalStringField(6, "expiry_year");
            if (optionalStringField4 == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            } else if (optionalStringField4.length() < 4) {
                return "";
            } else {
                String optionalStringField5 = qRp.getOptionalStringField(7, "expiry_month");
                String optionalStringField6 = qRp.getOptionalStringField(6, "expiry_year");
                if (optionalStringField6 != null) {
                    return 002.A0R(optionalStringField5, C51967G9n.A0q(optionalStringField6, 2, 4));
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
    }

    public final String Asm() {
        String A09 = this.A02.A09("credential_id");
        if (A09 == null) {
            return "";
        }
        return A09;
    }

    public final C21267XRm Asn() {
        C21267XRm xRm = (C21267XRm) this.A02.getOptionalEnumField(15, "credential_type", C21267XRm.A09);
        if (xRm == null) {
            return C21267XRm.A03;
        }
        return xRm;
    }

    public final String BEP() {
        String A0B = this.A02.A0B("card_association_image_url");
        if (A0B == null) {
            return "";
        }
        return A0B;
    }

    public final String getSubtitle() {
        String optionalStringField = this.A02.getOptionalStringField(9, "cc_subtitle");
        if (optionalStringField == null) {
            return "";
        }
        return optionalStringField;
    }

    public final String getTitle() {
        String optionalStringField = this.A02.getOptionalStringField(10, "cc_title");
        if (optionalStringField == null) {
            return "";
        }
        return optionalStringField;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        boolean z;
        if (this instanceof TokenizedCard) {
            TokenizedCard tokenizedCard = (TokenizedCard) this;
            0qQ.A0B(parcel, 0);
            parcel.writeValue(tokenizedCard.A00);
            parcel.writeValue(tokenizedCard.A01);
            parcel.writeInt(tokenizedCard.A05 ? 1 : 0);
            z = tokenizedCard.A04;
        } else {
            0qQ.A0B(parcel, 0);
            parcel.writeValue(this.A02);
            parcel.writeInt(this.A05 ? 1 : 0);
            z = this.A04;
        }
        parcel.writeInt(z ? 1 : 0);
    }
}
