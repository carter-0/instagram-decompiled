package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel;
import java.util.ArrayList;
import java.util.Iterator;

public final class LRB {
    public C262204Co A00;
    public final Context A01;
    public final AnonymousClass4DH A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final C313666go A05;
    public final AnonymousClass0eM A06;

    public LRB(AnonymousClass4DH r7, UserSession userSession, C313666go r9) {
        0qQ.A0B(userSession, 2);
        this.A02 = r7;
        this.A04 = userSession;
        this.A05 = r9;
        C66302MMl mMl = new C66302MMl(this, 29);
        AnonymousClass0eM A012 = C66302MMl.A01(new C66302MMl(r7, 26), 0eO.A02, 27);
        this.A06 = DbS.A0I(new C66302MMl(A012, 28), mMl, C66304MMn.A01(A012, (Object) null, 45), DbS.A0z(IgLiveOptionsDialogViewModel.class));
        this.A01 = r7.requireContext();
        this.A03 = r7;
    }

    public static IgLiveOptionsDialogViewModel A00(Object obj) {
        return (IgLiveOptionsDialogViewModel) ((LRB) obj).A06.getValue();
    }

    public static final void A01(User user, MVW mvw, LRB lrb, boolean z) {
        long j;
        0Aj r3;
        String str;
        String str2;
        String str3;
        long j2;
        long j3;
        Long A0n;
        Long A0n2;
        User user2;
        String str4;
        String str5;
        long j4;
        long j5;
        String str6;
        Long A0n3;
        Long A0n4;
        User user3;
        String str7 = null;
        FH6.A03(lrb.A02.requireActivity(), lrb.A04, user, "ig_live_options_dialog_click_point");
        IgLiveOptionsDialogViewModel igLiveOptionsDialogViewModel = (IgLiveOptionsDialogViewModel) lrb.A06.getValue();
        if (z) {
            L7I l7i = igLiveOptionsDialogViewModel.A00;
            if (l7i != null) {
                String str8 = igLiveOptionsDialogViewModel.A06.A00;
                AnonymousClass0Ud r1 = igLiveOptionsDialogViewModel.A0C.A06;
                C61013JvD A0r = JTO.A0r(r1);
                if (A0r != null) {
                    str4 = A0r.A08;
                } else {
                    str4 = null;
                }
                C61013JvD A0r2 = JTO.A0r(r1);
                if (A0r2 == null || (user3 = A0r2.A05) == null) {
                    str5 = null;
                } else {
                    str5 = user3.getId();
                }
                C61013JvD A0r3 = JTO.A0r(r1);
                if (A0r3 != null) {
                    str7 = A0r3.A09;
                }
                Iterable A002 = IgLiveOptionsDialogViewModel.A00(igLiveOptionsDialogViewModel);
                ArrayList A0p = AnonymousClass7TF.A0p(A002);
                Iterator it = A002.iterator();
                while (it.hasNext()) {
                    DbY.A1W(A0p, it);
                }
                String id = user.getId();
                0qQ.A0B(str8, 0);
                r3 = AnonymousClass7TE.A0e(l7i.A01, "live_unfollow_generated");
                j = 0;
                if (str5 == null || (A0n4 = 00y.A0n(10, str5)) == null) {
                    j4 = 0;
                } else {
                    j4 = A0n4.longValue();
                }
                JTS.A17(r3, j4);
                if (str4 == null || (A0n3 = 00y.A0n(10, str4)) == null) {
                    j5 = 0;
                } else {
                    j5 = A0n3.longValue();
                }
                JTQ.A10(r3, j5);
                if (str7 == null) {
                    str7 = "0";
                }
                C51965G9l.A1I(r3, str7);
                C51969G9p.A1A(r3, l7i.A00);
                if (mvw != null) {
                    str6 = "comment_action_sheet";
                } else {
                    str6 = "header";
                }
                r3.AAJ("method", str6);
                r3.A9F("target_user_id", DbV.A0q(id));
                JTO.A1R(r3, str8);
                r3.AAe("current_guest_ids", A0p);
            } else {
                return;
            }
        } else {
            L7I l7i2 = igLiveOptionsDialogViewModel.A00;
            if (l7i2 != null) {
                String str9 = igLiveOptionsDialogViewModel.A06.A00;
                AnonymousClass0Ud r2 = igLiveOptionsDialogViewModel.A0C.A06;
                C61013JvD A0r4 = JTO.A0r(r2);
                if (A0r4 != null) {
                    str = A0r4.A08;
                } else {
                    str = null;
                }
                C61013JvD A0r5 = JTO.A0r(r2);
                if (A0r5 == null || (user2 = A0r5.A05) == null) {
                    str2 = null;
                } else {
                    str2 = user2.getId();
                }
                C61013JvD A0r6 = JTO.A0r(r2);
                if (A0r6 != null) {
                    str7 = A0r6.A09;
                }
                Iterable A003 = IgLiveOptionsDialogViewModel.A00(igLiveOptionsDialogViewModel);
                ArrayList A0p2 = AnonymousClass7TF.A0p(A003);
                Iterator it2 = A003.iterator();
                while (it2.hasNext()) {
                    DbY.A1W(A0p2, it2);
                }
                String id2 = user.getId();
                0qQ.A0B(str9, 0);
                if (mvw != null) {
                    str3 = "comment_action_sheet";
                } else if (str9.equals("viewer")) {
                    str3 = "header_action_sheet";
                } else {
                    str3 = "header";
                }
                r3 = AnonymousClass7TE.A0e(l7i2.A01, C273654mx.A00(2984));
                j = 0;
                if (str2 == null || (A0n2 = 00y.A0n(10, str2)) == null) {
                    j2 = 0;
                } else {
                    j2 = A0n2.longValue();
                }
                JTS.A17(r3, j2);
                if (str == null || (A0n = 00y.A0n(10, str)) == null) {
                    j3 = 0;
                } else {
                    j3 = A0n.longValue();
                }
                JTQ.A10(r3, j3);
                if (str7 == null) {
                    str7 = "0";
                }
                C51965G9l.A1I(r3, str7);
                C51969G9p.A1A(r3, l7i2.A00);
                r3.AAJ("method", str3);
                JTO.A1R(r3, str9);
                r3.AAe("current_guest_ids", A0p2);
                r3.A9F(C273654mx.A00(2390), 00y.A0n(10, id2));
            } else {
                return;
            }
        }
        if (mvw != null) {
            String pk = mvw.getPk();
            if (pk != null) {
                j = JTR.A0M(pk);
            }
            r3.A9F("c_pk", Long.valueOf(j));
        }
        r3.Cgf();
    }

    public final void A02() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass11O.A03(DbV.A0J(this.A02), MHB.A02(this, ((IgLiveOptionsDialogViewModel) this.A06.getValue()).A0I, 6));
        }
    }
}
