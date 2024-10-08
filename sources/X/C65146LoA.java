package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import java.util.Map;

/* renamed from: X.LoA  reason: case insensitive filesystem */
public final class C65146LoA implements C66482MTk {
    public C331157Pu A00;
    public String A01;
    public final Context A02;
    public final C65507LuV A03 = new C65507LuV(this, 1);
    public final UserSession A04;
    public final C3515289f A05;
    public final MSB A06;
    public final C62320sa A07;
    public final boolean A08;
    public final Activity A09;
    public final C3499682q A0A;
    public final AnonymousClass3Q2 A0B;

    public C65146LoA(Activity activity, Context context, UserSession userSession, C3499682q r7, C3515289f r8, MSB msb, AnonymousClass3Q2 r10, C62320sa r11, boolean z) {
        AnonymousClass7TF.A1B(context, 1, userSession);
        this.A02 = context;
        this.A04 = userSession;
        this.A09 = activity;
        this.A0B = r10;
        this.A0A = r7;
        this.A08 = z;
        this.A05 = r8;
        this.A06 = msb;
        this.A07 = r11;
        if (!AnonymousClass1GD.A03() && !JWB.A01(userSession)) {
            activity.getTheme().applyStyle(R.style.MusicCreationLightOverlayTheme, true);
        }
    }

    public final void Exg(C62642Kk4 kk4, C371088xY r25, AudioOverlayTrack audioOverlayTrack, Integer num, String str, Map map) {
        C3515589i r7;
        AnonymousClass2k4 r4;
        Integer num2 = num;
        0qQ.A0B(num2, 1);
        if (audioOverlayTrack == null) {
            UserSession userSession = this.A04;
            JTU.A1A(userSession, num2);
            int intValue = num2.intValue();
            if (intValue == 9) {
                r7 = C3515589i.POST_CAPTURE_AUDIO_BROWSE;
            } else if (intValue == 10) {
                r7 = C3515589i.POST_CAPTURE_AUDIO_BUTTON;
            } else if (intValue != 0) {
                r7 = null;
            } else {
                r7 = C3515589i.AUDIO_EDITOR_CHANGE_AUDIO;
            }
            if (this.A00 == null && !A00(this)) {
                ImmutableList A0H = JTS.A0H(AnonymousClass30D.A0D(userSession) ? 1 : 0);
                if (JWB.A01(userSession)) {
                    r4 = AnonymousClass2k4.NIGHT;
                } else {
                    r4 = AnonymousClass2k4.DEFAULT;
                }
                AnonymousClass80X r15 = AnonymousClass80X.POST_CAPTURE;
                String BUn = this.A05.BUn();
                MusicProduct musicProduct = MusicProduct.MUSIC_IN_FEED;
                0qQ.A0A(A0H);
                String str2 = this.A01;
                if (!this.A08 || str2 == null || 00l.A0W(str2)) {
                    str2 = null;
                }
                K6I A002 = LJS.A00(kk4, r7, r25, A0H, (ImmutableList) null, musicProduct, userSession, (MusicAttributionConfig) null, (MusicOverlaySearchTab) null, r15, BUn, (String) null, str2, map, false, false, false);
                A002.A03 = this.A03;
                this.A01 = null;
                C331127Pr A0e = DbX.A0e(userSession, true);
                A0e.A0x = true;
                A0e.A03 = 1.0f;
                A0e.A0O = r4;
                A0e.A0T = A002;
                this.A00 = A0e.A00().A03(this.A02, A002);
            }
        }
    }

    public static final boolean A00(C65146LoA loA) {
        if (!loA.A0B.A5i) {
            return false;
        }
        if (182.A06(0Tu.A06, loA.A04, 36313987142453592L)) {
            return false;
        }
        C358248ab A0Y = DbS.A0Y(loA.A02);
        A0Y.A09(2131952316);
        A0Y.A08(2131952315);
        A0Y.A0H((DialogInterface.OnClickListener) null, 2131968772);
        DbT.A1V(A0Y);
        return true;
    }

    public final void dismiss() {
        DbW.A1K(this.A00);
        this.A00 = null;
    }
}
