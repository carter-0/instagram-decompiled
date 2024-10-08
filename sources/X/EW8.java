package X;

public enum EW8 {
    SMS(1),
    BACKUP_CODE(2),
    AUTHENTICATOR_APP(3),
    TRUSTED_NOTIFICATION(4),
    TRUSTED_DEVICE_NONCE(5),
    WHATSAPP(6),
    UNKNOWN(0);
    
    public final int A00;

    /* access modifiers changed from: public */
    static {
        EW8[] ew8Arr;
        A01 = 0oU.A00(ew8Arr);
    }

    /* access modifiers changed from: public */
    EW8(int i) {
        this.A00 = i;
    }
}
