package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.share.ShopShareInfo;
import java.util.Arrays;

/* renamed from: X.9xS  reason: invalid class name and case insensitive filesystem */
public abstract class C394049xS {
    public static final C347017w8 A00(Context context, UserSession userSession, ShopShareInfo shopShareInfo, float f, int i, int i2) {
        Context context2 = context;
        return new C347017w8(context2, userSession, Arrays.asList(new Drawable[]{new C369588v0(context2, shopShareInfo, f, i, i2)}));
    }
}
