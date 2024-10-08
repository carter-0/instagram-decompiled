package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Wix  reason: case insensitive filesystem */
public final class C19986Wix implements Runnable {
    public final /* synthetic */ U52 A00;

    public C19986Wix(U52 u52) {
        this.A00 = u52;
    }

    public final void run() {
        U52 u52 = this.A00;
        VZD vzd = u52.A03;
        if (vzd != null) {
            String str = vzd.A03;
            Context context = u52.getContext();
            TextView textView = new TextView(context);
            textView.setText(str);
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity(17);
            DbY.A11(textView, textView.getContext());
            JTP.A14(textView, -1, textView.getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width));
            u52.A01 = textView;
            u52.addView(textView, 0);
            0qQ.A07(context);
            U3E u3e = new U3E(context, u52.A00);
            u3e.setBaseColor(vzd.A01);
            u3e.setUnselectedColor(vzd.A02);
            u3e.setTooltipText(vzd.A04);
            JTP.A14(u3e, -1, (int) (((float) (u52.getHeight() - JTT.A05(u3e, R.dimen.account_group_management_clickable_width))) * vzd.A00));
            u52.A02 = u3e;
            u52.addView(u3e, 0);
        }
    }
}
