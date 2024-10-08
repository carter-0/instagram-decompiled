package com.facebook.react.modules.debug;

import X.0Sd;
import X.0qQ;
import X.AnonymousClass7TF;
import X.Pxe;
import X.QZJ;
import X.QZK;
import com.facebook.fbreact.specs.NativeSourceCodeSpec;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Map;

@ReactModule(name = "SourceCode")
public final class SourceCodeModule extends NativeSourceCodeSpec {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SourceCodeModule(QZK qzk) {
        super(qzk);
        0qQ.A0B(qzk, 1);
    }

    public Map getTypedExportedConstants() {
        String str;
        CatalystInstance catalystInstance = ((QZJ) Pxe.A0T(this)).A00;
        if (catalystInstance == null) {
            str = null;
        } else {
            str = ((CatalystInstanceImpl) catalystInstance).mSourceURL;
        }
        0Sd.A01(str, "No source URL loaded, have you initialised the instance?");
        return AnonymousClass7TF.A0w("scriptURL", str);
    }
}
