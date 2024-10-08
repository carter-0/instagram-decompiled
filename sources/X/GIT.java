package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import java.util.Set;

public final class GIT {
    public static final GIT A00 = new Object();

    public static final AnonymousClass4Ke A00(AudioOverlayTrack audioOverlayTrack) {
        MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
        if (musicAssetModel == null) {
            return null;
        }
        String str = musicAssetModel.A0D;
        0qQ.A07(str);
        String str2 = musicAssetModel.A0I;
        0qQ.A07(str2);
        return new AnonymousClass4Ke((C376489Ie) null, (C67061rp) null, str, str2, R.dimen.add_payment_bottom_sheet_row_subtitle_size, false, musicAssetModel.A0S, false, true, false, true, false, false, true);
    }

    public static final AnonymousClass4Ke A01(AudioOverlayTrack audioOverlayTrack) {
        MusicAssetModel musicAssetModel;
        if (audioOverlayTrack == null || (musicAssetModel = audioOverlayTrack.A08) == null) {
            return null;
        }
        String str = musicAssetModel.A0D;
        0qQ.A07(str);
        String str2 = musicAssetModel.A0I;
        0qQ.A07(str2);
        boolean z = musicAssetModel.A0S;
        Boolean bool = musicAssetModel.A08;
        0qQ.A07(bool);
        return new AnonymousClass4Ke((C376489Ie) null, (C67061rp) null, str, str2, R.dimen.add_payment_bottom_sheet_row_subtitle_size, false, z, bool.booleanValue(), true, true, false, false, false, false);
    }

    public final AnonymousClass4Ke A02(Context context, C267324bN r24, C67231sQ r25, UserSession userSession, 1Xj r27, MusicAssetModel musicAssetModel) {
        String str;
        GJR gjr;
        GJR gjr2;
        MusicInfo musicInfo;
        MusicInfo musicInfo2;
        boolean z;
        boolean z2;
        C67061rp AZY;
        C267324bN r4 = r24;
        1Xj r0 = r27;
        AnonymousClass7TG.A1O(r0, r4);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 5);
        AnonymousClass1dn musicMetadata = r0.A0C.getMusicMetadata();
        C67231sQ A0n = C51966G9m.A0n(r0);
        if (A0n == null || (AZY = A0n.AZY()) == null) {
            str = null;
        } else {
            str = AZY.getAdditionalAudioUsername();
        }
        MusicAssetModel musicAssetModel2 = musicAssetModel;
        if (musicAssetModel != null) {
            String str2 = musicAssetModel2.A0D;
            0qQ.A07(str2);
            String str3 = musicAssetModel2.A0I;
            0qQ.A07(str3);
            boolean z3 = musicAssetModel2.A0S;
            Boolean bool = musicAssetModel2.A08;
            0qQ.A07(bool);
            return new AnonymousClass4Ke((C376489Ie) null, (C67061rp) null, str2, str3, R.dimen.add_payment_bottom_sheet_row_subtitle_size, false, z3, bool.booleanValue(), true, true, true, false, false, false);
        }
        1Xj r2 = r4.A02;
        if (r2 != null) {
            gjr = C52076GDw.A00(r2);
        } else {
            gjr = null;
        }
        if (gjr != GJR.CLIPS || r25 == null || (r25.BUr() == null && r25.BZB() == null)) {
            Set set = C52076GDw.A01;
            1Xj r22 = r4.A02;
            if (r22 != null) {
                gjr2 = C52076GDw.A00(r22);
            } else {
                gjr2 = null;
            }
            if (00k.A0u(set, gjr2) && musicMetadata != null && (musicMetadata.BUr() != null || musicMetadata.BZB() != null)) {
                C2605946h A1O = r0.A1O();
                OriginalSoundDataIntf A1J = r0.A1J();
                if (A1O != null) {
                    musicInfo = A1O.A00;
                } else {
                    musicInfo = null;
                }
                String A04 = AnonymousClass3ZJ.A04(musicInfo, A1J);
                if (A1O != null) {
                    musicInfo2 = A1O.A00;
                } else {
                    musicInfo2 = null;
                }
                String A03 = AnonymousClass3ZJ.A03(musicInfo2, A1J);
                0qQ.A07(A03);
                if (A1O != null) {
                    z = A1O.A00.BUk().isExplicit();
                    z2 = A1O.Cdd();
                } else if (A1J != null) {
                    z = A1J.isExplicit();
                    z2 = A1J.AqB().isTrendingInClips();
                } else {
                    z = false;
                    z2 = false;
                }
                return new AnonymousClass4Ke(AnonymousClass3ZJ.A00(A1J), (C67061rp) null, A04, A03, R.dimen.add_payment_bottom_sheet_row_subtitle_size, false, z, z2, true, true, true, AnonymousClass3ZJ.A0D(userSession2, r0), C51971G9r.A1Y(r0), false);
            } else if (!r4.CcK() || str == null || str.length() == 0) {
                return null;
            } else {
                return new AnonymousClass4Ke((C376489Ie) null, (C67061rp) null, str, AnonymousClass7TF.A0d(context.getResources(), 2131969093), R.dimen.add_payment_bottom_sheet_row_subtitle_size, false, false, false, true, true, true, AnonymousClass3ZJ.A0D(userSession2, r4.A02), false, false);
            }
        } else {
            String A042 = AnonymousClass3ZJ.A04(r25.BUr(), r25.BZB());
            String A032 = AnonymousClass3ZJ.A03(r25.BUr(), r25.BZB());
            0qQ.A07(A032);
            return new AnonymousClass4Ke(AnonymousClass3ZJ.A00(r25.BZB()), r25.AZY(), A042, A032, R.dimen.add_payment_bottom_sheet_row_subtitle_size, false, AnonymousClass3ZJ.A0A(r25), AnonymousClass3ZJ.A0B(r25), true, true, true, AnonymousClass3ZJ.A0D(userSession2, r0), C263304Kd.A03(r25), false);
        }
    }
}
