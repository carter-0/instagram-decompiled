package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.OpN  reason: case insensitive filesystem */
public final class C71703OpN implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ NAL A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ Object A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, this.A02, C66581MXm.A0K(), 0, 1, "MCAMailboxTamReportingShim", "TamSendReportShim", new C71725Opj(this, 19));
    }

    public C71703OpN(MailboxFutureImpl mailboxFutureImpl, NAL nal, Number number, Number number2, Object obj, String str, String str2, String str3, long j, long j2) {
        this.A03 = nal;
        this.A02 = mailboxFutureImpl;
        this.A01 = j;
        this.A00 = j2;
        this.A09 = str;
        this.A08 = str2;
        this.A04 = number;
        this.A07 = str3;
        this.A05 = number2;
        this.A06 = obj;
    }
}
