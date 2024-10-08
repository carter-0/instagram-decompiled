package X;

import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Vmv  reason: case insensitive filesystem */
public final class C18181Vmv {
    public static final WritableNativeArray A00(Set set) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C66632Ma1 ma1 = (C66632Ma1) it.next();
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("pk", Double.parseDouble(ma1.A06().getId()));
            writableNativeMap.putBoolean("is_verified", ma1.A06().isVerified());
            writableNativeMap.putBoolean("is_private", AnonymousClass7TF.A1W(ma1.A06().A0N(), AnonymousClass05K.A0C));
            writableNativeMap.putString(C46476Dff.A01(), ma1.A06().getUsername());
            writableNativeMap.putString("full_name", ma1.A06().getFullName());
            writableNativeMap.putString("profile_pic_url", DbU.A0p(ma1.A06()));
            writableNativeMap.putString("profile_pic_id", ma1.A06().A03.getProfilePicId());
            writableNativeArray.pushMap(writableNativeMap);
        }
        return writableNativeArray;
    }
}
