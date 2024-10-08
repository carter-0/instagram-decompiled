package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

public final class TNT implements Callable {
    public final int A00;
    public final Object A01;
    public final String A02;

    public TNT(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        int i;
        C60340gF r8;
        Account[] accountArr;
        C251983oI r1;
        switch (this.A00) {
            case 0:
                return ((ShortcutInfoCompatSaverImpl) this.A01).A04.get(this.A02);
            case 1:
                QAQ qaq = (QAQ) this.A01;
                String str = this.A02;
                boolean z = qaq.A03;
                Context context = qaq.getContext();
                if (z) {
                    return C11425STh.A01(context, str, 002.A0R("asset_", str));
                }
                return C11425STh.A01(context, str, (String) null);
            case 2:
                return C11425STh.A04((InputStream) this.A01, this.A02);
            case 3:
                return C11425STh.A02((Context) null, this.A02, (ZipInputStream) this.A01);
            case 4:
                Context context2 = (Context) this.A01;
                String str2 = this.A02;
                HashMap A1E = AnonymousClass7TE.A1E();
                if (context2.checkCallingOrSelfPermission(AnonymousClass000.A00(4455)) == 0) {
                    accountArr = AccountManager.get(context2).getAccountsByType("com.google");
                    0qQ.A07(accountArr);
                } else {
                    accountArr = new Account[0];
                }
                for (Account account : accountArr) {
                    String str3 = null;
                    try {
                        String A0R = 002.A0R("audience:server:client_id:", str2);
                        STr.A06(context2, STr.A02(account, context2, A0R));
                        str3 = STr.A02(account, context2, A0R);
                    } catch (Exception unused) {
                    }
                    String str4 = account.name;
                    if (str3 == null) {
                        str3 = "";
                    }
                    A1E.put(str4, str3);
                }
                r8 = A1E;
                break;
            case 5:
                String str5 = this.A02;
                C10937S1q s1q = (C10937S1q) this.A01;
                try {
                    SJY sjy = new SJY(str5, Arrays.asList(InetAddress.getAllByName(str5)), 0, 0);
                    synchronized (s1q) {
                        S7F s7f = s1q.A00;
                        TreeSet A012 = s7f.A01();
                        if (A012.isEmpty()) {
                            i = 0;
                        } else {
                            i = ((SJY) A012.first()).A01 + 1;
                        }
                        SJY A002 = s7f.A00(sjy);
                        if (A002 == null) {
                            s7f.A03(new SJY(sjy.A02, sjy.A00(), i, 0));
                        } else {
                            s7f.A04(A002, new SJY(sjy.A02, sjy.A00(), i, A002.A00));
                        }
                        s7f.A02();
                    }
                    return sjy;
                } catch (UnknownHostException unused2) {
                    throw new RCY(REM.UnknownHost);
                } catch (SecurityException unused3) {
                    throw new RCY(REM.SecurityException);
                }
            case 6:
                return LI4.A00((Context) this.A01, this.A02);
            default:
                C64086LMe lMe = (C64086LMe) this.A01;
                1Vg r3 = lMe.A03;
                AnonymousClass1WV acquire = r3.acquire();
                acquire.ADh(1, this.A02);
                try {
                    r1 = lMe.A01;
                    r1.beginTransaction();
                    acquire.ATQ();
                    r1.setTransactionSuccessful();
                    C60340gF r82 = C60340gF.A00;
                    r1.endTransaction();
                    r3.release(acquire);
                    r8 = r82;
                    break;
                } catch (Throwable th) {
                    r3.release(acquire);
                    throw th;
                }
        }
        return r8;
    }
}
