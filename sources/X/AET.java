package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.music.common.model.InstagramAudioApplySource;
import java.util.List;

public abstract class AET {
    public static final boolean A00(Intent intent, FragmentActivity fragmentActivity, UserSession userSession, Integer num, boolean z) {
        28D r8;
        C391049sG r9;
        C56044Hrt A0C;
        Integer num2 = num;
        Intent intent2 = (Intent) intent.getParcelableExtra(C9852RiR.A00(num2));
        if (intent2 == null) {
            return false;
        }
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (z) {
            UserSession userSession2 = userSession;
            if (userSession != null) {
                int intValue = num2.intValue();
                if (intValue == 4) {
                    r8 = 28D.A2c;
                } else if (intValue != 0) {
                    if (intValue == 1) {
                        r8 = 28D.A5E;
                    } else if (intValue != 2) {
                        r8 = 28D.A5J;
                    } else {
                        r8 = 28D.A5F;
                    }
                } else if (0qQ.A0K(intent2.getAction(), "com.instagram.share.ADD_AUTO_CAPTURE_TO_REEL") && 182.A06(0Tu.A05, userSession2, 36320768895755089L)) {
                    r8 = 28D.A3a;
                } else if (!0qQ.A0K(intent2.getAction(), Pxd.A00(688)) || !182.A06(0Tu.A05, userSession2, 36320768896148308L)) {
                    r8 = 28D.A5H;
                } else {
                    r8 = 28D.A3b;
                }
                C365768ne A00 = C365768ne.A0A.A00();
                Integer num3 = AnonymousClass05K.A01;
                String A002 = AnonymousClass000.A00(559);
                if (num2 == num3) {
                    String stringExtra = intent2.getStringExtra(Pxd.A00(687));
                    if (stringExtra == null) {
                        return true;
                    }
                    String stringExtra2 = intent2.getStringExtra(A002);
                    InstagramAudioApplySource instagramAudioApplySource = InstagramAudioApplySource.THIRD_PARTY_APP;
                    String stringExtra3 = intent2.getStringExtra("attribution");
                    A0C = C250563lf.A0C(r8);
                    A0C.A0c = stringExtra;
                    A0C.A0J = stringExtra2;
                    A0C.A0A = instagramAudioApplySource;
                    A0C.A0F = stringExtra3;
                    A0C.A0q = true;
                } else if (num2 == AnonymousClass05K.A0C) {
                    Medium medium = A00.A03;
                    if (medium == null) {
                        return true;
                    }
                    String stringExtra4 = intent2.getStringExtra(A002);
                    if (r8 == 28D.A5F) {
                        r9 = C391049sG.BARCELONA_CLIPS;
                    } else {
                        r9 = C391049sG.UNKNOWN;
                    }
                    A0C = C250563lf.A0C(r8);
                    A0C.A0F = stringExtra4;
                    A0C.A0q = true;
                    MediaUploadMetadata mediaUploadMetadata = medium.A0G;
                    String str = medium.A0N;
                    String str2 = medium.A0X;
                    int i = medium.A0B;
                    int i2 = medium.A04;
                    A0C.A04 = new SharePlatformStickerClientModel(mediaUploadMetadata, r9, str, str2, 0.0f, 0.0f, i2, i, medium.A07, i, i2, true);
                } else {
                    UserSession userSession3 = userSession2;
                    FragmentActivity fragmentActivity3 = fragmentActivity2;
                    C250563lf.A0V(fragmentActivity3, r8, userSession3, intent2.getStringExtra("attribution"), intent2.getStringExtra("mwa_ac_templates_thumbnail_index"), intent2.getStringExtra("mwa_ac_templates_category"), A00.A09, false);
                    return true;
                }
                AnonymousClass6W8.A02(fragmentActivity2, A0C.A00(), userSession2, TransparentModalActivity.class, "clips_camera").A0C(fragmentActivity2);
                return true;
            }
        }
        C59689JTv.A06(fragmentActivity2, 2131967902);
        return false;
    }

    public static final boolean A01(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return A02(C365768ne.A0A.A00().A06, 182.A04(0Tu.A05, userSession, 36881150458855797L));
    }

    public static final boolean A02(String str, String str2) {
        List A0R = 00l.A0R(str2, new String[]{","}, 0);
        return !A0R.isEmpty() && str != null && str.length() != 0 && A0R.contains(str);
    }
}
