package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Apd  reason: case insensitive filesystem */
public final class C41179Apd implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ TextView A01;
    public final /* synthetic */ AnonymousClass9X0 A02;

    public C41179Apd(View view, TextView textView, AnonymousClass9X0 r3) {
        this.A01 = textView;
        this.A00 = view;
        this.A02 = r3;
    }

    public final void run() {
        TextView textView = this.A01;
        View view = this.A00;
        float x = (textView.getX() + ((float) (textView.getWidth() / 2))) / AnonymousClass7TE.A02(view);
        float y = (textView.getY() + ((float) (textView.getHeight() / 2))) / AnonymousClass7TE.A03(view);
        float A03 = AnonymousClass7TE.A03(textView);
        AnonymousClass9X0 r1 = this.A02;
        Context context = r1.A02;
        float dimension = (A03 + (context.getResources().getDimension(R.dimen.account_discovery_bottom_gap) * 2.0f)) / AnonymousClass7TE.A03(view);
        float A022 = AnonymousClass7TE.A02(textView) / AnonymousClass7TE.A02(view);
        float A032 = AnonymousClass7TE.A03(textView) / AnonymousClass7TE.A03(view);
        String A0E = 0nH.A0E(-1);
        0nH.A0E(AnonymousClass7TF.A03(context, R.attr.igds_color_controls));
        r1.A06.A02 = new UNW(AnonymousClass7TE.A0u(), Float.valueOf(dimension), Float.valueOf(x), Float.valueOf(y), Float.valueOf(A032), Float.valueOf(A022), Float.valueOf(0.0f), A0E, (String) null);
    }
}
