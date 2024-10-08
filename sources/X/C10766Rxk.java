package X;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Map;

/* renamed from: X.Rxk  reason: case insensitive filesystem */
public final class C10766Rxk {
    public RLK A00 = null;
    public String A01 = ".ttf";
    public final AssetManager A02;
    public final S5R A03 = new Object();
    public final Map A04 = AnonymousClass7TE.A1E();
    public final Map A05 = AnonymousClass7TE.A1E();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.S5R, java.lang.Object] */
    public C10766Rxk(Drawable.Callback callback) {
        AssetManager assets;
        if (!(callback instanceof View)) {
            S85.A00("LottieDrawable must be inside of a view for images to work.");
            assets = null;
        } else {
            assets = ((View) callback).getContext().getAssets();
        }
        this.A02 = assets;
    }
}
