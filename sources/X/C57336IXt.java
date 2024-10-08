package X;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.IXt  reason: case insensitive filesystem */
public final class C57336IXt implements C233452vk {
    public C18625VvI A00;
    public C233462vl A01;
    public C233812wV A02;
    public final AnonymousClass3VX A03 = new AnonymousClass3VX();

    public final void EDO() {
        this.A00 = null;
        this.A03.A00 = null;
    }

    public final void EXL(int i, int i2) {
    }

    public final /* bridge */ /* synthetic */ void A9o(Object obj) {
        C376489Ie r4 = (C376489Ie) obj;
        0qQ.A0B(r4, 0);
        Map map = this.A03.A04;
        C267324bN r0 = (C267324bN) r4.A03;
        map.put(C51966G9m.A1B(r0), C51966G9m.A1B(r0));
        C18625VvI vvI = this.A00;
        if (vvI != null) {
            vvI.A01();
        }
    }

    public final void AHQ() {
        C233812wV r1 = this.A02;
        if (r1 != null) {
            C233812wV.A06(r1, true);
        }
    }

    public final void AV2(Context context) {
        C233812wV r0 = this.A02;
        if (r0 != null) {
            r0.A0T.Cmr();
        }
    }

    public final /* bridge */ /* synthetic */ Object Atu() {
        return this.A01;
    }

    public final Map AuU() {
        Map unmodifiableMap = Collections.unmodifiableMap(this.A03.A02);
        0qQ.A07(unmodifiableMap);
        return unmodifiableMap;
    }

    public final Map B8v() {
        Map unmodifiableMap = Collections.unmodifiableMap(this.A03.A03);
        0qQ.A07(unmodifiableMap);
        return unmodifiableMap;
    }

    public final List BHf() {
        return C51966G9m.A1J(this.A03.A01);
    }

    public final Map Bdc() {
        Map unmodifiableMap = Collections.unmodifiableMap(this.A03.A04);
        0qQ.A07(unmodifiableMap);
        return unmodifiableMap;
    }

    public final AnonymousClass3VX BtU() {
        return this.A03;
    }

    public final void EQL(C18625VvI vvI) {
        this.A00 = vvI;
        this.A03.A00 = vvI;
    }

    public final /* bridge */ /* synthetic */ void ETU(Object obj) {
        C233462vl r8 = (C233462vl) obj;
        0qQ.A0B(r8, 0);
        this.A01 = r8;
        AnonymousClass3VX r0 = this.A03;
        r0.A01(-1.0d, -1, -1, -1, -1);
        r0.A03.put(C273654mx.A00(3033), String.valueOf(r8.A05()));
    }

    public final void ENq(C233812wV r1) {
        this.A02 = r1;
    }
}
