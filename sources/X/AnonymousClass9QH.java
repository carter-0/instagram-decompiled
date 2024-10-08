package X;

/* renamed from: X.9QH  reason: invalid class name */
public final class AnonymousClass9QH implements C3495480u {
    public final /* synthetic */ C353498Hw A00;

    public AnonymousClass9QH(C353498Hw r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        int A0M = AnonymousClass7TE.A0M(obj);
        C353498Hw r3 = this.A00;
        if (C353498Hw.A1W(r3)) {
            Object obj2 = null;
            if (r3.A0E == null) {
                0kD.A07("ClipsCaptureControllerImpl", "view holder should not be null if on CLIPS format", (Throwable) null);
                return;
            }
            C347117wI r0 = (C347117wI) 00k.A0O(C347067wD.A01(r3.A1D, C358088aL.A0k), A0M);
            if (r0 != null) {
                obj2 = r0.A02;
            }
            if ((obj2 instanceof AnonymousClass804) && obj2 != null) {
                r3.A1x.A05.A0B(obj2);
            }
        }
    }
}
