package X;

import android.content.Context;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.otc.models.OtcInput;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Iw9  reason: case insensitive filesystem */
public final class C58700Iw9 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58700Iw9(C7551QIu qIu, LoggingContext loggingContext, OtcInput otcInput, int i) {
        super(0);
        this.A00 = i;
        if (1 - i != 0) {
            this.A01 = loggingContext;
            this.A04 = "DELETE";
            this.A05 = true;
            this.A03 = qIu;
            this.A02 = otcInput;
        } else {
            this.A02 = loggingContext;
            this.A04 = "DELETE";
            this.A05 = true;
            this.A01 = qIu;
            this.A03 = otcInput;
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean z;
        List list;
        String str;
        String str2;
        LoggingContext loggingContext;
        SUU suu;
        Object obj;
        SEB seb;
        switch (this.A00) {
            case 0:
                if (this.A05) {
                    C56603I4c i4c = (C56603I4c) this.A03;
                    Context context = (Context) this.A02;
                    C307506Qj r4 = (C307506Qj) this.A01;
                    String str3 = this.A04;
                    boolean A1U = AnonymousClass7TF.A1U(0, context, r4);
                    i4c.A07 = A1U;
                    C53222GkW gkW = i4c.A0A;
                    String str4 = i4c.A05;
                    String str5 = i4c.A02;
                    if (str5 == null) {
                        str5 = "NULL";
                    }
                    String str6 = i4c.A01;
                    0qQ.A0B(str4, 0);
                    QuickPerformanceLogger quickPerformanceLogger = gkW.A00;
                    quickPerformanceLogger.markerStart(231933580);
                    quickPerformanceLogger.markerPoint(231933580, "editor_native_prefetch_start");
                    quickPerformanceLogger.markerAnnotate(231933580, "prefetch_session_id", str4);
                    quickPerformanceLogger.markerAnnotate(231933580, "surface", str3);
                    quickPerformanceLogger.markerAnnotate(231933580, C273654mx.A00(590), str5);
                    quickPerformanceLogger.markerAnnotate(231933580, "cache_state", str6);
                    i4c.A02(context, "AEv2 - prefetch start");
                    C57699If2 if2 = new C57699If2(System.nanoTime() - AnonymousClass49C.A00);
                    String str7 = i4c.A03;
                    if (str7 != null) {
                        LinkedHashMap A1H = AnonymousClass7TE.A1H();
                        BitSet A0w = DbS.A0w(2);
                        A1H.put("launch_data_serialized", str7);
                        A0w.set(0);
                        0sm A0E = 0Yt.A0E();
                        0qQ.A0B(A0E, 0);
                        A1H.put("logging_parameters", A0E);
                        A0w.set(A1U ? 1 : 0);
                        if (A0w.nextClearBit(0) >= 2) {
                            C11844ShW shW = new C11844ShW("com.bloks.www.screen_query.AEVTwoScreenQuery", (String) null, (String) null, 0Yt.A0B(A1H), 0Yt.A0E(), 719983200, SandboxRepository.CACHE_TTL, A1U);
                            C58258Ip1 ip1 = C58258Ip1.A00;
                            0qQ.A0B(ip1, A1U);
                            C49940FFt fFt = new C49940FFt();
                            fFt.A03 = C46626Di6.FULL_SCREEN;
                            fFt.A02 = C46627Di7.DISABLED;
                            C46471DfZ A012 = C49940FFt.A01(fFt, ip1, 0);
                            ING ing = new ING(context, i4c, if2);
                            0qQ.A0B(A012, 0);
                            shW.E3a(A012, r4, ing, A1U);
                            break;
                        } else {
                            throw DbT.A0n();
                        }
                    }
                }
                break;
            case 1:
                suu = C9962RkH.A00;
                loggingContext = (LoggingContext) this.A02;
                str2 = this.A04;
                z = !this.A05;
                list = AnonymousClass7TE.A1I(this.A01);
                str = null;
                obj = this.A03;
                break;
            case 2:
                suu = C9962RkH.A00;
                loggingContext = (LoggingContext) this.A01;
                str2 = this.A04;
                z = !this.A05;
                list = AnonymousClass7TE.A1I(this.A03);
                str = null;
                obj = this.A02;
                break;
            case 3:
                C16809V6q.A00(((AnonymousClass7NI) this.A03).A00, (C39752A7s) this.A02, (Integer) this.A01, this.A04, false, this.A05);
                break;
            default:
                List list2 = (List) this.A02;
                2Eq r42 = (2Eq) this.A01;
                DirectShareTarget directShareTarget = new DirectShareTarget(C66662MaV.A00(r42.C6C(), list2), r42.C6f(), list2, r42.CQ2());
                P1Q p1q = (P1Q) this.A03;
                C255773uh r2 = p1q.A01;
                User user = r2.A0i;
                if (user != null) {
                    String id = user.getId();
                    String str8 = r2.A0k;
                    0qQ.A07(str8);
                    return new C68165N3f(p1q.A00, directShareTarget, id, str8, this.A04, "thread", this.A05);
                }
                throw AnonymousClass7TE.A0y();
        }
        OtcInput otcInput = (OtcInput) obj;
        if (otcInput != null) {
            seb = C11300SKk.A01(otcInput);
        } else {
            seb = null;
        }
        suu.A0G(loggingContext, seb, str2, str, list, z);
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58700Iw9(Object obj, Object obj2, Object obj3, String str, int i, boolean z) {
        super(0);
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A04 = str;
        this.A01 = obj3;
        this.A05 = z;
    }
}
