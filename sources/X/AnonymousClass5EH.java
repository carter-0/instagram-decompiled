package X;

import com.google.android.exoplayer2.Timeline;
import java.util.ArrayList;

/* renamed from: X.5EH  reason: invalid class name */
public final class AnonymousClass5EH extends AnonymousClass5EI {
    public AnonymousClass5HW A00;
    public long A01;
    public long A02;
    public AnonymousClass5EP A03;
    public final long A04;
    public final long A05;
    public final AnonymousClass4RE A06;
    public final ArrayList A07;

    public static void A00(Timeline timeline, AnonymousClass5EH r14) {
        long j;
        ArrayList arrayList;
        AnonymousClass4RE r2 = r14.A06;
        Timeline timeline2 = timeline;
        timeline.A0E(r2, 0, 0);
        long j2 = r2.A05;
        long j3 = Long.MIN_VALUE;
        if (r14.A03 != null) {
            arrayList = r14.A07;
            if (!arrayList.isEmpty()) {
                j = r14.A02 - j2;
                if (r14.A04 != Long.MIN_VALUE) {
                    j3 = r14.A01 - j2;
                }
                AnonymousClass5EP r8 = new AnonymousClass5EP(timeline2, j, j3);
                r14.A03 = r8;
                r14.A0C(r8);
            }
        }
        j = r14.A05;
        long j4 = r14.A04;
        long j5 = j2 + j;
        r14.A02 = j5;
        if (j4 != Long.MIN_VALUE) {
            j3 = j2 + j4;
        }
        r14.A01 = j3;
        arrayList = r14.A07;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass4TW r22 = (AnonymousClass4TW) arrayList.get(i);
            r22.A02 = j5;
            r22.A00 = j3;
        }
        j3 = j4;
        try {
            AnonymousClass5EP r82 = new AnonymousClass5EP(timeline2, j, j3);
            r14.A03 = r82;
            r14.A0C(r82);
        } catch (AnonymousClass5HW e) {
            r14.A00 = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((AnonymousClass4TW) arrayList.get(i2)).A03 = e;
            }
        }
    }

    public final AnonymousClass4TH AMb(C264874Rq r8, AnonymousClass4QW r9, long j) {
        AnonymousClass4TW r1 = new AnonymousClass4TW(this.A00.AMb(r8, r9, j), this.A02, this.A01);
        this.A07.add(r1);
        return r1;
    }

    public final void Cnl() {
        AnonymousClass5HW r0 = this.A00;
        if (r0 == null) {
            super.Cnl();
            return;
        }
        throw r0;
    }

    public final void ECj(AnonymousClass4TH r4) {
        ArrayList arrayList = this.A07;
        C256703wD.A04(arrayList.remove(r4));
        this.A00.ECj(((AnonymousClass4TW) r4).A06);
        if (arrayList.isEmpty()) {
            AnonymousClass5EP r0 = this.A03;
            r0.getClass();
            A00(r0.A00, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5EH(C265164Su r5, long j, long j2) {
        super(r5);
        r5.getClass();
        C256703wD.A03(j >= 0);
        this.A05 = j;
        this.A04 = j2;
        this.A07 = new ArrayList();
        this.A06 = new AnonymousClass4RE();
    }

    public final void A0D() {
        super.A0D();
        this.A00 = null;
        this.A03 = null;
    }
}
