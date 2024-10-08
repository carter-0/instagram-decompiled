package X;

import android.widget.TextView;

/* renamed from: X.ELv  reason: case insensitive filesystem */
public final class C47901ELv extends C315486jy {
    public final int A00;
    public final CharSequence A01;

    public final /* bridge */ /* synthetic */ void ADq(C283255Gu r3, C284395Mi r4) {
        TextView textView = ((C369058tl) r4).A00;
        textView.setWidth(this.A00);
        textView.setLines(2);
        textView.setText(this.A01);
    }

    public C47901ELv(CharSequence charSequence, int i) {
        this.A01 = charSequence;
        this.A00 = i;
    }
}
