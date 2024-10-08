package X;

import com.instagram.ui.text.fittingtextview.FittingTextView;

public final class A8W {
    public final /* synthetic */ AYL A00;

    public A8W(AYL ayl) {
        this.A00 = ayl;
    }

    public final void A00(String str) {
        AYL ayl = this.A00;
        ayl.A0H = str.trim();
        AYL.A02(ayl);
        boolean z = !new 11S("^(?:\\s|\\p{Punct})*$").A08(str);
        ayl.A0I = z;
        FittingTextView fittingTextView = ayl.A0a;
        float f = 0.5f;
        if (z) {
            f = 1.0f;
        }
        fittingTextView.setAlpha(f);
    }
}
