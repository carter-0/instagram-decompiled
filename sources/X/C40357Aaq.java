package X;

/* renamed from: X.Aaq  reason: case insensitive filesystem */
public final class C40357Aaq implements MV5 {
    public final /* synthetic */ AnonymousClass8K4 A00;
    public final /* synthetic */ boolean A01;

    public final void onStart() {
    }

    public C40357Aaq(AnonymousClass8K4 r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void DEG(Exception exc) {
        C59689JTv.A0A(this.A00.A0A, "photo_to_video_conversion_failed");
        02m.A0p.markerEnd(18948745, 3);
    }

    public final void Doe(String str) {
        C59689JTv.A08(this.A00.A0A, 2131976517, 0);
        02m.A0p.markerEnd(18948745, 2);
    }

    public final void onFinish() {
        C364838m6 r1;
        if (this.A01 && (r1 = this.A00.A0N.A02) != null) {
            r1.A09 = true;
            C364898mC r2 = r1.A0K;
            r2.A04 = false;
            if (r2.A03) {
                r2.A02.A00(r2.A01);
            }
        }
        AnonymousClass7TF.A1N(this.A00.A0l);
    }
}
