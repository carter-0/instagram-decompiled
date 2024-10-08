package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.7NP  reason: invalid class name */
public final class AnonymousClass7NP extends AnonymousClass7NJ {
    public final void ADP(C39752A7s a7s, AnonymousClass7NZ r9, String str, boolean z) {
        C39752A7s a7s2 = a7s;
        0qQ.A0B(a7s, 0);
        String str2 = str;
        0qQ.A0B(str, 1);
        0qQ.A0B(r9, 2);
        super.ADP(a7s, r9, str, z);
        A01(a7s, r9, this);
        if (!z) {
            A02(a7s2, str2, new C41567AwZ(36, r9, this, a7s), new C41567AwZ(35, r9, this, a7s), false);
        }
    }

    public final C39752A7s CrU(Context context, ShapeDrawable shapeDrawable, View view, ViewGroup viewGroup, ImageView imageView, AnonymousClass763 r15) {
        0qQ.A0B(context, 0);
        return new C39752A7s(shapeDrawable, new IgImageView(context), (View) null, (View) null, view, viewGroup, imageView, r15);
    }

    public final boolean D27(C39752A7s a7s, AnonymousClass7NZ r9, String str, boolean z) {
        C39752A7s a7s2 = a7s;
        0qQ.A0B(a7s, 0);
        String str2 = str;
        0qQ.A0B(str, 1);
        0qQ.A0B(r9, 3);
        super.D27(a7s, r9, str, z);
        if (this.A01.A00.contains(str)) {
            return false;
        }
        return A02(a7s2, str2, new C41567AwZ(36, r9, this, a7s), new C41567AwZ(35, r9, this, a7s), true);
    }

    public final void FIO(C39752A7s a7s, String str) {
        ImageView imageView;
        0qQ.A0B(a7s, 0);
        0qQ.A0B(str, 1);
        View view = a7s.A01;
        if ((view instanceof IgImageView) && (imageView = (ImageView) view) != null) {
            imageView.setImageDrawable((Drawable) null);
        }
    }

    public static final void A01(C39752A7s a7s, AnonymousClass7NZ r6, AnonymousClass7NP r7) {
        Context context;
        ImageView imageView;
        ImageView imageView2 = a7s.A06;
        if (imageView2 != null && (context = imageView2.getContext()) != null) {
            View view = a7s.A01;
            if ((view instanceof IgImageView) && (imageView = (ImageView) view) != null) {
                imageView.setImageDrawable(new NEs(context, r7.A00, r6.A00));
            }
        }
    }

    public final AnonymousClass5FV CAI() {
        return AnonymousClass5FV.AvatarLaugh;
    }
}
