package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class IY6 implements C233012uo, C270674h7, C290515fR {
    public C233072uu A00;
    public final Context A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final C54575HJk A04;
    public final UserSession A05;
    public final AnonymousClass4DU A06;
    public final C52009GBg A07;

    public final boolean A7L(C233632w4 r2, C233042ur r3, C233072uu r4) {
        0qQ.A0B(r4, 0);
        this.A00 = r4;
        return true;
    }

    public final int BWK() {
        return 0;
    }

    public final int BfG() {
        return 0;
    }

    public final /* synthetic */ void CJE(C376459Ib r1, List list) {
    }

    public final boolean CJo() {
        return false;
    }

    public final void Cmr() {
    }

    public final void Cn7(C233632w4 r1, C238523Ce r2, boolean z) {
    }

    public final void Cn9(int i) {
    }

    public final void D3r(H3D h3d) {
    }

    public final void D3s() {
    }

    public final void D3t(C52228GJt gJt) {
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void D3u(X.C52263GLe r16) {
        /*
            r15 = this;
            r4 = 0
            r5 = r16
            X.0qQ.A0B(r5, r4)
            java.util.List r3 = r5.A09
            boolean r0 = r3 instanceof java.util.Collection
            r2 = 1
            r10 = 0
            if (r0 == 0) goto L_0x01a4
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x01a4
        L_0x0014:
            r14 = 0
        L_0x0015:
            X.GBg r6 = r15.A07
            X.4bN r0 = X.C295375o3.A00()
            r6.A0T(r0, r2)
            X.4DU r0 = r15.A06
            java.lang.String r1 = r0.getModuleName()
            int r0 = r1.hashCode()
            switch(r0) {
                case -1782849828: goto L_0x018d;
                case -1605077561: goto L_0x017b;
                case -1173934446: goto L_0x0167;
                case -893240619: goto L_0x0164;
                case -464728503: goto L_0x0155;
                case -245756598: goto L_0x0152;
                case -39744821: goto L_0x0140;
                case 132014642: goto L_0x013d;
                case 1310132869: goto L_0x012b;
                case 1794301627: goto L_0x0119;
                case 1978956600: goto L_0x0116;
                default: goto L_0x002b;
            }
        L_0x002b:
            r0 = 0
        L_0x002c:
            r7 = 0
            if (r0 == 0) goto L_0x0069
            com.instagram.common.session.UserSession r1 = r15.A05
            X.5u7 r8 = r5.A01
            java.util.List r0 = r8.Ao2()
            java.util.List r0 = X.C295325ny.A06(r1, r0, r3, r4)
            java.util.ArrayList r5 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r13 = r0.iterator()
            r3 = 0
        L_0x0044:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x01bf
            java.lang.Object r9 = r13.next()
            int r12 = r3 + 1
            if (r3 < 0) goto L_0x00a8
            X.9Ie r9 = (X.C376489Ie) r9
            if (r14 != 0) goto L_0x00d9
            java.lang.Object r1 = r9.A04
            X.2vm r1 = (X.C233472vm) r1
            if (r1 == 0) goto L_0x0064
            int r0 = r6.A0A()
        L_0x0060:
            int r0 = r0 + r3
            r1.A0B(r0)
        L_0x0064:
            r5.add(r9)
            r3 = r12
            goto L_0x0044
        L_0x0069:
            X.5u7 r1 = r5.A01
            boolean r0 = r1 instanceof X.C43881CGv
            if (r0 == 0) goto L_0x01bd
            X.CGv r1 = (X.C43881CGv) r1
            if (r1 == 0) goto L_0x01bd
            java.util.List r0 = r1.A00
            java.util.List r0 = X.C51966G9m.A1J(r0)
            java.util.ArrayList r5 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r9 = r0.iterator()
        L_0x0081:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01bf
            java.lang.Object r0 = r9.next()
            int r8 = r10 + 1
            if (r10 < 0) goto L_0x00a8
            X.B7p r0 = (X.C41938B7p) r0
            X.9Ie r3 = r0.A00()
            java.lang.Object r1 = r3.A04
            X.2vm r1 = (X.C233472vm) r1
            if (r1 == 0) goto L_0x00a3
            int r0 = r6.A0A()
            int r0 = r0 + r10
            r1.A0B(r0)
        L_0x00a3:
            r5.add(r3)
            r10 = r8
            goto L_0x0081
        L_0x00a8:
            X.0sr.A1T()
            goto L_0x00d4
        L_0x00ac:
            java.util.Iterator r3 = r1.iterator()
            r11 = 0
        L_0x00b1:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00e8
            X.4bN r1 = X.C51966G9m.A0m(r3)
            boolean r0 = X.GDZ.A00(r1)
            if (r0 != 0) goto L_0x00b1
            boolean r0 = r1.A0G()
            if (r0 != 0) goto L_0x00b1
            X.5o2 r1 = r1.A01
            X.5o2 r0 = X.C295365o2.BRAND_SURVEY
            if (r1 == r0) goto L_0x00b1
            int r11 = r11 + 1
            if (r11 >= 0) goto L_0x00b1
            X.0sr.A1S()
        L_0x00d4:
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        L_0x00d9:
            java.util.List r1 = r8.Ao1()
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00ac
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00ac
            r11 = 0
        L_0x00e8:
            java.util.List r0 = r8.Ao1()
            java.util.Iterator r10 = r0.iterator()
            r3 = 0
        L_0x00f1:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0108
            java.lang.String r1 = X.C51971G9r.A0u(r10)
            java.lang.Object r0 = r9.A03
            X.4bN r0 = (X.C267324bN) r0
            boolean r0 = X.C51969G9p.A1Y(r0, r1)
            if (r0 != 0) goto L_0x0109
            int r3 = r3 + 1
            goto L_0x00f1
        L_0x0108:
            r3 = -1
        L_0x0109:
            java.lang.Object r1 = r9.A04
            X.2vm r1 = (X.C233472vm) r1
            if (r1 == 0) goto L_0x0064
            int r0 = r6.A0A()
            int r0 = r0 - r11
            goto L_0x0060
        L_0x0116:
            r0 = 4607(0x11ff, float:6.456E-42)
            goto L_0x0169
        L_0x0119:
            java.lang.String r0 = "clips_viewer_feed_timeline_feed_of_ads"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002b
            com.instagram.common.session.UserSession r8 = r15.A05
            X.0Tu r7 = X.0Tu.A06
            r0 = 36321992962025354(0x810aa90009278a, double:3.033512833886539E-306)
            goto L_0x019e
        L_0x012b:
            java.lang.String r0 = "clips_viewer_feed_timeline_tall_video_watch_and_browse_with_chaining"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002b
            com.instagram.common.session.UserSession r8 = r15.A05
            X.0Tu r7 = X.0Tu.A06
            r0 = 36321992962156428(0x810aa9000b278c, double:3.0335128339694305E-306)
            goto L_0x019e
        L_0x013d:
            r0 = 4602(0x11fa, float:6.449E-42)
            goto L_0x0157
        L_0x0140:
            java.lang.String r0 = "clips_viewer_feed_timeline_watch_and_browse_with_chaining"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002b
            com.instagram.common.session.UserSession r8 = r15.A05
            X.0Tu r7 = X.0Tu.A06
            r0 = 36321992962090891(0x810aa9000a278b, double:3.0335128339279846E-306)
            goto L_0x019e
        L_0x0152:
            r0 = 4604(0x11fc, float:6.452E-42)
            goto L_0x0169
        L_0x0155:
            r0 = 4603(0x11fb, float:6.45E-42)
        L_0x0157:
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 != 0) goto L_0x002c
            goto L_0x002b
        L_0x0164:
            r0 = 4605(0x11fd, float:6.453E-42)
            goto L_0x0169
        L_0x0167:
            r0 = 4606(0x11fe, float:6.454E-42)
        L_0x0169:
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002b
            com.instagram.common.session.UserSession r0 = r15.A05
            boolean r0 = X.1KU.A0A(r0)
            goto L_0x002c
        L_0x017b:
            java.lang.String r0 = "clips_viewer_clips_multi_ads_feed_of_ads"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002b
            com.instagram.common.session.UserSession r8 = r15.A05
            X.0Tu r7 = X.0Tu.A06
            r0 = 36319239891328069(0x810828003c1c45, double:3.03177178089185E-306)
            goto L_0x019e
        L_0x018d:
            java.lang.String r0 = "clips_viewer_clips_pae_multi_ads_feed_of_ads"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002b
            com.instagram.common.session.UserSession r8 = r15.A05
            X.0Tu r7 = X.0Tu.A06
            r0 = 36319239891393606(0x810828003d1c46, double:3.031771780933296E-306)
        L_0x019e:
            boolean r0 = X.182.A06(r7, r8, r0)
            goto L_0x002c
        L_0x01a4:
            java.util.Iterator r1 = r3.iterator()
        L_0x01a8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            X.4bN r0 = X.C51966G9m.A0m(r1)
            boolean r0 = X.GDZ.A00(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01a8
            r14 = 1
            goto L_0x0015
        L_0x01bd:
            X.0sn r5 = X.0sn.A00
        L_0x01bf:
            java.util.ArrayList r9 = X.AnonymousClass7TF.A0q(r5, r4)
            java.util.Iterator r8 = r5.iterator()
        L_0x01c7:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01f8
            java.lang.Object r4 = r8.next()
            r0 = r4
            X.9Ie r0 = (X.C376489Ie) r0
            java.lang.Object r3 = r0.A03
            X.4bN r3 = (X.C267324bN) r3
            X.5o2 r0 = r3.A01
            int r1 = r0.ordinal()
            r0 = 9
            if (r1 == r0) goto L_0x01f5
            r0 = 16
            if (r1 == r0) goto L_0x01f0
            X.1Xj r0 = X.C51966G9m.A0s(r3)
        L_0x01ea:
            if (r0 == 0) goto L_0x01c7
            r9.add(r4)
            goto L_0x01c7
        L_0x01f0:
            X.Cw7 r0 = r3.A04()
            goto L_0x01ea
        L_0x01f5:
            X.1Xj r0 = r3.A02
            goto L_0x01ea
        L_0x01f8:
            java.util.Iterator r8 = r9.iterator()
        L_0x01fc:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0278
            java.lang.Object r0 = r8.next()
            X.9Ie r0 = (X.C376489Ie) r0
            java.lang.Object r3 = r0.A03
            X.4bN r3 = (X.C267324bN) r3
            boolean r0 = r3.A0F()
            if (r0 == 0) goto L_0x0259
            java.util.List r0 = X.C57031ILx.A02(r3)
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x021e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0228
            X.C51972G9s.A1G(r3, r1)
            goto L_0x021e
        L_0x0228:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r3.iterator()
        L_0x0230:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0247
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.1Xj r0 = (X.1Xj) r0
            boolean r0 = r0.CeS()
            if (r0 == 0) goto L_0x0230
            r4.add(r1)
            goto L_0x0230
        L_0x0247:
            java.util.Iterator r1 = r4.iterator()
        L_0x024b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01fc
            X.1Xj r0 = X.C51966G9m.A0t(r1)
            r15.A00(r0)
            goto L_0x024b
        L_0x0259:
            X.5o2 r1 = r3.A01
            X.5o2 r0 = X.C295365o2.BRAND_SURVEY
            if (r1 == r0) goto L_0x01fc
            X.5o2 r0 = X.C295365o2.NETEGO
            if (r1 != r0) goto L_0x026f
            X.1Xj r0 = r3.A02
        L_0x0265:
            if (r0 != 0) goto L_0x0274
            java.lang.String r1 = "SimpleClipsSponsoredContentFetcher"
            java.lang.String r0 = "Media item is not available for prefetch"
            X.0kD.A07(r1, r0, r7)
            goto L_0x01fc
        L_0x026f:
            X.1Xj r0 = X.C51966G9m.A0s(r3)
            goto L_0x0265
        L_0x0274:
            r15.A00(r0)
            goto L_0x01fc
        L_0x0278:
            java.lang.String r1 = "null"
            com.instagram.common.session.UserSession r9 = r15.A02
            X.0Tu r0 = X.0Tu.A05
            X.G9w.A1H(r0, r9, r1)
            java.util.Iterator r10 = r5.iterator()
        L_0x0285:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0307
            java.lang.Object r0 = r10.next()
            X.9Ie r0 = (X.C376489Ie) r0
            java.lang.Object r1 = r0.A03
            X.4bN r1 = (X.C267324bN) r1
            X.1Xj r0 = r1.A02
            r3 = 0
            if (r0 == 0) goto L_0x0305
            X.1Xy r0 = r0.A0C
            java.lang.String r0 = r0.BMi()
            if (r0 == 0) goto L_0x0305
            android.net.Uri r8 = X.0cp.A03(r0)
        L_0x02a6:
            boolean r0 = r1.CcK()
            if (r0 == 0) goto L_0x0285
            X.3OA r0 = r1.A06()
            java.util.List r0 = r0.A04()
            if (r0 == 0) goto L_0x02c2
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.model.androidlink.AndroidLink r0 = (com.instagram.model.androidlink.AndroidLink) r0
            if (r0 == 0) goto L_0x02c2
            X.47L r3 = X.C271714jT.A01(r0)
        L_0x02c2:
            X.47L r0 = X.AnonymousClass47L.AD_DESTINATION_CANVAS
            if (r3 != r0) goto L_0x0285
            if (r8 == 0) goto L_0x0285
            java.lang.String r4 = "clips_canvas_bloks_prefetch"
            boolean r0 = X.SL1.A02(r8, r4)
            if (r0 == 0) goto L_0x0285
            X.1Xj r0 = X.C51966G9m.A0s(r1)
            X.1Xy r0 = r0.A0C
            java.util.List r1 = r0.Aok()
            if (r1 == 0) goto L_0x0285
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x02e7
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x02e7
            goto L_0x0285
        L_0x02e7:
            java.util.Iterator r3 = r1.iterator()
        L_0x02eb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0285
            X.1Xj r0 = X.C51966G9m.A0t(r3)
            X.1Xy r0 = r0.A0C
            com.instagram.api.schemas.CollectionMediaRole r1 = r0.Aom()
            com.instagram.api.schemas.CollectionMediaRole r0 = com.instagram.api.schemas.CollectionMediaRole.THUMBNAIL_MEDIA
            if (r1 != r0) goto L_0x02eb
            android.content.Context r0 = r15.A01
            X.SL1.A01(r0, r8, r9, r4)
            goto L_0x0285
        L_0x0305:
            r8 = r7
            goto L_0x02a6
        L_0x0307:
            X.2uu r3 = r15.A00
            if (r3 == 0) goto L_0x0373
            int r1 = r6.A0A()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r3.Dlz(r0, r5)
            int r0 = r6.A0A()
            if (r1 == r0) goto L_0x0373
            X.4bN r7 = X.C295375o3.A00()
            X.GAg r6 = (X.C51983GAg) r6
            boolean r0 = r6 instanceof X.C52347GOr
            if (r0 == 0) goto L_0x032c
            monitor-enter(r6)
            X.C51983GAg.A03(r7, r6, r2)     // Catch:{ all -> 0x0329 }
            goto L_0x0372
        L_0x0329:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x032c:
            boolean r0 = r6 instanceof X.C52354GOy
            if (r0 == 0) goto L_0x036e
            X.GOy r6 = (X.C52354GOy) r6
            java.util.concurrent.locks.ReentrantReadWriteLock r5 = r6.A00
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r5.readLock()
            int r0 = r5.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x034c
            int r1 = r5.getReadHoldCount()
            r0 = 0
        L_0x0344:
            if (r0 >= r1) goto L_0x034d
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0344
        L_0x034c:
            r1 = 0
        L_0x034d:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = X.C52009GBg.A09(r5)
            X.C51983GAg.A03(r7, r6, r2)     // Catch:{ all -> 0x0355 }
            goto L_0x0362
        L_0x0355:
            r2 = move-exception
        L_0x0356:
            if (r3 >= r1) goto L_0x035e
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0356
        L_0x035e:
            r0.unlock()
            throw r2
        L_0x0362:
            if (r3 >= r1) goto L_0x036a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0362
        L_0x036a:
            r0.unlock()
            return
        L_0x036e:
            X.C51983GAg.A03(r7, r6, r2)
            return
        L_0x0372:
            monitor-exit(r6)
        L_0x0373:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IY6.D3u(X.GLe):void");
    }

    public final boolean D69(int i, int i2) {
        return false;
    }

    public final void DsJ(int i) {
    }

    private final void A00(1Xj r5) {
        UserSession userSession = this.A02;
        if (!182.A06(0Tu.A05, userSession, 36318355124197473L) || r5.CeS() || r5.A5h()) {
            C255593uO.A00(userSession).A01(new C256203vO(r5.CEL(), this.A03.getModuleName()));
        }
    }

    public final /* synthetic */ boolean AFi() {
        return false;
    }

    public final /* synthetic */ AnonymousClass4lJ AN3() {
        return new C57364IYv();
    }

    public final /* synthetic */ String B4s() {
        return "";
    }

    public final Map Bk0() {
        C233072uu r0 = this.A00;
        if (r0 != null) {
            return r0.Bk0();
        }
        return null;
    }

    public final boolean CTb() {
        return false;
    }

    public final /* synthetic */ void Cmj(boolean z) {
        0kD.A07("SimpleClipsSponsoredContentFetcher", "Call of unsupported method maybeCarryOverFirstResponse", (Throwable) null);
    }

    public final void deactivate() {
    }

    public IY6(Context context, UserSession userSession, AnonymousClass4DU r3, C52009GBg gBg, C54575HJk hJk) {
        this.A02 = userSession;
        this.A01 = context;
        this.A03 = r3;
        this.A04 = hJk;
        this.A05 = userSession;
        this.A06 = r3;
        this.A07 = gBg;
    }

    public final /* synthetic */ Set Bsw() {
        return AnonymousClass7TE.A1F();
    }

    public final /* synthetic */ void Cn8(AnonymousClass9J0 r1, C233632w4 r2, C238523Ce r3, String str, String str2, double d, boolean z) {
        AnonymousClass7TG.A1P(r2, r3);
    }
}
