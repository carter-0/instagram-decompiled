package X;

public final class IOY implements C232262tL {
    public final C53391GnO A00;
    public final C55657HlG A01;
    public final String A02;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        IOY ioy = (IOY) obj;
        String str2 = this.A02;
        if (ioy != null) {
            str = ioy.A02;
        } else {
            str = null;
        }
        if (!0qQ.A0K(str2, str) || !0qQ.A0K(this.A00, ioy.A00)) {
            return false;
        }
        return true;
    }

    public IOY(C53391GnO gnO, C55657HlG hlG, String str) {
        this.A02 = str;
        this.A00 = gnO;
        this.A01 = hlG;
    }
}
