package X;

/* renamed from: X.Ov2  reason: case insensitive filesystem */
public final class C72028Ov2 implements AnonymousClass68Z {
    public final int A00;
    public final long A01;
    public final String A02;

    public C72028Ov2(long j, String str, int i) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = str;
    }

    public final Object apply(Object obj) {
        String str;
        long j;
        C269794fh A002;
        int i;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                str = this.A02;
                j = this.A01;
                MYb mYb = MYb.A0M;
                A002 = AnonymousClass6F9.A00("query_report");
                i = 1;
                break;
            case 1:
                str = this.A02;
                j = this.A01;
                MYb mYb2 = MYb.A0M;
                A002 = AnonymousClass6F9.A00("rxmailbox_load_media_from_msys_media_cache");
                i = 0;
                break;
            default:
                j = this.A01;
                str = this.A02;
                A002 = AnonymousClass6F9.A00("tam_client_thread_update_thread_image");
                i = 2;
                break;
        }
        return 1aU.A07(new C72141Ox0(obj2, str, i, j), A002);
    }
}
