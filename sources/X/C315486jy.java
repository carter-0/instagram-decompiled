package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.6jy  reason: invalid class name and case insensitive filesystem */
public abstract class C315486jy implements AnonymousClass5Gs {
    public final /* bridge */ /* synthetic */ C284395Mi ANJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        boolean A0G = C61670oa.A0G();
        int i = R.layout.tooltip_text;
        if (A0G) {
            i = R.layout.tooltip_text_prism;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
        return new C369058tl((TextView) inflate);
    }
}
