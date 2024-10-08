package X;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* renamed from: X.6aG  reason: invalid class name and case insensitive filesystem */
public final class C309996aG implements C233452vk {
    public C18625VvI A00;
    public C233472vm A01;
    public C233812wV A02;
    public final AnonymousClass3VX A03 = new AnonymousClass3VX();

    public final void EDO() {
        this.A00 = null;
        this.A03.A00 = null;
    }

    public final /* bridge */ /* synthetic */ void A9o(Object obj) {
        C250973mM r3 = (C250973mM) obj;
        0qQ.A0B(r3, 0);
        String id = r3.A0H.getId();
        0qQ.A07(id);
        this.A03.A04.put(id, id);
        C18625VvI vvI = this.A00;
        if (vvI != null) {
            vvI.A01();
        }
    }

    public final void AHQ() {
        C233812wV r1 = this.A02;
        if (r1 == null) {
            0qQ.A0F("poolOperationCallback");
            throw AnonymousClass00P.createAndThrow();
        }
        C233812wV.A06(r1, true);
        AnonymousClass3VX r12 = this.A03;
        r12.A04.clear();
        C18625VvI vvI = r12.A00;
        if (vvI != null) {
            vvI.A01();
        }
    }

    public final void AV2(Context context) {
        AnonymousClass3VX r0 = this.A03;
        Map map = r0.A04;
        int size = map.size();
        List list = r0.A01;
        int size2 = list.size();
        C233812wV r02 = this.A02;
        if (r02 == null) {
            0qQ.A0F("poolOperationCallback");
            throw AnonymousClass00P.createAndThrow();
        }
        r02.A0T.Cmr();
        int size3 = (map.size() - size) + 1;
        int size4 = list.size() - size2;
        if (size3 <= 0 || size4 <= 0) {
            C59689JTv.A00(context, "No ads were sent to the pool. Try Fill Pool again or reopen stories", "FILL_POOL_ERROR", 1);
        } else {
            C59689JTv.A09(context, 002.A03(size3, " ads were successfully added to the pool"));
        }
    }

    public final /* bridge */ /* synthetic */ Object Atu() {
        return this.A01;
    }

    public final Map AuU() {
        return 0Yt.A0B(this.A03.A02);
    }

    public final Map B8v() {
        return 0Yt.A0B(this.A03.A03);
    }

    public final List BHf() {
        return 00k.A0a(this.A03.A01);
    }

    public final Map Bdc() {
        return 0Yt.A0B(this.A03.A04);
    }

    public final AnonymousClass3VX BtU() {
        return this.A03;
    }

    public final void EQL(C18625VvI vvI) {
        this.A00 = vvI;
        this.A03.A00 = vvI;
    }

    public final /* bridge */ /* synthetic */ void ETU(Object obj) {
        C233472vm r8 = (C233472vm) obj;
        0qQ.A0B(r8, 0);
        this.A01 = r8;
        AnonymousClass3VX r0 = this.A03;
        r0.A01(r8.A00(), r8.A01(), r8.A02(), r8.A03(), r8.A06());
        Map map = r0.A03;
        map.put("Reel gap to previous ad", String.valueOf(r8.A07()));
        map.put("Reel gap to previous netego", String.valueOf(r8.A08()));
        map.put("Max reel gap to previous item", String.valueOf(r8.A04()));
        C18625VvI vvI = this.A00;
        if (vvI != null) {
            vvI.A01();
        }
    }

    public final void EXL(int i, int i2) {
        Map map = this.A03.A02;
        map.put("Reel gap to previous ad", String.valueOf(i));
        map.put("Reel gap to previous netego", String.valueOf(i2));
        C18625VvI vvI = this.A00;
        if (vvI != null) {
            vvI.A01();
        }
    }

    public final void ENq(C233812wV r1) {
        this.A02 = r1;
    }
}
