package X;

/* renamed from: X.FbZ  reason: case insensitive filesystem */
public final class C50426FbZ implements G70 {
    public final /* synthetic */ C47449E2v A00;

    public C50426FbZ(C47449E2v e2v) {
        this.A00 = e2v;
    }

    public final void onFailure() {
        C59689JTv.A0D(this.A00.requireContext(), "request_error");
    }

    public final void onSuccess() {
        C47449E2v e2v = this.A00;
        e2v.A06 = true;
        C47449E2v.A01(e2v);
    }
}
