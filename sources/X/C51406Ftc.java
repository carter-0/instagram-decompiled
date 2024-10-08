package X;

import android.content.Context;
import android.widget.TextSwitcher;
import com.instagram.android.R;

/* renamed from: X.Ftc  reason: case insensitive filesystem */
public final class C51406Ftc implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ TextSwitcher A01;

    public C51406Ftc(Context context, TextSwitcher textSwitcher) {
        this.A01 = textSwitcher;
        this.A00 = context;
    }

    public final void run() {
        TextSwitcher textSwitcher = this.A01;
        Context context = this.A00;
        textSwitcher.setInAnimation(context, R.anim.text_slide_in);
        textSwitcher.setOutAnimation(context, R.anim.text_slide_out_up);
        textSwitcher.setText(context.getResources().getString(2131971559));
    }
}
