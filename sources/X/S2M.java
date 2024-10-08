package X;

public final class S2M {
    public final int A00;
    public final T9D A01;
    public final Integer A02;
    public final boolean A03;

    public final String toString() {
        String localizedMessage;
        T9D t9d = this.A01;
        if (t9d instanceof C7860Qbk) {
            localizedMessage = "None";
        } else {
            localizedMessage = ((Throwable) t9d.A01()).getLocalizedMessage();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("NetworkState{mConnected=");
        A1A.append(this.A03);
        A1A.append(", mConnectionType=");
        A1A.append(C9557Rcu.A00(this.A02));
        A1A.append(", mNetworkType=");
        A1A.append(this.A00);
        A1A.append(", mThrowable=");
        A1A.append(localizedMessage);
        return Pxg.A0x(A1A);
    }

    public S2M(Integer num, Throwable th, int i, boolean z) {
        T9D qbl;
        this.A03 = z;
        this.A02 = num;
        this.A00 = i;
        if (th == null) {
            qbl = C7860Qbk.A00;
        } else {
            qbl = new C7861Qbl(th);
        }
        this.A01 = qbl;
    }
}
