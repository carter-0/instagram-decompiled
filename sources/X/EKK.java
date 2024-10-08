package X;

import com.instagram.common.session.UserSession;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class EKK extends ELQ {
    public final /* synthetic */ C47523E6j A00;

    public final void D9T(AnonymousClass3UM r11, String str, int i) {
        0qQ.A0B(r11, 0);
        super.D9T(r11, str, i);
        C47523E6j e6j = this.A00;
        E9K e9k = e6j.A01;
        if (e9k == null) {
            0qQ.A0F("explorePeopleAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        ArrayList arrayList = e9k.A0G;
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int i3 = i2 + 1;
            AnonymousClass3UH r1 = (AnonymousClass3UH) it.next();
            if (!r1.A07()) {
                List list = r1.A0M;
                if (list != null && 00k.A0u(list, r11)) {
                    0u4.A00(list).remove(r11);
                    if (e9k.A0K) {
                        ArrayList arrayList2 = e9k.A0H;
                        if (!((Collection) DbZ.A0g(arrayList2, i2)).isEmpty()) {
                            Object remove = ((AbstractList) arrayList2.get(i2)).remove(0);
                            0qQ.A07(remove);
                            AnonymousClass3UL r2 = (AnonymousClass3UL) remove;
                            List list2 = ((AnonymousClass3UH) arrayList.get(i2)).A0M;
                            if (list2 != null) {
                                list2.add(r2);
                            }
                            e9k.A0J.add(r2.getId());
                        }
                    }
                }
            } else if (!r1.A08()) {
                r1.A06(r11.getId());
            }
            i2 = i3;
        }
        e9k.A0J.remove(r11.getId());
        E9K.A00(e9k);
        DbX.A0R(e6j.A0S).A00(new C319666qz(r11));
    }

    public final void DGN(AnonymousClass3UM r5, String str, int i) {
        0qQ.A0B(r5, 0);
        super.DGN(r5, str, i);
        C47523E6j e6j = this.A00;
        if (e6j.A05 == AnonymousClass05K.A0C) {
            C49886FBm A06 = 1Q0.A1y.A02(DbT.A0X(e6j.A0S)).A06((EXD) null, e6j.A04);
            A06.A04("target_id", r5.getId());
            A06.A03("position", i);
            A06.A02();
        }
    }

    public final void Dw1(AnonymousClass3UM r2, String str, int i) {
        0qQ.A0B(r2, 0);
        super.Dw1(r2, str, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EKK(UserSession userSession, C47523E6j e6j) {
        super(e6j, e6j, userSession);
        this.A00 = e6j;
    }
}
