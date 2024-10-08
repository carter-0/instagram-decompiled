package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.ui.widget.loadmore.LoadMoreButton;

/* renamed from: X.7PO  reason: invalid class name */
public final class AnonymousClass7PO extends C232222tE {
    public final AnonymousClass7LB A00;

    public AnonymousClass7PO(AnonymousClass7LB r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final AnonymousClass7PQ A00(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        View A002 = LoadMoreButton.A00(viewGroup.getContext(), R.layout.thread_message_load_more_empty, viewGroup);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new AnonymousClass7PQ(A002, new AnonymousClass7PP(this));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        AnonymousClass7Z5 r42 = (AnonymousClass7Z5) r4;
        AnonymousClass7PQ r52 = (AnonymousClass7PQ) r5;
        0qQ.A0B(r42, 0);
        0qQ.A0B(r52, 1);
        AnonymousClass7LB r2 = r52.A00;
        r2.A00 = r42;
        if (r2.CWV() && !r2.isLoading() && !r2.CT5() && r2.CKB()) {
            r2.CgO();
        }
        r52.A01.A03(r2, (C230682q1) null);
    }

    public final Class modelClass() {
        return AnonymousClass7Z5.class;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r3) {
        AnonymousClass7PQ r32 = (AnonymousClass7PQ) r3;
        0qQ.A0B(r32, 0);
        r32.A00.A00 = null;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return A00(viewGroup);
    }
}
