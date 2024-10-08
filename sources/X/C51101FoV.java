package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.hallpass.model.HallPassMemberViewModel;

/* renamed from: X.FoV  reason: case insensitive filesystem */
public final class C51101FoV implements C51889G6e {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C51101FoV(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void DwT(String str) {
        Fragment fragment;
        Context requireContext;
        UserSession A0l;
        switch (this.A00) {
            case 0:
                C59689JTv.A07(C61190ls.A00((Activity) this.A01), 2131952092);
                ((C66965Mfy) this.A02).A03.Cfo();
                return;
            case 1:
                fragment = (E7S) this.A02;
                requireContext = fragment.requireContext();
                A0l = AnonymousClass7TE.A0l(fragment.A05);
                break;
            default:
                fragment = (E7T) this.A02;
                requireContext = fragment.requireContext();
                A0l = AnonymousClass7TE.A0l(fragment.A0A);
                break;
        }
        C49239Eri.A00(fragment.requireActivity(), requireContext, A0l, ((HallPassMemberViewModel) this.A01).A00.getUsername());
    }
}
