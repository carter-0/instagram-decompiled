package X;

import android.app.Activity;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.LinkedHashMap;

/* renamed from: X.Vmp  reason: case insensitive filesystem */
public abstract class C18175Vmp {
    public static final void A00(Activity activity, PromoteData promoteData, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        BitSet bitSet = new BitSet(5);
        linkedHashMap.put("flow_id", str);
        bitSet.set(2);
        PromoteData promoteData2 = promoteData;
        String str2 = promoteData2.A1S;
        0qQ.A06(str2);
        linkedHashMap.put("media_id", str2);
        bitSet.set(3);
        String str3 = promoteData2.A1d;
        String str4 = "";
        if (str3 == null) {
            str3 = str4;
        }
        linkedHashMap.put("current_beneficiary_id", str3);
        bitSet.set(0);
        String str5 = promoteData2.A1g;
        if (str5 != null) {
            str4 = str5;
        }
        linkedHashMap.put("current_payer_id", str4);
        bitSet.set(1);
        linkedHashMap.put("on_save_beneficiary_payer", new Q3B(new C66310MMt(new C20795Wz7(promoteData2), 37)));
        bitSet.set(4);
        if (bitSet.nextClearBit(0) >= 5) {
            C11844ShW shW = new C11844ShW("com.bloks.www.ig.boost.beneficiary_payer_screen_query", (String) null, (String) null, 0Yt.A0B(linkedHashMap), 0Yt.A0E(), 719983200, 30, true);
            UserSession userSession = promoteData2.A0y;
            0qQ.A06(userSession);
            C307506Qj A00 = C48721Ej6.A00(userSession, false);
            WF5 wf5 = new WF5((C17668Vbz) null, (C277014uI) null, (Boolean) null, (Integer) null);
            0qQ.A0B(A00, 1);
            shW.E0s(activity, wf5, A00);
            return;
        }
        throw new IllegalStateException("Missing required params");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = (r2 = (com.instagram.api.schemas.AudienceValidationResponse) X.00k.A0O(r4.A0B, 0)).A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        r0 = r2.A05;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(com.instagram.business.promote.model.PromoteAudience r4) {
        /*
            r3 = 0
            if (r4 == 0) goto L_0x0023
            java.util.List r0 = r4.A0B
            java.lang.Object r2 = X.00k.A0O(r0, r3)
            com.instagram.api.schemas.AudienceValidationResponse r2 = (com.instagram.api.schemas.AudienceValidationResponse) r2
            r1 = 1
            if (r2 == 0) goto L_0x0023
            java.lang.String r0 = r2.A03
            if (r0 == 0) goto L_0x0023
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0023
            java.util.List r0 = r2.A05
            if (r0 == 0) goto L_0x0023
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != r1) goto L_0x0023
            r3 = 1
        L_0x0023:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18175Vmp.A01(com.instagram.business.promote.model.PromoteAudience):boolean");
    }
}
