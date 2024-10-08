package X;

import android.content.Context;
import android.widget.TextView;

/* renamed from: X.PbB  reason: case insensitive filesystem */
public final class C73352PbB implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ TextView A01;
    public final /* synthetic */ C61419K6q A02;
    public final /* synthetic */ String A03;

    public C73352PbB(Context context, TextView textView, C61419K6q k6q, String str) {
        this.A01 = textView;
        this.A02 = k6q;
        this.A00 = context;
        this.A03 = str;
    }

    public final void run() {
        StringBuilder A1A;
        StringBuilder A0n;
        TextView textView = this.A01;
        int i = 1;
        if (!textView.isLaidOut()) {
            C61419K6q k6q = this.A02;
            Context context = this.A00;
            String str = this.A03;
            textView.setVisibility(0);
            textView.post(new C73352PbB(context, textView, k6q, str));
            return;
        }
        int width = textView.getWidth();
        Context context2 = this.A00;
        String str2 = this.A03;
        String A0c = DbY.A0c(context2, str2, 2131959331);
        float f = (float) width;
        if (textView.getPaint().measureText(A0c) > f) {
            String A16 = AnonymousClass7TE.A16(context2, 2131959334);
            String A162 = AnonymousClass7TE.A16(context2, 2131959333);
            String A163 = AnonymousClass7TE.A16(context2, 2131959332);
            float measureText = textView.getPaint().measureText(A16) + textView.getPaint().measureText(A162) + textView.getPaint().measureText(A163);
            while (true) {
                if (i > DbX.A05(str2)) {
                    break;
                } else if (textView.getPaint().measureText(str2, 0, i) > f - measureText) {
                    i--;
                    break;
                } else {
                    i++;
                }
            }
            if (!0mk.A01() || 0mk.A03(str2)) {
                A1A = AnonymousClass7TE.A1A();
                A1A.append(00R.A03(str2, i));
                A1A.append(A163);
            } else {
                A1A = AnonymousClass7TF.A0n(A163);
                A1A.append(00R.A03(str2, i));
            }
            String obj = A1A.toString();
            if (0mk.A01()) {
                A0n = AnonymousClass7TF.A0n(A162);
                A0n.append(obj);
                A0n.append(A16);
            } else {
                A0n = AnonymousClass7TF.A0n(A16);
                A0n.append(obj);
                A0n.append(A162);
            }
            A0c = A0n.toString();
        }
        textView.setText(A0c);
    }
}
