package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.PbI  reason: case insensitive filesystem */
public final class C73359PbI implements Runnable {
    public final /* synthetic */ OIR A00;
    public final /* synthetic */ OIR A01;
    public final /* synthetic */ C72366P3f A02;
    public final /* synthetic */ C72367P3g A03;

    public C73359PbI(OIR oir, OIR oir2, C72366P3f p3f, C72367P3g p3g) {
        this.A01 = oir;
        this.A02 = p3f;
        this.A03 = p3g;
        this.A00 = oir2;
    }

    public final void run() {
        if (this.A01.A0C) {
            AnonymousClass37E r2 = AnonymousClass37D.A00;
            FragmentActivity fragmentActivity = this.A02.A00;
            if (r2.A01(fragmentActivity) != null) {
                AnonymousClass37D A012 = r2.A01(fragmentActivity);
                if (A012 == null) {
                    throw AnonymousClass7TE.A0y();
                } else if (((AnonymousClass37F) A012).A0g) {
                    return;
                }
            }
            this.A03.DUZ(this.A00);
        }
    }
}
