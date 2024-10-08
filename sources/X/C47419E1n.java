package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import com.instagram.android.R;
import com.instagram.api.schemas.IGLiveNotificationPreference;
import com.instagram.igds.components.textcell.IgdsFooterCell;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.E1n  reason: case insensitive filesystem */
public final class C47419E1n extends AnonymousClass4DH {
    public static final SparseArray A01;
    public static final Map A02;
    public static final String __redex_internal_original_name = "ProfileLiveNotificationsSettingsFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return "live_video_notifications_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        User A0j = DbV.A0j(AnonymousClass7TE.A0l(this.A00), requireArguments().getString("ProfileLiveNotificationsSettingsFragment.ARG_DISPLAYED_USER_ID"));
        if (A0j != null) {
            String string = requireArguments().getString("ProfileLiveNotificationsSettingsFragment.CLICK_POINT", "following_sheet");
            String A0b = DbY.A0b(requireContext(), A0j, 2131976241);
            0qQ.A07(A0b);
            ((IgdsFooterCell) AnonymousClass7TF.A0F(view, R.id.profile_follow_sheet_footer)).A00(A0b);
            Map map = A02;
            Number number = (Number) map.get(A0j.A0A());
            if (number == null && (number = (Number) map.get(IGLiveNotificationPreference.DEFAULT)) == null) {
                throw AnonymousClass7TE.A0y();
            }
            ((CompoundButton) AnonymousClass7TF.A0F(view, number.intValue())).setChecked(true);
            ((RadioGroup) AnonymousClass7TF.A0F(view, R.id.follow_sheet_radio_group)).setOnCheckedChangeListener(new FQX(this, A0j, string));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    static {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(R.id.follow_sheet_all_notifications, IGLiveNotificationPreference.ALL);
        sparseArray.put(R.id.follow_sheet_some_notifications, IGLiveNotificationPreference.DEFAULT);
        sparseArray.put(R.id.follow_sheet_no_notifications, IGLiveNotificationPreference.A06);
        A01 = sparseArray;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            SparseArray sparseArray2 = A01;
            A1H.put(sparseArray2.valueAt(i), Integer.valueOf(sparseArray2.keyAt(i)));
        }
        A02 = A1H;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1109292034);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_profile_follow_sheet_multi_options_notifications, viewGroup, false);
        AnonymousClass0fD.A09(2134730071, A022);
        return inflate;
    }
}
