package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.OoZ  reason: case insensitive filesystem */
public final class C71654OoZ implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ NAL A02;
    public final /* synthetic */ String A03;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, this.A01, C66581MXm.A0K(), 0, 1, "MCAMailboxTamReportingShim", "TamQueryReportShim", new C71725Opj(this, 17));
    }

    public C71654OoZ(MailboxFutureImpl mailboxFutureImpl, NAL nal, String str, long j) {
        this.A02 = nal;
        this.A01 = mailboxFutureImpl;
        this.A00 = j;
        this.A03 = str;
    }
}
