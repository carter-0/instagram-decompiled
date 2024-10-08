package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.dextricks.DexOptimization;
import com.instagram.android.R;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.List;

public final class K4F extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ClipsTrialNuxBottomSheetFragment";
    public C62320sa A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(C66296MMf.A00(this, 20));
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A00(0eO.A02, C66296MMf.A00(this, 21));
    public final String A04 = __redex_internal_original_name;

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        IgdsHeadline igdsHeadline = (IgdsHeadline) view2.findViewById(R.id.clips_trial_non_follower_headline);
        if (igdsHeadline != null) {
            igdsHeadline.setImageResource(R.drawable.ig_illustrations_illo_trial_reel_refresh);
            igdsHeadline.setHeadline(2131956010);
        }
        IgdsBulletCell igdsBulletCell = (IgdsBulletCell) view2.findViewById(R.id.clips_trial_non_follower_bullet_one);
        if (igdsBulletCell != null) {
            igdsBulletCell.setIcon((int) R.drawable.instagram_trial_reel_pano_outline_24);
            int i = 2131956008;
            if (JTU.A1U(DbT.A0X(this.A01))) {
                i = 2131956009;
            }
            igdsBulletCell.setText((Integer) null, Integer.valueOf(i));
        }
        IgdsBulletCell igdsBulletCell2 = (IgdsBulletCell) view2.findViewById(R.id.clips_trial_non_follower_bullet_two);
        if (igdsBulletCell2 != null) {
            igdsBulletCell2.setIcon((int) R.drawable.instagram_timer_pano_outline_24);
            igdsBulletCell2.setText((Integer) null, (Integer) 2131956007);
        }
        IgdsBulletCell igdsBulletCell3 = (IgdsBulletCell) view2.findViewById(R.id.clips_trial_non_follower_bullet_three);
        if (igdsBulletCell3 != null) {
            igdsBulletCell3.setIcon((int) R.drawable.instagram_user_circle_pano_outline_24);
            int i2 = 2131956023;
            if (JTU.A1U(DbT.A0X(this.A01))) {
                i2 = 2131956024;
            }
            igdsBulletCell3.setText((Integer) null, Integer.valueOf(i2));
        }
        AnonymousClass7TH.A0R(view2.findViewById(R.id.toggle_container));
        LSk A012 = LK1.A01(this, AnonymousClass7TE.A0l(this.A01), DbS.A0t(this.A02));
        ((C3021461u) AnonymousClass7TE.A0b(view2, R.id.clips_trial_settings_button_layout)).setPrimaryAction(getString(2131956164), LYG.A01(this, A012, 61));
        LSk.A02(LSk.A00((C46327Dbv) null, (Boolean) null, AnonymousClass7TE.A0v(), (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (List) null), A012, DexOptimization.OPT_KEY_CLIENT, "creation_education", "impression", (String) null);
    }

    public final String getModuleName() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1964980013);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_trial_bottomsheet, viewGroup, false);
        AnonymousClass0fD.A09(302711433, A022);
        return inflate;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, X.K4F, java.lang.Object, X.4DH] */
    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1187402484);
        super.onResume();
        MH9.A04(this, DbW.A0E(this), 27);
        AnonymousClass0fD.A09(-1868394519, A022);
    }
}
