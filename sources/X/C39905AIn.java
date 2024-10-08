package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AIn  reason: case insensitive filesystem */
public final class C39905AIn {
    public static final C39905AIn A00 = new Object();

    public static final C266864aT A00(AnonymousClass3Q2 r3) {
        HashMap hashMap;
        C266864aT r2;
        List list;
        List list2;
        C266864aT r0 = r3.A1K;
        if (!(r0 == null || (hashMap = r0.A0P) == null || (r2 = (C266864aT) hashMap.get(String.valueOf(8))) == null)) {
            String str = r2.A0L;
            if (str == null) {
                0qQ.A0F("filterModelClass");
                throw AnonymousClass00P.createAndThrow();
            } else if (!str.equals("gradient_transform") || (list = r2.A0V) == null || list.size() != 4 || (list2 = r2.A0Q) == null || list2.size() != 4) {
                return null;
            } else {
                return r2;
            }
        }
        return null;
    }

    public static final C255783ui A01(AnonymousClass3Q2 r4) {
        Object obj;
        Iterator it = r4.A4b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C255783ui r2 = (C255783ui) obj;
            if (r2.A11 == AnonymousClass3WT.MENTION_RESHARE && r2.A1a != null && 0qQ.A0K(r2.A1k, "reel_mention_post_fullscreen_photo")) {
                break;
            }
        }
        return (C255783ui) obj;
    }

    public static final C255783ui A02(AnonymousClass3Q2 r4) {
        Object obj;
        Iterator it = r4.A4b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C255783ui r2 = (C255783ui) obj;
            if (r2.A11 == AnonymousClass3WT.MENTION_RESHARE && r2.A1a != null && 0qQ.A0K(r2.A1k, "reel_mention_post")) {
                break;
            }
        }
        return (C255783ui) obj;
    }

    public final boolean A03(UserSession userSession, AnonymousClass3Q2 r6) {
        if (r6.A1G == 1iA.A0a && r6.A0E().A00 && r6.A15(ShareType.A02) && A01(r6) != null) {
            boolean A03 = 1NM.A03(userSession);
            if (r6.A10 == null && ((!r6.A57 || A03) && r6.A4P == null && r6.A1i.A01 == 0)) {
                0sn r1 = r6.A4g;
                if (r1 == null) {
                    r1 = 0sn.A00;
                }
                if (!(r1 instanceof Collection) || !r1.isEmpty()) {
                    Iterator it = r1.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str = ((C255783ui) it.next()).A1h;
                        if (str != null && str.length() != 0) {
                            break;
                        }
                    }
                }
                if (AnonymousClass7TE.A1b(r6.A4Y) || !182.A06(0Tu.A05, userSession, 36327731037747861L)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (X.1NM.A03(r6) == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04(com.instagram.common.session.UserSession r6, X.AnonymousClass3Q2 r7) {
        /*
            r5 = this;
            X.4aT r4 = A00(r7)
            r3 = 1
            if (r4 == 0) goto L_0x0015
            float r1 = r4.A02
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0015
            boolean r0 = X.1NM.A03(r6)
            r2 = 1
            if (r0 != 0) goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            X.1iA r1 = r7.A1G
            X.1iA r0 = X.1iA.A0a
            if (r1 != r0) goto L_0x003e
            com.instagram.pendingmedia.model.constants.ShareType r0 = r7.A0E()
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x003e
            java.util.EnumSet r0 = com.instagram.pendingmedia.model.constants.ShareType.A02
            boolean r0 = r7.A15(r0)
            if (r0 == 0) goto L_0x003e
            X.3ui r0 = A02(r7)
            if (r0 == 0) goto L_0x003e
            if (r4 == 0) goto L_0x003e
            com.instagram.camera.effect.models.CameraAREffect r0 = r7.A10
            if (r0 != 0) goto L_0x003e
            boolean r0 = r7.A57
            if (r0 == 0) goto L_0x0040
            if (r2 != 0) goto L_0x0040
        L_0x003e:
            r3 = 0
        L_0x003f:
            return r3
        L_0x0040:
            java.util.List r0 = r7.A4P
            if (r0 != 0) goto L_0x003e
            X.3QG r0 = r7.A1i
            int r0 = r0.A01
            if (r0 != 0) goto L_0x003e
            java.util.List r1 = r7.A4g
            if (r1 != 0) goto L_0x0050
            X.0sn r1 = X.0sn.A00
        L_0x0050:
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0070
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0070
        L_0x005a:
            java.util.List r0 = r7.A4Y
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != 0) goto L_0x003e
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327731037878935(0x810fe100023a97, double:3.03714161616172E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 != 0) goto L_0x003f
            goto L_0x003e
        L_0x0070:
            java.util.Iterator r1 = r1.iterator()
        L_0x0074:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r1.next()
            X.3ui r0 = (X.C255783ui) r0
            java.lang.String r0 = r0.A1h
            if (r0 == 0) goto L_0x0074
            int r0 = r0.length()
            if (r0 != 0) goto L_0x003e
            goto L_0x0074
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39905AIn.A04(com.instagram.common.session.UserSession, X.3Q2):boolean");
    }
}
