package X;

import android.content.Context;
import android.content.res.AssetManager;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.IgTextureLoader;
import com.instagram.common.session.UserSession;

/* renamed from: X.8ny  reason: invalid class name and case insensitive filesystem */
public abstract class C365968ny {
    public static final C366048o6 A01(Context context, UserSession userSession, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        C364708lr r4;
        boolean A06 = 182.A06(0Tu.A05, userSession, 36316254885122235L);
        if (z2) {
            r4 = new C364708lr(userSession, str);
        } else {
            r4 = null;
        }
        AssetManager assets = context.getAssets();
        0qQ.A07(assets);
        return new C366048o6(A00(userSession), new C365998o1(assets, A06), (C345057sr) null, r4, -1, z4, 0tS.A4E.A00().A0a(), false, z3, z);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.8o2, java.lang.Object] */
    public static final C366008o2 A00(UserSession userSession) {
        ? obj = new Object();
        if (182.A06(0Tu.A05, userSession, 36322242069538840L)) {
            obj.A01 = true;
            C366028o4 r1 = obj.A00;
            if (r1 != null && (r1 instanceof IgTextureLoader)) {
                ((IgTextureLoader) r1).tryGPULoading();
            }
        }
        return obj;
    }

    public static final C382369da A02(Context context, UserSession userSession, Integer num) {
        boolean A06 = 182.A06(0Tu.A05, userSession, 36316254885122235L);
        AssetManager assets = context.getAssets();
        0qQ.A07(assets);
        return new C382369da(A00(userSession), new C365998o1(assets, A06), num, 0tS.A4E.A00().A0a());
    }
}
