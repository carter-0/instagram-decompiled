package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

public final class AOO implements View.OnClickListener {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C255783ui A01;
    public final /* synthetic */ C389709q4 A02;
    public final /* synthetic */ C316906mP A03;
    public final /* synthetic */ C309876Zy A04;

    public AOO(ImageView imageView, C255783ui r2, C389709q4 r3, C316906mP r4, C309876Zy r5) {
        this.A03 = r4;
        this.A00 = imageView;
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-890390810);
        Context context = this.A03.A01;
        0qQ.A07(context);
        float A012 = ((float) AnonymousClass0nB.A01(context)) * 0.5f;
        float translationY = this.A00.getTranslationY() + (((float) this.A02.A00.A04) * 0.5f);
        C309876Zy r3 = this.A04;
        if (r3 != null) {
            r3.DcE(this.A01, (int) A012, (int) translationY);
        }
        AnonymousClass0fD.A0C(368505769, A05);
    }
}
