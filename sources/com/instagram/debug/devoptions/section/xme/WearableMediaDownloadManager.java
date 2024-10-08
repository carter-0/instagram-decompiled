package com.instagram.debug.devoptions.section.xme;

import X.002;
import X.0KC;
import X.0oU;
import X.0qQ;
import X.19E;
import X.1ES;
import X.AnonymousClass05K;
import X.AnonymousClass12T;
import X.AnonymousClass3JY;
import X.AnonymousClass3JZ;
import X.AnonymousClass4D7;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C11211SFl;
import X.C227922kK;
import X.C239973Ja;
import X.C290815g0;
import X.C59730JVo;
import X.DbU;
import X.JTO;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.section.xme.L;
import com.instagram.debug.devoptions.section.xme.remotefiles.WearableMediaDownloadToolRemoteFiles;
import java.io.File;
import java.io.FileInputStream;
import java.lang.Thread;
import java.nio.channels.FileChannel;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class WearableMediaDownloadManager {
    public static final String COMMENT_FIELD_STELLA_VIDEO = "app=Meta View&device=Ray-Ban Stories&gid=6ba9ac5c-25bd-44a7-ba1c-0a00ff03ba02";
    public static final Companion Companion = new Object();
    public static final String MOCK_MEDIA_ID = "6ba9ac5c-25bd-44a7-ba1c-0a00ff03ba02";
    public static final String MODEL_FIELD_STELLA_PHOTO = "Ray-Ban Stories";
    public static final String TAG = "WearableMediaDownloadMediaSaver";
    public final Context context;
    public final String deviceNameSn;
    public final UserSession userSession;

    public enum MediaType {
        SN_PHOTO,
        SN_VIDEO,
        STELLA_PHOTO,
        STELLA_VIDEO;

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        /* access modifiers changed from: public */
        static {
            MediaType[] $values;
            $ENTRIES = 0oU.A00($values);
        }
    }

    public static final String getCommentFieldSnVideo(String str) {
        return Companion.getCommentFieldSnVideo(str);
    }

    public final void downloadFile(MediaType mediaType, boolean z) {
        C239973Ja r0;
        String str;
        int A02 = DbU.A02(mediaType, 0);
        if (A02 == 0) {
            r0 = WearableMediaDownloadToolRemoteFiles.SN_PHOTO;
        } else if (A02 == 1) {
            r0 = WearableMediaDownloadToolRemoteFiles.SN_VIDEO;
        } else if (A02 == 2) {
            r0 = WearableMediaDownloadToolRemoteFiles.STELLA_PHOTO;
        } else if (A02 == 3) {
            r0 = WearableMediaDownloadToolRemoteFiles.STELLA_VIDEO;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        AnonymousClass3JY r02 = ((AnonymousClass3JZ) r0).A00;
        0qQ.A07(r02);
        String str2 = r02.A02;
        if (A02 == 0) {
            str = this.deviceNameSn;
        } else if (A02 == 1) {
            str = Companion.getCommentFieldSnVideo(this.deviceNameSn);
        } else if (A02 != 2) {
            str = COMMENT_FIELD_STELLA_VIDEO;
        } else {
            str = MODEL_FIELD_STELLA_PHOTO;
        }
        C290815g0 A04 = C59730JVo.A04(this.context, this.userSession, new C11211SFl(str2, TAG, z, false, false), -1, true);
        A04.A00 = new WearableMediaDownloadManager$downloadFile$1(z, this, str);
        1ES.A03(A04);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.Q1d, java.lang.Object] */
    public final void writeExifCommentField(File file, String str) {
        File file2 = file;
        String str2 = str;
        AnonymousClass7TG.A1N(file, str);
        try {
            ThreadPoolExecutor A03 = new Object().A03(AnonymousClass05K.A01, (Thread.UncaughtExceptionHandler) null);
            WearableMediaDownloadManager$writeExifCommentField$tempFileProvider$1 wearableMediaDownloadManager$writeExifCommentField$tempFileProvider$1 = new WearableMediaDownloadManager$writeExifCommentField$tempFileProvider$1(this);
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            AnonymousClass7TE.A1Z(new WearableMediaDownloadManager$writeExifCommentField$1(mediaMetadataRetriever, file2, this, str2, A03, wearableMediaDownloadManager$writeExifCommentField$tempFileProvider$1, (AnonymousClass4D7) null), 19E.A02(AnonymousClass12T.A00.CO6(480314591, 3)));
        } catch (Exception e) {
            0KC.A0F(TAG, "Error saving video EXIF information", e);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0011 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
        static {
            /*
                com.instagram.debug.devoptions.section.xme.WearableMediaDownloadManager$MediaType[] r0 = com.instagram.debug.devoptions.section.xme.WearableMediaDownloadManager.MediaType.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.instagram.debug.devoptions.section.xme.WearableMediaDownloadManager$MediaType r0 = com.instagram.debug.devoptions.section.xme.WearableMediaDownloadManager.MediaType.SN_PHOTO     // Catch:{ NoSuchFieldError -> 0x000c }
                X.C66581MXm.A1N(r0, r1)     // Catch:{ NoSuchFieldError -> 0x000c }
            L_0x000c:
                com.instagram.debug.devoptions.section.xme.WearableMediaDownloadManager$MediaType r0 = com.instagram.debug.devoptions.section.xme.WearableMediaDownloadManager.MediaType.SN_VIDEO     // Catch:{ NoSuchFieldError -> 0x0011 }
                X.C51970G9q.A1M(r0, r1)     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                com.instagram.debug.devoptions.section.xme.WearableMediaDownloadManager$MediaType r0 = com.instagram.debug.devoptions.section.xme.WearableMediaDownloadManager.MediaType.STELLA_PHOTO     // Catch:{ NoSuchFieldError -> 0x0016 }
                X.C66581MXm.A1O(r0, r1)     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                com.instagram.debug.devoptions.section.xme.WearableMediaDownloadManager$MediaType r0 = com.instagram.debug.devoptions.section.xme.WearableMediaDownloadManager.MediaType.STELLA_VIDEO     // Catch:{ NoSuchFieldError -> 0x001b }
                X.Pxf.A1J(r0, r1)     // Catch:{ NoSuchFieldError -> 0x001b }
            L_0x001b:
                $EnumSwitchMapping$0 = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.section.xme.WearableMediaDownloadManager.WhenMappings.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public final void copyFile(File file, File file2) {
        FileChannel channel = new FileInputStream(file).getChannel();
        FileChannel channel2 = JTO.A0t(file2).getChannel();
        try {
            channel.transferTo(0, channel.size(), channel2);
            channel.close();
            if (channel2 != null) {
                channel2.close();
            }
        } catch (Throwable th) {
            if (channel != null) {
                channel.close();
            }
            if (channel2 != null) {
                channel2.close();
            }
            throw th;
        }
    }

    private final String getFilePath(C239973Ja r2) {
        AnonymousClass3JY r0 = ((AnonymousClass3JZ) r2).A00;
        0qQ.A07(r0);
        return r0.A02;
    }

    public WearableMediaDownloadManager(AnonymousClass4DH r2, UserSession userSession2) {
        AnonymousClass7TG.A1O(r2, userSession2);
        this.userSession = userSession2;
        this.context = r2.requireContext();
        this.deviceNameSn = L.ig_rbs_hammerhead_attribution.external_device_name.getAndExpose(userSession2);
    }

    public final void writeExifImageFields(File file, String str) {
        AnonymousClass7TG.A1N(file, str);
        try {
            boolean z = C227922kK.A0N;
            C227922kK r2 = new C227922kK(file.getCanonicalPath());
            r2.A0P("Model", str);
            r2.A0P("ImageUniqueID", MOCK_MEDIA_ID);
            r2.A0O();
        } catch (Exception e) {
            0KC.A0F(TAG, "Error saving image EXIF information", e);
        }
    }

    public final class Companion {
        public final String getCommentFieldSnVideo(String str) {
            0qQ.A0B(str, 0);
            return 002.A0g("app=Meta View&device=", str, "&gid=6ba9ac5c-25bd-44a7-ba1c-0a00ff03ba02");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
