package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.api.schemas.GenAIPersonaBannersResponse;
import com.instagram.api.schemas.GroupMetadata;
import com.instagram.api.schemas.ProfileTheme;
import com.instagram.api.schemas.TextPostAppUserFediverseInfo;
import com.instagram.api.schemas.UserRelatedAccountsInfoDict;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.CreatorShoppingInfo;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.recommended.FollowListData;
import go.Seq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.G2f  reason: case insensitive filesystem */
public final class C51796G2f extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51796G2f(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new C51796G2f(obj, i));
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Object value;
        switch (this.A00) {
            case 0:
            case 11:
            case 15:
                List list = (List) this.A01;
                if (list == null) {
                    return null;
                }
                ArrayList A0r = AnonymousClass7TG.A0r(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A0r.add(DbT.A0k(it).A08());
                }
                return A0r;
            case 1:
                CreatorShoppingInfo creatorShoppingInfo = (CreatorShoppingInfo) this.A01;
                if (creatorShoppingInfo != null) {
                    return creatorShoppingInfo.FHC();
                }
                return null;
            case 3:
                DU0 du0 = (DU0) this.A01;
                if (du0 != null) {
                    return du0.FHC();
                }
                return null;
            case 4:
                C267544bj r0 = (C267544bj) this.A01;
                if (r0 != null) {
                    return r0.FHC();
                }
                return null;
            case 5:
                GenAIPersonaBannersResponse genAIPersonaBannersResponse = (GenAIPersonaBannersResponse) this.A01;
                if (genAIPersonaBannersResponse != null) {
                    return genAIPersonaBannersResponse.FHC();
                }
                return null;
            case 6:
                GroupMetadata groupMetadata = (GroupMetadata) this.A01;
                if (groupMetadata != null) {
                    return groupMetadata.FHC();
                }
                return null;
            case 7:
                ProfileTheme profileTheme = (ProfileTheme) this.A01;
                if (profileTheme != null) {
                    return profileTheme.FHC();
                }
                return null;
            case 8:
                C267524bh r02 = (C267524bh) this.A01;
                if (r02 != null) {
                    return r02.FHC();
                }
                return null;
            case 9:
                UserRelatedAccountsInfoDict userRelatedAccountsInfoDict = (UserRelatedAccountsInfoDict) this.A01;
                if (userRelatedAccountsInfoDict != null) {
                    return userRelatedAccountsInfoDict.FHC();
                }
                return null;
            case 10:
                C267564bl r03 = (C267564bl) this.A01;
                if (r03 != null) {
                    return r03.FHC();
                }
                return null;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                DU1 du1 = (DU1) this.A01;
                if (du1 != null) {
                    return du1.FHC();
                }
                return null;
            case 13:
                List<C272944lg> list2 = (List) this.A01;
                if (list2 == null) {
                    return null;
                }
                ArrayList A0r2 = AnonymousClass7TG.A0r(list2);
                for (C272944lg FHC : list2) {
                    A0r2.add(FHC.FHC());
                }
                return A0r2;
            case 14:
                List<C253703rF> list3 = (List) this.A01;
                if (list3 == null) {
                    return null;
                }
                ArrayList A0r3 = AnonymousClass7TG.A0r(list3);
                for (C253703rF FHC2 : list3) {
                    A0r3.add(FHC2.FHC());
                }
                return A0r3;
            case 16:
                C51948G8r g8r = (C51948G8r) this.A01;
                if (g8r != null) {
                    return g8r.FHC();
                }
                return null;
            case 17:
                C298905uE r04 = (C298905uE) this.A01;
                if (r04 != null) {
                    return r04.FHC();
                }
                return null;
            case 21:
                DV3 dv3 = (DV3) this.A01;
                if (dv3 != null) {
                    return dv3.FHC();
                }
                return null;
            case 22:
                C51951G8u g8u = (C51951G8u) this.A01;
                if (g8u != null) {
                    return g8u.FHC();
                }
                return null;
            case 23:
                TextPostAppUserFediverseInfo textPostAppUserFediverseInfo = (TextPostAppUserFediverseInfo) this.A01;
                if (textPostAppUserFediverseInfo != null) {
                    return textPostAppUserFediverseInfo.FHC();
                }
                return null;
            case 24:
                List<UpcomingEvent> list4 = (List) this.A01;
                if (list4 == null) {
                    return null;
                }
                ArrayList A0r4 = AnonymousClass7TG.A0r(list4);
                for (UpcomingEvent FHC3 : list4) {
                    A0r4.add(FHC3.FHC());
                }
                return A0r4;
            case 25:
                return DbS.A0B(this.A01).getString("MuteSettingsFragment.ARG_SELECTED_FROM", "");
            case 26:
                return DbS.A0B(this.A01).getString("MuteSettingsFragment.ARG_DISPLAYED_USER_ID", "");
            case 27:
                return new C46390DeC((UserSession) this.A01);
            case 28:
                return DbS.A0B(this.A01).getString("CommentPollVotersListFragment.MEDIA_ID");
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return DbS.A0O(002.A0R(DbS.A0B(this.A01).getString("CommentPollVotersListFragment.SOURCE_MODULE", ""), "_comment_poll_voters"));
            case 30:
                return DbS.A0B(this.A01).getString("CommentPollVotersListFragment.POLL_ID");
            case 31:
                C47519E6d e6d = (C47519E6d) this.A01;
                return new AnonymousClass32A(DbT.A0O(e6d.A03), AnonymousClass7TE.A0l(e6d.A07), DbV.A0f(e6d));
            case 32:
                return Boolean.valueOf(DbT.A1X(DbS.A0B(this.A01), "CommentPollVotersListFragment.SHOULD_SHOW_EMPTY_STATE"));
            case 33:
                return this.A01;
            case 34:
                return DbT.A0r(this.A01);
            case 35:
                return DbY.A0I(this.A01);
            case 36:
                return new C47735EEt(AnonymousClass7TE.A0l(((C47519E6d) this.A01).A07));
            case 37:
                return AnonymousClass0t1.A01.A01(C46430Der.A03((C46430Der) this.A01));
            case 38:
                return C49189Equ.A00(C46430Der.A03((C46430Der) this.A01));
            case 39:
                FollowListData followListData = ((C46430Der) this.A01).A0D;
                if (followListData == null) {
                    0qQ.A0F("followListData");
                    throw AnonymousClass00P.createAndThrow();
                }
                int ordinal = followListData.A00.ordinal();
                if (ordinal == 1) {
                    return C48083EVb.FOLLOWING_LIST;
                }
                if (ordinal == 0) {
                    return C48083EVb.FOLLOWER_LIST;
                }
                return null;
            case 40:
                return 17h.A00(C46430Der.A03((C46430Der) this.A01));
            case Seq.NULL_REFNUM:
                return new F2V((UserSession) this.A01);
            case Seq.RefTracker.REF_OFFSET:
                return AnonymousClass0t1.A01.A01(((F2V) this.A01).A00);
            case 43:
                E0c e0c = (E0c) this.A01;
                1Xj A02 = DbX.A0d(e0c.A01).A02(e0c.requireArguments().getString("arg_media_id"));
                if (A02 != null) {
                    return A02;
                }
                throw AnonymousClass7TE.A0z("Media must not be null");
            case 44:
                E6D e6d2 = (E6D) this.A01;
                return C49191Eqw.A00(e6d2.requireArguments(), AnonymousClass7TE.A0l(e6d2.A05));
            case 45:
                return Boolean.valueOf(DbT.A1X(DbS.A0B(this.A01), AnonymousClass000.A00(112)));
            case 46:
                E6D e6d3 = (E6D) this.A01;
                AnonymousClass0eM r4 = e6d3.A05;
                C46329Dbx dbx = new C46329Dbx(AnonymousClass7TE.A0l(r4), "likers", 31784966);
                DbY.A0v(e6d3.requireContext(), dbx, e6d3, r4);
                return dbx;
            case 47:
                E6D e6d4 = (E6D) this.A01;
                return new C49565Eya(e6d4, AnonymousClass7TE.A0l(e6d4.A05), e6d4.getModuleName());
            case 48:
                0kR.A0F(((C49565Eya) ((E6D) this.A01).A04.getValue()).A00.requireContext(), 0cp.A03(AnonymousClass000.A00(79)));
                return C60340gF.A00;
            case 49:
                05G r2 = ((C46729DkI) ((E6D) this.A01).A07.getValue()).A03;
                do {
                    value = r2.getValue();
                } while (!r2.AIY(value, Integer.valueOf(AnonymousClass7TE.A0M(value) + 1)));
                return C60340gF.A00;
            default:
                C274674os r05 = (C274674os) this.A01;
                if (r05 != null) {
                    return r05.FHC();
                }
                return null;
        }
    }
}
