package X;

/* renamed from: X.Kfb  reason: case insensitive filesystem */
public final class C62426Kfb extends LBA implements C232262tL {
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "video_metadata_fundraiser";
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        LBA lba = (LBA) obj;
        if (lba != null && this.A00 == lba.A00 && this.A01 == lba.A01 && this.A02 == lba.A02 && 2PP.A00(this.A05, lba.A05)) {
            return true;
        }
        return false;
    }
}
