package X;

/* renamed from: X.9Z7  reason: invalid class name */
public final class AnonymousClass9Z7 extends AnonymousClass1VF {
    public AnonymousClass9Z7() {
        super(1, 2);
    }

    public final void migrate(1W6 r2) {
        0qQ.A0B(r2, 0);
        r2.AT6("\n          ALTER TABLE medias\n          ADD COLUMN ranking_score REAL NOT NULL DEFAULT 0\n        ");
    }
}
