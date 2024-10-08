package X;

public final class Pxu implements AnonymousClass0hF {
    public final C13907Tl7 A00;
    public final AnonymousClass0hF A01;

    public Pxu(C13907Tl7 tl7, AnonymousClass0hF r3) {
        0qQ.A0B(tl7, 1);
        this.A00 = tl7;
        this.A01 = r3;
    }

    public final void Dms(07T r3, AnonymousClass07Z r4) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(r3, 1);
        switch (r3.ordinal()) {
            case 0:
                this.A00.onCreate(r4);
                break;
            case 1:
                this.A00.onStart(r4);
                break;
            case 2:
                this.A00.onResume(r4);
                break;
            case 3:
                this.A00.onPause(r4);
                break;
            case 4:
                this.A00.onStop(r4);
                break;
            case 5:
                this.A00.onDestroy(r4);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        AnonymousClass0hF r0 = this.A01;
        if (r0 != null) {
            r0.Dms(r3, r4);
        }
    }
}
