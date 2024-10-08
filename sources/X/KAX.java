package X;

import com.instagram.creation.fragment.EditMediaInfoFragment;

public final class KAX extends 1P0 {
    public final /* synthetic */ EditMediaInfoFragment A00;

    public KAX(EditMediaInfoFragment editMediaInfoFragment) {
        this.A00 = editMediaInfoFragment;
    }

    public final void onFail(C268654dm r4) {
        int A03 = AnonymousClass0fD.A03(-1869858497);
        EditMediaInfoFragment editMediaInfoFragment = this.A00;
        editMediaInfoFragment.A0m = true;
        EditMediaInfoFragment.A0G(editMediaInfoFragment);
        AnonymousClass0fD.A0A(-1944712148, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-2015224904);
        EditMediaInfoFragment editMediaInfoFragment = this.A00;
        EditMediaInfoFragment.A0L(editMediaInfoFragment, false);
        EditMediaInfoFragment.A0A(editMediaInfoFragment);
        AnonymousClass0fD.A0A(-275759939, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-1167370846);
        EditMediaInfoFragment.A0L(this.A00, true);
        AnonymousClass0fD.A0A(-887607338, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(343838348);
        int A032 = AnonymousClass0fD.A03(689640781);
        EditMediaInfoFragment editMediaInfoFragment = this.A00;
        Object obj2 = ((1XO) obj).A06.get(0);
        obj2.getClass();
        editMediaInfoFragment.A0I = (1Xj) obj2;
        editMediaInfoFragment.A0m = false;
        EditMediaInfoFragment.A0G(editMediaInfoFragment);
        if (!editMediaInfoFragment.A0s) {
            EditMediaInfoFragment.A0C(editMediaInfoFragment);
        }
        if (!editMediaInfoFragment.A0h) {
            if (EditMediaInfoFragment.A0P(editMediaInfoFragment)) {
                editMediaInfoFragment.A0f = editMediaInfoFragment.A0I.A3O();
            } else if (editMediaInfoFragment.A0I.A0C.AXm() != null) {
                editMediaInfoFragment.A0U = editMediaInfoFragment.A0I.A0C.AXm();
            }
        }
        EditMediaInfoFragment.A04(editMediaInfoFragment);
        EditMediaInfoFragment.A0H(editMediaInfoFragment);
        EditMediaInfoFragment.A07(editMediaInfoFragment);
        EditMediaInfoFragment.A09(editMediaInfoFragment);
        if (editMediaInfoFragment.A0o) {
            EditMediaInfoFragment.A0J(editMediaInfoFragment, true);
        }
        AnonymousClass0fD.A0A(1995159946, A032);
        AnonymousClass0fD.A0A(2014373841, A03);
    }
}
