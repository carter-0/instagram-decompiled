package X;

/* renamed from: X.38T  reason: invalid class name */
public final class AnonymousClass38T extends AnonymousClass2NN {
    public final AnonymousClass38G A00;

    public final void A02(1W6 r6) {
        0qQ.A0B(r6, 0);
        r6.ADK();
        try {
            r6.AT6(002.A0e("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ", " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))", System.currentTimeMillis() - AnonymousClass3BR.A00));
            ((1W5) r6).A00.setTransactionSuccessful();
        } finally {
            r6.ASV();
        }
    }

    public AnonymousClass38T(AnonymousClass38G r1) {
        this.A00 = r1;
    }
}
