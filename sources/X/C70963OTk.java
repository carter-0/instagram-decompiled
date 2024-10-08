package X;

import android.content.Context;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.quicksnap.emitter.QuickSnapReactionEmitterView;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.OTk  reason: case insensitive filesystem */
public final class C70963OTk {
    public final AnonymousClass0iw A00;
    public final IgSimpleImageView A01;
    public final C68478NJv A02;
    public final int A03;
    public final UserSession A04;
    public final QuickSnapReactionEmitterView A05;
    public final C262224Cq A06;

    /* JADX WARNING: type inference failed for: r8v1, types: [android.widget.ImageView, X.NR1, android.view.View] */
    public static final void A00(C71968Ott ott, C68050MzH mzH, C70963OTk oTk, int i) {
        ImageView.ScaleType scaleType;
        C71968Ott ott2 = ott;
        List list = ott.A01;
        C68050MzH mzH2 = mzH;
        C70963OTk oTk2 = oTk;
        int i2 = i;
        if (i2 < list.size()) {
            Context context = mzH.A00;
            UserSession userSession = oTk.A04;
            IgSimpleImageView igSimpleImageView = oTk.A01;
            QuickSnapReactionEmitterView quickSnapReactionEmitterView = oTk.A05;
            C262224Cq r15 = oTk.A06;
            int i3 = oTk2.A03;
            ? nr1 = new NR1(context, userSession, igSimpleImageView, quickSnapReactionEmitterView, oTk2.A02, new C51765G0h(oTk2, 47), r15, i3);
            C66581MXm.A1A(nr1, i3);
            if (nr1.A0C) {
                scaleType = ImageView.ScaleType.CENTER_CROP;
            } else {
                scaleType = ImageView.ScaleType.MATRIX;
            }
            nr1.setScaleType(scaleType);
            I7E.A06(nr1, nr1.A06);
            Context context2 = nr1.getContext();
            int A08 = C51972G9s.A08(context2);
            0nA.A0j(nr1, A08, A08, A08, A08);
            DbT.A16(context2, nr1, R.color.context_line_color);
            C53401GnY gnY = (C53401GnY) list.get(i2);
            mzH2.A01.addView(nr1, 0);
            nr1.setQuickSnapMedia((C53401GnY) 00k.A0O(list, i2), oTk2.A00);
            float f = -4.0f;
            if (i2 % 2 == 0) {
                f = 4.0f;
            }
            nr1.setRotation(f);
            C68050MzH mzH3 = mzH2;
            C71968Ott ott3 = ott2;
            nr1.A02 = new PJD(gnY, ott3, mzH3, oTk2, nr1, i2);
        } else if (i2 == list.size()) {
            C67692MsW msW = new C67692MsW(mzH.A00, oTk.A03);
            mzH.A01.addView(msW, 0);
            User user = ott.A00;
            String moduleName = oTk.A00.getModuleName();
            0qQ.A0B(moduleName, 1);
            msW.A00.setImageDrawable(new C244303ay(user.Bh3(), moduleName, DbU.A05(msW).getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height), 0, 0, 0));
            DbU.A1H(msW.A01, user);
            C71396Ojv.A00(msW, 9, oTk);
        }
    }

    public C70963OTk(AnonymousClass0iw r1, UserSession userSession, IgSimpleImageView igSimpleImageView, C68478NJv nJv, QuickSnapReactionEmitterView quickSnapReactionEmitterView, C262224Cq r6, int i) {
        this.A00 = r1;
        this.A04 = userSession;
        this.A01 = igSimpleImageView;
        this.A05 = quickSnapReactionEmitterView;
        this.A06 = r6;
        this.A03 = i;
        this.A02 = nJv;
    }
}
