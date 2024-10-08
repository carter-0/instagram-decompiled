package com.instagram.sup.voltron;

import X.002;
import X.0qQ;
import X.136;
import X.19E;
import X.1RH;
import X.1US;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass12T;
import X.AnonymousClass12V;
import X.AnonymousClass19G;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C20591WvU;
import X.C20672Wx4;
import X.C20984X7z;
import X.C262204Co;
import X.C262224Cq;
import X.C362988ir;
import X.C363058j1;
import X.C363068j2;
import X.C66532MVm;
import X.PyB;
import X.PyC;
import X.WYU;
import X.X58;
import X.X73;
import X.X74;
import X.XBm;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class SUPMediaStreamControllerDownloader {
    public XBm A00;
    public X73 A01;
    public C20984X7z A02;
    public X74 A03;
    public C66532MVm A04;
    public final AtomicBoolean A05;
    public final AnonymousClass0eM A06;
    public final C262224Cq A07;
    public final 136 A08;

    public SUPMediaStreamControllerDownloader(AnonymousClass12V r4) {
        0qQ.A0B(r4, 1);
        this.A08 = new 136();
        this.A07 = 19E.A02(new AnonymousClass19G((C262204Co) null).plus(r4.AOJ(730193652, 3)));
        this.A05 = new AtomicBoolean();
        this.A06 = AnonymousClass0eN.A01(C20672Wx4.A00);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072 A[Catch:{ all -> 0x0084, all -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(android.content.Context r10, com.instagram.common.session.UserSession r11, com.instagram.sup.voltron.SUPMediaStreamControllerDownloader r12, X.AnonymousClass4D7 r13) {
        /*
            r4 = 31
            boolean r0 = X.ME0.A02(r4, r13)
            if (r0 == 0) goto L_0x0038
            r3 = r13
            X.ME0 r3 = (X.ME0) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0038
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r3.A05
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r5 = 0
            java.lang.String r8 = "sup:MediaStreamControllerDownloader"
            r6 = 1
            if (r0 == 0) goto L_0x0043
            if (r0 != r6) goto L_0x003e
            java.lang.Object r4 = r3.A04
            X.136 r4 = (X.136) r4
            java.lang.Object r11 = r3.A03
            com.instagram.common.session.UserSession r11 = (com.instagram.common.session.UserSession) r11
            java.lang.Object r10 = r3.A02
            android.content.Context r10 = (android.content.Context) r10
            java.lang.Object r12 = r3.A01
            com.instagram.sup.voltron.SUPMediaStreamControllerDownloader r12 = (com.instagram.sup.voltron.SUPMediaStreamControllerDownloader) r12
            X.0eS.A00(r1)
            goto L_0x0060
        L_0x0038:
            X.ME0 r3 = new X.ME0
            r3.<init>(r12, r13, r4)
            goto L_0x0016
        L_0x003e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0043:
            X.0eS.A00(r1)
            X.8j2 r1 = X.C363058j1.A02
            java.lang.String r0 = "Successfully downloaded module"
            r1.A01(r8, r0)
            X.136 r4 = r12.A08
            r3.A01 = r12
            r3.A02 = r10
            r3.A03 = r11
            r3.A04 = r4
            r3.A00 = r6
            java.lang.Object r0 = X.136.A00(r3, r4)
            if (r0 != r2) goto L_0x0060
            return r2
        L_0x0060:
            X.0eM r7 = r12.A06     // Catch:{ all -> 0x00a6 }
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r7)     // Catch:{ all -> 0x00a6 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x00a6 }
            java.util.Iterator r9 = X.AnonymousClass7TF.A0u(r0)     // Catch:{ all -> 0x00a6 }
        L_0x006c:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x0091
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r9)     // Catch:{ all -> 0x00a6 }
            java.lang.String r3 = X.DbT.A13(r0)     // Catch:{ all -> 0x00a6 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x00a6 }
            X.X58 r0 = (X.X58) r0     // Catch:{ all -> 0x00a6 }
            A01(r10, r11, r0, r12)     // Catch:{ all -> 0x0084 }
            goto L_0x006c
        L_0x0084:
            r2 = move-exception
            X.8j2 r1 = X.C363058j1.A02     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "error executing callback with callerId "
            java.lang.String r0 = X.002.A0R(r0, r3)     // Catch:{ all -> 0x00a6 }
            r1.A05(r8, r0, r2)     // Catch:{ all -> 0x00a6 }
            goto L_0x006c
        L_0x0091:
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r7)     // Catch:{ all -> 0x00a6 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x00a6 }
            r0.clear()     // Catch:{ all -> 0x00a6 }
            java.util.concurrent.atomic.AtomicBoolean r1 = r12.A05     // Catch:{ all -> 0x00a6 }
            r0 = 0
            r1.compareAndSet(r6, r0)     // Catch:{ all -> 0x00a6 }
            r4.A05(r5)
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x00a6:
            r0 = move-exception
            r4.A05(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.sup.voltron.SUPMediaStreamControllerDownloader.A00(android.content.Context, com.instagram.common.session.UserSession, com.instagram.sup.voltron.SUPMediaStreamControllerDownloader, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0175  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.content.Context r4, com.instagram.common.session.UserSession r5, X.X58 r6, com.instagram.sup.voltron.SUPMediaStreamControllerDownloader r7) {
        /*
            X.MVm r0 = r7.A04
            if (r0 != 0) goto L_0x004a
            java.lang.String r3 = "sup:MediaStreamControllerDownloader"
            java.lang.String r0 = "com.instagram.sup.impl.mvvm.SupernovaViewFactoryImpl"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ LinkageError -> 0x002c, ExceptionInInitializerError -> 0x0026, ClassNotFoundException -> 0x0020, IllegalAccessException -> 0x001a, InstantiationException -> 0x0032 }
            java.lang.Object r1 = r0.newInstance()     // Catch:{ LinkageError -> 0x002c, ExceptionInInitializerError -> 0x0026, ClassNotFoundException -> 0x0020, IllegalAccessException -> 0x001a, InstantiationException -> 0x0032 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.sup.intf.SupernovaViewFactory"
            X.0qQ.A0C(r1, r0)     // Catch:{ LinkageError -> 0x002c, ExceptionInInitializerError -> 0x0026, ClassNotFoundException -> 0x0020, IllegalAccessException -> 0x001a, InstantiationException -> 0x0032 }
            X.MVm r1 = (X.C66532MVm) r1     // Catch:{ LinkageError -> 0x002c, ExceptionInInitializerError -> 0x0026, ClassNotFoundException -> 0x0020, IllegalAccessException -> 0x001a, InstantiationException -> 0x0032 }
            r7.A04 = r1     // Catch:{ LinkageError -> 0x002c, ExceptionInInitializerError -> 0x0026, ClassNotFoundException -> 0x0020, IllegalAccessException -> 0x001a, InstantiationException -> 0x0032 }
            goto L_0x003a
        L_0x001a:
            r2 = move-exception
            X.8j2 r1 = X.C363058j1.A02
            java.lang.String r0 = "IllegalAccessException"
            goto L_0x0037
        L_0x0020:
            r2 = move-exception
            X.8j2 r1 = X.C363058j1.A02
            java.lang.String r0 = "ClassNotFoundException"
            goto L_0x0037
        L_0x0026:
            r2 = move-exception
            X.8j2 r1 = X.C363058j1.A02
            java.lang.String r0 = "ExceptionInInitializerError"
            goto L_0x0037
        L_0x002c:
            r2 = move-exception
            X.8j2 r1 = X.C363058j1.A02
            java.lang.String r0 = "LinkageError"
            goto L_0x0037
        L_0x0032:
            r2 = move-exception
            X.8j2 r1 = X.C363058j1.A02
            java.lang.String r0 = "InstantiationException"
        L_0x0037:
            r1.A05(r3, r0, r2)
        L_0x003a:
            X.MVm r1 = r7.A04
            if (r1 == 0) goto L_0x004a
            boolean r0 = X.C362988ir.A01(r4, r5)
            if (r0 == 0) goto L_0x004a
            X.1pd r0 = X.C362988ir.A00()
            r0.A03 = r1
        L_0x004a:
            X.XBm r0 = r7.A00
            if (r0 != 0) goto L_0x0084
            java.lang.String r3 = "sup:MediaStreamControllerDownloader"
            java.lang.String r0 = "com.facebook.wearable.mediastream.controller.MediaStreamController"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ LinkageError -> 0x0076, ExceptionInInitializerError -> 0x0070, ClassNotFoundException -> 0x006a, IllegalAccessException -> 0x0064, InstantiationException -> 0x007c }
            java.lang.Object r1 = r0.newInstance()     // Catch:{ LinkageError -> 0x0076, ExceptionInInitializerError -> 0x0070, ClassNotFoundException -> 0x006a, IllegalAccessException -> 0x0064, InstantiationException -> 0x007c }
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.wearable.mediastream.controller.intf.IMediaStreamController"
            X.0qQ.A0C(r1, r0)     // Catch:{ LinkageError -> 0x0076, ExceptionInInitializerError -> 0x0070, ClassNotFoundException -> 0x006a, IllegalAccessException -> 0x0064, InstantiationException -> 0x007c }
            X.XBm r1 = (X.XBm) r1     // Catch:{ LinkageError -> 0x0076, ExceptionInInitializerError -> 0x0070, ClassNotFoundException -> 0x006a, IllegalAccessException -> 0x0064, InstantiationException -> 0x007c }
            r7.A00 = r1     // Catch:{ LinkageError -> 0x0076, ExceptionInInitializerError -> 0x0070, ClassNotFoundException -> 0x006a, IllegalAccessException -> 0x0064, InstantiationException -> 0x007c }
            goto L_0x0084
        L_0x0064:
            r2 = move-exception
            X.8j2 r1 = X.C363058j1.A02
            java.lang.String r0 = "IllegalAccessException"
            goto L_0x0081
        L_0x006a:
            r2 = move-exception
            X.8j2 r1 = X.C363058j1.A02
            java.lang.String r0 = "ClassNotFoundException"
            goto L_0x0081
        L_0x0070:
            r2 = move-exception
            X.8j2 r1 = X.C363058j1.A02
            java.lang.String r0 = "ExceptionInInitializerError"
            goto L_0x0081
        L_0x0076:
            r2 = move-exception
            X.8j2 r1 = X.C363058j1.A02
            java.lang.String r0 = "LinkageError"
            goto L_0x0081
        L_0x007c:
            r2 = move-exception
            X.8j2 r1 = X.C363058j1.A02
            java.lang.String r0 = "InstantiationException"
        L_0x0081:
            r1.A05(r3, r0, r2)
        L_0x0084:
            X.XBm r0 = r7.A00
            java.lang.String r3 = "sup:MediaStreamControllerDownloader"
            if (r0 == 0) goto L_0x00a7
            boolean r0 = r0.CWn(r4)
            if (r0 != 0) goto L_0x00a7
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r5)
            r0 = 36316242004152481(0x81056e003c10a1, double:3.029875904970485E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 != 0) goto L_0x00a7
            X.8j2 r1 = X.C363058j1.A02
            java.lang.String r0 = "MWA version is not valid"
        L_0x00a3:
            r1.A01(r3, r0)
        L_0x00a6:
            return
        L_0x00a7:
            X.X7z r1 = r7.A02
            if (r1 == 0) goto L_0x00b3
            X.X74 r0 = r7.A03
            if (r0 == 0) goto L_0x00b3
            X.X73 r0 = r7.A01
            if (r0 != 0) goto L_0x0171
        L_0x00b3:
            if (r1 != 0) goto L_0x00c8
            java.lang.String r0 = "com.instagram.sup.impl.logger.SUPFalcoLoggerFactoryImpl"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ LinkageError -> 0x0109, ExceptionInInitializerError -> 0x0103, ClassNotFoundException -> 0x00fd, IllegalAccessException -> 0x00f7, InstantiationException -> 0x010f }
            java.lang.Object r1 = r0.newInstance()     // Catch:{ LinkageError -> 0x0109, ExceptionInInitializerError -> 0x0103, ClassNotFoundException -> 0x00fd, IllegalAccessException -> 0x00f7, InstantiationException -> 0x010f }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.sup.intf.SUPFalcoLoggerFactory"
            X.0qQ.A0C(r1, r0)     // Catch:{ LinkageError -> 0x0109, ExceptionInInitializerError -> 0x0103, ClassNotFoundException -> 0x00fd, IllegalAccessException -> 0x00f7, InstantiationException -> 0x010f }
            X.X7z r1 = (X.C20984X7z) r1     // Catch:{ LinkageError -> 0x0109, ExceptionInInitializerError -> 0x0103, ClassNotFoundException -> 0x00fd, IllegalAccessException -> 0x00f7, InstantiationException -> 0x010f }
            r7.A02 = r1     // Catch:{ LinkageError -> 0x0109, ExceptionInInitializerError -> 0x0103, ClassNotFoundException -> 0x00fd, IllegalAccessException -> 0x00f7, InstantiationException -> 0x010f }
        L_0x00c8:
            X.X74 r0 = r7.A03     // Catch:{ LinkageError -> 0x0109, ExceptionInInitializerError -> 0x0103, ClassNotFoundException -> 0x00fd, IllegalAccessException -> 0x00f7, InstantiationException -> 0x010f }
            if (r0 != 0) goto L_0x00df
            java.lang.String r0 = "com.instagram.sup.impl.logger.SUPPerfLoggerFactoryImpl"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ LinkageError -> 0x0109, ExceptionInInitializerError -> 0x0103, ClassNotFoundException -> 0x00fd, IllegalAccessException -> 0x00f7, InstantiationException -> 0x010f }
            java.lang.Object r1 = r0.newInstance()     // Catch:{ LinkageError -> 0x0109, ExceptionInInitializerError -> 0x0103, ClassNotFoundException -> 0x00fd, IllegalAccessException -> 0x00f7, InstantiationException -> 0x010f }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.sup.intf.SUPPerfLoggerFactory"
            X.0qQ.A0C(r1, r0)     // Catch:{ LinkageError -> 0x0109, ExceptionInInitializerError -> 0x0103, ClassNotFoundException -> 0x00fd, IllegalAccessException -> 0x00f7, InstantiationException -> 0x010f }
            X.X74 r1 = (X.X74) r1     // Catch:{ LinkageError -> 0x0109, ExceptionInInitializerError -> 0x0103, ClassNotFoundException -> 0x00fd, IllegalAccessException -> 0x00f7, InstantiationException -> 0x010f }
            r7.A03 = r1     // Catch:{ LinkageError -> 0x0109, ExceptionInInitializerError -> 0x0103, ClassNotFoundException -> 0x00fd, IllegalAccessException -> 0x00f7, InstantiationException -> 0x010f }
        L_0x00df:
            X.X73 r0 = r7.A01     // Catch:{ LinkageError -> 0x0109, ExceptionInInitializerError -> 0x0103, ClassNotFoundException -> 0x00fd, IllegalAccessException -> 0x00f7, InstantiationException -> 0x010f }
            if (r0 != 0) goto L_0x0117
            java.lang.String r0 = "com.instagram.sup.impl.logger.SUPContinuityPerfLoggerFactoryImpl"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ LinkageError -> 0x0109, ExceptionInInitializerError -> 0x0103, ClassNotFoundException -> 0x00fd, IllegalAccessException -> 0x00f7, InstantiationException -> 0x010f }
            java.lang.Object r1 = r0.newInstance()     // Catch:{ LinkageError -> 0x0109, ExceptionInInitializerError -> 0x0103, ClassNotFoundException -> 0x00fd, IllegalAccessException -> 0x00f7, InstantiationException -> 0x010f }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.sup.intf.SUPContinuityPerfLoggerFactory"
            X.0qQ.A0C(r1, r0)     // Catch:{ LinkageError -> 0x0109, ExceptionInInitializerError -> 0x0103, ClassNotFoundException -> 0x00fd, IllegalAccessException -> 0x00f7, InstantiationException -> 0x010f }
            X.X73 r1 = (X.X73) r1     // Catch:{ LinkageError -> 0x0109, ExceptionInInitializerError -> 0x0103, ClassNotFoundException -> 0x00fd, IllegalAccessException -> 0x00f7, InstantiationException -> 0x010f }
            r7.A01 = r1     // Catch:{ LinkageError -> 0x0109, ExceptionInInitializerError -> 0x0103, ClassNotFoundException -> 0x00fd, IllegalAccessException -> 0x00f7, InstantiationException -> 0x010f }
            goto L_0x0117
        L_0x00f7:
            r2 = move-exception
            X.8j2 r1 = X.C363058j1.A02
            java.lang.String r0 = "IllegalAccessException"
            goto L_0x0114
        L_0x00fd:
            r2 = move-exception
            X.8j2 r1 = X.C363058j1.A02
            java.lang.String r0 = "ClassNotFoundException"
            goto L_0x0114
        L_0x0103:
            r2 = move-exception
            X.8j2 r1 = X.C363058j1.A02
            java.lang.String r0 = "ExceptionInInitializerError"
            goto L_0x0114
        L_0x0109:
            r2 = move-exception
            X.8j2 r1 = X.C363058j1.A02
            java.lang.String r0 = "LinkageError"
            goto L_0x0114
        L_0x010f:
            r2 = move-exception
            X.8j2 r1 = X.C363058j1.A02
            java.lang.String r0 = "InstantiationException"
        L_0x0114:
            r1.A05(r3, r0, r2)
        L_0x0117:
            X.X7z r2 = r7.A02
            if (r2 == 0) goto L_0x0135
            r2.Epq(r5)
            X.XBm r1 = r7.A00
            if (r1 == 0) goto L_0x0129
            X.W2Q r0 = r2.Boy()
            r1.EVx(r0)
        L_0x0129:
            boolean r0 = X.C362988ir.A01(r4, r5)
            if (r0 == 0) goto L_0x0135
            X.1pd r0 = X.C362988ir.A00()
            r0.A01 = r2
        L_0x0135:
            X.X74 r2 = r7.A03
            if (r2 == 0) goto L_0x0153
            r2.Epq(r5)
            X.XBm r1 = r7.A00
            if (r1 == 0) goto L_0x0147
            X.X8J r0 = r2.Boz()
            r1.EfY(r0)
        L_0x0147:
            boolean r0 = X.C362988ir.A01(r4, r5)
            if (r0 == 0) goto L_0x0153
            X.1pd r0 = X.C362988ir.A00()
            r0.A02 = r2
        L_0x0153:
            X.X73 r2 = r7.A01
            if (r2 == 0) goto L_0x0171
            r2.Epq(r5)
            X.XBm r1 = r7.A00
            if (r1 == 0) goto L_0x0165
            X.X8r r0 = r2.Box()
            r1.ESq(r0)
        L_0x0165:
            boolean r0 = X.C362988ir.A01(r4, r5)
            if (r0 == 0) goto L_0x0171
            X.1pd r0 = X.C362988ir.A00()
            r0.A00 = r2
        L_0x0171:
            boolean r0 = r6 instanceof X.C66572MXc
            if (r0 == 0) goto L_0x0188
            X.MVm r1 = r7.A04
            if (r1 == 0) goto L_0x0182
            X.Wnt r0 = new X.Wnt
            r0.<init>(r6, r1)
            X.11Z.A02(r0)
            return
        L_0x0182:
            X.8j2 r1 = X.C363058j1.A02
            java.lang.String r0 = "viewFactory not instantiated"
            goto L_0x00a3
        L_0x0188:
            boolean r0 = r6 instanceof X.C19666WdU
            if (r0 == 0) goto L_0x00a6
            X.XBm r0 = r7.A00
            if (r0 == 0) goto L_0x0194
            r6.Dbb(r0)
            return
        L_0x0194:
            X.8j2 r1 = X.C363058j1.A02
            java.lang.String r0 = "Controller not instantiated"
            goto L_0x00a3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.sup.voltron.SUPMediaStreamControllerDownloader.A01(android.content.Context, com.instagram.common.session.UserSession, X.X58, com.instagram.sup.voltron.SUPMediaStreamControllerDownloader):void");
    }

    public final void A02(Context context, UserSession userSession, X58 x58, String str) {
        String str2;
        C363068j2 r4 = C363058j1.A02;
        r4.A03("sup:MediaStreamControllerDownloader", "Attempt to load Voltron module");
        String str3 = str;
        if (((Map) AnonymousClass7TE.A14(this.A06)).containsKey(str)) {
            r4.A06("sup:MediaStreamControllerDownloader", 002.A0g("Warning! Callback ID ", str, " already exists.  Adding a callback with the same ID will overwrite the existing one"), (Throwable) null);
        }
        Context context2 = context;
        UserSession userSession2 = userSession;
        if (!C362988ir.A01(context.getApplicationContext(), userSession)) {
            r4.A06("sup:MediaStreamControllerDownloader", "Sup plugin not available, failed DL", (Throwable) null);
            return;
        }
        AtomicBoolean atomicBoolean = this.A05;
        X58 x582 = x58;
        if (atomicBoolean.get()) {
            str2 = "Skip download request, currently downloading";
        } else {
            1RH A002 = 1RH.A00();
            1US r3 = 1US.A1G;
            if (!A002.A05(r3)) {
                r4.A01("sup:MediaStreamControllerDownloader", "start downloading request");
                r4.A03("sup:MediaStreamControllerDownloader", "Handling AddCallback");
                AnonymousClass7TE.A1Z(new C20591WvU(context2, userSession2, x582, this, str3, (AnonymousClass4D7) null), this.A07);
                atomicBoolean.compareAndSet(false, true);
                1RH A003 = 1RH.A00();
                PyC pyC = new PyC(r3);
                pyC.A03 = AnonymousClass05K.A00;
                pyC.A02 = new WYU(context, userSession, this);
                A003.A03(userSession, new PyB(pyC));
                return;
            } else if (1RH.A00().A06(r3) || 1RH.A00().A07(r3)) {
                A01(context, userSession, x58, this);
                return;
            } else {
                str2 = "Module not loaded";
            }
        }
        r4.A01("sup:MediaStreamControllerDownloader", str2);
        r4.A03("sup:MediaStreamControllerDownloader", "Handling AddCallback");
        AnonymousClass7TE.A1Z(new C20591WvU(context2, userSession2, x582, this, str3, (AnonymousClass4D7) null), this.A07);
    }

    public SUPMediaStreamControllerDownloader() {
        this(AnonymousClass12T.A00);
    }
}
