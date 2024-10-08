package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

public final class UDB extends C249703kE {
    public final int A00;
    public final TextView A01;
    public final C14901UEg A02;

    public UDB(View view) {
        super(view);
        C14901UEg uEg = new C14901UEg(view, R.layout.question_response_item_text);
        this.A02 = uEg;
        TextView textView = (TextView) uEg.A05;
        this.A01 = textView;
        Context context = view.getContext();
        textView.setTypeface(AnonymousClass7TG.A0N(context));
        this.A00 = context.getColor(R.color.countdown_sticker_title_text_color);
    }
}
