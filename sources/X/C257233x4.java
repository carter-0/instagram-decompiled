package X;

/* renamed from: X.3x4  reason: invalid class name and case insensitive filesystem */
public enum C257233x4 {
    A01(0),
    A03(5),
    A02(9);
    
    public final C257243x5 A00;

    /* access modifiers changed from: public */
    static {
        A01 = new C257233x4(new C257243x5((byte) 3, true), "DEFAULT", 0);
        new C257233x4(new C257243x5((byte) 4, false), "PREFETCH", 1);
        new C257233x4(new C257243x5((byte) 3, false), "IMPORTANT_PREFETCH", 2);
        new C257233x4(new C257243x5((byte) 4, true), "PREFETCH_INCREMENTAL", 3);
        new C257233x4(new C257243x5((byte) 3, true), "IMPORTANT_PREFETCH_INCREMENTAL", 4);
        A03 = new C257233x4(new C257243x5((byte) 5, false), "UNIMPORTANT_PREFETCH", 5);
        new C257233x4(new C257243x5((byte) 5, true), "UNIMPORTANT_PREFETCH_INCREMENTAL", 6);
        new C257233x4(new C257243x5((byte) 6, false), "VERY_UNIMPORTANT_PREFETCH", 7);
        new C257233x4(new C257243x5((byte) 6, true), "VERY_UNIMPORTANT_PREFETCH_INCREMENTAL", 8);
        A02 = new C257233x4(new C257243x5((byte) 0, false), "STREAMING", 9);
        new C257233x4(new C257243x5((byte) 2, false), "WARMUP", 10);
        new C257233x4(new C257243x5((byte) 2, true), "WARMUP_INCREMENTAL", 11);
        new C257233x4(new C257243x5((byte) 0, true), "STREAMING_INCREMENTAL", 12);
    }

    /* access modifiers changed from: public */
    C257233x4(int i) {
        this.A00 = r1;
    }
}
