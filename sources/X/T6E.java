package X;

public final class T6E implements 1XR {
    public int A00;
    public byte[] A01;
    public 1Fn[] A02;
    public int A03;
    public long A04;

    public final long getResponseTimestamp() {
        return this.A04;
    }

    public final int getStatusCode() {
        return this.A00;
    }

    public final boolean isOk() {
        return AnonymousClass7TF.A1S(this.A00, 200);
    }

    public final void setFromDiskCache(boolean z) {
    }

    public final void setResponseId(int i) {
        this.A03 = i;
    }

    public final void setResponseTimestamp(long j) {
        this.A04 = j;
    }

    public final void setServerElapsedTime(long j) {
    }

    public final void setStatusCode(int i) {
        this.A00 = i;
    }
}
