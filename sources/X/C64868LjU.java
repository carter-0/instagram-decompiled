package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.LjU  reason: case insensitive filesystem */
public final class C64868LjU implements C231672s5, C226642hc {
    public final int A00;
    public final Object A01;

    public C64868LjU(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void EF5(Bitmap bitmap, IgImageView igImageView) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(igImageView, 0);
                AnonymousClass8DV r2 = new AnonymousClass8DV(igImageView.getResources(), bitmap);
                igImageView.setImageDrawable(r2);
                r2.A02(((float) igImageView.A02) / 2.0f);
                C60689Jpa jpa = (C60689Jpa) this.A01;
                int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                jpa.A09.set(true);
                C60689Jpa.A00(jpa);
                return;
            case 1:
                igImageView.setImageDrawable(new AnonymousClass8DV(igImageView.getResources(), bitmap));
                return;
            default:
                AnonymousClass7TG.A1N(igImageView, bitmap);
                igImageView.setImageBitmap(BlurUtil.blur(bitmap, 0.1f, 3));
                AnonymousClass0eM r1 = ((PMS) this.A01).A05;
                Context A0S = AnonymousClass7TE.A0S(AnonymousClass7TE.A0c(r1));
                ImageView imageView = (ImageView) r1.getValue();
                0qQ.A07(imageView);
                AnonymousClass4Ed.A03(A0S, imageView, R.color.black_55_transparent);
                return;
        }
    }
}
