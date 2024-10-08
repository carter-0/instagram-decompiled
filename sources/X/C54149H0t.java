package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.user.model.User;
import com.instagram.wonderwall.model.WallInfo;
import com.instagram.wonderwall.repository.WallPostComposerRepository;

/* renamed from: X.H0t  reason: case insensitive filesystem */
public final class C54149H0t extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "WallPostComposerFragment";
    public final C3515489h A00 = new IQC(C58704IwD.A01(this, 43));
    public final C3515289f A01 = new IQD(C59098J6g.A01(this, 13));
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(C58704IwD.A01(this, 39));
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = AnonymousClass1YB.A00(C58704IwD.A01(this, 41));
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(C58704IwD.A01(this, 42));
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final AnonymousClass0eM A07 = AnonymousClass1YB.A00(C58704IwD.A01(this, 48));
    public final String A08 = "wonder_wall_post_creation";

    public final void configureActionBar(2da r12) {
        String A0z;
        0qQ.A0B(r12, 0);
        r12.Eu4(true);
        AnonymousClass0eM r3 = this.A07;
        if (((WallInfo) r3.getValue()).A03) {
            A0z = getString(2131952389);
        } else {
            A0z = DbV.A0z(this, ((WallInfo) r3.getValue()).A00.getUsername(), 2131952404);
        }
        r12.setTitle(A0z);
        r12.Eiy(getString(2131952258), ID1.A00(this, 59));
        ((2dZ) this.A02.getValue()).ARb(0, ((C53321Gm7) G9w.A0c(this).A07.getValue()).A07);
        C327927Ct.A00(requireActivity(), r12.C7y(), AnonymousClass7TE.A0l(this.A06), "Wall Composer", 0sr.A1P(new String[]{"composer_action_media_enabled", "composer_action_reshare_enabled", "composer_action_music_enabled", "composer_action_gif_enabled", "gallery_video_enabled"}), C327917Cs.A00);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHK((Object) viewLifecycleOwner, (Object) r3, (Object) this, (AnonymousClass4D7) null, 28), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final String getModuleName() {
        return this.A08;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public C54149H0t() {
        C58704IwD A012 = C58704IwD.A01(this, 40);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, C58704IwD.A01(C58704IwD.A01(this, 45), 46));
        this.A03 = DbS.A0I(C58704IwD.A01(A002, 47), A012, C58687Ivw.A00((Object) null, A002, 3), DbS.A0z(C53029GhK.class));
    }

    public final boolean onBackPressed() {
        Object value;
        C55817Hnx hnx;
        User user;
        C285975Tl r8;
        AnonymousClass62P r7;
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        boolean z4;
        boolean z5;
        YBO ybo;
        String str3;
        C53029GhK A0c = G9w.A0c(this);
        WallPostComposerRepository wallPostComposerRepository = A0c.A03;
        String str4 = (String) wallPostComposerRepository.A09.getValue();
        Object value2 = wallPostComposerRepository.A08.getValue();
        AnonymousClass0Ud r1 = A0c.A07;
        if (((C53321Gm7) r1.getValue()).A0A && (str3 = ((C53321Gm7) r1.getValue()).A05) != null && str3.length() != 0) {
            A0c.A01();
            return true;
        } else if (str4.length() > 0 || value2 != null) {
            A0c.A02(false);
            05G r12 = A0c.A06;
            do {
                value = r12.getValue();
                C53321Gm7 gm7 = (C53321Gm7) value;
                hnx = new C55817Hnx();
                hnx.A03 = 2131960798;
                hnx.A02 = 2131976743;
                hnx.A00 = new C55745Hmg(G9w.A0b(2131956481), AnonymousClass05K.A0C, C58686Ivv.A00(A0c, 13));
                hnx.A01 = new C55745Hmg(G9w.A0b(2131954722), AnonymousClass05K.A00, C58528ItN.A00);
                hnx.A04 = C58686Ivv.A00(A0c, 14);
                user = gm7.A01;
                r8 = gm7.A00;
                YBO ybo2 = gm7.A03;
                r7 = gm7.A06;
                z = gm7.A07;
                str = gm7.A04;
                z2 = gm7.A0B;
                str2 = gm7.A05;
                z3 = gm7.A0A;
                z4 = gm7.A09;
                z5 = gm7.A08;
                0qQ.A0B(user, 0);
                AnonymousClass7TF.A1C(r8, 1, r7);
                0qQ.A0B(str, 5);
                ybo = ybo2;
            } while (!r12.AIY(value, new C53321Gm7(r8, user, hnx, ybo, str, str2, r7, z, z2, z3, z4, z5)));
            return true;
        } else {
            C53029GhK.A00(C57503Ibr.A00, A0c);
            return true;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(562228628);
        ComposeView A0H = DbV.A0H(this, C59346JFy.A00(this, 28), 2090348408);
        AnonymousClass0fD.A09(-1094608721, A022);
        return A0H;
    }
}
