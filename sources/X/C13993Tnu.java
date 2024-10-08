package X;

import android.os.Bundle;
import android.os.Handler;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.Tnu  reason: case insensitive filesystem */
public final class C13993Tnu {
    public static final Object A08 = new Object();
    public static volatile C13993Tnu A09;
    public final Handler A00;
    public final C13996Tny A01;
    public final X02 A02;
    public final C20870X1w A03;
    public final X03 A04;
    public final Set A05;
    public final ReadWriteLock A06 = new ReentrantReadWriteLock();
    public volatile int A07 = 3;

    public static C13993Tnu A00() {
        C13993Tnu tnu;
        synchronized (A08) {
            tnu = A09;
            boolean z = false;
            if (tnu != null) {
                z = true;
            }
            02V.A07(z, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return tnu;
    }

    public final int A01() {
        ReadWriteLock readWriteLock = this.A06;
        readWriteLock.readLock().lock();
        try {
            return this.A07;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [X.4b1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v4, types: [X.4b1, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a4 A[Catch:{ all -> 0x00df }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence A02(java.lang.CharSequence r16, int r17, int r18) {
        /*
            r15 = this;
            r12 = r18
            r11 = r17
            r10 = r16
            int r0 = r15.A01()
            r1 = 1
            if (r0 == r1) goto L_0x000e
            r1 = 0
        L_0x000e:
            java.lang.String r0 = "Not initialized yet"
            X.02V.A07(r1, r0)
            java.lang.String r0 = "start cannot be negative"
            X.02V.A02(r11, r0)
            java.lang.String r0 = "end cannot be negative"
            X.02V.A02(r12, r0)
            r1 = 0
            if (r11 > r12) goto L_0x0021
            r1 = 1
        L_0x0021:
            java.lang.String r0 = "start should be <= than end"
            X.02V.A06(r1, r0)
            if (r16 != 0) goto L_0x002a
            r10 = 0
        L_0x0029:
            return r10
        L_0x002a:
            int r0 = r10.length()
            r1 = 0
            if (r11 > r0) goto L_0x0032
            r1 = 1
        L_0x0032:
            java.lang.String r0 = "start should be < than charSequence length"
            X.02V.A06(r1, r0)
            int r0 = r10.length()
            r1 = 0
            if (r12 > r0) goto L_0x003f
            r1 = 1
        L_0x003f:
            java.lang.String r0 = "end should be < than charSequence length"
            X.02V.A06(r1, r0)
            int r0 = r10.length()
            if (r0 == 0) goto L_0x0029
            if (r11 == r12) goto L_0x0029
            r14 = 0
            X.Tny r0 = r15.A01
            X.2ER r9 = r0.A01
            r1 = r10
            r13 = 2147483647(0x7fffffff, float:NaN)
            boolean r3 = r10 instanceof X.C267104ay
            if (r3 == 0) goto L_0x005f
            r0 = r10
            X.4ay r0 = (X.C267104ay) r0
            X.C267104ay.A02(r0)
        L_0x005f:
            r5 = 0
            if (r3 != 0) goto L_0x0086
            boolean r0 = r10 instanceof android.text.Spannable     // Catch:{ all -> 0x00df }
            if (r0 != 0) goto L_0x0086
            boolean r0 = r10 instanceof android.text.Spanned     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x0092
            r6 = r10
            android.text.Spanned r6 = (android.text.Spanned) r6     // Catch:{ all -> 0x00df }
            int r4 = r17 + -1
            int r2 = r18 + 1
            java.lang.Class<X.5wK> r0 = X.C299975wK.class
            int r0 = r6.nextSpanTransition(r4, r2, r0)     // Catch:{ all -> 0x00df }
            if (r0 > r12) goto L_0x0092
            X.4b1 r5 = new X.4b1     // Catch:{ all -> 0x00df }
            r5.<init>()     // Catch:{ all -> 0x00df }
            r5.A01 = r14     // Catch:{ all -> 0x00df }
            android.text.SpannableString r0 = new android.text.SpannableString     // Catch:{ all -> 0x00df }
            r0.<init>(r10)     // Catch:{ all -> 0x00df }
            goto L_0x0090
        L_0x0086:
            r0 = r10
            android.text.Spannable r0 = (android.text.Spannable) r0     // Catch:{ all -> 0x00df }
            X.4b1 r5 = new X.4b1     // Catch:{ all -> 0x00df }
            r5.<init>()     // Catch:{ all -> 0x00df }
            r5.A01 = r14     // Catch:{ all -> 0x00df }
        L_0x0090:
            r5.A00 = r0     // Catch:{ all -> 0x00df }
        L_0x0092:
            if (r5 == 0) goto L_0x00be
            java.lang.Class<X.5wK> r0 = X.C299975wK.class
            java.lang.Object[] r8 = r5.getSpans(r11, r12, r0)     // Catch:{ all -> 0x00df }
            X.5wK[] r8 = (X.C299975wK[]) r8     // Catch:{ all -> 0x00df }
            if (r8 == 0) goto L_0x00be
            int r7 = r8.length     // Catch:{ all -> 0x00df }
            if (r7 <= 0) goto L_0x00be
            r6 = 0
        L_0x00a2:
            if (r6 >= r7) goto L_0x00be
            r4 = r8[r6]     // Catch:{ all -> 0x00df }
            int r2 = r5.getSpanStart(r4)     // Catch:{ all -> 0x00df }
            int r0 = r5.getSpanEnd(r4)     // Catch:{ all -> 0x00df }
            if (r2 == r12) goto L_0x00b3
            r5.removeSpan(r4)     // Catch:{ all -> 0x00df }
        L_0x00b3:
            int r11 = java.lang.Math.min(r2, r11)     // Catch:{ all -> 0x00df }
            int r12 = java.lang.Math.max(r0, r12)     // Catch:{ all -> 0x00df }
            int r6 = r6 + 1
            goto L_0x00a2
        L_0x00be:
            if (r11 == r12) goto L_0x00d7
            int r0 = r10.length()     // Catch:{ all -> 0x00df }
            if (r11 >= r0) goto L_0x00d7
            X.X03 r0 = r9.A01     // Catch:{ all -> 0x00df }
            X.4az r8 = new X.4az     // Catch:{ all -> 0x00df }
            r8.<init>(r0, r5)     // Catch:{ all -> 0x00df }
            java.lang.Object r0 = X.2ER.A00(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00df }
            X.4b1 r0 = (X.C267134b1) r0     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x00d7
            android.text.Spannable r10 = r0.A00     // Catch:{ all -> 0x00df }
        L_0x00d7:
            if (r3 == 0) goto L_0x0029
            X.4ay r1 = (X.C267104ay) r1
            r1.A03()
            return r10
        L_0x00df:
            r0 = move-exception
            if (r3 == 0) goto L_0x00e7
            X.4ay r1 = (X.C267104ay) r1
            r1.A03()
        L_0x00e7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13993Tnu.A02(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final void A04(C271074hr r7) {
        02V.A03(r7, "initCallback cannot be null");
        ReadWriteLock readWriteLock = this.A06;
        readWriteLock.writeLock().lock();
        try {
            if (this.A07 == 1 || this.A07 == 2) {
                Handler handler = this.A00;
                int i = this.A07;
                02V.A03(r7, "initCallback cannot be null");
                handler.post(new 2ET((Throwable) null, Arrays.asList(new C271074hr[]{r7}), i));
            } else {
                this.A05.add(r7);
            }
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public final void A05(Throwable th) {
        ArrayList arrayList = new ArrayList();
        ReadWriteLock readWriteLock = this.A06;
        readWriteLock.writeLock().lock();
        try {
            this.A07 = 2;
            Set set = this.A05;
            arrayList.addAll(set);
            set.clear();
            C13988Tno.A1V(readWriteLock);
            this.A00.post(new 2ET(th, arrayList, this.A07));
        } catch (Throwable th2) {
            C13988Tno.A1V(readWriteLock);
            throw th2;
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.X03] */
    public C13993Tnu(X02 x02, C20870X1w x1w) {
        this.A03 = x1w;
        this.A02 = x02;
        this.A00 = AnonymousClass7TF.A0D();
        this.A05 = new 04u(0);
        this.A04 = new Object();
        this.A01 = new C13996Tny(this);
        ReadWriteLock readWriteLock = this.A06;
        readWriteLock.writeLock().lock();
        C13988Tno.A1V(readWriteLock);
        if (A01() == 0) {
            this.A01.A00();
        }
    }

    public final void A03(EditorInfo editorInfo) {
        int i;
        if (A01() == 1 && editorInfo != null) {
            Bundle bundle = editorInfo.extras;
            if (bundle == null) {
                bundle = new Bundle();
                editorInfo.extras = bundle;
            }
            AnonymousClass2CL r3 = this.A01.A02.A02;
            int A002 = r3.A00(4);
            if (A002 != 0) {
                i = r3.A04.getInt(A002 + r3.A00);
            } else {
                i = 0;
            }
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }
}
