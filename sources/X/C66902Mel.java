package X;

/* renamed from: X.Mel  reason: case insensitive filesystem */
public final class C66902Mel {
    public String A00;
    public final 02m A01;

    public final void A00(String str) {
        String str2 = this.A00;
        short s = 3;
        02m r2 = this.A01;
        if (str2 == null) {
            r2.markerAnnotate(20128369, "reason", "tapped_media_id_is_missing");
            r2.markerEnd(20128369, 3);
            return;
        }
        r2.markerAnnotate(20128369, "viewing media id exist", AnonymousClass7TF.A1V(str));
        if (!0qQ.A0K(this.A00, str)) {
            r2.markerAnnotate(20128369, "reason", "media_id_mismatch");
        } else {
            s = 2;
        }
        r2.markerEnd(20128369, s);
        this.A00 = null;
    }

    public C66902Mel(02m r1) {
        this.A01 = r1;
    }
}
