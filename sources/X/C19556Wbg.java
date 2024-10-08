package X;

import com.instagram.model.mapquery.MapQuery;
import com.instagram.user.model.User;
import java.util.Set;

/* renamed from: X.Wbg  reason: case insensitive filesystem */
public final class C19556Wbg implements C20918X4j {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C19556Wbg(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A01 = obj;
    }

    public final void EIv() {
        switch (this.A00) {
            case 0:
                if (((C66967Mg0) this.A01).A0F) {
                    C14433TwH.A00(((C14436TwK) this.A03).A01).A00((C66569MWx) this.A02);
                }
                Set<C20913X4e> set = ((C14436TwK) this.A03).A03;
                C66569MWx mWx = (C66569MWx) this.A02;
                for (C20913X4e CLC : set) {
                    CLC.CLC(mWx.getId());
                }
                return;
            case 1:
                if (((C66967Mg0) this.A02).A0F) {
                    C18646Vvr A002 = VGC.A00(((C14436TwK) this.A03).A01);
                    MapQuery mapQuery = (MapQuery) this.A01;
                    synchronized (A002) {
                        0qQ.A0B(mapQuery, 0);
                        A002.A01.A04(mapQuery);
                    }
                }
                for (C19227WQi A003 : ((C14436TwK) this.A03).A06) {
                    C19227WQi.A00(A003);
                }
                return;
            default:
                if (((C66967Mg0) this.A01).A0F) {
                    C14025ToR.A00(((C14436TwK) this.A03).A01).A01((User) this.A02);
                }
                Set<C20917X4i> set2 = ((C14436TwK) this.A03).A08;
                User user = (User) this.A02;
                for (C20917X4i CLu : set2) {
                    CLu.CLu(user.getId());
                }
                return;
        }
    }
}
