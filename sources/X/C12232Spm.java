package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.rti.mqtt.manager.MqttPushServiceDelegate;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.webrtc.CameraCapturer;

/* renamed from: X.Spm  reason: case insensitive filesystem */
public final class C12232Spm implements C13893TjG, C13720Tfl {
    public int A00;
    public C10232Ros A01 = null;
    public ArrayList A02 = AnonymousClass7TE.A1C();
    public CountDownLatch A03;
    public ScheduledFuture A04 = null;
    public final Context A05;
    public final AnonymousClass45J A06;
    public final ScheduledExecutorService A07;
    public final SimpleDateFormat A08;

    public static void A00(C12232Spm spm, boolean z) {
        ArrayList arrayList;
        FileWriter fileWriter;
        ScheduledFuture scheduledFuture;
        synchronized (spm) {
            arrayList = spm.A02;
            spm.A02 = AnonymousClass7TE.A1C();
            if (z && (scheduledFuture = spm.A04) != null) {
                scheduledFuture.cancel(false);
            }
            spm.A04 = null;
        }
        if (!arrayList.isEmpty()) {
            try {
                spm.A03.await();
            } catch (InterruptedException e) {
                0KC.A0F("FbnsLiteFlytrapLogger", "Waiting for current file index fetch in getFlytrapFiles was interrupted", e);
            }
            Context context = spm.A05;
            File A0s = JTO.A0s(context.getCacheDir(), 002.A0O("fbnslite_log", spm.A00));
            int i = 1;
            try {
                fileWriter = new FileWriter(A0s, true);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    fileWriter.write(002.A0C(AnonymousClass7TE.A18(it), 10));
                }
                fileWriter.close();
            } catch (IOException unused) {
            } catch (Throwable th) {
                C9153RRe.A00(th, th);
            }
            if (A0s.length() >= 30000) {
                if (spm.A00 != 0) {
                    i = 0;
                }
                spm.A00 = i;
                JTO.A0s(context.getCacheDir(), 002.A0O("fbnslite_log", spm.A00)).delete();
                C13849TiS AR1 = spm.A06.AR1();
                AR1.E5X("CurrentFile", spm.A00);
                AR1.AIR("FbnsLiteFlytrapLogger", "PreferencesManager failed to store file index.");
                return;
            }
            return;
        }
        return;
        throw th;
    }

    public final void Cgj(String str, String str2) {
        Cgi(002.A0u("[", str, "] ", str2));
    }

    public final void Cgl(String str, Map map) {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            Pxg.A1S(A1A, A1J);
            A1A.append("=");
            A1A.append(DbS.A0s(A1J));
            A1A.append("; ");
        }
        Cgi(002.A0u("[", str, "] ", A1A.toString()));
    }

    public C12232Spm(Context context, AnonymousClass3RV r5) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
        this.A08 = simpleDateFormat;
        this.A05 = context;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        AnonymousClass45J A002 = r5.A00(context, "Fbnslite_Flytrap");
        this.A06 = A002;
        this.A07 = Executors.newSingleThreadScheduledExecutor();
        this.A03 = Pxf.A0y();
        this.A00 = ((AnonymousClass45I) A002).getInt("CurrentFile", 0);
        this.A03.countDown();
    }

    public final Bundle APv(Context context, Bundle bundle) {
        BufferedReader bufferedReader;
        String valueOf;
        String valueOf2;
        HashSet A12;
        ArrayList A1C = AnonymousClass7TE.A1C();
        try {
            this.A03.await();
        } catch (InterruptedException e) {
            0KC.A0F("FbnsLiteFlytrapLogger", "Waiting for current file index fetch in getFlytrapFiles was interrupted", e);
        }
        C10232Ros ros = this.A01;
        if (ros != null) {
            MqttPushServiceDelegate mqttPushServiceDelegate = ros.A00;
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put("is_mqtt_direct", "false");
            long j = mqttPushServiceDelegate.A09.A00;
            if (j > 0) {
                valueOf = new Date(j).toString();
            } else {
                valueOf = String.valueOf(j);
            }
            A1E.put("last_connection_time", valueOf);
            long j2 = mqttPushServiceDelegate.A09.A03;
            if (j2 > 0) {
                valueOf2 = new Date(j2).toString();
            } else {
                valueOf2 = String.valueOf(j2);
            }
            A1E.put("last_network_changed_time", valueOf2);
            Map map = mqttPushServiceDelegate.A09.A0Z;
            synchronized (map) {
                A12 = C66580MXl.A12(map.keySet());
            }
            A1E.put("subscribed_topics", A12.toString());
            A1E.put("mqtt_health_stats", MqttPushServiceDelegate.A05(mqttPushServiceDelegate));
            Cgl("DumpSys", A1E);
        } else {
            Cgi("SystemDumper not connected");
        }
        try {
            this.A07.submit(new C12889TCd(this)).get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        boolean A1Q = AnonymousClass7TF.A1Q(this.A00);
        Context context2 = this.A05;
        File A0s = JTO.A0s(context2.getCacheDir(), 002.A0O("fbnslite_log", A1Q ? 1 : 0));
        if (A0s.exists()) {
            A1C2.add(A0s);
        }
        File A0s2 = JTO.A0s(context2.getCacheDir(), 002.A0O("fbnslite_log", this.A00));
        if (A0s2.exists()) {
            A1C2.add(A0s2);
        }
        Iterator it = A1C2.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    A1C.add(readLine);
                }
                bufferedReader.close();
            } catch (IOException e2) {
                A1C.add(002.A0u("Error reading file ", file.getName(), " - ", e2.toString()));
            } catch (Throwable th) {
                C9153RRe.A00(th, th);
            }
        }
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putStringArrayList("flytrap", A1C);
        return A0a;
        throw th;
    }

    public final void AQ1(Context context, Bundle bundle) {
        throw AnonymousClass7TE.A0w("not implemented for FbnsLiteFlytrapLogger");
    }

    public final void Cgi(String str) {
        String A0g = 002.A0g(this.A08.format(new Date(System.currentTimeMillis())), " ", str);
        synchronized (this) {
            if (A0g.length() > 500) {
                A0g = Pxe.A0x(A0g, CameraCapturer.OPEN_CAMERA_DELAY_MS);
            }
            this.A02.add(A0g);
            if (this.A04 == null) {
                this.A04 = this.A07.schedule(new C12890TCe(this), StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS, TimeUnit.MILLISECONDS);
            }
        }
    }
}
