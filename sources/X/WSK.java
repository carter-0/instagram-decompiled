package X;

public final class WSK implements C232262tL {
    public final ULX A00;
    public final C17465VWs A01;
    public final String A02;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        ULX ulx;
        WSK wsk = (WSK) obj;
        ULX ulx2 = this.A00;
        if (wsk != null) {
            ulx = wsk.A00;
        } else {
            ulx = null;
        }
        return 0qQ.A0K(ulx2, ulx);
    }

    public WSK(ULX ulx, C17465VWs vWs, String str) {
        this.A02 = str;
        this.A00 = ulx;
        this.A01 = vWs;
    }
}
