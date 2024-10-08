package com.facebook.rsys.cowatch.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C66583MXo;
import X.C66584MXp;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;

public class CowatchCaptionLocale {
    public static 2LV CONVERTER = C71546Omh.A00(27);
    public static long sMcfTypeId;
    public final String captionsUrl;
    public final String locale;
    public final String localizedCountry;
    public final String localizedCreationMethod;
    public final String localizedLanguage;

    public static native CowatchCaptionLocale createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchCaptionLocale)) {
                return false;
            }
            CowatchCaptionLocale cowatchCaptionLocale = (CowatchCaptionLocale) obj;
            if (!this.locale.equals(cowatchCaptionLocale.locale)) {
                return false;
            }
            String str = this.localizedLanguage;
            String str2 = cowatchCaptionLocale.localizedLanguage;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.localizedCountry;
            String str4 = cowatchCaptionLocale.localizedCountry;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.localizedCreationMethod;
            String str6 = cowatchCaptionLocale.localizedCreationMethod;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.captionsUrl;
            String str8 = cowatchCaptionLocale.captionsUrl;
            if (str7 != null) {
                return str7.equals(str8);
            }
            if (str8 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return ((((((C66583MXo.A06(this.locale) + AnonymousClass7TG.A0E(this.localizedLanguage)) * 31) + AnonymousClass7TG.A0E(this.localizedCountry)) * 31) + AnonymousClass7TG.A0E(this.localizedCreationMethod)) * 31) + C41845B3m.A00(this.captionsUrl);
    }

    public CowatchCaptionLocale(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        this.locale = str;
        this.localizedLanguage = str2;
        this.localizedCountry = str3;
        this.localizedCreationMethod = str4;
        this.captionsUrl = str5;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CowatchCaptionLocale{locale=");
        A1A.append(this.locale);
        A1A.append(",localizedLanguage=");
        A1A.append(this.localizedLanguage);
        A1A.append(",localizedCountry=");
        A1A.append(this.localizedCountry);
        A1A.append(",localizedCreationMethod=");
        A1A.append(this.localizedCreationMethod);
        A1A.append(",captionsUrl=");
        return C66584MXp.A0a(this.captionsUrl, A1A);
    }
}
