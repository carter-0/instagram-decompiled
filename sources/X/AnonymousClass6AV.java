package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.6AV  reason: invalid class name */
public final class AnonymousClass6AV implements 1aV {
    public final /* synthetic */ AnonymousClass68G A00;
    public final /* synthetic */ AnonymousClass6AT A01;
    public final /* synthetic */ AnonymousClass6AU A02;

    public AnonymousClass6AV(AnonymousClass68G r1, AnonymousClass6AT r2, AnonymousClass6AU r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.facebook.msys.mca.MailboxFeature, java.lang.Object, X.6AW] */
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        AnonymousClass68J r14 = (AnonymousClass68J) obj;
        0qQ.A0B(r14, 0);
        AnonymousClass6AU r4 = this.A02;
        ? mailboxFeature = new MailboxFeature(r14);
        AnonymousClass6AT r3 = this.A01;
        ListenableFuture A002 = C303606Aa.A00(mailboxFeature.A01((MailboxCallback) null, r4.A0B, r4.A0A, r4.A00));
        1Lf r5 = 1Lf.A01;
        AnonymousClass9MC r2 = new AnonymousClass9MC(10, r4, r3, mailboxFeature);
        0qQ.A0B(A002, 0);
        C255183ti.A04(new C303696Ak(r14, this.A00, r3, r4), C303646Ae.A01(new C303686Aj(new AnonymousClass9MC(11, r4, r3, mailboxFeature)), C303646Ae.A01(new C303626Ac(new C74178PqK(r2, 13)), A002, r5), r5), r5);
    }
}
