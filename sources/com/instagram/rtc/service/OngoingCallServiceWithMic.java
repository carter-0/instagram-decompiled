package com.instagram.rtc.service;

import X.05G;
import X.0Sy;
import X.0Tu;
import X.0eG;
import X.0qQ;
import X.0sc;
import X.1Q7;
import X.AIZ;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass38W;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C262224Cq;
import X.C305926Kc;
import X.C58685Ivu;
import X.C66580MXl;
import X.C66583MXo;
import X.C66953Mfm;
import X.C72192OyC;
import X.C73886PlN;
import X.C73887PlO;
import X.DbS;
import X.DbT;
import X.DbX;
import X.DbY;
import X.JTQ;
import X.N9B;
import X.N9N;
import X.OJ9;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Iterator;

public final class OngoingCallServiceWithMic extends Service implements AnonymousClass0iw {
    public static final OJ9 A05 = new Object();
    public Notification A00;
    public UserSession A01;
    public HashSet A02;
    public final AnonymousClass0eM A03 = C58685Ivu.A00(this, 3);
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(C73887PlO.A00);

    public final String getModuleName() {
        return "OngoingCallServiceWithMic";
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public static final void A00(Notification notification, OngoingCallServiceWithMic ongoingCallServiceWithMic) {
        Throwable th;
        if (ongoingCallServiceWithMic.A01 != null) {
            ongoingCallServiceWithMic.A00 = notification;
            if (JTQ.A1P(Build.VERSION.SDK_INT, 34)) {
                A01(ongoingCallServiceWithMic, (N9B) null);
                UserSession userSession = ongoingCallServiceWithMic.A01;
                if (userSession == null) {
                    0qQ.A0F("userSession");
                    e = AnonymousClass00P.createAndThrow();
                } else {
                    C72192OyC A002 = C66953Mfm.A00(DbT.A05(ongoingCallServiceWithMic), userSession);
                    try {
                        HashSet hashSet = ongoingCallServiceWithMic.A02;
                        if (hashSet == null) {
                            0qQ.A0F("foregroundServiceTypes");
                            th = AnonymousClass00P.createAndThrow();
                        } else {
                            Iterator it = hashSet.iterator();
                            if (it.hasNext()) {
                                Object next = it.next();
                                while (it.hasNext()) {
                                    next = Integer.valueOf(AnonymousClass7TE.A0M(next) | AnonymousClass7TG.A0F(it));
                                }
                                ongoingCallServiceWithMic.startForeground(20025, notification, AnonymousClass7TE.A0M(next));
                                return;
                            }
                            th = AnonymousClass7TE.A1B(AnonymousClass000.A00(932));
                        }
                        throw th;
                    } catch (SecurityException e) {
                        e = e;
                        UserSession userSession2 = ongoingCallServiceWithMic.A01;
                        if (userSession2 == null) {
                            0qQ.A0F("userSession");
                            throw AnonymousClass00P.createAndThrow();
                        } else if (DbY.A1Y(0Tu.A05, userSession2, 36323951466524288L)) {
                            05G r0 = A002.A09.A0H.A01;
                            N9N n9n = (N9N) r0.getValue();
                            boolean z = n9n.A04;
                            boolean z2 = n9n.A06;
                            boolean z3 = n9n.A05;
                            boolean z4 = n9n.A07;
                            r0.FIA(new N9N(n9n.A00, n9n.A01, n9n.A02, n9n.A03, z, z2, z3, z4, n9n.A0A, true, n9n.A08));
                            ongoingCallServiceWithMic.startForeground(20025, notification, 4);
                            return;
                        }
                    }
                }
                throw e;
            }
            ongoingCallServiceWithMic.startForeground(20025, notification);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        if (r9.A03 != false) goto L_0x005a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0079 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(com.instagram.rtc.service.OngoingCallServiceWithMic r8, X.N9B r9) {
        /*
            com.instagram.common.session.UserSession r2 = r8.A01
            r7 = 0
            if (r2 == 0) goto L_0x007c
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r1 < r0) goto L_0x007c
            android.content.Context r0 = X.DbT.A05(r8)
            X.OyC r0 = X.C66953Mfm.A00(r0, r2)
            X.OVd r0 = r0.A09
            X.NfA r0 = r0.A0H
            X.05G r0 = r0.A01
            r1 = 0
            java.lang.Object r5 = r0.getValue()
            X.N9N r5 = (X.N9N) r5
            android.content.Context r2 = r8.getApplicationContext()
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            boolean r0 = X.1DL.A07(r2, r0)
            if (r0 == 0) goto L_0x0088
            java.util.HashSet r4 = r8.A02
            java.lang.String r3 = "foregroundServiceTypes"
            if (r4 == 0) goto L_0x008a
            r0 = 128(0x80, float:1.794E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r0 = r4.contains(r2)
            if (r0 != 0) goto L_0x0088
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0088
            java.util.HashSet r0 = r8.A02
            if (r0 == 0) goto L_0x008a
            boolean r6 = r0.add(r2)
        L_0x004a:
            if (r9 == 0) goto L_0x004e
            X.Nj8 r1 = r9.A00
        L_0x004e:
            X.Nj8 r0 = X.C69307Nj8.PERMISSION_GRANTED
            r5 = 0
            if (r1 == r0) goto L_0x005a
            if (r9 == 0) goto L_0x0077
            boolean r0 = r9.A03
            r4 = 0
            if (r0 == 0) goto L_0x005b
        L_0x005a:
            r4 = 1
        L_0x005b:
            java.util.HashSet r3 = r8.A02
            java.lang.String r2 = "foregroundServiceTypes"
            if (r3 == 0) goto L_0x008e
            r0 = 32
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r0 = r3.contains(r1)
            if (r4 == 0) goto L_0x007d
            if (r0 != 0) goto L_0x0077
            java.util.HashSet r0 = r8.A02
            if (r0 == 0) goto L_0x008e
            boolean r5 = r0.add(r1)
        L_0x0077:
            if (r6 != 0) goto L_0x007b
            if (r5 == 0) goto L_0x007c
        L_0x007b:
            r7 = 1
        L_0x007c:
            return r7
        L_0x007d:
            if (r0 == 0) goto L_0x0077
            java.util.HashSet r0 = r8.A02
            if (r0 == 0) goto L_0x008e
            boolean r5 = r0.remove(r1)
            goto L_0x0077
        L_0x0088:
            r6 = 0
            goto L_0x004a
        L_0x008a:
            X.0qQ.A0F(r3)
            goto L_0x0091
        L_0x008e:
            X.0qQ.A0F(r2)
        L_0x0091:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.rtc.service.OngoingCallServiceWithMic.A01(com.instagram.rtc.service.OngoingCallServiceWithMic, X.N9B):boolean");
    }

    public final void onCreate() {
        HashSet A1F;
        int A042 = AnonymousClass0fD.A04(-432750792);
        UserSession A0S = DbS.A0S(this);
        if (A0S instanceof UserSession) {
            this.A01 = A0S;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            A1F = 0sc.A05(new Integer[]{4});
        } else {
            A1F = AnonymousClass7TE.A1F();
        }
        this.A02 = A1F;
        if (i >= 34) {
            DbX.A1X(this, (C262224Cq) this.A04.getValue(), 41);
        }
        A00(((AIZ) this.A03.getValue()).A03(), this);
        AnonymousClass0fD.A0B(-1239357469, A042);
    }

    public final void onDestroy() {
        int A042 = AnonymousClass0fD.A04(-726800032);
        super.onDestroy();
        if (Build.VERSION.SDK_INT >= 34) {
            this.A02 = 0sc.A05(new Integer[]{4});
        }
        this.A00 = null;
        C305926Kc.A00(this);
        AnonymousClass0fD.A0B(-3681730, A042);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        int A042 = AnonymousClass0fD.A04(-1042534226);
        if (intent != null) {
            0eG.A01.A01(this, intent);
        }
        UserSession A0S = DbS.A0S(this);
        int i4 = 2;
        int i5 = i2;
        if (!(A0S instanceof UserSession) || intent == null) {
            A00(((AIZ) this.A03.getValue()).A03(), this);
            stopForeground(true);
            stopSelf(i5);
            i3 = 1870722535;
        } else {
            this.A01 = A0S;
            String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != 2544381) {
                    if (hashCode == 72308375 && action.equals("LEAVE")) {
                        UserSession userSession = this.A01;
                        if (userSession != null) {
                            AnonymousClass38W.A00().A00(DbT.A05(this), userSession).A0A(C73886PlN.A00);
                            i3 = -1556112220;
                        }
                    }
                } else if (action.equals("SHOW")) {
                    String stringExtra = intent.getStringExtra("TITLE");
                    boolean booleanExtra = intent.getBooleanExtra("IS_AUDIO_CALL", false);
                    intent.getStringExtra("AVATAR_URL");
                    long longExtra = intent.getLongExtra("CALL_START_REAL_TIME", System.currentTimeMillis());
                    AIZ aiz = (AIZ) this.A03.getValue();
                    0Sy r4 = new 0Sy();
                    Context A052 = DbT.A05(this);
                    UserSession userSession2 = this.A01;
                    if (userSession2 != null) {
                        r4.A0A(C66583MXo.A08(A052, userSession2));
                        r4.A09();
                        r4.A08 = new 1Q7("IgSecurePendingIntent").A00;
                        PendingIntent A012 = r4.A01(getApplicationContext(), 0, 134217728);
                        0Sy r42 = new 0Sy();
                        Intent A0A = C66580MXl.A0A(DbT.A05(this).getApplicationContext(), OngoingCallServiceWithMic.class);
                        A0A.setAction("LEAVE");
                        r42.A0B(A0A, getApplicationContext().getClassLoader());
                        PendingIntent A032 = r42.A03(getApplicationContext(), 0, 0);
                        UserSession userSession3 = this.A01;
                        if (userSession3 != null) {
                            A00(aiz.A05(A012, A032, userSession3, stringExtra, longExtra, booleanExtra), this);
                            i4 = 3;
                            i3 = -1556112220;
                        }
                    }
                }
                DbS.A17();
                throw AnonymousClass00P.createAndThrow();
            }
            A00(((AIZ) this.A03.getValue()).A03(), this);
            stopForeground(true);
            stopSelf(i5);
            i3 = -1556112220;
        }
        AnonymousClass0fD.A0B(i3, A042);
        return i4;
    }
}
