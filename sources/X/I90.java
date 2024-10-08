package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.SubmittedSubPostManageType;
import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.save.model.SavedCollection;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class I90 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public I90(UserSession userSession, 1Xj r2, C55922Hpj hpj, LRh lRh, int i) {
        this.A00 = i;
        if (1 - i != 0) {
            this.A01 = lRh;
            this.A02 = r2;
            this.A03 = userSession;
            this.A04 = hpj;
        } else {
            this.A04 = hpj;
            this.A01 = lRh;
            this.A02 = r2;
            this.A03 = userSession;
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        String str2;
        1OC r3;
        Context context;
        AnonymousClass07i r0;
        Fragment fragment;
        1P0 r1;
        DialogInterface dialogInterface2 = dialogInterface;
        switch (this.A00) {
            case 0:
                if (182.A06(0Tu.A05, (0lg) this.A04, 36328237844216938L)) {
                    2YL r2 = (2YL) this.A01;
                    Object obj = this.A02;
                    AnonymousClass7TE.A1Z(new AnonymousClass9KF(r2, this.A03, obj, (AnonymousClass4D7) null, 37), C318116oQ.A00(r2));
                    return;
                }
                return;
            case 1:
                C55922Hpj hpj = (C55922Hpj) this.A04;
                Context context2 = hpj.A00;
                String str3 = null;
                AnonymousClass6ST A0h = DbV.A0h(context2);
                A0h.A00(context2.getResources().getString(2131968969));
                AnonymousClass0fN.A00(A0h);
                LRh lRh = (LRh) this.A01;
                1Xj r7 = (1Xj) this.A02;
                if (r7 != null) {
                    str = r7.A2n();
                } else {
                    str = null;
                }
                UserSession userSession = lRh.A07;
                AnonymousClass0iw r32 = lRh.A05;
                0Aj A0S = C51975G9x.A0S(r32, userSession);
                if (A0S.isSampled()) {
                    C51965G9l.A1C(C54689HOu.OPEN_CAROUSEL_DELETE_SELF_MEDIA, A0S);
                    DbW.A16(A0S, r32);
                    C51965G9l.A1K(A0S, lRh.A08);
                    C51965G9l.A1E(A0S, LRh.A00(str));
                    A0S.Cgf();
                }
                I0v i0v = new I0v((UserSession) this.A03);
                if (r7 != null) {
                    str3 = r7.A2n();
                }
                i0v.A01(SubmittedSubPostManageType.DELETE_ALL_FROM_VIEWER, new H51(5, (Object) A0h, (Object) hpj), str3, (String) null, (List) null);
                return;
            case 2:
                LRh lRh2 = (LRh) this.A01;
                1Xj r5 = (1Xj) this.A02;
                if (r5 != null) {
                    str2 = r5.A2n();
                } else {
                    str2 = null;
                }
                UserSession userSession2 = lRh2.A07;
                AnonymousClass0iw r33 = lRh2.A05;
                0Aj A0S2 = C51975G9x.A0S(r33, userSession2);
                if (A0S2.isSampled()) {
                    C51965G9l.A1C(C54689HOu.OPEN_CAROUSEL_TURN_OFF, A0S2);
                    DbW.A16(A0S2, r33);
                    C51965G9l.A1K(A0S2, lRh2.A08);
                    C51965G9l.A1E(A0S2, LRh.A00(str2));
                    A0S2.Cgf();
                }
                I0v.A00(((C55922Hpj) this.A04).A00, r5, new I0v((UserSession) this.A03), false);
                return;
            case 3:
                UserSession userSession3 = (UserSession) this.A04;
                1Xj r52 = (1Xj) this.A03;
                1NY A0a = AnonymousClass7TG.A0a(userSession3);
                A0a.A0K("media/%s/hard_delete/", C51969G9p.A1b(r52));
                DbX.A1M(A0a, "media_id", r52.getId());
                r3 = DbT.A0U(A0a, true);
                fragment = (AnonymousClass4DH) this.A02;
                r1 = new C47904ELy((DialogInterface.OnDismissListener) this.A01, fragment, userSession3, r52);
                break;
            case 4:
                UserSession userSession4 = (UserSession) this.A04;
                1Xj r53 = (1Xj) this.A03;
                1NY A0a2 = AnonymousClass7TG.A0a(userSession4);
                A0a2.A0K("media/%s/cancel_delete/", C51969G9p.A1b(r53));
                DbX.A1M(A0a2, "media_id", r53.getId());
                r3 = DbT.A0U(A0a2, true);
                fragment = (AnonymousClass4DH) this.A02;
                r1 = new C47905ELz((DialogInterface.OnDismissListener) this.A01, fragment, userSession4, r53);
                break;
            case 5:
                UserSession userSession5 = (UserSession) this.A04;
                AnonymousClass4DH r22 = (AnonymousClass4DH) this.A02;
                C347037wA.A03(r22.requireActivity(), userSession5, (1Xj) this.A03, DbT.A0j(userSession5), r22.getClass(), r22.getModuleName());
                ((DialogInterface.OnDismissListener) this.A01).onDismiss(dialogInterface2);
                return;
            case 6:
                dialogInterface2.dismiss();
                C55835HoI hoI = (C55835HoI) this.A01;
                UserSession userSession6 = hoI.A03;
                1Xj r72 = (1Xj) this.A03;
                String id = r72.getId();
                String moduleName = hoI.A02.getModuleName();
                0qQ.A0B(moduleName, 2);
                1NY A0a3 = AnonymousClass7TG.A0a(userSession6);
                A0a3.A0K("commerce/media/%s/remove_all_tags_on_media/", new Object[]{id});
                A0a3.A0Q(1XP.class, 1XY.class);
                C51965G9l.A1S(A0a3, moduleName);
                r3 = DbT.A0U(A0a3, true);
                r3.A00 = new C54248H4r((1P0) this.A04, r72, hoI);
                context = (Context) this.A02;
                r0 = hoI.A01;
                break;
            case 7:
                H15 h15 = (H15) this.A01;
                SavedCollection savedCollection = (SavedCollection) this.A02;
                List list = (List) this.A03;
                Runnable runnable = (Runnable) this.A04;
                H15.A02(h15);
                SavedCollection savedCollection2 = h15.A0C;
                if (savedCollection2 != null) {
                    C56669I6y.A00(h15.requireContext(), h15, h15.A05, savedCollection2, savedCollection, runnable, list);
                    return;
                }
                return;
            case 8:
                UserSession userSession7 = (UserSession) this.A04;
                C46649DiU.A04("com.instagram.social_impact.linked_fundraiser.creation_bottom_sheet", (Map) null).A0E((Context) this.A02, DbS.A0N(userSession7));
                LTM.A07((AnonymousClass0iw) this.A03, userSession7, "share_fundraiser_as_ig_story_click_learn_more", AnonymousClass000.A00(1554), (String) null, (Map) this.A01);
                return;
            case 9:
            case 10:
                I4M i4m = (I4M) this.A04;
                I4M.A00((C241293Oq) this.A03, i4m.A0C, i4m);
                C55680Hld hld = i4m.A01;
                if (hld != null) {
                    Integer valueOf = Integer.valueOf(((0rk) this.A01).A00);
                    0Aj A0e = AnonymousClass7TE.A0e(hld.A01, "follow_prompt_clicked");
                    DbW.A15(A0e, hld.A00);
                    C51974G9v.A0s(A0e, "dialog", (String) ((0rm) this.A02).A00);
                    A0e.A8k("num_facepiles", valueOf);
                    A0e.Cgf();
                    return;
                }
                return;
            case 11:
                0qQ.A0B(dialogInterface2, 0);
                I4M i4m2 = (I4M) this.A04;
                C294705mt A002 = C294695ms.A00(i4m2.A0C);
                Context context3 = i4m2.A0A;
                User CCd = ((C241293Oq) this.A03).CCd();
                AnonymousClass0iw r23 = i4m2.A0B;
                A002.A09(context3, (0xF) null, (1P0) null, (1Xj) null, (AnonymousClass3W1) null, (UserDetailEntryInfo) null, (SearchContext) null, (C243943aO) null, CCd, false, (Double) null, AnonymousClass05K.A0j, (Long) null, "clips_follow_prompt", "clips_follow_prompt", r23.getModuleName(), r23.getModuleName(), (String) null, (String) null, (String) null, (String) null, (JSONObject) null);
                C55680Hld hld2 = i4m2.A01;
                if (hld2 != null) {
                    String str4 = (String) ((0rm) this.A02).A00;
                    int i2 = ((0rk) this.A01).A00;
                    0qQ.A0B(str4, 1);
                    0Aj A0e2 = AnonymousClass7TE.A0e(hld2.A01, "follow_prompt_accepted");
                    DbW.A15(A0e2, hld2.A00);
                    C51974G9v.A0s(A0e2, "dialog", str4);
                    A0e2.A8k("num_facepiles", Integer.valueOf(i2));
                    A0e2.Cgf();
                }
                dialogInterface2.dismiss();
                return;
            default:
                return;
        }
        r3.A00 = r1;
        context = fragment.requireContext();
        r0 = AnonymousClass07i.A00(fragment);
        1ES.A00(context, r0, r3);
    }

    public I90(DialogInterface.OnDismissListener onDismissListener, AnonymousClass4DH r2, UserSession userSession, 1Xj r4, int i) {
        this.A00 = i;
        switch (i) {
            case 3:
            case 4:
                this.A04 = userSession;
                this.A03 = r4;
                break;
            default:
                this.A03 = r4;
                this.A04 = userSession;
                break;
        }
        this.A02 = r2;
        this.A01 = onDismissListener;
    }

    public I90(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj3;
        this.A02 = obj;
        this.A01 = obj4;
        this.A03 = obj2;
    }
}
