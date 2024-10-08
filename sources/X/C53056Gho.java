package X;

import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Gho  reason: case insensitive filesystem */
public final class C53056Gho extends C60432JlP {
    public final Integer A00;
    public final Integer A01;

    public final /* bridge */ /* synthetic */ C249703kE A00(ViewGroup viewGroup, C63569KzI kzI) {
        return new C53132Gj4(DbU.A09(DbV.A0D(viewGroup), viewGroup, R.layout.clips_template_browser_placeholder_item_layout, false));
    }

    public final /* bridge */ /* synthetic */ void A02(C63569KzI kzI, C249703kE r5) {
        C53132Gj4 gj4 = (C53132Gj4) r5;
        0qQ.A0B(gj4, 0);
        Integer num = this.A00;
        Integer num2 = this.A01;
        if (num != null) {
            gj4.A01.setCornerRadius(num.intValue());
        }
        if (num2 != null) {
            gj4.A00.setBackgroundColor(num2.intValue());
        }
    }

    public C53056Gho(Integer num, Integer num2) {
        this.A00 = num;
        this.A01 = num2;
    }

    public C53056Gho() {
        this((Integer) null, (Integer) null);
    }
}
