package X;

/* renamed from: X.WOp  reason: case insensitive filesystem */
public final class C19183WOp implements X6T {
    public final /* synthetic */ X6M A00;

    public C19183WOp(X6M x6m) {
        this.A00 = x6m;
    }

    public final void DED() {
        this.A00.DED();
    }

    public final void Don(boolean z, boolean z2) {
        if (z || z2) {
            this.A00.onSuccess();
        } else {
            this.A00.DED();
        }
    }
}
