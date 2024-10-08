package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.request.DirectThreadApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Phn  reason: case insensitive filesystem */
public final class C73674Phn extends 0Yg implements C62320sa {
    public final /* synthetic */ long A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C331237Qc A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ 0rm A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73674Phn(UserSession userSession, C331237Qc r3, Map map, C62320sa r5, 0rm r6, long j) {
        super(0);
        this.A05 = r6;
        this.A01 = userSession;
        this.A00 = j;
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = map;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        0rm r2 = this.A05;
        ((List) r2.A00).size();
        UserSession userSession = this.A01;
        long j = this.A00;
        Iterable iterable = (Iterable) r2.A00;
        ArrayList A0p = AnonymousClass7TF.A0p(iterable);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            A0p.add(JTO.A1A(it).A00);
        }
        Iterable iterable2 = (Iterable) r2.A00;
        ArrayList A0p2 = AnonymousClass7TF.A0p(iterable2);
        Iterator it2 = iterable2.iterator();
        while (it2.hasNext()) {
            A0p2.add(JTO.A1A(it2).A01);
        }
        C331237Qc r4 = this.A02;
        String A0j = AnonymousClass7TG.A0j();
        String str = r4.A00.A00;
        if (str != null) {
            C66716MbN mbN = new C66716MbN(new NMD(userSession, r4, A0j, A0p, j), DirectThreadApi.A0E(userSession, str, A0j, A0p, A0p2));
            mbN.A00(new NMH(11, this.A03, this.A04));
            1ES.A06(mbN, 1150850966, false);
            return C60340gF.A00;
        }
        throw AnonymousClass7TE.A0y();
    }
}
