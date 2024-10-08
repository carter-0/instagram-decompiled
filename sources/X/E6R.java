package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import com.facebook.common.dextricks.Constants;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.hashtag.HashtagFollowStatus;
import com.instagram.model.hashtag.response.HashtagCollection;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import java.util.Iterator;

public final class E6R extends AnonymousClass32G implements AnonymousClass0iw, AnonymousClass4DU, AnonymousClass4DR, AbsListView.OnScrollListener, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "FollowingHashtagsFragment";
    public UserSession A00;
    public UserSession A01;
    public C47583E8v A02;
    public C230132oy A03;
    public TypeaheadHeader A04;
    public String A05;
    public C47917EMl A06;
    public boolean A07;
    public final C230152p2 A08 = new C19383WXa(this, 4);
    public final C49419EvL A09 = new C49419EvL(this);
    public final C19388WXf A0A = new C19388WXf(this, 2);
    public final C228172ku A0B = new C228172ku();
    public final G7N A0C = new C51011Fn0(this);
    public final G6X A0D = new C51012Fn3(this, 3);
    public final C49420EvM A0E = new C49420EvM(this);
    public final C49421EvN A0F = new C49421EvN(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        if (this.A07) {
            DbW.A1B(r2, 2131963302);
        }
    }

    public final String getModuleName() {
        return "following_hashtags";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TypeaheadHeader typeaheadHeader = this.A04;
        if (typeaheadHeader != null) {
            typeaheadHeader.A02();
            typeaheadHeader.setDelegate(this.A0C);
            typeaheadHeader.A03(AnonymousClass7TE.A16(requireContext(), 2131972819));
            C47583E8v e8v = this.A02;
            if (e8v == null) {
                str = "adapter";
            } else {
                A0V(e8v);
                int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                UserSession userSession = this.A01;
                if (userSession == null) {
                    str = "viewerUserSession";
                } else {
                    C49420EvM evM = this.A0E;
                    0S7.A00(this);
                    ListView listView = this.A04;
                    0qQ.A07(listView);
                    if (this.A05 == null) {
                        str = "userId";
                    } else {
                        this.A06 = new C47917EMl(listView, this, userSession, evM);
                        C228172ku r1 = this.A0B;
                        r1.A03(typeaheadHeader.A04);
                        C47917EMl eMl = this.A06;
                        if (eMl == null) {
                            str = "impressionLogger";
                        } else {
                            r1.A03(eMl);
                            0S7.A00(this);
                            this.A04.setOnScrollListener(this);
                            0S7.A00(this);
                            this.A04.setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
                            return;
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final 0xF A01(Hashtag hashtag, E6R e6r) {
        HashtagFollowStatus hashtagFollowStatus;
        String str;
        0xF r2 = new 0xF();
        String str2 = e6r.A05;
        if (str2 == null) {
            str = "userId";
        } else {
            UserSession userSession = e6r.A01;
            if (userSession == null) {
                str = "viewerUserSession";
            } else {
                if (!str2.equals(userSession.A06)) {
                    C47583E8v e8v = e6r.A02;
                    if (e8v == null) {
                        str = "adapter";
                    } else {
                        Iterator it = e8v.A04.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (hashtag.equals(it.next())) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        hashtagFollowStatus = HashtagFollowStatus.NOT_FOLLOWING;
                        0xF.A00(r2, hashtagFollowStatus.toString(), "hashtag_follow_status_owner");
                        return r2;
                    }
                } else if (!C281965Ag.A03(hashtag)) {
                    hashtagFollowStatus = HashtagFollowStatus.NOT_FOLLOWING;
                    0xF.A00(r2, hashtagFollowStatus.toString(), "hashtag_follow_status_owner");
                    return r2;
                }
                hashtagFollowStatus = HashtagFollowStatus.FOLLOWING;
                0xF.A00(r2, hashtagFollowStatus.toString(), "hashtag_follow_status_owner");
                return r2;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(E6R e6r) {
        String str;
        C47583E8v e8v = e6r.A02;
        if (e8v == null) {
            str = "adapter";
        } else {
            e8v.A03.clear();
            e8v.A06 = false;
            C47583E8v.A00(e8v);
            C230132oy r4 = e6r.A03;
            if (r4 == null) {
                str = "hashtagApi";
            } else {
                UserSession userSession = e6r.A01;
                if (userSession == null) {
                    str = "viewerUserSession";
                } else {
                    C49421EvN evN = e6r.A0F;
                    String A062 = 0mp.A06("tags/suggested/", new Object[0]);
                    1NY A0b = AnonymousClass7TG.A0b(userSession);
                    A0b.A0A(A062);
                    1OC A0S = DbT.A0S(A0b, HashtagCollection.class, C70895OQn.class);
                    EDV.A00(A0S, r4, evN, 19);
                    1ES.A00(r4.A00, r4.A01, A0S);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        DbS.A17();
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean onBackPressed() {
        TypeaheadHeader typeaheadHeader = this.A04;
        if (typeaheadHeader == null) {
            return false;
        }
        typeaheadHeader.A01();
        return false;
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.07Z, X.E6R, X.0iw, androidx.fragment.app.Fragment] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1087447340);
        E6R.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = DbX.A0U(this);
        Context requireContext = requireContext();
        0gy A002 = AnonymousClass07i.A00(this);
        UserSession userSession = this.A00;
        String str = "userSession";
        if (userSession != null) {
            this.A03 = new C230132oy(requireContext, A002, this, userSession);
            this.A05 = requireArguments.getString("FollowingHashtagsFragment.UserId", "");
            String string = requireArguments.getString("FollowingHashtagsFragment.UserName", "");
            this.A07 = requireArguments.getBoolean("FollowingHashtagsFragment.IsStandalone");
            this.A01 = DbX.A0U(this);
            UserSession userSession2 = this.A00;
            if (userSession2 != null) {
                Context requireContext2 = requireContext();
                C19388WXf wXf = this.A0A;
                String str2 = this.A05;
                if (str2 != null) {
                    UserSession userSession3 = this.A01;
                    if (userSession3 != null) {
                        C47583E8v e8v = new C47583E8v(requireContext2, wXf, this, userSession2, this.A0D, string, str2.equals(userSession3.A06));
                        this.A02 = e8v;
                        e8v.A03.clear();
                        e8v.A06 = false;
                        C47583E8v.A00(e8v);
                        C230132oy r5 = this.A03;
                        if (r5 == null) {
                            str = "hashtagApi";
                        } else {
                            UserSession userSession4 = this.A01;
                            if (userSession4 != null) {
                                C49419EvL evL = this.A09;
                                String str3 = this.A05;
                                if (str3 != null) {
                                    String A062 = 0mp.A06("users/%s/following_tags_info/", new Object[]{str3});
                                    1NY A0b = AnonymousClass7TG.A0b(userSession4);
                                    A0b.A0A(A062);
                                    1OC A0S = DbT.A0S(A0b, HashtagCollection.class, C70895OQn.class);
                                    EDV.A00(A0S, r5, evL, 18);
                                    1ES.A00(r5.A00, r5.A01, A0S);
                                    AnonymousClass0fD.A09(-1208511742, A022);
                                    return;
                                }
                            }
                        }
                    }
                    str = "viewerUserSession";
                }
                str = "userId";
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1426820359);
        0qQ.A0B(layoutInflater, 0);
        Context context = layoutInflater.getContext();
        0qQ.A07(context);
        this.A04 = new TypeaheadHeader(context);
        View inflate = layoutInflater.inflate(R.layout.layout_listview_with_progress, viewGroup, false);
        AnonymousClass0fD.A09(-1428848322, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1968897846);
        super.onDestroyView();
        C228172ku r2 = this.A0B;
        TypeaheadHeader typeaheadHeader = this.A04;
        if (typeaheadHeader != null) {
            C46458DfM dfM = typeaheadHeader.A04;
            0qQ.A0B(dfM, 0);
            r2.A02.remove(dfM);
            this.A04 = null;
            AnonymousClass0fD.A09(-1423784707, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(243743431, A022);
        throw A0y;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-106324210);
        E6R.super.onPause();
        TypeaheadHeader typeaheadHeader = this.A04;
        if (typeaheadHeader != null) {
            typeaheadHeader.A01();
        }
        AnonymousClass0fD.A09(-1958649133, A022);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A0D2 = AnonymousClass7TG.A0D(absListView, -1052695877);
        this.A0B.onScroll(absListView, i, i2, i3);
        AnonymousClass0fD.A0A(2121228504, A0D2);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0D2 = AnonymousClass7TG.A0D(absListView, 1849014406);
        this.A0B.onScrollStateChanged(absListView, i);
        AnonymousClass0fD.A0A(1916670053, A0D2);
    }
}
