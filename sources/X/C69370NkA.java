package X;

/* renamed from: X.NkA  reason: case insensitive filesystem */
public enum C69370NkA {
    SUCCESS(0, -1, AnonymousClass05K.A0g),
    UNKNOWN(1, 0, r9),
    PERMISSION_ERROR(2, 1, r9),
    ACCOUNT_NOT_MATCH(3, 2, AnonymousClass05K.A0B),
    INVALID_REQUEST(4, 3, AnonymousClass05K.A0K),
    A0D(5, 4, AnonymousClass05K.A0T),
    SEND_MESSAGE_OPERATION_FAILED(6, 5, r19),
    APP_NOT_LOGGED_IN(7, 7, AnonymousClass05K.A0E),
    STELLA_NOT_ENABLED(8, 8, AnonymousClass05K.A0I),
    IPC_SERVICE_NOT_BOUND(9, 9, AnonymousClass05K.A0P),
    UNSUPPORTED_PROTOCOL_VERSION(10, 10, AnonymousClass05K.A0e),
    ACCOUNT_NOT_LINKED(11, 11, AnonymousClass05K.A0D),
    REQUEST_JSON_PARSE_FAILED(12, 12, AnonymousClass05K.A0L),
    REQUEST_SOURCE_MEDIA_ERROR(13, 13, AnonymousClass05K.A0V),
    SHARING_MEDIA_FAILED(14, 14, r19),
    IG_ACCOUNT_PRIVACY_STATUS_MISMATCH(15, 15, AnonymousClass05K.A0J),
    DIRECT_NOT_INIT(16, 16, AnonymousClass05K.A0f),
    CLOSE_FRIENDS_UNAVAILABLE(17, 17, AnonymousClass05K.A0h),
    SEND_MESSAGE_LIMIT_EXCEED(18, 18, r19);
    
    public final int A00;
    public final Integer A01;
    public final String A02;

    /* access modifiers changed from: public */
    static {
        C69370NkA[] nkAArr;
        A03 = 0oU.A00(nkAArr);
    }

    /* access modifiers changed from: public */
    C69370NkA(int i, int i2, Integer num) {
        this.A00 = i2;
        this.A02 = r2;
        this.A01 = num;
    }
}
