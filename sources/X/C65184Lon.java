package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* renamed from: X.Lon  reason: case insensitive filesystem */
public final class C65184Lon implements MVS {
    public C60076JfA A00;
    public final AnonymousClass80P A01 = AnonymousClass80P.DISPLAY_IN_PROFILE;
    public final AnonymousClass4DH A02;
    public final UserSession A03;
    public final C66576MXh A04;
    public final KOR A05;

    public final /* synthetic */ void ADm() {
    }

    public final View ANH() {
        int i;
        PendingRecipient pendingRecipient = this.A05.A03;
        Context requireContext = this.A02.requireContext();
        if (pendingRecipient == null || C63216KtN.A00(AnonymousClass7TE.A1I(pendingRecipient)) != AnonymousClass05K.A0C || !C318996ps.A01()) {
            i = 2131955633;
        } else {
            C51967G9n.A0v();
            i = 2131968849;
        }
        C60076JfA A002 = C64004LIk.A00(requireContext, C64268LXu.A00, Integer.valueOf(R.drawable.instagram_photo_grid_pano_outline_24), i);
        this.A00 = A002;
        LYD.A02(A002, 26, this);
        C60076JfA jfA = this.A00;
        if (jfA != null) {
            return jfA;
        }
        0qQ.A0F("profileDisplayRow");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C62674Kka B1s() {
        return null;
    }

    public final AnonymousClass80P BHl() {
        return this.A01;
    }

    public final void CsQ() {
        AnonymousClass4DH r0 = this.A02;
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 42), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public C65184Lon(AnonymousClass4DH r2, UserSession userSession, C66576MXh mXh, KOR kor) {
        C51974G9v.A1P(r2, userSession, kor, mXh);
        this.A02 = r2;
        this.A03 = userSession;
        this.A05 = kor;
        this.A04 = mXh;
    }
}
