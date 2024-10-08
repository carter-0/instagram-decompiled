package X;

/* renamed from: X.LlM  reason: case insensitive filesystem */
public final class C64983LlM implements MS0 {
    public final /* synthetic */ C62132Kai A00;

    public C64983LlM(C62132Kai kai) {
        this.A00 = kai;
    }

    public final void DRL() {
        C62132Kai kai = this.A00;
        C64986LlP llP = kai.A00;
        if (llP == null) {
            0qQ.A0F("settingsController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            kai.setItems(llP.A0G);
        }
    }
}
