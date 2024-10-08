package X;

import android.content.Context;
import android.graphics.Point;
import android.util.Pair;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;

public final class SUW {
    public static final SUW A00 = new Object();

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.TdG] */
    public static final C7945Qdm A02(Context context, UserSession userSession, File file, boolean z, boolean z2) {
        B2V aVm;
        File file2 = file;
        0qQ.A0B(file, 1);
        UserSession userSession2 = userSession;
        if ((z || !182.A06(0Tu.A05, userSession, 36330990917993324L)) && !182.A06(0Tu.A05, userSession, 36330990917927787L)) {
            aVm = new C40194AVj(context, userSession);
        } else {
            aVm = new C40197AVm(context, userSession);
        }
        C40201AVr A002 = AAK.A00(context, aVm, userSession);
        return new C7945Qdm(new Object(), A002, new C12374SsN(new C7257Q1f(), A002), userSession2, file2, true, z2);
    }

    public static final C11354SOn A04(Context context, C10570RuP ruP, ClipInfo clipInfo) {
        C7232Q0d A02;
        0qQ.A0B(clipInfo, 0);
        String str = clipInfo.A0F;
        if (str == null || (A02 = SRj.A02(context, str, false)) == null) {
            return null;
        }
        Pair A022 = SKY.A02(A02, ruP);
        Object obj = A022.first;
        0qQ.A06(obj);
        int A0M = AnonymousClass7TE.A0M(obj);
        Object obj2 = A022.second;
        0qQ.A06(obj2);
        int A0M2 = AnonymousClass7TE.A0M(obj2);
        int i = clipInfo.A09;
        int i2 = clipInfo.A06;
        int i3 = i;
        if (i < i2) {
            i3 = i2;
        }
        if (i3 > A0M) {
            i3 = A0M;
        }
        C11354SOn sOn = new C11354SOn();
        sOn.A02 = 30;
        sOn.A03 = 10;
        sOn.A01 = A0M2;
        sOn.A04 = A0M2;
        SSg.A04(sOn, ((float) i) / ((float) i2), i3);
        return sOn;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r7.A06 != true) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C10862RzN A07(android.content.Context r6, X.N4L r7, X.C13834Ti9 r8, X.C10249Rp9 r9, com.instagram.common.session.UserSession r10, com.instagram.pendingmedia.model.ClipInfo r11, X.SSv r12, java.lang.String r13, boolean r14) {
        /*
            r3 = 0
            X.0qQ.A0B(r11, r3)
            r2 = 1
            if (r7 == 0) goto L_0x0011
            X.RuP r0 = X.C9593RdX.A00(r7)
            X.SOn r5 = A04(r6, r0, r11)
            if (r5 != 0) goto L_0x0015
        L_0x0011:
            X.SOn r5 = A05(r12)
        L_0x0015:
            r4 = 1
            if (r7 == 0) goto L_0x001d
            boolean r1 = r7.A06
            r0 = 1
            if (r1 == r2) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            r5.A0M = r0
            X.SQv r2 = new X.SQv
            r2.<init>()
            r2.A0F = r13
            r2.A06 = r5
            r2.A0H = r14
            int r0 = r11.A07
            long r0 = (long) r0
            r2.A04 = r0
            int r0 = r11.A05
            long r0 = (long) r0
            r2.A00 = r0
            r2.A07 = r8
            if (r14 != 0) goto L_0x0067
            if (r9 == 0) goto L_0x0067
        L_0x003b:
            r2.A0Q = r4
            java.lang.String r1 = r11.A0F
            java.lang.String r0 = "Required value was null."
            if (r1 == 0) goto L_0x0069
            if (r9 == 0) goto L_0x0060
            com.facebook.videolite.transcoder.base.composition.MediaComposition r1 = r9.A00
            r2.A08 = r1
            boolean r0 = X.1KU.A0E(r10)
            java.util.HashSet r0 = X.S8R.A00(r1, r0)
            r2.A0G = r0
            X.QeC r0 = new X.QeC
            r0.<init>(r10, r3)
            r2.A0B = r0
        L_0x005a:
            X.RzN r0 = new X.RzN
            r0.<init>(r2)
            return r0
        L_0x0060:
            java.io.File r0 = X.C266784aL.A01(r6, r1)
            r2.A0D = r0
            goto L_0x005a
        L_0x0067:
            r4 = 0
            goto L_0x003b
        L_0x0069:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SUW.A07(android.content.Context, X.N4L, X.Ti9, X.Rp9, com.instagram.common.session.UserSession, com.instagram.pendingmedia.model.ClipInfo, X.SSv, java.lang.String, boolean):X.RzN");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        if (r9.isEmpty() != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 != false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ae, code lost:
        if (X.182.A06(X.0Tu.A05, r14, 36326232094488204L) != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c0, code lost:
        if (r4 > r2) goto L_0x00c2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C10249Rp9 A08(android.content.Context r13, com.instagram.common.session.UserSession r14, X.AnonymousClass3Q2 r15) {
        /*
            r3 = 1
            X.SUW r2 = A00
            java.util.List r0 = r15.A4a
            if (r0 == 0) goto L_0x000e
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            r9 = r0 ^ 1
            com.instagram.camera.effect.models.CameraAREffect r0 = r15.A10
            r6 = 1
            boolean r5 = X.AnonymousClass7TF.A1V(r0)
            r1 = 0
            com.instagram.pendingmedia.model.ClipInfo r0 = r15.A1N
            float r0 = r0.A01
            boolean r4 = r2.A0E(r14, r1, r0)
            if (r9 != 0) goto L_0x0025
            if (r5 == 0) goto L_0x00b1
        L_0x0025:
            X.51W r0 = r15.A1P
            if (r0 == 0) goto L_0x00a1
            java.util.List r0 = r0.A04
            java.util.Iterator r2 = r0.iterator()
        L_0x002f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a1
            java.lang.Object r0 = r2.next()
            X.9IE r0 = (X.AnonymousClass9IE) r0
            java.lang.Object r1 = r0.A00
            X.51N r1 = (X.AnonymousClass51N) r1
            boolean r0 = r1 instanceof X.AnonymousClass51M
            if (r0 == 0) goto L_0x002f
            X.51M r1 = (X.AnonymousClass51M) r1
            X.51R r0 = r1.A0F
            boolean r0 = r0.A0K
            if (r0 == 0) goto L_0x002f
        L_0x004b:
            X.1ZI r0 = X.AnonymousClass1ZI.A00
            if (r0 == 0) goto L_0x00e1
            X.51W r1 = r15.A1P
            if (r1 == 0) goto L_0x00dc
            X.2Nn r0 = X.2Nm.A00(r13, r14)
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = X.AHJ.A01(r13, r14, r1, r0, r3)
            X.4aP r7 = r0.A03()
            X.4aE r8 = X.C266714aE.VIDEO
            if (r9 == 0) goto L_0x00b3
            if (r5 != 0) goto L_0x00b3
            java.util.List r9 = r15.A4a
            if (r9 == 0) goto L_0x0070
            boolean r1 = r9.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0071
        L_0x0070:
            r0 = 1
        L_0x0071:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = -1
            if (r0 != 0) goto L_0x00c2
            java.util.Iterator r11 = r9.iterator()
        L_0x007e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00be
            java.lang.Object r0 = r11.next()
            X.5Eo r0 = (X.C282745Eo) r0
            X.A5d r1 = r0.A02
            if (r1 == 0) goto L_0x007e
            int r0 = r1.A01
            int r10 = r1.A00
            if (r0 >= r10) goto L_0x007e
            long r0 = (long) r0
            int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x009a
            r4 = r0
        L_0x009a:
            long r0 = (long) r10
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 >= 0) goto L_0x007e
            r2 = r0
            goto L_0x007e
        L_0x00a1:
            if (r4 == 0) goto L_0x00b1
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326232094488204(0x810e840005368c, double:3.0361936783256614E-306)
            boolean r0 = X.182.A06(r2, r14, r0)
            if (r0 == 0) goto L_0x00b1
            goto L_0x004b
        L_0x00b1:
            r6 = 0
            goto L_0x004b
        L_0x00b3:
            r11 = -1
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.4aF r9 = new X.4aF
            r13 = r11
            r9.<init>(r10, r11, r13)
            goto L_0x00c9
        L_0x00be:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c3
        L_0x00c2:
            r4 = r2
        L_0x00c3:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.4aF r9 = X.Pxe.A0V(r0, r4, r2)
        L_0x00c9:
            X.Lc0 r0 = new X.Lc0
            r0.<init>(r15, r6)
            r7.A01(r9, r8, r0)
            com.facebook.videolite.transcoder.base.composition.MediaComposition r1 = new com.facebook.videolite.transcoder.base.composition.MediaComposition
            r1.<init>(r7)
            X.Rp9 r0 = new X.Rp9
            r0.<init>(r1)
            return r0
        L_0x00dc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00e1:
            java.lang.String r0 = "instance"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SUW.A08(android.content.Context, com.instagram.common.session.UserSession, X.3Q2):X.Rp9");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
        if (r0 != false) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C10249Rp9 A09(android.content.Context r10, com.instagram.common.session.UserSession r11, X.AnonymousClass3Q2 r12, java.lang.String r13) {
        /*
            r0 = 3
            r8 = r13
            X.0qQ.A0B(r13, r0)
            com.instagram.pendingmedia.model.ClipInfo r2 = r12.A1N
            int r1 = r2.A07
            int r0 = r2.A05
            boolean r9 = r2.A0M
            X.3QS r7 = r12.A1V
            long r2 = (long) r1
            long r0 = (long) r0
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.4aF r6 = X.Pxe.A0V(r4, r2, r0)
            boolean r2 = r12.A57
            com.instagram.camera.effect.models.CameraAREffect r0 = r12.A10
            r3 = 1
            boolean r1 = X.AnonymousClass7TF.A1V(r0)
            com.instagram.pendingmedia.model.ClipInfo r0 = r12.A1N
            float r5 = r0.A01
            if (r2 != 0) goto L_0x0028
            if (r1 == 0) goto L_0x007c
        L_0x0028:
            if (r9 != 0) goto L_0x007c
            X.SUW r4 = A00
            X.28D r1 = r12.A0i
            X.28D r0 = X.28D.A2V
            if (r1 != r0) goto L_0x0065
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326232094160521(0x810e8400003689, double:3.0361936781184334E-306)
            boolean r0 = X.182.A06(r2, r11, r0)
            if (r0 == 0) goto L_0x007c
            boolean r0 = r4.A0E(r11, r13, r5)
        L_0x0043:
            if (r0 == 0) goto L_0x007c
        L_0x0045:
            X.SUW r4 = A00
            r5 = r10
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = r4.A06(r5, r6, r7, r8, r9)
            X.4aP r2 = r0.A03()
            X.4aE r1 = X.C266714aE.VIDEO
            X.Lc0 r0 = new X.Lc0
            r0.<init>(r12, r3)
            r2.A03(r1, r0)
            com.facebook.videolite.transcoder.base.composition.MediaComposition r1 = new com.facebook.videolite.transcoder.base.composition.MediaComposition
            r1.<init>(r2)
            X.Rp9 r0 = new X.Rp9
            r0.<init>(r1)
            return r0
        L_0x0065:
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x007c
            boolean r0 = r4.A0E(r11, r13, r5)
            if (r0 == 0) goto L_0x007c
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326232094357130(0x810e840003368a, double:3.03619367824277E-306)
            boolean r0 = X.182.A06(r2, r11, r0)
            goto L_0x0043
        L_0x007c:
            r3 = 0
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SUW.A09(android.content.Context, com.instagram.common.session.UserSession, X.3Q2, java.lang.String):X.Rp9");
    }

    @Deprecated(message = "FilterKit has been deprecated, please use one camera ")
    public static final C10249Rp9 A0A(Context context, ClipInfo clipInfo, AnonymousClass3QS r11, String str) {
        AnonymousClass3QS r6 = r11;
        String str2 = str;
        AnonymousClass7TG.A1Q(r11, str);
        if (clipInfo == null) {
            return null;
        }
        C266724aF A0V = Pxe.A0V(TimeUnit.MILLISECONDS, (long) clipInfo.A07, (long) clipInfo.A05);
        if (!AnonymousClass7TE.A1b(r11.A03) || r11.A04) {
            return null;
        }
        return new C10249Rp9(A00.A06(context, A0V, r6, str2, false));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.SHv, java.lang.Object] */
    public static final C13778Tgt A00(Context context, C7945Qdm qdm, C10862RzN rzN, UserSession userSession) {
        ? obj = new Object();
        obj.A0C = rzN;
        obj.A00 = context;
        obj.A04 = qdm.A00;
        obj.A05 = null;
        obj.A07 = qdm.A00;
        obj.A0E = Executors.newCachedThreadPool();
        obj.A0A = qdm.A03;
        obj.A08 = qdm.A01;
        obj.A09 = qdm.A02;
        obj.A02 = new C12302Sr5(true, 1280);
        obj.A0B = qdm.A01;
        return C7255Q1d.A00(obj, userSession);
    }

    public static final C11354SOn A05(SSv sSv) {
        Point point = sSv.A00;
        0qQ.A07(point);
        int i = point.x;
        int i2 = point.y;
        C11354SOn sOn = new C11354SOn();
        sOn.A0C = i;
        sOn.A0A = i2;
        int A04 = sSv.A04();
        sOn.A04 = A04;
        sOn.A01 = A04;
        sOn.A02 = 30;
        sOn.A03 = 4;
        return sOn;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [com.facebook.videolite.transcoder.base.composition.MediaEffect, java.lang.Object, X.Srf] */
    /* JADX WARNING: type inference failed for: r0v33, types: [com.facebook.videolite.transcoder.base.composition.MediaEffect, java.lang.Object, X.Srf] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.facebook.videolite.transcoder.base.composition.MediaComposition A06(android.content.Context r16, X.C266724aF r17, X.AnonymousClass3QS r18, java.lang.String r19, boolean r20) {
        /*
            r15 = this;
            r3 = r18
            float r5 = r3.A00
            X.4aP r2 = new X.4aP
            r2.<init>()
            java.io.File r6 = X.AnonymousClass7TE.A0t(r19)
            r4 = r17
            if (r20 == 0) goto L_0x00dc
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r7 = X.Pxg.A0E(r4, r0)
            int r1 = (int) r7
            X.4aE r0 = X.C266714aE.VIDEO
            X.4aJ r7 = new X.4aJ
            r7.<init>(r0)
            X.4aH r5 = new X.4aH
            r5.<init>(r6)
            long r0 = X.Pxf.A0E(r1)
            r5.A02 = r0
            X.Pxg.A1K(r4, r7, r5)
        L_0x002d:
            X.Pxf.A1F(r2, r7)
        L_0x0030:
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = X.Pxg.A0E(r4, r7)
            int r6 = (int) r0
            java.util.List r1 = r3.A03
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x011c
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x011c
            java.util.Iterator r14 = r1.iterator()
        L_0x0047:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x011c
            java.lang.Object r11 = r14.next()
            X.51I r11 = (X.AnonymousClass51I) r11
            float r5 = r11.A00
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0047
            int r0 = r11.A03
            long r3 = (long) r0
            long r0 = (long) r6
            X.4aF r9 = X.Pxe.A0V(r7, r3, r0)
            int r1 = r11.A02
            long r3 = (long) r1
            int r1 = r1 + r6
            int r0 = r11.A03
            int r1 = r1 - r0
            long r0 = (long) r1
            X.4aF r10 = X.Pxe.A0V(r7, r3, r0)
            java.lang.String r0 = r11.A05
            java.io.File r8 = X.AnonymousClass7TE.A0t(r0)
            boolean r0 = r8.exists()
            if (r0 == 0) goto L_0x00b0
            boolean r0 = r8.canRead()
            if (r0 == 0) goto L_0x00b0
            long r12 = r8.length()
            r3 = 0
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b0
            X.4aE r12 = X.C266714aE.AUDIO
            int r0 = r11.A03
            long r0 = (long) r0
            long r0 = r7.toMicros(r0)
            java.lang.String r4 = ""
            X.4aJ r3 = new X.4aJ
            r3.<init>(r12, r4, r0)
            X.4aH r0 = new X.4aH
            r0.<init>(r8)
            X.Pxg.A1K(r10, r3, r0)
            X.Srf r0 = new X.Srf
            r0.<init>()
            r0.A00 = r5
            X.SIO.A00(r9, r0, r3)
            X.Pxf.A1F(r2, r3)
            goto L_0x0047
        L_0x00b0:
            java.lang.String r5 = r8.getPath()
            boolean r0 = r8.exists()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r8.canRead()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            long r0 = r8.length()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "invalid audio file: path:%s exists:%s canRead:%s length:%s"
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r5, r4, r3, r1)
            X.0qQ.A07(r1)
            java.lang.String r0 = "IgTranscodeUtil"
            X.0wb.A03(r0, r1)
            goto L_0x0047
        L_0x00dc:
            X.4aE r0 = X.C266714aE.VIDEO
            X.4aJ r1 = new X.4aJ
            r1.<init>(r0)
            X.4aH r0 = new X.4aH
            r0.<init>(r6)
            r0.A03 = r4
            X.Pxh.A1F(r2, r1, r0)
            r0 = 0
            X.Q1i r1 = new X.Q1i
            r7 = r16
            r1.<init>(r7, r0)
            android.net.Uri r0 = android.net.Uri.fromFile(r6)
            X.Q0d r0 = r1.AU7(r0)
            boolean r0 = r0.A0K
            if (r0 == 0) goto L_0x0030
            X.4aE r0 = X.C266714aE.AUDIO
            X.4aJ r7 = new X.4aJ
            r7.<init>(r0)
            X.4aH r0 = new X.4aH
            r0.<init>(r6)
            X.Pxg.A1K(r4, r7, r0)
            X.Srf r0 = new X.Srf
            r0.<init>()
            r0.A00 = r5
            X.SIO.A00(r4, r0, r7)
            goto L_0x002d
        L_0x011c:
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = new com.facebook.videolite.transcoder.base.composition.MediaComposition
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SUW.A06(android.content.Context, X.4aF, X.3QS, java.lang.String, boolean):com.facebook.videolite.transcoder.base.composition.MediaComposition");
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [X.SHv, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v41, types: [X.Tfu, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v2, types: [java.lang.Object, com.instagram.pendingmedia.model.ClipInfo] */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02d7, code lost:
        if (X.1KU.A0F(r4) != false) goto L_0x02d9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02bf A[Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02f9 A[Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0319 A[Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0321 A[Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x036e A[Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0384 A[Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0268 A[Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0280 A[Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0281 A[Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02a8 A[Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02be A[Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }] */
    @kotlin.Deprecated(message = "stitching is deprecated, use [MediaComposition] instead.")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.instagram.pendingmedia.model.ClipInfo A0B(android.content.Context r29, com.instagram.common.session.UserSession r30, X.AnonymousClass3Q2 r31) {
        /*
            r4 = r31
            boolean r0 = r4.A61
            com.instagram.pendingmedia.model.ClipInfo r10 = r4.A1N
            if (r0 != 0) goto L_0x047c
            X.51W r0 = r4.A1P
            if (r0 == 0) goto L_0x047c
            r9 = 0
            X.0qQ.A0B(r10, r9)
            boolean r0 = r10.A0M
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = r10.A0D
        L_0x0016:
            if (r0 == 0) goto L_0x0465
            long r1 = X.Pxf.A0F(r0)
            r16 = 0
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x047c
            X.1ZI r0 = X.AnonymousClass1ZI.A00
            if (r0 == 0) goto L_0x045b
            java.lang.String r25 = "Required value was null."
            X.51W r12 = r4.A1P
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r3 = r4.A16
            java.lang.String r8 = r4.A3t
            r24 = 1
            r23 = 2
            if (r12 == 0) goto L_0x0453
            java.util.List r14 = r12.A01()
            X.833 r7 = new X.833
            r13 = r30
            r7.<init>(r13)
            r11 = r29
            X.2Nn r5 = X.2Nm.A00(r11, r13)
            com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec r15 = X.AnonymousClass72R.A00(r11, r13)
            java.lang.String r6 = "Stitching Type: MEDIA_COMPOSITION"
            goto L_0x004f
        L_0x004c:
            java.lang.String r0 = r10.A0F
            goto L_0x0016
        L_0x004f:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.util.Iterator r4 = r14.iterator()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
        L_0x0057:
            boolean r0 = r4.hasNext()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r0 == 0) goto L_0x0069
            java.lang.Object r1 = r4.next()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            boolean r0 = r1 instanceof X.KN4     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r0 == 0) goto L_0x0057
            r2.add(r1)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            goto L_0x0057
        L_0x0069:
            boolean r0 = r2.isEmpty()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r0 == 0) goto L_0x0361
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.util.Iterator r2 = r14.iterator()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
        L_0x0077:
            boolean r0 = r2.hasNext()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r0 == 0) goto L_0x0089
            java.lang.Object r1 = r2.next()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            boolean r0 = r1 instanceof X.AnonymousClass51M     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r0 == 0) goto L_0x0077
            r4.add(r1)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            goto L_0x0077
        L_0x0089:
            java.lang.Object r0 = r4.get(r9)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.51M r0 = (X.AnonymousClass51M) r0     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.51R r0 = r0.A0F     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.lang.String r0 = r0.A0F     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.io.File r2 = X.AnonymousClass7TE.A0t(r0)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r0 = r24
            X.0qQ.A0B(r5, r0)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.io.File r1 = r5.A01()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.io.File r0 = r2.getParentFile()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r0 == 0) goto L_0x035c
            java.lang.String r0 = r0.getName()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.io.File r2 = X.JTO.A0s(r1, r0)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.lang.String r0 = "stitched"
            r1.append(r0)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r1.append(r0)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.lang.String r0 = ".mp4"
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.C357818Zu.A00(r2)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.io.File r22 = X.JTO.A0s(r2, r0)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r3 == 0) goto L_0x01a3
            int r0 = r3.A07     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            int r0 = r3.A06     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.0eP r1 = X.AnonymousClass7TF.A0x(r1, r0)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
        L_0x00da:
            java.lang.Object r0 = r1.A00     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            int r29 = X.AnonymousClass7TE.A0M(r0)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.lang.Object r0 = r1.A01     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            int r30 = X.AnonymousClass7TE.A0M(r0)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r21 = 0
            com.facebook.videolite.transcoder.base.composition.MediaComposition r5 = X.AHJ.A01(r11, r13, r12, r5, r9)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            com.google.common.collect.ImmutableList r14 = X.DbU.A0K(r4)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.util.List r0 = r12.A03     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r0 != 0) goto L_0x00f6
            X.0sn r0 = X.0sn.A00     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
        L_0x00f6:
            com.google.common.collect.ImmutableList r20 = X.DbU.A0K(r0)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r8 != 0) goto L_0x0100
            java.lang.String r8 = X.JTQ.A0Z()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
        L_0x0100:
            java.lang.String r13 = "Failure when transcoding video"
            r0 = 7
            X.0qQ.A0B(r8, r0)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            com.instagram.common.session.UserSession r4 = r7.A00     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.0Tu r12 = X.0Tu.A05     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r0 = 36317019389301515(0x8106230000130b, double:3.030367526469013E-306)
            boolean r0 = X.182.A06(r12, r4, r0)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r0 == 0) goto L_0x019c
            X.SrA r0 = new X.SrA     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r0.<init>(r4, r8)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
        L_0x011a:
            X.7rW r1 = X.C343457qF.A00(r4)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.7r6 r2 = r1.A00     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r1 = 1003(0x3eb, float:1.406E-42)
            java.lang.String r27 = r2.Ar6(r1)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.SOn r3 = new X.SOn     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r3.<init>()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r26 = r3
            r28 = r21
            r31 = r24
            X.SRj.A03(r26, r27, r28, r29, r30, r31)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r1 = 36316727331525234(0x8105df00001272, double:3.030182827955271E-306)
            boolean r1 = X.182.A06(r12, r4, r1)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r1 == 0) goto L_0x0155
            r1 = 37161152261718186(0x8405df000100aa, double:3.5642005540355656E-306)
            double r18 = X.182.A00(r12, r4, r1)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r3.A01()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            int r1 = r3.A01     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            double r1 = (double) r1     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            double r1 = r1 * r18
            int r12 = (int) r1     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r3.A01 = r12     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r3.A04 = r12     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
        L_0x0155:
            r3.A01()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.util.concurrent.atomic.AtomicReference r12 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r1 = r21
            r12.<init>(r1)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.Qdy r15 = new X.Qdy     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r1 = r23
            r15.<init>(r1, r0, r12)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.SQv r2 = new X.SQv     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r2.<init>()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r2.A08 = r5     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r2.A06 = r3     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.lang.String r1 = r22.getPath()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r2.A0F = r1     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r2.A07 = r15     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.SF8 r15 = new X.SF8     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r15.<init>()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r1 = 128000(0x1f400, float:1.79366E-40)
            r15.A00 = r1     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r1 = r23
            r15.A01 = r1     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.SFQ r1 = new X.SFQ     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r1.<init>(r15)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r2.A0C = r1     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.4aE r1 = X.C266714aE.AUDIO     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.util.HashMap r1 = r5.A07(r1)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r1 == 0) goto L_0x020a
            boolean r15 = r1.isEmpty()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r1 = 0
            if (r15 == 0) goto L_0x020b
            goto L_0x020a
        L_0x019c:
            X.Sr9 r0 = new X.Sr9     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r0.<init>()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            goto L_0x011a
        L_0x01a3:
            java.lang.Object r14 = X.00k.A0O(r4, r9)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            boolean r0 = r14 instanceof X.AnonymousClass51M     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r0 == 0) goto L_0x01fc
            X.51M r14 = (X.AnonymousClass51M) r14     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r14 == 0) goto L_0x01fc
            boolean r1 = r14.A0R     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r0 = r24
            if (r1 != r0) goto L_0x01fc
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.util.Iterator r18 = r4.iterator()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
        L_0x01bd:
            boolean r0 = r18.hasNext()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r0 == 0) goto L_0x01e6
            java.lang.Object r3 = r18.next()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r0 = r3
            X.51M r0 = (X.AnonymousClass51M) r0     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.51R r1 = r0.A0F     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            int r0 = r1.A09     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            float r2 = (float) r0     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            int r0 = r1.A05     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            float r0 = (float) r0     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            float r2 = r2 / r0
            X.51R r0 = r14.A0F     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            int r1 = r0.A09     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            float r1 = (float) r1     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            int r0 = r0.A05     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            float r0 = (float) r0     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            float r1 = r1 / r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x01bd
            r0 = r19
            r0.add(r3)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            goto L_0x01bd
        L_0x01e6:
            boolean r0 = r19.isEmpty()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r0 == 0) goto L_0x01fc
            X.51R r2 = r14.A0F     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            int r0 = r2.A09     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            int r0 = r2.A05     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.0eP r1 = X.AnonymousClass7TF.A0x(r1, r0)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            goto L_0x00da
        L_0x01fc:
            int r0 = r15.A03     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            int r0 = r15.A02     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.0eP r1 = X.AnonymousClass7TF.A0x(r1, r0)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            goto L_0x00da
        L_0x020a:
            r1 = 1
        L_0x020b:
            r1 = r1 ^ 1
            r2.A0Q = r1     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.QeC r15 = new X.QeC     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r1 = r23
            r15.<init>(r7, r1)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r2.A0B = r15     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            boolean r1 = X.1KU.A0E(r4)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.util.HashSet r1 = X.S8R.A00(r5, r1)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r2.A0G = r1     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.io.File r7 = r11.getCacheDir()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.0qQ.A07(r7)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.RwN r15 = new X.RwN     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r1 = r24
            r15.<init>(r4, r7, r1, r9)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.SHv r7 = new X.SHv     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r7.<init>()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.RzN r1 = new X.RzN     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r1.<init>(r2)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.C11261SHv.A00(r11, r15, r7, r1)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r2 = r21
            X.AVr r1 = X.C392569v1.A00(r11, r2, r2, r9)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r7.A0B = r1     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.SrS r1 = new X.SrS     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r1.<init>(r11)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r7.A06 = r1     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.Sr5 r1 = new X.Sr5     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r1.<init>()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r7.A02 = r1     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.Q1Q r1 = new X.Q1Q     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r1.<init>(r4)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r7.A01 = r1     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.util.Iterator r15 = r20.iterator()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
        L_0x0262:
            boolean r1 = r15.hasNext()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r1 == 0) goto L_0x0274
            java.lang.Object r2 = r15.next()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            boolean r1 = r2 instanceof X.C388659oB     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r1 == 0) goto L_0x0262
            r9.add(r2)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            goto L_0x0262
        L_0x0274:
            boolean r1 = r9 instanceof java.util.Collection     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r19 = 1
            if (r1 == 0) goto L_0x0281
            boolean r1 = r9.isEmpty()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r1 == 0) goto L_0x0281
            goto L_0x0298
        L_0x0281:
            java.util.Iterator r2 = r9.iterator()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
        L_0x0285:
            boolean r1 = r2.hasNext()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r1 == 0) goto L_0x0298
            java.lang.Object r1 = r2.next()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.9oB r1 = (X.C388659oB) r1     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.8Yu r1 = r1.A00     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r1 == 0) goto L_0x0285
            r18 = 1
            goto L_0x029a
        L_0x0298:
            r18 = 0
        L_0x029a:
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.util.Iterator r15 = r20.iterator()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
        L_0x02a2:
            boolean r1 = r15.hasNext()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r1 == 0) goto L_0x02b4
            java.lang.Object r2 = r15.next()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            boolean r1 = r2 instanceof X.C388649oA     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r1 == 0) goto L_0x02a2
            r9.add(r2)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            goto L_0x02a2
        L_0x02b4:
            boolean r1 = r9 instanceof java.util.Collection     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r1 == 0) goto L_0x02bf
            boolean r1 = r9.isEmpty()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r1 == 0) goto L_0x02bf
            goto L_0x02f4
        L_0x02bf:
            java.util.Iterator r2 = r9.iterator()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
        L_0x02c3:
            boolean r1 = r2.hasNext()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r1 == 0) goto L_0x02f4
            java.lang.Object r1 = r2.next()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.9oA r1 = (X.C388649oA) r1     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.8Yx r1 = r1.A00     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r1 == 0) goto L_0x02c3
            boolean r1 = X.1KU.A0F(r4)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r1 == 0) goto L_0x02f4
        L_0x02d9:
            X.0eP r1 = X.C62978KpU.A00(r4)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.lang.Object r2 = r1.A00     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            boolean r2 = X.AnonymousClass7TE.A1a(r2)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.lang.Object r9 = r1.A01     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.S7P r9 = (X.S7P) r9     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            boolean r1 = X.1KU.A0E(r4)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.util.Map r11 = X.S8R.A01(r11, r5, r1)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            goto L_0x02f7
        L_0x02f4:
            r19 = 0
            goto L_0x02d9
        L_0x02f7:
            if (r2 == 0) goto L_0x0305
            java.lang.String r2 = r9.A01()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.SrP r1 = new X.SrP     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r1.<init>(r2)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r5.add(r1)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
        L_0x0305:
            X.Q1Q r2 = new X.Q1Q     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r2.<init>(r4)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.RrP r1 = new X.RrP     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r1.<init>(r2, r8, r11)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.SrQ r2 = new X.SrQ     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r2.<init>(r9, r1)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r5.add(r2)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r18 == 0) goto L_0x0321
            if (r19 == 0) goto L_0x0336
            X.SrE r2 = new X.SrE     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r2.<init>()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            goto L_0x0328
        L_0x0321:
            if (r19 == 0) goto L_0x0330
            X.SrO r2 = new X.SrO     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r2.<init>()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
        L_0x0328:
            X.TdG r2 = (X.C13588TdG) r2     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.SrF r1 = new X.SrF     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r1.<init>(r2, r5)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            goto L_0x033b
        L_0x0330:
            X.SrO r1 = new X.SrO     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r1.<init>()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            goto L_0x033b
        L_0x0336:
            X.SrE r1 = new X.SrE     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r1.<init>()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
        L_0x033b:
            X.TdG r1 = (X.C13588TdG) r1     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r7.A04 = r1     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.Rz8 r1 = r7.A01()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            X.Tgt r1 = X.SRj.A00(r1)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r0.EwX(r3, r14)     // Catch:{ ExecutionException -> 0x0353, InterruptedException -> 0x034e }
            r1.FNH()     // Catch:{ ExecutionException -> 0x0353, InterruptedException -> 0x034e }
            goto L_0x0368
        L_0x034e:
            r1 = move-exception
            r0.AGA(r3, r1)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            goto L_0x0383
        L_0x0353:
            r1 = move-exception
            r0.AUa(r3, r1)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.io.IOException r1 = X.Pxe.A0c(r13, r1)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            goto L_0x0383
        L_0x035c:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r25)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            goto L_0x0383
        L_0x0361:
            java.lang.String r0 = "IgPhotoSegment not yet supported in VVP upload flow"
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            goto L_0x0383
        L_0x0368:
            java.lang.Object r1 = r12.get()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r1 == 0) goto L_0x0384
            java.lang.Object r1 = r12.get()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            if (r1 == 0) goto L_0x0379
            r0.AUa(r3, r1)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
        L_0x0379:
            java.lang.Object r0 = r12.get()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.io.IOException r1 = X.Pxe.A0c(r13, r0)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
        L_0x0383:
            throw r1     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
        L_0x0384:
            r0.Eyx(r3)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r0 = r22
            X.7zv r0 = X.AnonymousClass834.A00(r14, r4, r0)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.lang.String r15 = r0.A0k     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.lang.String r0 = r10.A0D     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r31 = r0
            int r0 = r10.A03     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r30 = r0
            float r0 = r10.A02     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r29 = r0
            java.lang.Integer r0 = r10.A0C     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r28 = r0
            int r0 = r10.A04     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r27 = r0
            float r0 = r10.A00     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r26 = r0
            int r0 = r10.A07     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r24 = r0
            int r0 = r10.A05     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r23 = r0
            boolean r0 = r10.A0H     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r22 = r0
            int r0 = r10.A08     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r20 = r0
            int r0 = r10.A09     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r19 = r0
            int r0 = r10.A06     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r18 = r0
            java.lang.String r14 = r10.A0E     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            boolean r13 = r10.A0L     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            boolean r12 = r10.A0J     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            boolean r11 = r10.A0K     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            boolean r9 = r10.A0N     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            long r3 = r10.A0A     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            boolean r8 = r10.A0M     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            com.instagram.common.gallery.metadata.MediaUploadMetadata r7 = r10.A0B     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            boolean r5 = r10.A0O     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            boolean r2 = r10.A0I     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            float r1 = r10.A01     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r0 = 20
            X.0qQ.A0B(r7, r0)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            com.instagram.pendingmedia.model.ClipInfo r10 = new com.instagram.pendingmedia.model.ClipInfo     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r10.<init>()     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r10.A0F = r15     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r0 = r31
            r10.A0D = r0     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r0 = r30
            r10.A03 = r0     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r0 = r29
            r10.A02 = r0     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r0 = r28
            r10.A0C = r0     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r0 = r27
            r10.A04 = r0     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r0 = r26
            r10.A00 = r0     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r0 = r24
            r10.A07 = r0     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r0 = r23
            r10.A05 = r0     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r0 = r22
            r10.A0H = r0     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r0 = r20
            r10.A08 = r0     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r0 = r19
            r10.A09 = r0     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r0 = r18
            r10.A06 = r0     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r10.A0E = r14     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r10.A0L = r13     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r10.A0J = r12     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r10.A0K = r11     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r10.A0N = r9     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r10.A0A = r3     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r10.A0M = r8     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r10.A0B = r7     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r10.A0O = r5     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r10.A0I = r2     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r10.A01 = r1     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            java.lang.Long r1 = java.lang.Long.valueOf(r16)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r0 = r21
            X.0eP r0 = X.AnonymousClass7TE.A1L(r0, r1)     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            r10.A0G = r0     // Catch:{ InterruptedException -> 0x044c, 8Af -> 0x0440, IOException -> 0x0434 }
            goto L_0x046a
        L_0x0434:
            r1 = move-exception
            java.lang.String r0 = "ClipsCreationPluginImpl"
            X.0kD.A0G(r0, r6, r1)
            X.4ZS r0 = new X.4ZS
            r0.<init>(r6, r1)
            throw r0
        L_0x0440:
            r1 = move-exception
            java.lang.String r0 = "ClipsCreationPluginImpl"
            X.0kD.A0G(r0, r6, r1)
            X.4ZS r0 = new X.4ZS
            r0.<init>(r6, r1)
            throw r0
        L_0x044c:
            r1 = move-exception
            X.4ZS r0 = new X.4ZS
            r0.<init>(r6, r1)
            throw r0
        L_0x0453:
            java.lang.String r1 = "ClipsStitchingParams not provided for stitching"
            X.4ZS r0 = new X.4ZS
            r0.<init>(r1)
            throw r0
        L_0x045b:
            java.lang.String r0 = "instance"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0465:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x046a:
            if (r15 == 0) goto L_0x047d
            java.io.File r0 = X.AnonymousClass7TE.A0t(r15)
            X.JtC r0 = X.Q0Y.A01(r0)
            int r1 = r0.A01
            int r0 = r0.A00
            r10.A09 = r1
            r10.A06 = r0
        L_0x047c:
            return r10
        L_0x047d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r25)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SUW.A0B(android.content.Context, com.instagram.common.session.UserSession, X.3Q2):com.instagram.pendingmedia.model.ClipInfo");
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.SHv, java.lang.Object] */
    public static final String A0C(Context context, UserSession userSession, File file, String str, List list, List list2) {
        AnonymousClass4ZS[] r5 = {null};
        String[] strArr = {null};
        C7957Qdy qdy = new C7957Qdy(0, r5, strArr);
        C266824aP r10 = new C266824aP();
        C266764aJ r3 = new C266764aJ(C266714aE.AUDIO);
        List list3 = list;
        int size = list3.size();
        for (int i = 0; i < size; i++) {
            File A0t = AnonymousClass7TE.A0t(DbU.A0t(list3, i));
            C266724aF r1 = (C266724aF) list2.get(i);
            C266744aH r0 = new C266744aH(A0t);
            if (r1 != null) {
                r0.A03 = r1;
            }
            r3.A02(r0.A00());
        }
        Pxf.A1F(r10, r3);
        MediaComposition mediaComposition = new MediaComposition(r10);
        C10683RwN rwN = new C10683RwN(userSession, file, true, false);
        SQv sQv = new SQv();
        sQv.A08 = mediaComposition;
        sQv.A0I = true;
        sQv.A0E = 002.A0D(str, 'a');
        sQv.A07 = qdy;
        C10862RzN rzN = new C10862RzN(sQv);
        ? obj = new Object();
        C11261SHv.A00(context, rwN, obj, rzN);
        try {
            C7255Q1d.A00(obj, userSession).FNH();
            String str2 = strArr[0];
            AnonymousClass4ZS r02 = r5[0];
            if (r02 == null && str2 != null) {
                return str2;
            }
            throw Pxe.A0c("Failure when stitching audio", r02);
        } catch (ExecutionException e) {
            throw Pxe.A0c("Failure when stitching audio", e);
        } catch (InterruptedException e2) {
            throw Pxe.A0c("Failure when stitching audio", e2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.Srl, java.lang.Object] */
    private final boolean A0E(UserSession userSession, String str, float f) {
        int A04 = DbS.A04(0Tu.A05, userSession, 36607707070928499L);
        boolean z = true;
        if (f <= 0.0f) {
            String str2 = str;
            if (str == null) {
                return false;
            }
            C13853TiW tiW = null;
            try {
                C7235Q0h q0h = Q12.A00;
                ? obj = new Object();
                obj.A00 = q0h;
                tiW = obj.AL8();
                tiW.ETt(str2);
                tiW.ELD(0);
                long j = Long.MIN_VALUE;
                int i = 0;
                if (A04 > 0) {
                    while (tiW.AAt()) {
                        int BpB = tiW.BpB();
                        j = Math.max(tiW.BpD(), j);
                        if ((BpB & 1) != 0 || (BpB & 4) == 0) {
                            i++;
                        }
                        if (i > A04 || j >= 1000000) {
                            break;
                        }
                    }
                }
                if (i <= A04) {
                    tiW.release();
                    return z;
                }
            } catch (Exception e) {
                0wb.A02(0kg.A06, "media_extractor_err", "Exception thrown", e);
                0KC.A0G("IgTranscodeUtil", "Can't extract mediaData", e);
            } catch (Throwable th) {
                if (tiW != null) {
                    try {
                        tiW.release();
                        throw th;
                    } catch (Exception e2) {
                        0wb.A02(0kg.A06, "media_extractor_err", "Exception thrown", e2);
                        0KC.A0G("IgTranscodeUtil", "Can't release mediaExtractor", e2);
                        throw th;
                    }
                }
                throw th;
            }
            z = false;
            try {
                tiW.release();
                return z;
            } catch (Exception e3) {
                0wb.A02(0kg.A06, "media_extractor_err", "Exception thrown", e3);
                0KC.A0G("IgTranscodeUtil", "Can't release mediaExtractor", e3);
                return z;
            }
        } else if (A04 <= 0 || f > ((float) A04)) {
            return false;
        } else {
            return true;
        }
    }

    public static final C7945Qdm A01(Context context, Point point, MediaComposition mediaComposition, UserSession userSession, AnonymousClass3Q2 r17, C10497RtC rtC, C14279TtC ttC, List list, boolean z, boolean z2) {
        Object obj;
        C13588TdG tdG;
        File cacheDir = context.getCacheDir();
        0qQ.A07(cacheDir);
        UserSession userSession2 = userSession;
        AnonymousClass3Q2 r10 = r17;
        C12354Ss0 ss0 = new C12354Ss0(point, userSession2, r10, rtC, ttC);
        String str = r10.A3t;
        C12374SsN ssN = new C12374SsN(new C7257Q1f(), ss0);
        List list2 = list;
        boolean z3 = z;
        if (list == null || list2.isEmpty()) {
            if (z) {
                obj = new Object();
            } else {
                obj = new Object();
            }
            tdG = (C13588TdG) obj;
        } else {
            tdG = A03(context, mediaComposition, userSession2, str, list2);
        }
        return new C7945Qdm(tdG, ss0, ssN, userSession2, cacheDir, z3, z2);
    }

    public static final C13588TdG A03(Context context, MediaComposition mediaComposition, UserSession userSession, String str, List list) {
        Object obj;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (Object next : list) {
            if (next instanceof C12331Srd) {
                z = true;
            } else if ((next instanceof C357618Yx) && 1KU.A0F(userSession)) {
                z2 = true;
            } else if (next instanceof C12334Srg) {
                z3 = true;
            }
        }
        0eP A002 = C62978KpU.A00(userSession);
        boolean A1a = AnonymousClass7TE.A1a(A002.A00);
        S7P s7p = (S7P) A002.A01;
        Q1Q q1q = new Q1Q(userSession);
        if (str == null) {
            str = "null";
        }
        C10388RrP rrP = new C10388RrP(q1q, str, S8R.A01(context, mediaComposition, z2));
        if (z) {
            obj = new Object();
        } else {
            obj = new Object();
        }
        C13588TdG tdG = (C13588TdG) obj;
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (z2) {
            if (A1a) {
                A1C.add(new C12319SrP(s7p.A01()));
            }
            A1C.add(new C12320SrQ(s7p, rrP));
        }
        if (z3) {
            A1C.add(new Object());
        }
        if (DbT.A1b(A1C)) {
            return new C12312SrF(tdG, A1C);
        }
        return tdG;
    }

    public static final List A0D(Context context, AnonymousClass3Q2 r6) {
        List<AnonymousClass55O> list;
        Object obj;
        ArrayList A1C = AnonymousClass7TE.A1C();
        AnonymousClass51W r0 = r6.A1P;
        if (!(r0 == null || (list = r0.A03) == null)) {
            for (AnonymousClass55O r2 : list) {
                Integer num = r2.A00;
                if (num == AnonymousClass05K.A00) {
                    C357588Yu r02 = ((C388659oB) r2).A00;
                    if (r02 != null) {
                        obj = r02.A00(context);
                    }
                } else if (num == AnonymousClass05K.A01) {
                    obj = ((C388649oA) r2).A00;
                }
                if (obj != null) {
                    A1C.add(obj);
                }
            }
        }
        for (AnonymousClass51I r03 : r6.A1V.A03) {
            MediaEffect mediaEffect = r03.A09;
            if (mediaEffect != null) {
                A1C.add(mediaEffect);
            }
        }
        return 00k.A0a(A1C);
    }
}
