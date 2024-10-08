package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.V5j  reason: case insensitive filesystem */
public abstract class C16776V5j {
    public static W2K[] A00(C17399VUa vUa, VXH vxh) {
        int i;
        int i2 = vUa.A00;
        C18556Vu8[] vu8Arr = vUa.A02;
        W2K[] w2kArr = new W2K[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            C18556Vu8 vu8 = vu8Arr[i3];
            W2K w2k = vu8.A00;
            if (w2k == null) {
                String str = vu8.A02;
                if (str.equalsIgnoreCase(IgReactMediaPickerNativeModule.WIDTH)) {
                    i = vxh.A02;
                } else if (str.equalsIgnoreCase(IgReactMediaPickerNativeModule.HEIGHT)) {
                    i = vxh.A01;
                } else if (str.equalsIgnoreCase(TraceFieldType.Duration)) {
                    i = vxh.A00 / IgNetworkConsentStorage.MAX_ENTRIES;
                } else {
                    w2k = vu8.A01.A00(vu8.A02);
                }
                w2k = new W2K(i);
            }
            w2kArr[i3] = w2k;
        }
        return w2kArr;
    }
}
