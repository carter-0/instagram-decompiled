package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.store.intf.MessageListLayoutManager;
import com.instagram.model.reels.ReelViewerConfig;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.7Mn  reason: invalid class name and case insensitive filesystem */
public final class C330377Mn {
    public MessageListLayoutManager A00;
    public C254703su A01;
    public List A02;
    public boolean A03;
    public C70615ODm A04;
    public final Activity A05;
    public final Handler A06 = new Handler(Looper.getMainLooper());
    public final Fragment A07;
    public final UserSession A08;
    public final ReelViewerConfig A09;
    public final String A0A;
    public final HashSet A0B = new HashSet();
    public final C62320sa A0C;
    public final AnonymousClass0iw A0D;
    public final C330387Mo A0E;

    public C330377Mn(Activity activity, Fragment fragment, AnonymousClass0iw r5, UserSession userSession, ReelViewerConfig reelViewerConfig, String str, C62320sa r9) {
        0qQ.A0B(r5, 4);
        0qQ.A0B(str, 6);
        0qQ.A0B(r9, 7);
        this.A05 = activity;
        this.A07 = fragment;
        this.A08 = userSession;
        this.A0D = r5;
        this.A09 = reelViewerConfig;
        this.A0A = str;
        this.A0C = r9;
        this.A0E = new C330387Mo(activity, r5, userSession);
    }

    public static final void A00(C330377Mn r4) {
        r4.A01 = null;
        r4.A02 = null;
        C70615ODm oDm = r4.A04;
        if (oDm != null) {
            oDm.A01.DOd();
            oDm.A00.removeCallbacks(oDm.A02);
        }
        r4.A04 = null;
        C330387Mo r2 = r4.A0E;
        AnonymousClass0eM r1 = r2.A02;
        if (r1.CVQ()) {
            C67087Mi3 mi3 = ((OLB) r1.getValue()).A03;
            mi3.A01 = null;
            mi3.A00 = null;
            mi3.A02 = null;
        }
        AnonymousClass0eM r12 = r2.A03;
        if (r12.CVQ()) {
            ((A5R) r12.getValue()).A00.A01();
        }
    }

    public static final boolean A01(C330377Mn r5) {
        MessageListLayoutManager messageListLayoutManager;
        if (r5.A02 != null) {
            return true;
        }
        C254703su r4 = r5.A01;
        if (r4 == null || (messageListLayoutManager = r5.A00) == null) {
            return false;
        }
        return ((C333517Zg) r5.A0C.invoke()).BSN().CXN(r4.A0V(), messageListLayoutManager.A1a(), messageListLayoutManager.A1b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0080, code lost:
        if (X.C66834MdS.A03(r0) != null) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(android.graphics.RectF r24, X.C74455PvA r25, X.C254703su r26, X.AnonymousClass2Ep r27, X.C254743sy r28, java.lang.String r29, java.lang.String r30, java.util.List r31, java.util.List r32, boolean r33, boolean r34, boolean r35, boolean r36, boolean r37, boolean r38) {
        /*
            r23 = this;
            r2 = 0
            r12 = r28
            X.0qQ.A0B(r12, r2)
            r11 = r23
            A00(r11)
            android.os.Handler r1 = r11.A06
            X.ODm r0 = new X.ODm
            r9 = r25
            r0.<init>(r1, r9)
            r11.A04 = r0
            android.os.Handler r4 = r0.A00
            java.lang.Runnable r3 = r0.A02
            r0 = 200(0xc8, double:9.9E-322)
            r4.postDelayed(r3, r0)
            r10 = r26
            r11.A01 = r10
            r15 = r32
            r11.A02 = r15
            X.ON2 r7 = new X.ON2
            r19 = r35
            r18 = r34
            r17 = r33
            r22 = r38
            r21 = r37
            r8 = r24
            r20 = r36
            r14 = r29
            r13 = r30
            r16 = r31
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.7Mo r5 = r11.A0E
            if (r38 == 0) goto L_0x005c
            if (r32 == 0) goto L_0x005c
            X.0eM r0 = r5.A04
            java.lang.Object r5 = r0.getValue()
            X.A5S r5 = (X.A5S) r5
            r1 = 1
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x00d7
            r9.DOd()
            r7.A01(r1, r2)
        L_0x005b:
            return
        L_0x005c:
            if (r26 == 0) goto L_0x0138
            r2 = r27
            if (r27 == 0) goto L_0x0138
            boolean r0 = r10.A1S()
            if (r0 == 0) goto L_0x0082
            X.4ik r0 = r10.A0e
            if (r0 == 0) goto L_0x0082
            X.4iq r0 = r0.A04
            if (r0 == 0) goto L_0x0082
            boolean r1 = r0.A0V
            if (r1 == 0) goto L_0x00c2
            X.3WR r0 = r0.A09
            java.lang.String r0 = r0.A02()
        L_0x007a:
            if (r0 == 0) goto L_0x0133
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r0 = X.C66834MdS.A03(r0)
            if (r0 == 0) goto L_0x0133
        L_0x0082:
            boolean r0 = r10.A1S()
            if (r0 == 0) goto L_0x0127
            com.instagram.common.session.UserSession r4 = r5.A00
            X.0Tu r3 = X.0Tu.A05
            r0 = 36325982986581436(0x810e4a000835bc, double:3.036036141482344E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 != 0) goto L_0x0127
            X.0eM r0 = r5.A01
            java.lang.Object r1 = r0.getValue()
            X.OCK r1 = (X.OCK) r1
            X.0eM r0 = r1.A01
            java.lang.Object r6 = r0.getValue()
            X.OCL r6 = (X.OCL) r6
            X.OLA r5 = new X.OLA
            r5.<init>(r10, r2, r7, r1)
            X.1Xj r0 = r10.A0s
            if (r0 == 0) goto L_0x00b3
            r5.A00()
        L_0x00b3:
            X.4ik r4 = r10.A0e
            if (r4 == 0) goto L_0x005b
            X.4iq r3 = r4.A04
            if (r3 != 0) goto L_0x0108
            r1 = 1
            X.ON2 r0 = r5.A02
            r0.A01(r1, r1)
            return
        L_0x00c2:
            com.instagram.model.mediasize.ImageInfo r0 = r0.A06
            if (r0 == 0) goto L_0x0133
            java.util.List r0 = r0.Al9()
            if (r0 == 0) goto L_0x0133
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.model.mediasize.ExtendedImageUrl r0 = (com.instagram.model.mediasize.ExtendedImageUrl) r0
            if (r0 == 0) goto L_0x0133
            java.lang.String r0 = r0.A0A
            goto L_0x007a
        L_0x00d7:
            java.lang.Object r0 = r15.get(r2)
            com.instagram.direct.visual.model.DirectVisualMessageItemModel r0 = (com.instagram.direct.visual.model.DirectVisualMessageItemModel) r0
            com.instagram.direct.visual.model.DirectVisualMessageItemModel$MediaFields r1 = r0.A02
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.visual.model.DirectVisualMessageItemModel.MediaFields.RemixMedia"
            X.0qQ.A0C(r1, r0)
            com.instagram.direct.visual.model.DirectVisualMessageItemModel$MediaFields$RemixMedia r1 = (com.instagram.direct.visual.model.DirectVisualMessageItemModel.MediaFields.RemixMedia) r1
            android.net.Uri r0 = r1.A00
            java.lang.String r4 = r0.toString()
            X.0qQ.A07(r4)
            java.lang.Object r0 = r15.get(r2)
            com.instagram.direct.visual.model.DirectVisualMessageItemModel r0 = (com.instagram.direct.visual.model.DirectVisualMessageItemModel) r0
            boolean r3 = r0.A07
            com.instagram.common.session.UserSession r0 = r5.A01
            X.A9L r2 = X.O0Q.A00(r0)
            android.content.Context r1 = r5.A00
            X.NQS r0 = new X.NQS
            r0.<init>(r9, r7, r3)
            r2.A01(r1, r0, r4, r3)
            return
        L_0x0108:
            boolean r0 = r3.A0V
            if (r0 != 0) goto L_0x0110
            r5.A00()
            return
        L_0x0110:
            X.0eM r0 = X.C71105Ocj.A05
            com.instagram.common.session.UserSession r0 = r6.A01
            X.Ocj r2 = X.C69851NtF.A00(r0)
            X.3WR r0 = r3.A09
            java.lang.String r1 = r0.A02()
            X.OsP r0 = new X.OsP
            r0.<init>(r4, r3, r5, r6)
            r2.A03(r0, r1)
            return
        L_0x0127:
            X.0eM r0 = r5.A02
            java.lang.Object r0 = r0.getValue()
            X.OLB r0 = (X.OLB) r0
            r0.A00(r10, r2, r7)
            return
        L_0x0133:
            r0 = 1
            r7.A01(r1, r0)
            return
        L_0x0138:
            if (r32 == 0) goto L_0x01b6
            X.0eM r0 = r5.A03
            java.lang.Object r6 = r0.getValue()
            X.A5R r6 = (X.A5R) r6
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r15.iterator()
        L_0x014b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x016f
            java.lang.Object r2 = r3.next()
            com.instagram.direct.visual.model.DirectVisualMessageItemModel r2 = (com.instagram.direct.visual.model.DirectVisualMessageItemModel) r2
            com.instagram.direct.visual.model.DirectVisualMessageItemModel$MediaFields r1 = r2.A02
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.visual.model.DirectVisualMessageItemModel.MediaFields.TamMedia"
            X.0qQ.A0C(r1, r0)
            com.instagram.direct.visual.model.DirectVisualMessageItemModel$MediaFields$TamMedia r1 = (com.instagram.direct.visual.model.DirectVisualMessageItemModel.MediaFields.TamMedia) r1
            android.net.Uri r0 = r1.A00
            r4.add(r0)
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x014b
            android.net.Uri r0 = r1.A01
            r4.add(r0)
            goto L_0x014b
        L_0x016f:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
            X.0qQ.A07(r4)
        L_0x017b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01a0
            java.lang.Object r3 = r4.next()
            X.0qQ.A07(r3)
            X.MYc r2 = X.C66594MYg.A03
            com.instagram.common.session.UserSession r1 = r6.A01
            X.61K r0 = X.AnonymousClass61K.DIRECT_VISUAL_MESSAGE
            X.MYg r0 = r2.A02(r1, r0)
            X.MYb r1 = r0.A01
            java.lang.String r0 = r3.toString()
            X.1aU r0 = r1.A02(r0)
            r5.add(r0)
            goto L_0x017b
        L_0x01a0:
            X.1a8 r2 = r6.A00
            X.DNc r1 = X.C46123DNc.A00
            X.Oup r0 = new X.Oup
            r0.<init>(r1)
            X.1aU r1 = X.1aU.A05(r0, r5)
            X.PSE r0 = new X.PSE
            r0.<init>(r7)
            r2.A02(r1, r0)
            return
        L_0x01b6:
            java.lang.String r1 = "Message or items has to be not null"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C330377Mn.A02(android.graphics.RectF, X.PvA, X.3su, X.2Ep, X.3sy, java.lang.String, java.lang.String, java.util.List, java.util.List, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
