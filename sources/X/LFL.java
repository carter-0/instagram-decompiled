package X;

import android.content.Intent;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import java.util.Map;

public final class LFL {
    public AudioOverlayTrack A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final MSA A03;
    public final C63624L0m A04 = new C63624L0m(this);
    public final C66482MTk A05;

    public final void A00(Intent intent) {
        if (intent.getBooleanExtra("extra_back_to_search", false)) {
            this.A05.Exg((C62642Kk4) null, (C371088xY) null, (AudioOverlayTrack) null, AnonymousClass05K.A0D, (String) null, (Map) null);
            return;
        }
        AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) intent.getParcelableExtra("extra_audio_track");
        this.A00 = audioOverlayTrack;
        this.A03.DtB(audioOverlayTrack);
        this.A05.dismiss();
    }

    public final void A01(View view, boolean z) {
        String str;
        AudioOverlayTrack audioOverlayTrack = this.A00;
        C66482MTk mTk = this.A05;
        C63624L0m l0m = this.A04;
        UserSession userSession = this.A02;
        0qQ.A0B(l0m, 3);
        View view2 = view;
        View findViewById = view2.findViewById(R.id.music_row_icon);
        View findViewById2 = view2.findViewById(R.id.music_track_row_icon);
        View A0b = AnonymousClass7TE.A0b(view2, R.id.music_row_title);
        View findViewById3 = view2.findViewById(R.id.music_row_subtitle);
        TextView A0B = DbW.A0B(view2, R.id.music_track_title);
        TextView A0B2 = DbW.A0B(view2, R.id.music_track_subtitle);
        View A0b2 = AnonymousClass7TE.A0b(view2, R.id.music_track_cross);
        View findViewById4 = view2.findViewById(R.id.music_row_chevron_icon);
        View findViewById5 = view2.findViewById(R.id.chevron_icon);
        String str2 = null;
        boolean z2 = z;
        if (audioOverlayTrack != null) {
            if (z) {
                if (findViewById2 != null) {
                    findViewById2.setVisibility(0);
                }
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            }
            A0b.setVisibility(8);
            if (findViewById3 != null) {
                findViewById3.setVisibility(8);
            }
            A0B.setVisibility(0);
            MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
            if (musicAssetModel != null) {
                str2 = musicAssetModel.A0I;
            }
            A0B.setText(str2);
            MusicAssetModel musicAssetModel2 = audioOverlayTrack.A08;
            if (musicAssetModel2 == null || (str = musicAssetModel2.A0D) == null) {
                A0B2.setVisibility(8);
            } else {
                A0B2.setText(str);
                A0B2.setVisibility(0);
            }
            if (findViewById4 != null) {
                findViewById4.setVisibility(8);
            }
            if (findViewById5 != null) {
                findViewById5.setVisibility(8);
            }
            A0b2.setVisibility(0);
            LYF.A01(A0b2, 6, l0m);
            0nA.A0n(A0b2, view2, R.dimen.abc_dialog_padding_top_material);
        } else {
            if (z) {
                if (findViewById != null) {
                    findViewById.setVisibility(0);
                }
                if (findViewById2 != null) {
                    findViewById2.setVisibility(8);
                }
                if (findViewById4 != null) {
                    findViewById4.setVisibility(0);
                }
            }
            A0b.setVisibility(0);
            if (findViewById3 != null) {
                findViewById3.setVisibility(0);
            }
            A0B.setVisibility(8);
            A0B2.setVisibility(8);
            if (findViewById5 != null) {
                findViewById5.setVisibility(0);
            }
            A0b2.setVisibility(8);
            view2.setTouchDelegate((TouchDelegate) null);
        }
        AnonymousClass0fU.A00(new ICA(2, mTk, audioOverlayTrack, userSession, z2), view2);
        2eS.A01(view2);
    }

    public LFL(AnonymousClass4DH r2, UserSession userSession, MSA msa, C66482MTk mTk) {
        AnonymousClass7TG.A1O(r2, mTk);
        this.A01 = r2;
        this.A05 = mTk;
        this.A03 = msa;
        this.A02 = userSession;
    }
}
