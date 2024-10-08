package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;

/* renamed from: X.9Md  reason: invalid class name and case insensitive filesystem */
public final class C377519Md extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377519Md(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A05 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A06 = obj6;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                AnonymousClass9H6 r1 = (AnonymousClass9H6) this.A06;
                return new P9F(r1.A00.requireActivity(), (Fragment) this.A05, (AnonymousClass0iw) this.A01, r1.A01, (AnonymousClass7TO) this.A03, (C333037Xk) ((AnonymousClass0eM) this.A04).getValue(), new C73897PlY(this.A02, 10));
            case 1:
                UserSession userSession = ((AnonymousClass9H6) this.A06).A01;
                return new C72539P9w((AnonymousClass4DH) this.A03, (AnonymousClass0iw) this.A01, userSession, (AnonymousClass7SM) this.A05, (AnonymousClass0eK) this.A02, new C41396AtI((C62320sa) this.A04, 7));
            case 2:
                AnonymousClass9H6 r0 = (AnonymousClass9H6) this.A06;
                return new C72493P8c(r0.A00.requireActivity(), r0.A01, (OT9) ((AnonymousClass0eM) this.A02).getValue(), (AnonymousClass4DU) this.A03, (AnonymousClass0eK) this.A01, (AnonymousClass0eK) this.A05, (C62320sa) this.A04);
            case 3:
                AnonymousClass9H6 r12 = (AnonymousClass9H6) this.A06;
                FragmentActivity requireActivity = r12.A00.requireActivity();
                UserSession userSession2 = r12.A01;
                TTG ttg = new TTG(this.A05, 2);
                C41396AtI atI = new C41396AtI(this.A01, 8);
                Object value = ((AnonymousClass0eM) this.A04).getValue();
                0qQ.A07(value);
                return new P9N(requireActivity, (AnonymousClass4DH) this.A03, userSession2, (P9G) value, (2Dm) this.A02, atI, ttg);
            case 4:
                AnonymousClass3VA r8 = AnonymousClass3VA.ADD_CONTENT_NOTE;
                return C246393eW.A00.A00((Context) this.A01, ((C262834Ge) this.A06).A00, (1Xj) this.A03, (1Xj) this.A02, (AnonymousClass4DU) this.A04, (AnonymousClass3W1) this.A05, r8);
            case 5:
                AnonymousClass2rB r02 = (AnonymousClass2rB) this.A06;
                return new C232422tg((Context) this.A01, r02.A01, r02.A00, (C230582pr) this.A03, (C228232l0) this.A04, (C249763kK) this.A05, (C230662pz) this.A02);
            case 6:
                AnonymousClass2rB r03 = (AnonymousClass2rB) this.A06;
                UserSession userSession3 = r03.A00;
                C228392lb r6 = (C228392lb) this.A05;
                return new C232412tf((Context) this.A01, r03.A01, userSession3, (C230522pl) this.A04, r6, (AnonymousClass2pM) this.A03, (C227802jw) this.A02);
            case 8:
            case 9:
                UserSession userSession4 = (UserSession) this.A05;
                Activity activity = (Activity) this.A01;
                User user = (User) this.A04;
                ((AnonymousClass0iw) this.A02).getModuleName();
                ((UserDetailFragment) this.A03).A0q();
                if (!C322606w6.A02(userSession4)) {
                    EWD ewd = EWD.EXPANDED_PROFILE_PIC;
                    String username = user.getUsername();
                    String fullName = user.getFullName();
                    String A032 = AnonymousClass3VO.A03(user.getId());
                    Bundle A002 = C343547qO.A00((RectF) null, ewd, false);
                    A002.putString(AnonymousClass000.A00(988), username);
                    A002.putString(AnonymousClass000.A00(987), fullName);
                    A002.putString(AnonymousClass000.A00(989), A032);
                    A002.putBoolean(C273654mx.A00(221), false);
                    AnonymousClass6W8 r7 = new AnonymousClass6W8(activity, A002, userSession4, ModalActivity.class, AnonymousClass000.A00(708));
                    r7.A07();
                    r7.A0C(activity);
                    break;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putString(C273654mx.A00(269), user.getId());
                    C49080Eoy.A00(activity, bundle, userSession4, user.getId(), false);
                    break;
                }
            case 10:
                UserSession userSession5 = (UserSession) this.A05;
                AnonymousClass0iw r72 = (AnonymousClass0iw) this.A02;
                Activity activity2 = (Activity) this.A01;
                User user2 = (User) this.A04;
                ((UserDetailFragment) this.A03).A0q();
                if (C322606w6.A02(userSession5)) {
                    0qQ.A0B(userSession5, 0);
                    if (!182.A06(0Tu.A05, userSession5, 36327426096183733L)) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(C273654mx.A00(269), user2.getId());
                        C49080Eoy.A00(activity2, bundle2, userSession5, user2.getId(), false);
                        break;
                    }
                }
                C49731F3w A07 = 1as.A04.A02.A07(r72, userSession5, 2FW.A1O);
                A07.A06(user2.getId());
                AnonymousClass37D A012 = AnonymousClass37D.A00.A01(activity2);
                A07.A01();
                if (A012 != null) {
                    A012.A0J(A07.A00());
                    break;
                }
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                AnonymousClass35W r5 = (AnonymousClass35W) this.A06;
                C2368135e r4 = r5.A0Z;
                ShareType shareType = (ShareType) this.A05;
                if (!r4.A01((AnonymousClass3Q2) this.A04, shareType)) {
                    1ZU A003 = C48794EkH.A00();
                    FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                    UserSession userSession6 = r5.A0T;
                    1Xj r2 = (1Xj) this.A03;
                    A003.A03(fragmentActivity, userSession6, r2);
                    C305796Jo.A03((Fragment) this.A02, fragmentActivity, r5.A0W, userSession6, r2);
                    break;
                } else {
                    r4.A00((FragmentActivity) this.A01, (1Xj) this.A03, shareType, r5.A0Y.getSessionId());
                    break;
                }
            default:
                AnonymousClass0iw r42 = (AnonymousClass0iw) this.A03;
                C46395DeI.A04((Activity) this.A01, (View) null, (0hq) this.A02, (AnonymousClass07i) this.A04, r42, (UserSession) this.A06, (User) this.A05, (Long) null, "expanded_profile_pic", (String) null, (String) null, (String) null, true);
                break;
        }
        return C60340gF.A00;
    }
}
