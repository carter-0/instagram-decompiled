package X;

import android.content.Context;
import android.widget.TextView;

/* renamed from: X.ELw  reason: case insensitive filesystem */
public final class C47902ELw extends C315486jy {
    public CharSequence A00;
    public final float A01 = 0.6f;
    public final Context A02;

    public final /* bridge */ /* synthetic */ void ADq(C283255Gu r6, C284395Mi r7) {
        C369058tl r72 = (C369058tl) r7;
        AnonymousClass7TF.A1H(r72, r6);
        CharSequence charSequence = this.A00;
        if (!(charSequence == null || charSequence.length() == 0)) {
            r72.A00.setText(charSequence);
        }
        TextView textView = r72.A00;
        Context context = textView.getContext();
        textView.setTextSize(0, context.getResources().getDimension(r6.A03));
        DbT.A17(context, textView, r6.A02);
        textView.setMaxWidth((int) (((float) 0nA.A09(this.A02)) * this.A01));
    }

    public C47902ELw(Context context, CharSequence charSequence) {
        0qQ.A0B(charSequence, 1);
        this.A00 = charSequence;
        this.A02 = context;
    }
}
