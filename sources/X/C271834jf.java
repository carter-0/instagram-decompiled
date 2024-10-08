package X;

import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4jf  reason: invalid class name and case insensitive filesystem */
public final class C271834jf extends C271734jV {
    public int A00;
    public long A01;
    public long A02;
    public C271754jX A03;
    public final List A04;
    public final Integer A05;
    public final String A06;

    public C271834jf(C376489Ie r10) {
        String id;
        Integer num;
        C57031ILx A032;
        List<AnonymousClass3OA> list;
        C267324bN r4 = (C267324bN) r10.A03;
        boolean A0G = r4.A0G();
        if (A0G || r4.A01 == C295365o2.BRAND_SURVEY) {
            id = r4.getId();
        } else {
            id = r4.A06().A0S;
        }
        this.A06 = id;
        if (A0G) {
            num = AnonymousClass05K.A0N;
        } else {
            num = AnonymousClass05K.A0C;
        }
        this.A05 = num;
        ArrayList arrayList = null;
        if (r4.A0F() && (A032 = r4.A03()) != null && (list = (List) A032.A01.A00) != null && (!list.isEmpty())) {
            arrayList = new ArrayList(0Yv.A1E(list, 10));
            for (AnonymousClass3OA A012 : list) {
                C376699Iz r0 = r4.A03().A01;
                0sn r3 = 0sn.A00;
                String str = r0.A02;
                IntentAwareAdsInfoIntf intentAwareAdsInfoIntf = (IntentAwareAdsInfoIntf) r0.A01;
                0qQ.A0B(str, 0);
                0qQ.A0B(intentAwareAdsInfoIntf, 1);
                0qQ.A0B(r3, 2);
                arrayList.add(new C271834jf(new C376489Ie(C295375o3.A01(new C376699Iz(intentAwareAdsInfoIntf, str, (List) r3), A012), (C233462vl) r10.A04)));
            }
        }
        this.A04 = arrayList;
        this.A03 = C271754jX.UNDEFINED;
        this.A00 = -1;
        this.A01 = -1;
        this.A02 = -1;
    }

    public final String AZC() {
        return "";
    }

    public final Integer BJb() {
        return this.A05;
    }

    public final List BUP() {
        return this.A04;
    }

    public final int Bfh() {
        return 0;
    }

    public final String getId() {
        return this.A06;
    }
}
