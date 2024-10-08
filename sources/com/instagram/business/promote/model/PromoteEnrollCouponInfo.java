package com.instagram.business.promote.model;

import X.0oU;
import X.0qQ;
import X.1XP;
import X.AnonymousClass00P;
import X.Pxg;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.coupon.PromoteAdsCouponUseCase;
import com.instagram.model.coupon.PromoteCouponCurrencyAmount;
import com.instagram.model.coupon.PromoteCouponType;

public final class PromoteEnrollCouponInfo extends 1XP implements Parcelable {
    public static final W6D CREATOR = new W6D(40);
    public PromoteEnrollCouponStatus A00;
    public PromoteAdsCouponUseCase A01;
    public PromoteCouponCurrencyAmount A02;
    public PromoteCouponCurrencyAmount A03;
    public PromoteCouponCurrencyAmount A04;
    public PromoteCouponType A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;

    public enum PromoteEnrollCouponStatus implements Parcelable {
        A09,
        ACTIVE_IMPRESSION,
        HAS_ENROLLED,
        HAS_PRE_OFFER,
        HAS_FAILED,
        CLAIM_FAILURE,
        CLAIM_FAILURE_COUPON_ALREADY_CLAIMED,
        HAS_CLAIMED;
        
        public static final W6D CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        /* access modifiers changed from: public */
        static {
            PromoteEnrollCouponStatus[] promoteEnrollCouponStatusArr;
            A00 = 0oU.A00(promoteEnrollCouponStatusArr);
            CREATOR = new W6D(41);
        }

        public final String toString() {
            return name();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            Pxg.A1G(parcel, this);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeParcelable(A00(), i);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
    }

    public final PromoteEnrollCouponStatus A00() {
        PromoteEnrollCouponStatus promoteEnrollCouponStatus = this.A00;
        if (promoteEnrollCouponStatus != null) {
            return promoteEnrollCouponStatus;
        }
        0qQ.A0F("couponStatus");
        throw AnonymousClass00P.createAndThrow();
    }
}
