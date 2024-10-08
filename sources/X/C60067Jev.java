package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.Jev  reason: case insensitive filesystem */
public final class C60067Jev extends LinearLayout implements XBN {
    public static final int[] A03 = {16842912};
    public boolean A00;
    public boolean A01;
    public final Set A02 = new LinkedHashSet(1);

    public final void A9W(MT5 mt5) {
        0qQ.A0B(mt5, 0);
        this.A02.add(mt5);
    }

    public final void EEF(MT5 mt5) {
        0qQ.A0B(mt5, 0);
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
        0qQ.A0A(onCreateDrawableState);
        return onCreateDrawableState;
    }

    public void setChecked(boolean z) {
        if (this.A01 != z) {
            this.A01 = z;
            refreshDrawableState();
            if (!this.A00) {
                this.A00 = true;
                for (MT5 D1Y : this.A02) {
                    D1Y.D1Y(this, z);
                }
                this.A00 = false;
            }
        }
    }

    public C60067Jev(Context context) {
        super(context);
        DbV.A0D(this).inflate(R.layout.birthday_row, this, true);
        setGravity(16);
        setPadding(0, 0, 0, getResources().getDimensionPixelSize(R.dimen.asset_picker_static_sticker_last_row_padding));
        setOnClickListener(new C64273LXz(this, 22));
    }

    public final void setPrimaryText(String str) {
        DbX.A1E(this, str, R.id.primary_text);
    }

    public final void setSecondaryText(String str) {
        DbX.A1E(this, str, R.id.secondary_text);
    }

    public final void toggle() {
        if (!isChecked()) {
            setChecked(!this.A01);
        }
    }
}
