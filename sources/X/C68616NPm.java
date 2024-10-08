package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;

/* renamed from: X.NPm  reason: case insensitive filesystem */
public final class C68616NPm extends C232232tF {
    public final G7A A00;

    public C68616NPm(G7A g7a) {
        0qQ.A0B(g7a, 1);
        this.A00 = g7a;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.3B3, java.lang.Object] */
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int A1U = AnonymousClass7TF.A1U(0, viewGroup, layoutInflater);
        C67952Mxc mxc = new C67952Mxc(DbU.A09(layoutInflater, viewGroup, R.layout.layout_meta_ai_suggested_prompts, false), this.A00);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(viewGroup.getContext(), 0, false);
        RecyclerView recyclerView = mxc.A00;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(mxc.A01);
        if (recyclerView.A12.size() < A1U) {
            recyclerView.A11(new Object());
        }
        recyclerView.setClipToPadding(false);
        return mxc;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r14, C249703kE r15) {
        int dimensionPixelSize;
        C69162Nfl nfl = (C69162Nfl) r14;
        C67952Mxc mxc = (C67952Mxc) r15;
        AnonymousClass7TF.A1H(nfl, mxc);
        ViewModelListUpdate A0R = DbS.A0R();
        String A0d = AnonymousClass7TF.A0d(mxc.itemView.getResources(), 2131972829);
        Integer valueOf = Integer.valueOf(R.drawable.instagram_icons_exceptions_genai_agent_profile_filled_24);
        N62 n62 = nfl.A00;
        A0R.A00(new UO1((C61062Jw0) null, n62.A01, valueOf, A0d, "", "", (String) null, 0));
        for (UO1 A002 : n62.A03) {
            A0R.A00(A002);
        }
        if (n62.A04) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = mxc.A00.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        }
        0nA.A0X(mxc.A00, dimensionPixelSize);
        mxc.A01.A05(A0R);
    }

    public final Class modelClass() {
        return C69162Nfl.class;
    }
}
