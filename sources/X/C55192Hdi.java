package X;

import android.app.Activity;
import com.instagram.wonderwall.model.WallMenuConfig;
import com.instagram.wonderwall.model.WallText;

/* renamed from: X.Hdi  reason: case insensitive filesystem */
public abstract class C55192Hdi {
    public static final C331157Pu A00(Activity activity, C331127Pr r4, WallMenuConfig wallMenuConfig) {
        WallText wallText = wallMenuConfig.A00;
        if (wallText != null) {
            r4.A0d = C55191Hdh.A00(activity, wallText);
        }
        C331157Pu A00 = r4.A00();
        C54097GzS gzS = new C54097GzS();
        DbZ.A1B(gzS, AnonymousClass000.A00(4216), wallMenuConfig);
        return A00.A02(activity, gzS);
    }
}
