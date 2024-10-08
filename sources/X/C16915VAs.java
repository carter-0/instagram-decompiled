package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.canvas.view.widget.RichTextView;

/* renamed from: X.VAs  reason: case insensitive filesystem */
public abstract class C16915VAs {
    public static final void A00(C15437Ucn ucn, C14849UCd uCd, boolean z) {
        int i;
        AnonymousClass7TG.A1N(uCd, ucn);
        RichTextView richTextView = uCd.A01;
        richTextView.setText(ucn.A00);
        X1G x1g = ucn.A01;
        if (x1g != null) {
            richTextView.setTextDescriptor(x1g);
            if (z) {
                richTextView.setMinLines(2);
            }
            C17487VXq C25 = ucn.C25();
            if (C25 != null) {
                View view = uCd.A00;
                C18179Vmt.A01(view, C25.A01);
                int i2 = C25.A00;
                0qQ.A0B(view, 0);
                view.setBackgroundColor(i2);
                switch (C25.A02.intValue()) {
                    case 0:
                        i = 3;
                        break;
                    case 1:
                        i = 1;
                        break;
                    default:
                        i = 5;
                        break;
                }
                richTextView.setGravity(i);
                ViewGroup.LayoutParams layoutParams = richTextView.getLayoutParams();
                0qQ.A0C(layoutParams, AnonymousClass000.A00(1));
                ((FrameLayout.LayoutParams) layoutParams).gravity = i;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
