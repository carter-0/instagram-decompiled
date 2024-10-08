package X;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Spl  reason: case insensitive filesystem */
public final class C12231Spl implements C2596542n {
    public static final TO6 A0E = TO6.A00();
    public S3K A00;
    public final Handler A01;
    public final C10556RuA A02;
    public final AnonymousClass45J A03;
    public final C13575Td0 A04;
    public final Runnable A05;
    public final String A06;
    public final String A07;
    public final Queue A08 = new ConcurrentLinkedQueue();
    public final AtomicBoolean A09 = JTQ.A0k();
    public final Context A0A;
    public final C10412Rro A0B;
    public final SHT A0C;
    public final RQG A0D;

    public C12231Spl(Context context, SHT sht, AnonymousClass45J r12, C13575Td0 td0, C13575Td0 td02, RQG rqg, String str, String str2, String str3, String str4) {
        this.A0A = context;
        this.A03 = r12;
        this.A04 = td02;
        this.A07 = str4;
        this.A06 = str3;
        this.A0C = sht;
        this.A01 = new Q7r(context.getMainLooper(), this, 1);
        this.A05 = new TCQ(this);
        String str5 = str;
        this.A0B = new C10412Rro(context.getApplicationContext(), sht, str5);
        this.A02 = new C10556RuA(context.getApplicationContext(), sht, td0, str5, str2);
        this.A0D = rqg;
        if (this.A00 != null) {
            A00(this);
        }
        S3K s3k = new S3K();
        s3k.A04 = this.A06;
        s3k.A05 = this.A07;
        AtomicReference atomicReference = new AtomicReference("");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        atomicReference.set(((AnonymousClass45I) this.A03).getString("fb_uid", ""));
        countDownLatch.countDown();
        try {
            countDownLatch.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            0KC.A0G("DefaultAnalyticsLogger", "Waiting for fb user id interrupted", e);
        }
        String str6 = (String) atomicReference.get();
        s3k.A06 = TextUtils.isEmpty(str6) ? "0" : str6;
        s3k.A03 = "567310203415052";
        s3k.A02 = this.A04;
        this.A00 = s3k;
    }

    public static void A00(C12231Spl spl) {
        String str;
        S3K s3k = spl.A00;
        List list = s3k.A07;
        if (!list.isEmpty()) {
            C10412Rro rro = spl.A0B;
            str = "failed to close writer";
            SHT sht = rro.A00;
            sht.A00(new S6G("log_event_attempted", 1));
            File file = rro.A01;
            if (!file.exists() && !file.mkdir()) {
                0KC.A0C("AnalyticsStorage", "Unable to open analytics storage.");
            }
            UUID uuid = s3k.A08;
            if (uuid == null) {
                uuid = UUID.randomUUID();
                s3k.A08 = uuid;
            }
            File A0s = JTO.A0s(file, Pxf.A0m("%s_%d.batch", C51968G9o.A1Z(uuid.toString(), s3k.A00)));
            if (A0s.exists() && !A0s.delete()) {
                0KC.A0P("AnalyticsStorage", "File %s was not deleted", new Object[]{A0s});
            }
            s3k.A01 = System.currentTimeMillis();
            try {
                FileOutputStream A0t = JTO.A0t(A0s);
                try {
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(A0t, "UTF8");
                    try {
                        String obj = s3k.toString();
                        outputStreamWriter.write(obj);
                        sht.A00(new S6G("log_event_file_size_in_bytes", (long) obj.length()));
                        sht.A00(new S6G("log_event_succeeded", 1));
                    } catch (IOException e) {
                        0KC.A0I("AnalyticsStorage", "failed to write session to file", e);
                    } catch (Throwable th) {
                        try {
                            outputStreamWriter.close();
                            throw th;
                        } catch (IOException e2) {
                            0KC.A0I("AnalyticsStorage", str, e2);
                            throw th;
                        }
                    }
                    try {
                        outputStreamWriter.close();
                    } catch (IOException e3) {
                        e = e3;
                    }
                } catch (UnsupportedEncodingException e4) {
                    0KC.A0I("AnalyticsStorage", "UTF8 encoding is not supported", e4);
                    try {
                        A0t.close();
                    } catch (IOException e5) {
                        e = e5;
                        str = "failed to close output stream";
                    }
                }
            } catch (FileNotFoundException e6) {
                0KC.A0M("AnalyticsStorage", "Batch file creation failed %s", e6, new Object[]{A0s});
            }
            list.clear();
            s3k.A00++;
        }
        return;
        0KC.A0I("AnalyticsStorage", str, e);
        list.clear();
        s3k.A00++;
    }

    public static void A01(C12231Spl spl, Runnable runnable) {
        spl.A08.add(runnable);
        if (spl.A09.compareAndSet(false, true)) {
            A0E.execute(spl.A05);
        }
    }

    public final void reportEvent(SRO sro) {
        boolean z;
        RQG rqg = this.A0D;
        Map map = sro.A06;
        if (map.containsKey("l")) {
            z = Boolean.parseBoolean(DbT.A11("l", map));
        } else {
            AnonymousClass45J r1 = rqg.A00;
            AnonymousClass3RY[] r0 = AnonymousClass3RY.A02;
            if (!((AnonymousClass45I) r1).getBoolean("LOG_ANALYTICS_EVENTS", false)) {
                z = ((AnonymousClass45I) rqg.A00).getBoolean("is_employee", false);
            }
            A01(this, new TGE(sro, this));
        }
        if (!z) {
            return;
        }
        A01(this, new TGE(sro, this));
    }
}
