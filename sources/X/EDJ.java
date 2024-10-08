package X;

import kotlin.Deprecated;

@Deprecated(message = "This is a temporary class used to test ThreadPoolScheduler with legacy code")
public final class EDJ extends 1P0 {
    public 1OC A00;
    public final 1P0 A01;

    public EDJ(1P0 r1, 1OC r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void onFail(C268654dm r3) {
        int A0D = AnonymousClass7TG.A0D(r3, -1541768829);
        EDJ.super.onFail(r3);
        this.A01.onFail(r3);
        AnonymousClass0fD.A0A(1610177505, A0D);
    }

    public final void onFailInBackground(C268654dm r3) {
        int A0D = AnonymousClass7TG.A0D(r3, -1735151155);
        EDJ.super.onFailInBackground(r3);
        this.A01.onFailInBackground(r3);
        AnonymousClass0fD.A0A(-404095081, A0D);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-1169190881);
        EDJ.super.onFinish();
        this.A00 = null;
        this.A01.onFinish();
        AnonymousClass0fD.A0A(-2068179176, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(660626260);
        EDJ.super.onStart();
        this.A01.onStart();
        AnonymousClass0fD.A0A(-1976955950, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-373758927);
        int A0D = AnonymousClass7TG.A0D(obj, -116750762);
        EDJ.super.onSuccess(obj);
        this.A01.onSuccess(obj);
        AnonymousClass0fD.A0A(1491361739, A0D);
        AnonymousClass0fD.A0A(733338256, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(767402589);
        int A0D = AnonymousClass7TG.A0D(obj, -1859899829);
        EDJ.super.onSuccessInBackground(obj);
        this.A01.onSuccessInBackground(obj);
        AnonymousClass0fD.A0A(213348820, A0D);
        AnonymousClass0fD.A0A(293801057, A03);
    }
}
