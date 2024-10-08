package X;

/* renamed from: X.PDu  reason: case insensitive filesystem */
public final /* synthetic */ class C72641PDu implements C74340PtG {
    public final /* synthetic */ NUG A00;

    public /* synthetic */ C72641PDu(NUG nug) {
        this.A00 = nug;
    }

    public final void Dlb(AnonymousClass7BP r3) {
        Integer num;
        NUG nug = this.A00;
        if (r3.A01) {
            if (r3.A03) {
                nug.A0B("INBOX_SNAPSHOT_SUCCESS");
                num = AnonymousClass05K.A00;
            } else {
                nug.A0B("INBOX_SNAPSHOT_FAILURE");
                num = AnonymousClass05K.A01;
            }
            nug.A0A(num);
        }
    }
}
