package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Do4  reason: case insensitive filesystem */
public final class C46950Do4 extends C249703kE {
    public final RecyclerView A00;
    public final AnonymousClass2t9 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46950Do4(View view, AnonymousClass0iw r6) {
        super(view);
        0qQ.A0B(view, 1);
        AnonymousClass2t9 A0U = DbU.A0U(AnonymousClass2t9.A00(DbS.A07(this)), new C47762EFw(r6));
        this.A01 = A0U;
        RecyclerView recyclerView = (RecyclerView) view;
        DbV.A1A(recyclerView.getContext(), recyclerView);
        recyclerView.A11(new AnonymousClass3V7(AnonymousClass7TE.A0F(this.itemView.getResources()), AnonymousClass7TE.A0C(this.itemView.getResources())));
        recyclerView.setAdapter(A0U);
        this.A00 = recyclerView;
    }
}
