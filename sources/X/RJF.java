package X;

public enum RJF implements C13490TbH {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);
    
    public final int A00;

    /* access modifiers changed from: public */
    RJF(int i) {
        this.A00 = i;
    }
}
