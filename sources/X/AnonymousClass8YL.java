package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.8YL  reason: invalid class name */
public abstract class AnonymousClass8YL {
    public static final int A00(AnonymousClass831 r3) {
        AnonymousClass51M r1;
        AnonymousClass51M r12;
        Integer num;
        0qQ.A0B(r3, 0);
        ArrayList A05 = r3.A05();
        0qQ.A0C(A05, "null cannot be cast to non-null type java.util.ArrayList<com.instagram.creation.capture.quickcapture.video.model.IgClipSegment>");
        int i = 0;
        while (i < A05.size()) {
            Object obj = A05.get(i);
            if (!(!(obj instanceof AnonymousClass51M) || (r1 = (AnonymousClass51M) obj) == null || r1.A0G == null)) {
                Object obj2 = A05.get(i);
                if (!(obj2 instanceof AnonymousClass51M) || (r12 = (AnonymousClass51M) obj2) == null || (num = r12.A0G) == null || num.intValue() != i) {
                    break;
                }
            }
            i++;
        }
        return i;
    }

    public static final boolean A03(C279454yf r3) {
        0qQ.A0B(r3, 0);
        if (!(r3.BoD() == null || r3.BoC() == null)) {
            Integer BoD = r3.BoD();
            if (BoD == null) {
                throw new IllegalStateException("Required value was null.");
            } else if (BoD.intValue() >= 0) {
                Integer BoC = r3.BoC();
                if (BoC == null) {
                    throw new IllegalStateException("Required value was null.");
                } else if (BoC.intValue() > 0) {
                    Integer BoC2 = r3.BoC();
                    if (BoC2 != null) {
                        int intValue = BoC2.intValue();
                        Integer BoD2 = r3.BoD();
                        if (BoD2 == null) {
                            throw new IllegalStateException("Required value was null.");
                        } else if (intValue <= BoD2.intValue()) {
                            return false;
                        } else {
                            return true;
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
        }
        return false;
    }

    public static final AnonymousClass3Q2 A01(UserSession userSession, AnonymousClass3Q2 r5) {
        List list;
        List<AnonymousClass51M> list2;
        AnonymousClass51W r0 = r5.A1P;
        if (r0 != null && (list = (List) r0.A06.getValue()) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((AnonymousClass51M) it.next()).A0O) {
                    Map map = ((C40272AYn) userSession.A01(C40272AYn.class, C41593Ax7.A00)).A00;
                    StringBuilder sb = new StringBuilder();
                    sb.append(r5.A35);
                    AnonymousClass51W r02 = r5.A1P;
                    if (r02 == null || (list2 = (List) r02.A06.getValue()) == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    for (AnonymousClass51M r03 : list2) {
                        int i = 0;
                        if (r03.A0O) {
                            i = 1;
                        }
                        sb.append(i);
                    }
                    String obj = sb.toString();
                    0qQ.A07(obj);
                    Object obj2 = map.get(obj);
                    if (obj2 != null) {
                        AnonymousClass3Q2 r1 = new AnonymousClass3Q2(String.valueOf(System.nanoTime()));
                        r1.A0V(1iA.A0A);
                        r1.A0k(0sr.A1P(new AnonymousClass3Q2[]{(AnonymousClass3Q2) obj2, r5}));
                        r1.A0e(ShareType.CLIPS_WITH_TEMPLATE);
                        return r1;
                    }
                }
            }
        }
        return r5;
    }

    public static final AnonymousClass3Q2 A02(AnonymousClass3Q2 r3) {
        1iA r2 = r3.A1G;
        if (r2 == 1iA.A0A) {
            AnonymousClass3Q2 r22 = (AnonymousClass3Q2) r3.A0L().get(1);
            if (r22.A0E() == ShareType.CLIPS) {
                return r22;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("PendingMedia index 1 is not CLIPS: ");
            sb.append(r22.A0E());
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AnonymousClass000.A00(2407));
        sb2.append(r2);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A04(X.AnonymousClass831 r3) {
        /*
            java.util.ArrayList r1 = r3.A05()
            java.lang.String r0 = "null cannot be cast to non-null type java.util.ArrayList<com.instagram.creation.capture.quickcapture.video.model.IgClipSegment>"
            X.0qQ.A0C(r1, r0)
            boolean r0 = r1 instanceof java.util.Collection
            r3 = 0
            if (r0 == 0) goto L_0x0016
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0016
        L_0x0014:
            r3 = 1
        L_0x0015:
            return r3
        L_0x0016:
            java.util.Iterator r2 = r1.iterator()
        L_0x001a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r1 = r2.next()
            X.51N r1 = (X.AnonymousClass51N) r1
            boolean r0 = r1 instanceof X.AnonymousClass51M
            if (r0 == 0) goto L_0x0015
            X.51M r1 = (X.AnonymousClass51M) r1
            boolean r0 = r1.A0O
            if (r0 == 0) goto L_0x0015
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8YL.A04(X.831):boolean");
    }
}
