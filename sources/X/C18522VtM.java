package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import com.instagram.android.R;
import java.util.NoSuchElementException;

/* renamed from: X.VtM  reason: case insensitive filesystem */
public final class C18522VtM {
    public static final C14608TzE A00(Context context, C18972WEz wEz, XBO xbo, C229392nJ r10, Integer num) {
        SparseArray sparseArray;
        Integer num2;
        Context context2 = context;
        if (context instanceof Activity) {
            C66581MXm.A0A((Activity) context2).setTag(R.id.testing_id_view_tag_key, "app_root_window");
        }
        C18972WEz wEz2 = wEz;
        SparseArray sparseArray2 = wEz.A00;
        if (sparseArray2 == null || (sparseArray = sparseArray2.clone()) == null) {
            sparseArray = new SparseArray(3);
        }
        sparseArray.put(R.id.bk_context_key_app_id, wEz.A05);
        sparseArray.put(R.id.bk_screen_container, xbo);
        C13690Tf8 tf8 = wEz.A01;
        if (tf8 != null) {
            num2 = Integer.valueOf(tf8.Bpr());
        } else {
            num2 = null;
        }
        sparseArray.put(R.id.bk_screen_container_type, num2);
        C14608TzE tzE = new C14608TzE(context2, sparseArray, wEz2, r10, num);
        xbo.getLifecycle().A09(tzE);
        return tzE;
    }

    public final C14608TzE A01(Context context, Bundle bundle, XBO xbo, C229392nJ r10) {
        String str;
        int i;
        try {
            int i2 = bundle.getInt("bloks_screen_navigation_state", 0);
            for (Integer num : AnonymousClass05K.A00(3)) {
                switch (num.intValue()) {
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        i = 2;
                        break;
                    default:
                        i = 0;
                        break;
                }
                if (i == i2) {
                    return A00(context, C18972WEz.A0A.A01(bundle), xbo, r10, num);
                }
            }
            throw new NoSuchElementException(C273654mx.A00(5));
        } catch (V1c e) {
            Bundle bundle2 = bundle.getBundle("key_screen_container_props_bundle");
            if (bundle2 != null) {
                str = bundle2.getString("key_app_id");
            } else {
                str = null;
            }
            1Kn.A00((C307786Rm) null, "ScreenContainerDelegate", 002.A0R("Failed to properly initialize screen props for screen with appId: ", str), e);
            throw e;
        }
    }
}
