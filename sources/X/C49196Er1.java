package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.Er1  reason: case insensitive filesystem */
public abstract class C49196Er1 {
    public static final ArrayList A00(Context context) {
        0qQ.A0B(context, 0);
        Account[] accounts = AccountManager.get(context).getAccounts();
        ArrayList A15 = DbV.A15(accounts);
        for (Account account : accounts) {
            if (account.name != null && 0mp.A0C(account.name) && !A15.contains(account.name)) {
                boolean equalsIgnoreCase = "com.google".equalsIgnoreCase(account.type);
                String str = account.name;
                if (equalsIgnoreCase) {
                    0qQ.A06(str);
                    A15.add(0, str);
                } else {
                    0qQ.A06(str);
                    A15.add(str);
                }
            }
        }
        return A15;
    }
}
