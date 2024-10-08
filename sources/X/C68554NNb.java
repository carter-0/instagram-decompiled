package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.NNb  reason: case insensitive filesystem */
public final class C68554NNb extends C232222tE {
    public AnonymousClass7XY A00;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        AnonymousClass7O9 r62 = (AnonymousClass7O9) r6;
        C67976My0 my0 = (C67976My0) r7;
        my0.itemView.setBackgroundColor(r62.A00);
        TextView textView = my0.A01;
        textView.setText(r62.A07);
        textView.setTextColor(r62.A02);
        TextView textView2 = my0.A00;
        C71397Ojw ojw = null;
        if (textView2 != null) {
            textView2.setText(r62.A06);
            textView2.setTextColor(r62.A03);
            if (r62.A0A) {
                ojw = new C71397Ojw(this, 49);
            }
            AnonymousClass0fU.A00(ojw, textView2);
            my0.A02.setVisibility(8);
            textView2.setVisibility(0);
            View view = my0.itemView;
            int i = r62.A01;
            0nA.A0h(view, i, i);
            return;
        }
        throw AnonymousClass7TE.A11("setOnClickListener");
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C67976My0(DbT.A0C(layoutInflater, viewGroup, R.layout.layout_shhmode_thread_title));
    }

    public final Class modelClass() {
        return AnonymousClass7O9.class;
    }
}
