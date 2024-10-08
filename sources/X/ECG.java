package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class ECG extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public ECG(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i, boolean z) {
        this.A00 = i;
        this.A01 = obj2;
        this.A05 = str;
        this.A02 = obj3;
        this.A04 = obj4;
        this.A06 = str2;
        this.A07 = z;
        this.A03 = obj;
    }

    public final void onFinish() {
        if (this.A00 != 0) {
            ECG.super.onFinish();
            return;
        }
        int A032 = AnonymousClass0fD.A03(2079162782);
        ECG.super.onFinish();
        C49933FFm.A00.set(false);
        AnonymousClass0fD.A0A(-689893571, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032;
        int i;
        int i2;
        int i3;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(-1091916056);
            1XO r13 = (1XO) obj;
            int A033 = AnonymousClass0fD.A03(44800004);
            0qQ.A0B(r13, 0);
            List list = r13.A06;
            0qQ.A07(list);
            1Xj r1 = (1Xj) 00k.A0J(list);
            if (r1 == null) {
                i3 = -2044232999;
            } else {
                C229352nF r5 = (C229352nF) this.A01;
                String str = this.A05;
                r5.A03(new C276104sZ((String) null, true), C294895nD.DEFAULT, str, AnonymousClass7TE.A1I(C295375o3.A02(r1)), true, false);
                C307896Rx r3 = (C307896Rx) this.A02;
                C308206Td.A0K(r3, new C50300FXf(r5, r3, str, 3));
                UserSession userSession = (UserSession) this.A04;
                C270634h3 r32 = new C270634h3(ClipsViewerSource.ACCOUNT_INSIGHTS, userSession);
                r32.A1C = this.A06;
                r32.A1B = userSession.A06;
                r32.A1F = str;
                r32.A1c = false;
                boolean z = this.A07;
                FragmentActivity fragmentActivity = (FragmentActivity) this.A03;
                if (z) {
                    I6Y.A01(fragmentActivity, r32, userSession, false);
                } else {
                    DbU.A1M(fragmentActivity, r32, userSession);
                }
                i3 = 1463291692;
            }
            AnonymousClass0fD.A0A(i3, A033);
            i2 = -1734844274;
        } else {
            A032 = AnonymousClass0fD.A03(-1808293379);
            1XO r132 = (1XO) obj;
            int A034 = AnonymousClass0fD.A03(-1627352872);
            0qQ.A0B(r132, 0);
            List list2 = r132.A06;
            0qQ.A07(list2);
            1Xj r12 = (1Xj) 00k.A0J(list2);
            if (r12 == null) {
                i = -1812207144;
            } else {
                C229352nF r52 = (C229352nF) this.A01;
                String str2 = this.A05;
                List A1I = AnonymousClass7TE.A1I(C295375o3.A02(r12));
                C298855u9 A002 = C276114sa.A00.A00(false);
                A002.A00 = null;
                r52.A03(A002.A00(), C294895nD.DEFAULT, str2, A1I, true, false);
                C307896Rx r6 = (C307896Rx) this.A02;
                C308206Td.A0K(r6, new C50300FXf(r52, r6, str2, 2));
                UserSession userSession2 = (UserSession) this.A04;
                C270634h3 r2 = new C270634h3(ClipsViewerSource.RECENTLY_DELETED, userSession2);
                r2.A1C = this.A06;
                r2.A1B = userSession2.A06;
                r2.A1F = str2;
                r2.A1S = this.A07;
                r2.A1d = true;
                ClipsViewerConfig A003 = r2.A00();
                AnonymousClass6SN.A00 = new C51085FoF(r6, (C277014uI) this.A03);
                C243473Yx.A06(C308206Td.A04(r6), A003, userSession2, 1001);
                i = 1329209404;
            }
            AnonymousClass0fD.A0A(i, A034);
            i2 = 1948220972;
        }
        AnonymousClass0fD.A0A(i2, A032);
    }
}
