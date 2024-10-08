package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeStickerClientModel;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.ui.swipenavigation.PositionConfig;
import com.instagram.user.model.UpcomingEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.36U  reason: invalid class name */
public final class AnonymousClass36U implements AnonymousClass36V {
    public int A00;
    public File A01;
    public AnonymousClass36W A02 = AnonymousClass36W.FOLLOWERS_SHARE;
    public final Context A03;
    public final UserSession A04;
    public final AnonymousClass36P A05;

    public final void A04(Bundle bundle, EXF exf, AnonymousClass36W r15) {
        Bundle bundle2 = bundle;
        EXF exf2 = exf;
        A03(bundle2, exf2, this, new MediaCaptureConfig(new JWU(r15)), r15, (UpcomingEvent) null, (String) null, (List) null, -1, 10001, true, false);
    }

    public final void Ewb(EXF exf, AnonymousClass36W r14) {
        0qQ.A0B(exf, 1);
        A03((Bundle) null, exf, this, new MediaCaptureConfig(new JWU(r14)), r14, (UpcomingEvent) null, (String) null, (List) null, -1, 10001, true, false);
    }

    public final void Ewc(EXF exf, MediaCaptureConfig mediaCaptureConfig, AnonymousClass36W r15) {
        A03((Bundle) null, exf, this, mediaCaptureConfig, r15, (UpcomingEvent) null, (String) null, (List) null, -1, 10001, true, false);
    }

    public final void Ewp(Uri uri, 28D r17, String str, int i, int i2) {
        Uri uri2 = uri;
        0qQ.A0B(uri2, 0);
        Ewq(uri2, r17, (EXF) null, (AnonymousClass514) null, str, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, i, i2, false);
    }

    public final void Exl(Uri uri, 28D r8, String str, String str2, int i, boolean z) {
        0qQ.A0B(uri, 0);
        this.A00 = i;
        AnonymousClass14B.A03.A00();
        Intent intent = new Intent(this.A03, MediaCaptureActivity.class);
        intent.putExtra("videoFilePath", uri);
        intent.putExtra("mediaSource", i);
        intent.putExtra("cameraEntryPoint", r8);
        intent.putExtra("videoRectangleCrop", false);
        intent.putExtra("autoCenterCrop", false);
        intent.putExtra("sourceMediaId", str);
        intent.putExtra("linked_highlight_id", str2);
        intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", this.A04.A05);
        this.A05.ExB(intent, 10004);
    }

    public final void Exv(EXF exf, MediaCaptureConfig mediaCaptureConfig, AnonymousClass36W r15) {
        A03((Bundle) null, exf, this, mediaCaptureConfig, r15, (UpcomingEvent) null, (String) null, (List) null, 0, 10001, true, false);
    }

    public final void Exx(EXF exf, MediaCaptureConfig mediaCaptureConfig, AnonymousClass36W r15) {
        A03((Bundle) null, exf, this, mediaCaptureConfig, r15, (UpcomingEvent) null, (String) null, (List) null, 1, 10001, true, false);
    }

    private final void A01() {
        File file = this.A01;
        if (file != null && file.isFile() && !file.delete()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to delete ");
            sb.append(file);
            0KC.A0D("CaptureFlowHelper", sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0119, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.1zE.A00(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x011d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(android.net.Uri r42, com.instagram.creation.base.CreationSession r43, X.AnonymousClass36U r44, X.AnonymousClass3Q2 r45, com.instagram.pendingmedia.store.PendingMediaStore r46, java.lang.String r47, boolean r48) {
        /*
            r4 = r44
            com.instagram.common.session.UserSession r7 = r4.A04
            X.28D r0 = X.28D.A2d
            r14 = 0
            r6 = 0
            r1 = 1
            X.82Y r13 = new X.82Y
            r15 = r14
            r16 = r14
            r17 = r14
            r18 = r14
            r19 = r14
            r20 = r14
            r21 = r14
            r22 = r14
            r23 = r14
            r24 = r14
            r25 = r14
            r26 = r14
            r27 = r14
            r28 = r14
            r29 = r14
            r30 = r14
            r31 = r14
            r32 = r14
            r33 = r14
            r34 = r6
            r35 = r6
            r36 = r6
            r37 = r1
            r38 = r6
            r39 = r6
            r40 = r6
            r41 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r5 = r43
            X.82p r13 = X.JWD.A00(r0, r7, r5, r13)
            X.82q r0 = r13.A00()
            int r2 = r4.A00
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            r0.A02 = r2
            long r11 = java.lang.System.nanoTime()
            r10 = r45
            r3 = r46
            r8 = r47
            java.lang.String r0 = java.lang.String.valueOf(r11)
            if (r48 == 0) goto L_0x00cc
            X.3Q2 r2 = X.JZ1.A00(r0, r2)
            X.82q r9 = r13.A00()
            java.lang.String r1 = r10.A35
            int r0 = r4.A00
            X.JZ1.A05(r9, r2, r1, r8, r0)
            X.JYp r10 = X.C59796JYp.A01(r8, r6)
            X.0qQ.A07(r10)
            X.82q r8 = r13.A00()
            r6 = 1065353216(0x3f800000, float:1.0)
            r12 = 60000(0xea60, double:2.9644E-319)
            r9 = r2
            r11 = r6
            X.JZ1.A02(r7, r8, r9, r10, r11, r12)
            android.content.Context r1 = r4.A03
            com.instagram.pendingmedia.model.ClipInfo r0 = r2.A1N
            int r0 = r0.A09
            android.graphics.Point r8 = X.AEW.A01(r1, r7, r6, r0)
            java.io.File r6 = X.AnonymousClass457.A01()
            X.0Tu r4 = X.0Tu.A05
            r0 = 36609382108698468(0x82100a00091764, double:3.215258887465824E-306)
            long r0 = X.182.A01(r4, r7, r0)
            int r4 = (int) r0
            if (r4 != 0) goto L_0x00ab
            int r0 = r8.x
            int r4 = X.LTE.A00(r0)
        L_0x00ab:
            int r1 = r8.x
            int r0 = r8.y
            X.C64188LSv.A02(r2, r6, r1, r0, r4)
            java.lang.String r0 = r6.getCanonicalPath()
            r2.A33 = r0
            java.lang.String r0 = r2.A35
            r3.A0D(r2, r0)
            java.lang.String r1 = r2.A35
            com.instagram.creation.base.MediaSession r0 = r5.A07
            if (r0 == 0) goto L_0x00c6
            r0.EfV(r1)
        L_0x00c6:
            java.lang.String r0 = r2.A35
            r3.A0D(r2, r0)
            return
        L_0x00cc:
            r9 = 0
            X.3Q2 r2 = X.AnonymousClass9T3.A01(r0)
            java.lang.String r0 = r10.A3t
            r2.A3O = r0
            int r0 = r4.A00
            r2.A0K = r0
            android.content.Context r0 = r4.A03
            r10 = r42
            X.0qQ.A0B(r10, r1)
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ all -> 0x011e }
            java.io.InputStream r11 = r0.openInputStream(r10)     // Catch:{ all -> 0x011e }
            if (r11 != 0) goto L_0x00eb
            goto L_0x0120
        L_0x00eb:
            X.2kK r13 = new X.2kK     // Catch:{ all -> 0x0117 }
            r13.<init>((java.io.InputStream) r11)     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = "MakerNote"
            java.lang.String r12 = r13.A0N(r0)     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = "ImageDescription"
            java.lang.String r1 = r13.A0N(r0)     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = "Model"
            java.lang.String r0 = r13.A0N(r0)     // Catch:{ all -> 0x0117 }
            java.lang.String[] r0 = new java.lang.String[]{r12, r1, r0}     // Catch:{ all -> 0x0117 }
            X.0qQ.A0B(r0, r6)     // Catch:{ all -> 0x0117 }
            java.util.List r1 = X.03t.A0I(r0)     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = ""
            X.Kp0 r1 = X.C59737JVv.A01(r7, r0, r1)     // Catch:{ all -> 0x0117 }
            r11.close()     // Catch:{ all -> 0x011e }
            goto L_0x0121
        L_0x0117:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0119 }
        L_0x0119:
            r0 = move-exception
            X.1zE.A00(r11, r1)     // Catch:{ all -> 0x011e }
            throw r0     // Catch:{ all -> 0x011e }
        L_0x011e:
            r1 = r14
            goto L_0x0121
        L_0x0120:
            r1 = r14
        L_0x0121:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r2.A13
            if (r1 == 0) goto L_0x0129
            java.lang.String r9 = r1.A01()
        L_0x0129:
            r0.A03 = r9
            java.lang.String r0 = r10.toString()
            r5.A07(r8, r0, r6)
            com.instagram.creation.base.MediaSession r1 = r5.A07
            if (r1 == 0) goto L_0x013b
            int r0 = r4.A00
            r1.EdE(r0)
        L_0x013b:
            java.lang.String r0 = r2.A35
            if (r1 == 0) goto L_0x00c6
            r1.EfV(r0)
            goto L_0x00c6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36U.A02(android.net.Uri, com.instagram.creation.base.CreationSession, X.36U, X.3Q2, com.instagram.pendingmedia.store.PendingMediaStore, java.lang.String, boolean):void");
    }

    public static final void A03(Bundle bundle, EXF exf, AnonymousClass36U r17, MediaCaptureConfig mediaCaptureConfig, AnonymousClass36W r19, UpcomingEvent upcomingEvent, String str, List list, int i, int i2, boolean z, boolean z2) {
        AnonymousClass36U r8 = r17;
        AnonymousClass36W r10 = r19;
        r8.A02 = r10;
        EXF exf2 = exf;
        AnonymousClass9PJ.A00(r8.A04).A07(A00(exf2, r8), true);
        AnonymousClass6SR.A0Z = null;
        1Q9.A01("capture_flow_v2").A08();
        AnonymousClass6SR.A01().A0C = exf2.A00;
        Context context = r8.A03;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            C340587lV.A00(context.getApplicationContext(), (Handler) null, C3495180r.A00(context), false).BXP(new K06(bundle, exf2, r8, mediaCaptureConfig, r10, upcomingEvent, str, list, i, i2, packageManager.hasSystemFeature(Pxd.A00(186)), packageManager.hasSystemFeature(Pxd.A00(187)), z, z2));
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void DfL(Bundle bundle) {
        if (bundle != null) {
            if (bundle.getString("tempPhotoFile") != null) {
                this.A01 = new File(bundle.getString("tempPhotoFile"));
            }
            this.A02 = AnonymousClass36W.values()[bundle.getInt("captureType", 0)];
            ClassLoader classLoader = MediaCaptureConfig.class.getClassLoader();
            if (classLoader != null) {
                2YK.A00(bundle, classLoader);
                this.A00 = bundle.getInt("mediaSource");
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void E0k(AnonymousClass07i r54, 28D r55, String str, List list, List list2, List list3, int i, int i2) {
        AnonymousClass07i r13 = r54;
        0qQ.A0B(r13, 6);
        int i3 = i;
        this.A00 = i3;
        AnonymousClass36W r3 = AnonymousClass36W.FOLLOWERS_SHARE;
        JWU jwu = new JWU(r3);
        jwu.A01 = str;
        jwu.A02 = list3;
        MediaCaptureConfig mediaCaptureConfig = new MediaCaptureConfig(jwu);
        CreationSession creationSession = new CreationSession();
        creationSession.A0A = r3;
        creationSession.A09 = mediaCaptureConfig;
        UserSession userSession = this.A04;
        28D r12 = r55;
        C3499582p A002 = JWD.A00(r12, userSession, creationSession, new AnonymousClass82Y((C3499182k) null, (UserSession) null, (C357638Yz) null, (C3498682d) null, (C3498482b) null, (C3498382a) null, (C3499282m) null, (C3498882g) null, (C3498782e) null, (C3499382n) null, (ClipsCelebrationReshareViewModel) null, (AnonymousClass82f) null, (C2801950r) null, (SuperlativeStickerClientModel) null, (C3498982i) null, (C3498582c) null, (MusicAttributionConfig) null, (PendingRecipient) null, (C3499082j) null, (String) null, false, false, false, true, false, false, false, false));
        ((JWE) A002.A00()).A01.A02 = i3;
        List<Medium> list4 = list2;
        ArrayList arrayList = new ArrayList(list4);
        Context context = this.A03;
        C63136Ks4.A00(context, userSession, A002.A00(), arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Medium medium : list4) {
            arrayList2.add(new GalleryItem.LocalGalleryMedium(medium, String.valueOf(medium.A05)));
        }
        List list5 = list;
        if (arrayList2.size() == list5.size()) {
            C361558gQ A003 = C361538gO.A00(userSession);
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                1Xj r0 = (1Xj) list5.get(i4);
                String id = r0.getId();
                ImageUrl A1Q = r0.A1Q();
                if (!(id == null || A1Q == null)) {
                    boolean CeS = r0.CeS();
                    MediaUploadMetadata mediaUploadMetadata = new MediaUploadMetadata((ImmersiveMediaFields) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false);
                    A003.A02((Medium) list4.get(i4), new RemoteMedia(mediaUploadMetadata, A1Q, A1Q, (Integer) null, (Integer) null, (Integer) null, id, A1Q.getUrl(), (int) r0.A1B(), CeS, false, false));
                }
            }
        }
        JX1 jx1 = new JX1(context, r13, r12, userSession, (C273594mq) null, (JX2) null, A002, (C273514mi) null, (C267834cI) null, i2);
        float f = creationSession.A00;
        if (f == 0.0f) {
            f = 1.0f;
        }
        JX1 jx12 = jx1;
        jx12.A05(C279294yP.FEED, (L0A) null, (Integer) null, arrayList2, JWX.A00(userSession).A04, new HashMap(), f, false, false, false);
    }

    public final void Ewq(Uri uri, 28D r7, EXF exf, AnonymousClass514 r9, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, int i2, boolean z) {
        EXF exf2;
        int i3 = i;
        if (i3 == 3) {
            exf2 = EXF.A0Z;
        } else {
            exf2 = EXF.A09;
        }
        AnonymousClass6SR.A0Z = null;
        1Q9.A01("capture_flow_v2").A08();
        AnonymousClass6SR.A01().A0C = exf2.A00;
        this.A00 = i3;
        Context context = this.A03;
        Bundle bundle = new C49321Etc(context).A00;
        bundle.putParcelable("CropFragment.imageUri", uri);
        bundle.putInt(AnonymousClass000.A00(217), C249703kE.FLAG_MOVED);
        bundle.putInt("CropFragment.smallestDimension", 200);
        bundle.putInt("mediaSource", this.A00);
        AnonymousClass36W r1 = this.A02;
        bundle.putSerializable("captureType", r1);
        ClassLoader classLoader = MediaCaptureConfig.class.getClassLoader();
        if (classLoader != null) {
            2YK.A00(bundle, classLoader);
            bundle.putParcelable("captureConfig", new MediaCaptureConfig(new JWU(r1)));
            AnonymousClass14B.A03.A00();
            Intent intent = new Intent(context, MediaCaptureActivity.class);
            intent.putExtras(bundle);
            intent.putExtra("autoCenterCrop", z);
            intent.putExtra("sourceMediaId", str);
            intent.putExtra("cameraEntryPoint", r7);
            intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", this.A04.A05);
            intent.putExtra(AnonymousClass000.A00(370), str2);
            intent.putExtra("content_url", str3);
            if (str5 != null) {
                intent.putExtra("linked_highlight_id", str5);
            }
            List list2 = list;
            if (list != null) {
                intent.putStringArrayListExtra(AnonymousClass000.A00(1411), new ArrayList(list2));
            }
            if (str6 != null) {
                intent.putExtra("media_info", str6);
            }
            if (r9 != null) {
                intent.putExtra(AnonymousClass000.A00(1679), r9);
            }
            if (str4 != null) {
                intent.putExtra(AnonymousClass000.A00(504), str4);
            }
            this.A05.ExB(intent, i2);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        if ((i3 == 9 || i3 == 10001) && i4 == 2) {
            2ZS A002 = C71172bH.A00();
            if (A002 instanceof 2ZS) {
                2ZS r1 = A002;
                C240073Jm.A00 = true;
                r1.Enh(1QK.A0C);
                r1.FLD(new PositionConfig((AnonymousClass57C) null, (CameraConfiguration) null, (AnonymousClass3QO) null, C273654mx.A00(3271), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, false));
                return;
            }
            return;
        }
        if (i4 != -1) {
            A01();
            AnonymousClass6SR A012 = AnonymousClass6SR.A01();
            UserSession userSession = this.A04;
            if (A012.A0M) {
                A012.A05(userSession, "exit");
            } else if (A012.A0L) {
                A012.A04(userSession, "exit");
            }
            this.A05.Ctk(i3, this.A00);
            return;
        }
        Intent intent2 = intent;
        switch (i) {
            case 10001:
            case 10004:
                break;
            case 10002:
                if (intent != null) {
                    File file = this.A01;
                    if (file != null) {
                        Uri A013 = FFa.A01(intent2, file);
                        0qQ.A07(A013);
                        Ewp(A013, 28D.A5J, (String) null, 0, 10001);
                        break;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            case 10005:
                2ZS A003 = C71172bH.A00();
                if (A003 instanceof 2ZS) {
                    C240073Jm.A00 = true;
                    A003.Enh(1QK.A0E);
                    break;
                }
                break;
        }
        int i5 = this.A00;
        if (i5 == 0 || i5 == 2) {
            A01();
        }
        if (intent != null) {
            this.A05.CJ6(intent2);
        }
        this.A05.Ctl(i3, this.A00);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        File file = this.A01;
        if (file != null) {
            bundle.putString("tempPhotoFile", file.toString());
        }
        bundle.putInt("captureType", this.A02.ordinal());
        bundle.putInt("mediaSource", this.A00);
    }

    public AnonymousClass36U(Context context, UserSession userSession, AnonymousClass36P r4) {
        this.A03 = context;
        this.A05 = r4;
        this.A04 = userSession;
    }

    public static final 28D A00(EXF exf, AnonymousClass36U r1) {
        switch (exf.ordinal()) {
            case 4:
                return 28D.A2d;
            case 5:
                return 28D.A2i;
            case 6:
                return 28D.A2h;
            case 14:
                if (r1.A02 == AnonymousClass36W.PROFILE_PHOTO) {
                    return 28D.A37;
                }
                return 28D.A42;
            case 16:
                return 28D.A3w;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return 28D.A2n;
            case 19:
                return 28D.A4H;
            case 20:
                return 28D.A0h;
            case 23:
                return 28D.A4O;
            case 24:
                return 28D.A4L;
            case 25:
                return 28D.A4N;
            case 26:
                return 28D.A4M;
            case 27:
                return 28D.A4P;
            case 28:
                return 28D.A4Q;
            case 31:
                return 28D.A3I;
            default:
                return 28D.A5J;
        }
    }
}
