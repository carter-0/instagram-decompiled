package X;

/* renamed from: X.FoI  reason: case insensitive filesystem */
public final class C51088FoI implements G83 {
    public final /* synthetic */ AnonymousClass70J A00;
    public final /* synthetic */ String A01;

    public final /* synthetic */ void onFinish() {
    }

    public final /* synthetic */ void onStart() {
    }

    public C51088FoI(AnonymousClass70J r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void DEH(Integer num) {
        C59689JTv.A0B(this.A00.A01, "unrestrict_user_failed");
    }

    public final void onSuccess() {
        AnonymousClass70J r4 = this.A00;
        AnonymousClass73V.A0G(r4.A02, "impression", "unrestrict_success_toast", this.A01);
        C59689JTv.A07(r4.A01, 2131952113);
    }
}
