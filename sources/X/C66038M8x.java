package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.M8x  reason: case insensitive filesystem */
public final class C66038M8x implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C329827Kj A01;
    public final /* synthetic */ DirectThreadKey A02;

    public C66038M8x(Bitmap bitmap, C329827Kj r2, DirectThreadKey directThreadKey) {
        this.A01 = r2;
        this.A02 = directThreadKey;
        this.A00 = bitmap;
    }

    public final void run() {
        C329827Kj r3 = this.A01;
        if (C329827Kj.A00(r3, this.A02, r3.A0K) != null) {
            C329827Kj.A02(r3);
            IgImageView igImageView = r3.A02;
            if (igImageView != null) {
                igImageView.setImageBitmap(this.A00);
            }
            AnonymousClass7TF.A16(r3.A01);
            Activity activity = r3.A05;
            View findViewById = activity.findViewById(R.id.message_list_refresh_container);
            if (findViewById != null) {
                findViewById.animate().alpha(0.5f).start();
            }
            TouchInterceptorFrameLayout findViewById2 = activity.findViewById(R.id.thread_fragment_container);
            if (findViewById2 != null) {
                findViewById2.CNi(new C64286LYm((Object) r3, 19));
            }
        }
    }
}
