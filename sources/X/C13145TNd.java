package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: X.TNd  reason: case insensitive filesystem */
public final class C13145TNd implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C13145TNd(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        if (2 - this.A00 != 0) {
            AccountManager accountManager = (AccountManager) this.A01;
            0qQ.A0A(accountManager);
            return FH1.A00(new Account(this.A03, "com.google"), accountManager, (AnonymousClass0iw) null, (0lg) this.A02, "LOG_IN", false, false);
        }
        try {
            File file = (File) this.A01;
            if (0mb.A03(file.getPath()) < 1024) {
                0wb.A03("group_photo_too_small", String.valueOf(this.A03));
            }
            return C64134LPj.A00((UserSession) this.A02, this.A03, JTP.A0u(file));
        } catch (Exception e) {
            0wb.A06("group_photo_task", "Error building group photo config", e);
            return null;
        }
    }
}
