package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.mediatype.ProductType;
import com.instagram.model.reels.Reel;

public final class WAJ implements View.OnClickListener {
    public final /* synthetic */ DialogInterface.OnDismissListener A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ AnonymousClass6ZF A02;
    public final /* synthetic */ X4U A03;
    public final /* synthetic */ C19201WPh A04;
    public final /* synthetic */ AnonymousClass6ZG A05;
    public final /* synthetic */ AnonymousClass6ZB A06;
    public final /* synthetic */ AnonymousClass6ZC A07;
    public final /* synthetic */ CharSequence A08;

    public WAJ(DialogInterface.OnDismissListener onDismissListener, AnonymousClass0iw r2, AnonymousClass6ZF r3, X4U x4u, C19201WPh wPh, AnonymousClass6ZG r6, AnonymousClass6ZB r7, AnonymousClass6ZC r8, CharSequence charSequence) {
        this.A04 = wPh;
        this.A08 = charSequence;
        this.A00 = onDismissListener;
        this.A06 = r7;
        this.A07 = r8;
        this.A03 = x4u;
        this.A02 = r3;
        this.A05 = r6;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(1924865506);
        C19201WPh wPh = this.A04;
        CharSequence charSequence = this.A08;
        DialogInterface.OnDismissListener onDismissListener = this.A00;
        AnonymousClass6ZB r9 = this.A06;
        AnonymousClass6ZC r7 = this.A07;
        X4U x4u = this.A03;
        AnonymousClass6ZF r13 = this.A02;
        AnonymousClass6ZG r4 = this.A05;
        AnonymousClass0iw r12 = this.A01;
        C255773uh r10 = wPh.A0F;
        1Xj r6 = r10.A0b;
        Resources resources = wPh.A05;
        if (C13989Tnp.A1W(resources, charSequence, 2131961512)) {
            Bundle bundle = new Bundle();
            bundle.putString("edit_highlights_reel_id", r10.A0k);
            bundle.putBoolean("archive_multi_select_mode", true);
            bundle.putSerializable("highlight_management_source", JZV.A02(wPh.A0I));
            new AnonymousClass6W8(wPh.A04, bundle, wPh.A0B, ModalActivity.class, "manage_highlights").A0D(wPh.A06, 201);
        } else if (C13988Tno.A1X(resources, charSequence, 2131957604)) {
            W2A.A03(r12, r10, r13, wPh);
        } else if (C13989Tnp.A1W(resources, charSequence, 2131972033) || C13989Tnp.A1W(resources, charSequence, 2131972037)) {
            if (r6 != null) {
                Activity activity = wPh.A04;
                Reel reel = wPh.A0G.A0H;
                UserSession userSession = wPh.A0B;
                C64022LJj.A00(activity, onDismissListener, wPh.A08, userSession, r6, reel, wPh.A0I);
            }
        } else if (C13989Tnp.A1W(resources, charSequence, 2131973099)) {
            x4u.DjF(r10);
        } else if (wPh.A0R.contentEquals(charSequence)) {
            C19201WPh.A0F(wPh);
        } else if (wPh.A0O.contentEquals(charSequence)) {
            C19201WPh.A0D(wPh);
        } else if (r6 != null && (C13989Tnp.A1W(resources, charSequence, C305796Jo.A00(ProductType.STORY, false)) || C13989Tnp.A1W(resources, charSequence, 2131953965))) {
            1Yh A002 = C18138VmE.A00();
            UserSession userSession2 = wPh.A0B;
            AnonymousClass0iw r15 = wPh.A09;
            UserSession userSession3 = userSession2;
            A002.A07(wPh.A06, new C57016ILi(onDismissListener, 2), (PromoteLaunchOrigin) null, r15, userSession3, r6, r15.getModuleName(), (String) null, true);
        } else if (C13989Tnp.A1W(resources, charSequence, 2131963113)) {
            C13990Tnq.A1M(wPh);
        } else if (C13989Tnp.A1W(resources, charSequence, 2131970695)) {
            AnonymousClass6Z5.A09(r9.A00);
        } else if ("[INTERNAL] Pause Playback".contentEquals(charSequence)) {
            r7.A00.A17.EHY("user_paused_video");
        } else if ("[INTERNAL] Resume Playback".contentEquals(charSequence)) {
            G9w.A1O(r7.A00);
        } else if (wPh.A0S.contentEquals(charSequence)) {
            C19201WPh.A0H(wPh);
        } else {
            if (C13989Tnp.A1W(resources, charSequence, 2131953142)) {
                Reel reel2 = wPh.A0G.A0H;
                AnonymousClass6Z5 r62 = r4.A00;
                Fragment fragment = (Fragment) r62.A1A.get();
                if (!(fragment == null || fragment.getActivity() == null)) {
                    UserSession userSession4 = r62.A09;
                    if (userSession4 != null) {
                        AnonymousClass738.A09(new WNR(reel2, r62), userSession4, JTP.A0r(reel2));
                    }
                }
            } else if (C13989Tnp.A1W(resources, charSequence, 2131975841)) {
                Reel reel3 = wPh.A0G.A0H;
                AnonymousClass6Z5 r42 = r4.A00;
                Fragment fragment2 = (AnonymousClass4DH) r42.A1A.get();
                if (fragment2 != null) {
                    Context requireContext = fragment2.requireContext();
                    UserSession userSession5 = r42.A09;
                    if (userSession5 != null) {
                        new LG3(requireContext, fragment2.getParentFragmentManager(), AnonymousClass07i.A00(fragment2), fragment2, userSession5).A02(new WNZ(fragment2, reel3, r42));
                    }
                }
            }
            DbS.A17();
            throw AnonymousClass00P.createAndThrow();
        }
        wPh.A01 = null;
        C19201WPh.A0I(wPh, AnonymousClass7TG.A0m(charSequence, "", new StringBuilder()));
        AnonymousClass0fD.A0C(-1309295770, A052);
    }
}
