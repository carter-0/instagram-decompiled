package X;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.IXu  reason: case insensitive filesystem */
public final class C57337IXu implements C233452vk {
    public C18625VvI A00;
    public C233472vm A01;
    public C233812wV A02;
    public final AnonymousClass3VX A03 = new AnonymousClass3VX();

    public final void EDO() {
        this.A00 = null;
        this.A03.A00 = null;
    }

    public final void EXL(int i, int i2) {
    }

    public final void AHQ() {
        C233812wV r1 = this.A02;
        if (r1 != null) {
            C233812wV.A06(r1, true);
        }
        AnonymousClass3VX r12 = this.A03;
        r12.A04.clear();
        C18625VvI vvI = r12.A00;
        if (vvI != null) {
            vvI.A01();
        }
    }

    public final void AV2(Context context) {
        C59689JTv.A00(context, "Filling ad pool is not supported for contextual feed", C273654mx.A00(1261), 1);
    }

    public final /* bridge */ /* synthetic */ Object Atu() {
        return this.A01;
    }

    public final Map AuU() {
        ImmutableMap copyOf = ImmutableMap.copyOf(this.A03.A02);
        0qQ.A07(copyOf);
        return copyOf;
    }

    public final Map B8v() {
        ImmutableMap copyOf = ImmutableMap.copyOf(this.A03.A03);
        0qQ.A07(copyOf);
        return copyOf;
    }

    public final List BHf() {
        return DbU.A0K(this.A03.A01);
    }

    public final Map Bdc() {
        ImmutableMap copyOf = ImmutableMap.copyOf(this.A03.A04);
        0qQ.A07(copyOf);
        return copyOf;
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
        map.put(C273654mx.A00(1348), String.valueOf(r8.A07()));
        map.remove(AnonymousClass000.A00(4372));
        C18625VvI vvI = this.A00;
        if (vvI != null) {
            vvI.A01();
        }
    }

    public final /* bridge */ /* synthetic */ void A9o(Object obj) {
        String str = C51969G9p.A0m(obj).A0S;
        this.A03.A04.put(str, str);
        C18625VvI vvI = this.A00;
        if (vvI != null) {
            vvI.A01();
        }
    }

    public final void ENq(C233812wV r1) {
        this.A02 = r1;
    }
}
