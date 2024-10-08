package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.lang.ref.WeakReference;

public abstract class S71 {
    public float A00;
    public Context A01;
    public View.OnAttachStateChangeListener A02;
    public String A03;
    public String A04;
    public WeakReference A05;
    public boolean A06;
    public boolean A07;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof S71)) {
            return false;
        }
        return this.A04.equals(((S71) obj).A04);
    }

    public final int hashCode() {
        return 589 + this.A04.hashCode();
    }

    public static void A00(View view) {
        if (view.getTag(R.id.fbpay_image_loader) instanceof S71) {
            S71 s71 = (S71) view.getTag(R.id.fbpay_image_loader);
            View view2 = (View) s71.A05.get();
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(s71.A02);
            }
        }
        view.setTag(R.id.fbpay_image_loader, (Object) null);
    }

    public final void A01(Drawable drawable) {
        02V.A05(AnonymousClass7TF.A1W(Looper.myLooper(), Looper.getMainLooper()));
        ImageView imageView = (ImageView) this.A05.get();
        if (imageView != null && equals(imageView.getTag(R.id.fbpay_image_loader))) {
            imageView.setImageDrawable(drawable);
        }
    }

    public final void A02(ImageView imageView) {
        02V.A05(AnonymousClass7TF.A1W(Looper.myLooper(), Looper.getMainLooper()));
        this.A05 = C51965G9l.A0v(imageView);
        A00(imageView);
        imageView.setTag(R.id.fbpay_image_loader, this);
        imageView.addOnAttachStateChangeListener(this.A02);
        A01((Drawable) null);
        C8287QnT qnT = (C8287QnT) this;
        1OO A0J = 1NK.A00().A0J(new SimpleImageUrl(qnT.A04), qnT.A03);
        A0J.A02(qnT.A00);
        A0J.A00().E5t();
    }
}
