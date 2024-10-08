package X;

import android.content.Context;
import android.widget.TextView;

/* renamed from: X.6jx  reason: invalid class name and case insensitive filesystem */
public final class C315476jx extends C315486jy {
    public int A00;
    public CharSequence A01;

    public C315476jx(CharSequence charSequence) {
        0qQ.A0B(charSequence, 1);
        this.A01 = charSequence;
    }

    public final /* bridge */ /* synthetic */ void ADq(C283255Gu r6, C284395Mi r7) {
        TextView textView;
        C369058tl r72 = (C369058tl) r7;
        0qQ.A0B(r72, 0);
        0qQ.A0B(r6, 1);
        CharSequence charSequence = this.A01;
        if (charSequence == null || charSequence.length() == 0) {
            textView = r72.A00;
            textView.setText(this.A00);
        } else {
            textView = r72.A00;
            textView.setText(charSequence);
        }
        Context context = textView.getContext();
        textView.setTextSize(0, context.getResources().getDimension(r6.A03));
        textView.setTextColor(context.getColor(r6.A02));
    }

    public C315476jx(int i) {
        this.A00 = i;
    }
}
