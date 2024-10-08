package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.Map;

public final class ICA implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    public ICA(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.A00 = i;
        this.A04 = z;
        this.A03 = obj3;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void onClick(View view) {
        int A05;
        int i;
        String pollId;
        Integer num;
        Integer num2;
        N49 n49;
        GVT gvt;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                A05 = AnonymousClass0fD.A05(533216045);
                TextView textView = (TextView) this.A03;
                if (textView.getSelectionStart() == -1 && textView.getSelectionEnd() == -1 && (pollId = ((C272034jz) this.A02).getPollId()) != null) {
                    ((0sL) this.A01).invoke(pollId, Boolean.valueOf(this.A04));
                }
                i = 1725156456;
                break;
            case 1:
                A05 = AnonymousClass0fD.A05(-770741955);
                H0C h0c = (H0C) this.A03;
                if (h0c.A00) {
                    LRr.A01(h0c.requireActivity(), (H3S) this.A01, AnonymousClass7TE.A0l(h0c.A02), (1Xj) this.A02, (C62320sa) null);
                    C358148aR r4 = (C358148aR) h0c.A01.getValue();
                    if (this.A04) {
                        num = AnonymousClass05K.A0C;
                    } else {
                        num = AnonymousClass05K.A0N;
                    }
                    Integer num3 = AnonymousClass05K.A00;
                    0qQ.A0B(num, 0);
                    C358148aR.A00(r4, num, (Integer) null, num3, (Long) null, "cutout_save_button_clicked");
                } else {
                    K5R A002 = C63128Krw.A00(AnonymousClass05K.A00, false);
                    C309516Yo A0N = DbX.A0N(h0c.requireActivity(), h0c.A02);
                    A0N.A09();
                    A0N.A0D(A002);
                    A0N.A0A = AnonymousClass000.A00(1259);
                    A0N.A04();
                    C358148aR.A01((C358148aR) h0c.A01.getValue(), "attribution_upsell_create_button_clicked");
                }
                DbZ.A15(h0c);
                i = -1163821531;
                break;
            case 2:
                A05 = AnonymousClass0fD.A05(114405569);
                boolean z = this.A04;
                if (z) {
                    C59847JaN A003 = JW1.A00((UserSession) this.A03);
                    1QP r0 = A003.A0A;
                    long j = A003.A07;
                    AE4 ae4 = new AE4(r0);
                    ae4.A01 = j;
                    ae4.A04("MUSIC_TAPPED");
                }
                C66482MTk mTk = (C66482MTk) this.A01;
                AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) this.A02;
                if (z) {
                    num2 = AnonymousClass05K.A03;
                } else {
                    num2 = AnonymousClass05K.A1F;
                }
                mTk.Exg((C62642Kk4) null, (C371088xY) null, audioOverlayTrack, num2, (String) null, (Map) null);
                i = -66681661;
                break;
            default:
                A05 = AnonymousClass0fD.A05(-699626421);
                boolean z2 = this.A04;
                IO9 io9 = (IO9) this.A03;
                if (z2) {
                    JS8 js8 = io9.A0S;
                    gvt = io9.A0V;
                    FragmentActivity requireActivity = gvt.requireActivity();
                    String str3 = io9.A0Z;
                    n49 = (N49) this.A02;
                    js8.EKA(requireActivity, new C55645Hl4(n49, str3), io9.A0W);
                } else {
                    UserSession userSession = io9.A0R;
                    n49 = (N49) this.A02;
                    String str4 = n49.A00;
                    2EG r1 = 2EG.A0N;
                    gvt = io9.A0V;
                    0qQ.A0B(str4, 3);
                    SUL A0J = Dba.A0J((Context) this.A01, userSession, r1, str4);
                    A0J.A0E(userSession.A06);
                    A0J.A0S = "audio_page";
                    A0J.A0A();
                }
                UserSession userSession2 = io9.A0R;
                C54689HOu hOu = C54689HOu.A0X;
                C320506sU r11 = io9.A0Q;
                String str5 = io9.A0b;
                String str6 = io9.A0a;
                long j2 = io9.A0M;
                String str7 = io9.A0c;
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(gvt, userSession2), "instagram_organic_audio_page_spotify_button_tap");
                if (A0e.isSampled()) {
                    C51973G9u.A12(A0e, "audio_page", j2);
                    if (str7 == null) {
                        str7 = "";
                    }
                    C51965G9l.A1N(A0e, str7);
                    String str8 = null;
                    C51965G9l.A1E(A0e, C51972G9s.A0j(str5));
                    C51965G9l.A1H(A0e, C51972G9s.A0j(str6));
                    A0e.A8M(HOL.SONG, "audio_type");
                    C51973G9u.A11(A0e, r11);
                    A0e.A9F("audio_owner_id", C51972G9s.A0j(str6));
                    C51965G9l.A1C(hOu, A0e);
                    if (z2) {
                        str = "SPOTIFY_ADD";
                    } else {
                        str = "SPOTIFY_LISTEN";
                    }
                    A0e.AAJ("spotify_button_text", str);
                    if (n49 != null) {
                        str2 = n49.A00;
                    } else {
                        str2 = null;
                    }
                    A0e.AAJ("spotify_listen_url", str2);
                    if (n49 != null) {
                        str8 = n49.A01;
                    }
                    A0e.AAJ("spotify_track_id", str8);
                    A0e.Cgf();
                }
                i = -241345652;
                break;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
