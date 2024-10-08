package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Mm4  reason: case insensitive filesystem */
public final class C67328Mm4 extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final View A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67328Mm4(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A02 = view;
        this.A00 = AnonymousClass7TG.A0R(view, R.id.inbox_header_pill_text);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.inbox_header_pill_unread_count);
    }

    public final void A00(C67331Mm7 mm7, C62320sa r5, boolean z) {
        0qQ.A0B(mm7, 0);
        this.A00.setText(mm7.A01);
        this.itemView.setSelected(z);
        this.itemView.setEnabled(mm7.A02);
        C71395Oju.A00(this.itemView, 67, r5);
        CharSequence charSequence = mm7.A01;
        if (charSequence != null) {
            TextView textView = this.A01;
            textView.setText(charSequence);
            textView.setVisibility(0);
            return;
        }
        this.A01.setVisibility(8);
    }
}
