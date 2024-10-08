package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8Wl  reason: invalid class name and case insensitive filesystem */
public final class C357098Wl implements AnonymousClass8Wm {
    public final /* synthetic */ C357088Wk A00;

    public final String AbO() {
        return AnonymousClass000.A00(2770);
    }

    public final /* synthetic */ void Cxz() {
    }

    public final /* synthetic */ void DND() {
    }

    public final /* synthetic */ void DuW() {
    }

    public final /* synthetic */ void E09() {
    }

    public final /* synthetic */ void E0A() {
    }

    public C357098Wl(C357088Wk r1) {
        this.A00 = r1;
    }

    public final void E3I() {
        C357088Wk r2 = this.A00;
        AnonymousClass817 r0 = r2.A0H;
        C357088Wk.A08(r2, r0.A01, r0.A00);
    }

    public final List getContent() {
        AnonymousClass8PW r0;
        List<C282705Ek> list;
        C357088Wk r2 = this.A00;
        int ordinal = r2.A0E.A02.A01().ordinal();
        if (ordinal == 0) {
            AnonymousClass8K4 r02 = r2.A09;
            r0 = AnonymousClass8MD.A00(r02.A0G, r02.A0Z, r02.A0T, false);
            list = r0.A0G;
        } else if (ordinal != 1) {
            list = null;
        } else {
            r0 = r2.A0D.A01();
            list = r0.A0G;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (C282705Ek r03 : list) {
                String str = r03.A09;
                if (str != null) {
                    arrayList.add(str);
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add("");
        }
        return arrayList;
    }
}
