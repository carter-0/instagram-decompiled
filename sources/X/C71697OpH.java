package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.OpH  reason: case insensitive filesystem */
public final class C71697OpH implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ NAL A04;
    public final /* synthetic */ Object A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, this.A03, C66581MXm.A0K(), 0, 1, "MCAMailboxTamReportingShim", "TamSendImpersonationReportShim", new C71725Opj(this, 18));
    }

    public C71697OpH(MailboxFutureImpl mailboxFutureImpl, NAL nal, Object obj, String str, String str2, int i, long j, long j2) {
        this.A04 = nal;
        this.A03 = mailboxFutureImpl;
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
        this.A06 = str;
        this.A05 = obj;
        this.A07 = str2;
    }
}
