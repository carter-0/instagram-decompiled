package X;

import com.instagram.android.R;

/* renamed from: X.Usz  reason: case insensitive filesystem */
public final class C16329Usz extends C16330Ut0 {
    public C14278TtB A00;
    public final /* synthetic */ C19721WeN A01;

    public final void CMf(C17872VhP vhP) {
        0qQ.A0B(vhP, 0);
        super.CMf(vhP);
        if (isValid()) {
            C14261Tsj tsj = this.A04;
            if (tsj != null) {
                this.A00 = C13988Tno.A0M("uCenterBoost", tsj.A03);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        this.A05 = this.A01;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16329Usz(C19721WeN weN) {
        super("", R.raw.point_vertex, R.raw.neon_glow_fragment, R.drawable.radial_asset);
        this.A01 = weN;
    }
}
