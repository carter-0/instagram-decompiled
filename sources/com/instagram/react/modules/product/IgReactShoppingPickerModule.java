package com.instagram.react.modules.product;

import X.0lg;
import X.QZK;
import com.facebook.fbreact.specs.NativeIGShoppingPickerModuleSpec;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "IGShoppingPickerModule")
public class IgReactShoppingPickerModule extends NativeIGShoppingPickerModuleSpec {
    public static final String MODULE_NAME = "IGShoppingPickerModule";
    public static final String PICKER_VALUE_SELECTED = "IGShoppingPickerIndexSelected";
    public final 0lg mSession;

    public String getName() {
        return "IGShoppingPickerModule";
    }

    public IgReactShoppingPickerModule(QZK qzk, 0lg r2) {
        super(qzk);
        this.mSession = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r10 >= ((double) r4.size())) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void openPicker(java.lang.String r8, com.facebook.react.bridge.ReadableArray r9, double r10) {
        /*
            r7 = this;
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r0 = r9.toArrayList()
            java.util.Iterator r1 = r0.iterator()
        L_0x000c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0016
            X.Pxj.A1T(r4, r1)
            goto L_0x000c
        L_0x0016:
            r1 = 0
            r5 = r10
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0027
            int r0 = r4.size()
            double r2 = (double) r0
            int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            X.17k.A0E(r0)
            X.TK2 r1 = new X.TK2
            r2 = r7
            r3 = r8
            r1.<init>(r2, r3, r4, r5)
            X.C18773W0w.A01(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.react.modules.product.IgReactShoppingPickerModule.openPicker(java.lang.String, com.facebook.react.bridge.ReadableArray, double):void");
    }
}
