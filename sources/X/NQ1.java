package X;

import android.content.Context;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import com.instagram.user.model.User;
import java.util.List;

public final class NQ1 extends C232232tF {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final OEH A02;
    public final PGT A03;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.friend_map_hscroll_presence_item, false);
        UserSession userSession = this.A01;
        return new C68078Mzj(A0D, this.A00, userSession, this.A02, this.A03);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r23, C249703kE r24) {
        String str;
        SpannableString A0D;
        String str2;
        List list;
        AnonymousClass913 r0;
        C279864zZ BWY;
        C71967Ots ots = (C71967Ots) r23;
        C68078Mzj mzj = (C68078Mzj) r24;
        boolean A1U = AnonymousClass7TF.A1U(0, ots, mzj);
        View A0F = JTO.A0F(mzj);
        N4t n4t = ots.A01;
        mzj.A00 = n4t;
        IgImageView igImageView = mzj.A08;
        User user = n4t.A06;
        igImageView.setUrl(user.Bh3(), mzj.A02);
        C71409Ok8.A01(igImageView, 12, mzj, n4t);
        IgTextView igTextView = mzj.A04;
        IgTextView igTextView2 = igTextView;
        C71409Ok8.A01(igTextView, 13, mzj, n4t);
        mzj.A06.setText(user.B8Q());
        long j = n4t.A02;
        Context A0S = AnonymousClass7TE.A0S(A0F);
        0eP A06 = C67587MqL.A06(A0S, j);
        String str3 = (String) A06.A00;
        boolean A1a = AnonymousClass7TE.A1a(A06.A01);
        int i = R.attr.igds_color_secondary_text;
        if (A1a) {
            i = R.attr.igds_color_active_badge;
        }
        int A032 = AnonymousClass7TF.A03(A0S, i);
        AnonymousClass4AB r18 = n4t.A05;
        boolean A1V = AnonymousClass7TF.A1V(r18);
        int i2 = 8;
        TextView textView = mzj.A07;
        if (A1V) {
            textView.setVisibility(0);
            C63939LEc lEc = mzj.A09;
            IgBouncyUfiButtonImageView igBouncyUfiButtonImageView = mzj.A0C;
            String str4 = null;
            lEc.A01((IgSimpleImageView) null, igBouncyUfiButtonImageView);
            lEc.A00(new C59671JTb(n4t.A0F, 10), (IgSimpleImageView) null, new C72380P3t(n4t, mzj), igBouncyUfiButtonImageView);
            IgTextView igTextView3 = mzj.A05;
            igTextView3.setMaxLines(2);
            if (!n4t.A04() || n4t.A07 == AnonymousClass05K.A00) {
                if (n4t.A07 == AnonymousClass05K.A00) {
                    str2 = A0S.getString(2131962764);
                } else {
                    str2 = n4t.A09;
                }
                igTextView3.setText(str2);
            } else {
                if (!(r18 == null || (list = r18.A0J) == null || (r0 = (AnonymousClass913) 00k.A0J(list)) == null || (BWY = r0.BWY()) == null)) {
                    str4 = BWY.A0J;
                }
                igTextView3.setText(str4);
                JTS.A0u(A0S, igTextView3, R.attr.igds_color_primary_text);
            }
            String A0d = AnonymousClass7TF.A0d(A0S.getResources(), 2131962759);
            String A0g = 002.A0g(A0d, " • ", str3);
            A0D = C66580MXl.A0D(A0g);
            A0D.setSpan(C66580MXl.A0E(A032), A0d.length() + 3, A0g.length(), 33);
        } else {
            textView.setVisibility(8);
            mzj.A0C.setVisibility(8);
            textView = mzj.A05;
            textView.setMaxLines(A1U ? 1 : 0);
            JTS.A0u(A0S, textView, R.attr.igds_color_secondary_text);
            String str5 = n4t.A09;
            if (str5 == null || str5.length() == 0) {
                str = str3;
            } else {
                str = 002.A0g(str3, " • ", str5);
            }
            A0D = C66580MXl.A0D(str);
            A0D.setSpan(C66580MXl.A0E(A032), 0, str3.length(), 33);
        }
        textView.setText(A0D);
        boolean z = n4t.A0J;
        igTextView2.setVisibility(DbW.A01(z ^ true ? 1 : 0));
        ViewGroup viewGroup = mzj.A01;
        if (!z) {
            UserSession userSession = mzj.A03;
            if (182.A06(DbS.A0J(userSession, 0), userSession, 36321769627133698L)) {
                i2 = 0;
            }
        }
        viewGroup.setVisibility(i2);
        OEH oeh = mzj.A0A;
        C68151N2r n2r = ots.A00;
        2el r2 = oeh.A00;
        C2354830a A002 = AnonymousClass30Y.A00(n2r, C60340gF.A00, n2r.A04);
        A002.A00(oeh.A01);
        C51967G9n.A0z(A0F, A002, r2);
    }

    public final Class modelClass() {
        return C71967Ots.class;
    }

    public NQ1(AnonymousClass0iw r1, UserSession userSession, OEH oeh, PGT pgt) {
        C51972G9s.A1B(userSession, oeh);
        this.A01 = userSession;
        this.A00 = r1;
        this.A03 = pgt;
        this.A02 = oeh;
    }
}
