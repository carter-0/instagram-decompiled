package X;

import android.widget.TextView;

/* renamed from: X.MzG  reason: case insensitive filesystem */
public final class C68049MzG extends C249703kE {
    public final TextView A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68049MzG(TextView textView) {
        super(textView);
        0qQ.A0B(textView, 1);
        this.A00 = textView;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C68049MzG) && 0qQ.A0K(this.A00, ((C68049MzG) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
