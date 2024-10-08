package X;

import java.util.Map;

/* renamed from: X.4Z8  reason: invalid class name */
public final class AnonymousClass4Z8 extends 1P0 {
    public final /* synthetic */ 1P2 A00;
    public final /* synthetic */ 1P0 A01;
    public final /* synthetic */ String A02;

    public AnonymousClass4Z8(1P2 r1, 1P0 r2, String str) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
    }

    public final void onFail(C268654dm r5) {
        int A03 = AnonymousClass0fD.A03(903785432);
        0qQ.A0B(r5, 0);
        1P2 r2 = this.A00;
        Map map = r2.A01;
        String str = this.A02;
        map.remove(str);
        r2.A02.remove(str);
        1P0 r0 = this.A01;
        if (r0 != null) {
            r0.onFail(r5);
        }
        AnonymousClass0fD.A0A(1601019593, A03);
    }

    public final void onFailInBackground(C268654dm r3) {
        int A03 = AnonymousClass0fD.A03(1990619315);
        0qQ.A0B(r3, 0);
        1P0 r0 = this.A01;
        if (r0 != null) {
            r0.onFailInBackground(r3);
        }
        AnonymousClass0fD.A0A(673865053, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(1523419461);
        1P0 r0 = this.A01;
        if (r0 != null) {
            r0.onFinish();
        }
        AnonymousClass0fD.A0A(1434457994, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-1026455589);
        1P0 r0 = this.A01;
        if (r0 != null) {
            r0.onStart();
        }
        AnonymousClass0fD.A0A(1476725209, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(575968929);
        int A032 = AnonymousClass0fD.A03(1913159823);
        0qQ.A0B(obj, 0);
        1P2 r2 = this.A00;
        Map map = r2.A01;
        String str = this.A02;
        map.remove(str);
        r2.A02.remove(str);
        1P0 r0 = this.A01;
        if (r0 != null) {
            r0.onSuccess(obj);
        }
        AnonymousClass0fD.A0A(2085566934, A032);
        AnonymousClass0fD.A0A(-789204179, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(-124195727);
        int A032 = AnonymousClass0fD.A03(-567833014);
        0qQ.A0B(obj, 0);
        1P0 r0 = this.A01;
        if (r0 != null) {
            r0.onSuccessInBackground(obj);
        }
        AnonymousClass0fD.A0A(-1364065412, A032);
        AnonymousClass0fD.A0A(799803739, A03);
    }
}
