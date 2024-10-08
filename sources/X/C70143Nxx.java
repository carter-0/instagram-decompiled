package X;

import com.facebook.msys.mci.TraceLogger;
import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import java.util.List;

/* renamed from: X.Nxx  reason: case insensitive filesystem */
public abstract class C70143Nxx {
    public static final void A00(UserSession userSession, String str, int i, int i2, int i3, int i4, long j, long j2, long j3, long j4) {
        1GK nqw;
        List list;
        int i5;
        UserSession userSession2 = userSession;
        String str2 = str;
        AnonymousClass7TF.A1E(userSession2, 0, str2);
        int i6 = i4;
        Integer valueOf = Integer.valueOf(i6);
        C70808OMd A00 = O0G.A00(userSession2);
        if (!182.A06(0Tu.A05, userSession2, 2342161901209459319L)) {
            0KC.A0C("ArmadilloExpressIncomingPlaceholderDispatcher", "ArmadilloExpress placeholder message is currently disabled.");
            list = null;
            i5 = 1;
        } else if (i != 5) {
            0KC.A0C("ArmadilloExpressIncomingPlaceholderDispatcher", "Placeholder is only enabled for ArmadilloExpress.");
            list = null;
            i5 = 2;
        } else {
            A00.A00(str2, C66582MXn.A10((long) i6), 7100, 0);
            long j5 = j2;
            long j6 = j3;
            long j7 = j4;
            MZC.A00(userSession2).A01(AnonymousClass05K.A0u, valueOf, str2, TraceLogger.getTraceIdForAliasId(14, str2), j5, j6, j7);
            C72201OyQ oyQ = ((OE2) userSession2.A01(OE2.class, C73913Plo.A00(userSession2, 2))).A02;
            OO2 oo2 = oyQ.A07;
            oo2.A02(str2, "placeholder", true);
            OTX otx = oyQ.A04;
            AnonymousClass3U9 B34 = otx.A02.B34(j5);
            int i7 = i3;
            if (B34 == null) {
                C70416O5t o5t = new C70416O5t();
                OL8 ol8 = otx.A01;
                OL8 ol82 = ol8;
                ol82.A00(ThreadFetchReason.AE_MISSING_THREAD_AT_PLACEHOLDER_SYNC_OP_RENDERER, str2, new C73967Pml(o5t, otx, str2, i7, i6, j6, j7), i2, j5, j6);
                nqw = o5t.A00;
            } else {
                List A002 = OTX.A00(B34, otx, str2, i7, i6, j6, j7);
                nqw = new NQW();
                nqw.A0A(A002);
            }
            C71033OZu oZu = oo2.A01;
            oZu.A02(str2, "render_start");
            nqw.A03(new C72217Oyl(oyQ, str2, 1)).A03(new C72218Oym(oyQ, str2, j));
            oZu.A02(str2, "dispatch_end");
            return;
        }
        A00.A00(str2, list, 7100, i5);
        A00.A01(str2, false);
    }
}
