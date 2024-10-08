package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mci.NotificationCenter;

/* renamed from: X.6Ak  reason: invalid class name and case insensitive filesystem */
public final class C303696Ak implements 2IR {
    public final /* synthetic */ AnonymousClass68J A00;
    public final /* synthetic */ AnonymousClass68G A01;
    public final /* synthetic */ AnonymousClass6AT A02;
    public final /* synthetic */ AnonymousClass6AU A03;

    public final void onFailure(Throwable th) {
        0qQ.A0B(th, 0);
        0KC.A0F("RxAdvancedCryptoTransportV2", "Cannot initialize ACT due to failure on upserting current user: %s", th);
        this.A03.A06.A05("fail_upserting_current_user");
        0wb.A07("RxAdvancedCryptoTransportV2", th);
    }

    public C303696Ak(AnonymousClass68J r1, AnonymousClass68G r2, AnonymousClass6AT r3, AnonymousClass6AU r4) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.632, com.facebook.msys.mca.MailboxFeature] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass6AU r3 = this.A03;
        2I1 r2 = r3.A06;
        r2.A04("create_act_connection_params_start");
        AnonymousClass1aS r1 = r3.A01;
        NotificationCenter A002 = C300465xE.A00();
        r1.accept(new AnonymousClass634(new MailboxFeature(this.A00), A002, this.A01, this.A02, r3.A05, r3.A09, r3.A0B));
        r2.A04("create_act_connection_params_end");
    }
}
