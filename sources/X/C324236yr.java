package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.6yr  reason: invalid class name and case insensitive filesystem */
public final class C324236yr extends C252303ot {
    public static final boolean A00(C319906rQ r1, C319906rQ r2) {
        0qQ.A0B(r1, 0);
        0qQ.A0B(r2, 1);
        if ((r1 instanceof C318806pZ) && (r2 instanceof C318806pZ)) {
            return 0qQ.A0K(((C318806pZ) r1).A00.A03.getId(), ((C318806pZ) r2).A00.A03.getId());
        }
        if (r1.getClass() == r2.getClass()) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        Reel reel;
        boolean A0K;
        C319906rQ r5 = (C319906rQ) obj;
        C319906rQ r6 = (C319906rQ) obj2;
        0qQ.A0B(r5, 0);
        0qQ.A0B(r6, 1);
        if ((r5 instanceof C318806pZ) && (r6 instanceof C318806pZ)) {
            C318806pZ r52 = (C318806pZ) r5;
            C318806pZ r62 = (C318806pZ) r6;
            if (!0qQ.A0K(r52.A05, r62.A05) || !0qQ.A0K(r52.A06, r62.A06) || !0qQ.A0K(r52.A03, r62.A03) || !0qQ.A0K(r52.A04, r62.A04) || r52.A08 != r62.A08 || !0qQ.A0K(r52.A01, r62.A01) || r52.A07 != r62.A07) {
                return false;
            }
            A0K = 0qQ.A0K(r52.A02, r62.A02);
        } else if (!(r5 instanceof C318816pa) || !(r6 instanceof C318816pa)) {
            if ((r5 instanceof C318826pb) && (r6 instanceof C318826pb)) {
                z = ((C318826pb) r5).A01;
                z2 = ((C318826pb) r6).A01;
            } else if ((r5 instanceof C318836pc) && (r6 instanceof C318836pc)) {
                z = ((C318836pc) r5).A00;
                z2 = ((C318836pc) r6).A00;
            } else if (!(r5 instanceof C319926rS) || !(r6 instanceof C319926rS)) {
                return A00(r5, r6);
            } else {
                z = ((C319926rS) r5).A00;
                z2 = ((C319926rS) r6).A00;
            }
            if (z == z2) {
                return true;
            }
            return false;
        } else {
            C318816pa r53 = (C318816pa) r5;
            C318816pa r63 = (C318816pa) r6;
            if (r53.A01 != r63.A01) {
                return false;
            }
            AnonymousClass3BT r1 = r53.A00;
            Reel reel2 = null;
            if (r1 != null) {
                reel = r1.A03;
            } else {
                reel = null;
            }
            AnonymousClass3BT r12 = r63.A00;
            if (r12 != null) {
                reel2 = r12.A03;
            }
            A0K = 0qQ.A0K(reel, reel2);
        }
        if (A0K) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        return A00((C319906rQ) obj, (C319906rQ) obj2);
    }
}
