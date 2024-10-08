package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C21056XCh;
import X.C41845B3m;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;

public class CowatchLoggingMetadata {
    public final String promotionSource;
    public final int sectionItemRenderingStyle;
    public final int sectionRenderingStyle;
    public final String tabLoggingName;

    public static native CowatchLoggingMetadata createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchLoggingMetadata)) {
                return false;
            }
            CowatchLoggingMetadata cowatchLoggingMetadata = (CowatchLoggingMetadata) obj;
            String str = this.tabLoggingName;
            String str2 = cowatchLoggingMetadata.tabLoggingName;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.promotionSource;
            String str4 = cowatchLoggingMetadata.promotionSource;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (!(this.sectionRenderingStyle == cowatchLoggingMetadata.sectionRenderingStyle && this.sectionItemRenderingStyle == cowatchLoggingMetadata.sectionItemRenderingStyle)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((((C66583MXo.A01(AnonymousClass7TG.A0E(this.tabLoggingName)) + C41845B3m.A00(this.promotionSource)) * 31) + this.sectionRenderingStyle) * 31) + this.sectionItemRenderingStyle;
    }

    public CowatchLoggingMetadata(String str, String str2, int i, int i2) {
        this.tabLoggingName = str;
        this.promotionSource = str2;
        this.sectionRenderingStyle = i;
        this.sectionItemRenderingStyle = i2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CowatchLoggingMetadata{tabLoggingName=");
        A1A.append(this.tabLoggingName);
        A1A.append(",promotionSource=");
        A1A.append(this.promotionSource);
        A1A.append(",sectionRenderingStyle=");
        A1A.append(this.sectionRenderingStyle);
        A1A.append(",sectionItemRenderingStyle=");
        return C21056XCh.A0A(A1A, this.sectionItemRenderingStyle);
    }
}
