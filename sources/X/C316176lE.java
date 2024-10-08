package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.6lE  reason: invalid class name and case insensitive filesystem */
public final class C316176lE implements C2365734g {
    public final /* synthetic */ C316166lD A00;

    public C316176lE(C316166lD r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void DKS(View view) {
        TextView textView = (TextView) view;
        0qQ.A0B(textView, 0);
        C316166lD r1 = this.A00;
        r1.A01 = textView;
        Context context = textView.getContext();
        0qQ.A0B(context, 0);
        r1.A00 = context;
        Context A002 = r1.A00();
        boolean A02 = 0mk.A02(A002);
        int i = R.drawable.chevron_right;
        if (A02) {
            i = R.drawable.chevron_left;
        }
        Drawable drawable = A002.getDrawable(i);
        RectF rectF = 0nA.A01;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
    }
}
