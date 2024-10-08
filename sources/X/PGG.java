package X;

import android.text.style.ClickableSpan;
import android.view.View;

public final class PGG implements C255763ug {
    public final /* synthetic */ C3256673q A00;
    public final /* synthetic */ C3259674w A01;
    public final /* synthetic */ String A02;

    public PGG(C3256673q r1, C3259674w r2, String str) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = str;
    }

    public final void D28(ClickableSpan clickableSpan, View view, String str) {
        C332957Xc r2 = this.A00.A01;
        if (!((C333107Xr) r2).CPk()) {
            1aV A03 = this.A01.A03();
            if (A03 != null) {
                A03.accept(this.A02);
            }
            r2.CtO(this.A02);
        }
    }
}
