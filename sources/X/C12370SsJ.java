package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;

/* renamed from: X.SsJ  reason: case insensitive filesystem */
public final class C12370SsJ implements C13726Tfw {
    public C10429Rs5 A00 = new Object();
    public final MediaComposition A01;
    public final C7257Q1f A02;
    public final C13781Tgw A03;

    public final C13854TiZ ALq() {
        return new Q1T(this);
    }

    public final C13859Tie ALy() {
        return new Q1G(this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Rs5, java.lang.Object] */
    public C12370SsJ(MediaComposition mediaComposition, C7257Q1f q1f, C13781Tgw tgw) {
        this.A02 = q1f;
        this.A03 = tgw;
        this.A01 = mediaComposition;
        C266714aE r1 = C266714aE.VIDEO;
        if (mediaComposition != null && mediaComposition.A07(r1) != null && mediaComposition.A07(r1).size() > 1 && !tgw.CK7()) {
            throw Pxe.A0h("FrameRender should have media graph support for MediaComposition", new Throwable());
        }
    }
}
