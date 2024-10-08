package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.banyan.BanyanCoordinator;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

public final class EHN extends 2Cn {
    public final int A00;
    public final Object A01;

    public EHN(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        List<F2P> list;
        User user;
        ArrayList A0S;
        switch (this.A00) {
            case 0:
                ((DirectShareSheetFragment) this.A01).A0D = (AnonymousClass9B2) obj;
                return;
            case 1:
                C290645fe r1 = (C290645fe) obj;
                0qQ.A0B(r1, 0);
                LinkedHashMap A1H = AnonymousClass7TE.A1H();
                if (C290645fe.A00(r1)) {
                    synchronized (obj) {
                        C290695fo r2 = r1.A00.A0B;
                        LinkedHashMap linkedHashMap = r2.A02;
                        if (linkedHashMap.values().isEmpty()) {
                            r2.A00();
                        }
                        Collection values = linkedHashMap.values();
                        0qQ.A07(values);
                        list = 00k.A0a(values);
                    }
                } else {
                    C290695fo r22 = r1.A00.A0B;
                    LinkedHashMap linkedHashMap2 = r22.A02;
                    if (linkedHashMap2.values().isEmpty()) {
                        r22.A00();
                    }
                    Collection values2 = linkedHashMap2.values();
                    0qQ.A07(values2);
                    list = 00k.A0a(values2);
                }
                for (F2P f2p : list) {
                    A1H.put(f2p.A01, f2p);
                }
                ((F2X) this.A01).A03.Epw(A1H);
                return;
            case 2:
                C290645fe r23 = (C290645fe) obj;
                0qQ.A0B(r23, 0);
                C74529PwO pwO = (C74529PwO) this.A01;
                0qQ.A0B(pwO, 0);
                if (C290645fe.A00(r23)) {
                    synchronized (obj) {
                        BanyanCoordinator.A03(pwO, r23.A00);
                    }
                    return;
                }
                BanyanCoordinator.A03(pwO, r23.A00);
                return;
            case 3:
                C290645fe r14 = (C290645fe) obj;
                0qQ.A0B(r14, 0);
                ((DirectShareSheetFragmentViewModel) this.A01).A01 = r14;
                return;
            case 4:
                C290645fe r142 = (C290645fe) obj;
                0qQ.A0B(r142, 0);
                EKD ekd = (EKD) this.A01;
                ekd.A06 = r142.A03("reshare_share_sheet");
                ekd.A01 = r142.A01("reshare_share_sheet").A02;
                boolean z = ekd.A0S;
                if (z && (user = ekd.A0O) != null) {
                    UserSession userSession = ekd.A0M;
                    0Tu r24 = 0Tu.A05;
                    if (DbY.A1Z(r24, userSession, 36315846863294052L) || DbY.A1Z(r24, userSession, 36315846863359589L)) {
                        List list2 = ekd.A01;
                        ArrayList A1C = AnonymousClass7TE.A1C();
                        for (Object next : list2) {
                            DbY.A1T(((DirectShareTarget) next).A0A(), user.getUsername(), next, A1C);
                        }
                        ekd.A01 = A1C;
                        List A1I = AnonymousClass7TE.A1I(C291165gf.A01(user, false, Double.valueOf(0.0d), (String) null));
                        int i = new int[]{ekd.A01.size(), 3}[0];
                        if (3 < i) {
                            i = 3;
                        }
                        boolean A002 = C48874Ela.A00(ekd.A0P);
                        List A0i = 00k.A0i(ekd.A01, C229632nm.A0C(0, i));
                        if (A002) {
                            A0S = 00k.A0S(A1I, A0i);
                        } else {
                            A0S = 00k.A0S(A0i, A1I);
                        }
                        ekd.A01 = A0S;
                    }
                }
                List list3 = ekd.A01;
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                for (Object next2 : list3) {
                    DbV.A1U(next2, A1C2, ((DirectShareTarget) next2).A0M() ? 1 : 0);
                }
                ekd.A01 = A1C2;
                if (AnonymousClass7TE.A1b(A1C2)) {
                    ekd.A01(ekd.A01.size());
                }
                UserSession userSession2 = ekd.A0M;
                boolean A1Y = DbV.A1Y(userSession2);
                boolean z2 = false;
                int i2 = new int[]{ekd.A01.size(), 4}[0];
                if (4 < i2) {
                    i2 = 4;
                }
                if (A1Y) {
                    for (int i3 = 0; i3 < i2; i3++) {
                        C251033mS A003 = C251033mS.A00(userSession2);
                        C250993mO A012 = C250993mO.A01(userSession2);
                        0qQ.A07(A012);
                        if (A012.A0A((DirectShareTarget) ekd.A01.get(i3), A003)) {
                            ekd.A00++;
                        }
                    }
                }
                if (ekd.A00 > 0) {
                    z2 = true;
                }
                ekd.A08 = z2;
                if (z) {
                    0Tu r25 = 0Tu.A06;
                    if (DbY.A1Z(r25, userSession2, 36315846863294052L) || DbY.A1Z(r25, userSession2, 36315846863359589L)) {
                        View A0b = AnonymousClass7TE.A0b(ekd.getContentView(), R.id.quick_send_popup_vertical_divider);
                        ViewGroup.MarginLayoutParams A0G = DbX.A0G(A0b);
                        if (ekd.A01.size() > 1) {
                            Activity activity = ekd.A0G;
                            A0G.setMarginStart(DbS.A03(activity.getResources(), R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
                            ekd.A0J.getLayoutParams().width += ((int) DbU.A00(activity, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding)) + DbS.A03(activity.getResources(), R.dimen.account_recs_header_image_margin);
                            A0b.setVisibility(0);
                        } else {
                            A0b.setVisibility(4);
                            A0G.setMarginStart(DbS.A03(ekd.A0G.getResources(), R.dimen.action_bar_item_spacing_left));
                        }
                    }
                }
                ekd.A03(ekd.A0H, ekd.A0I);
                return;
            case 5:
                C290645fe r143 = (C290645fe) obj;
                C49888FBo fBo = (C49888FBo) this.A01;
                fBo.A00 = r143;
                C46737DkQ dkQ = fBo.A02;
                if (dkQ != null) {
                    r143.getClass();
                    List list4 = r143.A01("direct_user_search_nullstate").A02;
                    0qQ.A0B(list4, 0);
                    dkQ.A01.Epw(new C61082JwK(true, list4, 25));
                    return;
                }
                return;
            default:
                AnonymousClass9B2 r144 = (AnonymousClass9B2) obj;
                0qQ.A0B(r144, 0);
                AnonymousClass35N r12 = (AnonymousClass35N) this.A01;
                r12.A09 = r144;
                DirectShareTarget A004 = r144.A00();
                if (A004 != null) {
                    AnonymousClass35N.A05(r12, A004);
                    return;
                }
                return;
        }
    }
}
