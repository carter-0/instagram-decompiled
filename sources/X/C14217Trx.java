package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Trx  reason: case insensitive filesystem */
public final class C14217Trx implements C321636uV {
    public final /* synthetic */ C14030ToW A00;

    public final void DQ7(String str, Long l) {
    }

    public final void DQA(Context context, C61082JwK jwK, C273664mz r10, C294265mA r11, boolean z, boolean z2) {
        ArrayList arrayList;
        boolean z3 = z;
        if (z) {
            C14030ToW toW = this.A00;
            toW.A09.clear();
            toW.A02.putBoolean("arg_user_feed_is_first_page", true);
        }
        C14030ToW toW2 = this.A00;
        C321656uX r0 = toW2.A07;
        String str = r10.A02;
        C324366zA r1 = r0.A03.A03;
        r1.A09 = str;
        r1.A08 = r10.A01;
        List<UNQ> list = r10.A03;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (UNQ unq : list) {
                1Xj r02 = unq.A01;
                if (r02 != null) {
                    arrayList2.add(r02);
                }
            }
            arrayList = arrayList2;
        } else {
            List list2 = r10.A06;
            0qQ.A0A(list2);
            arrayList = list2;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            toW2.A09.add(C51966G9m.A0t(it).getId());
        }
        toW2.A05.Dex(r10.A02, r10.A04, arrayList, false, z3);
    }

    public C14217Trx(C14030ToW toW) {
        this.A00 = toW;
    }

    public final void DQ4(C268654dm r2, C294265mA r3) {
        this.A00.A05.DeI();
    }

    public final void DQ6(C294265mA r2) {
        this.A00.A05.DeS();
    }

    public final void DQ9(C294265mA r2, boolean z, boolean z2, boolean z3) {
        this.A00.A05.Dei();
    }
}
