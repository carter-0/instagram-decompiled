package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.Mxw  reason: case insensitive filesystem */
public final class C67972Mxw extends C249703kE {
    public final LayerDrawable A00;
    public final View A01;
    public final C226462gr A02;

    public C67972Mxw(View view) {
        super(view);
        LayerDrawable layerDrawable;
        C226462gr r0;
        this.A01 = view;
        Drawable drawable = view.getContext().getDrawable(R.drawable.locked_chat_animation);
        if (drawable instanceof LayerDrawable) {
            layerDrawable = (LayerDrawable) drawable;
        } else {
            layerDrawable = null;
        }
        this.A00 = layerDrawable;
        Drawable drawable2 = layerDrawable != null ? layerDrawable.getDrawable(1) : null;
        if (!(drawable2 instanceof C226462gr) || (r0 = (C226462gr) drawable2) == null) {
            r0 = (C226462gr) this.A01.getContext().getDrawable(R.drawable.igd_hidden_chats_unlock_animation_alt);
            0qQ.A07(r0);
        }
        this.A02 = r0;
    }
}
