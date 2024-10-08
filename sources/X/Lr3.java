package X;

public final class Lr3 implements C66487MTq {
    public final /* synthetic */ C62130Kag A00;
    public final /* synthetic */ boolean A01;

    public Lr3(C62130Kag kag, boolean z) {
        this.A01 = z;
        this.A00 = kag;
    }

    public final void onFailure() {
    }

    public final void onSuccess() {
        if (this.A01) {
            C262224Cq r0 = LNv.A02;
            new LNv(AnonymousClass7TE.A0l(this.A00.A02)).A00("igd_nudity_detection_model_loading_settings");
        }
        DbX.A0h(this.A00.A02).A1e(false);
    }
}
