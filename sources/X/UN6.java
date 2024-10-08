package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGNativeSmartTextOverlayFontStyleEnum;
import com.instagram.api.schemas.IGNativeSmartTextOverlayStylingAlignment;
import com.instagram.api.schemas.IGNativeSmartTextOverlayStylingFontStyle;
import com.instagram.api.schemas.IGNativeSmartTextOverlayTextAlignmentEnum;

public final class UN6 extends AnonymousClass0T0 implements C21038XAr {
    public final IGNativeSmartTextOverlayFontStyleEnum A00;
    public final IGNativeSmartTextOverlayStylingAlignment A01;
    public final IGNativeSmartTextOverlayStylingFontStyle A02;
    public final IGNativeSmartTextOverlayTextAlignmentEnum A03;
    public final Float A04;
    public final Integer A05;
    public final Integer A06;
    public final String A07;
    public final String A08;

    public final UN6 F4n() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UN6) {
                UN6 un6 = (UN6) obj;
                if (this.A01 != un6.A01 || !0qQ.A0K(this.A07, un6.A07) || !0qQ.A0K(this.A08, un6.A08) || !0qQ.A0K(this.A05, un6.A05) || this.A02 != un6.A02 || !0qQ.A0K(this.A04, un6.A04) || !0qQ.A0K(this.A06, un6.A06) || this.A03 != un6.A03 || this.A00 != un6.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final IGNativeSmartTextOverlayStylingAlignment Aai() {
        return this.A01;
    }

    public final String B75() {
        return this.A08;
    }

    public final Integer B7A() {
        return this.A05;
    }

    public final IGNativeSmartTextOverlayStylingFontStyle B7B() {
        return this.A02;
    }

    public final Float BMh() {
        return this.A04;
    }

    public final Integer BPG() {
        return this.A06;
    }

    public final IGNativeSmartTextOverlayTextAlignmentEnum C4q() {
        return this.A03;
    }

    public final IGNativeSmartTextOverlayFontStyleEnum C59() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGNativeSmartTextOverlayStyling", V7S.A00(this));
    }

    public final String getBackgroundColor() {
        return this.A07;
    }

    public final int hashCode() {
        return (((((((((((((((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public UN6(IGNativeSmartTextOverlayFontStyleEnum iGNativeSmartTextOverlayFontStyleEnum, IGNativeSmartTextOverlayStylingAlignment iGNativeSmartTextOverlayStylingAlignment, IGNativeSmartTextOverlayStylingFontStyle iGNativeSmartTextOverlayStylingFontStyle, IGNativeSmartTextOverlayTextAlignmentEnum iGNativeSmartTextOverlayTextAlignmentEnum, Float f, Integer num, Integer num2, String str, String str2) {
        this.A01 = iGNativeSmartTextOverlayStylingAlignment;
        this.A07 = str;
        this.A08 = str2;
        this.A05 = num;
        this.A02 = iGNativeSmartTextOverlayStylingFontStyle;
        this.A04 = f;
        this.A06 = num2;
        this.A03 = iGNativeSmartTextOverlayTextAlignmentEnum;
        this.A00 = iGNativeSmartTextOverlayFontStyleEnum;
    }
}
