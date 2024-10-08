package X;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.I2v  reason: case insensitive filesystem */
public abstract class C56591I2v {
    public static final C55887Hp8 A00(View view, UserSession userSession) {
        0qQ.A0B(userSession, 0);
        Integer num = AnonymousClass05K.A01;
        C55887Hp8 hp8 = new C55887Hp8(view, userSession, num, num);
        hp8.A06 = false;
        hp8.A05 = false;
        hp8.A07 = false;
        return hp8;
    }

    public static final void A02(AnonymousClass0iw r5, ImageUrl imageUrl, C275794rx r7, String str, int i, boolean z) {
        int i2 = 0;
        View contentView = r7.getContentView();
        if (contentView != null) {
            IgImageView A0b = DbX.A0b(contentView, R.id.reel_tagging_bubble_image);
            TextView A0R = AnonymousClass7TG.A0R(contentView, R.id.reel_tagging_bubble_title);
            A0R.setText(str);
            if (z) {
                AnonymousClass7TF.A0G(contentView, R.id.reel_tagging_bubble_subtitle).setVisibility(0);
            } else {
                A0R.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.reel_tagging_chevron, 0);
            }
            if (imageUrl != null) {
                A0b.setUrl(imageUrl, r5);
                A0b.setContentDescription(contentView.getResources().getString(i));
            } else {
                i2 = 8;
            }
            A0b.setVisibility(i2);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A01(View view, View view2, C275794rx r13) {
        View[] viewArr;
        if (view != null && r13 != null) {
            if (view2 instanceof TextureView) {
                viewArr = new View[]{view, view2};
            } else {
                viewArr = new View[]{view};
            }
            Paint paint = C56598I3o.A00;
            int length = viewArr.length;
            int i = 0;
            View view3 = viewArr[0];
            if (view3 != null) {
                Rect A0W = AnonymousClass7TE.A0W();
                view3.getWindowVisibleDisplayFrame(A0W);
                Bitmap[] bitmapArr = new Bitmap[length];
                Bitmap A01 = C56598I3o.A01(A0W, bitmapArr, new Rect[length], viewArr, 15, 12);
                do {
                    Bitmap bitmap = bitmapArr[i];
                    if (bitmap != null && !bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                    i++;
                } while (i < length);
                if (A01 != null) {
                    r13.A01(A01, ((float) 0nA.A09(AnonymousClass7TE.A0S(view))) / ((float) A01.getWidth()));
                }
            }
        }
    }
}
