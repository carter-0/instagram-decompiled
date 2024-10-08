package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.Jew  reason: case insensitive filesystem */
public final class C60068Jew extends LinearLayout implements XBN {
    public static final int[] A03 = {16842912};
    public boolean A00;
    public boolean A01;
    public final Set A02 = new LinkedHashSet(1);

    public C60068Jew(Context context) {
        super(context);
        DbY.A0z(DbV.A0D(this).inflate(R.layout.new_user_activation_privacy_checkable, this, true));
        setGravity(16);
        setOrientation(0);
        Resources resources = getResources();
        setPadding(resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
        setOnClickListener(new LYB((Object) this, 59));
    }

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

    public final void setLeftIcon(int i) {
        DbU.A0F(this, R.id.checkbox_image).setImageResource(i);
    }

    public final void setSubTitleText(int i) {
        DbU.A0G(this, R.id.checkbox_subtitle).setText(i);
    }

    public final void setTitleText(int i) {
        DbU.A0G(this, R.id.checkbox_title).setText(i);
    }

    public final void toggle() {
        if (!isChecked()) {
            setChecked(!this.A01);
        }
    }
}
