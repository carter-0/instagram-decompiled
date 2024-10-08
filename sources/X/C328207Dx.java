package X;

import android.widget.LinearLayout;
import com.facebook.common.messagingui.observableverticaloffsetlayout.ObservableVerticalOffsetFrameLayout;

/* renamed from: X.7Dx  reason: invalid class name and case insensitive filesystem */
public final class C328207Dx extends C328217Dy {
    public final LinearLayout A00;
    public final ObservableVerticalOffsetFrameLayout A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C328207Dx(LinearLayout linearLayout, ObservableVerticalOffsetFrameLayout observableVerticalOffsetFrameLayout) {
        super(observableVerticalOffsetFrameLayout);
        0qQ.A0B(linearLayout, 2);
        this.A01 = observableVerticalOffsetFrameLayout;
        this.A00 = linearLayout;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C328207Dx) {
                C328207Dx r5 = (C328207Dx) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Frame(root=");
        sb.append(this.A01);
        sb.append(", linearLayout=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
