package X;

import android.content.Context;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.AAj  reason: case insensitive filesystem */
public abstract class C39812AAj {
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009f, code lost:
        if (r3 == null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a1, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (r3 == null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        r21 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a1 A[EDGE_INSN: B:36:0x00a1->B:26:0x00a1 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C349307zv A01(X.AnonymousClass831 r21, X.2Nn r22) {
        /*
            r15 = 0
            r4 = r21
            r7 = r22
            boolean r2 = X.AnonymousClass7TF.A1U(r15, r4, r7)
            long r16 = java.lang.System.currentTimeMillis()
            java.util.ArrayList r8 = r4.A05()
            java.util.Iterator r5 = r8.iterator()
        L_0x0015:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r3 = r5.next()
            r1 = r3
            X.51N r1 = (X.AnonymousClass51N) r1
            boolean r0 = r1 instanceof X.AnonymousClass51M
            if (r0 == 0) goto L_0x0015
            X.51M r1 = (X.AnonymousClass51M) r1
            X.51R r0 = r1.A0F
            int r0 = r0.A08
            if (r0 != 0) goto L_0x0015
            r21 = 0
            if (r3 != 0) goto L_0x0034
        L_0x0032:
            r21 = 1
        L_0x0034:
            java.util.List r0 = r4.A01
            int r0 = r0.size()
            if (r0 != r2) goto L_0x00a7
            X.51O r1 = r4.A04(r15)
            boolean r0 = r1 instanceof X.AnonymousClass51M
            if (r0 == 0) goto L_0x00a7
            X.51M r1 = (X.AnonymousClass51M) r1
            if (r1 == 0) goto L_0x00a7
            X.51R r0 = r1.A0F
            int r3 = r0.A09
            int r1 = r0.A05
        L_0x004e:
            r12 = 0
            java.lang.String r6 = "virtual_stitched_video"
            java.lang.String r5 = ".mp4"
            java.io.File r0 = r7.C4W()
            java.io.File r10 = java.io.File.createTempFile(r6, r5, r0)
            X.0qQ.A07(r10)
            int r0 = r4.hashCode()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r13 = 1080(0x438, float:1.513E-42)
            r14 = 1920(0x780, float:2.69E-42)
            X.7zv r9 = new X.7zv
            r18 = r16
            r20 = r15
            r22 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22)
            r9.A0B = r3
            r9.A0A = r1
            int r0 = r4.A00
            r9.A07 = r0
            r9.A0H = r15
            r9.A06 = r0
            java.util.Iterator r4 = r8.iterator()
        L_0x0085:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00a1
            java.lang.Object r3 = r4.next()
            r1 = r3
            X.51N r1 = (X.AnonymousClass51N) r1
            boolean r0 = r1 instanceof X.AnonymousClass51M
            if (r0 == 0) goto L_0x0085
            X.51M r1 = (X.AnonymousClass51M) r1
            X.51R r0 = r1.A0F
            boolean r0 = r0.A0K
            if (r0 == 0) goto L_0x0085
            r0 = 1
            if (r3 != 0) goto L_0x00a2
        L_0x00a1:
            r0 = 0
        L_0x00a2:
            r9.A1L = r0
            r9.A19 = r2
            return r9
        L_0x00a7:
            r3 = 0
            r1 = 0
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39812AAj.A01(X.831, X.2Nn):X.7zv");
    }

    public static final MediaComposition A00(Context context, C357608Yw r18, UserSession userSession, AnonymousClass831 r20, AnonymousClass3QS r21, List list, List list2, float f) {
        ImmutableList of;
        ArrayList A05 = r20.A05();
        0Tu r4 = 0Tu.A05;
        UserSession userSession2 = userSession;
        boolean A06 = 182.A06(r4, userSession2, 36316254885122235L);
        ImmutableList A02 = AnonymousClass51Q.A02(A05, true);
        if (r21 != null) {
            of = AHJ.A02(r21);
        } else {
            of = ImmutableList.of();
            0qQ.A07(of);
        }
        Context context2 = context;
        ImmutableList A00 = AnonymousClass51Q.A00(C365998o1.A00(context2, A06), new C366518pA(false), A05);
        0qQ.A0B(A02, 1);
        C41723AzE azE = C41723AzE.A00;
        C365998o1 A002 = C365998o1.A00(context2, true);
        C366518pA r7 = new C366518pA(false);
        boolean A062 = 182.A06(r4, userSession2, 36327559239055872L);
        0qQ.A0B(azE, 2);
        return new MediaComposition(AHK.A00(A002, r7, of, A02, A00, r18, list, list2, azE, f, 0.5625f, 0, true, A062));
    }
}
