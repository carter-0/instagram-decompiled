package X;

import android.net.LocalSocket;
import android.net.Uri;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.5H4  reason: invalid class name */
public final class AnonymousClass5H4 implements C257103wr {
    public static final Pattern A0G = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public static final AtomicInteger A0H = new AtomicInteger();
    public long A00;
    public long A01;
    public C257263x7 A02;
    public C250823m7 A03;
    public DataInputStream A04;
    public LocalSocket A05;
    public OutputStream A06;
    public Map A07;
    public boolean A08;
    public final Map A09 = new HashMap();
    public final int A0A;
    public final int A0B;
    public final C257063wn A0C;
    public final HeroPlayerSetting A0D;
    public final String A0E;
    public final AtomicReference A0F;

    public final void cancel() {
    }

    public final void changeHttpPriority(byte b, boolean z) {
    }

    public static String A00(String str, Object obj) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(": ");
        sb.append(obj);
        return sb.toString();
    }

    private void A01() {
        OutputStream outputStream = this.A06;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
        this.A06 = null;
        DataInputStream dataInputStream = this.A04;
        if (dataInputStream != null) {
            try {
                dataInputStream.close();
            } catch (IOException unused2) {
            }
        }
        this.A04 = null;
        try {
            LocalSocket localSocket = this.A05;
            if (localSocket != null) {
                localSocket.close();
            }
        } catch (Exception unused3) {
        }
        this.A05 = null;
    }

    private void A02(String str) {
        OutputStream outputStream = this.A06;
        if (outputStream != null) {
            outputStream.write(002.A0R(str, "\r\n").getBytes());
        }
    }

    public final Map getResponseHeaders() {
        return this.A07;
    }

    public final Uri getUri() {
        C257263x7 r0 = this.A02;
        if (r0 != null) {
            return r0.A06;
        }
        return null;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e5 A[Catch:{ IOException -> 0x037c }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0114 A[Catch:{ IOException -> 0x037c }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0119 A[Catch:{ IOException -> 0x037c }] */
    public final long open(X.C257263x7 r24) {
        /*
            r23 = this;
            r9 = r23
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r9.A0D
            r22 = r0
            X.3wn r12 = r9.A0C
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.A08
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x001c
            X.28e r1 = r12.A00
            X.28e r0 = X.28e.A04
            if (r1 != r0) goto L_0x001c
            X.28e r0 = X.28e.A01
            r12.A00 = r0
        L_0x001c:
            r8 = r24
            r9.A02 = r8
            r6 = 0
            r9.A00 = r6
            X.3x6 r13 = r8.A07
            java.util.Map r0 = r13.A0Q
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x0030:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x004f
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            java.util.Map r0 = r9.A09
            monitor-enter(r0)
            r0.put(r2, r1)     // Catch:{ all -> 0x004c }
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            goto L_0x0030
        L_0x004c:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            throw r2
        L_0x004f:
            long r2 = r8.A04
            long r4 = r8.A03
            java.lang.String r11 = "Range: "
            r18 = -1
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00aa
            int r0 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x00aa
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r11)
            java.lang.String r0 = "unspecified"
            r10.append(r0)
        L_0x006c:
            java.lang.String r14 = r10.toString()
        L_0x0070:
            java.lang.String r1 = "Uri"
            X.3x7 r0 = r9.A02
            android.net.Uri r0 = r0.A06
            java.lang.String r0 = r0.toString()
            java.lang.String r20 = A00(r1, r0)
            X.3x7 r0 = r9.A02
            r11 = 0
            if (r0 == 0) goto L_0x00a8
            X.3x6 r0 = r0.A07
            int r1 = r0.A05
            if (r1 < 0) goto L_0x00a8
        L_0x0089:
            r10 = 1
            java.lang.String r15 = "Priority"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.String r17 = A00(r15, r0)
            java.lang.String r15 = "isFirstMedia"
            boolean r0 = r12.A09
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r16 = A00(r15, r0)
            android.net.LocalSocket r0 = new android.net.LocalSocket
            r0.<init>()
            r9.A05 = r0
            goto L_0x00c7
        L_0x00a8:
            r1 = 0
            goto L_0x0089
        L_0x00aa:
            java.lang.String r1 = "bytes="
            java.lang.String r0 = "-"
            java.lang.String r14 = X.002.A0s(r11, r1, r0, r2)
            int r0 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x0070
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r14)
            long r0 = r4 + r2
            r14 = 1
            long r0 = r0 - r14
            r10.append(r0)
            goto L_0x006c
        L_0x00c7:
            java.lang.String r0 = "localsocketconnect"
            X.27d.A01(r0)     // Catch:{ IOException -> 0x0388 }
            android.net.LocalSocket r0 = r9.A05     // Catch:{ IOException -> 0x0388 }
            r21 = r0
            java.lang.String r0 = r9.A0E     // Catch:{ IOException -> 0x0388 }
            android.net.LocalSocketAddress r15 = new android.net.LocalSocketAddress     // Catch:{ IOException -> 0x0388 }
            r15.<init>(r0)     // Catch:{ IOException -> 0x0388 }
            r0 = r21
            r0.connect(r15)     // Catch:{ IOException -> 0x0388 }
            X.27d.A00()
            android.net.LocalSocket r15 = r9.A05     // Catch:{ IOException -> 0x037c }
            boolean r0 = r13.A0U     // Catch:{ IOException -> 0x037c }
            if (r0 == 0) goto L_0x0114
            int r0 = r9.A0B     // Catch:{ IOException -> 0x037c }
        L_0x00e7:
            r15.setSoTimeout(r0)     // Catch:{ IOException -> 0x037c }
            android.net.LocalSocket r0 = r9.A05     // Catch:{ IOException -> 0x037c }
            java.io.OutputStream r0 = r0.getOutputStream()     // Catch:{ IOException -> 0x037c }
            r9.A06 = r0     // Catch:{ IOException -> 0x037c }
            android.net.LocalSocket r0 = r9.A05     // Catch:{ IOException -> 0x037c }
            java.io.InputStream r13 = r0.getInputStream()     // Catch:{ IOException -> 0x037c }
            java.io.DataInputStream r0 = new java.io.DataInputStream     // Catch:{ IOException -> 0x037c }
            r0.<init>(r13)     // Catch:{ IOException -> 0x037c }
            r9.A04 = r0     // Catch:{ IOException -> 0x037c }
            r9.A02(r14)     // Catch:{ IOException -> 0x037c }
            r0 = r20
            r9.A02(r0)     // Catch:{ IOException -> 0x037c }
            r0 = r17
            r9.A02(r0)     // Catch:{ IOException -> 0x037c }
            r0 = r16
            r9.A02(r0)     // Catch:{ IOException -> 0x037c }
            java.lang.String r13 = r12.A03     // Catch:{ IOException -> 0x037c }
            goto L_0x0117
        L_0x0114:
            int r0 = r9.A0A     // Catch:{ IOException -> 0x037c }
            goto L_0x00e7
        L_0x0117:
            if (r13 == 0) goto L_0x0122
            java.lang.String r0 = "play_origin"
            java.lang.String r0 = A00(r0, r13)     // Catch:{ IOException -> 0x037c }
            r9.A02(r0)     // Catch:{ IOException -> 0x037c }
        L_0x0122:
            X.3x7 r0 = r9.A02     // Catch:{ IOException -> 0x037c }
            if (r0 == 0) goto L_0x0133
            java.lang.String r13 = r0.A08     // Catch:{ IOException -> 0x037c }
            if (r13 == 0) goto L_0x0133
            java.lang.String r0 = "cache_key"
            java.lang.String r0 = A00(r0, r13)     // Catch:{ IOException -> 0x037c }
            r9.A02(r0)     // Catch:{ IOException -> 0x037c }
        L_0x0133:
            r0 = r22
            boolean r0 = r0.A2M     // Catch:{ IOException -> 0x037c }
            if (r0 == 0) goto L_0x0152
            if (r1 != 0) goto L_0x0152
            X.3x7 r0 = r9.A02     // Catch:{ IOException -> 0x037c }
            if (r0 == 0) goto L_0x0152
            X.3x6 r0 = r0.A07     // Catch:{ IOException -> 0x037c }
            int r0 = r0.A00     // Catch:{ IOException -> 0x037c }
            if (r0 <= 0) goto L_0x0152
            java.lang.String r1 = "etd_ms"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x037c }
            java.lang.String r0 = A00(r1, r0)     // Catch:{ IOException -> 0x037c }
            r9.A02(r0)     // Catch:{ IOException -> 0x037c }
        L_0x0152:
            java.lang.String r14 = ""
            r9.A02(r14)     // Catch:{ IOException -> 0x037c }
            java.util.Map r13 = r9.A09     // Catch:{ IOException -> 0x037c }
            monitor-enter(r13)     // Catch:{ IOException -> 0x037c }
            java.util.Set r0 = r13.entrySet()     // Catch:{ all -> 0x0371 }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ all -> 0x0371 }
        L_0x0162:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0371 }
            if (r0 == 0) goto L_0x0184
            java.lang.Object r0 = r16.next()     // Catch:{ all -> 0x0371 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0371 }
            java.lang.Object r15 = r0.getKey()     // Catch:{ all -> 0x0371 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x0371 }
            java.lang.String r1 = ": "
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0371 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0371 }
            java.lang.String r0 = X.002.A0g(r15, r1, r0)     // Catch:{ all -> 0x0371 }
            r9.A02(r0)     // Catch:{ all -> 0x0371 }
            goto L_0x0162
        L_0x0184:
            monitor-exit(r13)     // Catch:{ all -> 0x0371 }
            r9.A02(r14)     // Catch:{ IOException -> 0x037c }
            java.util.concurrent.atomic.AtomicReference r0 = r9.A0F     // Catch:{ IOException -> 0x037c }
            r0.get()     // Catch:{ IOException -> 0x037c }
            java.lang.String r1 = "video_id"
            java.lang.String r0 = r12.A07     // Catch:{ IOException -> 0x037c }
            java.lang.String r0 = A00(r1, r0)     // Catch:{ IOException -> 0x037c }
            r9.A02(r0)     // Catch:{ IOException -> 0x037c }
            java.lang.String r1 = "video_request_type"
            X.28e r0 = r12.A00     // Catch:{ IOException -> 0x037c }
            java.lang.String r0 = r0.name()     // Catch:{ IOException -> 0x037c }
            java.lang.String r0 = A00(r1, r0)     // Catch:{ IOException -> 0x037c }
            r9.A02(r0)     // Catch:{ IOException -> 0x037c }
            X.3x7 r0 = r9.A02     // Catch:{ IOException -> 0x037c }
            if (r0 == 0) goto L_0x01f5
            java.lang.String r1 = "video_stream_type"
            X.3x6 r0 = r0.A07     // Catch:{ IOException -> 0x037c }
            int r0 = r0.A09     // Catch:{ IOException -> 0x037c }
            X.3p9 r0 = X.C252463p9.A00(r0)     // Catch:{ IOException -> 0x037c }
            java.lang.String r0 = r0.A01     // Catch:{ IOException -> 0x037c }
            java.lang.String r0 = A00(r1, r0)     // Catch:{ IOException -> 0x037c }
            r9.A02(r0)     // Catch:{ IOException -> 0x037c }
            java.lang.String r1 = "video_pos"
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ IOException -> 0x037c }
            java.lang.String r0 = A00(r1, r0)     // Catch:{ IOException -> 0x037c }
            r9.A02(r0)     // Catch:{ IOException -> 0x037c }
            java.lang.String r1 = "video_start_ms"
            X.3x7 r0 = r9.A02     // Catch:{ IOException -> 0x037c }
            X.3x6 r0 = r0.A07     // Catch:{ IOException -> 0x037c }
            int r0 = r0.A08     // Catch:{ IOException -> 0x037c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x037c }
            java.lang.String r0 = A00(r1, r0)     // Catch:{ IOException -> 0x037c }
            r9.A02(r0)     // Catch:{ IOException -> 0x037c }
            r0 = r22
            boolean r0 = r0.A2L     // Catch:{ IOException -> 0x037c }
            if (r0 == 0) goto L_0x01f5
            java.lang.String r1 = "X-FB-Request-Analytics-Tags"
            X.3x7 r0 = r9.A02     // Catch:{ IOException -> 0x037c }
            X.3x6 r0 = r0.A07     // Catch:{ IOException -> 0x037c }
            java.lang.String r0 = X.AnonymousClass47Q.A00(r0)     // Catch:{ IOException -> 0x037c }
            java.lang.String r0 = A00(r1, r0)     // Catch:{ IOException -> 0x037c }
            r9.A02(r0)     // Catch:{ IOException -> 0x037c }
        L_0x01f5:
            r9.A02(r14)     // Catch:{ IOException -> 0x037c }
            java.util.HashMap r14 = new java.util.HashMap     // Catch:{ IOException -> 0x037c }
            r14.<init>()     // Catch:{ IOException -> 0x037c }
            java.io.DataInputStream r0 = r9.A04     // Catch:{ IOException -> 0x037c }
            if (r0 == 0) goto L_0x0374
            int r1 = r0.readInt()     // Catch:{ IOException -> 0x037c }
            r0 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r0) goto L_0x0369
            if (r1 < 0) goto L_0x0374
            byte[] r2 = new byte[r1]     // Catch:{ IOException -> 0x037c }
            java.io.DataInputStream r0 = r9.A04     // Catch:{ IOException -> 0x037c }
            if (r0 == 0) goto L_0x0214
            r0.read(r2)     // Catch:{ IOException -> 0x037c }
        L_0x0214:
            java.lang.String r0 = "US-ASCII"
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x037c }
            r1.<init>(r2, r0)     // Catch:{ IOException -> 0x037c }
            java.lang.String r0 = "\\r?\\n"
            java.lang.String[] r13 = r1.split(r0)     // Catch:{ IOException -> 0x037c }
            int r12 = r13.length     // Catch:{ IOException -> 0x037c }
            r3 = 0
        L_0x0223:
            if (r3 >= r12) goto L_0x024f
            r2 = r13[r3]     // Catch:{ IOException -> 0x037c }
            r0 = 58
            int r0 = r2.indexOf(r0)     // Catch:{ IOException -> 0x037c }
            if (r0 < 0) goto L_0x024c
            java.lang.String r1 = r2.substring(r11, r0)     // Catch:{ IOException -> 0x037c }
            java.lang.String r1 = r1.trim()     // Catch:{ IOException -> 0x037c }
            int r0 = r0 + 1
            java.lang.String r0 = r2.substring(r0)     // Catch:{ IOException -> 0x037c }
            java.lang.String r0 = r0.trim()     // Catch:{ IOException -> 0x037c }
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ IOException -> 0x037c }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ IOException -> 0x037c }
            r14.put(r1, r0)     // Catch:{ IOException -> 0x037c }
        L_0x024c:
            int r3 = r3 + 1
            goto L_0x0223
        L_0x024f:
            r9.A07 = r14     // Catch:{ IOException -> 0x037c }
            java.lang.String r2 = "status-code"
            boolean r1 = r14.containsKey(r2)
            java.util.Map r0 = r9.A07
            if (r1 != 0) goto L_0x0349
            java.lang.String r2 = "error-reason"
            boolean r0 = r0.containsKey(r2)
            if (r0 != 0) goto L_0x0329
            java.util.Map r12 = r9.A07
            java.lang.String r1 = "Content-Length"
            boolean r0 = r12.containsKey(r1)
            r13 = 0
            if (r0 == 0) goto L_0x0287
            java.lang.Object r0 = r12.get(r1)
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r14 = r0.get(r11)
            java.lang.String r14 = (java.lang.String) r14
        L_0x027a:
            boolean r2 = android.text.TextUtils.isEmpty(r14)
            r0 = -1
            java.lang.String r20 = "LocalSocketProxyDataSource"
            r17 = 2
            if (r2 != 0) goto L_0x029e
            goto L_0x0289
        L_0x0287:
            r14 = r13
            goto L_0x027a
        L_0x0289:
            long r2 = java.lang.Long.parseLong(r14)     // Catch:{ NumberFormatException -> 0x028e }
            goto L_0x02a0
        L_0x028e:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[]{r14, r2}
            java.lang.String r2 = "Unexpected Content-Length [%s]"
            java.lang.String r3 = java.lang.String.format(r2, r3)
            r2 = r20
            android.util.Log.e(r2, r3)
        L_0x029e:
            r2 = -1
        L_0x02a0:
            java.lang.String r16 = "Content-Range"
            r15 = r16
            boolean r15 = r12.containsKey(r15)
            if (r15 == 0) goto L_0x02b8
            r13 = r16
            java.lang.Object r12 = r12.get(r13)
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r13 = r12.get(r11)
            java.lang.String r13 = (java.lang.String) r13
        L_0x02b8:
            boolean r12 = android.text.TextUtils.isEmpty(r13)
            if (r12 != 0) goto L_0x0311
            java.util.regex.Pattern r12 = A0G
            java.util.regex.Matcher r15 = r12.matcher(r13)
            boolean r12 = r15.find()
            if (r12 == 0) goto L_0x0311
            java.lang.String r16 = r15.group(r10)     // Catch:{ NumberFormatException -> 0x0301 }
            r12 = r17
            java.lang.String r12 = r15.group(r12)     // Catch:{ NumberFormatException -> 0x0301 }
            if (r16 == 0) goto L_0x02e4
            if (r12 == 0) goto L_0x02e4
            long r0 = java.lang.Long.parseLong(r12)     // Catch:{ NumberFormatException -> 0x0301 }
            long r15 = java.lang.Long.parseLong(r16)     // Catch:{ NumberFormatException -> 0x0301 }
            long r0 = r0 - r15
            r15 = 1
            long r0 = r0 + r15
        L_0x02e4:
            int r12 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r12 < 0) goto L_0x02ff
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 == 0) goto L_0x0311
            java.lang.String r7 = "Inconsistent headers [%s] [%s]"
            java.lang.Object[] r6 = new java.lang.Object[]{r14, r13}     // Catch:{ NumberFormatException -> 0x0301 }
            java.lang.String r7 = java.lang.String.format(r7, r6)     // Catch:{ NumberFormatException -> 0x0301 }
            r6 = r20
            android.util.Log.e(r6, r7)     // Catch:{ NumberFormatException -> 0x0301 }
            long r0 = java.lang.Math.max(r2, r0)     // Catch:{ NumberFormatException -> 0x0301 }
        L_0x02ff:
            r2 = r0
            goto L_0x0311
        L_0x0301:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[]{r13, r0}
            java.lang.String r0 = "Unexpected Content-Range [%s]"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            r0 = r20
            android.util.Log.e(r0, r1)
        L_0x0311:
            int r0 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x0316
            r4 = r2
        L_0x0316:
            r9.A01 = r4
            r9.A08 = r10
            X.3m7 r1 = r9.A03
            if (r1 == 0) goto L_0x0326
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x0323
            r11 = 1
        L_0x0323:
            r1.Dtf(r9, r8, r10, r11)
        L_0x0326:
            long r0 = r9.A01
            return r0
        L_0x0329:
            r9.A01()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "upstreamErr: "
            r1.append(r0)
            java.util.Map r0 = r9.A07
            java.lang.Object r0 = r0.get(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.47r r2 = new X.47r
            r2.<init>(r8, r0, r10)
            throw r2
        L_0x0349:
            java.lang.Object r0 = r0.get(r2)
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r11)
            java.lang.String r0 = (java.lang.String) r0
            int r7 = java.lang.Integer.parseInt(r0)
            r9.A01()
            java.util.Map r0 = r9.A07
            byte[] r6 = com.google.android.exoplayer2.util.Util.A06
            r4 = 0
            X.47q r2 = new X.47q
            r3 = r8
            r5 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            throw r2
        L_0x0369:
            java.lang.String r0 = "header too long"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x037c }
            r1.<init>(r0)     // Catch:{ IOException -> 0x037c }
            goto L_0x037b
        L_0x0371:
            r1 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0371 }
            goto L_0x037b
        L_0x0374:
            java.lang.String r0 = "No input stream to read header."
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x037c }
            r1.<init>(r0)     // Catch:{ IOException -> 0x037c }
        L_0x037b:
            throw r1     // Catch:{ IOException -> 0x037c }
        L_0x037c:
            r1 = move-exception
            r9.A01()
            r0 = 2000(0x7d0, float:2.803E-42)
            X.47r r2 = new X.47r
            r2.<init>((X.C257263x7) r8, (java.io.IOException) r1, (int) r0, (int) r10)
            throw r2
        L_0x0388:
            r2 = move-exception
            r9.A01()     // Catch:{ all -> 0x0398 }
            java.lang.String r0 = r9.A0E     // Catch:{ all -> 0x0398 }
            int r1 = r0.hashCode()     // Catch:{ all -> 0x0398 }
            X.NEv r0 = new X.NEv     // Catch:{ all -> 0x0398 }
            r0.<init>(r8, r2, r1)     // Catch:{ all -> 0x0398 }
            throw r0     // Catch:{ all -> 0x0398 }
        L_0x0398:
            r2 = move-exception
            X.27d.A00()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5H4.open(X.3x7):long");
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read;
        try {
            long j = this.A01;
            if (j != -1) {
                i2 = (int) Math.min((long) i2, j - this.A00);
            }
            if (i2 != 0) {
                DataInputStream dataInputStream = this.A04;
                if (dataInputStream == null || (read = dataInputStream.read(bArr, i, i2)) == -1) {
                    long j2 = this.A01;
                    if (!(j2 == -1 || j2 == this.A00)) {
                        throw new EOFException();
                    }
                } else {
                    this.A00 += (long) read;
                    C250823m7 r2 = this.A03;
                    if (r2 == null) {
                        return read;
                    }
                    C257263x7 r1 = this.A02;
                    C257263x7 r0 = C257263x7.A0B;
                    if (r1 == null) {
                        r1 = C257263x7.A0B;
                    }
                    r2.Czk(this, r1, read, true);
                    return read;
                }
            }
            return -1;
        } catch (IOException e) {
            C257263x7 r3 = this.A02;
            if (r3 == null) {
                r3 = new C257263x7(Uri.EMPTY, 0, -1);
            }
            throw new C2609547r(r3, e, (int) CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, 2);
        }
    }

    public AnonymousClass5H4(C257063wn r2, HeroPlayerSetting heroPlayerSetting, C250823m7 r4, String str, AtomicReference atomicReference, int i) {
        this.A03 = r4;
        this.A0E = str;
        this.A0A = i;
        this.A0B = heroPlayerSetting.A0b;
        this.A0D = heroPlayerSetting;
        this.A0F = atomicReference;
        this.A0C = r2;
    }

    public final void addTransferListener(C250823m7 r1) {
        r1.getClass();
        this.A03 = r1;
    }

    public final void close() {
        A01();
        if (this.A08) {
            this.A08 = false;
            C250823m7 r2 = this.A03;
            if (r2 != null) {
                C257263x7 r1 = this.A02;
                C257263x7 r0 = C257263x7.A0B;
                if (r1 == null) {
                    r1 = C257263x7.A0B;
                }
                r2.DtX(this, r1, true);
            }
        }
    }
}
