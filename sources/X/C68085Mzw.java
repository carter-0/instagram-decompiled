package X;

/* renamed from: X.Mzw  reason: case insensitive filesystem */
public final class C68085Mzw extends 1Vg {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68085Mzw(C251983oI r1, Object obj, int i) {
        super(r1);
        this.A00 = i;
        this.A01 = obj;
    }

    public final String createQuery() {
        switch (this.A00) {
            case 0:
                return "DELETE FROM bff_ranked_user_model";
            case 1:
                return "DELETE FROM call_recipients_ranked_user_model";
            case 2:
                return "DELETE FROM message_deletes_table WHERE thread_jid == ?";
            case 3:
                return "DELETE FROM message_deletes_table WHERE item_id < ?";
            case 4:
                return "DELETE FROM message_updates_table WHERE thread_jid == ? AND target_item_id == ?";
            case 5:
                return "DELETE FROM message_updates_table WHERE thread_jid == ?";
            case 6:
                return "DELETE FROM message_updates_table WHERE hidden_ts_sec < ?";
            case 7:
                return "DELETE FROM messages_table WHERE thread_jid == ?";
            case 8:
                return "UPDATE messages_table SET hidden = 1, hidden_ts_sec = ? WHERE thread_jid == ? AND item_id <= ? AND shh == 1 AND hidden == 0";
            default:
                return "\n    DELETE FROM participant_device_change WHERE user_id = ?\n  ";
        }
    }
}
