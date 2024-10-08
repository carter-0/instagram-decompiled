package X;

import com.facebook.systrace.Systrace;
import com.instagram.api.schemas.TestimonialDict;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.3hI  reason: invalid class name and case insensitive filesystem */
public final class C248023hI {
    public final UserSession A00;
    public final C249763kK A01;

    public static final int A00(1Xj r9, AnonymousClass3W1 r10) {
        0qQ.A0B(r9, 0);
        0qQ.A0B(r10, 1);
        Integer num = null;
        int i = 0;
        List<C247733gp> list = r9.A1X().A00;
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        for (C247733gp r0 : list) {
            arrayList.add(Integer.valueOf(Arrays.hashCode(new Object[]{Boolean.valueOf(r0.A0O)})));
        }
        Object obj = r10.A3b.A00;
        Integer valueOf = Integer.valueOf(r9.A0v());
        Integer valueOf2 = Integer.valueOf(r9.A0r());
        List BxO = r9.A0C.BxO();
        if (BxO != null) {
            num = Integer.valueOf(BxO.size());
        }
        List BxO2 = r9.A0C.BxO();
        if (BxO2 != null) {
            i = BxO2.hashCode();
        }
        return Arrays.hashCode(new Object[]{arrayList, obj, valueOf, valueOf2, num, Integer.valueOf(i), r9.BpP()});
    }

    public final AnonymousClass9IV A01(1Xj r9, AnonymousClass4DU r10, AnonymousClass3W1 r11) {
        TestimonialDict testimonialDict;
        0qQ.A0B(r9, 0);
        AnonymousClass3W1 r7 = r11;
        0qQ.A0B(r11, 1);
        boolean A0E = Systrace.A0E(1);
        if (A0E) {
            0fS.A01("TestimonialRowUseCase#getUiState", -1020534509);
        }
        C250513lZ injected = r9.A0C.getInjected();
        if (injected != null) {
            testimonialDict = injected.C4j();
        } else {
            testimonialDict = null;
        }
        AnonymousClass9IV r1 = new AnonymousClass9IV(21, (Object) testimonialDict, (Object) new AnonymousClass9IE((Object) new AnonymousClass9MR(13, r7, this, r9, r10), 16));
        if (A0E) {
            0fS.A00(-102977985);
        }
        return r1;
    }

    public C248023hI(UserSession userSession, C249763kK r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }
}
