package X;

public final class T6X implements C13885Tj8 {
    public final /* synthetic */ C12768T6c A00;

    public T6X(C12768T6c t6c) {
        this.A00 = t6c;
    }

    public final void onBytesTransferred(long j, long j2) {
        C12768T6c t6c = this.A00;
        t6c.A02.onBytesTransferred(j + ((long) t6c.A01), (long) t6c.A00);
    }
}
