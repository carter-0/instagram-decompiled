package X;

import android.content.Context;
import com.facebook.pando.primaryexecution.cache.PandoResponseCache;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.9Lp  reason: invalid class name and case insensitive filesystem */
public final class C377379Lp extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377379Lp(int i, Object obj, boolean z) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        0nX r9;
        switch (this.A00) {
            case 0:
                AnonymousClass6L8 r0 = (AnonymousClass6L8) this.A01;
                QuickPerformanceLogger quickPerformanceLogger = r0.A01;
                int hashCode = r0.A00.hashCode();
                Map A0M = 0se.A0M(new 0eP("parallel_downloads", Integer.valueOf(this.A02 ? 1 : 0)));
                if (AnonymousClass6QC.A01.containsKey(new AnonymousClass9I1(51511298, hashCode, 0))) {
                    for (Map.Entry entry : A0M.entrySet()) {
                        quickPerformanceLogger.markerAnnotate(51511298, hashCode, (String) entry.getKey(), ((Number) entry.getValue()).intValue());
                    }
                    break;
                }
                break;
            case 3:
                C231622ry r1 = (C231622ry) this.A01;
                Context context = r1.A04;
                AnonymousClass310 r5 = r1.A00;
                if (r5 == null) {
                    0qQ.A0F("delegate");
                    throw AnonymousClass00P.createAndThrow();
                }
                0Pl r92 = r1.A08;
                UserSession userSession = r1.A06;
                AnonymousClass4DU r7 = r1.A07;
                C249763kK r11 = r1.A09;
                boolean z = r1.A0E;
                boolean z2 = this.A02;
                return new C2363933o(context, userSession, r5, (AnonymousClass33V) r1.A0B.getValue(), r7, r7, r92, (C231502rm) r1.A0C.getValue(), r11, z, z2);
            case 4:
                return new C2363633l(((AnonymousClass313) this.A01).C87(), this.A02);
            case 5:
                return C55009Hag.A00(C238863Ds.PAGE_PROFILE_PIC, (AnonymousClass3W1) this.A01, this.A02);
            case 6:
                0lg r4 = (0lg) this.A01;
                boolean z3 = this.A02;
                1vr r02 = 1vr.A00;
                0Tu r52 = 0Tu.A05;
                if (182.A06(r52, r4, 36317341514994758L)) {
                    r9 = new 0nX(460899395);
                } else {
                    C61410nE r2 = C61410nE.A00;
                    C61480nO A002 = 0nY.A00();
                    0qQ.A07(A002);
                    0qQ.A0B(r2, 1);
                    r9 = new 0nQ(new C62710vD(r2, A002), 1795207155, 3, false, true);
                }
                long A012 = 182.A01(r52, r4, 36598816490392869L);
                boolean A06 = 182.A06(r52, r4, 36317341513880635L);
                C253453qo r22 = PandoResponseCache.Companion;
                0qQ.A0B(r4, 0);
                return new PandoResponseCache(r9, ((C253483qr) r4.A01(C253483qr.class, C253463qp.A00)).A00, z3, (int) A012, A06);
            case 7:
                AnonymousClass1HI.A02.Eym(new AnonymousClass2LS(new GA1(40, this.A01, this.A02)));
                break;
            default:
                ((0sP) this.A01).invoke(Boolean.valueOf(!this.A02));
                break;
        }
        return C60340gF.A00;
    }
}
