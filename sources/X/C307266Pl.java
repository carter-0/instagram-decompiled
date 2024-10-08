package X;

import android.view.View;
import android.widget.TextView;

/* renamed from: X.6Pl  reason: invalid class name and case insensitive filesystem */
public final class C307266Pl {
    public View A00;
    public View A01;
    public View A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public C306276Ln A06;
    public AnonymousClass6P0 A07;
    public AnonymousClass6PD A08;
    public final View A09;
    public final View A0A;
    public final C252063oV A0B;

    public final TextView A00() {
        TextView textView = this.A04;
        if (textView != null) {
            return textView;
        }
        0qQ.A0F("subtitle");
        throw AnonymousClass00P.createAndThrow();
    }

    public C307266Pl(View view, View view2, C252063oV r4) {
        this.A0B = r4;
        this.A0A = view;
        this.A09 = view2;
        r4.EeU(new C307276Pm(this));
    }
}
