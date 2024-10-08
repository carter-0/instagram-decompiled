package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class NSI extends 0ng {
    public final /* synthetic */ C66633Ma2 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NSI(C66633Ma2 ma2, String str, boolean z) {
        super(1310328368, 2, false, false);
        this.A00 = ma2;
        this.A01 = str;
        this.A02 = z;
    }

    public final void run() {
        int i;
        List list;
        String str;
        C66633Ma2 ma2 = this.A00;
        C290645fe r1 = ma2.A0K;
        if (r1 == null) {
            0qQ.A0F("banyanClient");
            throw AnonymousClass00P.createAndThrow();
        }
        C290865g5 A012 = r1.A01(this.A01);
        boolean z = this.A02;
        String str2 = A012.A01;
        if (str2 != null) {
            C290965gI.A00(ma2.A0p()).A00(77014026, str2, "direct_ibc_inbox_discovery", A012.A02.size());
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        HashSet A0D = ma2.A0v().A0C.A0D(ma2.A0t());
        HashSet A1F = AnonymousClass7TE.A1F();
        Iterator it = ma2.A0x.iterator();
        while (it.hasNext()) {
            String A08 = DbT.A0f(it).A08();
            if (A08 != null) {
                A1F.add(A08);
            }
        }
        Iterator it2 = A012.A02.iterator();
        while (it2.hasNext()) {
            DirectShareTarget A0f = DbT.A0f(it2);
            String A082 = A0f.A08();
            if (!00k.A0u(A0D, A082) && !00k.A0u(A1F, A082)) {
                A1C.add(A0f);
            }
        }
        UserSession A0p = ma2.A0p();
        0Tu r7 = 0Tu.A05;
        List list2 = A1C;
        if (DbS.A04(r7, A0p, 36600882370121764L) == 2) {
            list2 = A1C.subList(0, Math.min(5, A1C.size()));
        }
        List A0X = 00k.A0X(list2);
        if (182.A06(r7, ma2.A0p(), 36317934218647207L)) {
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            Context context = ma2.A1J.getContext();
            if (context != null && !A0X.isEmpty()) {
                if (z) {
                    i = A0X.size();
                } else {
                    i = Math.min(A0X.size(), 3);
                }
                for (int i2 = 0; i2 < i; i2++) {
                    DirectShareTarget directShareTarget = (DirectShareTarget) A0X.get(i2);
                    UserSession A0p2 = ma2.A0p();
                    0qQ.A0B(A0p2, 1);
                    0qQ.A0B(directShareTarget, 2);
                    CreatorBroadcastThreadInfo creatorBroadcastThreadInfo = directShareTarget.A04;
                    if (creatorBroadcastThreadInfo == null || ((str = creatorBroadcastThreadInfo.A04) == null && (str = directShareTarget.A0A()) == null)) {
                        list = 0sn.A00;
                    } else {
                        String str3 = creatorBroadcastThreadInfo.A06;
                        UserSession userSession = A0p2;
                        String str4 = str;
                        String str5 = str3;
                        list = OP7.A01(context, userSession, str4, str5, creatorBroadcastThreadInfo.A01, creatorBroadcastThreadInfo.A08);
                    }
                    A1C2.add(new C46500Dg3(directShareTarget, list, i2, false, false, false, false, false));
                }
            }
            C66736Mbh A0U = C66581MXm.A0U(ma2);
            0qQ.A07(A0U.A03.getString(2131959564));
            C67141Miz miz = A0U.A0E;
            if (!miz.A0N.isEmpty() || !A1C2.isEmpty()) {
                miz.A0L = A1C2;
                C66736Mbh.A03(A0U);
            }
        } else {
            if (!z) {
                A0X = A0X.subList(0, Math.min(3, A0X.size()));
            }
            C66581MXm.A0U(ma2).A0A(A0X, 0, false, true);
        }
        if (!ma2.A12) {
            C71140Odl A013 = OPT.A01(ma2);
            0Aj A002 = C71140Odl.A00(A013);
            if (A002.isSampled()) {
                C71140Odl.A04(A002, A013);
                C66582MXn.A19(A002, "channels_suggested_success");
                DbS.A1L(A002, "channel_suggestion_item");
                DbS.A1J(A002, "impression");
                A002.AAJ("ranking_request_id", str2);
                A002.Cgf();
            }
            C290965gI.A00(ma2.A0p()).A00.markerStart(77017147);
            if (str2 != null) {
                C290965gI.A00(ma2.A0p()).A00(77017147, str2, "direct_ibc_inbox_discovery", A0X.size());
            }
            ma2.A12 = true;
        }
    }
}
