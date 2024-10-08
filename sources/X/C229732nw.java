package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2nw  reason: invalid class name and case insensitive filesystem */
public final class C229732nw implements C229742nx {
    public String A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;

    public final /* bridge */ /* synthetic */ void DM1(Object obj, int i, int i2) {
        String str;
        1Xg r13 = (1Xg) obj;
        0qQ.A0B(r13, 0);
        String str2 = this.A00;
        boolean z = false;
        if (str2 != null) {
            z = 00l.A0d(str2, r13.A09, false);
        }
        1Xj A022 = 1Xi.A02(r13.A05);
        if (A022 != null) {
            if (1UQ.A0Y == r13.A06) {
                UserSession userSession = this.A01;
                C271794jb r4 = new C271794jb(userSession, A022);
                AnonymousClass4DU r6 = this.A02;
                C233822wX.A0N(userSession, r4, A022, r6, AnonymousClass05K.A01, "delivery");
                if (A022.CcK() && !C228342lQ.A08(userSession, 1Au.A00(userSession))) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("duplicate_ad_inserted");
                    if (z) {
                        arrayList.add("duplicate_ad_in_view_state");
                    }
                    List singletonList = Collections.singletonList("duplicate_ad_received");
                    0qQ.A07(singletonList);
                    C233822wX.A0O(userSession, r4, A022, r6, Integer.valueOf(A022.A0m()), "duplicate_ad_received", A022.A2p(), arrayList, singletonList);
                    AnonymousClass3VI.A00(userSession).A06(r6, r13.A07);
                }
            }
            if (A022.CcK()) {
                return;
            }
        }
        AnonymousClass3VK A002 = AnonymousClass3VI.A00(this.A01);
        AnonymousClass3VL r2 = AnonymousClass3VL.FEED;
        Integer num = AnonymousClass05K.A00;
        if (A022 == null || (str = A022.getId()) == null) {
            str = "";
        }
        A002.A07(new C52567GXs(r2, num, Integer.valueOf(i2), Integer.valueOf(i), (Integer) null, (Integer) null, (String) null, str));
    }

    public C229732nw(UserSession userSession, AnonymousClass4DU r2) {
        this.A01 = userSession;
        this.A02 = r2;
    }
}
