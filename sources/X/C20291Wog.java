package X;

import android.widget.TextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Wog  reason: case insensitive filesystem */
public final class C20291Wog implements Runnable {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ C2367935c A01;
    public final /* synthetic */ IgImageView A02;

    public C20291Wog(TextView textView, C2367935c r2, IgImageView igImageView) {
        this.A01 = r2;
        this.A00 = textView;
        this.A02 = igImageView;
    }

    public final void run() {
        TextView textView = this.A00;
        0qQ.A0A(textView);
        IgImageView igImageView = this.A02;
        0qQ.A0A(igImageView);
        C14002To4 to4 = new C14002To4(0.0f);
        to4.A01(0.5f);
        to4.A02(200.0f);
        C14754U7l u7l = C14001To3.A0I;
        C14090Tph tph = new C14090Tph(u7l, textView, -300.0f);
        tph.A01 = to4;
        C14090Tph tph2 = new C14090Tph(u7l, igImageView, -600.0f);
        tph2.A01 = to4;
        tph.A02();
        tph2.A02();
        textView.animate().alpha(1.0f).setDuration(600);
        igImageView.animate().alpha(1.0f).setDuration(600);
    }
}
