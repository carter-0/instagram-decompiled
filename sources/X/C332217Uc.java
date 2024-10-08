package X;

/* renamed from: X.7Uc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C332217Uc extends 016 {
    public C332217Uc(Object obj) {
        super(AnonymousClass7TI.class, obj, "expiringMessageReplaySessionId", "getExpiringMessageReplaySessionId()Ljava/lang/String;");
    }

    public final Object get() {
        String str = ((AnonymousClass7TI) this.receiver).A0G;
        if (str != null) {
            return str;
        }
        0qQ.A0F("expiringMessageReplaySessionId");
        throw AnonymousClass00P.createAndThrow();
    }
}
