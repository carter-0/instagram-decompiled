package X;

public enum XF6 {
    CONTIGUOUS(1),
    CHANNELS_LAST(2),
    CHANNELS_LAST_3D(3);
    
    public final int A00;

    /* access modifiers changed from: public */
    XF6(int i) {
        this.A00 = i;
    }
}
