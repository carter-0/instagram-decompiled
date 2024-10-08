package X;

import android.os.StrictMode;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Wgu  reason: case insensitive filesystem */
public final class C19867Wgu implements Closeable {
    public int A00;
    public long A01 = 0;
    public Writer A02;
    public long A03;
    public long A04 = 0;
    public final int A05;
    public final int A06;
    public final File A07;
    public final File A08;
    public final File A09;
    public final LinkedHashMap A0A = new LinkedHashMap(0, 0.75f, true);
    public final Callable A0B = new C41369Asq((Object) this, 0);
    public final ThreadPoolExecutor A0C = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new Object());
    public final File A0D;

    /* JADX WARNING: type inference failed for: r12v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    public C19867Wgu(File file) {
        this.A07 = file;
        this.A05 = 1;
        this.A08 = new File(file, "journal");
        this.A09 = new File(file, "journal.tmp");
        this.A0D = new File(file, "journal.bkp");
        this.A06 = 1;
        this.A03 = 262144000;
    }

    public static synchronized void A00(C17845Vgy vgy, C19867Wgu wgu, boolean z) {
        IllegalStateException illegalStateException;
        synchronized (wgu) {
            C17608Vb0 vb0 = vgy.A01;
            if (vb0.A00 == vgy) {
                if (z && !vb0.A01) {
                    int i = 0;
                    while (true) {
                        if (i < wgu.A06) {
                            if (!vgy.A02[i]) {
                                vgy.A00();
                                illegalStateException = DbW.A0b("Newly created entry didn't create value for index ", i);
                                break;
                            } else if (!vb0.A03[i].exists()) {
                                vgy.A00();
                                break;
                            } else {
                                i = 1;
                            }
                        } else {
                            break;
                        }
                    }
                }
                for (int i2 = 0; i2 < wgu.A06; i2 = 1) {
                    File file = vb0.A03[i2];
                    if (!z) {
                        A05(file);
                    } else if (file.exists()) {
                        File file2 = vb0.A02[i2];
                        file.renameTo(file2);
                        long[] jArr = vb0.A05;
                        long j = jArr[i2];
                        long length = file2.length();
                        jArr[i2] = length;
                        wgu.A01 = (wgu.A01 - j) + length;
                    }
                }
                wgu.A00++;
                vb0.A00 = null;
                if (vb0.A01 || z) {
                    vb0.A01 = true;
                    wgu.A02.append("CLEAN");
                    wgu.A02.append(' ');
                    wgu.A02.append(vb0.A04);
                    Writer writer = wgu.A02;
                    StringBuilder sb = new StringBuilder();
                    long[] jArr2 = vb0.A05;
                    int length2 = jArr2.length;
                    for (int i3 = 0; i3 < length2; i3 = 1) {
                        long j2 = jArr2[i3];
                        sb.append(' ');
                        sb.append(j2);
                    }
                    writer.append(sb.toString());
                    wgu.A02.append(10);
                    if (z) {
                        wgu.A04 = 1 + wgu.A04;
                    }
                } else {
                    LinkedHashMap linkedHashMap = wgu.A0A;
                    String str = vb0.A04;
                    linkedHashMap.remove(str);
                    wgu.A02.append("REMOVE");
                    wgu.A02.append(' ');
                    wgu.A02.append(str);
                    wgu.A02.append(10);
                }
                A06(wgu.A02);
                if (wgu.A01 > wgu.A03 || A08(wgu)) {
                    wgu.A0C.submit(wgu.A0B);
                }
            } else {
                illegalStateException = new IllegalStateException();
            }
            throw illegalStateException;
        }
    }

    public static synchronized void A03(C19867Wgu wgu) {
        synchronized (wgu) {
            Writer writer = wgu.A02;
            if (writer != null) {
                A07(writer);
            }
            File file = wgu.A09;
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            Charset charset = C18397Vqx.A00;
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, charset));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write(RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(wgu.A05));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(wgu.A06));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                Iterator A0t = AnonymousClass7TF.A0t(wgu.A0A);
                while (A0t.hasNext()) {
                    C17608Vb0 vb0 = (C17608Vb0) A0t.next();
                    if (vb0.A00 != null) {
                        bufferedWriter.write(002.A0S("DIRTY ", vb0.A04, 10));
                    } else {
                        String str = vb0.A04;
                        StringBuilder sb = new StringBuilder();
                        long[] jArr = vb0.A05;
                        int length = jArr.length;
                        for (int i = 0; i < length; i = 1) {
                            long j = jArr[i];
                            sb.append(' ');
                            sb.append(j);
                        }
                        bufferedWriter.write(002.A0h("CLEAN ", str, sb.toString(), 10));
                    }
                }
                A07(bufferedWriter);
                File file2 = wgu.A08;
                if (file2.exists()) {
                    File file3 = wgu.A0D;
                    A05(file3);
                    if (!file2.renameTo(file3)) {
                        th = new IOException();
                        throw th;
                    }
                }
                if (file.renameTo(file2)) {
                    wgu.A0D.delete();
                    wgu.A02 = C13989Tnp.A0f(file2, charset);
                } else {
                    th = new IOException();
                    throw th;
                }
            } catch (Throwable th) {
                th = th;
                A07(bufferedWriter);
            }
        }
    }

    public final synchronized void close() {
        if (this.A02 != null) {
            Iterator A16 = Pxg.A16(this.A0A.values());
            while (A16.hasNext()) {
                C17845Vgy vgy = ((C17608Vb0) A16.next()).A00;
                if (vgy != null) {
                    vgy.A00();
                }
            }
            A02(this);
            A07(this.A02);
            this.A02 = null;
        }
    }

    public static void A01(C19867Wgu wgu) {
        if (wgu.A02 == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public static void A02(C19867Wgu wgu) {
        while (wgu.A01 > wgu.A03) {
            LinkedHashMap linkedHashMap = wgu.A0A;
            String str = (String) C13991Tnr.A0Y(AnonymousClass7TF.A0s(linkedHashMap));
            synchronized (wgu) {
                A01(wgu);
                C17608Vb0 vb0 = (C17608Vb0) linkedHashMap.get(str);
                int i = 0;
                if (vb0 != null) {
                    if (vb0.A00 == null) {
                        while (i < wgu.A06) {
                            File file = vb0.A02[i];
                            if (!file.exists() || file.delete()) {
                                long j = wgu.A01;
                                long[] jArr = vb0.A05;
                                wgu.A01 = j - jArr[i];
                                jArr[i] = 0;
                                i = 1;
                            } else {
                                throw new IOException(AnonymousClass7TG.A0m(file, "failed to delete ", new StringBuilder()));
                            }
                        }
                        wgu.A00++;
                        A04(wgu, wgu.A02, "REMOVE", str);
                        linkedHashMap.remove(str);
                        if (A08(wgu)) {
                            wgu.A0C.submit(wgu.A0B);
                        }
                    }
                }
            }
        }
    }

    public static boolean A08(C19867Wgu wgu) {
        int i = wgu.A00;
        if (i < 2000 || i < wgu.A0A.size()) {
            return false;
        }
        return true;
    }

    public static void A04(C19867Wgu wgu, Writer writer, CharSequence charSequence, CharSequence charSequence2) {
        writer.append(charSequence);
        wgu.A02.append(' ');
        wgu.A02.append(charSequence2);
        wgu.A02.append(10);
    }

    public static void A05(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void A06(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void A07(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
