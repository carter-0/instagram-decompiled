package X;

import java.util.LinkedHashMap;

/* renamed from: X.TxL  reason: case insensitive filesystem */
public final class C14499TxL implements AnonymousClass1GR {
    public final C14493TxF A00;
    public final C15050ULg A01;
    public final /* synthetic */ C14223Ts3 A02;

    public final /* synthetic */ void D58(AnonymousClass1QW r1, AnonymousClass2ZK r2) {
    }

    public final void DEO(C268654dm r4, AnonymousClass1QW r5) {
        0qQ.A0B(r4, 1);
        C14493TxF txF = this.A00;
        C337247fx r1 = txF.A01.A00;
        if (r1 != null) {
            r1.DeJ(txF.A00, r4);
        }
    }

    public final /* synthetic */ void DEQ(C268654dm r1, AnonymousClass1QW r2) {
    }

    public final /* synthetic */ void DTx() {
    }

    public final /* synthetic */ void DTy(1XR r1, AnonymousClass1QW r2, AnonymousClass2ZK r3) {
    }

    public final /* synthetic */ void DfH(AnonymousClass1QW r1, AnonymousClass2ZK r2) {
    }

    public C14499TxL(C15050ULg uLg, C14493TxF txF, C14223Ts3 ts3) {
        this.A02 = ts3;
        this.A01 = uLg;
        this.A00 = txF;
    }

    public final /* bridge */ /* synthetic */ void DTw(1XR r3, AnonymousClass1QW r4, AnonymousClass2ZK r5) {
        AnonymousClass1XT r32 = (AnonymousClass1XT) r3;
        0qQ.A0B(r32, 2);
        this.A00.A00(r32);
        C337267fz r1 = this.A02.A00;
        if (r1 != null) {
            r1.Dnw(true);
        }
    }

    public final void DeX() {
        LinkedHashMap linkedHashMap = this.A02.A01;
        0u4.A03(linkedHashMap).remove(this.A01);
        C14493TxF txF = this.A00;
        C337247fx r1 = txF.A01.A00;
        if (r1 != null) {
            r1.DeT(txF.A00);
        }
    }

    public final void Den() {
        C14493TxF txF = this.A00;
        C337247fx r1 = txF.A01.A00;
        if (r1 != null) {
            r1.Dej(txF.A00);
        }
        C337267fz r12 = this.A02.A00;
        if (r12 != null) {
            r12.Dnw(false);
        }
    }
}
