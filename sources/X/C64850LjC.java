package X;

import android.view.View;
import com.instagram.common.gallery.Medium;

/* renamed from: X.LjC  reason: case insensitive filesystem */
public final class C64850LjC implements AnonymousClass3NL {
    public final int A00;
    public final Object A01;

    public C64850LjC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DP5(View view) {
        switch (this.A00) {
            case 0:
                AnonymousClass3NL r0 = ((C14910UEp) this.A01).A04;
                if (r0 != null) {
                    r0.DP5(view);
                    return;
                }
                return;
            case 1:
                C60697Jpi.A00((C60697Jpi) this.A01);
                return;
            case 4:
                AnonymousClass8QZ r02 = (AnonymousClass8QZ) this.A01;
                if (r02 != null) {
                    r02.A0T.Dik();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final boolean Dqe(View view) {
        String str;
        switch (this.A00) {
            case 0:
                AnonymousClass3NL r0 = ((C14910UEp) this.A01).A04;
                if (r0 == null || !r0.Dqe(view)) {
                    return false;
                }
                return true;
            case 3:
                C60699Jpk jpk = (C60699Jpk) this.A01;
                int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                Medium medium = jpk.A01;
                if (medium == null || medium.A03 < 5000) {
                    return false;
                }
                K7A k7a = jpk.A05.A03.A02;
                AnonymousClass88V r1 = k7a.A01;
                if (r1 == null) {
                    str = "gallerySelectionViewModel";
                } else {
                    r1.A02(AnonymousClass05K.A0Y, AnonymousClass7TE.A1I(medium), false, true, false);
                    C3514789a r02 = k7a.A00;
                    if (r02 == null) {
                        str = "musicBrowserViewModel";
                    } else {
                        r02.A01 = true;
                        return false;
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            case 4:
                AnonymousClass8QZ r03 = (AnonymousClass8QZ) this.A01;
                if (r03 != null) {
                    r03.A0T.Dik();
                    break;
                }
                break;
            case 5:
                C46656Dib.A0G((C46656Dib) this.A01);
                break;
            case 6:
                0qQ.A0B(view, 0);
                ((C322956wg) this.A01).D6h(view);
                break;
            case 7:
                ((C322946wf) this.A01).DBv();
                break;
            case 8:
                C60312JjF A002 = C64710Lgj.A00((C64710Lgj) this.A01);
                MGU.A02(A002, C318116oQ.A00(A002), 22);
                AnonymousClass7TF.A1O(A002.A0M, A002.A0W);
                break;
            default:
                C60697Jpi jpi = (C60697Jpi) this.A01;
                C361728gh r12 = jpi.A00;
                if (r12 != null) {
                    C63151KsK.A00(jpi, r12, jpi.A0B);
                    break;
                }
                break;
        }
        return true;
    }
}
