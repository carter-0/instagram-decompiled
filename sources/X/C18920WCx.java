package X;

import android.widget.CompoundButton;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;

/* renamed from: X.WCx  reason: case insensitive filesystem */
public final class C18920WCx implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C18920WCx(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        String str;
        if (this.A00 != 0) {
            C49681F1p f1p = (C49681F1p) this.A02;
            if (z) {
                str = "on";
            } else {
                str = "off";
            }
            f1p.A00(str, this.A03, "toggle");
        } else if (z) {
            C16016Umz umz = (C16016Umz) this.A02;
            umz.A0F((LeadGenFormBaseQuestion) this.A01, this.A03);
            umz.A00.setVisibility(8);
        }
    }
}
