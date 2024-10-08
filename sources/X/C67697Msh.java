package X;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Msh  reason: case insensitive filesystem */
public final class C67697Msh extends FrameLayout implements Checkable {
    public View A00;
    public TextView A01;
    public TextView A02;

    public void setChecked(boolean z) {
        int A04;
        Context context = getContext();
        if (z) {
            A04 = context.getColor(R.color.igds_whatsapp_green);
            View view = this.A00;
            if (view != null) {
                view.setVisibility(0);
            }
        } else {
            A04 = C51968G9o.A04(context);
            AnonymousClass7TH.A0R(this.A00);
        }
        TextView textView = this.A02;
        if (textView != null) {
            AnonymousClass7TE.A1R(textView.getCompoundDrawablesRelative()[0].mutate(), A04);
            this.A02.setTextColor(A04);
        }
        TextView textView2 = this.A01;
        if (textView2 != null) {
            textView2.setTextColor(A04);
        }
    }

    public final boolean isChecked() {
        View view = this.A00;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final void toggle() {
        setChecked(!isChecked());
    }
}
