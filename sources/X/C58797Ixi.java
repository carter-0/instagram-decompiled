package X;

import android.view.View;
import com.instagram.clips.intf.ClipsViewerConfig;
import java.util.List;

/* renamed from: X.Ixi  reason: case insensitive filesystem */
public final class C58797Ixi extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58797Ixi(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z, boolean z2) {
        super(1);
        this.A00 = i;
        this.A04 = obj;
        this.A01 = obj2;
        this.A06 = z;
        this.A05 = z2;
        this.A02 = obj3;
        this.A03 = obj4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C286225Uk r0;
        switch (this.A00) {
            case 0:
                long j = ((C289295dM) obj).A00;
                C52754Gc7 gc7 = (C52754Gc7) this.A04;
                C56547I1b i1b = (C56547I1b) this.A01;
                boolean z = !this.A06;
                C284945Oz r1 = gc7.A0A;
                if (!C51971G9r.A1W(r1)) {
                    i1b.A01();
                } else if (z && (r0 = gc7.A0L) != null) {
                    r0.show();
                }
                if (C51971G9r.A1W(r1) && this.A05) {
                    C284945Oz r5 = gc7.A09;
                    if (r5.getValue() == HL2.Selection) {
                        ((C52693Gb5) this.A02).A0C(C51965G9l.A0M(j));
                        break;
                    } else {
                        C56553I1h A002 = C52754Gc7.A00(gc7);
                        if (A002 != null) {
                            C55927Hpp hpp = gc7.A0M;
                            0sP r6 = gc7.A0O;
                            int FHr = ((JS3) this.A03).FHr(A002.A01(j, true));
                            C285975Tl r02 = hpp.A01;
                            r6.invoke(new C285975Tl(r02.A01, r02.A02, C3026964x.A00(FHr, FHr)));
                            if (gc7.A01.A02.length() > 0) {
                                r5.Epw(HL2.Cursor);
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                C305006Gb A0L = C51968G9o.A0L(obj);
                List list = (List) this.A04;
                J4H j4h = J4H.A00;
                boolean z2 = this.A05;
                boolean z3 = this.A06;
                EGP egp = (EGP) this.A01;
                J4I j4i = J4I.A00;
                C51967G9n.A12(A0L, new C59431JJg(egp, list, (0sP) this.A02, (0sP) this.A03, z2, z3), new MPB(47, list, (0sP) j4h), new MPB(48, list, (0sP) j4i), list.size());
                break;
            case 2:
                AnonymousClass2WA r14 = (AnonymousClass2WA) obj;
                0qQ.A0B(r14, 0);
                if (!this.A05) {
                    ClipsViewerConfig clipsViewerConfig = (ClipsViewerConfig) this.A03;
                    C267324bN r3 = (C267324bN) this.A01;
                    0qQ.A0B(clipsViewerConfig, 0);
                    if (!clipsViewerConfig.A1q && !clipsViewerConfig.A1T) {
                        View view = r14.A00;
                        0qQ.A06(view);
                        ((JTC) this.A04).DNc(view, r3, (C52058GDe) this.A02);
                        break;
                    }
                } else {
                    View view2 = r14.A00;
                    0qQ.A06(view2);
                    ((JTC) this.A04).Dm7(view2, (C267324bN) this.A01, "social_context_liked_by_tap", this.A06);
                    break;
                }
            default:
                boolean z4 = this.A05;
                JTC jtc = (JTC) this.A04;
                C267324bN r2 = (C267324bN) this.A01;
                if (z4) {
                    jtc.Dm4(r2, AnonymousClass000.A00(1829), this.A06);
                    break;
                } else {
                    jtc.DTS(r2, (C52058GDe) this.A02, ((GHN) this.A03).A00);
                    break;
                }
        }
        return C60340gF.A00;
    }
}
