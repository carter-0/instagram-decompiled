package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.OoI  reason: case insensitive filesystem */
public final /* synthetic */ class C71637OoI implements MailboxCallback {
    public final /* synthetic */ AnonymousClass67Z A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C71637OoI(AnonymousClass67Z r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void onCompletion(Object obj) {
        AnonymousClass67Z r2 = this.A00;
        String str = this.A01;
        MYb mYb = MYb.A0M;
        r2.A02(str);
        r2.A00();
    }
}
