package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.Jpm  reason: case insensitive filesystem */
public final class C60701Jpm extends C249703kE implements C348257y9 {
    public C348267yA A00;
    public Medium A01;
    public final TextView A02;
    public final IgImageButton A03;
    public final C61424K6y A04;
    public final float A05;
    public final Matrix A06 = AnonymousClass7TE.A0U();
    public final UserSession A07;

    public final boolean CWP(Medium medium) {
        0qQ.A0B(medium, 0);
        Medium medium2 = this.A01;
        if (medium2 != null) {
            return medium.equals(medium2);
        }
        0qQ.A0F("currentMedium");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DLY(Medium medium, String str) {
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.widget.ImageView, com.instagram.igds.components.imagebutton.IgImageButton, android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public final void DrQ(Bitmap bitmap, Medium medium, boolean z) {
        int i = 0;
        AnonymousClass7TF.A1B(medium, 0, bitmap);
        TextView textView = this.A02;
        Context context = textView.getContext();
        bitmap.getWidth();
        bitmap.getHeight();
        ? r3 = this.A03;
        r3.A00 = this.A05;
        if (medium.A07 != 0) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int width2 = this.itemView.getWidth();
            int height2 = this.itemView.getHeight();
            int i2 = medium.A07;
            Matrix matrix = this.A06;
            1MF.A0J(matrix, width, height, width2, height2, i2, false);
            r3.setScaleType(ImageView.ScaleType.MATRIX);
            r3.setImageMatrix(matrix);
        }
        r3.setImageBitmap(bitmap);
        LY7.A00(r3, 16, medium, this);
        if (medium.CeS()) {
            DbT.A17(context, textView, 2Yu.A0A(context));
            textView.setText(medium.B8E());
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public C60701Jpm(View view, UserSession userSession, C61424K6y k6y, float f) {
        super(view);
        this.A07 = userSession;
        this.A04 = k6y;
        this.A05 = f;
        this.A03 = (IgImageButton) AnonymousClass7TE.A0b(view, R.id.video_thumbnail);
        this.A02 = DbW.A0B(view, R.id.duration_label);
    }
}
