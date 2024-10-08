package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.7jt  reason: invalid class name and case insensitive filesystem */
public final class C339617jt extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "FanClubSubscribeInLiveBottomSheetFragment";
    public C339607js A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final String getModuleName() {
        return "fan_club_subscribe_in_live_bottom_sheet";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return (AnonymousClass0wW) this.A01.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-557134145);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.iglive_fan_club_subscribe_in_live_bottom_sheet, viewGroup, false);
        View requireViewById = inflate.requireViewById(R.id.subscribe_in_live_headline);
        0qQ.A07(requireViewById);
        IgdsHeadline igdsHeadline = (IgdsHeadline) requireViewById;
        Context context = inflate.getContext();
        igdsHeadline.setImageDrawable(context.getDrawable(R.drawable.ig_illustrations_illo_subscriber_crown_badge_refresh));
        igdsHeadline.A02 = true;
        igdsHeadline.setHeadline((CharSequence) context.getString(2131974599));
        igdsHeadline.setBody((CharSequence) context.getString(2131974598));
        View requireViewById2 = inflate.requireViewById(R.id.subscribe_in_live_setting_bottom_button);
        0qQ.A07(requireViewById2);
        ((C3021461u) requireViewById2).setPrimaryAction(context.getString(2131974597), new ANA(this));
        AnonymousClass0fD.A09(1662335975, A02);
        return inflate;
    }
}
