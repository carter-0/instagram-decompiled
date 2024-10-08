package X;

import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.clips.audio.model.AudioPageAssetModel;

public final class ISY implements C229132mt {
    public final int A00;
    public final Object A01;

    public ISY(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void ACw() {
        C320416sL r0;
        switch (this.A00) {
            case 0:
                C54176H1w.A06((C54176H1w) this.A01, false, false);
                return;
            case 1:
                ((H1Q) this.A01).A04(false);
                return;
            case 2:
                C60202JhL jhL = (C60202JhL) ((H1L) this.A01).A0C.getValue();
                05G r1 = jhL.A05;
                if (!(r1.getValue() instanceof HDF) && !(r1.getValue() instanceof HDG) && jhL.A01) {
                    r1.Epw(HDG.A00);
                    Dba.A1S(jhL, C318116oQ.A00(jhL), 41, false);
                    return;
                }
                return;
            case 3:
                ((H08) this.A01).A04(false);
                return;
            case 4:
                C53087GiL giL = (C53087GiL) this.A01;
                ShimmerFrameLayout shimmerFrameLayout = giL.A01;
                if (shimmerFrameLayout != null && !shimmerFrameLayout.A00) {
                    giL.A03.A03((AudioPageAssetModel) null);
                    return;
                }
                return;
            case 5:
                r0 = ((C52957GgA) ((H1E) this.A01).A0J.getValue()).A02.A00;
                break;
            case 6:
                C59546JNs jNs = ((C52991Ggi) ((H1K) this.A01).A0D.getValue()).A00;
                if (jNs != null) {
                    jNs.E1b();
                    return;
                }
                return;
            case 7:
                r0 = ((C52958GgB) ((H1F) this.A01).A0P.getValue()).A02.A00;
                break;
            case 8:
                C53086GiK giK = (C53086GiK) this.A01;
                ShimmerFrameLayout shimmerFrameLayout2 = giK.A00;
                if (shimmerFrameLayout2 != null && !shimmerFrameLayout2.A00) {
                    r0 = giK.A03.A03.A01;
                    break;
                } else {
                    return;
                }
                break;
            default:
                C54174H1u h1u = (C54174H1u) this.A01;
                C324356z9 r02 = h1u.A03;
                if (r02 == null) {
                    C51965G9l.A16();
                    throw AnonymousClass00P.createAndThrow();
                } else if (r02.A06()) {
                    C54174H1u.A02(h1u);
                    return;
                } else {
                    return;
                }
        }
        C51972G9s.A19(r0);
    }
}
