package X;

/* renamed from: X.WOr  reason: case insensitive filesystem */
public final class C19185WOr implements X6U {
    public final /* synthetic */ X6M A00;

    public C19185WOr(X6M x6m) {
        this.A00 = x6m;
    }

    public final void DED() {
        this.A00.DED();
    }

    public final void Dol(boolean z) {
        X6M x6m = this.A00;
        if (z) {
            x6m.onSuccess();
        } else {
            x6m.DED();
        }
    }
}
