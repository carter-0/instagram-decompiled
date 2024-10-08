package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Uhr  reason: case insensitive filesystem */
public final class C15746Uhr extends C232222tE {
    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        TextView textView;
        int i;
        WS6 ws6 = (WS6) r5;
        C14863UCr uCr = (C14863UCr) r6;
        AnonymousClass7TG.A1N(ws6, uCr);
        C61046Jvk jvk = ws6.A00;
        if (!jvk.A01) {
            textView = uCr.A01;
            i = 2131965491;
        } else {
            String str = jvk.A00;
            if (00l.A0W(str)) {
                textView = uCr.A01;
                i = 2131972868;
            } else {
                DbX.A13(uCr.A00, uCr.A01, str, 2131972869);
                return;
            }
        }
        textView.setText(i);
    }

    public final Class modelClass() {
        return WS6.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C14863UCr(DbT.A0D(layoutInflater, viewGroup, R.layout.tagging_feed_spinner, false));
    }
}
