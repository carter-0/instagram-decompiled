package X;

import android.view.ViewTreeObserver;
import android.widget.TextView;

/* renamed from: X.5BF  reason: invalid class name */
public final class AnonymousClass5BF implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AnonymousClass3N8 A00;

    public AnonymousClass5BF(AnonymousClass3N8 r1) {
        this.A00 = r1;
    }

    public final void onGlobalLayout() {
        AnonymousClass3N8 r3 = this.A00;
        if (r3.A04().getLayout() != null && r3.A04().getLayout().getEllipsisCount(0) == 0) {
            TextView A04 = r3.A04();
            StringBuilder sb = new StringBuilder();
            sb.append(r3.A04().getText());
            sb.append(' ');
            A04.setText(sb.toString());
            r3.A04().getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }
}
