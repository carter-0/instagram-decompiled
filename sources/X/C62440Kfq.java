package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Kfq  reason: case insensitive filesystem */
public enum C62440Kfq {
    ;
    
    public static final C62440Kfq[] A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        C62440Kfq[] kfqArr;
        A02 = 0oU.A00(kfqArr);
        A01 = values();
    }

    public final C249703kE A00(Context context, ViewGroup viewGroup) {
        if (this instanceof KNH) {
            int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new C249703kE(new View(context));
        } else if (this instanceof KNG) {
            return new C60549JnK(DbT.A0D(LayoutInflater.from(context), viewGroup, R.layout.layout_cta_selector_radio_group, false));
        } else {
            boolean z = this instanceof KNF;
            LayoutInflater from = LayoutInflater.from(context);
            if (z) {
                return new C249703kE(DbT.A0D(from, viewGroup, R.layout.layout_cta_selector_header_section, false));
            }
            return new C60611JoK(DbT.A0D(from, viewGroup, R.layout.layout_cta_selector_action_bar, false));
        }
    }

    /* access modifiers changed from: public */
    C62440Kfq(int i) {
        this.A00 = i;
    }
}
