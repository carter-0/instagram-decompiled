package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.save.model.SavedCollection;
import java.util.List;

/* renamed from: X.Gi3  reason: case insensitive filesystem */
public final class C53070Gi3 extends 2Rw {
    public final H14 A00;
    public final List A01 = AnonymousClass7TE.A1C();
    public final AnonymousClass0iw A02;
    public final UserSession A03;

    public C53070Gi3(AnonymousClass0iw r2, UserSession userSession, H14 h14) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A02 = r2;
        this.A00 = h14;
    }

    public final void onBindViewHolder(C249703kE r6, int i) {
        1Xj r0;
        1Xj A0u;
        0qQ.A0B(r6, 0);
        C53134Gj6 gj6 = (C53134Gj6) r6;
        SavedCollection savedCollection = (SavedCollection) this.A01.get(gj6.getBindingAdapterPosition());
        ImageUrl imageUrl = savedCollection.A01;
        if (imageUrl == null && (((r0 = savedCollection.A04) == null || (imageUrl = r0.A1Q()) == null) && ((A0u = C51966G9m.A0u(C51966G9m.A1J(savedCollection.A0L), 0)) == null || (imageUrl = A0u.A1Q()) == null))) {
            gj6.A03.A0B();
        } else {
            gj6.A03.setUrl(this.A03, imageUrl, this.A02);
        }
        gj6.A02.setText(savedCollection.A0G);
        TextView textView = gj6.A01;
        textView.setText(DbY.A0d(DbU.A05(textView), AnonymousClass7TG.A0A(savedCollection.A0E), R.plurals.saved_items));
        ID2.A02(gj6.A00, 42, savedCollection, this);
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C53134Gj6(DbT.A0D(DbX.A0F(viewGroup, 0), viewGroup, R.layout.layout_save_select_collection_item, false));
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1790754467);
        int size = this.A01.size();
        AnonymousClass0fD.A0A(792176721, A032);
        return size;
    }
}
