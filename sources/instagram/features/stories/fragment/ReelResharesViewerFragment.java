package instagram.features.stories.fragment;

import X.0S7;
import X.0eO;
import X.0lg;
import X.0qQ;
import X.1NY;
import X.1OC;
import X.2da;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass32A;
import X.AnonymousClass32G;
import X.AnonymousClass3BQ;
import X.AnonymousClass4DS;
import X.AnonymousClass6UY;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13991Tnr;
import X.C15468UdJ;
import X.C15622Ufo;
import X.C16164Upp;
import X.C17662Vbs;
import X.C18227Vnr;
import X.C19517Wb3;
import X.C20607Wvo;
import X.C227642jf;
import X.C228172ku;
import X.C230222pE;
import X.C249383je;
import X.C320156rr;
import X.C46434Dew;
import X.C51923G7r;
import X.C59689JTv;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbW;
import X.JTT;
import X.UXX;
import X.X6E;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.util.ArrayList;
import java.util.List;

public final class ReelResharesViewerFragment extends AnonymousClass32G implements AbsListView.OnScrollListener, AnonymousClass4DS, C230222pE, C51923G7r, X6E {
    public C46434Dew A00;
    public C15468UdJ A01;
    public String A02;
    public String A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A00(0eO.A02, new C20607Wvo(this, 39));
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final C228172ku A06 = new C228172ku();
    public final String A07 = "reel_view_reshare_reels";
    public EmptyStateView emptyStateView;

    public final void Cvv(C19517Wb3 wb3, Reel reel, List list, int i, int i2, int i3, boolean z) {
        String str;
        Reel reel2 = reel;
        ArrayList A14 = DbV.A14(reel);
        AnonymousClass32A r4 = (AnonymousClass32A) this.A04.getValue();
        String str2 = this.A02;
        if (str2 == null) {
            str = "reelTraySessionId";
        } else {
            r4.A0C = str2;
            FragmentActivity requireActivity = requireActivity();
            0S7.A00(this);
            ListView listView = this.A04;
            C15468UdJ udJ = this.A01;
            if (udJ == null) {
                str = "adapter";
            } else {
                r4.A05 = new C16164Upp(requireActivity, listView, udJ, this);
                r4.A0D = DbU.A0u(this.A05);
                r4.A06(reel2, AnonymousClass3BQ.RESHARED_REELS_VIEWER, wb3, A14, A14, i3);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ void DFj(Reel reel, AnonymousClass6UY r2) {
    }

    public final /* synthetic */ void DcC(Reel reel) {
    }

    public final /* synthetic */ void Dcl(Reel reel) {
    }

    public final void DhN() {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C228172ku r1 = this.A06;
        C46434Dew dew = this.A00;
        if (dew == null) {
            0qQ.A0F("listPaginationHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        r1.A01(dew);
        this.emptyStateView = C13991Tnr.A0V(this);
        0S7.A00(this);
        this.A04.setOnScrollListener(this);
        A02(this);
    }

    private final void A01() {
        C46434Dew dew = this.A00;
        if (dew != null) {
            dew.A01 = false;
            0lg A0X = DbT.A0X(this.A05);
            String str = this.A03;
            C46434Dew dew2 = this.A00;
            if (dew2 != null) {
                String str2 = dew2.A00;
                1NY A0O = DbU.A0O(A0X);
                A0O.A0K("media/%s/feed_to_stories_shares/", new Object[]{str});
                A0O.A0R(UXX.class, C18227Vnr.class);
                if (!TextUtils.isEmpty(str2)) {
                    A0O.A9m("max_id", str2);
                }
                1OC A0M = A0O.A0M();
                C15622Ufo.A00(A0M, this, 27);
                schedule(A0M);
                return;
            }
        }
        0qQ.A0F("listPaginationHelper");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(ReelResharesViewerFragment reelResharesViewerFragment) {
        EmptyStateView emptyStateView2 = reelResharesViewerFragment.emptyStateView;
        if (emptyStateView2 != null) {
            C15468UdJ udJ = reelResharesViewerFragment.A01;
            if (udJ == null) {
                DbS.A13();
                throw AnonymousClass00P.createAndThrow();
            }
            if (udJ.isEmpty()) {
                emptyStateView2.A0I();
            } else {
                emptyStateView2.A0K();
            }
            emptyStateView2.A0H();
        }
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return DbT.A0X(this.A05);
    }

    public final boolean CJz() {
        C15468UdJ udJ = this.A01;
        if (udJ != null) {
            return !udJ.isEmpty();
        }
        DbS.A13();
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return this.A07;
    }

    public final void CgO() {
        A01();
    }

    public final void Cvx(C17662Vbs vbs) {
        C59689JTv.A0F(requireContext(), "archive_media_unavailable", 2131953144);
    }

    public final void configureActionBar(2da r3) {
        DbW.A1C(r3, JTT.A0B(this, r3).getString(2131971605));
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.07Z, X.G7r, X.0S7, androidx.fragment.app.Fragment, instagram.features.stories.fragment.ReelResharesViewerFragment] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1335640947);
        ReelResharesViewerFragment.super.onCreate(bundle);
        this.A03 = requireArguments().getString(AnonymousClass000.A00(2471));
        this.A02 = AnonymousClass7TF.A0b();
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        AnonymousClass0eM r2 = this.A05;
        this.A00 = new C46434Dew(this, AnonymousClass7TE.A0l(r2), this);
        Context requireContext = requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(r2);
        C46434Dew dew = this.A00;
        if (dew == null) {
            0qQ.A0F("listPaginationHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        C15468UdJ udJ = new C15468UdJ(requireContext, this, this, A0l, dew);
        this.A01 = udJ;
        A0V(udJ);
        A01();
        AnonymousClass0fD.A09(1962765401, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1029446797);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_feed, viewGroup, false);
        AnonymousClass0fD.A09(-897392273, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1468056013);
        super.onDestroyView();
        this.emptyStateView = null;
        AnonymousClass0fD.A09(694773758, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1212311787);
        super.onResume();
        EmptyStateView emptyStateView2 = this.emptyStateView;
        if (emptyStateView2 != null) {
            emptyStateView2.A0T(C320156rr.EMPTY, 2131971604);
            AnonymousClass0fD.A09(-645429722, A022);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A0D = AnonymousClass7TG.A0D(absListView, -1436068103);
        this.A06.onScroll(absListView, i, i2, i3);
        AnonymousClass0fD.A0A(-1868468223, A0D);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0D = AnonymousClass7TG.A0D(absListView, -1717115656);
        this.A06.onScrollStateChanged(absListView, i);
        AnonymousClass0fD.A0A(815479490, A0D);
    }
}
