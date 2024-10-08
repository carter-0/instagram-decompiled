package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.4AF  reason: invalid class name */
public final class AnonymousClass4AF {
    public String A00 = null;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ AnonymousClass4AD A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public AnonymousClass4AF(Fragment fragment, AnonymousClass0iw r3, UserSession userSession, AnonymousClass4AD r5, String str, boolean z) {
        this.A05 = str;
        this.A03 = userSession;
        this.A06 = z;
        this.A01 = fragment;
        this.A04 = r5;
        this.A02 = r3;
    }

    public final void A00(View view, View view2, C319726r6 r18, AnonymousClass4AS r19) {
        UserSession userSession = this.A03;
        C3018660j.A01(userSession).A0H(r18, r19);
        new C72363P3c(userSession, this.A01.requireActivity()).DUZ(C71047OaP.A00(view, view2, (C68209N5y) null, this.A05, this.A00, (String) null, (String) null, false, false, false, this.A06));
        this.A04.Dah();
    }

    public final void A01(C319726r6 r35, AnonymousClass4AB r36) {
        C319726r6 r1 = r35;
        0qQ.A0B(r1, 1);
        UserSession userSession = this.A03;
        C3018760k A012 = C3018660j.A01(userSession);
        AnonymousClass4AB r4 = r36;
        A012.A0L(r4);
        A012.A0I(r1, r4);
        A012.A0E(C69506Nmo.A0b, (GT1) null, (HOK) null, (Boolean) null, true, (Long) null, (String) null, (String) null);
        List<AnonymousClass913> list = r4.A0J;
        if (list.isEmpty()) {
            A012.A0F(C69474NmI.DWELL);
            C71110Ocp.A00.A05(this.A01, this.A02, userSession, r4.A0A);
            return;
        }
        boolean z = r4.A0T;
        if (!z || 0qQ.A0K(r4.A0A.getId(), userSession.A06) || !AnonymousClass4AJ.A0A(userSession)) {
            for (AnonymousClass913 BWY : list) {
                C71147Oe5 oe5 = C71147Oe5.A00;
                Fragment fragment = this.A01;
                AnonymousClass0iw r15 = this.A02;
                AnonymousClass4AD r14 = this.A04;
                C279864zZ BWY2 = BWY.BWY();
                NotePogVideoDict notePogVideoDict = r4.A08;
                boolean z2 = r4.A0R;
                boolean z3 = r4.A0S;
                boolean z4 = r4.A0Q;
                String str = r4.A0G;
                String str2 = r4.A0H;
                Integer num = r4.A0D;
                String str3 = str2;
                boolean z5 = z2;
                boolean z6 = z3;
                boolean z7 = z4;
                UserSession userSession2 = userSession;
                AnonymousClass4AD r23 = r14;
                Integer num2 = num;
                String str4 = str;
                NotePogVideoDict notePogVideoDict2 = notePogVideoDict;
                AnonymousClass0iw r21 = r15;
                oe5.A09(fragment, notePogVideoDict2, BWY2, r21, userSession2, r23, num2, str4, str3, z5, z6, z7, z, false, this.A06, C71147Oe5.A06(userSession, r4));
            }
        } else {
            list.isEmpty();
            this.A04.Dai(Long.parseLong(((AnonymousClass913) list.get(0)).BWY().A0H));
        }
        if (r4.A0S && 182.A06(0Tu.A05, userSession, 36321310062224643L)) {
            String str5 = r4.A0G;
            if (str5 != null) {
                this.A04.Cls(str5);
            }
        } else if (z && 182.A06(0Tu.A05, userSession, 36321310062355717L)) {
            for (AnonymousClass913 BWY3 : list) {
                String str6 = BWY3.BWY().A0H;
                String str7 = r4.A0G;
                if (str7 != null) {
                    this.A04.Clt(str6, str7);
                }
            }
        }
    }
}
