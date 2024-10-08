package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.ViewOutlineProvider;

/* renamed from: X.6Sq  reason: invalid class name and case insensitive filesystem */
public final class C308086Sq extends C308096Sr {
    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        C273704n3 r5 = (C273704n3) obj;
        C308026Sk r6 = (C308026Sk) obj2;
        if (r6.A06 != null) {
            C299085uY r52 = (C299085uY) r5;
            C299095uZ r0 = r52.A00;
            r0.A04 = false;
            r0.A0B.setLayerType(0, (Paint) null);
            r52.setElevation(0.0f);
            r52.setClipToOutline(false);
            r52.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            C308076Sp r1 = r6.A07;
            0qQ.A06(r1);
            r52.setOutlineAmbientShadowColor(r1.A00);
            r52.setOutlineSpotShadowColor(r1.A01);
            Drawable drawable = r6.A04;
            Drawable drawable2 = r6.A03;
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).stop();
            }
            if (drawable2 instanceof Animatable) {
                ((Animatable) drawable2).stop();
            }
        }
    }
}
