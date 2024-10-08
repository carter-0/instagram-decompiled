package X;

/* renamed from: X.9rc  reason: invalid class name and case insensitive filesystem */
public enum C390649rc {
    Video(0),
    StillImage(1);
    
    public final int A00;

    /* access modifiers changed from: public */
    static {
        Video = new C390649rc("Video", 0, 0);
        StillImage = new C390649rc("StillImage", 1, 1);
    }

    /* access modifiers changed from: public */
    C390649rc(int i) {
        this.A00 = i;
    }
}
