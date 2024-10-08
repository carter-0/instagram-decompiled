package X;

import android.content.Context;
import android.widget.TextView;

/* renamed from: X.8ti  reason: invalid class name and case insensitive filesystem */
public final class C369028ti extends C315486jy {
    public final CharSequence A00;

    public C369028ti(CharSequence charSequence) {
        0qQ.A0B(charSequence, 1);
        this.A00 = charSequence;
    }

    public final /* bridge */ /* synthetic */ void ADq(C283255Gu r6, C284395Mi r7) {
        C369058tl r72 = (C369058tl) r7;
        0qQ.A0B(r72, 0);
        0qQ.A0B(r6, 1);
        TextView textView = r72.A00;
        textView.setText(this.A00);
        Context context = textView.getContext();
        textView.setTextSize(0, context.getResources().getDimension(r6.A03));
        textView.setTextColor(context.getColor(r6.A02));
        textView.setGravity(3);
    }
}
