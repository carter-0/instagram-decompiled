package X;

/* renamed from: X.6dL  reason: invalid class name and case insensitive filesystem */
public final class C311816dL extends AnonymousClass1VF {
    public C311816dL() {
        super(3, 4);
    }

    public final void migrate(1W6 r2) {
        0qQ.A0B(r2, 0);
        r2.AT6("\n          ALTER TABLE effect_collections\n          ADD COLUMN hasMore INTEGER NOT NULL DEFAULT 0\n        ");
    }
}
