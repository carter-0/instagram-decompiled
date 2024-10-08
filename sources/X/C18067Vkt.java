package X;

import com.instagram.business.promote.model.PromoteEnrollCouponInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.coupon.PromoteAdsCouponUseCase;
import com.instagram.model.coupon.PromoteCouponCurrencyAmount;
import com.instagram.model.coupon.PromoteCouponType;

/* renamed from: X.Vkt  reason: case insensitive filesystem */
public final class C18067Vkt {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public Integer A03;
    public final VVO A04;
    public final PromoteEnrollCouponInfo.PromoteEnrollCouponStatus A05;
    public final UserSession A06;
    public final PromoteAdsCouponUseCase A07;
    public final PromoteCouponCurrencyAmount A08;
    public final PromoteCouponCurrencyAmount A09;
    public final PromoteCouponCurrencyAmount A0A;
    public final PromoteCouponType A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;

    public C18067Vkt(VVO vvo, PromoteEnrollCouponInfo.PromoteEnrollCouponStatus promoteEnrollCouponStatus, UserSession userSession, PromoteAdsCouponUseCase promoteAdsCouponUseCase, PromoteCouponCurrencyAmount promoteCouponCurrencyAmount, PromoteCouponCurrencyAmount promoteCouponCurrencyAmount2, PromoteCouponCurrencyAmount promoteCouponCurrencyAmount3, PromoteCouponType promoteCouponType, String str, String str2, String str3) {
        0qQ.A0B(userSession, 1);
        this.A06 = userSession;
        this.A05 = promoteEnrollCouponStatus;
        this.A0B = promoteCouponType;
        this.A0D = str;
        this.A0C = str2;
        this.A0A = promoteCouponCurrencyAmount;
        this.A09 = promoteCouponCurrencyAmount2;
        this.A0E = str3;
        this.A08 = promoteCouponCurrencyAmount3;
        this.A07 = promoteAdsCouponUseCase;
        this.A04 = vvo;
    }

    public final double A00() {
        int i;
        int i2;
        PromoteCouponCurrencyAmount promoteCouponCurrencyAmount = this.A0A;
        if (promoteCouponCurrencyAmount != null) {
            i = promoteCouponCurrencyAmount.A00;
        } else {
            i = 0;
        }
        PromoteCouponCurrencyAmount promoteCouponCurrencyAmount2 = this.A09;
        if (promoteCouponCurrencyAmount2 != null) {
            i2 = promoteCouponCurrencyAmount2.A00;
        } else {
            i2 = 0;
        }
        return (((double) i) * 100.0d) / ((double) i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
        if (r0.A00 > 0) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007a, code lost:
        if (r0.A00 > 0) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer A01() {
        /*
            r9 = this;
            java.lang.Integer r5 = r9.A03
            if (r5 != 0) goto L_0x0030
            com.instagram.model.coupon.PromoteCouponType r0 = r9.A0B
            if (r0 == 0) goto L_0x00a9
            int r1 = r0.ordinal()
            r8 = 1
            if (r1 == r8) goto L_0x0041
            r0 = 0
            if (r1 != r0) goto L_0x00a9
            com.instagram.business.promote.model.PromoteEnrollCouponInfo$PromoteEnrollCouponStatus r0 = r9.A05
            int r2 = r0.ordinal()
            r1 = 1
            r0 = 3
            if (r2 == r0) goto L_0x003e
            if (r2 == r8) goto L_0x003b
            r0 = 2
            if (r2 == r0) goto L_0x0031
            r0 = 7
            if (r2 != r0) goto L_0x00a9
            com.instagram.model.coupon.PromoteCouponCurrencyAmount r0 = r9.A08
            if (r0 == 0) goto L_0x00a9
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x00a9
        L_0x002c:
            java.lang.Integer r5 = X.AnonymousClass05K.A0u
        L_0x002e:
            r9.A03 = r5
        L_0x0030:
            return r5
        L_0x0031:
            com.instagram.model.coupon.PromoteCouponCurrencyAmount r0 = r9.A08
            if (r0 == 0) goto L_0x0036
            r1 = 0
        L_0x0036:
            r9.A02 = r1
            java.lang.Integer r5 = X.AnonymousClass05K.A0u
            goto L_0x002e
        L_0x003b:
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            goto L_0x002e
        L_0x003e:
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            goto L_0x002e
        L_0x0041:
            java.lang.Integer r5 = X.AnonymousClass05K.A15
            double r6 = r9.A00()
            com.instagram.common.session.UserSession r0 = r9.A06
            X.1Av r4 = X.1Au.A00(r0)
            com.instagram.business.promote.model.PromoteEnrollCouponInfo$PromoteEnrollCouponStatus r0 = r9.A05
            int r1 = r0.ordinal()
            r0 = 3
            if (r1 == r0) goto L_0x00a3
            if (r1 == r8) goto L_0x009d
            r0 = 2
            if (r1 == r0) goto L_0x007d
            r0 = 7
            if (r1 == r0) goto L_0x0062
            r4.A0K()
            goto L_0x002e
        L_0x0062:
            X.0s0 r3 = r4.A52
            X.0YZ[] r2 = X.1Av.A8a
            r1 = 262(0x106, float:3.67E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r4, r3, r2, r1)
            if (r0 != 0) goto L_0x0074
            X.AnonymousClass7TF.A1J(r4, r3, r2, r1, r8)
            java.lang.Integer r5 = X.AnonymousClass05K.A0j
            goto L_0x002e
        L_0x0074:
            com.instagram.model.coupon.PromoteCouponCurrencyAmount r0 = r9.A08
            if (r0 == 0) goto L_0x002e
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x002e
            goto L_0x002c
        L_0x007d:
            r4.A0K()
            double r3 = java.lang.Math.abs(r6)
            r1 = 2
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x008d
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
            goto L_0x002e
        L_0x008d:
            r1 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0096
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            goto L_0x002e
        L_0x0096:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x002e
            java.lang.Integer r5 = X.AnonymousClass05K.A0Y
            goto L_0x002e
        L_0x009d:
            r4.A0K()
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            goto L_0x002e
        L_0x00a3:
            r4.A0K()
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            goto L_0x002e
        L_0x00a9:
            java.lang.Integer r5 = X.AnonymousClass05K.A15
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18067Vkt.A01():java.lang.Integer");
    }

    public final String A02() {
        String str;
        if (this.A02 && (str = this.A0D) != null) {
            return str;
        }
        PromoteCouponCurrencyAmount promoteCouponCurrencyAmount = this.A08;
        if (promoteCouponCurrencyAmount != null) {
            return promoteCouponCurrencyAmount.A00();
        }
        return "";
    }

    public final String A03() {
        PromoteCouponCurrencyAmount promoteCouponCurrencyAmount = this.A09;
        if (promoteCouponCurrencyAmount != null) {
            return promoteCouponCurrencyAmount.A00();
        }
        return "";
    }
}
