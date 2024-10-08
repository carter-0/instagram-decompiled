package X;

/* renamed from: X.6Se  reason: invalid class name and case insensitive filesystem */
public final class C307966Se extends 0ng {
    public final /* synthetic */ C228352lS A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ Long A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C307966Se(C228352lS r4, Integer num, Integer num2, Long l) {
        super(789858355, 3, false, false);
        this.A03 = l;
        this.A00 = r4;
        this.A01 = num;
        this.A02 = num2;
    }

    public final void run() {
        try {
            Long l = this.A03;
            if (l != null) {
                C228352lS.A02(this.A00, "recent_time_on_story", l.longValue());
            }
            Integer num = this.A01;
            if (num != null) {
                C228352lS.A02(this.A00, "ad_consumed_in_story_session", (long) num.intValue());
            }
            Integer num2 = this.A02;
            if (num2 != null) {
                C228352lS.A02(this.A00, "item_consumed_in_story_session", (long) num2.intValue());
            }
            C228352lS.A02(this.A00, "last_story_session_end_timestamp", System.currentTimeMillis());
        } catch (Exception e) {
            SOZ.A00(e, "error while collecting signals");
        }
    }
}
