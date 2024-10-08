package X;

import com.instagram.model.reels.Reel;
import java.util.Set;
import kotlin.Deprecated;

@Deprecated(message = "\n      This class is Deprecated since its creation as it's not meant to be used and new \n      functionality that's not related to keeping compatibility with functionality not yet migrated \n      to MVVM should not be added here.\n      ")
/* renamed from: X.6SY  reason: invalid class name */
public final class AnonymousClass6SY extends 2YL {
    public final 2Fk A00;
    public final 2Fk A01;
    public final L8S A02;
    public final L5D A03;
    public final 0V2 A04;
    public final VX8 A05;
    public final L5C A06;
    public final C17970Vj6 A07;
    public final C17274VPb A08;
    public final AnonymousClass0r6 A09;
    public final AnonymousClass0r6 A0A;
    public final AnonymousClass0r6 A0B;

    public AnonymousClass6SY(VX8 vx8, L5C l5c, L8S l8s, C17970Vj6 vj6, L5D l5d, C17274VPb vPb) {
        0qQ.A0B(vPb, 4);
        0qQ.A0B(vj6, 5);
        0qQ.A0B(l5d, 6);
        this.A05 = vx8;
        this.A02 = l8s;
        this.A06 = l5c;
        this.A08 = vPb;
        this.A07 = vj6;
        this.A03 = l5d;
        C66109MBs mBs = new C66109MBs(vj6.A01);
        19B r4 = 19B.A00;
        this.A01 = C226292g8.A00(r4, mBs);
        C66110MBt mBt = new C66110MBt(l8s.A02);
        this.A0B = mBt;
        C66111MBu mBu = new C66111MBu(l5c.A01);
        this.A0A = mBu;
        05D A012 = 10D.A01(AnonymousClass05K.A00, 0, 0);
        this.A04 = A012;
        055 A042 = 10q.A04(new AnonymousClass0r6[]{mBt, mBu, A012});
        this.A09 = A042;
        this.A00 = C226292g8.A00(r4, A042);
    }

    public final void A01(C255773uh r13, C250973mM r14, float f, int i) {
        int i2;
        0qQ.A0B(r14, 0);
        0qQ.A0B(r13, 1);
        VX8 vx8 = this.A05;
        Reel reel = r14.A0H;
        int i3 = r14.A0E;
        if (r14.A0L) {
            i2 = 0;
        } else {
            i2 = r14.A00;
        }
        int i4 = r14.A01;
        boolean z = !this.A08.A00.A00.CaU(reel, r13);
        Set set = vx8.A00;
        String id = reel.getId();
        0qQ.A07(id);
        set.add(id);
        vx8.A01.Epw(new UOF(reel, r13, new C15021UKa(f, i3, i, i2, i4, set.size(), z)));
    }

    public final void A00() {
        05G r1 = this.A07.A00;
        C13997Tnz tnz = (C13997Tnz) r1.getValue();
        r1.Epw(new C13997Tnz(tnz.A01, 5, tnz.A02, true, tnz.A00));
    }
}
