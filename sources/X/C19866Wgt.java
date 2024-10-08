package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: X.Wgt  reason: case insensitive filesystem */
public final class C19866Wgt implements Closeable {
    public static final OutputStream A0E = new C16477UvX();
    public static final Charset A0F = Charset.forName("US-ASCII");
    public static final Charset A0G = Charset.forName(ReactWebViewManager.HTML_ENCODING);
    public static final Pattern A0H = Pattern.compile("[a-z0-9_-]{1,120}");
    public int A00;
    public long A01;
    public long A02 = 0;
    public Writer A03;
    public long A04 = 0;
    public final int A05;
    public final int A06;
    public final File A07;
    public final File A08;
    public final File A09;
    public final LinkedHashMap A0A = new LinkedHashMap(0, 0.75f, true);
    public final Callable A0B = new C41369Asq((Object) this, 1);
    public final ThreadPoolExecutor A0C = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public final File A0D;

    public C19866Wgt(File file, long j) {
        this.A07 = file;
        this.A05 = 2;
        this.A08 = new File(file, "journal");
        this.A09 = new File(file, "journal.tmp");
        this.A0D = new File(file, "journal.bkp");
        this.A06 = 1;
        this.A01 = j;
    }

    public static synchronized void A00(C17874VhR vhR, C19866Wgt wgt, boolean z) {
        IllegalStateException illegalStateException;
        synchronized (wgt) {
            C17994VjW vjW = vhR.A02;
            if (vjW.A00 == vhR) {
                if (z && !vjW.A01) {
                    int i = 0;
                    while (true) {
                        if (i < wgt.A06) {
                            if (!vhR.A03[i]) {
                                vhR.A00();
                                illegalStateException = DbW.A0b("Newly created entry didn't create value for index ", i);
                                break;
                            } else if (!vjW.A01().exists()) {
                                vhR.A00();
                                break;
                            } else {
                                i = 1;
                            }
                        } else {
                            break;
                        }
                    }
                }
                for (int i2 = 0; i2 < wgt.A06; i2 = 1) {
                    File A012 = vjW.A01();
                    if (!z) {
                        A04(A012);
                    } else if (A012.exists()) {
                        File A002 = vjW.A00();
                        A012.renameTo(A002);
                        long[] jArr = vjW.A03;
                        long j = jArr[i2];
                        long length = A002.length();
                        jArr[i2] = length;
                        wgt.A02 = (wgt.A02 - j) + length;
                    }
                }
                wgt.A00++;
                vjW.A00 = null;
                if (vjW.A01 || z) {
                    vjW.A01 = true;
                    Writer writer = wgt.A03;
                    String str = vjW.A02;
                    StringBuilder sb = new StringBuilder();
                    long[] jArr2 = vjW.A03;
                    int length2 = jArr2.length;
                    for (int i3 = 0; i3 < length2; i3 = 1) {
                        long j2 = jArr2[i3];
                        sb.append(' ');
                        sb.append(j2);
                    }
                    writer.write(002.A0h("CLEAN ", str, sb.toString(), 10));
                    if (z) {
                        wgt.A04 = 1 + wgt.A04;
                    }
                } else {
                    LinkedHashMap linkedHashMap = wgt.A0A;
                    String str2 = vjW.A02;
                    linkedHashMap.remove(str2);
                    wgt.A03.write(002.A0S("REMOVE ", str2, 10));
                }
                wgt.A03.flush();
                if (wgt.A02 > wgt.A01 || A06(wgt)) {
                    wgt.A0C.submit(wgt.A0B);
                }
            } else {
                illegalStateException = new IllegalStateException();
            }
            throw illegalStateException;
        }
    }

    public static synchronized void A01(C19866Wgt wgt) {
        synchronized (wgt) {
            Writer writer = wgt.A03;
            if (writer != null) {
                writer.close();
            }
            File file = wgt.A09;
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            Charset charset = A0F;
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, charset));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write(RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(wgt.A05));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(wgt.A06));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                Iterator A0t = AnonymousClass7TF.A0t(wgt.A0A);
                while (A0t.hasNext()) {
                    C17994VjW vjW = (C17994VjW) A0t.next();
                    if (vjW.A00 != null) {
                        bufferedWriter.write(002.A0S("DIRTY ", vjW.A02, 10));
                    } else {
                        String str = vjW.A02;
                        StringBuilder sb = new StringBuilder();
                        long[] jArr = vjW.A03;
                        int length = jArr.length;
                        for (int i = 0; i < length; i = 1) {
                            long j = jArr[i];
                            sb.append(' ');
                            sb.append(j);
                        }
                        bufferedWriter.write(002.A0h("CLEAN ", str, sb.toString(), 10));
                    }
                }
                bufferedWriter.close();
                File file2 = wgt.A08;
                if (file2.exists()) {
                    File file3 = wgt.A0D;
                    A04(file3);
                    if (!file2.renameTo(file3)) {
                        th = new IOException();
                        throw th;
                    }
                }
                if (file.renameTo(file2)) {
                    wgt.A0D.delete();
                    wgt.A03 = C13989Tnp.A0f(file2, charset);
                } else {
                    th = new IOException();
                    throw th;
                }
            } catch (Throwable th) {
                th = th;
                bufferedWriter.close();
            }
        }
    }

    public final synchronized void A07(String str) {
        Throwable th;
        if (this.A03 != null) {
            A05(str);
            LinkedHashMap linkedHashMap = this.A0A;
            C17994VjW vjW = (C17994VjW) linkedHashMap.get(str);
            int i = 0;
            if (vjW != null) {
                if (vjW.A00 == null) {
                    while (i < this.A06) {
                        File A002 = vjW.A00();
                        if (!A002.exists() || A002.delete()) {
                            long j = this.A02;
                            long[] jArr = vjW.A03;
                            this.A02 = j - jArr[i];
                            jArr[i] = 0;
                            i = 1;
                        } else {
                            th = new IOException(AnonymousClass7TG.A0m(A002, "failed to delete ", new StringBuilder()));
                        }
                    }
                    this.A00++;
                    this.A03.append(002.A0S("REMOVE ", str, 10));
                    linkedHashMap.remove(str);
                    if (A06(this)) {
                        this.A0C.submit(this.A0B);
                    }
                }
            }
        } else {
            th = new IllegalStateException("cache is closed");
        }
        throw th;
    }

    public final synchronized void close() {
        if (this.A03 != null) {
            LinkedHashMap linkedHashMap = this.A0A;
            Iterator A16 = Pxg.A16(linkedHashMap.values());
            while (A16.hasNext()) {
                C17874VhR vhR = ((C17994VjW) A16.next()).A00;
                if (vhR != null) {
                    vhR.A00();
                }
            }
            while (this.A02 > this.A01) {
                A07((String) C13991Tnr.A0Y(AnonymousClass7TF.A0s(linkedHashMap)));
            }
            this.A03.close();
            this.A03 = null;
        }
    }

    public static void A02(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void A05(String str) {
        if (!DbV.A1b(str, A0H)) {
            throw Pxg.A0c("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\"");
        }
    }

    public static boolean A06(C19866Wgt wgt) {
        int i = wgt.A00;
        if (i < 2000 || i < wgt.A0A.size()) {
            return false;
        }
        return true;
    }

    public static void A03(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    A03(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    throw new IOException(AnonymousClass7TG.A0m(file2, "failed to delete file: ", new StringBuilder()));
                }
            }
            return;
        }
        throw new IOException(AnonymousClass7TG.A0m(file, "not a readable directory: ", new StringBuilder()));
    }

    public static void A04(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }
}
