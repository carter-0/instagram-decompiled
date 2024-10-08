package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;

public final class NQA extends C232232tF {
    public final UserSession A00;
    public final O7P A01;

    public NQA(UserSession userSession, O7P o7p) {
        0qQ.A0B(o7p, 2);
        this.A00 = userSession;
        this.A01 = o7p;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C68042Mz9(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_inbox_search_meta_ai_snippet, false), this.A00, this.A01);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.widget.TextView, com.instagram.common.ui.text.ExpandableTextView, android.view.View] */
    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        String str;
        NPE npe = (NPE) r7;
        C68042Mz9 mz9 = (C68042Mz9) r8;
        boolean A1U = AnonymousClass7TF.A1U(0, npe, mz9);
        if (!npe.A03) {
            OO3 oo3 = mz9.A09.A00.A0F.A01;
            if (!(oo3 == null || (str = oo3.A07) == null)) {
                0Aj A0e = AnonymousClass7TE.A0e(oo3.A0E, "universal_search_meta_ai_snippet_loading");
                if (A0e.isSampled()) {
                    C66580MXl.A1H(A0e, str);
                    A0e.Cgf();
                }
            }
            C71929OtD otD = new C71929OtD(0, mz9, npe);
            mz9.A01 = otD;
            C71929OtD otD2 = new C71929OtD(A1U ? 1 : 0, mz9, npe);
            mz9.A00 = otD2;
            1Ng r1 = mz9.A06;
            r1.A01(otD, C71911Ost.class);
            r1.A01(otD2, C71915Osx.class);
            ? r2 = mz9.A08;
            DbS.A1C(r2);
            mz9.A03 = false;
            r2.setCollapsedLines(4);
            r2.A01 = Integer.MAX_VALUE;
            C71405Ok4.A01(r2, 68, npe, mz9);
            ShimmerFrameLayout shimmerFrameLayout = mz9.A05;
            shimmerFrameLayout.A02();
            shimmerFrameLayout.setVisibility(0);
            r2.setVisibility(8);
            mz9.A04.setVisibility(8);
            IgLinearLayout igLinearLayout = mz9.A02;
            if (igLinearLayout != null) {
                igLinearLayout.setVisibility(8);
            }
            r2.A03 = false;
        }
    }

    public final Class modelClass() {
        return NPE.class;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r4) {
        C68042Mz9 mz9 = (C68042Mz9) r4;
        0qQ.A0B(mz9, 0);
        1wn r2 = mz9.A01;
        if (r2 != null) {
            mz9.A06.A02(r2, C71911Ost.class);
        }
        1wn r22 = mz9.A00;
        if (r22 != null) {
            mz9.A06.A02(r22, C71915Osx.class);
        }
        mz9.A01 = null;
        mz9.A00 = null;
    }
}
