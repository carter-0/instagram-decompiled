package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.79K  reason: invalid class name */
public final class AnonymousClass79K extends C232222tE {
    public final AnonymousClass7SF A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View inflate = layoutInflater.inflate(R.layout.layout_ephemerality_mode_thread_nux, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
        return new C67907Mwp((TextView) inflate);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        TextView textView;
        AnonymousClass7O7 r62 = (AnonymousClass7O7) r6;
        C67907Mwp mwp = (C67907Mwp) r7;
        0qQ.A0B(r62, 0);
        0qQ.A0B(mwp, 1);
        String str = r62.A02;
        if (str == null || str.length() == 0) {
            textView = mwp.A00;
            textView.setText(r62.A03);
            textView.setTypeface(textView.getTypeface(), 0);
            textView.setOnClickListener((View.OnClickListener) null);
        } else {
            textView = mwp.A00;
            textView.setText(str);
            textView.setTypeface(textView.getTypeface(), 1);
        }
        textView.setTextColor(r62.A00);
    }

    public final Class modelClass() {
        return AnonymousClass7O7.class;
    }

    public AnonymousClass79K(AnonymousClass7SF r1) {
        this.A00 = r1;
    }
}
