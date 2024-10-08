package com.instagram.direct.locationsharing.service;

import X.00k;
import X.0Sy;
import X.0Tu;
import X.0qQ;
import X.2Yu;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass7AZ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass9T8;
import X.C10294Rps;
import X.C10295Rpt;
import X.C11218SFs;
import X.C13169TOb;
import X.C13709TfW;
import X.C327297Af;
import X.C327307Ag;
import X.C327337Aj;
import X.C51971G9r;
import X.C66580MXl;
import X.C73918Ply;
import X.C74185PqR;
import X.C8367QpP;
import X.C8598Qxe;
import X.DbS;
import X.DbY;
import X.F5W;
import X.JG2;
import X.JTP;
import X.S2X;
import X.TOY;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class DirectLiveLocationService extends Service implements C327337Aj {
    public C8367QpP A00;
    public UserSession A01;
    public S2X A02;
    public boolean A03;
    public final C8598Qxe A04 = new C8598Qxe(this);
    public final C10294Rps A05 = new C10294Rps(this);
    public final HashMap A06 = AnonymousClass7TE.A1E();
    public final Set A07 = DbS.A0y();

    public final void DNu(long j, String str, boolean z, String str2) {
        0qQ.A0B(str2, 1);
        if (A04(this)) {
            Object computeIfAbsent = this.A06.computeIfAbsent(str2, new C13169TOb(1, new C74185PqR(22, (Object) this, (Object) this)));
            0qQ.A07(computeIfAbsent);
            C11218SFs sFs = (C11218SFs) computeIfAbsent;
            if (z) {
                A01(this, sFs, j);
            } else {
                A02(this, sFs, j);
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    private final void A00() {
        Intent A002 = F5W.A00(this, "all", AnonymousClass000.A00(3002), (String) null, 67108864);
        AnonymousClass9T8 r3 = new AnonymousClass9T8((Context) this, "ig_location_sharing_channel_id");
        r3.A0C(getString(R.string.f0nameremoved));
        int i = R.drawable.notification_icon;
        int A0H = 2Yu.A0H(this, R.attr.defaultNotificationIcon);
        if (A0H != 0) {
            i = A0H;
        }
        r3.A04(i);
        0Sy r2 = new 0Sy();
        r2.A0A(A002);
        r3.A0C = r2.A01(this, 0, 268435456);
        r3.A0E(false);
        AnonymousClass9T8.A01(r3, 2, true);
        Notification A032 = r3.A03();
        0qQ.A07(A032);
        if (Build.VERSION.SDK_INT >= 29) {
            startForeground(20017, A032, 8);
        } else {
            startForeground(20017, A032);
        }
    }

    public static final void A01(DirectLiveLocationService directLiveLocationService, C11218SFs sFs, long j) {
        Set set = directLiveLocationService.A07;
        Long valueOf = Long.valueOf(j);
        if (!set.contains(valueOf) && sFs.A04.A01()) {
            Set set2 = sFs.A09;
            if (!set2.contains(valueOf)) {
                set2.add(valueOf);
                sFs.A01 = 00k.A0a(set2);
                if (set2.size() == 1) {
                    sFs.A05.A07((C13709TfW) sFs.A0A.getValue(), sFs.A03, "InstagramDirectLocationManager");
                }
            }
            set.add(valueOf);
        }
    }

    public static final void A02(DirectLiveLocationService directLiveLocationService, C11218SFs sFs, long j) {
        Set set = directLiveLocationService.A07;
        Long valueOf = Long.valueOf(j);
        if (set.contains(valueOf)) {
            Set set2 = sFs.A09;
            if (set2.contains(valueOf)) {
                set2.remove(valueOf);
                sFs.A01 = 00k.A0a(set2);
                if (set2.isEmpty()) {
                    sFs.A05.A06();
                }
                set.remove(valueOf);
            }
        }
    }

    private final void A03(String str) {
        S2X s2x = this.A02;
        if (s2x != null) {
            if (!s2x.A02.containsKey(str)) {
                UserSession userSession = this.A01;
                if (userSession != null) {
                    C327307Ag r4 = (C327307Ag) userSession.A01(C327307Ag.class, new C73918Ply(userSession, 7));
                    r4.A01.add(this);
                    S2X s2x2 = this.A02;
                    if (s2x2 != null) {
                        UserSession userSession2 = this.A01;
                        if (userSession2 != null) {
                            C327297Af A002 = new AnonymousClass7AZ(this, userSession2).A00();
                            s2x2.A01.put(str, r4);
                            s2x2.A03.put(str, A002);
                            JTP.A1R(str, s2x2.A02, true);
                            return;
                        }
                    }
                }
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            }
            return;
        }
        0qQ.A0F("repositoriesManager");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final boolean A04(DirectLiveLocationService directLiveLocationService) {
        UserSession userSession = directLiveLocationService.A01;
        if (userSession != null) {
            return DbY.A1Y(0Tu.A05, userSession, 36321125378434180L);
        }
        0qQ.A0F("userSession");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate() {
        int A042 = AnonymousClass0fD.A04(1304246933);
        super.onCreate();
        A00();
        this.A02 = new S2X(new C10295Rpt(this));
        AnonymousClass0fD.A0B(749841824, A042);
    }

    public final void onDestroy() {
        C327307Ag r1;
        int A042 = AnonymousClass0fD.A04(-156558816);
        super.onDestroy();
        S2X s2x = this.A02;
        if (s2x == null) {
            0qQ.A0F("repositoriesManager");
            throw AnonymousClass00P.createAndThrow();
        }
        Iterator A0u = AnonymousClass7TF.A0u(s2x.A01);
        while (A0u.hasNext()) {
            Object A0p = C51971G9r.A0p(A0u);
            if ((A0p instanceof C327307Ag) && (r1 = (C327307Ag) A0p) != null) {
                r1.A01.remove(this);
            }
        }
        Set set = this.A07;
        if (C66580MXl.A1b(set)) {
            this.A06.forEach(new TOY(new JG2(13, 00k.A0a(set), this), 2));
        }
        AnonymousClass0fD.A0B(2055884650, A042);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0097, code lost:
        if (r0 == null) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int onStartCommand(android.content.Intent r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 2080426811(0x7c00cb3b, float:2.674944E36)
            int r5 = X.Pxg.A01(r12, r13, r0)
            r1 = 0
            if (r13 == 0) goto L_0x00ca
            java.lang.String r0 = "action"
            java.lang.String r7 = r13.getStringExtra(r0)
            if (r7 == 0) goto L_0x00ca
            java.lang.String r8 = "IgSessionManager.SESSION_TOKEN_KEY"
            java.lang.String r6 = r13.getStringExtra(r8)
            if (r6 != 0) goto L_0x0021
            r0 = -1815650695(0xffffffff93c75e79, float:-5.032782E-27)
        L_0x001d:
            X.AnonymousClass0fD.A0B(r0, r5)
            return r1
        L_0x0021:
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.String r2 = "location_update_time_interval_ms"
            long r1 = r13.getLongExtra(r2, r0)
            r3 = 100
            java.lang.String r0 = "location_update_min_distance_meters"
            long r3 = r13.getLongExtra(r0, r3)
            android.os.Bundle r0 = X.DbV.A0C(r8, r6)
            com.instagram.common.session.UserSession r0 = X.DbS.A0U(r0)
            r12.A01 = r0
            X.QpP r0 = r12.A00
            if (r0 != 0) goto L_0x004c
            boolean r0 = A04(r12)
            if (r0 != 0) goto L_0x004c
            X.QpP r0 = new X.QpP
            r0.<init>(r12)
            r12.A00 = r0
        L_0x004c:
            java.lang.String r0 = "START_SHARING"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00b1
            boolean r0 = r12.A03
            java.lang.String r11 = "repositoriesManager"
            r10 = 1
            if (r0 != 0) goto L_0x00a1
            r12.A03 = r10
            r12.A00()
            r12.A03(r6)
            X.QpP r7 = r12.A00
            if (r7 == 0) goto L_0x008f
            com.google.android.gms.location.LocationRequest r6 = new com.google.android.gms.location.LocationRequest
            r6.<init>()
            r6.A00(r1)
            r8 = 0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x00e6
            r6.A07 = r10
            r6.A04 = r1
            r0 = 100
            r6.A01 = r0
            float r2 = (float) r3
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00cf
            r6.A00 = r2
            X.Qxe r1 = r12.A04
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r7.A00(r0, r1, r6)
        L_0x008f:
            boolean r0 = A04(r12)
            if (r0 == 0) goto L_0x00c4
            X.S2X r0 = r12.A02
            if (r0 != 0) goto L_0x00c1
        L_0x0099:
            X.0qQ.A0F(r11)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00a1:
            X.S2X r0 = r12.A02
            if (r0 == 0) goto L_0x0099
            java.util.Map r0 = r0.A02
            boolean r0 = r0.containsKey(r6)
            if (r0 != 0) goto L_0x00c4
            r12.A03(r6)
            goto L_0x00c4
        L_0x00b1:
            java.lang.String r0 = "STOP_SHARING"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00c4
            X.S2X r0 = r12.A02
            if (r0 != 0) goto L_0x00c1
            java.lang.String r11 = "repositoriesManager"
            goto L_0x0099
        L_0x00c1:
            r0.A00(r15)
        L_0x00c4:
            r1 = 1
            r0 = 2057185642(0x7a9e296a, float:4.1061144E35)
            goto L_0x001d
        L_0x00ca:
            r0 = -1580114947(0xffffffffa1d15bfd, float:-1.418674E-18)
            goto L_0x001d
        L_0x00cf:
            r0 = 37
            java.lang.StringBuilder r1 = X.Pxe.A14(r0)
            java.lang.String r0 = "invalid displacement: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x00e6:
            r0 = 38
            java.lang.StringBuilder r3 = X.Pxe.A14(r0)
            java.lang.String r0 = "invalid interval: "
            java.lang.String r0 = X.Pxg.A0u(r0, r3, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.locationsharing.service.DirectLiveLocationService.onStartCommand(android.content.Intent, int, int):int");
    }
}
