package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.NNg  reason: case insensitive filesystem */
public final class C68559NNg extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C249703kE(DbT.A0D(layoutInflater, viewGroup, R.layout.poll_message_question_item, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C68186N5b n5b = (C68186N5b) r3;
        AnonymousClass7TG.A1N(n5b, r4);
        View view = r4.itemView;
        0qQ.A0C(view, "null cannot be cast to non-null type com.instagram.common.ui.base.IgTextView");
        ((TextView) view).setText(n5b.A00);
    }

    public final Class modelClass() {
        return C68186N5b.class;
    }
}
