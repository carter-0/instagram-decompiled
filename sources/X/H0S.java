package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.android.R;

public final class H0S extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "WallFeedFragment";
    public View A00;
    public C331157Pu A01;
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(C58704IwD.A01(this, 20));
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final String A05 = "wonder_wall_feed";

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Object value = this.A03.getValue();
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MGL(viewLifecycleOwner, r3, value, this, (AnonymousClass4D7) null, 2), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final String getModuleName() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public H0S() {
        C58704IwD A012 = C58704IwD.A01(this, 21);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, C58704IwD.A01(C58704IwD.A01(this, 23), 24));
        this.A03 = DbS.A0I(C58704IwD.A01(A002, 25), A012, new MJ6(49, (Object) null, A002), DbS.A0z(C53047Ghf.class));
    }

    public final void configureActionBar(2da r11) {
        Dbb.A1I(r11);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A06 = R.drawable.instagram_photo_list_pano_outline_24;
        A0K.A05 = 2131952531;
        int i = 8;
        A0K.A08 = 8;
        A0K.A0G = ID1.A00(this, 57);
        View A0P = C51970G9q.A0P(A0K, r11);
        this.A00 = A0P;
        if (((C53379Gn9) ((C53047Ghf) this.A03.getValue()).A09.getValue()).A05) {
            i = 0;
        }
        A0P.setVisibility(i);
        C327927Ct.A00(requireActivity(), r11.C7y(), AnonymousClass7TE.A0l(this.A04), "WallFeed", 0sr.A1P(new String[]{"wall_to_wall_activity_enabled", "post_preview_reply_enabled", "wall_activity_timeline_enabled", "profile_header_tooltip_max_count"}), C327917Cs.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1395198474);
        ComposeView A0H = DbV.A0H(this, C59346JFy.A00(this, 25), 1228463928);
        AnonymousClass0fD.A09(34295017, A022);
        return A0H;
    }
}
