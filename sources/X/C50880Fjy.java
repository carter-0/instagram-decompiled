package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fjy  reason: case insensitive filesystem */
public final class C50880Fjy implements G6H {
    public final Context A00;
    public final FragmentActivity A01;
    public final AnonymousClass07i A02;
    public final UserSession A03;

    public final void CI0(Uri uri, Bundle bundle) {
        1NY A0N = DbU.A0N(this.A03);
        A0N.A0A(AnonymousClass000.A00(3642));
        A0N.A0R(1XP.class, 1XY.class);
        1OC A0U = DbT.A0U(A0N, true);
        C47696EDf.A01(A0U, this, 18);
        Context context = this.A00;
        1ES.A00(context, this.A02, A0U);
        Boolean A002 = 2Gm.A00(context, 2HA.A08, true);
        if (A002 != null && !A002.booleanValue()) {
            C358248ab A0Y = DbS.A0Y(context);
            A0Y.A09(2131960984);
            A0Y.A08(2131960983);
            C50021FJg.A01(A0Y, this, 23, 2131963115);
            DbY.A1M(A0Y, 2131968513);
        }
    }

    public C50880Fjy(Fragment fragment, UserSession userSession) {
        this.A03 = userSession;
        Context requireContext = fragment.requireContext();
        this.A00 = requireContext;
        this.A02 = AnonymousClass07i.A00(fragment);
        this.A01 = (FragmentActivity) 0mE.A00(requireContext, FragmentActivity.class);
    }
}
