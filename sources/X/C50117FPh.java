package X;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: X.FPh  reason: case insensitive filesystem */
public final class C50117FPh implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C306866Nv A01;

    public C50117FPh(Context context, C306866Nv r2) {
        this.A01 = r2;
        this.A00 = context;
    }

    public final void onGlobalLayout() {
        int A02;
        int i;
        C306866Nv r1 = this.A01;
        LinearLayout linearLayout = r1.A07;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        0qQ.A0C(layoutParams, C273654mx.A00(3));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        TextView textView = r1.A09;
        int lineCount = textView.getLineCount();
        Context context = this.A00;
        if (lineCount == 2) {
            0qQ.A0A(context);
            A02 = DbS.A02(context, 8);
            0qQ.A0A(context);
            i = 10;
        } else {
            0qQ.A0A(context);
            A02 = DbS.A02(context, 14);
            0qQ.A0A(context);
            i = 4;
        }
        marginLayoutParams.setMargins(0, A02, 0, DbS.A02(context, i));
        linearLayout.setLayoutParams(marginLayoutParams);
        textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
