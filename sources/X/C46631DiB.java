package X;

import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.HashMap;

/* renamed from: X.DiB  reason: case insensitive filesystem */
public final class C46631DiB implements G85 {
    public final /* synthetic */ C319616qu A00;
    public final /* synthetic */ C307896Rx A01;
    public final /* synthetic */ C277014uI A02;
    public final /* synthetic */ AnonymousClass0aP A03;

    public C46631DiB(C319616qu r1, C307896Rx r2, C277014uI r3, AnonymousClass0aP r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    private final void A00(C51879G5r g5r, String str) {
        String str2;
        String str3;
        String str4;
        String password;
        C18559VuB vuB = new C18559VuB(this.A03);
        C308276Tl A0P = DbS.A0P();
        A0P.A01(RealtimeConstants.SEND_SUCCESS);
        A0P.A02(str);
        Uri uri = null;
        C51908G7c BEz = g5r.BEz();
        if (BEz != null) {
            str2 = BEz.getUsername();
        } else {
            str2 = null;
        }
        A0P.A03(str2, 2);
        if (BEz == null || (password = BEz.getPassword()) == null) {
            str3 = null;
        } else {
            str3 = vuB.A00(password);
        }
        A0P.A03(str3, 3);
        if (BEz != null) {
            str4 = BEz.getUsername();
        } else {
            str4 = null;
        }
        A0P.A03(str4, 4);
        if (BEz != null) {
            uri = BEz.Bh2();
        }
        A0P.A03(uri, 5);
        AnonymousClass6Tm A002 = A0P.A00();
        C46632DiC.A01 = "";
        C299275ur.A00(this.A01, A002, this.A02);
    }

    private final void A01(String str, String str2) {
        if (!0qQ.A0K(str2, "dialog_dismissed") && !0qQ.A0K(str2, "no_account_selected")) {
            String str3 = str;
            if (str != null) {
                C319616qu.A00(this.A03, AnonymousClass05K.A00, "login_smartlock_fetch_failed", "login_smart_lock", "smartlock", (String) null, str3, (HashMap) null);
            }
        }
        C308276Tl A0P = DbS.A0P();
        if (str2 == null) {
            str2 = "failure";
        }
        A0P.A01(str2);
        A0P.A02((Object) null);
        A0P.A03((Object) null, 2);
        A0P.A03((Object) null, 3);
        A0P.A03((Object) null, 4);
        A0P.A03((Object) null, 5);
        C299275ur.A00(this.A01, A0P.A00(), this.A02);
    }

    public final void CIv(Fragment fragment, C252243on r4, AnonymousClass0aP r5, C51879G5r g5r, C46634DiE diE) {
        C51908G7c BEz;
        if (g5r == null || (BEz = g5r.BEz()) == null || BEz.getUsername() == null || BEz.getPassword() == null) {
            A01((String) null, (String) null);
        } else {
            A00(g5r, "multiple");
        }
    }

    public final void CJF(Fragment fragment, C252243on r4, AnonymousClass0aP r5, C51879G5r g5r, C46634DiE diE) {
        C51908G7c BEz;
        if (g5r == null || (BEz = g5r.BEz()) == null || BEz.getUsername() == null || BEz.getPassword() == null) {
            A01((String) null, (String) null);
        } else {
            A00(g5r, "single");
        }
    }

    public final void CJG(String str) {
        A01(str, "failure");
    }

    public final void Cok() {
        A01("dialog_dismissed", (String) null);
    }

    public final void Crh() {
        A01("no_account_selected", (String) null);
    }
}
