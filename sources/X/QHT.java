package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public abstract class QHT extends QHO implements TZr {
    public Animatable A00;

    public final void DOF(Drawable drawable) {
        A00((Object) null);
        this.A00 = null;
        ((ImageView) this.A00).setImageDrawable(drawable);
    }

    public final void DOR(Drawable drawable) {
        A00((Object) null);
        this.A00 = null;
        ((ImageView) this.A00).setImageDrawable(drawable);
    }

    public final void A00(Object obj) {
        if (this instanceof QHS) {
            ((ImageView) this.A00).setImageDrawable((Drawable) obj);
            return;
        }
        ((ImageView) this.A00).setImageBitmap((Bitmap) obj);
    }

    public final void onStart() {
        Animatable animatable = this.A00;
        if (animatable != null) {
            animatable.start();
        }
    }

    public final void onStop() {
        Animatable animatable = this.A00;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public final void DO8(Drawable drawable) {
        super.DO8(drawable);
        Animatable animatable = this.A00;
        if (animatable != null) {
            animatable.stop();
        }
        A00((Object) null);
        this.A00 = null;
        ((ImageView) this.A00).setImageDrawable(drawable);
    }

    public final void Df5(C13540TcC tcC, Object obj) {
        if (!tcC.FHs(this, obj)) {
            A00(obj);
        }
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.A00 = animatable;
            animatable.start();
            return;
        }
        this.A00 = null;
    }
}
