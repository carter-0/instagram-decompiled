package X;

/* renamed from: X.IiK  reason: case insensitive filesystem */
public final class C57903IiK implements Runnable {
    public final /* synthetic */ AnonymousClass3KN A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ String A02;

    public C57903IiK(AnonymousClass3KN r1, Integer num, String str) {
        this.A00 = r1;
        this.A01 = num;
        this.A02 = str;
    }

    public final void run() {
        AnonymousClass3KN r1 = this.A00;
        String mediaId = r1.A01.getMediaId();
        if (mediaId != null) {
            0nY.A00().ATE(new H8F(this, DbV.A0U(r1.A00, mediaId), mediaId));
        }
    }
}
