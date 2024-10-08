package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.7NO  reason: invalid class name */
public final class AnonymousClass7NO extends AnonymousClass7NJ {
    private final boolean A01(C39752A7s a7s, AnonymousClass7NZ r11, String str, boolean z) {
        C39752A7s a7s2 = a7s;
        View view = a7s.A01;
        if (!(view instanceof IgImageView) || view == null) {
            return false;
        }
        AnonymousClass9N0 r1 = new AnonymousClass9N0(this, r11, view, a7s2, str, 1);
        return A02(a7s, str, r1, new AnonymousClass9MH(18, (Object) view, (Object) this, (Object) a7s), z);
    }

    public final void ADP(C39752A7s a7s, AnonymousClass7NZ r7, String str, boolean z) {
        0qQ.A0B(a7s, 0);
        0qQ.A0B(str, 1);
        0qQ.A0B(r7, 2);
        super.ADP(a7s, r7, str, z);
        AnonymousClass763 r3 = a7s.A07;
        if (r3 != null) {
            r3.A01(new C381039b4(this.A00, r7.A00));
        }
        if (!z) {
            A01(a7s, r7, str, false);
        }
    }

    public final C39752A7s CrU(Context context, ShapeDrawable shapeDrawable, View view, ViewGroup viewGroup, ImageView imageView, AnonymousClass763 r15) {
        0qQ.A0B(context, 0);
        return new C39752A7s(shapeDrawable, new IgImageView(context), (View) null, (View) null, view, viewGroup, imageView, r15);
    }

    public final boolean D27(C39752A7s a7s, AnonymousClass7NZ r5, String str, boolean z) {
        0qQ.A0B(a7s, 0);
        0qQ.A0B(str, 1);
        0qQ.A0B(r5, 3);
        super.D27(a7s, r5, str, z);
        if (!this.A01.A00.contains(str)) {
            return A01(a7s, r5, str, true);
        }
        return false;
    }

    public final void FIO(C39752A7s a7s, String str) {
        ImageView imageView;
        0qQ.A0B(a7s, 0);
        0qQ.A0B(str, 1);
        AnonymousClass763 r0 = a7s.A07;
        if (r0 != null) {
            r0.A01((Drawable) null);
        }
        View view = a7s.A01;
        if ((view instanceof IgImageView) && (imageView = (ImageView) view) != null) {
            imageView.setImageDrawable((Drawable) null);
        }
        AnonymousClass7NM r4 = this.A02;
        HashMap hashMap = r4.A01;
        AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(str);
        if (abstractCollection != null) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                r4.A00.removeCallbacks((Runnable) it.next());
            }
        }
        hashMap.remove(str);
    }

    public final AnonymousClass5FV CAI() {
        return AnonymousClass5FV.AvatarAngry;
    }
}
