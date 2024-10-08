package X;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.Locale;

/* renamed from: X.4Ci  reason: invalid class name and case insensitive filesystem */
public abstract class C262154Ci extends Resources implements C262164Cj {
    public static boolean A01;
    public Resources A00;

    public static Configuration A00(Configuration configuration) {
        int i;
        if (configuration == null) {
            return null;
        }
        Configuration configuration2 = new Configuration(configuration);
        int i2 = 2X1.A00;
        if (i2 == 2) {
            i = 32;
        } else if (i2 == 1) {
            i = 16;
        } else {
            i = Resources.getSystem().getConfiguration().uiMode & 48;
        }
        int i3 = configuration2.uiMode;
        if (i == (i3 & 48)) {
            return configuration2;
        }
        configuration2.uiMode = i | (i3 & -49);
        return configuration2;
    }

    public void A03(Locale locale) {
        Configuration configuration = this.A00.getConfiguration();
        if (!locale.equals(configuration.locale)) {
            configuration.locale = locale;
            Resources resources = this.A00;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
        configuration.setLayoutDirection(locale);
        Locale.setDefault(locale);
        Configuration configuration2 = this.A00.getConfiguration();
        DisplayMetrics displayMetrics = this.A00.getDisplayMetrics();
        Configuration configuration3 = this.A00.getConfiguration();
        DisplayMetrics displayMetrics2 = this.A00.getDisplayMetrics();
        if (!configuration2.equals(configuration3)) {
            configuration2.setLocale(configuration3.locale);
        } else {
            configuration2 = configuration3;
        }
        if (displayMetrics.equals(getDisplayMetrics())) {
            displayMetrics = displayMetrics2;
        }
        updateConfiguration(configuration2, displayMetrics);
    }

    public final void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        if (A01) {
            Resources resources = this.A00;
            if (resources != null) {
                resources.updateConfiguration(A00(resources.getConfiguration()), resources.getDisplayMetrics());
            }
            configuration = A00(configuration);
        }
        super.updateConfiguration(configuration, displayMetrics);
    }

    public final void A01(Configuration configuration) {
        if (!configuration.equals(getConfiguration())) {
            configuration.setLocale(getConfiguration().locale);
            updateConfiguration(configuration, getDisplayMetrics());
        }
    }

    public final void A02(Resources resources, int i) {
        if (0yU.A07(AnonymousClass0yP.A00(36326133309912608L))) {
            this.A00 = resources;
        }
        if (!A01 && i != getConfiguration().uiMode) {
            Configuration configuration = getConfiguration();
            configuration.uiMode = i;
            updateConfiguration(configuration, getDisplayMetrics());
        }
    }
}
