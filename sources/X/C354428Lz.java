package X;

import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8Lz  reason: invalid class name and case insensitive filesystem */
public final class C354428Lz {
    public float A00 = 1.0f;
    public C376429Hy A01 = new C376429Hy(0.0f, 0.0f, 15, 0.0f, 2, 0.0f);
    public C380379Xt A02;
    public Integer A03;
    public boolean A04 = true;
    public boolean A05 = true;
    public final Path A06;
    public final List A07 = new ArrayList();

    public C354428Lz() {
        Path path = new Path();
        path.moveTo(0.05f, 0.05f);
        float f = 1.0f - 0.05f;
        float f2 = 0.5625f * f;
        path.lineTo(f2, 0.05f);
        path.lineTo(f2, f);
        path.lineTo(0.05f, f);
        path.lineTo(0.05f, 0.05f);
        this.A06 = path;
    }

    public static final void A00(ViewGroup viewGroup, AnonymousClass80G r6, C354428Lz r7) {
        ViewGroup viewGroup2;
        int id;
        C380379Xt r1 = r7.A02;
        if (r1 != null) {
            r1.setBackground((Drawable) null);
            if (r7.A05) {
                List list = r7.A07;
                list.clear();
                list.add(new AnonymousClass59G(r6.A05(), Boolean.valueOf(r6.A05().getClipToOutline()), false));
                r6.A05().setClipToOutline(false);
                ViewGroup viewGroup3 = r6.A05();
                do {
                    ViewParent parent = viewGroup3.getParent();
                    if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                        list.add(new AnonymousClass59G(viewGroup2, Boolean.valueOf(viewGroup2.getClipToOutline()), Boolean.valueOf(viewGroup2.getClipChildren())));
                        viewGroup2.setClipToOutline(false);
                        viewGroup2.setClipChildren(false);
                        id = viewGroup2.getId();
                        viewGroup3 = viewGroup2;
                    } else {
                        return;
                    }
                } while (id != R.id.quick_capture_outer_container);
                return;
            }
            C380379Xt r12 = r7.A02;
            if (r12 != null) {
                r12.setVisibility(8);
                C380379Xt r0 = r7.A02;
                if (r0 != null) {
                    viewGroup.removeView(r0);
                    return;
                }
            }
        }
        0qQ.A0F("guideView");
        throw AnonymousClass00P.createAndThrow();
    }
}
