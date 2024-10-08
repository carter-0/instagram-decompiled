package X;

import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.Joi  reason: case insensitive filesystem */
public final class C60635Joi extends C249703kE {
    public final long A00;
    public final KHS A01;
    public final AnonymousClass0eM A02;
    public final boolean A03;

    public /* synthetic */ C60635Joi(KHS khs, boolean z) {
        super(khs);
        this.A01 = khs;
        this.A00 = (long) DbU.A05(khs).getInteger(R.integer.music_tray_placeholder_shimmer_item_delay_ms);
        this.A03 = z;
        0t0 A012 = AnonymousClass0eN.A01(C59917Jbg.A00(this, 14));
        this.A02 = A012;
        khs.A00((Drawable) A012.getValue(), false);
    }
}
