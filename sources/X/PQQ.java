package X;

import android.widget.TextView;

public final class PQQ implements C295005nO {
    public final /* synthetic */ float A00;
    public final /* synthetic */ TextView A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ String A03;

    public PQQ(TextView textView, Integer num, String str, float f) {
        this.A01 = textView;
        this.A03 = str;
        this.A02 = num;
        this.A00 = f;
    }

    public final void onFinish() {
        TextView textView = this.A01;
        textView.setText(this.A03);
        Integer num = this.A02;
        Integer num2 = AnonymousClass05K.A00;
        float f = this.A00;
        if (num != num2) {
            f = -f;
        }
        textView.setTranslationY(f);
        C294975nL A0Y = C66583MXo.A0Y(textView);
        A0Y.A0I(1.0f);
        A0Y.A0K(0.0f);
        A0Y.A0H();
    }
}
