package X;

/* renamed from: X.Our  reason: case insensitive filesystem */
public final class C72017Our implements AnonymousClass68Z {
    public final int A00;
    public final long A01;

    public C72017Our(long j, int i) {
        this.A00 = i;
        this.A01 = j;
    }

    public final Object apply(Object obj) {
        C269794fh A002;
        int i;
        int i2 = this.A00;
        long j = this.A01;
        switch (i2) {
            case 0:
                MYb mYb = MYb.A0M;
                A002 = AnonymousClass6F9.A00("load_secure_visual_message_action_status");
                i = 0;
                break;
            case 1:
                MYb mYb2 = MYb.A0M;
                A002 = AnonymousClass6F9.A00("convert_fbid_to_thread_pk");
                i = 2;
                break;
            case 2:
                MYb mYb3 = MYb.A0M;
                A002 = AnonymousClass6F9.A00("fetchMessageDataForExternalForward");
                i = 1;
                break;
            case 3:
                A002 = AnonymousClass6F9.A00("tam_client_thread_remove_thread_image");
                i = 5;
                break;
            case 4:
                A002 = AnonymousClass6F9.A00("tam_mark_visual_message_seen");
                i = 7;
                break;
            default:
                A002 = AnonymousClass6F9.A00("tam_mark_visual_message_screenshotted");
                i = 3;
                break;
        }
        return 1aU.A07(new C72126Owl(obj, j, i), A002);
    }
}
