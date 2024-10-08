package X;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import com.instagram.android.R;
import org.webrtc.CameraCapturer;

/* renamed from: X.3Jc  reason: invalid class name and case insensitive filesystem */
public abstract class C239983Jc {
    public static final void A00(ImageView imageView, int i) {
        String quantityString;
        boolean z = false;
        0qQ.A0B(imageView, 0);
        if (i > 0) {
            z = true;
        }
        imageView.setActivated(z);
        imageView.setImageLevel(Math.min(i, CameraCapturer.OPEN_CAMERA_TIMEOUT));
        Context context = imageView.getContext();
        0qQ.A07(context);
        if (i == 0) {
            quantityString = context.getString(2131968666);
        } else {
            Resources resources = context.getResources();
            if (i < 99) {
                quantityString = resources.getQuantityString(R.plurals.notification_badge_description_plural, i, new Object[]{Integer.valueOf(i)});
            } else {
                quantityString = resources.getQuantityString(R.plurals.notification_badge_description_more_than, 99, new Object[]{99});
            }
        }
        0qQ.A0A(quantityString);
        imageView.setContentDescription(quantityString);
    }
}
