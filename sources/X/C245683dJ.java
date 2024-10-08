package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.Map;

/* renamed from: X.3dJ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C245683dJ implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ 2T4 A02;

    public /* synthetic */ C245683dJ(2T4 r1, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r1;
    }

    public final Object invoke(Object obj) {
        int i = this.A00;
        int i2 = this.A01;
        2T4 r2 = this.A02;
        Map map = (Map) obj;
        map.put("version", Integer.valueOf(i));
        map.put("source", C392969vg.A00(i2));
        map.put(IgReactMediaPickerNativeModule.WIDTH, Integer.valueOf(r2.A0C));
        map.put(IgReactMediaPickerNativeModule.HEIGHT, Integer.valueOf(r2.A09));
        return C60340gF.A00;
    }
}
