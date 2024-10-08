package X;

/* renamed from: X.RFl  reason: case insensitive filesystem */
public enum C8918RFl {
    BILLING_CLIENT_DISCONNECTED(0, true),
    CONSUME_FAILURE(1, true),
    CONSUME_SKIPPED(2, false),
    DCP_NOT_ENABLED(3, true),
    DCP_NOT_ENABLED_FOR_COUNTRY(4, true),
    FB_SYNC_FAILED(5, true),
    FETCH_INTERNAL_BILLING_INFO_FAILED(6, true),
    IAB_INIT_FAILED(7, true),
    IAB_PRODUCT_FETCH_FAILED(8, true),
    MALFORMED_DATA(9, true),
    NETWORK_FAILURE(10, true),
    PENDING_PURCHASE(11, true),
    SERVER_QUOTING_FAILED(12, true),
    SERVER_VERIFICATION_FAILED(13, true),
    SUCCESSFUL(14, false),
    USER_CANCELLED_PAYMENT(15, true),
    USER_PAYMENT_FAILED(16, true),
    INVALID_OFFER_TOKEN(17, true),
    UNKNOWN_FAILURE(18, true),
    BILLING_UNAVAILABLE(19, true),
    PENDING_PURCHASE_ON_SKU(20, true),
    SYNCHRONIZATION_SUCCESS(21, false),
    SYNCHRONIZATION_FAILED(22, true);
    
    public final String A00;
    public final boolean A01;

    /* access modifiers changed from: public */
    static {
        C8918RFl[] rFlArr;
        A02 = 0oU.A00(rFlArr);
    }

    /* access modifiers changed from: public */
    C8918RFl(int i, boolean z) {
        this.A00 = r2;
        this.A01 = z;
    }
}
