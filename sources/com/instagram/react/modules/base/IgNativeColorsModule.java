package com.instagram.react.modules.base;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.Pxe;
import X.Pxi;
import X.QZK;
import com.facebook.fbreact.specs.NativeIGNativeColorsSpec;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.android.R;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = "IGNativeColors")
public class IgNativeColorsModule extends NativeIGNativeColorsSpec {
    public static final String MODULE_NAME = "IGNativeColors";

    public String getName() {
        return "IGNativeColors";
    }

    public static String parseColorInteger(int i) {
        return String.format("#%06X", AnonymousClass7TF.A1b(i & 16777215));
    }

    public Map getTypedExportedConstants() {
        HashMap A1E = AnonymousClass7TE.A1E();
        QZK A0T = Pxe.A0T(this);
        A1E.put("grey9", Pxi.A0b(A0T, R.color.grey_9));
        A1E.put("grey8", Pxi.A0b(A0T, R.color.gradient_dark));
        A1E.put("grey7", Pxi.A0b(A0T, R.color.gradient_light));
        A1E.put("grey6", Pxi.A0b(A0T, R.color.grey_6));
        A1E.put("grey5", Pxi.A0b(A0T, R.color.grey_5));
        A1E.put("grey4", Pxi.A0b(A0T, R.color.grey_4));
        A1E.put("grey3", Pxi.A0b(A0T, R.color.baseline_neutral_80));
        A1E.put("grey2", Pxi.A0b(A0T, R.color.grey_2));
        A1E.put("grey1", Pxi.A0b(A0T, R.color.grey_1));
        A1E.put("grey0", Pxi.A0b(A0T, R.color.grey_0));
        A1E.put("blue9", Pxi.A0b(A0T, R.color.blue_9));
        A1E.put("blue8", Pxi.A0b(A0T, R.color.blue_8));
        A1E.put("blue7", Pxi.A0b(A0T, R.color.blue_7));
        A1E.put("blue6", Pxi.A0b(A0T, R.color.blue_6));
        A1E.put("blue5", Pxi.A0b(A0T, R.color.badge_color));
        A1E.put("blue4", Pxi.A0b(A0T, R.color.blue_4));
        A1E.put("blue3", Pxi.A0b(A0T, R.color.blue_3));
        A1E.put("blue2", Pxi.A0b(A0T, R.color.blue_2));
        A1E.put("blue1", Pxi.A0b(A0T, R.color.blue_1));
        A1E.put("blue0", Pxi.A0b(A0T, R.color.blue_0));
        A1E.put("red9", Pxi.A0b(A0T, R.color.red_9));
        A1E.put("red8", Pxi.A0b(A0T, R.color.red_8));
        A1E.put("red7", Pxi.A0b(A0T, R.color.red_7));
        A1E.put("red6", Pxi.A0b(A0T, R.color.red_6));
        A1E.put("red5", Pxi.A0b(A0T, R.color.red_5));
        A1E.put("red4", Pxi.A0b(A0T, R.color.red_4));
        A1E.put("red3", Pxi.A0b(A0T, R.color.red_3));
        A1E.put("red2", Pxi.A0b(A0T, R.color.red_2));
        A1E.put("red1", Pxi.A0b(A0T, R.color.red_1));
        A1E.put("red0", Pxi.A0b(A0T, R.color.red_0));
        A1E.put("orange9", Pxi.A0b(A0T, R.color.orange_9));
        A1E.put("orange8", Pxi.A0b(A0T, R.color.orange_8));
        A1E.put("orange7", Pxi.A0b(A0T, R.color.orange_7));
        A1E.put("orange6", Pxi.A0b(A0T, R.color.orange_6));
        A1E.put("orange5", Pxi.A0b(A0T, R.color.clips_gradient_redesign_color_1));
        A1E.put("orange4", Pxi.A0b(A0T, R.color.orange_4));
        A1E.put("orange3", Pxi.A0b(A0T, R.color.orange_3));
        A1E.put("orange2", Pxi.A0b(A0T, R.color.orange_2));
        A1E.put("orange1", Pxi.A0b(A0T, R.color.orange_1));
        A1E.put("orange0", Pxi.A0b(A0T, R.color.orange_0));
        A1E.put("green9", Pxi.A0b(A0T, R.color.green_9));
        A1E.put("green8", Pxi.A0b(A0T, R.color.green_8));
        A1E.put("green7", Pxi.A0b(A0T, R.color.green_7));
        A1E.put("green6", Pxi.A0b(A0T, R.color.green_6));
        A1E.put("green5", Pxi.A0b(A0T, R.color.green_5));
        A1E.put("green4", Pxi.A0b(A0T, R.color.green_4));
        A1E.put("green3", Pxi.A0b(A0T, R.color.green_3));
        A1E.put("green2", Pxi.A0b(A0T, R.color.green_2));
        A1E.put("green1", Pxi.A0b(A0T, R.color.green_0));
        A1E.put("green0", Pxi.A0b(A0T, R.color.green_0));
        return A1E;
    }

    public IgNativeColorsModule(QZK qzk) {
        super(qzk);
    }
}
