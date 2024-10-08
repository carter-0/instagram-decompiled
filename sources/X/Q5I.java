package X;

import android.app.Dialog;
import android.content.Context;
import android.widget.TextView;

public final class Q5I extends Dialog {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q5I(Context context, C53290Glc glc) {
        super(context, glc.A05);
        0qQ.A0B(glc, 2);
        setContentView(glc.A02);
        this.A03 = (TextView) findViewById(glc.A06);
        this.A00 = (TextView) findViewById(glc.A01);
        this.A01 = (TextView) findViewById(glc.A03);
        this.A02 = (TextView) findViewById(glc.A04);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
    }

    public final void show() {
        super.show();
        this.A01.requestFocus();
    }
}
