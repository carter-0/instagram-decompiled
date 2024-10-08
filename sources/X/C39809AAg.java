package X;

import android.graphics.drawable.Drawable;
import com.instagram.music.common.model.MusicOverlayStickerModel;

/* renamed from: X.AAg  reason: case insensitive filesystem */
public abstract class C39809AAg {
    public static final MusicOverlayStickerModel A00(Drawable drawable) {
        if (drawable instanceof C347017w8) {
            drawable = ((C347017w8) drawable).A04();
        }
        if (!(drawable instanceof B3d)) {
            if (!(drawable instanceof AnonymousClass5MI)) {
                return null;
            }
            drawable = ((AnonymousClass5MI) drawable).AfT();
            if (!(drawable instanceof B3d)) {
                return null;
            }
        }
        return C271404in.A02(drawable);
    }

    public static final void A01(Drawable drawable) {
        if (drawable instanceof C347017w8) {
            C347017w8 r2 = (C347017w8) drawable;
            Class<C389669q0> cls = C389669q0.class;
            if (r2.A0E(cls)) {
                ((C389669q0) AnonymousClass7TE.A12(r2.A06(cls))).A03.A00();
            }
        }
    }
}
