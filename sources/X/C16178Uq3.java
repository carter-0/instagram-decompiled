package X;

import android.widget.CompoundButton;

/* renamed from: X.Uq3  reason: case insensitive filesystem */
public final class C16178Uq3 extends H4J {
    public final /* synthetic */ CompoundButton A00;
    public final /* synthetic */ UsO A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16178Uq3(CompoundButton compoundButton, 0hq r2, UsO usO, String str, boolean z) {
        super(r2);
        this.A00 = compoundButton;
        this.A03 = z;
        this.A01 = usO;
        this.A02 = str;
    }

    public final void onFail(C268654dm r8) {
        int A032 = AnonymousClass0fD.A03(-756514088);
        UsO usO = this.A01;
        C59689JTv.A01(usO.A00, "update_direct_only_notifications_setting_failed", 2131963032, 0);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = usO.A01;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(this.A00, !this.A03);
        } else {
            FGP.A05(usO.A02, this.A00, !this.A03);
        }
        usO.A05.A02(usO.A06, this.A02, "toggle", false);
        AnonymousClass0fD.A0A(-67615279, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-654237624);
        int A033 = AnonymousClass0fD.A03(-875940252);
        CompoundButton compoundButton = this.A00;
        boolean z = this.A03;
        UsO usO = this.A01;
        FGP.A05(usO.A02, compoundButton, z);
        usO.A05.A02(usO.A06, this.A02, "toggle", true);
        AnonymousClass0fD.A0A(1674234385, A033);
        AnonymousClass0fD.A0A(223039341, A032);
    }
}
