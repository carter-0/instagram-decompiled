package X;

import com.facebook.common.callercontext.CallerContext;

public final class AYJ implements C61110lV {
    public final /* synthetic */ 2Lk A00;

    public AYJ(2Lk r1) {
        this.A00 = r1;
    }

    public static final void A00(AYJ ayj) {
        2Lk r1 = ayj.A00;
        CallerContext callerContext = 2Lk.A08;
        C363288jT A002 = C363288jT.A00(r1.A04);
        synchronized (A002) {
            if (C363288jT.A04(A002)) {
                C363288jT.A03(A002);
            }
        }
    }

    public final void onAppBackgrounded() {
        AnonymousClass0fD.A0A(2013425841, AnonymousClass0fD.A03(682402426));
    }

    public final void onAppForegrounded() {
        int A03 = AnonymousClass0fD.A03(-281061912);
        2Lk r4 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        if (182.A06(0Tu.A05, r4.A04, 36326897814419522L)) {
            AnonymousClass7TE.A1Z(new C66160MFx(this, (AnonymousClass4D7) null, 43), r4.A07);
        } else {
            A00(this);
        }
        AnonymousClass0fD.A0A(1919027760, A03);
    }
}
