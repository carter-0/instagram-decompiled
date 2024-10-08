package X;

import android.media.projection.MediaProjection;

/* renamed from: X.Mrl  reason: case insensitive filesystem */
public final class C67658Mrl extends MediaProjection.Callback {
    public final /* synthetic */ OZU A00;

    public C67658Mrl(OZU ozu) {
        this.A00 = ozu;
    }

    public final void onStop() {
        this.A00.A02();
    }
}
