package X;

import android.widget.CompoundButton;
import java.util.HashMap;

/* renamed from: X.Ol6  reason: case insensitive filesystem */
public final class C71464Ol6 implements CompoundButton.OnCheckedChangeListener {
    public N4P A00;
    public final 0wc A01;
    public final 1a8 A02;
    public final C74449Pv4 A03;
    public final AnonymousClass4kA A04;

    public C71464Ol6(0wc r2, 1a8 r3, C74449Pv4 pv4, AnonymousClass4kA r5) {
        0qQ.A0B(r3, 1);
        this.A02 = r3;
        this.A03 = pv4;
        this.A04 = r5;
        this.A01 = r2;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        1aU APP;
        1aV r0;
        N4P n4p = this.A00;
        if (n4p != null) {
            1a8 r2 = this.A02;
            AnonymousClass7ZA C62 = this.A03.C62();
            C254793t3 r02 = n4p.A0L;
            if (z) {
                APP = C62.ARj(r02);
                r0 = PTG.A00;
            } else {
                APP = C62.APP(r02);
                r0 = PTH.A00;
            }
            r2.A02(APP, r0);
            0xa r4 = this.A04.A00;
            if (r4.getInt("thread_translation_tooltip_impression", 0) < 3) {
                AnonymousClass7TG.A1M(r4, "thread_translation_tooltip_impression", 3);
            }
            String A09 = C66647MaG.A09(n4p.A08());
            if (A09 != null) {
                0wc r3 = this.A01;
                boolean A0C = n4p.A0C();
                0qQ.A0B(r3, 0);
                HashMap A0e = C66584MXp.A0e(A09, A0C);
                A0e.put("enabled_status", String.valueOf(z));
                C69956Nuw.A00(r3, "thread_details_translations_button_toggled", A0e);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
