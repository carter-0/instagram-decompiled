package X;

import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import java.util.HashSet;

/* renamed from: X.34s  reason: invalid class name and case insensitive filesystem */
public final class C2366934s implements C250603lj {
    public C230252pH A00;
    public final C228102kn A01;

    public final void ATF(AnonymousClass30Y r14, C252093oY r15) {
        0qQ.A0B(r14, 0);
        0qQ.A0B(r15, 1);
        int intValue = r15.CEk(r14).intValue();
        if (intValue == 0) {
            C228102kn r5 = this.A01;
            Object obj = r14.A03;
            0qQ.A06(obj);
            Reel reel = (Reel) obj;
            AnonymousClass3BU r6 = AnonymousClass3BU.ON_VPVD_ENTER;
            synchronized (r5) {
                0qQ.A0B(reel, 0);
                AnonymousClass34T r4 = r5.A08;
                if (r4 != null) {
                    if (!182.A06(0Tu.A05, r4.A02, 36325867022988603L) && reel.A0P == ReelType.A0n) {
                        HashSet hashSet = r4.A03;
                        if (hashSet.add(reel) && hashSet.size() == 3) {
                            AnonymousClass34T.A01(r6, r4, hashSet);
                            hashSet.clear();
                        }
                    }
                }
            }
        } else if (intValue != 1) {
            return;
        }
        C241073Nt r0 = (C241073Nt) r14.A04;
        C230252pH r62 = this.A00;
        Object obj2 = r14.A03;
        0qQ.A06(obj2);
        Reel reel2 = (Reel) obj2;
        int i = r0.A00;
        AnonymousClass3BN r52 = r0.A01;
        Boolean bool = r0.A02;
        0qQ.A0B(reel2, 0);
        C230252pH.A00(reel2, r52, r62, (Boolean) null, (Boolean) null, bool, (Integer) null, 002.A0R("viewpoint:", reel2.getId()), i);
    }

    public C2366934s(C230252pH r1, C228102kn r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
