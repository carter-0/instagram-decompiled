package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class LBL {
    public C262204Co A00;
    public final Context A01;
    public final View A02;
    public final AnonymousClass4DH A03;
    public final UserSession A04;
    public final C255773uh A05;
    public final C313596gh A06;
    public final AnonymousClass37D A07;
    public final C63684L2u A08;
    public final C64100LMu A09;
    public final C64089LMh A0A;
    public final C316036l0 A0B;
    public final AnonymousClass0eM A0C = AnonymousClass0eN.A01(new C66293MMc(this, 44));
    public final AnonymousClass0eM A0D;

    /* JADX WARNING: type inference failed for: r1v1, types: [X.Koe, java.lang.Object] */
    public /* synthetic */ LBL(View view, AnonymousClass4DH r8, UserSession userSession, C255773uh r10, C313596gh r11, C316036l0 r12) {
        AnonymousClass37D A0i = DbX.A0i(r8);
        Context requireContext = r8.requireContext();
        0qQ.A0B(userSession, 3);
        this.A02 = view;
        this.A03 = r8;
        this.A04 = userSession;
        this.A06 = r11;
        this.A0B = r12;
        this.A05 = r10;
        this.A07 = A0i;
        this.A01 = requireContext;
        this.A0A = new C64089LMh(view);
        FragmentActivity requireActivity = r8.requireActivity();
        Context requireContext2 = r8.requireContext();
        ViewGroup viewGroup = (ViewGroup) AnonymousClass7TE.A0b(view, R.id.iglive_permissions_container);
        0qQ.A0B(viewGroup, 1);
        ? obj = new Object();
        obj.A00 = viewGroup;
        this.A09 = new C64100LMu(requireActivity, requireContext2, userSession, obj);
        C66293MMc mMc = new C66293MMc(this, 48);
        AnonymousClass0eM A012 = C66293MMc.A01(new C66293MMc(r8, 45), 0eO.A02, 46);
        this.A0D = DbS.A0I(new C66293MMc(A012, 47), mMc, C66304MMn.A01(A012, (Object) null, 32), DbS.A0z(C60277JiY.class));
        this.A08 = new C63684L2u(this);
    }
}
