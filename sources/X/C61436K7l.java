package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;

/* renamed from: X.K7l  reason: case insensitive filesystem */
public final class C61436K7l extends AnonymousClass4DH implements C273414mX {
    public static final String __redex_internal_original_name = "BroadcastFollowStepBottomSheetFragment";
    public C313756gx A00;
    public MSH A01;
    public boolean A02;
    public String A03;
    public final AnonymousClass0eM A04 = JTQ.A0l(this, 45);
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final void Cyc() {
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        17i A0u = JTR.A0u(this.A05);
        String string = requireArguments().getString("arg_key_creator_user_id");
        String string2 = requireArguments().getString("arg_key_thread_id");
        User A022 = A0u.A02(string);
        if (A022 != null) {
            IgImageView A0b = DbX.A0b(view, R.id.follow_sheet_avatar);
            TextView A0R = AnonymousClass7TG.A0R(view, R.id.follow_sheet_title);
            TextView A0R2 = AnonymousClass7TG.A0R(view, R.id.follow_sheet_subtitle);
            View A0G = AnonymousClass7TF.A0G(view, R.id.follow_sheet_button);
            DbU.A1S(this, A0b, A022);
            DbX.A1F(A0R, this, A022.getUsername(), 2131954263);
            DbX.A1F(A0R2, this, A022.getUsername(), 2131954262);
            AnonymousClass0fU.A00(new C64250LXc(A0G, A022, this, string2, 0), A0G);
            OTV otv = (OTV) this.A04.getValue();
            otv.A00.markerPoint(31786177, "Follow_Prompt_Shown");
            OTV.A00(otv, 2);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void Cyf() {
        String str;
        boolean z = this.A02;
        if (!z) {
            C313756gx r3 = this.A00;
            if (r3 == null) {
                str = "broadcastLogger";
            } else {
                C69318NjJ njJ = C69318NjJ.UNSPECIFIED;
                String str2 = this.A03;
                if (str2 == null) {
                    str = "threadId";
                } else {
                    r3.A0G(njJ, str2, 0, z);
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1432256371);
        C61436K7l.super.onCreate(bundle);
        this.A03 = C320236s2.A01(requireArguments(), "arg_key_thread_id");
        this.A00 = C313746gw.A00(AnonymousClass7TE.A0l(this.A05));
        AnonymousClass0fD.A09(-1981117614, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1164867906);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.broadcast_follow_step_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-379269237, A022);
        return inflate;
    }
}
