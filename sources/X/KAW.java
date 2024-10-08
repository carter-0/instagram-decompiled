package X;

import com.instagram.creation.fragment.EditMediaInfoFragment;

public final class KAW extends 1P0 {
    public final /* synthetic */ EditMediaInfoFragment A00;

    public KAW(EditMediaInfoFragment editMediaInfoFragment) {
        this.A00 = editMediaInfoFragment;
    }

    public final void onFail(C268654dm r5) {
        int A03 = AnonymousClass0fD.A03(-1878576845);
        EditMediaInfoFragment editMediaInfoFragment = this.A00;
        editMediaInfoFragment.A0m = true;
        EditMediaInfoFragment.A0G(editMediaInfoFragment);
        C59689JTv.A08(editMediaInfoFragment.requireContext(), 2131956378, 0);
        AnonymousClass0fD.A0A(-238090546, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(1895222638);
        EditMediaInfoFragment.A0L(this.A00, false);
        AnonymousClass0fD.A0A(1055222040, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-1610779065);
        EditMediaInfoFragment.A0L(this.A00, true);
        AnonymousClass0fD.A0A(809494555, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(727305849);
        int A032 = AnonymousClass0fD.A03(-235155324);
        EditMediaInfoFragment editMediaInfoFragment = this.A00;
        editMediaInfoFragment.A0m = false;
        EditMediaInfoFragment.A0G(editMediaInfoFragment);
        1Xj r0 = editMediaInfoFragment.A0I;
        if (r0 != null) {
            EditMediaInfoFragment.A0I(editMediaInfoFragment, r0);
        }
        AnonymousClass0fD.A0A(1076549203, A032);
        AnonymousClass0fD.A0A(-282507948, A03);
    }
}
