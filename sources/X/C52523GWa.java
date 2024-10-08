package X;

/* renamed from: X.GWa  reason: case insensitive filesystem */
public final class C52523GWa extends C324596za {
    public final C324596za A00;
    public final /* synthetic */ GXP A01;

    public C52523GWa(GXP gxp, C324596za r2) {
        this.A01 = gxp;
        this.A00 = r2;
    }

    public final void onFail(C268654dm r3) {
        int A0D = AnonymousClass7TG.A0D(r3, 282156245);
        this.A00.onFail(r3);
        AnonymousClass0fD.A0A(1807112358, A0D);
    }

    public final void onFailInBackground(C268654dm r3) {
        int A0D = AnonymousClass7TG.A0D(r3, 1889572578);
        this.A00.onFailInBackground(r3);
        AnonymousClass0fD.A0A(-1492236396, A0D);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-1853614515);
        this.A00.onFinish();
        AnonymousClass0fD.A0A(738214729, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-1433071285);
        this.A00.onStart();
        AnonymousClass0fD.A0A(913184495, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(1590463993);
        int A0D = AnonymousClass7TG.A0D(obj, 1077266068);
        this.A00.onSuccess(obj);
        AnonymousClass0fD.A0A(1256658006, A0D);
        AnonymousClass0fD.A0A(1740789866, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(1018912814);
        int A0D = AnonymousClass7TG.A0D(obj, 80588365);
        this.A00.onSuccessInBackground(obj);
        AnonymousClass0fD.A0A(1594240711, A0D);
        AnonymousClass0fD.A0A(1051395251, A03);
    }
}
