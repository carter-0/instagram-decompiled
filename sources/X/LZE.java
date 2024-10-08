package X;

import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import com.instagram.android.R;
import com.instagram.api.schemas.GiphyRequestSurface;
import com.instagram.common.session.UserSession;

public final class LZE implements AbsListView.OnScrollListener {
    public boolean A00;
    public final View A01;
    public final K9K A02;
    public final KR2 A03;
    public final View A04;
    public final ListView A05;

    /* JADX WARNING: type inference failed for: r4v0, types: [android.widget.ListAdapter, X.K9K] */
    public LZE(View view, AnonymousClass0iw r21, UserSession userSession, AnonymousClass4D6 r23, C314236hs r24, C66441MRv mRv) {
        UserSession userSession2 = userSession;
        C314236hs r9 = r24;
        DbW.A1N(userSession2, 1, r9);
        View view2 = view;
        ? k9k = new K9K(AnonymousClass7TE.A0S(view2), r21, userSession2, (C357638Yz) null, r9, mRv, (0sP) null, false, false);
        this.A02 = k9k;
        AnonymousClass4D6 r3 = r23;
        this.A03 = new KR2(r3, this, new C65267LqM(GiphyRequestSurface.EMOJI_PICKER_SHEET, (AnonymousClass0iw) null, userSession2, AnonymousClass7TE.A1I(C62564Khu.EMOJI), false));
        this.A01 = AnonymousClass7TF.A0G(view2, R.id.assets_search_results);
        this.A04 = AnonymousClass7TF.A0G(view2, R.id.loading_spinner);
        ListView listView = (ListView) AnonymousClass7TF.A0F(view2, R.id.assets_search_results_list);
        this.A05 = listView;
        listView.setAdapter(k9k);
        listView.setOnScrollListener(this);
    }

    public static final void A00(LZE lze, boolean z) {
        int i = 8;
        lze.A04.setVisibility(DbW.A01(z ? 1 : 0));
        ListView listView = lze.A05;
        if (!z) {
            i = 0;
        }
        listView.setVisibility(i);
        K9K k9k = lze.A02;
        if (k9k.A00) {
            k9k.A00 = false;
            K9K.A01(k9k);
        }
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AnonymousClass0fD.A0A(1627270534, AnonymousClass0fD.A03(45222080));
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0D = AnonymousClass7TG.A0D(absListView, 117646688);
        if (i == 1) {
            0nA.A0N(absListView);
        }
        AnonymousClass0fD.A0A(710209632, A0D);
    }
}
