package X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.UfZ  reason: case insensitive filesystem */
public final class C15607UfZ extends 1P0 {
    public final int A00;
    public final Integer A01;
    public final String A02;
    public final Set A03;
    public final /* synthetic */ C15397Uc0 A04;

    public C15607UfZ(C15397Uc0 uc0, Integer num, String str, Set set, int i) {
        this.A04 = uc0;
        this.A01 = num;
        this.A02 = str;
        this.A00 = i;
        this.A03 = set;
    }

    public final void onFail(C268654dm r10) {
        int i;
        String A002;
        Integer num;
        int A032 = AnonymousClass0fD.A03(141385059);
        int intValue = this.A01.intValue();
        if (intValue == 1) {
            i = 2131969434;
            A002 = AnonymousClass000.A00(3746);
        } else if (intValue == 2 || intValue == 3) {
            i = 2131969435;
            A002 = AnonymousClass000.A00(3747);
        } else if (intValue != 0) {
            i = -1;
            A002 = "";
        } else {
            i = 2131969433;
            A002 = "photos_and_videos_of_you_fail_to_add";
        }
        C59689JTv.A01(C60960kU.A00, A002, i, 0);
        C15397Uc0 uc0 = this.A04;
        F25 f25 = uc0.A05;
        EVG evg = uc0.A06;
        ArrayList arrayList = new ArrayList(this.A03);
        0qQ.A0B(evg, 0);
        if (intValue == 0) {
            num = AnonymousClass05K.A02;
        } else if (intValue == 1) {
            num = AnonymousClass05K.A1F;
        } else if (intValue == 2) {
            num = AnonymousClass05K.A0N;
        } else if (intValue == 3) {
            num = AnonymousClass05K.A0u;
        } else {
            throw new RuntimeException();
        }
        f25.A00(evg, num, "", arrayList);
        AnonymousClass0fD.A0A(-1359440924, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-1449513146);
        new Handler().post(new C20054WkE(this));
        AnonymousClass0fD.A0A(984749435, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(197696950);
        int A033 = AnonymousClass0fD.A03(686867131);
        C15397Uc0 uc0 = this.A04;
        C15463UdE udE = uc0.A04;
        Set set = udE.A0G;
        Iterator it = set.iterator();
        boolean z = false;
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            if (A18 != null && udE.A07.A0D(A18)) {
                z = true;
            }
        }
        set.clear();
        if (z) {
            0fE.A00(udE, -585529423);
        }
        if (this.A01 == AnonymousClass05K.A0N) {
            C15463UdE udE2 = uc0.A04;
            udE2.A07.A04();
            0fE.A00(udE2, -1812157705);
        }
        new Handler().post(new C20053WkD(this));
        AnonymousClass0fD.A0A(634627172, A033);
        AnonymousClass0fD.A0A(-998255021, A032);
    }
}
