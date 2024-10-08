package X;

/* renamed from: X.3Oa  reason: invalid class name and case insensitive filesystem */
public final class C241133Oa extends 0ng {
    public final String A00;
    public final /* synthetic */ 1NH A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C241133Oa(1NH r2, String str) {
        super(509);
        this.A01 = r2;
        this.A00 = str;
    }

    public final void run() {
        try {
            1NH.A00(this.A01).ED4(this.A00);
        } catch (IllegalStateException unused) {
            0wb.A03("JSONDiskSerializer_Concurrent_Edit ", "remove failed due to attempt to remove cache entry still under edit");
        }
    }
}
