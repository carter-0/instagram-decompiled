package X;

import android.content.Context;
import com.instagram.api.schemas.SubmittedSubPostManageType;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class I0v {
    public final UserSession A00;

    public I0v(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final void A00(Context context, 1Xj r8, I0v i0v, boolean z) {
        String str;
        1Xj r3 = r8;
        if (r8 != null) {
            Object[] objArr = {r8.A2n()};
            boolean z2 = z;
            if (z) {
                str = "media/%s/enable_open_carousel/";
            } else {
                str = "media/%s/disable_open_carousel/";
            }
            String A06 = 0mp.A06(str, objArr);
            1NY A0a = AnonymousClass7TG.A0a(i0v.A00);
            Dba.A1H(A0a, A06);
            1OC A0M = A0a.A0M();
            A0M.A00 = new C61497KAc(0, r3, context, i0v, z2);
            1ES.A03(A0M);
        }
    }

    public final void A01(SubmittedSubPostManageType submittedSubPostManageType, 1P0 r9, String str, String str2, List list) {
        String str3;
        String A0k;
        String A002;
        List A18;
        if (str == null || (A18 = DbV.A18(str, "_")) == null) {
            str3 = null;
        } else {
            str3 = (String) 00k.A0J(A18);
        }
        1NY A0a = AnonymousClass7TG.A0a(this.A00);
        A0a.A0A("media/manage_submitted_sub_post/");
        A0a.A0O((15p) null, C54047GyW.class, C56213Hug.class, false);
        A0a.A9m("manage_type", submittedSubPostManageType.A00);
        if (list != null) {
            if (list.size() > 1 || submittedSubPostManageType != SubmittedSubPostManageType.DELETE) {
                A0k = C51970G9q.A0k(list);
                A002 = AnonymousClass000.A00(3569);
            } else {
                A0k = (String) 00k.A0J(list);
                A002 = "media_id";
            }
            A0a.A9m(A002, A0k);
        }
        if (str3 != null) {
            A0a.A9m("parent_media_id", str3);
        }
        if (submittedSubPostManageType == SubmittedSubPostManageType.BULK_ACCEPT || submittedSubPostManageType == SubmittedSubPostManageType.ACCEPT) {
            A0a.A0C("camera_entry_point", 617);
            A0a.A9m(AnonymousClass000.A00(1238), str2);
        }
        1OC A0M = A0a.A0M();
        A0M.A00 = r9;
        1ES.A03(A0M);
    }

    public final void A02(1P0 r4, C54662HMt hMt, String str, String str2) {
        C51974G9v.A1K(str, hMt, r4);
        1NY A0b = AnonymousClass7TG.A0b(this.A00);
        A0b.A0A("feed/async_get_carousel_pending_children_for_parent/");
        A0b.A9m("parent_media_id", str);
        G9w.A1I(A0b, "filter_type", hMt.A01, str2);
        1OC A0S = DbU.A0S(A0b, C43822CEo.class, C45521Cxv.class);
        A0S.A00 = r4;
        1ES.A03(A0S);
    }
}
