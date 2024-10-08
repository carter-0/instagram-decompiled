package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gi8  reason: case insensitive filesystem */
public final class C53075Gi8 extends 2Rw {
    public List A00;
    public final C59586JPg A01;
    public final Map A02;

    public final void A00(String str) {
        0qQ.A0B(str, 0);
        int i = 0;
        for (GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.Sections A1A : this.A00) {
            if (!0qQ.A0K(C41847B3o.A1A(A1A, "section_id", 2), str)) {
                i++;
            } else if (i != -1) {
                List list = this.A00;
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (Object next : list) {
                    DbY.A1T(C41847B3o.A1A((GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.Sections) next, "section_id", 2), str, next, A1C);
                }
                this.A00 = A1C;
                this.A02.remove(str);
                notifyItemRemoved(i);
                return;
            } else {
                return;
            }
        }
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C53146GjI(DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.creator_inspiration_hub_reels_vscroll_item, false), this.A01);
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r8, int i) {
        UAE uae;
        C53146GjI gjI = (C53146GjI) r8;
        0qQ.A0B(gjI, 0);
        C250663lr r5 = (C250663lr) this.A00.get(i);
        PagingDataAdapter pagingDataAdapter = (PagingDataAdapter) this.A02.get(C41847B3o.A1A((GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.Sections) this.A00.get(i), "section_id", 2));
        0qQ.A0B(r5, 0);
        gjI.A02.setText(C41847B3o.A1A(r5, "title_text", 4));
        RecyclerView recyclerView = gjI.A01;
        recyclerView.setLayoutManager((C252553pI) gjI.A06.getValue());
        if (pagingDataAdapter != null) {
            Context context = gjI.A00.getContext();
            C53056Gho gho = new C53056Gho(Integer.valueOf(AnonymousClass7TG.A02(context)), Integer.valueOf(AnonymousClass7TF.A03(context, R.attr.igds_color_loading_shimmer_dark)));
            pagingDataAdapter.A06(new C66310MMt(gho, 9));
            uae = new UAE(pagingDataAdapter, gho);
        } else {
            uae = null;
        }
        recyclerView.setAdapter(uae);
        recyclerView.A11((AnonymousClass3B3) gjI.A05.getValue());
        recyclerView.A15((C249403jg) gjI.A04.getValue());
    }

    public C53075Gi8(C59586JPg jPg, List list, Map map) {
        AnonymousClass7TG.A1Q(map, jPg);
        this.A00 = list;
        this.A02 = map;
        this.A01 = jPg;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-345181934);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(-446635048, A03);
        return size;
    }
}
