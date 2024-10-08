package X;

import android.content.Context;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class LZF implements AbsListView.OnScrollListener, C252213ok, C74308Psi {
    public String A00;
    public boolean A01;
    public final View A02;
    public final AnonymousClass3E6 A03;
    public final KKB A04;
    public final K9K A05;
    public final C67691MsV A06;
    public final View A07;
    public final ListView A08;

    /* JADX WARNING: type inference failed for: r2v0, types: [android.widget.ListAdapter, X.K9K] */
    public LZF(View view, AnonymousClass0iw r14, UserSession userSession, AnonymousClass3E6 r16, C314236hs r17, KKB kkb, C66441MRv mRv) {
        0qQ.A0B(userSession, 1);
        C314236hs r7 = r17;
        KKB kkb2 = kkb;
        AnonymousClass3E6 r1 = r16;
        C51974G9v.A1S(r14, view, kkb2, r1, r7);
        Context context = view.getContext();
        this.A04 = kkb2;
        this.A03 = r1;
        0qQ.A0A(context);
        ? k9k = new K9K(context, r14, userSession, (C357638Yz) null, r7, mRv, (0sP) null, false, false);
        this.A05 = k9k;
        this.A06 = new C67691MsV(userSession, this);
        this.A02 = AnonymousClass7TF.A0G(view, R.id.assets_search_results);
        this.A07 = AnonymousClass7TF.A0G(view, R.id.loading_spinner);
        View A0F = DbY.A0F(view, R.id.assets_search_results_list);
        0qQ.A0C(A0F, AnonymousClass000.A00(176));
        ListView listView = (ListView) A0F;
        this.A08 = listView;
        listView.setAdapter(k9k);
        listView.setOnScrollListener(this);
    }

    public final void Dfc(String str, List list) {
        0qQ.A0B(str, 0);
        if (str.equals(this.A00)) {
            this.A05.A05(JTQ.A0j(list));
        }
    }

    public static final void A00(LZF lzf) {
        lzf.A07.setVisibility(8);
        lzf.A08.setVisibility(0);
        K9K k9k = lzf.A05;
        if (k9k.A00) {
            k9k.A00 = false;
            K9K.A01(k9k);
        }
    }

    public final void A01(String str) {
        if (!this.A01) {
            return;
        }
        if (str != null) {
            this.A00 = str;
            if (str.length() == 0) {
                this.A05.A03();
            }
            A00(this);
            String str2 = this.A00;
            if (str2 == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            } else if (str2.length() != 0) {
                this.A06.filter(str2);
            }
        } else {
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public final void DMr(int i, boolean z) {
        this.A07.setTranslationY(((float) i) / -2.0f);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AnonymousClass0fD.A0A(-642568233, AnonymousClass0fD.A03(1008882793));
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0D = AnonymousClass7TG.A0D(absListView, -526113291);
        if (i == 1) {
            0nA.A0N(absListView);
        }
        AnonymousClass0fD.A0A(1617433122, A0D);
    }
}
