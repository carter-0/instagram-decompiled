package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import java.util.List;

/* renamed from: X.Xxx  reason: case insensitive filesystem */
public final class C22242Xxx implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass67N A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ List A0B;
    public final /* synthetic */ boolean A0C;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        C3030067a.A04("MailboxInstagramSecureMessage", C273654mx.A00(3279), this.A00);
        MailboxFutureImpl mailboxFutureImpl = this.A03;
        MailboxNullable A0K = C66581MXm.A0K();
        C22251Xy7 xy7 = new C22251Xy7(this, 3);
        AnonymousClass681 r0 = AnonymousClass67N.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, A0K, IgNetworkConsentStorage.MAX_ENTRIES, 1, "MCAMailboxInstagramSecureMessage", "InstagramMessageInsertOptimistic", xy7);
    }

    public C22242Xxx(AnonymousClass67N r1, MailboxFutureImpl mailboxFutureImpl, Number number, Number number2, String str, String str2, String str3, String str4, String str5, List list, int i, long j, boolean z) {
        this.A02 = r1;
        this.A00 = i;
        this.A03 = mailboxFutureImpl;
        this.A01 = j;
        this.A06 = str;
        this.A0A = str2;
        this.A05 = number;
        this.A04 = number2;
        this.A09 = str3;
        this.A08 = str4;
        this.A0B = list;
        this.A07 = str5;
        this.A0C = z;
    }
}
