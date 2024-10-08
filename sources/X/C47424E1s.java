package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import com.google.common.collect.ImmutableMap;
import com.instagram.android.R;
import com.instagram.igds.components.textcell.IgdsFooterCell;
import com.instagram.user.model.User;

/* renamed from: X.E1s  reason: case insensitive filesystem */
public final class C47424E1s extends AnonymousClass4DH {
    public static final ImmutableMap A02;
    public static final ImmutableMap A03;
    public static final String __redex_internal_original_name = "ProfileBroadcastChatNotificationsSettingsFragment";
    public User A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final String getModuleName() {
        return "broadcast_chat_notifications_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsFooterCell igdsFooterCell = (IgdsFooterCell) AnonymousClass7TF.A0F(view, R.id.profile_follow_sheet_footer);
        Context requireContext = requireContext();
        User user = this.A00;
        if (user != null) {
            String A0b = DbY.A0b(requireContext, user, 2131976233);
            0qQ.A07(A0b);
            igdsFooterCell.A00(A0b);
            ImmutableMap immutableMap = A03;
            User user2 = this.A00;
            if (user2 != null) {
                Number number = (Number) immutableMap.get(user2.A0H());
                if (number != null) {
                    ((CompoundButton) AnonymousClass7TF.A0F(view, number.intValue())).setChecked(true);
                    ((RadioGroup) AnonymousClass7TF.A0F(view, R.id.follow_sheet_radio_group)).setOnCheckedChangeListener(new FQU(this, 3));
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        }
        0qQ.A0F("displayedUser");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    static {
        Integer valueOf = Integer.valueOf(R.id.follow_sheet_all_notifications);
        Dc9 dc9 = Dc9.ALL;
        Integer valueOf2 = Integer.valueOf(R.id.follow_sheet_some_notifications);
        Dc9 dc92 = Dc9.SOME;
        Integer valueOf3 = Integer.valueOf(R.id.follow_sheet_no_notifications);
        Dc9 dc93 = Dc9.A04;
        A02 = ImmutableMap.of(valueOf, dc9, valueOf2, dc92, valueOf3, dc93);
        A03 = ImmutableMap.of(dc9, valueOf, dc92, valueOf2, dc93, valueOf3);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(752314272);
        C47424E1s.super.onCreate(bundle);
        User A0j = DbV.A0j(AnonymousClass7TE.A0l(this.A01), requireArguments().getString("ProfileLiveNotificationsSettingsFragment.ARG_DISPLAYED_USER_ID"));
        if (A0j != null) {
            this.A00 = A0j;
        }
        if (this.A00 == null) {
            0qQ.A0F("displayedUser");
            throw AnonymousClass00P.createAndThrow();
        } else {
            AnonymousClass0fD.A09(749338989, A022);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1355532423);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_profile_follow_sheet_multi_options_notifications, viewGroup, false);
        AnonymousClass0fD.A09(-929636458, A022);
        return inflate;
    }
}
