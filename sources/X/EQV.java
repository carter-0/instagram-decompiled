package X;

import android.widget.CompoundButton;

public final class EQV extends H4J {
    public CompoundButton A00;
    public String A01;
    public boolean A02;
    public final /* synthetic */ ESY A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EQV(CompoundButton compoundButton, 0hq r2, ESY esy, String str, boolean z) {
        super(r2);
        this.A03 = esy;
        this.A00 = compoundButton;
        this.A02 = z;
        this.A01 = str;
    }

    public final void onFail(C268654dm r8) {
        int A032 = AnonymousClass0fD.A03(-573231392);
        ESY esy = this.A03;
        C59689JTv.A0C(esy.A00, "reset_mute_failed");
        FGP.A05(esy.A01, this.A00, this.A02);
        esy.A04.A02(esy.A05, this.A01, "toggle", false);
        AnonymousClass0fD.A0A(-1209624589, A032);
    }

    public final void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(1519889353);
        CompoundButton compoundButton = this.A00;
        boolean z = !this.A02;
        ESY esy = this.A03;
        FGP.A05(esy.A01, compoundButton, z);
        esy.A04.A02(esy.A05, this.A01, "toggle", true);
        AnonymousClass0fD.A0A(-697694803, A032);
    }
}
