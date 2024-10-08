package X;

public final class WSM implements C232262tL {
    public final C61046Jvk A00;
    public final VPU A01;
    public final String A02;

    public WSM(C61046Jvk jvk, VPU vpu, String str) {
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A00 = jvk;
        this.A01 = vpu;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C61046Jvk jvk;
        WSM wsm = (WSM) obj;
        C61046Jvk jvk2 = this.A00;
        if (wsm != null) {
            jvk = wsm.A00;
        } else {
            jvk = null;
        }
        return 0qQ.A0K(jvk2, jvk);
    }
}
