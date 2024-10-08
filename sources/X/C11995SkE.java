package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;

/* renamed from: X.SkE  reason: case insensitive filesystem */
public final class C11995SkE implements C13540TcC {
    public final /* bridge */ /* synthetic */ boolean FHs(TZr tZr, Object obj) {
        ImageView imageView = (ImageView) ((QHO) tZr).A00;
        Drawable drawable = imageView.getDrawable();
        if (drawable == null) {
            drawable = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, (Drawable) obj});
        transitionDrawable.setCrossFadeEnabled(true);
        transitionDrawable.startTransition(300);
        imageView.setImageDrawable(transitionDrawable);
        return true;
    }
}
