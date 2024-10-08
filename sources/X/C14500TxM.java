package X;

import java.util.LinkedHashMap;

/* renamed from: X.TxM  reason: case insensitive filesystem */
public final class C14500TxM extends 1P0 {
    public final C14493TxF A00;
    public final C15050ULg A01;
    public final /* synthetic */ C14223Ts3 A02;

    public C14500TxM(C15050ULg uLg, C14493TxF txF, C14223Ts3 ts3) {
        this.A02 = ts3;
        this.A01 = uLg;
        this.A00 = txF;
    }

    public final void onFail(C268654dm r5) {
        int A0D = AnonymousClass7TG.A0D(r5, 170815525);
        C14500TxM.super.onFail(r5);
        C14493TxF txF = this.A00;
        C337247fx r1 = txF.A01.A00;
        if (r1 != null) {
            r1.DeJ(txF.A00, r5);
        }
        AnonymousClass0fD.A0A(1686971968, A0D);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(1780704289);
        LinkedHashMap linkedHashMap = this.A02.A01;
        0u4.A03(linkedHashMap).remove(this.A01);
        C14493TxF txF = this.A00;
        C337247fx r1 = txF.A01.A00;
        if (r1 != null) {
            r1.DeT(txF.A00);
        }
        AnonymousClass0fD.A0A(1593624678, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-1924600177);
        C14500TxM.super.onStart();
        C14493TxF txF = this.A00;
        C337247fx r1 = txF.A01.A00;
        if (r1 != null) {
            r1.Dej(txF.A00);
        }
        AnonymousClass0fD.A0A(-107932802, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1025173081);
        AnonymousClass1XT r4 = (AnonymousClass1XT) obj;
        int A0D = AnonymousClass7TG.A0D(r4, 84360040);
        C14500TxM.super.onSuccess(r4);
        this.A00.A00(r4);
        AnonymousClass0fD.A0A(1454663179, A0D);
        AnonymousClass0fD.A0A(1188190371, A03);
    }
}
