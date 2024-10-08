package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.6QR  reason: invalid class name */
public final class AnonymousClass6QR implements C253183qL {
    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        Rect rect;
        1U1 r6;
        1U1 r1;
        C268734du r0;
        Object obj4 = obj3;
        ImageView imageView = (ImageView) obj;
        AnonymousClass6QP r4 = (AnonymousClass6QP) obj2;
        Context context2 = context;
        0qQ.A0B(context2, 0);
        0qQ.A0B(imageView, 1);
        0qQ.A0B(r4, 2);
        if (obj4 instanceof Rect) {
            rect = (Rect) obj4;
        } else {
            rect = null;
        }
        if (r4.A01 == null || !0qQ.A0K(r4.A00, rect)) {
            if (rect == null || (r1 = r4.A05) == null || ((!r1.A0Z || !r1.A0Y) && !r1.A0U)) {
                r6 = r4.A05;
            } else {
                AnonymousClass1U3 r5 = new AnonymousClass1U3(r1);
                int width = rect.width();
                int height = rect.height();
                if (width <= 0 || height <= 0) {
                    r0 = null;
                } else {
                    r0 = new C268734du(width, height);
                }
                r5.A0L = r0;
                r6 = new 1U1(r5);
            }
            1TS A01 = C226722hk.A01();
            Resources resources = context2.getResources();
            0qQ.A07(resources);
            r4.A01 = A01.A02(resources, r6, r4.A06, r4.A08);
            r4.A00 = rect;
        }
        C226742hm A00 = C299115ub.A00(imageView);
        1Tq A002 = C226722hk.A00();
        C226732hl r13 = r4.A01;
        if (r13 != null) {
            Object obj5 = r4.A07;
            A002.AUi(rect, r4.A02, r4.A03, (JLT) null, A00, r13, (C226702hi) null, r4.A04, obj5);
            imageView.setTag(R.id.fresco_vito_image_options_tag, r4.A05);
            imageView.setTag(R.id.fresco_vito_caller_context_tag, obj5);
            return null;
        }
        throw new IllegalStateException("renderUnit.cachedImageRequest is null");
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        AnonymousClass6QP r3 = (AnonymousClass6QP) obj;
        AnonymousClass6QP r4 = (AnonymousClass6QP) obj2;
        0qQ.A0B(r3, 0);
        0qQ.A0B(r4, 1);
        if (AnonymousClass6QP.A00(r3, r4) || !0qQ.A0K(obj3, obj4)) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ImageView imageView = (ImageView) obj;
        AnonymousClass6QP r6 = (AnonymousClass6QP) obj2;
        0qQ.A0B(imageView, 1);
        0qQ.A0B(r6, 2);
        C226742hm A00 = C299115ub.A00(imageView);
        Drawable AYq = A00.AYq();
        1U1 r0 = r6.A05;
        if ((r0 == null || r0.A0T) && (AYq instanceof Animatable)) {
            ((Animatable) AYq).stop();
        }
        C226722hk.A00().ECa(A00);
        imageView.setTag(R.id.fresco_vito_image_options_tag, (Object) null);
        imageView.setTag(R.id.fresco_vito_caller_context_tag, (Object) null);
    }

    public final String getDescription() {
        return "FrescoRenderUnit#attachDetach";
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }
}
