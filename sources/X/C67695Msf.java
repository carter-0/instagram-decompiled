package X;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.TextView;

/* renamed from: X.Msf  reason: case insensitive filesystem */
public final class C67695Msf extends FrameLayout implements Checkable {
    public View A00;
    public TextView A01;

    public void setChecked(boolean z) {
        int A04;
        Context context = getContext();
        if (z) {
            A04 = context.getColor(2Yu.A0D(context));
            this.A00.setVisibility(0);
        } else {
            A04 = C51968G9o.A04(context);
            this.A00.setVisibility(8);
        }
        AnonymousClass7TE.A1R(this.A01.getCompoundDrawablesRelative()[0].mutate(), A04);
        this.A01.setTextColor(A04);
    }

    public final boolean isChecked() {
        return AnonymousClass7TF.A1Q(this.A00.getVisibility());
    }

    public final void toggle() {
        setChecked(!isChecked());
    }
}
