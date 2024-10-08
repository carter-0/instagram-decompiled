package com.instagram.direct.fragment.channels.featuredevent;

import X.02z;
import X.05G;
import X.0pt;
import X.0qQ;
import X.0sn;
import X.106;
import X.10b;
import X.2YL;
import X.AnonymousClass0Ud;
import X.AnonymousClass10A;
import X.AnonymousClass10H;
import X.AnonymousClass4D7;
import X.C262204Co;
import X.C318116oQ;
import X.C51966G9m;
import X.C51975G9x;
import X.C61037Jvb;
import X.C62485Kga;
import X.C73570Pfy;
import X.DbS;
import X.MFW;
import X.ODY;
import com.instagram.common.session.UserSession;

public final class ChannelsFeaturedEventListViewModel extends 2YL {
    public C262204Co A00;
    public final 05G A01;
    public final 05G A02;
    public final AnonymousClass0Ud A03;
    public final UserSession A04;
    public final 05G A05;

    public ChannelsFeaturedEventListViewModel(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        C62485Kga kga = C62485Kga.INITIAL_LOAD;
        02z A10 = DbS.A10(kga);
        this.A01 = A10;
        0sn r5 = 0sn.A00;
        02z A012 = 106.A01(r5);
        this.A02 = A012;
        02z A013 = 106.A01((Object) null);
        this.A05 = A013;
        0pt A002 = AnonymousClass10H.A00(new C73570Pfy(2, (AnonymousClass4D7) null), A10, A013, A012);
        this.A03 = 10b.A02(new ODY((C61037Jvb) null, kga, r5), C318116oQ.A00(this), A002, AnonymousClass10A.A01);
    }

    public final void A01(String str) {
        0qQ.A0B(str, 0);
        05G r2 = this.A01;
        if (r2.getValue() != C62485Kga.SUCCESS) {
            r2.Epw(C62485Kga.INITIAL_LOAD);
            AnonymousClass4D7 A0t = C51975G9x.A0t(this.A00);
            this.A00 = C51966G9m.A1L(new MFW(this, str, A0t, 22), C318116oQ.A00(this));
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        if (r2 != null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        if (r8 == null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        r8 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        if (r2 == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0063, code lost:
        r9 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
        if (r9 != null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        r9 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0068, code lost:
        if (r2 == null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        r10 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006c, code lost:
        if (r10 != null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006e, code lost:
        r10 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006f, code lost:
        if (r2 != null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0071, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0072, code lost:
        r1.add(new X.C68205N5u(r7, r8, r9, r10, r11));
        r0 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007c, code lost:
        if (r0 == null) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007e, code lost:
        r4 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0086, code lost:
        if (r4.hasNext() == false) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0088, code lost:
        r3 = (X.OC2) r4.next();
        r2 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0090, code lost:
        if (r2 == null) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0092, code lost:
        r1.add(new X.N5P(r2));
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009c, code lost:
        if (r0 == null) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009e, code lost:
        r2 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a6, code lost:
        if (r2.hasNext() == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a8, code lost:
        r0 = (X.OH0) r2.next();
        r6 = r0.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b0, code lost:
        if (r6 == null) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b2, code lost:
        r7 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b4, code lost:
        if (r7 == null) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b6, code lost:
        r8 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b8, code lost:
        if (r8 == null) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ba, code lost:
        r9 = r0.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bc, code lost:
        if (r9 == null) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00be, code lost:
        r10 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c0, code lost:
        if (r10 == null) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c2, code lost:
        r1.add(new X.C47251Dtc(r6, r7, r8, r9, r10, r0.A05));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00cd, code lost:
        r11 = r2.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012c, code lost:
        r0 = "creatorUsername";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012f, code lost:
        r0 = "imageUrl";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0132, code lost:
        r0 = "subtitle";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0135, code lost:
        r0 = com.facebook.react.modules.dialog.DialogModule.KEY_TITLE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0138, code lost:
        r0 = com.facebook.react.modules.dialog.DialogModule.KEY_ITEMS;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x013b, code lost:
        r0 = "sectionName";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x013e, code lost:
        r0 = "threadId";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0140, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0147, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0151, code lost:
        r2 = new X.C239793Ih(r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.direct.fragment.channels.featuredevent.ChannelsFeaturedEventListViewModel r9, java.lang.String r10, X.AnonymousClass4D7 r11) {
        /*
            r4 = 28
            boolean r0 = X.C66129MDh.A01(r4, r11)
            if (r0 == 0) goto L_0x0125
            r3 = r11
            X.MDh r3 = (X.C66129MDh) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0125
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r3.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r3.A00
            r5 = 1
            if (r0 == 0) goto L_0x00d4
            if (r0 != r5) goto L_0x0168
            java.lang.Object r9 = r3.A01
            com.instagram.direct.fragment.channels.featuredevent.ChannelsFeaturedEventListViewModel r9 = (com.instagram.direct.fragment.channels.featuredevent.ChannelsFeaturedEventListViewModel) r9
            X.0eS.A00(r2)
        L_0x0028:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0148
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r5 = r2.A00
            X.NHG r5 = (X.NHG) r5
            X.05G r6 = r9.A05
            X.OE6 r0 = r5.A00
            r2 = 0
            if (r0 == 0) goto L_0x00d0
            java.lang.String r4 = r0.A00
            java.lang.String r3 = r0.A01
            java.lang.String r2 = r0.A02
        L_0x0041:
            r1 = 10
            X.Jvb r0 = new X.Jvb
            r0.<init>(r4, r3, r2, r1)
            r6.Epw(r0)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            X.OGC r2 = r5.A01
            java.lang.String r0 = ""
            if (r2 == 0) goto L_0x0059
            java.lang.String r7 = r2.A03
            if (r7 != 0) goto L_0x005c
        L_0x0059:
            r7 = r0
            if (r2 == 0) goto L_0x0060
        L_0x005c:
            java.lang.String r8 = r2.A00
            if (r8 != 0) goto L_0x0063
        L_0x0060:
            r8 = r0
            if (r2 == 0) goto L_0x0067
        L_0x0063:
            java.lang.String r9 = r2.A02
            if (r9 != 0) goto L_0x006a
        L_0x0067:
            r9 = r0
            if (r2 == 0) goto L_0x006e
        L_0x006a:
            java.lang.String r10 = r2.A01
            if (r10 != 0) goto L_0x00cd
        L_0x006e:
            r10 = r0
            if (r2 != 0) goto L_0x00cd
            r11 = 0
        L_0x0072:
            X.N5u r6 = new X.N5u
            r6.<init>(r7, r8, r9, r10, r11)
            r1.add(r6)
            java.util.List r0 = r5.A02
            if (r0 == 0) goto L_0x0151
            java.util.Iterator r4 = r0.iterator()
        L_0x0082:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0151
            java.lang.Object r3 = r4.next()
            X.OC2 r3 = (X.OC2) r3
            java.lang.String r2 = r3.A00
            if (r2 == 0) goto L_0x013b
            X.N5P r0 = new X.N5P
            r0.<init>(r2)
            r1.add(r0)
            java.util.List r0 = r3.A01
            if (r0 == 0) goto L_0x0138
            java.util.Iterator r2 = r0.iterator()
        L_0x00a2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0082
            java.lang.Object r0 = r2.next()
            X.OH0 r0 = (X.OH0) r0
            java.lang.String r6 = r0.A04
            if (r6 == 0) goto L_0x0135
            java.lang.String r7 = r0.A02
            if (r7 == 0) goto L_0x0132
            java.lang.String r8 = r0.A01
            if (r8 == 0) goto L_0x012f
            java.lang.String r9 = r0.A03
            if (r9 == 0) goto L_0x013e
            java.lang.String r10 = r0.A00
            if (r10 == 0) goto L_0x012c
            boolean r11 = r0.A05
            X.Dtc r5 = new X.Dtc
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r1.add(r5)
            goto L_0x00a2
        L_0x00cd:
            boolean r11 = r2.A04
            goto L_0x0072
        L_0x00d0:
            r4 = r2
            r3 = r2
            goto L_0x0041
        L_0x00d4:
            X.0eS.A00(r2)
            com.instagram.common.session.UserSession r8 = r9.A04
            X.0qQ.A0B(r10, r5)
            X.1NY r6 = X.DbU.A0M(r8)
            java.lang.Integer r7 = X.AnonymousClass05K.A0N
            r6.A08(r7)
            java.lang.Object[] r1 = new java.lang.Object[]{r10}
            java.lang.String r0 = "direct_v2/channels/list/event/%s/"
            r6.A0K(r0, r1)
            java.lang.Class<X.NHG> r1 = X.NHG.class
            java.lang.Class<X.OQC> r0 = X.OQC.class
            r6.A0Q(r1, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319407393938750(0x81084f002b1d3e, double:3.0318777102173234E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x0115
            java.lang.String r0 = "broadcast_channels_featured_event/"
            java.lang.String r0 = X.002.A0R(r0, r10)
            r6.A0A = r0
            r6.A07(r7)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.HOURS
            long r0 = X.JTR.A0N(r0)
            r6.A01 = r0
        L_0x0115:
            X.1OC r1 = r6.A0M()
            r3.A01 = r9
            r3.A00 = r5
            r0 = -5
            java.lang.Object r2 = r1.A00(r0, r3)
            if (r2 != r4) goto L_0x0028
            return r4
        L_0x0125:
            X.MDh r3 = new X.MDh
            r3.<init>(r9, r11, r4)
            goto L_0x0016
        L_0x012c:
            java.lang.String r0 = "creatorUsername"
            goto L_0x0140
        L_0x012f:
            java.lang.String r0 = "imageUrl"
            goto L_0x0140
        L_0x0132:
            java.lang.String r0 = "subtitle"
            goto L_0x0140
        L_0x0135:
            java.lang.String r0 = "title"
            goto L_0x0140
        L_0x0138:
            java.lang.String r0 = "items"
            goto L_0x0140
        L_0x013b:
            java.lang.String r0 = "sectionName"
            goto L_0x0140
        L_0x013e:
            java.lang.String r0 = "threadId"
        L_0x0140:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0148:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0156
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0151:
            X.3Ih r2 = new X.3Ih
            r2.<init>(r1)
        L_0x0156:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0162
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0163
            X.5sO r2 = X.DbU.A0f()
        L_0x0162:
            return r2
        L_0x0163:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0168:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.channels.featuredevent.ChannelsFeaturedEventListViewModel.A00(com.instagram.direct.fragment.channels.featuredevent.ChannelsFeaturedEventListViewModel, java.lang.String, X.4D7):java.lang.Object");
    }
}
