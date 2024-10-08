package X;

/* renamed from: X.FoJ  reason: case insensitive filesystem */
public final class C51089FoJ implements G83 {
    public final /* synthetic */ FV7 A00;
    public final /* synthetic */ String A01;

    public final /* synthetic */ void onFinish() {
    }

    public final /* synthetic */ void onStart() {
    }

    public C51089FoJ(FV7 fv7, String str) {
        this.A00 = fv7;
        this.A01 = str;
    }

    public final void DEH(Integer num) {
        C59689JTv.A0B(this.A00.A02, "unrestricted_user_failed");
    }

    public final void onSuccess() {
        FV7 fv7 = this.A00;
        AnonymousClass73V.A0G(fv7.A06, "impression", "unrestrict_success_toast", this.A01);
        C59689JTv.A07(fv7.A02, 2131952113);
    }
}
