package X;

import com.instagram.common.session.UserSession;
import com.instagram.discovery.chaining.model.DiscoveryChainingItem;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class IYA implements C233402vf {
    public int A00 = -1;
    public C251373n0 A01;
    public final Set A02 = AnonymousClass7TE.A1F();
    public final UserSession A03;
    public final DiscoveryChainingItem A04;
    public final C52476GUc A05;

    public final float AuH() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final int Bdr() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final Integer CNL(C251373n0 r8, 1PW r9, int i) {
        0qQ.A0B(r8, 0);
        if (i >= 0) {
            C52476GUc gUc = this.A05;
            if (i <= gUc.B5I()) {
                String str = this.A04.A0E;
                Object BTb = r8.BTb();
                AnonymousClass3OA r3 = (AnonymousClass3OA) BTb;
                1Xj r2 = r3.A0K;
                gUc.BQr(r2).A2R = true;
                UserSession userSession = this.A03;
                if (C233832wY.A02(userSession, r2.CcK())) {
                    return AnonymousClass05K.A03;
                }
                C52551GXc A002 = C52550GXb.A00(userSession);
                0qQ.A0C(BTb, AnonymousClass000.A00(1643));
                List A1I = AnonymousClass7TE.A1I(BTb);
                if (A002.A00.containsKey(str)) {
                    A002.A02.get(str);
                }
                gUc.A05(A1I, i);
                this.A02.add(r3.A0S);
                int i2 = this.A00;
                if (i2 < i) {
                    i2 = i;
                }
                this.A00 = i2;
                this.A01 = r8;
                return AnonymousClass05K.A00;
            }
        }
        0wb.A03("explore_acp", "Attempted to inject an item out of bounds at position: $position");
        return AnonymousClass05K.A0C;
    }

    public final void Dpi() {
    }

    public final void E5G(String str, List list, int i, int i2, int i3, int i4) {
    }

    public final /* bridge */ /* synthetic */ void AHP(Object obj) {
        throw AnonymousClass7TE.A1B("Ad pod is not supported for Explore.");
    }

    public final List BYj() {
        return this.A05.A01();
    }

    public final List BYp() {
        return this.A05.A02();
    }

    public final C251373n0 Coa() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ void E5F(Object obj) {
        throw AnonymousClass7TE.A1B("HP Push-Up is not supported for Explore");
    }

    public final C251373n0 FIa() {
        throw AnonymousClass7TE.A1B("un injecting most recent item is supported in stories only");
    }

    public IYA(UserSession userSession, DiscoveryChainingItem discoveryChainingItem, C52476GUc gUc) {
        this.A05 = gUc;
        this.A03 = userSession;
        this.A04 = discoveryChainingItem;
    }

    public final List AGf() {
        List emptyList = Collections.emptyList();
        0qQ.A07(emptyList);
        return emptyList;
    }

    public final int Bdq() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ boolean CVS(Object obj) {
        return this.A02.contains(C51969G9p.A0m(obj).A0S);
    }

    public final /* bridge */ /* synthetic */ Object BTe(int i) {
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean FIZ(Object obj, String str, Map map) {
        return false;
    }
}
