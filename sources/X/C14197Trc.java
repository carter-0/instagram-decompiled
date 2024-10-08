package X;

/* renamed from: X.Trc  reason: case insensitive filesystem */
public final class C14197Trc implements C20952X6f {
    public final /* synthetic */ C14190TrU A00;

    public C14197Trc(C14190TrU trU) {
        this.A00 = trU;
    }

    public final int getCount() {
        C231272rL AZK;
        C14190TrU trU = this.A00;
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C238133Ar r0 = trU.A00;
        if (r0 != null && (AZK = r0.AZK()) != null) {
            return AZK.getCount();
        }
        C238133Ar r02 = trU.A00;
        if (r02 != null) {
            return r02.getCount();
        }
        throw new IllegalStateException("Adapter is null");
    }

    public final Object getItem(int i) {
        C231272rL AZK;
        C14190TrU trU = this.A00;
        int i2 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C238133Ar r0 = trU.A00;
        if (r0 == null || (AZK = r0.AZK()) == null) {
            return null;
        }
        return AZK.getItem(i);
    }
}
