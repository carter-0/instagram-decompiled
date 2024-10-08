package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;

public final class Fe4 implements C51882G5u {
    public final /* synthetic */ FHD A00;
    public final /* synthetic */ boolean A01;

    public Fe4(FHD fhd, boolean z) {
        this.A00 = fhd;
        this.A01 = z;
    }

    public final void E2Z(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SELECTED_REEL_IDS");
        String string = bundle.getString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_PUSH_NOTIF_TYPE");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_STORY_MENTIONS_PRESELECTED_USER_IDS");
        boolean z = bundle.getBoolean("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SHOW_STORY_COMMENT_SHEET");
        if (AnonymousClass000.A00(2698).equals(string)) {
            1NY A0O = DbU.A0O(userSession);
            A0O.A0A("stories/birthday_highlights/birthday_highlights_media/");
            1OC A0S = DbT.A0S(A0O, C47293DuM.class, F45.class);
            EDV.A00(A0S, fragmentActivity, userSession, 11);
            1ES.A03(A0S);
        } else if (stringArrayList != null) {
            C309416Ye A0i = DbS.A0i();
            A0i.A0O = stringArrayList;
            A0i.A0Q = stringArrayList;
            DbY.A1R(A0i);
            A0i.A03(AnonymousClass3BQ.PUSH_NOTIFICATION);
            A0i.A0V = true;
            A0i.A0G = string;
            A0i.A02 = new AnonymousClass3BN();
            A0i.A0Z = this.A01;
            A0i.A0R = stringArrayList2;
            A0i.A0c = z;
            HashMap hashMap = (HashMap) bundle.getSerializable("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_MEDIA_REQUEST_PARAMS");
            if (hashMap != null) {
                A0i.A0S = hashMap;
            }
            HashMap hashMap2 = (HashMap) bundle.getSerializable("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_REEL_TO_REEL_ITEM_IDS_FILTER");
            if (hashMap2 != null) {
                A0i.A0T = hashMap2;
            }
            AnonymousClass3BU r0 = (AnonymousClass3BU) bundle.getSerializable(C273654mx.A00(498));
            if (r0 != null) {
                A0i.A05 = r0;
            }
            String string2 = bundle.getString("ReelViewerFragment.ARGUMENTS_KEY_OVERRIDE_STARTING_ITEM_ID_IN_FIRST_REEL");
            if (string2 != null) {
                if (A0i.A09 == null) {
                    A0i.A0L = string2;
                } else {
                    throw AnonymousClass7TE.A0z(C273654mx.A00(529));
                }
            }
            C309516Yo A0M = DbS.A0M(fragmentActivity, userSession);
            A0M.A0E(C18280Vp0.A01(A0i.A00()));
            A0M.A04();
        }
    }
}
