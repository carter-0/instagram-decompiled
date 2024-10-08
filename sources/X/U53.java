package X;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;

public final class U53 extends LinearLayout {
    public boolean A00;

    public final void A00(int i) {
        View findViewById = findViewById(R.id.special_requirement_warning_layout);
        TextView A0d = AnonymousClass7TE.A0d(this, R.id.special_requirement_warning_text);
        if (findViewById != null && A0d != null) {
            findViewById.setVisibility(0);
            Dbb.A0l(DbU.A05(this), A0d, i);
        }
    }

    public final boolean getCheckBoxCheckState() {
        return ((CompoundButton) AnonymousClass7TE.A0b(this, R.id.promote_row_checkbox)).isChecked();
    }

    public final void setCheckBox(boolean z) {
        ((CompoundButton) AnonymousClass7TE.A0b(this, R.id.promote_row_checkbox)).setChecked(z);
    }

    public final void setPrimaryText(int i) {
        TextView A0d = AnonymousClass7TE.A0d(this, R.id.primary_text);
        if (A0d != null) {
            A0d.setText(i);
        }
    }

    public final void setSecondaryText(int i) {
        TextView A0d = AnonymousClass7TE.A0d(this, R.id.secondary_text);
        if (A0d != null) {
            A0d.setText(i);
        }
    }
}
