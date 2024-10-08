package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.common.ui.widget.draggable.DraggableContainer;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;

public final class LPC {
    public LD1 A00;
    public WeakReference A01;
    public final Map A02 = AnonymousClass7TE.A1E();

    public static final synchronized Set A00(LPC lpc, Class cls) {
        Set set;
        synchronized (lpc) {
            Map map = lpc.A02;
            if (map.containsKey(cls)) {
                Object obj = map.get(cls);
                if (obj != null) {
                    set = (Set) obj;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                set = AnonymousClass7TE.A1F();
            }
        }
        return set;
    }

    public final synchronized void A01() {
        LD1 ld1 = this.A00;
        if (ld1 != null) {
            for (MV0 DAi : A00(this, ld1.getClass())) {
                DAi.DAi();
            }
        }
    }

    public final synchronized void A02(MV0 mv0, Class cls) {
        Map map = this.A02;
        Set set = (Set) map.get(cls);
        if (set == null) {
            set = AnonymousClass7TE.A1F();
            map.put(cls, set);
        }
        set.add(mv0);
    }

    public final synchronized void A03(MV0 mv0, Class cls) {
        Map map = this.A02;
        Set set = (Set) map.get(cls);
        if (set != null) {
            set.remove(mv0);
            if (set.isEmpty()) {
                map.remove(cls);
            }
        }
    }

    public final synchronized void A05(boolean z) {
        LD1 ld1 = this.A00;
        if (ld1 != null) {
            for (MV0 mv0 : A00(this, ld1.getClass())) {
                Object obj = ld1.A00().get();
                if (obj != null) {
                    mv0.DAX((View) obj, z);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.widget.ImageView, android.view.View] */
    public final void A04(LD1 ld1) {
        int i;
        int i2;
        if (this.A00 == null) {
            WeakReference weakReference = this.A01;
            if (weakReference != null) {
                DraggableContainer draggableContainer = (DraggableContainer) weakReference.get();
                if (draggableContainer != null) {
                    this.A00 = ld1;
                    LD1 ld12 = C63515KyQ.A00.A00;
                    ld12.getClass();
                    ? r4 = draggableContainer.A03;
                    if (r4 == 0) {
                        0qQ.A0F("draggableView");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    Context A0S = AnonymousClass7TE.A0S(draggableContainer);
                    if (ld12 instanceof C61689KHx) {
                        r4.setRadius((float) AnonymousClass7TG.A03(A0S));
                        r4.setAlpha(204);
                        Object obj = ld12.A00().get();
                        obj.getClass();
                        View view = (View) obj;
                        view.setDrawingCacheEnabled(true);
                        Bitmap drawingCache = view.getDrawingCache();
                        drawingCache.getClass();
                        0fO.A03(drawingCache);
                        r4.setImageBitmap(Bitmap.createBitmap(drawingCache));
                        view.setDrawingCacheEnabled(false);
                        Drawable drawable = r4.getDrawable();
                        drawable.getClass();
                        i = drawable.getIntrinsicWidth();
                        i2 = drawable.getIntrinsicHeight();
                    } else {
                        C61690KHy kHy = (C61690KHy) ld12;
                        r4.setRadius(0.0f);
                        r4.setAlpha(204);
                        r4.setBackgroundDrawable((Drawable) null);
                        r4.setImageBitmap(kHy.A02);
                        i = kHy.A01;
                        i2 = kHy.A00;
                    }
                    r4.setLayoutParams(new FrameLayout.LayoutParams(i, i2, 51));
                    r4.setVisibility(0);
                    r4.bringToFront();
                    float f = ld12.A01;
                    Rect rect = draggableContainer.A06;
                    draggableContainer.A00 = f - ((float) rect.left);
                    draggableContainer.A01 = ld12.A02 - ((float) rect.top);
                    DraggableContainer.A02(draggableContainer);
                    JTR.A1B(r4);
                    LYT.A00(r4, 1, draggableContainer);
                    return;
                }
                throw AnonymousClass7TE.A15("No drag container active.");
            }
            throw AnonymousClass7TE.A0y();
        }
        throw AnonymousClass7TE.A15("Previous draggable has not been cleared.");
    }

    public final boolean A06() {
        LD1 ld1 = this.A00;
        if (ld1 == null || ld1.A00().get() == null) {
            return false;
        }
        return true;
    }
}
