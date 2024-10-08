package X;

import android.content.Context;
import android.widget.TextSwitcher;
import com.instagram.android.R;

/* renamed from: X.Fut  reason: case insensitive filesystem */
public final class C51485Fut implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ TextSwitcher A01;
    public final /* synthetic */ CharSequence A02;

    public C51485Fut(Context context, TextSwitcher textSwitcher, CharSequence charSequence) {
        this.A01 = textSwitcher;
        this.A00 = context;
        this.A02 = charSequence;
    }

    public final void run() {
        TextSwitcher textSwitcher = this.A01;
        Context context = this.A00;
        textSwitcher.setInAnimation(context, R.anim.text_slide_in);
        textSwitcher.setOutAnimation(context, R.anim.text_slide_out_up);
        textSwitcher.setText(this.A02);
    }
}
