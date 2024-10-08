package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxNullable;

/* renamed from: X.OoH  reason: case insensitive filesystem */
public final /* synthetic */ class C71636OoH implements MailboxCallback {
    public final /* synthetic */ AnonymousClass67Z A00;
    public final /* synthetic */ C74458PvD A01;

    public /* synthetic */ C71636OoH(AnonymousClass67Z r1, C74458PvD pvD) {
        this.A01 = pvD;
        this.A00 = r1;
    }

    public final void onCompletion(Object obj) {
        Object mgO;
        C74458PvD pvD = this.A01;
        AnonymousClass67Z r2 = this.A00;
        MailboxNullable mailboxNullable = (MailboxNullable) obj;
        MYb mYb = MYb.A0M;
        if (mailboxNullable.value == null) {
            pvD.DOH("fail to load secure threads");
            mgO = C72176Oxl.A01("fail to load secure threads");
        } else {
            pvD.DO9();
            mgO = new C66990MgO(mailboxNullable.value);
        }
        r2.A02(mgO);
        r2.A00();
    }
}
