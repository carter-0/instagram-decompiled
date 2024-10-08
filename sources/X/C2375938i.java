package X;

/* renamed from: X.38i  reason: invalid class name and case insensitive filesystem */
public final class C2375938i extends AnonymousClass1VF {
    public static final C2375938i A00 = new C2375938i();

    public final void migrate(1W6 r2) {
        0qQ.A0B(r2, 0);
        r2.AT6("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        r2.AT6("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }

    public C2375938i() {
        super(12, 13);
    }
}
