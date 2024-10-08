package X;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.7EL  reason: invalid class name */
public final class AnonymousClass7EL implements C328007Db {
    public Float A00;
    public final C252063oV A01;
    public final C333107Xr A02;

    public final void A02(AnonymousClass7AD r4) {
        C252063oV r2 = this.A01;
        r2.setVisibility(0);
        Float f = this.A00;
        if (f != null) {
            A01(f.floatValue());
        }
        r2.getView().setBackgroundColor(r4.A00);
        ((ImageView) r2.getView()).setImageTintList(ColorStateList.valueOf(r4.A01));
        AnonymousClass0fU.A00(new ANZ(this, r4), r2.getView());
    }

    public final void A00() {
        C252063oV r1 = this.A01;
        r1.setVisibility(8);
        if (r1.CVM()) {
            r1.getView().setOnClickListener((View.OnClickListener) null);
        }
    }

    public final void A01(float f) {
        Float valueOf;
        C252063oV r1 = this.A01;
        if (r1.CFV() == 0) {
            r1.getView().setTranslationX(f);
            valueOf = null;
        } else {
            valueOf = Float.valueOf(f);
        }
        this.A00 = valueOf;
    }

    public final View BJd() {
        return this.A01.getView();
    }

    public AnonymousClass7EL(C252063oV r1, C333107Xr r2) {
        this.A01 = r1;
        this.A02 = r2;
    }
}
