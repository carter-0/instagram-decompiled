package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.Jex  reason: case insensitive filesystem */
public final class C60069Jex extends LinearLayout implements XBN {
    public static final int[] A03 = {16842912};
    public boolean A00;
    public boolean A01;
    public final Set A02 = new LinkedHashSet(1);

    public C60069Jex(Context context) {
        super(context);
        DbY.A0z(DbV.A0D(this).inflate(R.layout.layout_cta_selector_radio_button, this, true));
        setGravity(16);
        int A0B = AnonymousClass7TE.A0B(getResources());
        setPadding(A0B, 0, A0B, 0);
        setOnClickListener(new LYB((Object) this, 10));
    }

    public final void A9W(MT5 mt5) {
        0qQ.A0B(mt5, 0);
        this.A02.add(mt5);
    }

    public final void EEF(MT5 mt5) {
        0qQ.A0B(mt5, 0);
        this.A02.remove(mt5);
    }

    public final void setContentDescription(C266444Yx r3) {
        0qQ.A0B(r3, 0);
        requireViewById(R.id.cta_selector_radio_button_view).setContentDescription(C66909Mes.A00(AnonymousClass7TE.A0S(this), r3));
    }

    public final void setSubTitleText(C266444Yx r3) {
        0qQ.A0B(r3, 0);
        DbU.A0G(this, R.id.cta_selector_radio_button_subtitle).setText(C66909Mes.A00(AnonymousClass7TE.A0S(this), r3));
    }

    public final void setTitleText(C266444Yx r3) {
        0qQ.A0B(r3, 0);
        DbU.A0G(this, R.id.cta_selector_radio_button_title).setText(C66909Mes.A00(AnonymousClass7TE.A0S(this), r3));
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

    public final void setMetadataText(String str) {
        DbX.A1E(this, str, R.id.cta_selector_radio_button_metadata);
    }

    public final void toggle() {
        if (!isChecked()) {
            setChecked(!this.A01);
        }
    }
}
