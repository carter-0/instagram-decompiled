package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.FoU  reason: case insensitive filesystem */
public final class C51100FoU implements C51889G6e {
    public final /* synthetic */ FV7 A00;
    public final /* synthetic */ String A01;

    public C51100FoU(FV7 fv7, String str) {
        this.A00 = fv7;
        this.A01 = str;
    }

    public final void DwT(String str) {
        FV7 fv7 = this.A00;
        AnonymousClass73V.A0G(fv7.A06, "impression", "restrict_success_toast", this.A01);
        FragmentActivity fragmentActivity = fv7.A02;
        C49239Eri.A00(fragmentActivity, fragmentActivity, fv7.A07, fv7.A0C.getUsername());
        FV7.A00(fv7);
    }
}
