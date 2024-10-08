package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.reels.ui.views.reelavatar.RecyclerReelAvatarView;

/* renamed from: X.O1r  reason: case insensitive filesystem */
public abstract class C70313O1r {
    public static final void A00(AnonymousClass0iw r13, UserSession userSession, AnonymousClass3BT r15, AnonymousClass3BT r16, C317116mk r17, C74360Pta pta, C68019Myl myl, int i) {
        UserSession userSession2 = userSession;
        C317116mk r3 = r17;
        C68019Myl myl2 = myl;
        boolean A1b = C51973G9u.A1b(r3, userSession, myl2);
        AnonymousClass0iw r10 = r13;
        C74360Pta pta2 = pta;
        C51972G9s.A1E(r13, pta2);
        myl2.itemView.setClipToOutline(A1b);
        myl2.A00.setVisibility(0);
        AnonymousClass0eM r0 = myl2.A01;
        DbW.A1R(r0, 0);
        AnonymousClass3BT r12 = r15;
        ((RecyclerReelAvatarView) r0.getValue()).A00(r10, userSession2, r12, r16, (C230242pG) null, i, false, false, false, false);
        AnonymousClass0eM r02 = myl2.A04;
        TextView A0I = JTO.A0I(r02);
        r02.getValue();
        A0I.setText(C241533Po.A00(userSession2, r12));
        C255773uh A00 = r12.A00(userSession2);
        if (A00 != null) {
            AnonymousClass0eM r03 = myl2.A03;
            JTO.A0I(r03).setText(1G0.A09(DbU.A05(AnonymousClass7TE.A0c(r03)), (double) (A00.A03() + AnonymousClass7TE.A0P(AnonymousClass3PE.A00))));
            ImageUrl A06 = A00.A06();
            if (A06 != null) {
                ((IgImageView) AnonymousClass7TE.A14(myl2.A02)).setUrl(A06, r10);
            }
            pta2.Dyn(JTO.A0F(myl2), r12);
            AnonymousClass0eM r04 = myl2.A02;
            View A062 = AnonymousClass7TH.A06(r04);
            String A16 = AnonymousClass7TE.A16(AnonymousClass7TH.A06(r04).getContext(), 2131972415);
            0qQ.A0B(A062, 2);
            A062.setOnTouchListener(new C50114FPe(A062, userSession2, r3, A16));
        }
    }
}
