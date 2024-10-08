package X;

import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.8o0  reason: invalid class name and case insensitive filesystem */
public abstract class C365988o0 implements AnonymousClass856 {
    public final AnonymousClass85B A00 = AnonymousClass85B.A00;
    public final AnonymousClass85C A01;
    public final UserSession A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new AnonymousClass9LC(this, 11));
    public final AnonymousClass0eM A04;
    public final AnonymousClass858 A05 = new AnonymousClass858("post_capture");
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C365988o0(UserSession userSession, boolean z) {
        this.A02 = userSession;
        this.A01 = new AnonymousClass85C(z);
        this.A06 = true;
        this.A08 = true;
        this.A07 = true;
        this.A04 = AnonymousClass0eN.A01(C366018o3.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (X.182.A06(X.0Tu.A05, r6.A02, 36325154057433763L) == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(X.C3499482o r7, boolean r8) {
        /*
            r6 = this;
            r2 = 0
            X.0qQ.A0B(r7, r2)
            X.82Y r4 = r7.A01
            X.50r r1 = r4.A0g
            r5 = 1
            if (r1 == 0) goto L_0x0016
            X.50r r0 = X.C2801950r.FEED_POST
            if (r1 != r0) goto L_0x0016
            if (r8 != 0) goto L_0x0016
            boolean r0 = r4.A0r
            if (r0 == 0) goto L_0x0016
            return r2
        L_0x0016:
            boolean r0 = r7.A0B()
            if (r0 != 0) goto L_0x0020
            boolean r0 = r4.A0O
            if (r0 == 0) goto L_0x0030
        L_0x0020:
            com.instagram.common.session.UserSession r3 = r6.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325154057433763(0x810d89000132a3, double:3.035511923351526E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0031
        L_0x0030:
            r1 = 0
        L_0x0031:
            X.802 r0 = r4.A02()
            if (r0 != 0) goto L_0x006c
            boolean r0 = r7.A0F()
            if (r0 != 0) goto L_0x006c
            if (r1 != 0) goto L_0x006c
            X.82d r0 = r4.A0Y
            if (r0 != 0) goto L_0x006c
            boolean r0 = r7.A0C()
            if (r0 != 0) goto L_0x006c
            boolean r0 = r4.A0Q
            if (r0 != 0) goto L_0x006c
            boolean r0 = r4.A07()
            if (r0 == 0) goto L_0x006c
            X.8nd r1 = r7.A01()
            X.8nd r0 = X.C365758nd.A04
            if (r1 == r0) goto L_0x0063
            X.8nd r1 = r7.A01()
            X.8nd r0 = X.C365758nd.A07
            if (r1 != r0) goto L_0x006c
        L_0x0063:
            com.instagram.common.session.UserSession r0 = r6.A02
            boolean r0 = X.C305756Jk.A01(r0)
            if (r0 == 0) goto L_0x006c
            return r5
        L_0x006c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C365988o0.A01(X.82o, boolean):boolean");
    }

    public final C359248cL AND(AnonymousClass9J8 r13, AnonymousClass84D r14) {
        AnonymousClass84A r2;
        long j;
        0qQ.A0B(r13, 1);
        C359228cJ r4 = C359218cI.A03;
        boolean z = this instanceof C365978nz;
        if (z) {
            r2 = ((C365978nz) this).A00;
        } else if (this instanceof C368498si) {
            r2 = ((C368498si) this).A00;
        } else {
            r2 = ((C368518sm) this).A00;
        }
        String str = r13.A02;
        C359218cI A012 = r4.A01(r2, str);
        List A1P = 0sr.A1P(new C359218cI[]{r4.A01(r2, str), C359228cJ.A00(r2)});
        if (z || (this instanceof C368498si)) {
            j = 6;
        } else {
            j = 3;
        }
        return new C359238cK(A012, (Integer) null, (String) null, A1P, j, false);
    }

    public final boolean A00(C3503284f r6, C3499582p r7) {
        CameraAREffect cameraAREffect;
        C349307zv A042;
        CameraAREffect cameraAREffect2;
        C349307zv A043;
        if (this instanceof C368518sm) {
            0qQ.A0B(r7, 0);
            return A01(r7.A02, false);
        }
        boolean z = this instanceof C365978nz;
        0qQ.A0B(r7, 0);
        C3499482o r3 = r7.A02;
        if (z) {
            if (!A01(r3, true) || !((C3503584i) r6.A00.A00()).CKj()) {
                return false;
            }
            int ordinal = r3.A01().ordinal();
            if (ordinal == 0) {
                C352218Cl A032 = r3.A01.A03();
                if (A032 == null || A032.A12) {
                    return true;
                }
                cameraAREffect2 = A032.A0E;
            } else if (ordinal != 1 || (A043 = r3.A01.A04()) == null || A043.A18) {
                return true;
            } else {
                cameraAREffect2 = A043.A0P;
            }
            if (cameraAREffect2 != null) {
                return false;
            }
            return true;
        } else if (!A01(r3, false) || !((C3503584i) r6.A00.A00()).CKj()) {
            return false;
        } else {
            int ordinal2 = r3.A01().ordinal();
            if (ordinal2 == 0) {
                C352218Cl A033 = r3.A01.A03();
                if (A033 == null || A033.A12) {
                    return true;
                }
                cameraAREffect = A033.A0E;
            } else if (ordinal2 != 1 || (A042 = r3.A01.A04()) == null || A042.A18) {
                return true;
            } else {
                cameraAREffect = A042.A0P;
            }
            if (cameraAREffect != null) {
                return false;
            }
            return true;
        }
    }

    public final AnonymousClass85D ALx() {
        if (((Boolean) this.A04.getValue()).booleanValue()) {
            return A26.A00;
        }
        return new C348347yI((AnonymousClass86T) this.A03.getValue(), this.A00, this.A01, B0F(), this.A02);
    }

    public final boolean Akh() {
        return this.A06;
    }

    public final boolean Aki() {
        return false;
    }

    public final C358348al B0F() {
        if (((Boolean) this.A04.getValue()).booleanValue()) {
            return C358348al.PRECAPTURE_PHOTO;
        }
        return C358348al.POSTCAPTURE_PHOTO;
    }

    public final Integer B0K() {
        return AnonymousClass05K.A01;
    }

    public final boolean Bu9() {
        return this.A08;
    }

    public final boolean BuC() {
        return false;
    }

    public final boolean Buj() {
        return true;
    }

    public final boolean But() {
        return false;
    }

    public final AnonymousClass858 C9l() {
        return this.A05;
    }

    public final boolean CRm() {
        return this.A07;
    }

    public final AnonymousClass0r6 ARB(AnonymousClass80W r2) {
        return C62190rs.A00;
    }
}
