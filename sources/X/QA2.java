package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;
import java.util.LinkedHashSet;
import java.util.Set;

public final class QA2 extends LinearLayout implements XBN {
    public static final int[] A03 = {16842912};
    public boolean A00;
    public boolean A01;
    public final Set A02 = new LinkedHashSet(1);

    public final void A9W(MT5 mt5) {
        this.A02.add(mt5);
    }

    public final void EEF(MT5 mt5) {
        this.A02.remove(mt5);
    }

    public final boolean isChecked() {
        return this.A01;
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A03);
        }
        return onCreateDrawableState;
    }

    public void setChecked(boolean z) {
        if (this.A01 != z) {
            this.A01 = z;
            refreshDrawableState();
            if (!this.A00) {
                this.A00 = true;
                for (MT5 D1Y : this.A02) {
                    D1Y.D1Y(this, this.A01);
                }
                this.A00 = false;
            }
        }
    }

    public QA2(Context context) {
        super(context);
        DbV.A0D(this).inflate(R.layout.layout_radio_button_with_secondary_text_and_button, this, true);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setGravity(16);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        setOnClickListener(new C11495SbI(this, 24));
    }

    public void setExtraButtonText(String str) {
        DbU.A0G(this, R.id.extra_btn).setText(str);
    }

    public void setSubtitle(String str) {
        Dba.A05(this).setText(str);
    }

    public void setTitle(String str) {
        Dba.A06(this).setText(str);
    }

    public final void toggle() {
        if (!isChecked()) {
            setChecked(!this.A01);
        }
    }
}
