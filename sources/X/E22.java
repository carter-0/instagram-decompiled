package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.user.model.FriendshipStatus;
import com.instagram.user.model.User;

public final class E22 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "MuteSettingsFragment";
    public User A00;
    public C51921G7p A01;
    public final String A02 = "media_mute_sheet";
    public final AnonymousClass0eM A03 = C51796G2f.A00(this, 25);
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05 = C51796G2f.A00(this, 26);

    public static final void A01(E22 e22, Integer num) {
        E22 e222 = e22;
        UserSession A0l = AnonymousClass7TE.A0l(e22.A04);
        User user = e22.A00;
        if (user != null) {
            C49176Eqh.A00(e222, A0l, user, num, (String) null, DbS.A0t(e22.A03));
            C51921G7p g7p = e222.A01;
            if (g7p != null) {
                g7p.CjO(e222, num);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        FriendshipStatus B8F;
        Boolean CY1;
        FriendshipStatus B8F2;
        Boolean CY0;
        FriendshipStatus B8F3;
        Boolean CY2;
        View view2 = view;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0G = AnonymousClass7TF.A0G(view, R.id.posts_mute_row);
        AnonymousClass7TG.A0R(A0G, R.id.posts_mute_setting_row_label).setText(2131976246);
        IgdsSwitch igdsSwitch = (IgdsSwitch) AnonymousClass7TF.A0F(A0G, R.id.posts_mute_setting_row_switch);
        C47692EDb eDb = new C47692EDb(19, (Object) igdsSwitch, (Object) this, (Object) AnonymousClass05K.A01);
        User user = this.A00;
        boolean z = true;
        if (user == null || !user.A1s()) {
            z = false;
        }
        igdsSwitch.setChecked(z);
        igdsSwitch.A07 = new FdT(10, eDb, this);
        C48947Eml.A00(A0G, igdsSwitch);
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.stories_mute_row);
        AnonymousClass7TG.A0R(A0G2, R.id.stories_mute_setting_row_label).setText(2131976248);
        IgdsSwitch igdsSwitch2 = (IgdsSwitch) AnonymousClass7TF.A0F(A0G2, R.id.stories_mute_setting_row_switch);
        C47692EDb eDb2 = new C47692EDb(19, (Object) igdsSwitch2, (Object) this, (Object) AnonymousClass05K.A0C);
        User user2 = this.A00;
        boolean z2 = true;
        if (user2 == null || !user2.A1u()) {
            z2 = false;
        }
        igdsSwitch2.setChecked(z2);
        igdsSwitch2.A07 = new FdT(12, eDb2, this);
        C48947Eml.A00(A0G2, igdsSwitch2);
        View A0G3 = AnonymousClass7TF.A0G(view, R.id.notes_mute_row);
        AnonymousClass0eM r3 = this.A04;
        0lg A0L = AnonymousClass7TF.A0L(r3, 0);
        0Tu r2 = 0Tu.A05;
        if ((!182.A06(r2, A0L, 36316074496495521L) || !0qQ.A0K(182.A04(r2, A0L, 36879024449978601L), "CARDS")) && !AnonymousClass4AJ.A03(AnonymousClass7TE.A0l(r3))) {
            A0G3.setVisibility(8);
        } else {
            AnonymousClass7TG.A0R(A0G3, R.id.notes_mute_setting_row_label).setText(2131976244);
            IgdsSwitch igdsSwitch3 = (IgdsSwitch) AnonymousClass7TF.A0F(A0G3, R.id.notes_mute_setting_row_switch);
            C47692EDb eDb3 = new C47692EDb(19, (Object) igdsSwitch3, (Object) this, (Object) AnonymousClass05K.A0N);
            User user3 = this.A00;
            boolean z3 = true;
            if (user3 == null || (B8F3 = user3.A03.B8F()) == null || (CY2 = B8F3.CY2()) == null || !CY2.booleanValue()) {
                z3 = false;
            }
            igdsSwitch3.setChecked(z3);
            igdsSwitch3.A07 = new FdT(11, eDb3, this);
            C48947Eml.A00(A0G3, igdsSwitch3);
        }
        View A0G4 = AnonymousClass7TF.A0G(view, R.id.content_notes_mute_row);
        if (182.A06(r2, AnonymousClass7TF.A0L(r3, 0), 36320652933145298L) || 182.A06(r2, AnonymousClass7TF.A0L(r3, 0), 36320652933997272L)) {
            AnonymousClass7TG.A0R(A0G4, R.id.content_notes_mute_setting_row_label).setText(2131976236);
            IgdsSwitch igdsSwitch4 = (IgdsSwitch) AnonymousClass7TF.A0F(A0G4, R.id.content_notes_mute_setting_row_switch);
            User user4 = this.A00;
            boolean z4 = true;
            if (user4 == null || (B8F = user4.A03.B8F()) == null || (CY1 = B8F.CY1()) == null || !CY1.booleanValue()) {
                z4 = false;
            }
            igdsSwitch4.setChecked(z4);
            igdsSwitch4.A07 = new FdS(this, 18);
            C48947Eml.A00(A0G4, igdsSwitch4);
        } else {
            A0G4.setVisibility(8);
        }
        View A0G5 = AnonymousClass7TF.A0G(view, R.id.friend_map_mute_row);
        boolean z5 = false;
        if (AnonymousClass3HF.A05(AnonymousClass7TE.A0l(r3), false)) {
            DbU.A0G(A0G5, R.id.friend_map_mute_setting_row_label).setText(2131976240);
            IgdsSwitch igdsSwitch5 = (IgdsSwitch) A0G5.requireViewById(R.id.friend_map_mute_setting_row_switch);
            User user5 = this.A00;
            if (!(user5 == null || (B8F2 = user5.A03.B8F()) == null || (CY0 = B8F2.CY0()) == null || !CY0.booleanValue())) {
                z5 = true;
            }
            igdsSwitch5.setChecked(z5);
            igdsSwitch5.A07 = new FdS(this, 19);
            C48947Eml.A00(A0G5, igdsSwitch5);
        } else {
            A0G5.setVisibility(8);
        }
        if (182.A06(0Tu.A06, AnonymousClass7TF.A0L(r3, 0), 36321610709345883L)) {
            User user6 = this.A00;
            if (user6 == null || user6.A03.Ccd() == null) {
                07U r10 = 07U.A05;
                AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
                AnonymousClass7TE.A1Z(new MHL(viewLifecycleOwner, view2, r10, this, (AnonymousClass4D7) null, 35), AnonymousClass07a.A00(viewLifecycleOwner));
            } else {
                A00(view, this);
            }
        }
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.mute_sheet_subtext);
        Context context = C60960kU.A00;
        0qQ.A07(context);
        DbX.A13(context, A0R, 0lz.A00(context), 2131967912);
    }

    public final String getModuleName() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public static final void A00(View view, E22 e22) {
        FanClubInfoDict B3v;
        Boolean Ccd;
        IgdsListCell igdsListCell = (IgdsListCell) AnonymousClass7TF.A0F(view, R.id.stories_teaser_mute_setting_row);
        User user = e22.A00;
        if (!(user == null || (B3v = user.A03.B3v()) == null || B3v.getFanClubId() == null)) {
            0lg A0X = DbT.A0X(e22.A04);
            if (182.A06(DbS.A0J(A0X, 0), A0X, 36321610709345883L)) {
                boolean z = false;
                igdsListCell.setVisibility(0);
                igdsListCell.A06(2131976239);
                igdsListCell.setTextCellType(C69349Njo.TYPE_SWITCH);
                User user2 = e22.A00;
                if (!(user2 == null || (Ccd = user2.A03.Ccd()) == null)) {
                    z = Ccd.booleanValue();
                }
                igdsListCell.setChecked(z);
                igdsListCell.A0E(new FdT(13, igdsListCell, e22));
                return;
            }
        }
        igdsListCell.setVisibility(8);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1290277031);
        E22.super.onCreate(bundle);
        this.A00 = 17h.A00(AnonymousClass7TE.A0l(this.A04)).A02(DbS.A0t(this.A05));
        AnonymousClass0fD.A09(-1105498299, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(58435708);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_mute_sheet, viewGroup, false);
        AnonymousClass0fD.A09(44750186, A022);
        return inflate;
    }
}
