package X;

/* renamed from: X.46J  reason: invalid class name */
public final class AnonymousClass46J {
    public final Integer A00;
    public final long A01;
    public final long A02;
    public final C8901REt A03;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("MqttChannelState{mConnectionState=");
        switch (this.A00.intValue()) {
            case 0:
                str = "CONNECTING";
                break;
            case 1:
                str = "CONNECTED";
                break;
            default:
                str = "DISCONNECTED";
                break;
        }
        sb.append(str);
        sb.append(", mDisconnectionReason=");
        sb.append(this.A03);
        sb.append(", mLastConnectionMs=");
        sb.append(this.A01);
        sb.append(", mLastDisconnectMs=");
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }

    public AnonymousClass46J(C8901REt rEt, Integer num, long j, long j2) {
        this.A00 = num;
        this.A03 = rEt;
        this.A01 = j;
        this.A02 = j2;
    }
}
