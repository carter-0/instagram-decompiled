package X;

/* renamed from: X.7Tk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C332037Tk extends 016 {
    public C332037Tk(Object obj) {
        super(AnonymousClass7TI.class, obj, "threadViewerSessionId", "getThreadViewerSessionId()Ljava/lang/String;");
    }

    public final Object get() {
        String str = ((AnonymousClass7TI) this.receiver).A0H;
        if (str != null) {
            return str;
        }
        0qQ.A0F("threadViewerSessionId");
        throw AnonymousClass00P.createAndThrow();
    }
}
