package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebookpay.logging.LoggingContext;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.BitSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.SNr  reason: case insensitive filesystem */
public final class C11336SNr {
    public static final C11336SNr A00 = new Object();

    public final void A01(Context context, Fragment fragment, C8924RFs rFs, LoggingContext loggingContext, List list, List list2, 0sP r19, 0sP r20, boolean z) {
        LoggingContext loggingContext2 = loggingContext;
        0qQ.A0B(loggingContext2, 2);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) Pxe.A0a(AnonymousClass2E0.A00()));
        TYA tya = new TYA(fragment, r19, 37);
        TYA tya2 = new TYA(fragment, r20, 38);
        C10760Rxe rxe = new C10760Rxe(context);
        String str = loggingContext2.A02;
        Map map = rxe.A03;
        map.put("upl_session_id", str);
        BitSet bitSet = rxe.A01;
        bitSet.set(2);
        map.put("apply_incentive", Q3B.A01(tya, rxe, 17));
        bitSet.set(0);
        map.put("remove_incentive", Q3B.A01(tya2, rxe, 18));
        bitSet.set(1);
        map.put("show_promocode_input", Boolean.valueOf(z));
        List list3 = list;
        if (AnonymousClass7TE.A1b(list3) && !list3.isEmpty()) {
            map.put("available_offers", list3);
        }
        List list4 = list2;
        if (AnonymousClass7TE.A1b(list4) && !list4.isEmpty()) {
            map.put("applied_offer_ids", list4);
        }
        if (bitSet.nextClearBit(0) >= 3) {
            C46649DiU A0T = Pxf.A0T("com.bloks.www.ecp.incentive.offer-selection", rxe.A04, map);
            C46649DiU.A0B(A0T, 719983200);
            A0T.A03 = null;
            A0T.A02 = null;
            A0T.A04 = null;
            A0T.A0H(rxe.A02);
            AnonymousClass3M3 A0C = A0T.A0C(rxe.A00, igBloksScreenConfig);
            C8608Qxp qxp = (C8608Qxp) fragment;
            0s0 r1 = qxp.A0D;
            AnonymousClass0YZ[] r6 = C8608Qxp.A0X;
            AnonymousClass7TF.A1J(qxp, r1, r6, 19, false);
            DbS.A1a(qxp, (Object) null, qxp.A0E, r6, 1);
            DbS.A1a(qxp, (Object) null, qxp.A0R, r6, 6);
            DbS.A1a(qxp, rFs.A00, qxp.A0G, r6, 2);
            DbS.A1a(qxp, new C11497SbK(new C73912Pln(qxp, 42), 63), qxp.A0H, r6, 11);
            0qQ.A0A(A0C);
            0qQ.A0B(A0C, 1);
            AnonymousClass7TF.A0D().post(new C13060TJq(A0C, (C13894TjH) fragment, true, false));
            return;
        }
        throw DbU.A0i();
    }

    public static final void A00(Bundle bundle, Fragment fragment, String str, boolean z, boolean z2) {
        AnonymousClass7TF.A0D().post(new C13060TJq(AnonymousClass2E0.A01().A03(bundle, str), (C13894TjH) fragment, z, z2));
    }
}
