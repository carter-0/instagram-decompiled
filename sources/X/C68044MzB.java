package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.MzB  reason: case insensitive filesystem */
public final class C68044MzB extends C249703kE {
    public final View A00;
    public final RecyclerView A01;
    public final IgTextView A02;
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(new C73901Plc(this, 19));
    public final AnonymousClass0eM A04 = AnonymousClass1YB.A00(new C73901Plc(this, 20));
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(new C73901Plc(this, 21));
    public final O9E A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68044MzB(View view, O9E o9e) {
        super(view);
        0qQ.A0B(o9e, 2);
        this.A00 = view;
        this.A06 = o9e;
        this.A02 = DbX.A0Z(view, R.id.story_template_discovery_surface_section_header);
        View requireViewById = view.requireViewById(R.id.story_template_discovery_surface_section_content);
        RecyclerView recyclerView = (RecyclerView) requireViewById;
        recyclerView.setLayoutManager((C252553pI) this.A05.getValue());
        recyclerView.A11(new C60455Jln(AnonymousClass7TE.A0D(recyclerView.getResources()), 7));
        recyclerView.A15((C249403jg) this.A04.getValue());
        0qQ.A07(requireViewById);
        this.A01 = recyclerView;
    }

    public final void A00(int i) {
        int A1c;
        if (this.A00.getVisibility() == 0 && (A1c = ((LinearLayoutManager) this.A05.getValue()).A1c()) != -1) {
            C249703kE A0W = this.A01.A0W(A1c);
            if (A0W == null || !(A0W instanceof C68046MzD)) {
                this.A06.A00.updateActiveViewHolder(i, -1);
            } else {
                this.A06.A00.updateActiveViewHolder(i, A1c);
            }
        }
    }
}
