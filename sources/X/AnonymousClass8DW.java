package X;

import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.8DW  reason: invalid class name */
public final class AnonymousClass8DW implements Runnable {
    public final /* synthetic */ AnonymousClass8DM A00;
    public final /* synthetic */ AnonymousClass8DD A01;

    public AnonymousClass8DW(AnonymousClass8DM r1, AnonymousClass8DD r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass8DD r6 = this.A01;
        AnonymousClass87G r7 = r6.A01;
        if (r7 != null) {
            int i = (r6.A0Q.A0H.Bu9() ? 1 : 0) + r6.A00;
            AnonymousClass8DM r5 = this.A00;
            String id = r7.getId();
            0qQ.A07(id);
            int B0X = r5.B0X(id);
            if (B0X >= 0) {
                if (r5.Brp() == B0X) {
                    r5.EEa();
                }
                r5.ELA((String) null, B0X, false);
            } else {
                if (r6.A0L.A08.A00 instanceof AnonymousClass80O) {
                    i = r5.B0a();
                    int i2 = i - 1;
                    AnonymousClass87G B0Q = r5.B0Q(i2);
                    if (B0Q != null) {
                        AnonymousClass87I r1 = B0Q.A04;
                        if (r1 == null) {
                            r1 = AnonymousClass87I.EMPTY;
                        }
                        if (r1 == AnonymousClass87I.DISCOVERY_SURFACE) {
                            i = i2;
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                r5.A8H(r7, i);
                r5.ELA((String) null, i, false);
            }
            CameraAREffect A002 = r7.A00();
            if (A002 != null) {
                r5.EUv(A002.A0S);
            }
            r6.A01 = null;
            r6.A04 = null;
            r5.notifyDataSetChanged();
        }
    }
}
