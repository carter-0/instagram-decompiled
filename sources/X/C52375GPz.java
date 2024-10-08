package X;

import android.content.Context;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GPz  reason: case insensitive filesystem */
public final class C52375GPz implements C253023q5 {
    public final UserSession A00;
    public final Context A01;
    public final C252933pw A02;
    public final boolean A03;

    public C52375GPz(Context context, UserSession userSession, C252933pw r3, boolean z) {
        AnonymousClass7TG.A1O(context, userSession);
        this.A01 = context;
        this.A00 = userSession;
        this.A03 = z;
        this.A02 = r3;
    }

    public final void D2o(ClickableSpan clickableSpan, View view, UserSession userSession, String str) {
        int i;
        String str2;
        AnonymousClass7TG.A1N(userSession, str);
        if (this.A03) {
            C252933pw r6 = this.A02;
            C46277DTg dTg = (C46277DTg) r6.A01.A0f.get(str);
            if (dTg != null) {
                String Bgr = dTg.Bgr();
                String BhP = dTg.BhP();
                Context context = this.A01;
                String str3 = "com.facebook.wakizashi";
                if (context.getPackageManager().getLaunchIntentForPackage(str3) == null && context.getPackageManager().getLaunchIntentForPackage("com.facebook.katana") == null) {
                    if (BhP != null) {
                        try {
                            FragmentActivity A002 = C334957c9.A00(context, FragmentActivity.class);
                            if (A002 != null) {
                                if (182.A06(0Tu.A05, this.A00, 36325420345471947L)) {
                                    C48917EmH.A00(A002, AnonymousClass05K.A01, Bgr, new C73673Phm(context, this, BhP, 16));
                                }
                            }
                            0kR.A0F(context, DbT.A09(BhP));
                        } catch (NullPointerException | SecurityException unused) {
                        }
                    }
                } else if (Bgr != null) {
                    Uri A09 = DbT.A09(Bgr);
                    if (context.getPackageManager().getLaunchIntentForPackage(str3) == null) {
                        str3 = "com.facebook.katana";
                    }
                    0kR.A0A(context, C51976G9y.A03(A09, str3));
                }
                1sy r1 = r6.A03;
                0qQ.A06(r1);
                if (1sy.A0H == r1 || 1sy.A0I == r1 || 1sy.A0U == r1) {
                    i = 1696;
                } else if (r1 == 1sy.A08) {
                    i = 563;
                } else {
                    str2 = "";
                    AnonymousClass4H4.A00.A06(userSession, str2);
                }
                str2 = AnonymousClass000.A00(i);
                AnonymousClass4H4.A00.A06(userSession, str2);
            }
        }
    }
}
