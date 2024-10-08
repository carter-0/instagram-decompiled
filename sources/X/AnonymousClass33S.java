package X;

import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.33S  reason: invalid class name */
public final class AnonymousClass33S {
    public boolean A00;
    public final List A01 = new ArrayList();
    public final C61250m8 A02;
    public final AnonymousClass0mA A03;

    public final void A00() {
        if (!this.A00 && this.A01.size() < 2) {
            this.A00 = true;
            AnonymousClass0mA r4 = this.A03;
            C61250m8 r3 = this.A02;
            0qQ.A0B(r3, 0);
            r3.A00(new AnonymousClass33U(new AnonymousClass33T(this), (AnonymousClass33Q) r4), R.layout.row_feed_inline_composer_button_no_viewstub);
        }
    }

    public AnonymousClass33S(C61250m8 r2, AnonymousClass0mA r3) {
        this.A03 = r3;
        this.A02 = r2;
    }
}
