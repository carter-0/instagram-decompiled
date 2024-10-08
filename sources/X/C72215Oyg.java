package X;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Oyg  reason: case insensitive filesystem */
public final class C72215Oyg implements 0lm {
    public 1NW A00;
    public final Context A01;
    public final 0wc A02;
    public final 1wn A03 = C71932OtG.A00(this, 35);
    public final UserSession A04;
    public final Map A05 = AnonymousClass7TE.A1E();

    public static final AnonymousClass5HJ A00(C72215Oyg oyg, String str) {
        Map map = oyg.A05;
        AnonymousClass5HJ r3 = (AnonymousClass5HJ) map.remove(str);
        if (map.isEmpty()) {
            AnonymousClass1Nd.A00(oyg.A04).A02(oyg.A03, 2Kb.class);
        }
        return r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d0, code lost:
        if (r14 != null) goto L_0x00d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass5HJ r34, X.C254703su r35, X.C72215Oyg r36) {
        /*
            r0 = r36
            com.instagram.common.session.UserSession r6 = r0.A04
            X.17i r2 = X.17h.A00(r6)
            r10 = r35
            java.lang.String r1 = r10.A1u
            com.instagram.user.model.User r17 = r2.A02(r1)
            if (r17 == 0) goto L_0x00f7
            X.3t0 r1 = r10.A0U()
            r9 = 0
            if (r1 == 0) goto L_0x011b
            java.lang.String r2 = r1.A00
            if (r2 == 0) goto L_0x011b
            X.2Dm r1 = X.1bJ.A00(r6)
            X.3U9 r16 = X.C66580MXl.A0d(r1, r2)
            if (r16 == 0) goto L_0x011d
            boolean r1 = r16.CUG()
            if (r1 != 0) goto L_0x011d
            X.0eP r1 = new X.0eP
            r1.<init>(r9, r9)
        L_0x0032:
            java.lang.Object r8 = r1.A00
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r7 = r1.A01
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r4 = 0
            if (r16 == 0) goto L_0x0114
            X.4jH r1 = r16.C6F()
            if (r1 == 0) goto L_0x0114
            com.instagram.model.mediasize.ImageInfoImpl r1 = r1.A00
            java.util.List r1 = r1.A03
            if (r1 == 0) goto L_0x0114
            java.lang.Object r1 = X.00k.A0O(r1, r4)
            com.instagram.model.mediasize.ExtendedImageUrl r1 = (com.instagram.model.mediasize.ExtendedImageUrl) r1
            if (r1 == 0) goto L_0x0114
            java.lang.String r13 = r1.A0A
        L_0x0053:
            android.content.Context r3 = r0.A01
            boolean r1 = r16.CY7()
            if (r1 == 0) goto L_0x0111
            java.lang.String r2 = r16.C6f()
        L_0x005f:
            java.util.List r1 = r16.BRZ()
            java.lang.String r28 = X.AnonymousClass48N.A08(r3, r6, r2, r1, r4)
        L_0x0067:
            java.lang.Object r6 = r10.A1T
            boolean r1 = r6 instanceof java.lang.String
            if (r1 == 0) goto L_0x010e
            java.lang.String r6 = (java.lang.String) r6
        L_0x006f:
            java.lang.String r4 = ""
            if (r6 != 0) goto L_0x0074
            r6 = r4
        L_0x0074:
            java.lang.Object r3 = r10.A1U
            boolean r1 = r3 instanceof X.C300925yB
            if (r1 == 0) goto L_0x010c
            X.5yB r3 = (X.C300925yB) r3
            if (r3 == 0) goto L_0x010c
            X.1iA r2 = r3.A01
            X.1iA r1 = X.1iA.A0Q
            if (r2 != r1) goto L_0x00fd
            boolean r1 = r3.A05()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x015a
            java.lang.String r1 = r3.A07
            if (r1 == 0) goto L_0x0155
            com.instagram.common.typedurl.SimpleImageUrl r15 = X.JTQ.A0G(r1)
        L_0x0094:
            java.lang.Object r2 = r10.A1T
            boolean r1 = r2 instanceof X.1Xj
            if (r1 == 0) goto L_0x00fb
            X.1Xj r2 = (X.1Xj) r2
            if (r2 == 0) goto L_0x00fb
            com.instagram.common.typedurl.ImageUrl r14 = r2.A1Q()
        L_0x00a2:
            X.OZC r18 = X.OZC.A01
            android.content.Context r12 = r0.A01
            r1 = r34
            java.lang.String r11 = r1.A0j
            java.lang.String r23 = r17.B8Q()
            X.2FW r3 = r10.A10
            X.2FW r2 = X.2FW.A1g
            if (r3 == r2) goto L_0x00b5
            r6 = r4
        L_0x00b5:
            java.lang.String r5 = r1.A0r
            java.lang.String r4 = r1.A1G
            if (r4 != 0) goto L_0x00bd
            java.lang.String r4 = r1.A1F
        L_0x00bd:
            java.lang.String r3 = r1.A1E
            if (r16 == 0) goto L_0x00f8
            boolean r36 = r16.CUG()
        L_0x00c5:
            java.lang.String r29 = r10.A0g()
            java.lang.String r2 = r10.A1u
            java.lang.String r1 = r1.A12
            if (r15 != 0) goto L_0x00d2
            r15 = r14
            if (r14 == 0) goto L_0x00d6
        L_0x00d2:
            java.lang.String r9 = r15.getUrl()
        L_0x00d6:
            X.0wc r0 = r0.A02
            r25 = r5
            r26 = r4
            r27 = r3
            r30 = r2
            r31 = r1
            r32 = r13
            r33 = r9
            r34 = r8
            r35 = r7
            r20 = r0
            r21 = r10
            r22 = r11
            r24 = r6
            r19 = r12
            r18.A01(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
        L_0x00f7:
            return
        L_0x00f8:
            r36 = 0
            goto L_0x00c5
        L_0x00fb:
            r14 = r9
            goto L_0x00a2
        L_0x00fd:
            boolean r1 = r3.A05()
            if (r1 == 0) goto L_0x0164
            java.lang.String r1 = r3.A08
            if (r1 == 0) goto L_0x015f
            com.instagram.common.typedurl.SimpleImageUrl r15 = X.JTQ.A0G(r1)
            goto L_0x0094
        L_0x010c:
            r15 = r9
            goto L_0x0094
        L_0x010e:
            r6 = r9
            goto L_0x006f
        L_0x0111:
            r2 = r9
            goto L_0x005f
        L_0x0114:
            r13 = r9
            if (r16 != 0) goto L_0x0053
            r28 = r9
            goto L_0x0067
        L_0x011b:
            r16 = r9
        L_0x011d:
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            if (r16 == 0) goto L_0x014f
            java.util.List r1 = r16.BRZ()
            java.util.Iterator r4 = r1.iterator()
        L_0x012f:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x014f
            com.instagram.user.model.User r3 = X.DbT.A0k(r4)
            java.lang.String r1 = r3.B8Q()
            r7.add(r1)
            int r2 = r5.size()
            r1 = 2
            if (r2 >= r1) goto L_0x012f
            java.lang.String r1 = X.DbU.A0p(r3)
            r5.add(r1)
            goto L_0x012f
        L_0x014f:
            X.0eP r1 = X.AnonymousClass7TE.A1L(r7, r5)
            goto L_0x0032
        L_0x0155:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x015a:
            java.lang.IllegalStateException r0 = X.DbT.A0m()
            throw r0
        L_0x015f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0164:
            java.lang.IllegalStateException r0 = X.DbT.A0m()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72215Oyg.A01(X.5HJ, X.3su, X.Oyg):void");
    }

    public final void onUserSessionWillEnd(boolean z) {
        AnonymousClass1Nd.A00(this.A04).A02(this.A03, 2Kb.class);
    }

    public C72215Oyg(Context context, 0wc r4, UserSession userSession) {
        this.A01 = context;
        this.A04 = userSession;
        this.A02 = r4;
        HandlerThread handlerThread = new HandlerThread("StellaMessageNotificationHandler");
        AnonymousClass0fe.A00(handlerThread);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        0qQ.A07(looper);
        this.A00 = new 1NW(looper);
    }
}
