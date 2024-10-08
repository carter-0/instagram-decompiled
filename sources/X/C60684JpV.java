package X;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.JpV  reason: case insensitive filesystem */
public final class C60684JpV extends C249703kE {
    public final Button A00;
    public final TextView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60684JpV(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A01 = AnonymousClass7TE.A0d(view, R.id.gallery_section_title);
        this.A00 = (Button) view.findViewById(R.id.gallery_manage_button);
    }

    public final void A00(JWF jwf, C66093MBb mBb) {
        int i;
        int i2;
        String A16;
        0qQ.A0B(jwf, 0);
        TextView textView = this.A01;
        if (textView != null) {
            Context A0S = AnonymousClass7TE.A0S(textView);
            int A0M = AnonymousClass7TE.A0M(jwf.A01);
            if (A0M == 1) {
                i2 = 2131956920;
                A16 = AnonymousClass7TE.A16(A0S, i2);
            } else if (A0M == 0) {
                i2 = 2131961037;
                A16 = AnonymousClass7TE.A16(A0S, i2);
            } else if (A0M == 2) {
                A16 = jwf.A03;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            textView.setText(A16);
        }
        Number number = (Number) jwf.A02;
        if (number != AnonymousClass05K.A00) {
            Button button = this.A00;
            if (button != null) {
                button.setVisibility(0);
                Context A07 = DbS.A07(this);
                int A03 = C51967G9n.A03(number, 0);
                if (A03 == 1) {
                    i = 2131961446;
                } else if (A03 == 2) {
                    i = 2131972975;
                } else if (A03 == 3) {
                    i = 2131972985;
                } else if (A03 == 0) {
                    i = 0;
                } else {
                    throw AnonymousClass7TE.A1K();
                }
                DbX.A13(A07, button, Integer.valueOf(jwf.A00), i);
                LY8.A00(button, 44, number, mBb);
                return;
            }
            return;
        }
        AnonymousClass7TH.A0R(this.A00);
    }
}
