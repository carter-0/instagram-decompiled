package X;

import android.graphics.BitmapFactory;
import com.instagram.common.gallery.Medium;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.KsR  reason: case insensitive filesystem */
public abstract class C63158KsR {
    public static final void A00(BitmapFactory.Options options, Medium medium, Integer num, String str) {
        0f9 AEf = 0wj.A01.AEf("PhotoImportCallable_call", 817903989);
        String A03 = medium.A03();
        if (A03 == null) {
            A03 = "null";
        }
        AEf.ABQ("mime_type", A03);
        AEf.ABO(IgReactMediaPickerNativeModule.WIDTH, options.outWidth);
        AEf.ABO(IgReactMediaPickerNativeModule.HEIGHT, options.outHeight);
        AEf.ABQ("source", JYN.A00(num));
        AEf.ABQ("path", medium.A0X);
        AEf.ABR("file_exists", JTQ.A1Z(medium.A0X));
        AEf.ABQ(AnonymousClass000.A00(1313), str);
        AEf.report();
    }
}
