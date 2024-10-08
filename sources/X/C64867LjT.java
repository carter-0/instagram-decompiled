package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.LjT  reason: case insensitive filesystem */
public final class C64867LjT implements C231672s5 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    public C64867LjT(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }

    public final void EF5(Bitmap bitmap, IgImageView igImageView) {
        boolean A1Z = AnonymousClass7TG.A1Z(igImageView, bitmap);
        C63830L8l l8l = C64184LSr.A00(this.A01).A00;
        if (l8l != null) {
            int dimensionPixelSize = this.A00.getResources().getDimensionPixelSize(R.dimen.avatar_sticker_max_height);
            bitmap = 1MF.A0C(bitmap, JW0.A07(JW0.A06(l8l.A01, bitmap.getWidth(), bitmap.getHeight(), A1Z ? 1 : 0, A1Z)), dimensionPixelSize, dimensionPixelSize);
            0qQ.A07(bitmap);
        }
        igImageView.setImageBitmap(bitmap);
    }
}
