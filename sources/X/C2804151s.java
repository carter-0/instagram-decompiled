package X;

/* renamed from: X.51s  reason: invalid class name and case insensitive filesystem */
public final class C2804151s implements C242803Vz {
    public int A00 = -1;

    public final void A00(int i) {
        11Z.A06("This operation must be run on UI thread.");
        this.A00 = i;
    }

    public final /* synthetic */ int BKg() {
        return -1;
    }

    public final /* synthetic */ int BL7() {
        return -1;
    }

    public final int getPosition() {
        int i = this.A00;
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException("Position is not set.");
    }
}
