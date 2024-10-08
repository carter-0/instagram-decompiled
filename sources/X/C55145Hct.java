package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.ui.widget.autowidthtogglebutton.AutoWidthToggleButton;

/* renamed from: X.Hct  reason: case insensitive filesystem */
public abstract class C55145Hct {
    public static final void A00(Context context, C53290Glc glc, AutoWidthToggleButton autoWidthToggleButton, String str) {
        String string;
        String string2;
        DbY.A1S(autoWidthToggleButton, context);
        autoWidthToggleButton.setTextOn(context.getResources().getString(glc.A06));
        autoWidthToggleButton.setTextOff(context.getResources().getString(glc.A05));
        Resources resources = context.getResources();
        int i = glc.A04;
        if (str != null) {
            string = AnonymousClass7TF.A0e(resources, str, i);
        } else {
            string = resources.getString(i);
        }
        autoWidthToggleButton.setContentDescriptionOn(string);
        Resources resources2 = context.getResources();
        int i2 = glc.A03;
        if (str != null) {
            string2 = AnonymousClass7TF.A0e(resources2, str, i2);
        } else {
            string2 = resources2.getString(i2);
        }
        autoWidthToggleButton.setContentDescriptionOff(string2);
    }
}
