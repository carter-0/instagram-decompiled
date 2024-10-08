package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.widget.ImageView;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.model.mediasize.GifUrlImpl;

public final class J72 extends 0Yg implements 0sL {
    public final float A00;
    public final int A01;
    public final Object A02;

    /* JADX WARNING: type inference failed for: r6v2, types: [X.H7q, android.widget.ImageView, android.view.View, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v1, types: [X.0r1, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        if (this.A01 != 0) {
            ? r6 = (C54321H7q) obj4;
            0qQ.A0B(r6, 1);
            C53979GxN gxN = (C53979GxN) this.A02;
            float f = this.A00;
            C57241IUc iUc = new C57241IUc(gxN, r6, new Object(), f, gxN.A06.A03() - 1);
            gxN.A04.A0L(iUc, (Integer) null, true);
            Context A0S = AnonymousClass7TE.A0S(r6);
            r6.setMinimumHeight(C61380mr.A01(A0S, 24));
            r6.setMaxWidth(C61380mr.A01(A0S, 24));
            r6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            r6.A00 = f;
            Drawable drawable = A0S.getDrawable(R.drawable.instagram_link_pano_outline_24);
            if (drawable != null) {
                DbX.A11(A0S, drawable, R.color.canvas_bottom_sheet_description_text_color);
            }
            r6.setImageDrawable(drawable);
            ShapeDrawable shapeDrawable = r6.A04;
            AnonymousClass7TE.A1N(A0S, shapeDrawable.getPaint(), R.color.gallery_item_selection_circle_default_color);
            shapeDrawable.setBounds(0, 0, r6.getMeasuredWidth(), r6.getMeasuredWidth());
            return C51965G9l.A0f(new C58693Iw2(30, gxN, iUc));
        }
        C286575Wy r2 = (C286575Wy) obj3;
        if (C51968G9o.A0B(obj2) != 2 || !r2.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-839146347, "com.instagram.barcelona.feed.mediaviewer.ui.MediaViewerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MediaViewerScreen.kt:320)");
            }
            C53471Gp3 gp3 = (C53471Gp3) ((JQB) this.A02);
            String str = gp3.A01;
            GifUrlImpl gifUrlImpl = gp3.A00;
            float A002 = C69826Nsn.A00(gifUrlImpl);
            HXW.A00(r2, C54739HQw.A00(Modifier.A00, this.A00, false), gifUrlImpl, str, C288035bG.A00(r2, 2131953689), A002, 0, 0, 32);
            if (0fL.A02()) {
                0fL.A00(866045722);
            }
        } else {
            r2.Evl();
        }
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J72(Object obj, float f, int i) {
        super(2);
        this.A01 = i;
        this.A02 = obj;
        this.A00 = f;
    }
}
