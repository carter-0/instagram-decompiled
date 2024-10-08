package X;

/* renamed from: X.AUo  reason: case insensitive filesystem */
public final class C40174AUo implements C346347v1 {
    public final /* synthetic */ C40182AUw A00;

    public C40174AUo(C40182AUw aUw) {
        this.A00 = aUw;
    }

    public final void DGo(C343187po r4) {
        C40182AUw aUw = this.A00;
        aUw.A01 = r4;
        C340757lm r0 = aUw.A02;
        if (r0 == null) {
            return;
        }
        if (r0.A09()) {
            C40182AUw.A00(aUw);
        } else if (aUw.A00 != null) {
            try {
                aUw.A02.A07("onFrameCaptured", aUw.A07);
            } catch (Exception unused) {
            }
        }
    }
}
