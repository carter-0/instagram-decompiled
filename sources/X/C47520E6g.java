package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.E6g  reason: case insensitive filesystem */
public final class C47520E6g extends C227812jx implements AnonymousClass4DR, AnonymousClass4DS, G82 {
    public static final String __redex_internal_original_name = "BatchManageUserListFragment";
    public int A00;
    public TextView A01;
    public TextView A02;
    public F2F A03;
    public 17i A04;
    public E9I A05;
    public String A06;
    public String A07;
    public ArrayList A08;
    public HashMap A09 = AnonymousClass7TE.A1E();
    public boolean A0A;
    public final AnonymousClass0eM A0B = C227642jf.A02(this);

    public final boolean CZf(User user) {
        return false;
    }

    public final boolean CbR(User user) {
        return true;
    }

    public final void CtI(User user) {
    }

    public final boolean Dw3(User user, boolean z) {
        0qQ.A0B(user, 0);
        E9I e9i = this.A05;
        if (e9i != null) {
            e9i.A00.A00 = false;
            this.A09.put(user, Boolean.valueOf(z));
            int i = this.A00;
            int i2 = i - 1;
            if (z) {
                i2 = i + 1;
            }
            this.A00 = i2;
            A01(this);
            return true;
        }
        0qQ.A0F("selectableUserListAdapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void configureActionBar(2da r6) {
        0qQ.A0B(r6, 0);
        r6.Eom(2131962572);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A01 = R.drawable.instagram_arrow_left_pano_outline_24;
        r6.ErG(new AnonymousClass3Jb(A0K));
        FrameLayout frameLayout = ((2dZ) r6).A0S;
        Context context = frameLayout.getContext();
        TextView A0R = AnonymousClass7TG.A0R(LayoutInflater.from(context).inflate(R.layout.action_bar_button_text, frameLayout, false), R.id.action_bar_button_text);
        DbT.A18(context, A0R, 2131973026);
        DbT.A17(context, A0R, 2Yu.A07(getContext()));
        FP3.A00(A0R, 67, this);
        AnonymousClass3JR A0K2 = DbS.A0K();
        A0K2.A0I = A0R;
        r6.AA4(new AnonymousClass3Jb(A0K2));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        TextView A032;
        int i;
        View.OnClickListener onClickListener;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass7TF.A0F(view, R.id.recycler_view);
        String str2 = this.A07;
        if (str2 != null) {
            TextView A0G = DbU.A0G(view, R.id.header_text);
            A0G.setText(str2);
            A0G.setVisibility(0);
        }
        TextView A0G2 = DbU.A0G(view, R.id.negative_manage_button);
        0qQ.A0B(A0G2, 0);
        this.A01 = A0G2;
        TextView A0G3 = DbU.A0G(view, R.id.positive_manage_button);
        0qQ.A0B(A0G3, 0);
        this.A02 = A0G3;
        A00();
        DbV.A1B(recyclerView.getContext(), recyclerView);
        E9I e9i = this.A05;
        if (e9i != null) {
            recyclerView.setAdapter(e9i);
            E9I e9i2 = this.A05;
            if (e9i2 != null) {
                ArrayList arrayList = this.A08;
                if (arrayList != null) {
                    ArrayList arrayList2 = e9i2.A01;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    E9I.A00(e9i2);
                    String str3 = this.A06;
                    if (str3 != null) {
                        int hashCode = str3.hashCode();
                        if (hashCode != -1217778020) {
                            if (hashCode != -1067858906) {
                                if (hashCode == 494700669 && str3.equals(AnonymousClass000.A00(97))) {
                                    FP3.A00(A04(), 69, this);
                                    A032 = A03();
                                    i = 70;
                                } else {
                                    return;
                                }
                            } else if (str3.equals("BATCH_MANAGE_NON_RECIP_FOLLOWERS")) {
                                FP0.A00(A04(), 0, this);
                                A032 = A03();
                                onClickListener = new FP0((Object) this, 1);
                                AnonymousClass0fU.A00(onClickListener, A032);
                                return;
                            } else {
                                return;
                            }
                        } else if (str3.equals("BATCH_MANAGE_FOLLOWING")) {
                            A04().setVisibility(8);
                            A032 = A03();
                            i = 68;
                        } else {
                            return;
                        }
                        onClickListener = new FP3((Object) this, i);
                        AnonymousClass0fU.A00(onClickListener, A032);
                        return;
                    }
                    str = "batchManageGroup";
                } else {
                    str = "users";
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        str = "selectableUserListAdapter";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A00() {
        TextView A032;
        Resources A052;
        int i;
        TextView textView;
        String string;
        Resources A053;
        int i2;
        int i3 = this.A00;
        String A002 = AnonymousClass000.A00(97);
        String str = this.A06;
        if (str != null) {
            int hashCode = str.hashCode();
            if (i3 > 0) {
                if (hashCode != -1217778020) {
                    if (hashCode != -1067858906) {
                        if (hashCode == 494700669 && str.equals(A002)) {
                            DbY.A0y(DbV.A05(this), A03(), Integer.valueOf(this.A00), 2131957619);
                            textView = A04();
                            A053 = DbV.A05(this);
                            i2 = 2131956502;
                        } else {
                            return;
                        }
                    } else if (str.equals("BATCH_MANAGE_NON_RECIP_FOLLOWERS")) {
                        DbY.A0y(DbV.A05(this), A03(), Integer.valueOf(this.A00), 2131972136);
                        textView = A04();
                        A053 = DbV.A05(this);
                        i2 = 2131962537;
                    } else {
                        return;
                    }
                } else if (str.equals("BATCH_MANAGE_FOLLOWING")) {
                    textView = A03();
                    A053 = DbV.A05(this);
                    i2 = 2131975871;
                } else {
                    return;
                }
                string = AnonymousClass7TF.A0e(A053, Integer.valueOf(this.A00), i2);
            } else {
                if (hashCode != -1217778020) {
                    if (hashCode != -1067858906) {
                        if (hashCode == 494700669 && str.equals(A002)) {
                            DbU.A1A(DbV.A05(this), A03(), 2131957531);
                            A032 = A04();
                            A052 = DbV.A05(this);
                            i = 2131956481;
                        } else {
                            return;
                        }
                    } else if (str.equals("BATCH_MANAGE_NON_RECIP_FOLLOWERS")) {
                        DbU.A1A(DbV.A05(this), A03(), 2131971974);
                        A032 = A04();
                        A052 = DbV.A05(this);
                        i = 2131962613;
                    } else {
                        return;
                    }
                } else if (str.equals("BATCH_MANAGE_FOLLOWING")) {
                    A032 = A03();
                    A052 = DbV.A05(this);
                    i = 2131975854;
                } else {
                    return;
                }
                string = A052.getString(i);
            }
            textView.setText(string);
            return;
        }
        0qQ.A0F("batchManageGroup");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(C47520E6g e6g) {
        TextView A032;
        float f;
        int i = e6g.A00;
        TextView A033 = e6g.A03();
        if (i > 0) {
            A033.setEnabled(true);
            e6g.A04().setEnabled(true);
            A032 = e6g.A03();
            f = 1.0f;
        } else {
            A033.setEnabled(false);
            e6g.A04().setEnabled(false);
            A032 = e6g.A03();
            f = 0.35f;
        }
        A032.setAlpha(f);
        e6g.A04().setAlpha(f);
        e6g.A00();
    }

    public final TextView A03() {
        TextView textView = this.A01;
        if (textView != null) {
            return textView;
        }
        0qQ.A0F("negativeButton");
        throw AnonymousClass00P.createAndThrow();
    }

    public final TextView A04() {
        TextView textView = this.A02;
        if (textView != null) {
            return textView;
        }
        0qQ.A0F("positiveButton");
        throw AnonymousClass00P.createAndThrow();
    }

    public final F2F A05() {
        F2F f2f = this.A03;
        if (f2f != null) {
            return f2f;
        }
        0qQ.A0F("batchManageFollowRequestsLogger");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        String str = this.A06;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1217778020) {
                if (hashCode != -1067858906) {
                    if (hashCode == 494700669 && str.equals(AnonymousClass000.A00(97))) {
                        return "batch_follow_requests";
                    }
                } else if (str.equals("BATCH_MANAGE_NON_RECIP_FOLLOWERS")) {
                    return "user_list_group_non_recip_followers";
                }
            } else if (str.equals("BATCH_MANAGE_FOLLOWING")) {
                return "batch_following";
            }
            throw AnonymousClass7TE.A15("Invalid entry type for BatchManageUserListFragment");
        }
        0qQ.A0F("batchManageGroup");
        throw AnonymousClass00P.createAndThrow();
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0B);
    }

    public static final void A02(C47520E6g e6g, boolean z) {
        String str;
        FollowStatus followStatus;
        ArrayList A1C = AnonymousClass7TE.A1C();
        C47520E6g e6g2 = e6g;
        ArrayList arrayList = e6g2.A08;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            int i = 0;
            while (true) {
                boolean z2 = z;
                if (it.hasNext()) {
                    int i2 = i + 1;
                    User A0k = DbT.A0k(it);
                    if (DbX.A1a(e6g2.A09.get(A0k))) {
                        DbU.A1V(A0k, A1C);
                        String str2 = e6g2.A06;
                        if (str2 == null) {
                            str = "batchManageGroup";
                            break;
                        }
                        int hashCode = str2.hashCode();
                        if (hashCode != -1217778020) {
                            if (hashCode != -1067858906) {
                                if (hashCode == 494700669 && str2.equals(AnonymousClass000.A00(97))) {
                                    UserSession A0l = AnonymousClass7TE.A0l(e6g2.A0B);
                                    String id = A0k.getId();
                                    if (z) {
                                        DdQ.A00(e6g2, A0l, id, i);
                                    } else {
                                        DdQ.A01(e6g2, A0l, id, i);
                                    }
                                }
                            } else if (str2.equals("BATCH_MANAGE_NON_RECIP_FOLLOWERS")) {
                                if (z) {
                                    F2F A052 = e6g2.A05();
                                    0xF r10 = new 0xF();
                                    0xF.A00(r10, Integer.valueOf(i), "position");
                                    if (A0k.A0N() == AnonymousClass05K.A0C || A0k.A0N() == AnonymousClass05K.A00) {
                                        followStatus = FollowStatus.A07;
                                    } else if (A0k.A28()) {
                                        followStatus = FollowStatus.A04;
                                    } else {
                                        followStatus = FollowStatus.A05;
                                    }
                                    User user = A0k;
                                    C294695ms.A01(r10, A052.A02, (1Xj) null, (UserDetailEntryInfo) null, (SearchContext) null, (C243943aO) null, EWA.UserActionFollow, user, (Double) null, GTO.A00(followStatus), (Long) null, (String) null, (String) null, (String) null, A052.A00.getModuleName(), (String) null, (String) null);
                                } else {
                                    F2F A053 = e6g2.A05();
                                    DbZ.A1S(A053.A01, "remove_follower_dialog_confirmed", A0k.getId());
                                }
                            }
                        } else if (str2.equals("BATCH_MANAGE_FOLLOWING")) {
                            C49175Eqg.A00(e6g2, AnonymousClass7TE.A0l(e6g2.A0B), A0k);
                        }
                    }
                    i = i2;
                } else {
                    Intent A092 = DbS.A09();
                    A092.putExtra("ARG_IS_POSITIVE_ACTION", z2);
                    A092.putStringArrayListExtra("ARG_USER_IDS", A1C);
                    DbX.A17(A092, e6g2);
                    DbT.A1K(e6g2);
                    return;
                }
            }
        } else {
            str = "users";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean onBackPressed() {
        A05().A00("cancel", (Integer) null);
        return false;
    }

    public final void onCreate(Bundle bundle) {
        ArrayList<String> arrayList;
        Boolean bool;
        Boolean bool2;
        String str;
        Boolean bool3;
        String str2;
        int A022 = AnonymousClass0fD.A02(152848720);
        AnonymousClass0eM r4 = this.A0B;
        17i A002 = 17h.A00(AnonymousClass7TE.A0l(r4));
        0qQ.A0B(A002, 0);
        this.A04 = A002;
        Bundle bundle2 = this.mArguments;
        String str3 = null;
        if (bundle2 != null) {
            arrayList = bundle2.getStringArrayList(AnonymousClass000.A00(410));
        } else {
            arrayList = null;
        }
        0qQ.A0C(arrayList, AnonymousClass000.A00(52));
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            bool = DbU.A0g(bundle3, AnonymousClass000.A00(414));
        } else {
            bool = null;
        }
        0qQ.A0C(bool, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = bool.booleanValue();
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            bool2 = DbU.A0g(bundle4, "ARG_IS_FACEPILE_ENABLED");
        } else {
            bool2 = null;
        }
        0qQ.A0C(bool2, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue2 = bool2.booleanValue();
        Bundle bundle5 = this.mArguments;
        if (bundle5 != null) {
            str = bundle5.getString(AnonymousClass000.A00(409));
        } else {
            str = null;
        }
        DbS.A1Y(str);
        0qQ.A0B(str, 0);
        this.A06 = str;
        Bundle bundle6 = this.mArguments;
        if (bundle6 != null) {
            bool3 = DbU.A0g(bundle6, AnonymousClass000.A00(2094));
        } else {
            bool3 = null;
        }
        0qQ.A0C(bool3, "null cannot be cast to non-null type kotlin.Boolean");
        this.A0A = bool3.booleanValue();
        Bundle bundle7 = this.mArguments;
        if (bundle7 != null) {
            str3 = bundle7.getString("ARG_HEADER_TEXT");
        }
        this.A07 = str3;
        Context requireContext = requireContext();
        String str4 = this.A06;
        if (str4 != null) {
            this.A05 = new E9I(requireContext, this, (C229122ms) null, this, str4, booleanValue, booleanValue2, true);
            this.A08 = AnonymousClass7TE.A1C();
            Iterator A1G = AnonymousClass7TE.A1G(arrayList);
            while (A1G.hasNext()) {
                String str5 = (String) AnonymousClass7TF.A0a(A1G);
                17i r0 = this.A04;
                if (r0 != null) {
                    User A023 = r0.A02(str5);
                    if (A023 != null) {
                        ArrayList arrayList2 = this.A08;
                        if (arrayList2 != null) {
                            arrayList2.add(A023);
                        } else {
                            str2 = "users";
                        }
                    }
                } else {
                    str2 = "userCache";
                }
            }
            this.A03 = new F2F(this, AnonymousClass7TE.A0l(r4));
            super.onCreate(bundle);
            AnonymousClass0fD.A09(916558798, A022);
            return;
        }
        str2 = "batchManageGroup";
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-67097572);
        0qQ.A0B(layoutInflater, 0);
        C47520E6g.super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.batch_manage_follow_requests_fragment, false);
        AnonymousClass0fD.A09(2100602898, A022);
        return A0D;
    }
}
