package com.facebook.rsys.mediasync.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C66581MXm;
import X.C66583MXo;
import X.C66584MXp;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;

public class CaptionLocales {
    public static 2LV CONVERTER = C71546Omh.A00(49);
    public static long sMcfTypeId;
    public final String captionsUrl;
    public final String locale;
    public final String localizedCountry;
    public final String localizedCreationMethod;
    public final String localizedLanguage;

    public static native CaptionLocales createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CaptionLocales)) {
                return false;
            }
            CaptionLocales captionLocales = (CaptionLocales) obj;
            if (!this.locale.equals(captionLocales.locale) || !this.localizedLanguage.equals(captionLocales.localizedLanguage)) {
                return false;
            }
            String str = this.localizedCountry;
            String str2 = captionLocales.localizedCountry;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.localizedCreationMethod;
            String str4 = captionLocales.localizedCreationMethod;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            return this.captionsUrl.equals(captionLocales.captionsUrl);
        }
    }

    public int hashCode() {
        int A06 = C66583MXo.A06(this.locale);
        return C41845B3m.A01(this.captionsUrl, (((AnonymousClass7TF.A08(this.localizedLanguage, A06) + AnonymousClass7TG.A0E(this.localizedCountry)) * 31) + C41845B3m.A00(this.localizedCreationMethod)) * 31);
    }

    public CaptionLocales(String str, String str2, String str3, String str4, String str5) {
        C66581MXm.A1R(str, str2, str5);
        this.locale = str;
        this.localizedLanguage = str2;
        this.localizedCountry = str3;
        this.localizedCreationMethod = str4;
        this.captionsUrl = str5;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CaptionLocales{locale=");
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
