package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.collection.ProductCollectionShareInfo;
import java.util.Arrays;

/* renamed from: X.9xR  reason: invalid class name and case insensitive filesystem */
public abstract class C394039xR {
    public static final C347017w8 A00(Context context, UserSession userSession, ProductCollectionShareInfo productCollectionShareInfo, float f, int i, int i2) {
        Context context2 = context;
        return new C347017w8(context2, userSession, Arrays.asList(new Drawable[]{new C387249lu(context2, productCollectionShareInfo, f, i, i2)}));
    }
}
