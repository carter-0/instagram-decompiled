package X;

import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

public final /* synthetic */ class PZG implements Runnable {
    public final /* synthetic */ OED A00;
    public final /* synthetic */ C329307Ij A01;

    public /* synthetic */ PZG(OED oed, C329307Ij r2) {
        this.A01 = r2;
        this.A00 = oed;
    }

    public final void run() {
        C329307Ij r0 = this.A01;
        OED oed = this.A00;
        ComposerAutoCompleteTextView composerAutoCompleteTextView = r0.A0S;
        DbS.A1C(composerAutoCompleteTextView);
        composerAutoCompleteTextView.setSelection(0);
        if (oed != null) {
            C329067Hl r3 = oed.A00;
            String[] split = oed.A01.split(oed.A02);
            int length = split.length;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                } else if (!split[length].trim().isEmpty()) {
                    r3.A1Q(split[length].trim());
                    if (length <= 0) {
                        break;
                    }
                    r3.A1N(AnonymousClass7JY.AI);
                }
            }
            C329307Ij r02 = r3.A0b;
            r02.A0E = false;
            C331337Qp r03 = r02.A0A;
            if (r03 != null) {
                r03.A03 = false;
            }
        }
    }
}
