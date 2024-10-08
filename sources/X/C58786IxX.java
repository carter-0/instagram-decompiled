package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.List;

/* renamed from: X.IxX  reason: case insensitive filesystem */
public final class C58786IxX extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58786IxX(int i, Object obj, Object obj2, Object obj3, boolean z, boolean z2) {
        super(1);
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
        this.A05 = z;
        this.A04 = z2;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [X.JNY, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        0sP r4;
        C285975Tl r3;
        String str;
        String str2;
        String str3;
        String str4;
        C291275gt r0;
        C291285gu A09;
        C291275gt r02;
        C291285gu A092;
        C291275gt r03;
        C291285gu A093;
        0xa r1;
        String str5;
        switch (this.A00) {
            case 0:
                C286025Tq r13 = (C286025Tq) obj;
                if (this.A05 || !this.A04) {
                    return false;
                }
                C52754Gc7 gc7 = (C52754Gc7) this.A01;
                C55928Hpq hpq = gc7.A04;
                if (hpq != null) {
                    List A1P = 0sr.A1P(new JNY[]{new Object(), new C56896IGr(r13, 1)});
                    C55927Hpp hpp = gc7.A0M;
                    r4 = gc7.A0O;
                    r3 = hpp.A00(A1P);
                    hpq.A00((C285975Tl) null, r3);
                } else {
                    C285975Tl r12 = (C285975Tl) this.A03;
                    String str6 = r12.A01.A00;
                    long j = r12.A00;
                    int A042 = C51965G9l.A04(j);
                    String obj2 = 00l.A0N(str6, r13, A042, C51968G9o.A02(j)).toString();
                    int length = A042 + r13.length();
                    long A002 = C3026964x.A00(length, length);
                    r4 = gc7.A0O;
                    r3 = new C285975Tl(obj2, A002);
                }
                r4.invoke(r3);
                return true;
            case 1:
                String str7 = (String) obj;
                0qQ.A0B(str7, 0);
                C71133OdW odW = (C71133OdW) this.A03;
                int[] iArr = (int[]) this.A02;
                C71133OdW.A04(odW, C66579MXk.A00(562), iArr);
                C71133OdW.A03(odW, C66579MXk.A00(679), C66579MXk.A00(561), iArr);
                String A0R = 002.A0R("GRAPHQL_RESPONSE_ERROR: ", str7);
                for (int i : iArr) {
                    C291265gs A06 = new 11S("error=(.*?),").A06(str7, 0);
                    if (A06 == null || (r03 = A06.A02) == null || (A093 = r03.A09(1)) == null) {
                        str2 = "no type found";
                    } else {
                        str2 = A093.A00;
                    }
                    C291265gs A062 = new 11S("errorDomain=(.*?),").A06(str7, 0);
                    if (A062 == null || (r02 = A062.A02) == null || (A092 = r02.A09(1)) == null) {
                        str3 = "no domain found";
                    } else {
                        str3 = A092.A00;
                    }
                    C291265gs A063 = new 11S("domainErrorCode=(.*?)\\)").A06(str7, 0);
                    if (A063 == null || (r0 = A063.A02) == null || (A09 = r0.A09(1)) == null) {
                        str4 = "no domain error found";
                    } else {
                        str4 = A09.A00;
                    }
                    LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = odW.A03;
                    lightweightQuickPerformanceLogger.markerAnnotate(i, "error_domain_code", str4);
                    lightweightQuickPerformanceLogger.markerAnnotate(i, AnonymousClass000.A00(34), str3);
                    lightweightQuickPerformanceLogger.markerAnnotate(i, AnonymousClass000.A00(3069), str2);
                }
                ((C71087ObS) this.A01).A05(new N0J(new Exception()));
                if (this.A05) {
                    C71133OdW.A04(odW, "NETWORK_PROBE_STARTED", iArr);
                    if (C69692NqE.A00()) {
                        str = "NETWORK_PROBE_SUCCEEDED";
                    } else {
                        str = "NETWORK_PROBE_FAILED";
                    }
                    C71133OdW.A04(odW, str, iArr);
                    C71133OdW.A04(odW, "NETWORK_PROBE_ENDED", iArr);
                }
                C71133OdW.A05(odW, A0R, iArr, this.A04);
                break;
            case 2:
                if (this.A01 != null) {
                    if (!this.A05 || !this.A04) {
                        r1 = ((1Av) this.A02).A01;
                        str5 = "comment_cover_nux_count";
                    } else {
                        r1 = ((1Av) this.A02).A01;
                        str5 = "comment_cover_updated_nux_count";
                    }
                    AnonymousClass7TG.A0g(r1, str5).apply();
                }
                ((C53682GsZ) this.A03).A00.A0A.A0T(true);
                break;
            default:
                if (this.A04 && this.A05) {
                    ((JTC) this.A03).Dm5((C267324bN) this.A01, (C52058GDe) this.A02);
                    break;
                }
        }
        return C60340gF.A00;
    }
}
