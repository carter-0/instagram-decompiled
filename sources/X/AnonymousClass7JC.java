package X;

import com.instagram.ui.widget.textview.IgAutoCompleteTextView;

/* renamed from: X.7JC  reason: invalid class name */
public final class AnonymousClass7JC implements AnonymousClass7JD {
    public final /* synthetic */ AnonymousClass7JA A00;
    public final /* synthetic */ IgAutoCompleteTextView A01;

    public AnonymousClass7JC(AnonymousClass7JA r1, IgAutoCompleteTextView igAutoCompleteTextView) {
        this.A01 = igAutoCompleteTextView;
        this.A00 = r1;
    }

    public final boolean Dbf(AnonymousClass05V r6) {
        if (r6.A00.A00.getDescription().hasMimeType("image/gif")) {
            C59689JTv.A01(this.A01.getContext(), "unsupportedGifError", 2131958888, 1);
            return true;
        }
        0nY.A00().ATE(new C386879lJ(r6, this.A00, this.A01));
        return true;
    }
}
