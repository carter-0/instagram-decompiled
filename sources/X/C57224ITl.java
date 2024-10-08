package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.EditMediaInfoFragment;

/* renamed from: X.ITl  reason: case insensitive filesystem */
public final /* synthetic */ class C57224ITl implements B1Y {
    public final /* synthetic */ EditMediaInfoFragment A00;

    public /* synthetic */ C57224ITl(EditMediaInfoFragment editMediaInfoFragment) {
        this.A00 = editMediaInfoFragment;
    }

    public final void D1E(1Xj r7) {
        EditMediaInfoFragment editMediaInfoFragment = this.A00;
        UserSession session = editMediaInfoFragment.getSession();
        if (!182.A06(AnonymousClass7TF.A0H(session), session, 2342163288483766430L) || editMediaInfoFragment.A00 >= 3 || r7.A0C.BfH() != null) {
            C358248ab A0U = DbW.A0U(editMediaInfoFragment);
            A0U.A09(2131957544);
            A0U.A08(2131957543);
            A0U.A0I(new LV0(27, editMediaInfoFragment, r7), 2131957568);
            A0U.A0r(true);
            A0U.A0H((DialogInterface.OnClickListener) null, 2131960995);
            DbT.A1V(A0U);
            return;
        }
        new C55922Hpj(editMediaInfoFragment.requireContext()).A00((DialogInterface.OnClickListener) null, editMediaInfoFragment.getSession(), (1Xj) null, AnonymousClass05K.A15);
    }
}
