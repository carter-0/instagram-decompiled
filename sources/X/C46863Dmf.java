package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* renamed from: X.Dmf  reason: case insensitive filesystem */
public final class C46863Dmf extends C249403jg {
    public boolean A00;
    public final UserSession A01;
    public final C46831Dm7 A02;
    public final AnonymousClass4DU A03;
    public final String A04;
    public final String A05;

    public C46863Dmf(UserSession userSession, C46831Dm7 dm7, AnonymousClass4DU r4, String str, String str2) {
        0qQ.A0B(str, 4);
        this.A01 = userSession;
        this.A02 = dm7;
        this.A03 = r4;
        this.A04 = str;
        this.A05 = str2;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A032 = AnonymousClass0fD.A03(-511013107);
        if (i == 0) {
            UserSession userSession = this.A01;
            AnonymousClass4DU r6 = this.A03;
            String str = this.A04;
            String str2 = this.A05;
            AnonymousClass7TG.A1T(userSession, r6, str);
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), "external_share_app_tray_scroll");
            if (A0e.isSampled()) {
                A0e.AAJ("media_id", str);
                A0e.A9F("media_owner_id", DbZ.A0d(str2));
                DbW.A15(A0e, r6);
                A0e.AAJ("share_location", "direct_share_sheet");
                AnonymousClass7TH.A0V(A0e);
            }
        }
        AnonymousClass0fD.A0A(437484067, A032);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        int A0D = AnonymousClass7TG.A0D(recyclerView, -1612564738);
        super.onScrolled(recyclerView, i, i2);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.A0D;
        if (linearLayoutManager != null) {
            int A1a = linearLayoutManager.A1a();
            int A1b = linearLayoutManager.A1b();
            if (A1a > -1 && A1b > -1 && A1a <= A1b) {
                while (true) {
                    View A1D = linearLayoutManager.A1D(A1a);
                    Rect rect = new Rect();
                    if (A1D != null) {
                        A1D.getLocalVisibleRect(rect);
                        i3 = A1D.getWidth();
                    } else {
                        i3 = 0;
                    }
                    if (rect.right >= i3) {
                        C46831Dm7 dm7 = this.A02;
                        String str = ((C49890FBq) dm7.A00.get(A1a)).A08;
                        if (str.hashCode() == -2133928234 && str.equals("add_content_note") && !this.A00) {
                            if (0qQ.A0K(((C49890FBq) dm7.A00.get(A1a)).A08, "add_content_note") && dm7.A06 && A1D != null) {
                                A1D.postDelayed(new C51349Fsh(A1D, dm7), 500);
                            }
                            this.A00 = true;
                        }
                    }
                    if (A1a == A1b) {
                        break;
                    }
                    A1a++;
                }
            }
        }
        AnonymousClass0fD.A0A(1329176071, A0D);
    }
}
