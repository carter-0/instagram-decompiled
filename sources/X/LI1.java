package X;

import android.app.Activity;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.UpcomingEvent;
import java.util.List;

public abstract class LI1 {
    public static final void A00(Activity activity, Location location, Uri uri, 28D r23, MediaUploadMetadata mediaUploadMetadata, UserSession userSession, CropInfo cropInfo, C3499582p r27, MediaCaptureConfig mediaCaptureConfig, PendingRecipient pendingRecipient, String str, String str2, int i, int i2, boolean z, boolean z2) {
        Activity activity2 = activity;
        0qQ.A0B(activity2, 0);
        28D r9 = r23;
        UserSession userSession2 = userSession;
        C51969G9p.A1O(userSession2, 1, r9);
        int i3 = i2;
        if (i3 == 1) {
            JW1.A00(userSession2).A06(r9, 1, false);
        }
        String str3 = str;
        Uri uri2 = uri;
        Location location2 = location;
        MediaUploadMetadata mediaUploadMetadata2 = mediaUploadMetadata;
        CropInfo cropInfo2 = cropInfo;
        C3499582p r12 = r27;
        MediaCaptureConfig mediaCaptureConfig2 = mediaCaptureConfig;
        PendingRecipient pendingRecipient2 = pendingRecipient;
        int i4 = i3;
        AnonymousClass36U A00 = AnonymousClass36R.A00(activity2, userSession2, new C65136Lny(activity2, location2, uri2, r9, mediaUploadMetadata2, cropInfo2, r12, mediaCaptureConfig2, pendingRecipient2, str3, str2, i4, i, z, z2));
        AnonymousClass36W r7 = AnonymousClass36W.FOLLOWERS_SHARE;
        AnonymousClass36U.A03((Bundle) null, EXF.A0a, A00, new MediaCaptureConfig(new JWU(r7)), r7, (UpcomingEvent) null, (String) null, (List) null, -1, 10001, false, false);
    }

    public static final void A01(Activity activity, 28D r14, UserSession userSession, C3499582p r16, int i) {
        PendingRecipient pendingRecipient;
        Boolean bool;
        MediaCaptureConfig mediaCaptureConfig;
        String str;
        Activity activity2 = activity;
        C3499582p r5 = r16;
        C51973G9u.A1E(activity, userSession, r5);
        C3499682q r1 = r5.A00;
        List list = null;
        if (r1 != null) {
            CreationSession creationSession = ((JWE) r1).A01;
            pendingRecipient = creationSession.A0B;
            bool = Boolean.valueOf(creationSession.A0L);
        } else {
            pendingRecipient = null;
            bool = null;
        }
        AnonymousClass36U A00 = AnonymousClass36R.A00(activity, userSession, new C65135Lnx(activity2, r14, r5, pendingRecipient, bool));
        AnonymousClass36W r6 = AnonymousClass36W.FOLLOWERS_SHARE;
        JWU jwu = new JWU(r6);
        jwu.A09 = false;
        jwu.A0A = false;
        if (r1 != null) {
            mediaCaptureConfig = ((JWE) r1).A01.A09;
            if (mediaCaptureConfig != null) {
                MusicAttributionConfig musicAttributionConfig = mediaCaptureConfig.A00;
                if (musicAttributionConfig != null) {
                    jwu.A00 = musicAttributionConfig;
                }
                boolean z = mediaCaptureConfig.A04;
                if (Boolean.valueOf(z) != null) {
                    jwu.A04 = z;
                }
            }
        } else {
            mediaCaptureConfig = null;
        }
        MediaCaptureConfig mediaCaptureConfig2 = new MediaCaptureConfig(jwu);
        EXF exf = EXF.A0a;
        if (mediaCaptureConfig != null) {
            str = mediaCaptureConfig.A01;
            list = mediaCaptureConfig.A02;
        } else {
            str = null;
        }
        AnonymousClass36U.A03((Bundle) null, exf, A00, mediaCaptureConfig2, r6, (UpcomingEvent) null, str, list, -1, i, false, C51972G9s.A1Z(bool));
    }
}
