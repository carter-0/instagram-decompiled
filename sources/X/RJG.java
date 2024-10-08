package X;

public enum RJG implements C13660TeR {
    EMPTY(0),
    IPV4(1),
    IPV6(2),
    BTC(3),
    UNRECOGNIZED(-1);
    
    public final int A00;

    public final int BXO() {
        if (this != UNRECOGNIZED) {
            return this.A00;
        }
        throw AnonymousClass7TE.A0w("Can't get the number of an unknown enum value.");
    }

    /* access modifiers changed from: public */
    RJG(int i) {
        this.A00 = i;
    }
}
