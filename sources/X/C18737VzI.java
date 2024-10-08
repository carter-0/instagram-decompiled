package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VzI  reason: case insensitive filesystem */
public final class C18737VzI {
    public String A00;
    public final ViewGroup A01;
    public final A8W A02;
    public final List A03;
    public final List A04 = new ArrayList();
    public final TextView A05;
    public final C17217VMv A06 = new C17217VMv(this);

    public static void A00(C18737VzI vzI) {
        for (C17455VWi vWi : vzI.A04) {
            if (!vWi.A02) {
                ViewGroup viewGroup = vzI.A01;
                C17492VXv vXv = new C17492VXv(DbU.A0A(DbX.A0F(viewGroup, 0), viewGroup, R.layout.product_sticker_token, false));
                C17217VMv vMv = vzI.A06;
                0qQ.A0B(vMv, 2);
                Context context = vXv.A00;
                AnonymousClass0qq A002 = AnonymousClass0qo.A00(context);
                View view = vXv.A01;
                view.setSelected(vWi.A00);
                int i = 2131969861;
                if (vWi.A00) {
                    i = 2131969857;
                }
                String str = vWi.A01;
                C13989Tnp.A0z(context, view, str, i);
                TextView textView = vXv.A03;
                textView.setText(AnonymousClass7TG.A0o(str));
                textView.setTypeface(A002.A02(0qm.A0V));
                AnonymousClass3NG r2 = new AnonymousClass3NG(view);
                r2.A04 = new C15846UjW(1, vXv, vMv, vWi);
                r2.A07 = true;
                r2.A0C = true;
                r2.A00();
                viewGroup.addView(view);
            }
        }
    }

    public static void A01(C18737VzI vzI) {
        int i;
        boolean z = true;
        boolean z2 = true;
        for (C17455VWi vWi : vzI.A04) {
            if (!vWi.A02) {
                if (vWi.A00) {
                    z2 = false;
                } else {
                    z = false;
                }
            }
        }
        TextView textView = vzI.A05;
        if (z) {
            i = 2131969860;
        } else {
            i = 2131969859;
            if (z2) {
                i = 2131969858;
            }
        }
        textView.setText(i);
    }

    public C18737VzI(View view, A8W a8w) {
        this.A02 = a8w;
        this.A01 = DbU.A0C(view, R.id.product_sticker_tokens_container);
        this.A05 = DbU.A0G(view, R.id.product_sticker_tokens_title);
        this.A03 = new ArrayList();
    }
}
