package com.facebook.fbreact.i18n;

import X.0qQ;
import X.13s;
import X.13t;
import X.1UR;
import X.AnonymousClass7TE;
import X.C66582MXn;
import X.Pxe;
import X.QZK;
import X.RH1;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.facebook.fbreact.specs.NativeI18nSpec;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.module.annotations.ReactModule;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@ReactModule(name = "I18n")
public class FbReactI18nModule extends NativeI18nSpec {
    public static final String NAME = "I18n";
    public final 13t mLocales;

    public String getName() {
        return "I18n";
    }

    public String getOverrideContent(String str) {
        return null;
    }

    public Map getTypedExportedConstants() {
        ReactMarker.logMarker(RH1.A0H);
        13s r3 = this.mLocales;
        HashMap A0x = C66582MXn.A0x(r3);
        Locale AcD = r3.AcD();
        A0x.put("localeIdentifier", AcD.toString());
        A0x.put("localeCountryCode", AcD.getCountry());
        13s r32 = r3;
        Locale locale = (Locale) r32.A01.get();
        if (locale == null) {
            locale = r32.C39(r32.AcD());
        }
        A0x.put("fbLocaleIdentifier", 1UR.A01(locale));
        HashMap A1E = AnonymousClass7TE.A1E();
        NumberFormat instance = NumberFormat.getInstance(AcD);
        0qQ.A0C(instance, "null cannot be cast to non-null type java.text.DecimalFormat");
        DecimalFormatSymbols instance2 = DecimalFormatSymbols.getInstance(AcD);
        A1E.put("decimalSeparator", String.valueOf(instance2.getDecimalSeparator()));
        A1E.put("numberDelimiter", String.valueOf(instance2.getGroupingSeparator()));
        A1E.put("minDigitsForThousandsSeparator", Integer.valueOf(((DecimalFormat) instance).getGroupingSize()));
        A0x.put("FallbackNumberFormatConfig", A1E);
        ReactMarker.logMarker(RH1.A0G);
        return A0x;
    }

    public FbReactI18nModule(QZK qzk, 13t r2) {
        super(qzk);
        this.mLocales = r2;
    }

    public void setLocale(String str) {
        Locale forLanguageTag = Locale.forLanguageTag(str);
        13s r1 = this.mLocales;
        synchronized (r1) {
            r1.A01.set(forLanguageTag);
        }
        Locale.setDefault(forLanguageTag);
        Resources resources = Pxe.A0T(this).getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(forLanguageTag);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }
}
