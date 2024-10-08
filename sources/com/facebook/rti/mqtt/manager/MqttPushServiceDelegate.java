package com.facebook.rti.mqtt.manager;

import X.002;
import X.00f;
import X.0KC;
import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass3RB;
import X.AnonymousClass3RV;
import X.C10970S3c;
import X.C11248SHi;
import X.C11267SIe;
import X.C11269SIg;
import X.C12232Spm;
import X.C12249Sq3;
import X.C12251Sq5;
import X.C12257SqB;
import X.C13262TSd;
import X.C13577Td2;
import X.C13838TiD;
import X.C13849TiS;
import X.C13893TjG;
import X.C241823Ri;
import X.C66579MXk;
import X.C7349Q5y;
import X.C7860Qbk;
import X.C7861Qbl;
import X.C7862Qbm;
import X.C7863Qbn;
import X.C7864Qbo;
import X.C7865Qbp;
import X.C7866Qbq;
import X.C7867Qbr;
import X.C7868Qbs;
import X.C8860RDb;
import X.C8889REg;
import X.C8947RGw;
import X.C9558Rcv;
import X.C9559Rcw;
import X.C9560Rcx;
import X.C9561Rcy;
import X.Pxd;
import X.RJ2;
import X.S3D;
import X.SBU;
import X.SJJ;
import X.SP2;
import X.SRA;
import X.SRZ;
import X.SSX;
import X.ST2;
import X.ST3;
import X.ST9;
import X.TOA;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import com.facebook.rti.push.service.FbnsServiceDelegate;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;

public abstract class MqttPushServiceDelegate extends MqttBackgroundServiceDelegate {
    public long A00;
    public C13893TjG A01;
    public AnonymousClass3RV A02;
    public RealtimeSinceBootClock A03;
    public C11267SIe A04;
    public ST2 A05;
    public SJJ A06;
    public C11248SHi A07;
    public C13577Td2 A08;
    public ST9 A09;
    public C10970S3c A0A;
    public AtomicBoolean A0B = new AtomicBoolean(false);
    public Integer A0C = AnonymousClass05K.A0N;
    public final C13838TiD A0D = new C12257SqB(this);
    public volatile SRZ A0E;

    public final void A0O() {
        FbnsServiceDelegate fbnsServiceDelegate = (FbnsServiceDelegate) this;
        ((AtomicLong) ((C12249Sq3) fbnsServiceDelegate.A05.A05(C7865Qbp.class)).A01(RJ2.FbnsLiteNotificationDeliveryRetried)).addAndGet((long) fbnsServiceDelegate.A04.A02());
    }

    public abstract void A0R(SBU sbu, Long l, String str, byte[] bArr, int i, long j);

    public static String A05(MqttPushServiceDelegate mqttPushServiceDelegate) {
        long j;
        ST3 st3 = mqttPushServiceDelegate.A09.A0w;
        if (st3 == null || st3.A0Y != AnonymousClass05K.A0C) {
            j = 0;
        } else {
            j = SystemClock.elapsedRealtime() - st3.A0V;
        }
        ST2 st2 = mqttPushServiceDelegate.A05;
        C7863Qbn A002 = ST2.A00(st2);
        C7865Qbp A012 = ST2.A01(st2, j);
        C7862Qbm qbm = (C7862Qbm) st2.A05(C7862Qbm.class);
        try {
            return C9559Rcw.A00(st2.A00.A00(false), qbm, (C7866Qbq) st2.A05(C7866Qbq.class), A002, (C7864Qbo) null, A012, (C7867Qbr) st2.A05(C7867Qbr.class), (C7868Qbs) st2.A05(C7868Qbs.class), true, false).toString(2);
        } catch (JSONException unused) {
            return "";
        }
    }

    public static void A06(MqttPushServiceDelegate mqttPushServiceDelegate, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        hashMap.put("pid", String.valueOf(Process.myPid()));
        mqttPushServiceDelegate.A01.Cgl("life_cycle", hashMap);
    }

    public final void A0F() {
        if (this.A0E != null) {
            SRZ srz = this.A0E;
            String A0R = 002.A0R(C9560Rcx.A00(AnonymousClass05K.A01), ".SERVICE_ON_DESTROY");
            C7860Qbk qbk = C7860Qbk.A00;
            srz.A02((NetworkInfo) null, qbk, qbk, A0R, (String) null, 0, this.A0B.get());
        }
        super.A0F();
    }

    public void A0H() {
        SRZ srz = this.A0E;
        String A0R = 002.A0R(C9560Rcx.A00(AnonymousClass05K.A01), ".SERVICE_DESTROY");
        C7860Qbk qbk = C7860Qbk.A00;
        boolean z = this.A0B.get();
        srz.A02(this.A06.A02(), qbk, qbk, A0R, (String) null, this.A06.A06.get(), z);
        A06(this, "doDestroy");
        ((C12232Spm) this.A01).A01 = null;
        A0P();
    }

    public void A0J(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String valueOf;
        HashSet hashSet;
        String str;
        String str2;
        String str3;
        SocketAddress remoteSocketAddress;
        try {
            printWriter.println("[ MqttPushService ]");
            printWriter.println(002.A0R("persistence=", "FBNS_ALWAYS"));
            long j = this.A09.A03;
            if (j > 0) {
                valueOf = new Date(j).toString();
            } else {
                valueOf = String.valueOf(j);
            }
            printWriter.println(002.A0R("networkChangedTime=", valueOf));
            StringBuilder sb = new StringBuilder();
            sb.append("subscribedTopics=");
            Map map = this.A09.A0Z;
            synchronized (map) {
                try {
                    hashSet = new HashSet(map.keySet());
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                        break;
                    }
                }
            }
            sb.append(hashSet);
            printWriter.println(sb.toString());
            if (!(!this.A0A.A06.A02)) {
                ST9 st9 = this.A09;
                printWriter.println(002.A0g("[ ", st9.A0X, " ]"));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("keepAliveIntervalSeconds=");
                sb2.append(st9.A0c);
                printWriter.println(sb2.toString());
                NetworkInfo A012 = st9.A0F.A01();
                if (A012 != null) {
                    str = A012.toString();
                } else {
                    str = "null";
                }
                printWriter.println(002.A0R("networkInfo=", str));
                if (st9.A0u != null) {
                    String A0g = 002.A0g(((C8947RGw) st9.A0u.first).toString(), "@", ((C8889REg) st9.A0u.second).toString());
                    printWriter.println(002.A0R("lastConnectLostTime=", new Date((System.currentTimeMillis() + st9.A0t) - SystemClock.elapsedRealtime()).toString()));
                    printWriter.println(002.A0R("lastConnectLostReason=", A0g));
                }
                ST3 st3 = st9.A0w;
                if (st3 != null) {
                    synchronized (st3) {
                        try {
                            printWriter.println("[ MqttClient ]");
                            Integer num = st3.A0Y;
                            if (num != null) {
                                str2 = C9561Rcy.A00(num);
                            } else {
                                str2 = "null";
                            }
                            printWriter.println(002.A0R("state=", str2));
                            printWriter.println(002.A0R("lastMessageSent=", ST3.A01(st3, st3.A0T)));
                            printWriter.println(002.A0R("lastMessageReceived=", ST3.A01(st3, st3.A0S)));
                            printWriter.println(002.A0R("connectionEstablished=", ST3.A01(st3, st3.A0Q)));
                            printWriter.println(002.A0R("lastPing=", ST3.A01(st3, st3.A0U)));
                            SRA sra = st3.A0E;
                            synchronized (sra) {
                                Socket socket = sra.A05;
                                if (socket == null || (remoteSocketAddress = socket.getRemoteSocketAddress()) == null) {
                                    str3 = "N/A";
                                } else {
                                    String str4 = sra.A02;
                                    if (str4 != null) {
                                        str3 = 002.A0g(str4, "|", remoteSocketAddress.toString());
                                    } else {
                                        str3 = remoteSocketAddress.toString();
                                    }
                                }
                            }
                            printWriter.println(002.A0R("peer=", str3));
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                } else {
                    printWriter.println("mMqttClient=null");
                }
                printWriter.println("[ MqttHealthStats ]");
                printWriter.println(A05(this));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.S0N, java.lang.Object] */
    public C241823Ri A0K(Intent intent, int i, int i2) {
        String str;
        ? obj = new Object();
        00f r4 = this.A01;
        Context applicationContext = r4.getApplicationContext();
        0qQ.A07(applicationContext);
        C241823Ri A002 = obj.A00(applicationContext, this.A02);
        Intent intent2 = intent;
        if (intent != null) {
            if (intent2.hasExtra("caller")) {
                A002.A03 = intent2.getStringExtra("caller");
            }
            if (intent2.hasExtra("EXPIRED_SESSION")) {
                A002.A00 = intent2.getLongExtra("EXPIRED_SESSION", 0);
            }
            String A003 = Pxd.A00(142);
            if (intent2.hasExtra(A003)) {
                Integer valueOf = Integer.valueOf(intent2.getIntExtra(A003, 300));
                if (!valueOf.equals(A002.A02)) {
                    A002.A02 = valueOf;
                    Context applicationContext2 = r4.getApplicationContext();
                    0qQ.A07(applicationContext2);
                    C13849TiS AR1 = this.A02.A00(applicationContext2, 002.A0R("rti.mqtt.", C66579MXk.A00(160))).AR1();
                    Integer num = A002.A02;
                    if (num != null) {
                        AR1.E5X(A003, num.intValue());
                        AR1.AIP();
                    }
                }
            }
            str = intent2.getAction();
        } else {
            str = "NULL";
        }
        Integer valueOf2 = Integer.valueOf(i);
        Integer valueOf3 = Integer.valueOf(i2);
        SRZ srz = this.A0E;
        String A0T = 002.A0T(C9560Rcx.A00(AnonymousClass05K.A01), str, '.');
        String str2 = A002.A03;
        valueOf2.getClass();
        C7861Qbl qbl = new C7861Qbl(valueOf2);
        valueOf3.getClass();
        C7861Qbl qbl2 = new C7861Qbl(valueOf3);
        boolean z = this.A0B.get();
        srz.A02(this.A06.A02(), qbl, qbl2, A0T, str2, this.A06.A06.get(), z);
        return A002;
    }

    public Future A0L(C8947RGw rGw) {
        TOA toa = TOA.A01;
        if (!this.A0B.getAndSet(false)) {
            0KC.A0D("MqttPushService", "service/stop/inactive_connection");
            return toa;
        }
        SP2 sp2 = ((FbnsServiceDelegate) this).A04;
        BroadcastReceiver broadcastReceiver = sp2.A00;
        if (broadcastReceiver != null) {
            AnonymousClass3RB.A02.A06(broadcastReceiver, sp2.A02);
            sp2.A00 = null;
        }
        this.A09.A0B();
        Future A082 = this.A09.A08(rGw);
        A0Q();
        return A082;
    }

    public void A0M() {
        ST2 st2 = this.A05;
        C8860RDb rDb = C8860RDb.A01;
        ST2.A04(rDb, st2).set(SystemClock.elapsedRealtime());
    }

    public void A0N() {
        C10970S3c s3c = this.A0A;
        ST9 st9 = s3c.A0O;
        SJJ sjj = s3c.A0I;
        C12251Sq5 sq5 = s3c.A0K;
        RealtimeSinceBootClock realtimeSinceBootClock = s3c.A04;
        SRZ srz = s3c.A0B;
        ST2 st2 = s3c.A0D;
        C11248SHi sHi = s3c.A0J;
        C11267SIe sIe = s3c.A0C;
        C13893TjG tjG = s3c.A02;
        AnonymousClass3RV r0 = s3c.A03;
        this.A09 = st9;
        this.A06 = sjj;
        this.A08 = sq5;
        this.A03 = realtimeSinceBootClock;
        this.A0E = srz;
        this.A05 = st2;
        this.A07 = sHi;
        this.A04 = sIe;
        this.A01 = tjG;
        this.A02 = r0;
    }

    public final void A0P() {
        if (this.A0B.get()) {
            A0L(C8947RGw.SERVICE_DESTROY);
        }
        ST9 st9 = this.A09;
        if (st9 != null) {
            st9.A08(C8947RGw.SERVICE_DESTROY);
        }
        C10970S3c s3c = this.A0A;
        if (s3c != null && !s3c.A0W) {
            s3c.A0W = true;
            C11269SIg sIg = s3c.A0M;
            if (sIg != null) {
                synchronized (sIg) {
                    sIg.A00();
                    if (sIg.A01) {
                        boolean z = false;
                        if (!sIg.A07.A06(sIg.A04, sIg.A05)) {
                            z = true;
                        }
                        sIg.A01 = z;
                    }
                }
            }
            SJJ sjj = s3c.A0I;
            if (sjj != null) {
                synchronized (sjj) {
                    try {
                        sjj.A01.unregisterReceiver(sjj.A00);
                    } catch (IllegalArgumentException e) {
                        0KC.A0I(Pxd.A00(531), Pxd.A00(61), e);
                    }
                }
            }
            C13262TSd tSd = s3c.A0G;
            if (tSd != null) {
                tSd.shutdown();
            }
            SSX ssx = s3c.A0L;
            if (ssx != null) {
                ssx.A04();
            }
            C11248SHi sHi = s3c.A0J;
            if (sHi != null) {
                synchronized (sHi) {
                    try {
                        sHi.A01.unregisterReceiver(sHi.A00);
                    } catch (IllegalArgumentException e2) {
                        0KC.A0I("ScreenPowerState", Pxd.A00(61), e2);
                    }
                    sHi.A04.set((Object) null);
                }
                return;
            }
            return;
        }
        return;
    }

    public final void A0Q() {
        Integer num;
        ST3 st3 = this.A09.A0w;
        if (st3 == null) {
            num = AnonymousClass05K.A0N;
        } else {
            num = st3.A0Y;
            if (num == null) {
                return;
            }
        }
        Integer num2 = this.A0C;
        if (num != num2) {
            String A002 = C9561Rcy.A00(num2);
            String A003 = C9561Rcy.A00(num);
            this.A01.Cgi(002.A0u("[state_machine] ", A002, " -> ", A003));
            this.A0C = num;
            this.A04.A01(A003);
        }
    }

    public void A0S(C241823Ri r10, Integer num) {
        if (!this.A0B.getAndSet(true)) {
            Integer num2 = r10.A02;
            if (num2 != null) {
                int intValue = num2.intValue();
                ((FbnsServiceDelegate) this).A04.A03().A01.set(TimeUnit.SECONDS.toMillis((long) intValue));
            }
            ST2 st2 = this.A05;
            String A002 = C9558Rcv.A00(num);
            S3D s3d = st2.A00;
            if (s3d.A07 == null) {
                s3d.A07 = A002;
                s3d.A04.set(SystemClock.elapsedRealtime());
                s3d.A02.set(SystemClock.elapsedRealtime());
            }
            SP2 sp2 = ((FbnsServiceDelegate) this).A04;
            if (sp2.A00 == null) {
                C7349Q5y q5y = new C7349Q5y(sp2);
                sp2.A00 = q5y;
                AnonymousClass3RB.A02.A07(q5y, sp2.A02, new IntentFilter(Pxd.A00(199)), (Handler) null, true);
            }
            this.A09.A0A();
        }
        this.A09.A0E(num);
    }

    public final boolean A0T() {
        if (!this.A0B.get()) {
            this.A01.Cgi("MqttPushService/not_started");
            return false;
        }
        HashMap hashMap = new HashMap();
        if (this.A08.Erp(hashMap)) {
            return true;
        }
        this.A01.Cgl("MqttPushService/should_not_connect", hashMap);
        return false;
    }

    public MqttPushServiceDelegate(00f r3) {
        super(r3);
    }
}
