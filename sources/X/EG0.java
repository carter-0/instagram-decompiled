package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.user.model.User;
import java.util.HashSet;

public final class EG0 extends C232222tE {
    public final C49447Evo A00;
    public final HashSet A01 = AnonymousClass7TE.A1F();

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        LayoutInflater layoutInflater2 = layoutInflater;
        AnonymousClass7TF.A1H(viewGroup, layoutInflater2);
        C46977DoV doV = new C46977DoV(DbU.A09(layoutInflater2, viewGroup, R.layout.new_release_notification_item, false));
        Context context = viewGroup.getContext();
        IgSimpleImageView igSimpleImageView = doV.A03;
        0qQ.A0A(context);
        Resources resources = viewGroup.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.alert_dialog_button_cell_height);
        int A0C = AnonymousClass7TE.A0C(resources);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        int i = -1;
        if (2Yu.A0L(context, R.attr.musicCreationShadowEnabled, false)) {
            i = 1;
        }
        igSimpleImageView.setImageDrawable(new GIH(context, (GJO) null, dimensionPixelSize, A0C, 0, 0, dimensionPixelSize2, i, false));
        return doV;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r9, C249703kE r10) {
        ImageUrl Arr;
        String str;
        String str2;
        User user;
        User user2;
        FYN fyn = (FYN) r9;
        C46977DoV doV = (C46977DoV) r10;
        AnonymousClass7TG.A1N(fyn, doV);
        TrackOrOriginalSoundSchema trackOrOriginalSoundSchema = fyn.A00;
        OriginalSoundData originalSoundData = trackOrOriginalSoundSchema.A00;
        TrackData trackData = trackOrOriginalSoundSchema.A01;
        IgSimpleImageView igSimpleImageView = doV.A03;
        String str3 = null;
        if (originalSoundData != null && (user2 = originalSoundData.A03) != null) {
            Arr = user2.Bh3();
        } else if (trackData == null || (Arr = trackData.Arr()) == null) {
            throw AnonymousClass7TE.A0y();
        }
        JYP.A00(igSimpleImageView, Arr);
        TextView textView = doV.A02;
        if (originalSoundData == null || (str = originalSoundData.A0M) == null) {
            if (trackData != null) {
                str = trackData.getTitle();
            } else {
                str = null;
            }
        }
        textView.setText(str);
        TextView textView2 = doV.A01;
        if (originalSoundData != null && (user = originalSoundData.A03) != null) {
            str3 = user.getUsername();
        } else if (trackData != null) {
            str3 = trackData.getDisplayArtist();
        }
        textView2.setText(str3);
        FPE.A01(doV.itemView, 3, fyn, this);
        FPE.A01(doV.A00, 4, fyn, this);
        String A002 = fyn.getKey();
        HashSet hashSet = this.A01;
        if (!hashSet.contains(A002)) {
            C49447Evo evo = this.A00;
            AnonymousClass2t9 r1 = evo.A00.A0A;
            0qQ.A0C(r1, C66579MXk.A00(23));
            int A02 = r1.A02(fyn.getKey());
            C49448Evp evp = ((C46760Dkn) evo.A01.A01.getValue()).A01;
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(evp.A00, evp.A01), AnonymousClass000.A00(158));
            if ((originalSoundData == null || (str2 = originalSoundData.A0I) == null) && (trackData == null || (str2 = trackData.getAudioAssetId()) == null)) {
                throw AnonymousClass7TE.A0y();
            }
            A0e.A9F(AnonymousClass000.A00(4501), DbV.A0q(str2));
            A0e.A8M(C279294yP.CLIPS, AnonymousClass000.A00(4550));
            A0e.A9F("audio_index", DbS.A0j(A02));
            A0e.Cgf();
            hashSet.add(A002);
        }
    }

    public final Class modelClass() {
        return FYN.class;
    }

    public EG0(C49447Evo evo) {
        this.A00 = evo;
    }
}
