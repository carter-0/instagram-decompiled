package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* renamed from: X.Xy3  reason: case insensitive filesystem */
public final class C22247Xy3 implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass67N A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ List A0A;
    public final /* synthetic */ List A0B;
    public final /* synthetic */ List A0C;
    public final /* synthetic */ List A0D;
    public final /* synthetic */ List A0E;
    public final /* synthetic */ List A0F;
    public final /* synthetic */ List A0G;
    public final /* synthetic */ List A0H;
    public final /* synthetic */ List A0I;
    public final /* synthetic */ List A0J;
    public final /* synthetic */ List A0K;
    public final /* synthetic */ List A0L;
    public final /* synthetic */ List A0M;
    public final /* synthetic */ boolean A0N;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        C3030067a.A04("MailboxInstagramSecureMessage", C273654mx.A00(3278), this.A00);
        MailboxFutureImpl mailboxFutureImpl = this.A03;
        OT4 ot4 = new OT4((Number) null, (List) null);
        C22251Xy7 xy7 = new C22251Xy7(this, 4);
        AnonymousClass681 r0 = AnonymousClass67N.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, ot4, IgNetworkConsentStorage.MAX_ENTRIES, 1, "MCAMailboxInstagramSecureMessage", "InstagramAttachmentClientSend", xy7);
    }

    public C22247Xy3(AnonymousClass67N r3, MailboxFutureImpl mailboxFutureImpl, Number number, Number number2, Number number3, String str, String str2, String str3, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, int i, long j, boolean z) {
        this.A02 = r3;
        this.A00 = i;
        this.A03 = mailboxFutureImpl;
        this.A01 = j;
        this.A0A = list;
        this.A0G = list2;
        this.A0F = list3;
        this.A0M = list4;
        this.A0K = list5;
        this.A0J = list6;
        this.A0L = list7;
        this.A0C = list8;
        this.A0D = list9;
        this.A0H = list10;
        this.A0E = list11;
        this.A0I = list12;
        this.A0B = list13;
        this.A07 = str;
        this.A06 = number;
        this.A05 = number2;
        this.A04 = number3;
        this.A09 = str2;
        this.A08 = str3;
        this.A0N = z;
    }
}
