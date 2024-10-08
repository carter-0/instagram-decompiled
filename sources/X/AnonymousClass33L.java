package X;

import android.widget.TextView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.33L  reason: invalid class name */
public final class AnonymousClass33L {
    public final AnonymousClass33K A00;

    public AnonymousClass33L(AnonymousClass33K r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final void A00(C53156GjS gjS, 1Xj r7, AnonymousClass3W1 r8) {
        0qQ.A0B(gjS, 0);
        0qQ.A0B(r7, 1);
        0qQ.A0B(r8, 2);
        C46284DTn B4x = r7.A0C.B4x();
        if (B4x != null) {
            TextView textView = gjS.A01;
            textView.setText(B4x.getText());
            textView.getPaint().setFakeBoldText(true);
            TextView textView2 = gjS.A00;
            textView2.setText(B4x.C2W());
            int i = 8;
            if (B4x.C2W() != null) {
                i = 0;
            }
            textView2.setVisibility(i);
            IgdsButton igdsButton = gjS.A02;
            igdsButton.setText(B4x.AYU());
            igdsButton.setVisibility(0);
            r8.A0L(gjS, (Integer) null, false);
            AnonymousClass0fU.A00(new IB7(this, r7, r8), igdsButton);
            C54981HaE.A00(gjS, r8);
        }
    }
}
