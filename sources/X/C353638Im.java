package X;

import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.MusicAssetModel;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8Im  reason: invalid class name and case insensitive filesystem */
public final class C353638Im {
    public boolean A00;
    public final int A01;
    public final UserSession A02;
    public final List A03 = new ArrayList();
    public final Context A04;
    public final C353628Il A05;
    public final C353648In A06 = new Object();

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.8In] */
    public C353638Im(Context context, UserSession userSession, C353628Il r4, int i) {
        0qQ.A0B(userSession, 2);
        this.A04 = context;
        this.A02 = userSession;
        this.A05 = r4;
        this.A01 = i;
    }

    public final void A02(Context context, UserSession userSession, C66496MTz mTz, String str, String str2, String str3) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 1);
        if (!this.A00) {
            this.A00 = true;
            0nY.A00().ATE(new KJH(context, userSession2, mTz, this, str3, str, str2));
        }
    }

    public final void A03(AudioOverlayTrack audioOverlayTrack, C66496MTz mTz, B2D b2d, int i, boolean z, boolean z2) {
        C66496MTz mTz2 = mTz;
        0qQ.A0B(mTz, 2);
        B2D b2d2 = b2d;
        0qQ.A0B(b2d, 3);
        MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
        if (musicAssetModel == null || z2) {
            this.A05.ACl();
            A02(this.A04, this.A02, mTz2, audioOverlayTrack.A0A, audioOverlayTrack.A0B, audioOverlayTrack.A0E);
            return;
        }
        audioOverlayTrack.A02 = Math.min(musicAssetModel.A00 - audioOverlayTrack.A03, i);
        String str = musicAssetModel.A0H;
        0qQ.A07(str);
        A04(musicAssetModel, b2d2, str, audioOverlayTrack.A03, audioOverlayTrack.A02, z);
    }

    public final void A04(MusicAssetModel musicAssetModel, B2D b2d, String str, int i, int i2, boolean z) {
        C349257zq.A02("TrackDownloader.downloadTrack");
        if (!this.A00) {
            this.A00 = true;
            0nY.A00().ATE(new C379059Si(musicAssetModel, b2d, this, str, i, i2, z));
            return;
        }
        throw new IllegalStateException("downloading is already in progress");
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [X.5JO, java.lang.Object] */
    public static final DownloadedTrack A00(MusicAssetModel musicAssetModel, C353638Im r29, String str, int i, int i2, boolean z) {
        1WY A002;
        Cursor query;
        IllegalStateException th;
        Integer valueOf;
        Integer valueOf2;
        File file;
        String str2;
        File cacheDir;
        MusicAssetModel musicAssetModel2 = musicAssetModel;
        C353638Im r4 = r29;
        int i3 = i;
        int i4 = i2;
        try {
            UserSession userSession = r4.A02;
            0Tu r18 = 0Tu.A05;
            if (182.A06(r18, userSession, 2342155652031513805L)) {
                int i5 = i2 + i;
                int i6 = i - r4.A01;
                int i7 = 0;
                if (0 < i6) {
                    i7 = i6;
                }
                int i8 = i5 - i7;
                if (!z) {
                    AnonymousClass9TO r1 = (AnonymousClass9TO) userSession.A01(AnonymousClass9TO.class, new MMW(40, r4.A04, userSession));
                    C353628Il r292 = r4.A05;
                    AnonymousClass2NR r14 = r1.A01;
                    String str3 = musicAssetModel2.A0E;
                    0qQ.A07(str3);
                    TreeMap treeMap = 1WY.A08;
                    A002 = 1Wa.A00("SELECT * FROM audio_tracks WHERE audio_track_id = ?", 1);
                    A002.ADh(1, str3);
                    C251983oI r0 = r14.A01;
                    C251983oI r28 = r0;
                    r28.assertNotSuspendingTransaction();
                    String str4 = null;
                    query = r0.query((AnonymousClass1WA) A002, (CancellationSignal) null);
                    int A012 = 1Wd.A01(query, "audio_track_id");
                    int A013 = 1Wd.A01(query, "start_time_ms");
                    int A014 = 1Wd.A01(query, "duration_ms");
                    int A015 = 1Wd.A01(query, "file_path");
                    int A016 = 1Wd.A01(query, "last_used_time_ms");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new A79(query.getString(A012), query.getString(A015), query.getInt(A013), query.getInt(A014), query.getLong(A016)));
                    }
                    query.close();
                    A002.A00();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (!new File(((A79) next).A04).exists()) {
                            arrayList2.add(next);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        0wb.A03("DownloadedTracksRepository", "Downloaded files deleted");
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            if (new File(((A79) next2).A04).exists()) {
                                arrayList3.add(next2);
                            }
                        }
                        arrayList = arrayList3;
                    }
                    int i9 = i3;
                    if (arrayList.isEmpty()) {
                        valueOf = Integer.valueOf(i3);
                        valueOf2 = Integer.valueOf(i4);
                    } else {
                        A79 A003 = AnonymousClass9TO.A00(arrayList, i9);
                        A79 A004 = AnonymousClass9TO.A00(arrayList, i5);
                        if (A003 != null) {
                            i9 = A003.A01 + A003.A00;
                        }
                        if (A004 != null) {
                            i5 = A004.A01;
                        }
                        if (i5 > i9) {
                            valueOf = Integer.valueOf(i9);
                            valueOf2 = Integer.valueOf(i5 - i9);
                        } else {
                            r292.ABD();
                            A79 A005 = AnonymousClass9TO.A00(arrayList, i3);
                            if (A005 != null) {
                                File file2 = new File(A005.A04);
                                int i10 = A005.A01;
                                int i11 = A005.A00;
                                String path = file2.getPath();
                                0qQ.A07(path);
                                return new DownloadedTrack(path, i10, i11);
                            }
                            th = new IllegalStateException("Required value was null.");
                            throw th;
                        }
                    }
                    r292.AQ9();
                    int intValue = valueOf.intValue();
                    int intValue2 = valueOf2.intValue();
                    try {
                        2Nn r3 = r1.A04;
                        if (r3.A02()) {
                            file = new File(r3.A03, 002.A0e("audio-", "-audio.mp4", System.currentTimeMillis()));
                            C353648In r13 = r1.A03;
                            Context context = r1.A00;
                            0qQ.A06(context);
                            String str5 = musicAssetModel2.A0H;
                            0qQ.A07(str5);
                            r292.AQA();
                            try {
                                String path2 = r13.A00(r292, file, str5, intValue, intValue2).getPath();
                                0qQ.A07(path2);
                                DownloadedTrack downloadedTrack = new DownloadedTrack(path2, intValue, intValue2);
                                A79 A006 = AnonymousClass9TO.A00(arrayList, intValue);
                                int i12 = intValue2 + intValue;
                                A79 A007 = AnonymousClass9TO.A00(arrayList, i12);
                                if (A006 != null) {
                                    intValue = A006.A01;
                                }
                                if (A007 != null) {
                                    i12 = A007.A01 + A007.A00;
                                }
                                if (A006 != null) {
                                    str2 = A006.A04;
                                } else {
                                    str2 = null;
                                }
                                String str6 = downloadedTrack.A02;
                                if (A007 != null) {
                                    str4 = A007.A04;
                                }
                                String[] strArr = {str2, str6, str4};
                                0qQ.A0B(strArr, 0);
                                List A0I = 03t.A0I(strArr);
                                if (A0I.size() > 1) {
                                    ArrayList arrayList4 = new ArrayList(0Yv.A1E(A0I, 10));
                                    Iterator it3 = A0I.iterator();
                                    while (it3.hasNext()) {
                                        it3.next();
                                        arrayList4.add(new C266724aF(TimeUnit.MILLISECONDS, -1, -1));
                                    }
                                    if (182.A06(r18, userSession, 36327219936639211L)) {
                                        2Nn r32 = r1.A04;
                                        if (r32.A02()) {
                                            cacheDir = r32.A03;
                                        } else {
                                            th = new IllegalStateException("Check failed.");
                                            throw th;
                                        }
                                    } else {
                                        cacheDir = context.getCacheDir();
                                        0qQ.A07(cacheDir);
                                    }
                                    str6 = SUW.A0C(context, userSession, cacheDir, "c", A0I, 00k.A0U(arrayList4));
                                }
                                r1.A02.A02(new Object(), str6);
                                String str7 = musicAssetModel2.A0E;
                                0qQ.A07(str7);
                                int i13 = i12 - intValue;
                                A79 a79 = new A79(str7, str6, intValue, i13, System.currentTimeMillis());
                                ArrayList arrayList5 = new ArrayList();
                                for (Object next3 : arrayList) {
                                    A79 a792 = (A79) next3;
                                    int i14 = a792.A01;
                                    int i15 = i14 + a792.A00;
                                    int i16 = a79.A01;
                                    int i17 = a79.A00 + i16;
                                    if (i16 > i14 || i14 > i17) {
                                        if (i16 > i15 || i15 > i17) {
                                            arrayList5.add(next3);
                                        }
                                    }
                                }
                                ArrayList A0U = 00k.A0U(arrayList5);
                                A0U.add(a79);
                                String str8 = musicAssetModel2.A0E;
                                0qQ.A07(str8);
                                r28.assertNotSuspendingTransaction();
                                1Vg r7 = r14.A02;
                                AnonymousClass1WV acquire = r7.acquire();
                                acquire.ADh(1, str8);
                                try {
                                    r28.beginTransaction();
                                    acquire.ATQ();
                                    r28.setTransactionSuccessful();
                                    r28.endTransaction();
                                    r7.release(acquire);
                                    r28.assertNotSuspendingTransaction();
                                    r28.beginTransaction();
                                    try {
                                        r14.A00.insert(A0U);
                                        r28.setTransactionSuccessful();
                                        r28.endTransaction();
                                        String path3 = new File(str6).getPath();
                                        0qQ.A07(path3);
                                        return new DownloadedTrack(path3, intValue, i13);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r28.endTransaction();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    r7.release(acquire);
                                }
                            } catch (IOException | IllegalStateException e) {
                                0wb.A06("AudioDownloadingUtil", "downloadTrack failed", e);
                                String str9 = musicAssetModel2.A0E;
                                0qQ.A07(str9);
                                return r4.A01(str, str9);
                            }
                        } else {
                            throw new IllegalStateException("Check failed.");
                        }
                    } catch (IOException | IllegalStateException unused) {
                        file = null;
                    }
                } else {
                    C353648In r11 = r4.A06;
                    C353628Il r12 = r4.A05;
                    int i18 = C353648In.A00;
                    r12.AQA();
                    try {
                        String path4 = r11.A00(r12, (File) null, str, i7, i8).getPath();
                        0qQ.A07(path4);
                        return new DownloadedTrack(path4, i7, i8);
                    } catch (IOException | IllegalStateException e2) {
                        0wb.A06("AudioDownloadingUtil", "downloadTrack failed", e2);
                        String str92 = musicAssetModel2.A0E;
                        0qQ.A07(str92);
                        return r4.A01(str, str92);
                    }
                }
            } else {
                String str10 = musicAssetModel2.A0E;
                0qQ.A07(str10);
                return r4.A01(str, str10);
            }
        } catch (IOException e3) {
            0wb.A06("TrackDownloader", "downloadTrack failed", e3);
            if (!z) {
                return A00(musicAssetModel2, r4, str, i3, i4, true);
            }
            return null;
        } catch (Throwable th4) {
            query.close();
            A002.A00();
            throw th4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009a, code lost:
        if (r3.exists() == true) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b4, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.instagram.music.common.model.DownloadedTrack A01(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            X.8Il r4 = r9.A05
            r4.AQ8()
            com.instagram.common.session.UserSession r5 = r9.A02
            X.0Tu r6 = X.0Tu.A05
            r0 = 36327387440363916(0x810f910000398c, double:3.036924323709666E-306)
            boolean r0 = X.182.A06(r6, r5, r0)
            r3 = 0
            if (r0 == 0) goto L_0x004e
            android.content.Context r0 = r9.A04     // Catch:{ IOException | IllegalStateException -> 0x0093 }
            X.2Nn r1 = X.AnonymousClass830.A00(r0, r5)     // Catch:{ IOException | IllegalStateException -> 0x0093 }
            boolean r0 = r1.A02()     // Catch:{ IOException | IllegalStateException -> 0x0093 }
            if (r0 == 0) goto L_0x0046
            java.io.File r2 = r1.A03     // Catch:{ IOException | IllegalStateException -> 0x0093 }
            java.lang.String r1 = "audio-"
            java.lang.String r0 = "-audio.mp4"
            java.lang.String r0 = X.002.A0g(r1, r11, r0)     // Catch:{ IOException | IllegalStateException -> 0x0093 }
            java.io.File r8 = new java.io.File     // Catch:{ IOException | IllegalStateException -> 0x0093 }
            r8.<init>(r2, r0)     // Catch:{ IOException | IllegalStateException -> 0x0093 }
            r0 = 36327387441084823(0x810f91000b3997, double:3.0369243241655706E-306)
            boolean r0 = X.182.A06(r6, r5, r0)     // Catch:{ IOException | IllegalStateException -> 0x0093 }
            if (r0 == 0) goto L_0x0092
            long r6 = r8.length()     // Catch:{ IOException | IllegalStateException -> 0x0093 }
            r1 = 21
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0092
            goto L_0x004e
        L_0x0046:
            java.lang.String r1 = "Check failed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException | IllegalStateException -> 0x0093 }
            r0.<init>(r1)     // Catch:{ IOException | IllegalStateException -> 0x0093 }
            throw r0     // Catch:{ IOException | IllegalStateException -> 0x0093 }
        L_0x004e:
            X.16e r0 = X.AnonymousClass2hY.A09
            X.2hY r6 = r0.E1h(r10)
            X.1QT r1 = new X.1QT
            r1.<init>()
            X.1CE r0 = X.1CE.A08
            r1.A04 = r0
            X.1Fe r0 = X.1Fe.A02
            r1.A03 = r0
            X.1QU r2 = r1.A00()
            if (r3 != 0) goto L_0x0074
            java.lang.String r1 = "-audio"
            java.lang.String r0 = ".mp4"
            java.lang.String r0 = X.AnonymousClass457.A0D(r1, r0)
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
        L_0x0074:
            r4.AV1()
            X.14G r0 = X.14G.A03()     // Catch:{ IOException -> 0x00b5 }
            X.47Y r2 = r0.A08(r2, r6, r5)     // Catch:{ IOException -> 0x00b5 }
            X.1Qb r1 = r2.A02     // Catch:{ all -> 0x00ae }
            java.io.InputStream r0 = r1.AjD()     // Catch:{ all -> 0x00ae }
            X.0mb.A09(r3, r0)     // Catch:{ all -> 0x00ae }
            r4.CLw()     // Catch:{ all -> 0x00ae }
            r1.AJg()     // Catch:{ all -> 0x00ae }
            r2.close()     // Catch:{ IOException -> 0x00b5 }
            goto L_0x009c
        L_0x0092:
            r3 = r8
        L_0x0093:
            r1 = 1
            if (r3 == 0) goto L_0x004e
            boolean r0 = r3.exists()
            if (r0 != r1) goto L_0x004e
        L_0x009c:
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.String r2 = r3.getPath()
            X.0qQ.A07(r2)
            r1 = -1
            com.instagram.music.common.model.DownloadedTrack r0 = new com.instagram.music.common.model.DownloadedTrack
            r0.<init>(r2, r1, r1)
            return r0
        L_0x00ae:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ IOException -> 0x00b5 }
            throw r0     // Catch:{ IOException -> 0x00b5 }
        L_0x00b5:
            r2 = move-exception
            r0 = 358(0x166, float:5.02E-43)
            java.lang.String r1 = X.Pxd.A00(r0)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353638Im.A01(java.lang.String, java.lang.String):com.instagram.music.common.model.DownloadedTrack");
    }
}
