package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.analytics2.logger.legacy.uploader.PrivacyControlledUploader;
import java.util.Iterator;

/* renamed from: X.3nJ  reason: invalid class name and case insensitive filesystem */
public final class C251563nJ extends Handler {
    public static final C251573nK A0D = new Object();
    public static final AnonymousClass0K0 A0E = AnonymousClass0K0.A00();
    public PrivacyControlledUploader A00;
    public C251763nd A01;
    public Iterator A02;
    public boolean A03 = false;
    public boolean A04 = false;
    public boolean A05;
    public final Context A06;
    public final 01r A07 = new 01r(2);
    public final C251583nL A08 = new C251583nL(this);
    public final C251493nC A09;
    public final C251513nE A0A;
    public final HandlerThread A0B;
    public final boolean A0C;

    private void A00() {
        08j.A00("exitStateMachine");
        try {
            Context context = this.A06;
            C251493nC r0 = this.A09;
            int i = r0.A00;
            1z1.A01(context, this.A07, r0.A02, i, this.A05);
            this.A0A.onExit();
            if (this.A0C) {
                this.A0B.quit();
            }
        } finally {
            AnonymousClass08k.A00();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.1rB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.facebook.analytics2.logger.interfaces.DefaultFalcoAcsProvider} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: com.facebook.analytics2.logger.interfaces.DefaultFalcoAcsProvider} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: com.facebook.analytics2.logger.interfaces.DefaultFalcoAcsProvider} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: X.1rB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: X.1rB} */
    /* JADX WARNING: type inference failed for: r11v3, types: [java.lang.Object, com.facebook.analytics2.logger.legacy.uploader.PrivacyControlledUploader] */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c5, code lost:
        if (r1 == null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fd, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        X.0KC.A0J("UploadJobHandler", "ACS provider init failed", r8);
        r9 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r3.A0A.Dzt(false);
        A00();
        r0 = new java.lang.RuntimeException(X.002.A0R("Failed to create instance of ", r7), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x017f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0180, code lost:
        X.AnonymousClass08k.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0183, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:13:0x0021, B:57:0x00f0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r18) {
        /*
            r17 = this;
            r3 = r17
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x0184
            r2 = r18
            int r1 = r2.what
            r0 = 1
            if (r1 == r0) goto L_0x007a
            r0 = 2
            if (r1 == r0) goto L_0x005c
            r0 = 3
            if (r1 == r0) goto L_0x0051
            r0 = 4
            if (r1 == r0) goto L_0x0045
            r0 = 5
            if (r1 != r0) goto L_0x0035
            java.lang.Object r2 = r2.obj
            java.lang.String r0 = "doUploadFailure"
            X.08j.A00(r0)
            r1 = 3
            X.0I2 r0 = X.0KC.A01     // Catch:{ all -> 0x017f }
            boolean r0 = r0.isLoggable(r1)     // Catch:{ all -> 0x017f }
            if (r0 == 0) goto L_0x002c
            r2.toString()     // Catch:{ all -> 0x017f }
        L_0x002c:
            r1 = 1
            r3.A05 = r1     // Catch:{ all -> 0x017f }
            X.3nE r0 = r3.A0A     // Catch:{ all -> 0x017f }
            r0.Dzt(r1)     // Catch:{ all -> 0x017f }
            goto L_0x0055
        L_0x0035:
            r0 = 2529(0x9e1, float:3.544E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = X.002.A0O(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0045:
            java.lang.String r0 = "doNoMoreInput"
            X.08j.A00(r0)
            r1 = 0
            X.3nE r0 = r3.A0A     // Catch:{ all -> 0x017f }
            r0.Dzt(r1)     // Catch:{ all -> 0x017f }
            goto L_0x0055
        L_0x0051:
            r0 = 1
            r3.A03 = r0
            goto L_0x0058
        L_0x0055:
            X.AnonymousClass08k.A00()
        L_0x0058:
            r3.A00()
            return
        L_0x005c:
            java.lang.String r0 = "doMaybeUploadNext"
            X.08j.A00(r0)
            X.3nd r1 = r3.A01     // Catch:{ all -> 0x017f }
            java.util.Iterator r0 = r1.A00     // Catch:{ all -> 0x017f }
            boolean r0 = r0.hasNext()     // Catch:{ all -> 0x017f }
            if (r0 == 0) goto L_0x0070
            r1.A00()     // Catch:{ all -> 0x017f }
            goto L_0x0165
        L_0x0070:
            r0 = 4
            android.os.Message r0 = r3.obtainMessage(r0)     // Catch:{ all -> 0x017f }
            r3.sendMessage(r0)     // Catch:{ all -> 0x017f }
            goto L_0x0165
        L_0x007a:
            java.lang.String r0 = "doInit"
            X.08j.A00(r0)
            X.3nC r0 = r3.A09     // Catch:{ all -> 0x017f }
            X.1uw r6 = r0.A01     // Catch:{ all -> 0x017f }
            java.lang.String r4 = r6.A0B     // Catch:{ all -> 0x017f }
            android.content.Context r9 = r3.A06     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0169 }
            X.1ss r1 = X.1ss.A00(r9)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0169 }
            java.util.ArrayList r0 = r1.A05     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0169 }
            java.lang.Object r5 = X.1ss.A01(r1, r4, r0)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0169 }
            X.1qe r5 = (X.C66841qe) r5     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0169 }
            if (r5 == 0) goto L_0x0165
            java.lang.String r2 = r6.A07     // Catch:{ all -> 0x017f }
            if (r2 == 0) goto L_0x00ed
            X.1ss r1 = X.1ss.A00(r9)     // Catch:{ all -> 0x017f }
            java.util.ArrayList r0 = r1.A06     // Catch:{ all -> 0x017f }
            java.lang.Object r4 = X.1ss.A02(r1, r2, r0)     // Catch:{ all -> 0x017f }
            X.3nK r4 = (X.C251573nK) r4     // Catch:{ all -> 0x017f }
        L_0x00a5:
            java.lang.String r2 = r6.A08     // Catch:{ all -> 0x017f }
            if (r2 == 0) goto L_0x00eb
            X.1ss r1 = X.1ss.A00(r9)     // Catch:{ all -> 0x017f }
            java.util.ArrayList r0 = r1.A03     // Catch:{ all -> 0x017f }
            java.lang.Object r2 = X.1ss.A02(r1, r2, r0)     // Catch:{ all -> 0x017f }
            com.facebook.flexiblesampling.SamplingPolicyConfig r2 = (com.facebook.flexiblesampling.SamplingPolicyConfig) r2     // Catch:{ all -> 0x017f }
        L_0x00b5:
            java.lang.String r7 = r6.A05     // Catch:{ all -> 0x017f }
            if (r7 == 0) goto L_0x00c7
            X.1ss r1 = X.1ss.A00(r9)     // Catch:{ all -> 0x017f }
            java.util.ArrayList r0 = r1.A02     // Catch:{ all -> 0x017f }
            java.lang.Object r1 = X.1ss.A02(r1, r7, r0)     // Catch:{ all -> 0x017f }
            X.1rB r1 = (X.1rB) r1     // Catch:{ all -> 0x017f }
            if (r1 != 0) goto L_0x00cc
        L_0x00c7:
            com.facebook.analytics2.logger.interfaces.DefaultFFDBProvider r1 = new com.facebook.analytics2.logger.interfaces.DefaultFFDBProvider     // Catch:{ all -> 0x017f }
            r1.<init>()     // Catch:{ all -> 0x017f }
        L_0x00cc:
            X.0K0 r7 = A0E     // Catch:{ all -> 0x017f }
            java.lang.String r0 = r6.A06     // Catch:{ all -> 0x017f }
            X.3nM r10 = new X.3nM     // Catch:{ all -> 0x017f }
            r10.<init>(r9, r7, r2, r0)     // Catch:{ all -> 0x017f }
            java.lang.String r8 = r6.A04     // Catch:{ all -> 0x017f }
            if (r8 == 0) goto L_0x00e2
            X.1ss r7 = X.1ss.A00(r9)     // Catch:{ all -> 0x017f }
            java.util.ArrayList r0 = r7.A01     // Catch:{ all -> 0x017f }
            X.1ss.A02(r7, r8, r0)     // Catch:{ all -> 0x017f }
        L_0x00e2:
            java.io.File r12 = r6.A02     // Catch:{ all -> 0x017f }
            X.3nL r11 = r3.A08     // Catch:{ all -> 0x017f }
            int r14 = r6.A01     // Catch:{ all -> 0x017f }
            java.lang.String r7 = r6.A00     // Catch:{ all -> 0x017f }
            goto L_0x00f0
        L_0x00eb:
            r2 = 0
            goto L_0x00b5
        L_0x00ed:
            X.3nK r4 = A0D     // Catch:{ all -> 0x017f }
            goto L_0x00a5
        L_0x00f0:
            X.1ss r8 = X.1ss.A00(r9)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x014f, NullPointerException -> 0x00fd }
            java.util.ArrayList r0 = r8.A00     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x014f, NullPointerException -> 0x00fd }
            java.lang.Object r9 = X.1ss.A01(r8, r7, r0)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x014f, NullPointerException -> 0x00fd }
            com.facebook.analytics2.logger.interfaces.DefaultFalcoAcsProvider r9 = (com.facebook.analytics2.logger.interfaces.DefaultFalcoAcsProvider) r9     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x014f, NullPointerException -> 0x00fd }
            goto L_0x010a
        L_0x00fd:
            r8 = move-exception
            java.lang.String r7 = "UploadJobHandler"
            java.lang.String r0 = "ACS provider init failed"
            X.0KC.A0J(r7, r0, r8)     // Catch:{ all -> 0x017f }
            com.facebook.analytics2.logger.interfaces.DefaultFalcoAcsProvider r9 = new com.facebook.analytics2.logger.interfaces.DefaultFalcoAcsProvider     // Catch:{ all -> 0x017f }
            r9.<init>()     // Catch:{ all -> 0x017f }
        L_0x010a:
            java.lang.String r13 = r1.B3V()     // Catch:{ all -> 0x017f }
            boolean r15 = r1.BuW()     // Catch:{ all -> 0x017f }
            boolean r0 = r6.A0D     // Catch:{ all -> 0x017f }
            X.3nP r8 = new X.3nP     // Catch:{ all -> 0x017f }
            r16 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x017f }
            r3.A02 = r8     // Catch:{ all -> 0x017f }
            com.facebook.analytics2.logger.legacy.uploader.PrivacyControlledUploader r11 = r3.A00     // Catch:{ all -> 0x017f }
            if (r11 != 0) goto L_0x014a
            com.facebook.analytics2.logger.legacy.uploader.PrivacyControlledUploader r11 = new com.facebook.analytics2.logger.legacy.uploader.PrivacyControlledUploader     // Catch:{ all -> 0x017f }
            r11.<init>()     // Catch:{ all -> 0x017f }
            r11.A01 = r5     // Catch:{ all -> 0x017f }
            r11.A00 = r4     // Catch:{ all -> 0x017f }
            r3.A00 = r11     // Catch:{ all -> 0x017f }
        L_0x012c:
            java.lang.Integer r0 = r6.A03     // Catch:{ all -> 0x017f }
            X.3nb r10 = new X.3nb     // Catch:{ all -> 0x017f }
            r10.<init>(r3)     // Catch:{ all -> 0x017f }
            X.3nd r9 = new X.3nd     // Catch:{ all -> 0x017f }
            r14 = r0
            r15 = r8
            r13 = r2
            r12 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x017f }
            r3.A01 = r9     // Catch:{ all -> 0x017f }
            r8.hasNext()     // Catch:{ all -> 0x017f }
            r0 = 2
            android.os.Message r0 = r3.obtainMessage(r0)     // Catch:{ all -> 0x017f }
            r3.sendMessage(r0)     // Catch:{ all -> 0x017f }
            goto L_0x0165
        L_0x014a:
            r11.A00 = r4     // Catch:{ all -> 0x017f }
            r11.A01 = r5     // Catch:{ all -> 0x017f }
            goto L_0x012c
        L_0x014f:
            r2 = move-exception
            r1 = 0
            X.3nE r0 = r3.A0A     // Catch:{ all -> 0x017f }
            r0.Dzt(r1)     // Catch:{ all -> 0x017f }
            r3.A00()     // Catch:{ all -> 0x017f }
            java.lang.String r0 = "Failed to create instance of "
            java.lang.String r1 = X.002.A0R(r0, r7)     // Catch:{ all -> 0x017f }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x017f }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x017f }
            goto L_0x017e
        L_0x0165:
            X.AnonymousClass08k.A00()
            return
        L_0x0169:
            r2 = move-exception
            r1 = 0
            X.3nE r0 = r3.A0A     // Catch:{ all -> 0x017f }
            r0.Dzt(r1)     // Catch:{ all -> 0x017f }
            r3.A00()     // Catch:{ all -> 0x017f }
            java.lang.String r0 = "Failed to create instance of "
            java.lang.String r1 = X.002.A0R(r0, r4)     // Catch:{ all -> 0x017f }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x017f }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x017f }
        L_0x017e:
            throw r0     // Catch:{ all -> 0x017f }
        L_0x017f:
            r0 = move-exception
            X.AnonymousClass08k.A00()
            throw r0
        L_0x0184:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C251563nJ.handleMessage(android.os.Message):void");
    }

    public C251563nJ(Context context, HandlerThread handlerThread, C251493nC r5, C251513nE r6, boolean z) {
        super(handlerThread.getLooper());
        this.A06 = context;
        this.A0B = handlerThread;
        this.A09 = r5;
        this.A0A = r6;
        this.A0C = z;
    }
}
