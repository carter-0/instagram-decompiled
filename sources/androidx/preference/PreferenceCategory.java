package androidx.preference;

import X.C18666VwO;
import X.UEU;
import android.content.Context;
import android.util.AttributeSet;
import com.instagram.android.R;

public class PreferenceCategory extends PreferenceGroup {
    public final boolean A0J() {
        return false;
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C18666VwO.A00(context, R.attr.preferenceCategoryStyle, 16842892));
    }

    public final void A0D(UEU ueu) {
        super.A0D(ueu);
        ueu.itemView.setAccessibilityHeading(true);
    }

    public final boolean A0K() {
        return !super.A0J();
    }
}
