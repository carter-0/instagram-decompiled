package X;

/* renamed from: X.VeW  reason: case insensitive filesystem */
public final class C17754VeW {
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004b, code lost:
        if (r1 == com.instagram.business.promote.model.AdsManagerPaymentAnomalyType.ACCOUNT_SPEND_LIMIT_REACHED) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0059, code lost:
        if (r1 == com.instagram.business.promote.model.AdsManagerPaymentAnomalyType.ACCOUNT_SPEND_LIMIT_REACHED) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x005d, code lost:
        return com.instagram.business.promote.model.PromoteAdsManagerActionType.SPEND_LIMIT_REACHED;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.business.promote.model.PromoteAdsManagerActionType A00(X.C21004X9b r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C19176WOi
            if (r0 == 0) goto L_0x006e
            X.WOi r6 = (X.C19176WOi) r6
            X.Uyx r0 = r6.A09
            if (r0 == 0) goto L_0x0064
            com.instagram.business.promote.model.AdsManagerBoostingStatusErrorCode r4 = r6.A03
            X.UyE r3 = r6.A0A
            com.instagram.business.promote.model.RejectionReason r2 = r6.A07
            com.instagram.business.promote.model.AdsManagerPaymentAnomalyType r1 = r6.A04
            int r0 = r0.ordinal()
            switch(r0) {
                case 1: goto L_0x0043;
                case 2: goto L_0x0019;
                case 3: goto L_0x0019;
                case 4: goto L_0x0019;
                case 5: goto L_0x0051;
                case 6: goto L_0x0019;
                case 7: goto L_0x0019;
                case 8: goto L_0x0034;
                case 9: goto L_0x0034;
                case 10: goto L_0x0019;
                case 11: goto L_0x0019;
                case 12: goto L_0x003a;
                case 13: goto L_0x0019;
                case 14: goto L_0x0037;
                case 15: goto L_0x0051;
                case 16: goto L_0x0019;
                case 17: goto L_0x001f;
                case 18: goto L_0x0019;
                case 19: goto L_0x0043;
                default: goto L_0x0019;
            }
        L_0x0019:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x001f:
            if (r3 == 0) goto L_0x0028
            X.UyE r0 = X.C16618UyE.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            if (r3 == r0) goto L_0x0028
            com.instagram.business.promote.model.PromoteAdsManagerActionType r0 = com.instagram.business.promote.model.PromoteAdsManagerActionType.VIEW_APPEAL
            return r0
        L_0x0028:
            if (r2 == 0) goto L_0x0031
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0031
            com.instagram.business.promote.model.PromoteAdsManagerActionType r0 = com.instagram.business.promote.model.PromoteAdsManagerActionType.REVIEW
            return r0
        L_0x0031:
            com.instagram.business.promote.model.PromoteAdsManagerActionType r0 = com.instagram.business.promote.model.PromoteAdsManagerActionType.APPEAL
            return r0
        L_0x0034:
            com.instagram.business.promote.model.PromoteAdsManagerActionType r0 = com.instagram.business.promote.model.PromoteAdsManagerActionType.PROMOTE_AGAIN
            return r0
        L_0x0037:
            com.instagram.business.promote.model.PromoteAdsManagerActionType r0 = com.instagram.business.promote.model.PromoteAdsManagerActionType.RESUME
            return r0
        L_0x003a:
            if (r4 == 0) goto L_0x0043
            com.instagram.business.promote.model.AdsManagerBoostingStatusErrorCode r0 = com.instagram.business.promote.model.AdsManagerBoostingStatusErrorCode.SHOPPING_POST_TAGGED_PRODUCT_REJECTED
            if (r4 != r0) goto L_0x0043
            com.instagram.business.promote.model.PromoteAdsManagerActionType r0 = com.instagram.business.promote.model.PromoteAdsManagerActionType.LEARN_MORE_FOR_NOT_DELIVERING_PROMOTION
            return r0
        L_0x0043:
            if (r1 == 0) goto L_0x004e
            com.instagram.business.promote.model.AdsManagerPaymentAnomalyType r0 = com.instagram.business.promote.model.AdsManagerPaymentAnomalyType.UNSETTLED
            if (r1 == r0) goto L_0x005e
            com.instagram.business.promote.model.AdsManagerPaymentAnomalyType r0 = com.instagram.business.promote.model.AdsManagerPaymentAnomalyType.ACCOUNT_SPEND_LIMIT_REACHED
            if (r1 != r0) goto L_0x004e
            goto L_0x005b
        L_0x004e:
            com.instagram.business.promote.model.PromoteAdsManagerActionType r0 = com.instagram.business.promote.model.PromoteAdsManagerActionType.EDIT
            return r0
        L_0x0051:
            if (r1 == 0) goto L_0x0061
            com.instagram.business.promote.model.AdsManagerPaymentAnomalyType r0 = com.instagram.business.promote.model.AdsManagerPaymentAnomalyType.UNSETTLED
            if (r1 == r0) goto L_0x005e
            com.instagram.business.promote.model.AdsManagerPaymentAnomalyType r0 = com.instagram.business.promote.model.AdsManagerPaymentAnomalyType.ACCOUNT_SPEND_LIMIT_REACHED
            if (r1 != r0) goto L_0x0061
        L_0x005b:
            com.instagram.business.promote.model.PromoteAdsManagerActionType r0 = com.instagram.business.promote.model.PromoteAdsManagerActionType.SPEND_LIMIT_REACHED
            return r0
        L_0x005e:
            com.instagram.business.promote.model.PromoteAdsManagerActionType r0 = com.instagram.business.promote.model.PromoteAdsManagerActionType.PAY_NOW
            return r0
        L_0x0061:
            com.instagram.business.promote.model.PromoteAdsManagerActionType r0 = com.instagram.business.promote.model.PromoteAdsManagerActionType.LEARN_MORE
            return r0
        L_0x0064:
            java.lang.String r0 = "boostingStatus"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x006e:
            boolean r0 = r6 instanceof X.C19175WOh
            if (r0 == 0) goto L_0x0075
            com.instagram.business.promote.model.PromoteAdsManagerActionType r0 = com.instagram.business.promote.model.PromoteAdsManagerActionType.DRAFT
            return r0
        L_0x0075:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17754VeW.A00(X.X9b):com.instagram.business.promote.model.PromoteAdsManagerActionType");
    }
}
