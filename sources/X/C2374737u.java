package X;

import android.content.Context;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.37u  reason: invalid class name and case insensitive filesystem */
public final class C2374737u implements 1ut {
    public final ShareType A00;

    public final /* bridge */ /* synthetic */ AnonymousClass1QX AEQ(Context context, 28D r20, MediaUploadMetadata mediaUploadMetadata, UserSession userSession, ShareType shareType, Object obj, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Context context2 = context;
        0qQ.A0B(context2, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        String str8 = str;
        0qQ.A0B(str8, 4);
        0qQ.A0B(str2, 5);
        0qQ.A0B(str3, 6);
        ShareType shareType2 = shareType;
        0qQ.A0B(shareType2, 9);
        MediaUploadMetadata mediaUploadMetadata2 = mediaUploadMetadata;
        0qQ.A0B(mediaUploadMetadata2, 12);
        if (shareType2 == ShareType.NAMETAG_SELFIE || shareType2 == ShareType.NAMETAG_BACKGROUND_IMAGE) {
            C16674UzA uzA = C16674UzA.NAMETAG;
            String A002 = 0qv.A00(context2);
            0qQ.A07(A002);
            28D r4 = r20;
            String str9 = str4;
            1NY A01 = C64193LTa.A01(r4, mediaUploadMetadata2, userSession2, uzA, str8, str9, A002, str6, (String) null, list, z, z2, z3, false);
            A01.A9m("upload_id", str8);
            if (shareType2 == ShareType.NAMETAG_BACKGROUND_IMAGE) {
                A01.A0C("is_background_image", 1);
            }
            return A01.A0N();
        }
        throw new IllegalStateException("Check failed.");
    }

    public final /* synthetic */ void DCv(AnonymousClass1XT r1, UserSession userSession, AnonymousClass3Q2 r3) {
    }

    public final K1X E1q(2ZL r4, UserSession userSession) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r4, 1);
        return new C64842Lj4(new 0bH(userSession), new C64596Leg()).A00(r4);
    }

    public final void E3L(UserSession userSession, AnonymousClass3Q2 r4, LFD lfd) {
        0qQ.A0B(r4, 1);
        0qQ.A0B(lfd, 2);
        lfd.A00(r4.A1C, r4, true);
        lfd.A01(r4);
    }

    public final 1Xj Dou(Context context, AnonymousClass1XT r19, UserSession userSession, AnonymousClass3Q2 r21) {
        User A2A;
        User A02;
        LFZ AKP;
        AnonymousClass1XT r1 = r19;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        Context context2 = context;
        0qQ.A0B(context2, 3);
        0qQ.A0C(r1, AnonymousClass000.A00(1638));
        1Xj r4 = ((K1X) r1).A00;
        if (!(r4 == null || (A2A = r4.A2A(userSession2)) == null || (A02 = 17h.A00(userSession2).A02(A2A.getId())) == null)) {
            16k BVO = A02.A03.BVO();
            ExtendedImageUrl A1n = r4.A1n(context2);
            if (BVO == null) {
                BVO = new 16k((ImageUrl) null, (ImageUrl) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (List) null);
            } else {
                ShareType shareType = this.A00;
                if (shareType == ShareType.NAMETAG_BACKGROUND_IMAGE) {
                    AKP = BVO.AKP();
                    AKP.A00 = A1n;
                } else if (shareType == ShareType.NAMETAG_SELFIE) {
                    AKP = BVO.AKP();
                    AKP.A01 = A1n;
                }
                BVO = AKP.A00();
            }
            A02.A03.Edz(BVO);
            17h.A00(userSession2).A03(A02);
            if (A1n != null) {
                1NK.A00().A0P(A1n);
            }
        }
        return r4;
    }

    public C2374737u(ShareType shareType) {
        this.A00 = shareType;
    }

    public final /* bridge */ /* synthetic */ Object AEc(AnonymousClass3Q2 r2) {
        return null;
    }
}
