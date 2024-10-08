package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.7PB  reason: invalid class name */
public final class AnonymousClass7PB extends C232222tE {
    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        AnonymousClass7O6 r42 = (AnonymousClass7O6) r4;
        AnonymousClass7PH r52 = (AnonymousClass7PH) r5;
        TextView textView = r52.A00;
        textView.setText(r42.A03);
        textView.setTextColor(r42.A04);
        r52.itemView.setBackground(r42.A05);
        C3256573p.A00(textView, r42.A08);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new AnonymousClass7PH(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.thread_message_timestamp_separator, viewGroup, false));
    }

    public final Class modelClass() {
        return AnonymousClass7O6.class;
    }
}
