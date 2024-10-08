package X;

import android.content.Context;
import android.view.View;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.FOs  reason: case insensitive filesystem */
public final class C50102FOs implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C50102FOs(Context context, User user, C46430Der der, int i) {
        this.A00 = i;
        this.A03 = der;
        switch (i) {
            case 3:
            case 4:
                this.A02 = user;
                this.A01 = context;
                break;
            default:
                this.A01 = context;
                this.A02 = user;
                break;
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.G7p, java.lang.Object] */
    public final void onClick(View view) {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                ((F14) this.A01).A0B.D2y((Reel) this.A02, ((F18) this.A03).A0E);
                return;
            case 3:
                i = AnonymousClass0fD.A05(-1174431274);
                Integer num = AnonymousClass05K.A00;
                C46430Der der = (C46430Der) this.A03;
                F8R.A01(der, C46430Der.A03(der), num);
                HashMap A1E = AnonymousClass7TE.A1E();
                A1E.put("shared_user_id", DbS.A0q(this.A02));
                IgBloksScreenConfig A0N = DbS.A0N(C46430Der.A03(der));
                DbS.A18(der.requireContext(), A0N, 2131973612);
                C46649DiU.A04("com.bloks.www.ig.bloks.your_shared_activity.entry", A1E).A0D((Context) this.A01, A0N);
                i2 = -552069497;
                break;
            case 4:
                i = AnonymousClass0fD.A05(1742372487);
                C46430Der der2 = (C46430Der) this.A03;
                User user = (User) this.A02;
                C46430Der.A0J(der2, "user_following_relationship_alert_mute", user.getId());
                ? obj = new Object();
                C331127Pr A0W = DbS.A0W(C46430Der.A03(der2));
                A0W.A0a = AnonymousClass7TE.A0v();
                DbT.A1C(((Context) this.A01).getResources(), A0W, 2131962580);
                A0W.A00().A02(der2.requireActivity(), C46447Df9.A02().A08(C46430Der.A03(der2), obj, user.getId(), "self_following"));
                i2 = -1673664731;
                break;
            case 5:
                i = AnonymousClass0fD.A05(-1529719988);
                C46430Der der3 = (C46430Der) this.A03;
                C331127Pr A0W2 = DbS.A0W(C46430Der.A03(der3));
                A0W2.A0a = AnonymousClass7TE.A0v();
                Context context = (Context) this.A01;
                DbT.A1C(context.getResources(), A0W2, 2131962581);
                C331157Pu A002 = A0W2.A00();
                User user2 = (User) this.A02;
                C50686Fgl fgl = new C50686Fgl(context, A002, user2, der3);
                C46447Df9.A03();
                UserSession A032 = C46430Der.A03(der3);
                String id = user2.getId();
                0qQ.A0B(A032, 0);
                E5U A003 = C49078Eow.A00(A032, id, (String) null);
                A003.A01 = fgl;
                DbU.A1I(der3, A003, A002);
                i2 = 78224566;
                break;
            case 6:
                i = AnonymousClass0fD.A05(-1531457192);
                if (((User) this.A02).A1Z()) {
                    E3D e3d = (E3D) this.A03;
                    if (!C46359DdX.A08(AnonymousClass7TE.A0l(e3d.A0W))) {
                        DcM A012 = F8V.A01(e3d);
                        AnonymousClass3FW r3 = (AnonymousClass3FW) this.A01;
                        F10 A0Q = Dbb.A0Q(r3, e3d);
                        String str = e3d.A0N;
                        0qQ.A0B(str, 1);
                        DcM.A03(A012, A0Q, "ig_quiet_mode_custom_start_time_open", str);
                        E3D.A09(new C51081FoB(r3, e3d), e3d, r3.A01());
                        i2 = -1233400307;
                        break;
                    }
                }
                i2 = 789467548;
                break;
            case 7:
                i = AnonymousClass0fD.A05(-772093623);
                if (((User) this.A02).A1Z()) {
                    E3D e3d2 = (E3D) this.A03;
                    if (!C46359DdX.A08(AnonymousClass7TE.A0l(e3d2.A0W))) {
                        DcM A013 = F8V.A01(e3d2);
                        AnonymousClass3FW r32 = (AnonymousClass3FW) this.A01;
                        F10 A0Q2 = Dbb.A0Q(r32, e3d2);
                        String str2 = e3d2.A0N;
                        0qQ.A0B(str2, 1);
                        DcM.A03(A013, A0Q2, "ig_quiet_mode_custom_end_time_open", str2);
                        E3D.A09(new C51082FoC(r32, e3d2), e3d2, r32.A00());
                        i2 = 1808115372;
                        break;
                    }
                }
                i2 = -1350092306;
                break;
            case 8:
                i = AnonymousClass0fD.A05(-340328714);
                HashMap A1E2 = AnonymousClass7TE.A1E();
                HashMap A1E3 = AnonymousClass7TE.A1E();
                new BitSet(0);
                FBO.A00(new FVR(this, 4), "com.bloks.www.ig.supervision.screen_time_enforcement.open_settings.async", A1E2, A1E3).A01(DbT.A0E(this.A02), (C229382nI) this.A03);
                i2 = 2142126011;
                break;
            case 9:
                i = AnonymousClass0fD.A05(1207332604);
                C47498E5d e5d = (C47498E5d) this.A01;
                if (e5d.A0D) {
                    UserSession userSession = e5d.A01;
                    User user3 = (User) this.A03;
                    String str3 = e5d.A08;
                    0qQ.A0B(userSession, 0);
                    FEI.A00(e5d, userSession, user3, str3, 002.A0R("share_business_bottom_sheet_", DbX.A0t(user3.A03.AyL())));
                }
                SUL sul = new SUL(e5d.requireActivity(), e5d.A01, 2EG.A4B, ((C274674os) this.A02).getUrl());
                sul.A0E(DbS.A0q(this.A03));
                sul.A0S = C49092EpH.A00(e5d, e5d.A06);
                sul.A0A();
                i2 = -1945045477;
                break;
            default:
                ((F14) this.A01).A0B.DwV((User) this.A02, ((Number) this.A03).intValue());
                return;
        }
        AnonymousClass0fD.A0C(i2, i);
    }

    public C50102FOs(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A03 = obj2;
        this.A02 = obj;
    }
}
