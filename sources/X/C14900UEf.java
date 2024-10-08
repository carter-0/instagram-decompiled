package X;

import android.view.View;
import android.widget.TextView;

/* renamed from: X.UEf  reason: case insensitive filesystem */
public final class C14900UEf extends C249703kE implements View.OnClickListener {
    public C62320sa A00;
    public final TextView A01;

    public C14900UEf(TextView textView) {
        super(textView);
        this.A01 = textView;
        int A012 = AnonymousClass1GB.A01(0nA.A04(JTQ.A06(this), 40));
        AnonymousClass0fU.A00(this, textView);
        textView.setGravity(17);
        textView.setMinHeight(A012);
        textView.setMinWidth(A012);
        textView.setLayoutParams(new AnonymousClass3MX(-1, -1));
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1883574400);
        C62320sa r0 = this.A00;
        if (r0 != null) {
            r0.invoke();
        }
        AnonymousClass0fD.A0C(867964175, A05);
    }
}
