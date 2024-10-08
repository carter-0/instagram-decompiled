package X;

/* renamed from: X.Wjx  reason: case insensitive filesystem */
public final class C20037Wjx implements Runnable {
    public final /* synthetic */ C15998Umf A00;

    public C20037Wjx(C15998Umf umf) {
        this.A00 = umf;
    }

    public final void run() {
        C14792U9h u9h;
        C15998Umf umf = this.A00;
        if (C13990Tnq.A0R(umf).A05 && (u9h = umf.A04) != null) {
            u9h.notifyDataSetChanged();
        }
    }
}
