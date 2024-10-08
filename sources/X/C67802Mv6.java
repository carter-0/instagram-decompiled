package X;

import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.ui.collections.DirectThreadDetailsCollectionViewModel;
import com.instagram.save.model.SavedCollection;
import java.util.List;

/* renamed from: X.Mv6  reason: case insensitive filesystem */
public final class C67802Mv6 extends 2Rw {
    public final List A00 = AnonymousClass7TE.A1C();
    public final O7E A01;

    public final void onBindViewHolder(C249703kE r6, int i) {
        SavedCollection savedCollection;
        ImageUrl A1Q;
        0qQ.A0B(r6, 0);
        if ((r6 instanceof C68017Myj) && (savedCollection = ((DirectThreadDetailsCollectionViewModel) this.A00.get(i)).A00) != null) {
            C68017Myj myj = (C68017Myj) r6;
            C71408Ok7.A00(myj.A01, 65, this.A01, savedCollection);
            1Xj r0 = savedCollection.A04;
            if (!(r0 == null || (A1Q = r0.A1Q()) == null)) {
                myj.A04.setUrl(A1Q, DbS.A0O(C68440NId.__redex_internal_original_name));
            }
            myj.A03.setText(savedCollection.A0G);
            myj.A02.setText(DbY.A0d(myj.A00.getResources(), savedCollection.A00(), R.plurals.collection_post_count));
        }
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        int intValue = AnonymousClass05K.A00(2)[i].intValue();
        if (intValue == 0) {
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new C68017Myj(DbT.A0D(DbV.A0D(viewGroup), viewGroup, R.layout.direct_thread_details_redesign_collection_item, false));
        } else if (intValue == 1) {
            int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new C67914Mww(DbT.A0D(DbV.A0D(viewGroup), viewGroup, R.layout.direct_thread_details_collection_loading_indicator, false));
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }

    public C67802Mv6(O7E o7e) {
        this.A01 = o7e;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-1680716110);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(1868775946, A03);
        return size;
    }

    public final int getItemViewType(int i) {
        int A03 = AnonymousClass0fD.A03(94762748);
        int intValue = ((DirectThreadDetailsCollectionViewModel) this.A00.get(i)).A01.intValue();
        AnonymousClass0fD.A0A(1760398114, A03);
        return intValue;
    }
}
