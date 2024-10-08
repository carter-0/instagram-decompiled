package X;

import android.view.ViewGroup;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gi9  reason: case insensitive filesystem */
public final class C53076Gi9 extends 2Rw {
    public List A00;
    public final UserSession A01;
    public final C59586JPg A02;
    public final Map A03;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C54566HJb(DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.clips_template_browser_hscroll_section_view, false), this.A01, this.A02);
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r6, int i) {
        C53107Gif gif = (C53107Gif) r6;
        0qQ.A0B(gif, 0);
        PagingDataAdapter pagingDataAdapter = (PagingDataAdapter) this.A03.get(((GSY) this.A00.get(i)).A02);
        if (pagingDataAdapter != null) {
            GSY gsy = (GSY) this.A00.get(i);
            C54566HJb hJb = (C54566HJb) gif;
            if (gsy != null) {
                hJb.A00 = gsy.A02;
                hJb.A05.setText(gsy.A03);
                boolean A0K = 0qQ.A0K(hJb.A00, "creator_partnership");
                IgSimpleImageView igSimpleImageView = hJb.A04;
                if (A0K) {
                    igSimpleImageView.setVisibility(0);
                    C56801ICy.A01(igSimpleImageView, 32, hJb);
                } else {
                    igSimpleImageView.setVisibility(8);
                }
                RecyclerView recyclerView = hJb.A02;
                recyclerView.setLayoutManager((C252553pI) hJb.A09.getValue());
                C53056Gho gho = new C53056Gho((Integer) null, (Integer) null);
                pagingDataAdapter.A06(new C66310MMt(gho, 9));
                recyclerView.setAdapter(new UAE(pagingDataAdapter, gho));
                recyclerView.A15((C249403jg) hJb.A08.getValue());
                recyclerView.A11((AnonymousClass3B3) hJb.A07.getValue());
            }
        }
    }

    public final /* bridge */ /* synthetic */ void onViewRecycled(C249703kE r3) {
        C53107Gif gif = (C53107Gif) r3;
        0qQ.A0B(gif, 0);
        C54566HJb hJb = (C54566HJb) gif;
        RecyclerView recyclerView = hJb.A02;
        recyclerView.A12((AnonymousClass3B3) hJb.A07.getValue());
        recyclerView.A16((C249403jg) hJb.A08.getValue());
    }

    public C53076Gi9(UserSession userSession, C59586JPg jPg, List list, Map map) {
        C51974G9v.A1M(map, jPg, userSession);
        this.A00 = list;
        this.A03 = map;
        this.A02 = jPg;
        this.A01 = userSession;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(1644774811);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(-1533582611, A032);
        return size;
    }
}
