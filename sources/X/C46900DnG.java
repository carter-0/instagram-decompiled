package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.DnG  reason: case insensitive filesystem */
public final class C46900DnG extends C249703kE {
    public final AnonymousClass2t9 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46900DnG(View view, AnonymousClass0iw r8, 0sP r9) {
        super(view);
        AnonymousClass3AR r1;
        AnonymousClass7TG.A1Q(r8, r9);
        Context context = view.getContext();
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(context);
        A002.A0C.addAll(AnonymousClass7TE.A1I(new C15767UiC(r8, r9)));
        A002.A09 = true;
        AnonymousClass2t9 A003 = A002.A00();
        this.A00 = A003;
        View requireViewById = view.requireViewById(R.id.horizontal_scroll_recycler_view);
        RecyclerView recyclerView = (RecyclerView) requireViewById;
        recyclerView.setAdapter(A003);
        DbV.A1A(context, recyclerView);
        0qQ.A07(requireViewById);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        recyclerView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        AnonymousClass3AS r12 = recyclerView.A0C;
        if ((r12 instanceof AnonymousClass3AR) && (r1 = (AnonymousClass3AR) r12) != null) {
            r1.A00 = false;
        }
        recyclerView.A0S = true;
    }
}
