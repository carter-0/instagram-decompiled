package X;

/* renamed from: X.4zk  reason: invalid class name and case insensitive filesystem */
public final class C279954zk extends 1Vg {
    public final /* synthetic */ C279934zi A00;

    public final String createQuery() {
        return "\n    DELETE FROM note_entities_data\n    WHERE entity_index NOT IN (\n      SELECT entity_index\n      FROM note_entities_data\n      WHERE stored_time > ?\n      ORDER BY stored_time DESC\n      LIMIT ?\n    )\n  ";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C279954zk(C251983oI r1, C279934zi r2) {
        super(r1);
        this.A00 = r2;
    }
}
