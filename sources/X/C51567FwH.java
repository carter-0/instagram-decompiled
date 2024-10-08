package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import java.util.concurrent.Callable;

/* renamed from: X.FwH  reason: case insensitive filesystem */
public final class C51567FwH implements Callable {
    public final /* synthetic */ Account A00;
    public final /* synthetic */ AccountManager A01;
    public final /* synthetic */ 0lg A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public C51567FwH(Account account, AccountManager accountManager, 0lg r3, boolean z, boolean z2) {
        this.A00 = account;
        this.A02 = r3;
        this.A01 = accountManager;
        this.A03 = z;
        this.A04 = z2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        Account account = this.A00;
        String obj = account.toString();
        0lg r5 = this.A02;
        AccountManager accountManager = this.A01;
        0qQ.A0A(accountManager);
        String A002 = FH1.A00(account, accountManager, (AnonymousClass0iw) null, r5, "LOG_IN", this.A03, this.A04);
        if (A002 == null) {
            A002 = "";
        }
        return AnonymousClass7TE.A1L(obj, A002);
    }
}
