package com.facebook.react.modules.i18nmanager;

import X.0qQ;
import X.AnonymousClass7TE;
import X.DbY;
import X.Pxe;
import X.Pxf;
import X.Pxj;
import X.QZK;
import com.facebook.fbreact.specs.NativeI18nManagerSpec;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Locale;
import java.util.Map;

@ReactModule(name = "I18nManager")
public final class I18nManagerModule extends NativeI18nManagerSpec {
    public void allowRTL(boolean z) {
        QZK A0T = Pxe.A0T(this);
        0qQ.A07(A0T);
        Pxj.A13(A0T, "RCTI18nUtil_allowRTL", z);
    }

    public void forceRTL(boolean z) {
        QZK A0T = Pxe.A0T(this);
        0qQ.A07(A0T);
        Pxj.A13(A0T, "RCTI18nUtil_forceRTL", z);
    }

    public Map getTypedExportedConstants() {
        QZK A0T = Pxe.A0T(this);
        Locale locale = Pxf.A0G(A0T).getLocales().get(0);
        I18nUtil i18nUtil = I18nUtil.A00;
        return DbY.A0q("localeIdentifier", locale.toString(), AnonymousClass7TE.A1L("isRTL", Boolean.valueOf(i18nUtil.A01(A0T))), AnonymousClass7TE.A1L("doLeftAndRightSwapInRTL", Boolean.valueOf(i18nUtil.A00(A0T))));
    }

    public void swapLeftAndRightInRTL(boolean z) {
        QZK A0T = Pxe.A0T(this);
        0qQ.A07(A0T);
        Pxj.A13(A0T, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", z);
    }

    public I18nManagerModule(QZK qzk) {
        super(qzk);
    }
}
