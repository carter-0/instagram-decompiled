package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public abstract class AB8 {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(X.C367508qr r16, java.lang.String r17, java.util.List r18, boolean r19) {
        /*
            r1 = 0
            r15 = r17
            r0 = r18
            if (r17 == 0) goto L_0x00b9
            int r2 = r15.length()
            if (r2 == 0) goto L_0x00b9
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r8 = 1
            r2.inJustDecodeBounds = r8
            android.graphics.BitmapFactory.decodeFile(r15, r2)
            int r7 = r2.outWidth
            float r3 = (float) r7
            int r6 = r2.outHeight
            float r2 = (float) r6
            float r3 = r3 / r2
            r2 = r16
            int r13 = r2.A01
            int r14 = r2.A00
            float r9 = (float) r13
            float r10 = (float) r14
            float r2 = r9 / r10
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x002e
            r8 = 0
        L_0x002e:
            java.lang.String r5 = "x#"
            java.lang.String r4 = " output size="
            r3 = 120(0x78, float:1.68E-43)
            java.lang.String r2 = "bitmap size="
            if (r8 != 0) goto L_0x0095
            java.lang.StringBuilder r2 = X.AnonymousClass7TF.A0n(r2)
            r2.append(r7)
            r2.append(r3)
            r2.append(r6)
            r2.append(r4)
            r2.append(r13)
            r2.append(r5)
            r2.append(r14)
            java.lang.String r3 = r2.toString()
            java.lang.String r2 = "ReelImageRegionsUtils_static_overlay_aspect_ratio_does_not_match"
        L_0x0057:
            X.0wb.A03(r2, r3)
        L_0x005a:
            if (r18 == 0) goto L_0x0093
            int r3 = r0.size()
        L_0x0060:
            int r12 = r3 + 1
            r2 = 1073741824(0x40000000, float:2.0)
            float r7 = r9 / r2
            float r8 = r10 / r2
            r11 = 0
            X.5Eq r6 = new X.5Eq
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            X.5Er r14 = X.C282775Er.A07
            java.util.Set r17 = java.util.Collections.singleton(r6)
            X.0qQ.A07(r17)
            r13 = 0
            X.5Eo r12 = new X.5Eo
            r16 = r13
            r12.<init>(r13, r14, r15, r16, r17)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            if (r18 == 0) goto L_0x0088
            r2.addAll(r0)
        L_0x0088:
            if (r19 == 0) goto L_0x008b
            r1 = r3
        L_0x008b:
            r2.add(r1, r12)
            java.util.List r0 = X.00k.A0a(r2)
            return r0
        L_0x0093:
            r3 = 0
            goto L_0x0060
        L_0x0095:
            if (r7 < r13) goto L_0x0099
            if (r6 >= r14) goto L_0x005a
        L_0x0099:
            java.lang.StringBuilder r2 = X.AnonymousClass7TF.A0n(r2)
            r2.append(r7)
            r2.append(r3)
            r2.append(r6)
            r2.append(r4)
            r2.append(r13)
            r2.append(r5)
            r2.append(r14)
            java.lang.String r3 = r2.toString()
            java.lang.String r2 = "ReelImageRegionsUtils_static_overlay_low_quality"
            goto L_0x0057
        L_0x00b9:
            if (r18 == 0) goto L_0x00c0
            java.util.List r0 = X.00k.A0a(r0)
            return r0
        L_0x00c0:
            X.0sn r0 = X.0sn.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AB8.A00(X.8qr, java.lang.String, java.util.List, boolean):java.util.List");
    }

    public static final void A01(UserSession userSession, AnonymousClass3Q2 r15, Map map) {
        C2802350v r0;
        C2802350v r1;
        C40607Aev aev;
        0qQ.A0B(userSession, 0);
        Map map2 = map;
        AnonymousClass7TG.A1Q(map2, r15);
        ArrayList A00 = C394859yo.A00(userSession, map2);
        r15.A4a = A00;
        AWT awt = AWT.A00;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            C282745Eo r2 = (C282745Eo) it.next();
            if (r2.A03 == C282775Er.A09) {
                AnonymousClass513 r02 = r2.A04;
                if (r02 != null) {
                    r0 = r02.A00();
                } else {
                    r0 = null;
                }
                if (r0 instanceof C40607Aev) {
                    AnonymousClass513 r03 = r2.A04;
                    if (r03 != null) {
                        r1 = r03.A00();
                    } else {
                        r1 = null;
                    }
                    if ((r1 instanceof C40607Aev) && (aev = (C40607Aev) r1) != null && awt.apply(aev)) {
                        A1C.add(aev.A06.A0X);
                    }
                }
            }
        }
        if (!A1C.isEmpty()) {
            AnonymousClass3QS r22 = new AnonymousClass3QS(0.0f, 31);
            Iterator it2 = A1C.iterator();
            while (it2.hasNext()) {
                AnonymousClass51I r3 = new AnonymousClass51I((MediaEffect) null, AnonymousClass51J.VIDEO_STICKER, (Float) null, (String) it2.next(), (String) null, (String) null, 1.0f, 1.0f, 0, 0, -1);
                0qQ.A0B(r3, 0);
                r22.A03.add(r3);
            }
            r15.A1V = r22;
        }
    }
}
