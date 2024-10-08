package X;

import com.instagram.business.fragment.SuggestBusinessFragment;
import java.util.List;

/* renamed from: X.FTs  reason: case insensitive filesystem */
public final class C50212FTs implements C51894G6k {
    public final /* synthetic */ C46864Dmg A00;

    public C50212FTs(C46864Dmg dmg) {
        this.A00 = dmg;
    }

    public final void Dp2() {
        SuggestBusinessFragment suggestBusinessFragment = (SuggestBusinessFragment) this.A00.A01;
        Dbc.A0r(suggestBusinessFragment);
        C15474UdP A002 = SuggestBusinessFragment.A00(suggestBusinessFragment);
        A002.A01.A00 = false;
        A002.notifyDataSetChanged();
    }

    public final void Dp3(C47340Dva dva) {
        List list;
        SuggestBusinessFragment suggestBusinessFragment = (SuggestBusinessFragment) this.A00.A01;
        SuggestBusinessFragment.A01(suggestBusinessFragment);
        List list2 = suggestBusinessFragment.A07;
        if (!(list2 == null || (list = dva.A01) == null)) {
            list2.addAll(list);
        }
        SuggestBusinessFragment.A02(suggestBusinessFragment);
        if (!suggestBusinessFragment.A03.A03) {
            C15474UdP A002 = SuggestBusinessFragment.A00(suggestBusinessFragment);
            A002.A01.A00 = false;
            A002.notifyDataSetChanged();
        }
    }
}
