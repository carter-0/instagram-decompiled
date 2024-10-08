package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.user.model.User;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.E5n  reason: case insensitive filesystem */
public final class C47505E5n extends AnonymousClass4DH implements C268594df, C337237fw, G82 {
    public static final String __redex_internal_original_name = "MentionsUserSearchFragment";
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AZV A04;
    public IgdsBottomButtonLayout A05;
    public EW0 A06 = EW0.ANYTIME_MENTION;
    public G6J A07;
    public C337257fy A08;
    public String A09 = "";
    public String A0A = "";
    public String A0B = "";
    public boolean A0C;
    public int A0D;
    public View A0E;
    public RecyclerView A0F;
    public AnonymousClass2t9 A0G;
    public boolean A0H = true;
    public boolean A0I;
    public final String A0J = "anytime_mention_search_sheet";
    public final HashSet A0K = AnonymousClass7TE.A1F();
    public final HashSet A0L = AnonymousClass7TE.A1F();
    public final HashSet A0M = AnonymousClass7TE.A1F();
    public final AnonymousClass0eM A0N = C227642jf.A02(this);
    public final LinkedHashMap A0O = AnonymousClass7TE.A1H();
    public final boolean A0P = true;

    public final int AqL() {
        return -1;
    }

    public final float CMx() {
        return 0.6f;
    }

    public final boolean CZf(User user) {
        return false;
    }

    public final boolean CbR(User user) {
        0qQ.A0B(user, 0);
        if (user.A2G()) {
            HashSet hashSet = this.A0L;
            if (!hashSet.contains(user)) {
                int size = hashSet.size();
                HashSet hashSet2 = this.A0M;
                if (size + hashSet2.size() < this.A01 || hashSet2.contains(user)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final float Cmb() {
        return 1.0f;
    }

    public final void CtI(User user) {
    }

    public final void DMt() {
        this.A0D = 0;
        A00(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        if (r1 == 0) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dam(X.C337257fy r5) {
        /*
            r4 = this;
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.util.LinkedHashMap r3 = r4.A0O
            r3.clear()
            java.lang.Object r0 = r5.Bo1()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r2 = r0.iterator()
        L_0x0013:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0025
            com.instagram.user.model.User r1 = X.DbT.A0k(r2)
            java.lang.String r0 = r1.getId()
            r3.put(r0, r1)
            goto L_0x0013
        L_0x0025:
            java.lang.String r0 = r5.BiY()
            if (r0 == 0) goto L_0x0032
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0033
        L_0x0032:
            r0 = 1
        L_0x0033:
            r4.A01(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47505E5n.Dam(X.7fy):void");
    }

    public final boolean Dw3(User user, boolean z) {
        String str;
        User user2 = user;
        0qQ.A0B(user, 0);
        HashSet hashSet = this.A0L;
        boolean z2 = false;
        if (!hashSet.contains(user)) {
            if (!user.A2G()) {
                Context requireContext = requireContext();
                AnonymousClass0eM r1 = this.A0N;
                FGc.A04(requireContext, AnonymousClass7TE.A0l(r1), user2, (C336187eD) null, "story", (C62320sa) null, (C62320sa) null);
                C49241Erk.A00(DbX.A0P(this, r1), AnonymousClass7TE.A0l(r1), user, "story", "click", AnonymousClass000.A00(84));
            } else {
                int size = hashSet.size();
                HashSet hashSet2 = this.A0M;
                boolean z3 = false;
                if (size + hashSet2.size() >= this.A01) {
                    z3 = true;
                }
                if (!z) {
                    hashSet2.remove(user);
                } else if (z3) {
                    C39582A0y.A00(requireContext(), this.A01);
                    return false;
                } else {
                    hashSet2.add(user);
                }
                AZV azv = this.A04;
                if (azv != null) {
                    str = "model";
                    C387339m3 r0 = azv.A00;
                    if (z) {
                        if (r0 != null) {
                            r0.A06.add(user);
                        }
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                    if (r0 != null) {
                        r0.A06.remove(user);
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                    AZV.A02(azv);
                }
                C337257fy r02 = this.A08;
                if (r02 == null) {
                    str = "searchResultsProvider";
                } else {
                    String BiY = r02.BiY();
                    if (BiY == null || BiY.length() == 0) {
                        z2 = true;
                    }
                    A01(z2);
                    boolean z4 = false;
                    if (hashSet.size() + hashSet2.size() >= this.A01) {
                        z4 = true;
                    }
                    if (z3 != z4) {
                        AnonymousClass2t9 r03 = this.A0G;
                        if (r03 == null) {
                            str = "recyclerViewAdapter";
                        } else {
                            r03.notifyDataSetChanged();
                        }
                    }
                    IgdsBottomButtonLayout igdsBottomButtonLayout = this.A05;
                    if (igdsBottomButtonLayout == null) {
                        str = "actionButton";
                    } else {
                        int i = this.A01;
                        int size2 = hashSet2.size();
                        boolean z5 = false;
                        if (1 <= size2 && size2 <= i) {
                            z5 = true;
                        }
                        igdsBottomButtonLayout.setPrimaryButtonEnabled(z5);
                        return true;
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        return false;
    }

    public final boolean Erf() {
        return true;
    }

    public final void onBottomSheetClosed() {
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        float f = (float) ((-i) - i2);
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A05;
        if (igdsBottomButtonLayout == null) {
            0qQ.A0F("actionButton");
            throw AnonymousClass00P.createAndThrow();
        }
        igdsBottomButtonLayout.setTranslationY(f);
        View view = this.A0E;
        if (view != null) {
            view.setTranslationY(f);
        }
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.07Z, X.0iw, X.G82, X.E5n, androidx.fragment.app.Fragment, java.lang.Object, X.4DH, X.7fw] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        this.A0G = DbU.A0U(AnonymousClass2t9.A00(requireContext), new EG7(this, this));
        RecyclerView A0I2 = DbT.A0I(view, R.id.mention_user_recycler_view);
        A0I2.setItemAnimator((AnonymousClass3AS) null);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext);
        linearLayoutManager.A1o(1);
        A0I2.setLayoutManager(linearLayoutManager);
        A0I2.A0S = true;
        AnonymousClass2t9 r0 = this.A0G;
        if (r0 == null) {
            0qQ.A0F("recyclerViewAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        A0I2.setAdapter(r0);
        this.A0F = A0I2;
        AnonymousClass0eM r2 = this.A0N;
        C337257fy A012 = AnonymousClass8C6.A01(requireContext, AnonymousClass07i.A00(this), AnonymousClass7TE.A0l(r2), C66579MXk.A00(ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI), true, false);
        A012.EcJ(this);
        this.A08 = A012;
        ((IgdsInlineSearchBox) view.requireViewById(R.id.mention_user_sticky_search_box)).A02 = new Fd1(this, 9);
        0lg A0X = DbT.A0X(r2);
        0Tu r5 = 0Tu.A05;
        if (182.A06(r5, A0X, 36327941491145542L)) {
            view.requireViewById(R.id.mention_disclaimer);
        }
        if (this.A0I) {
            Resources resources = requireContext.getResources();
            View A0F2 = DbY.A0F(view, R.id.private_account_mention_toggle_stub);
            IgdsListCell igdsListCell = (IgdsListCell) view.requireViewById(R.id.private_account_mention_toggle);
            igdsListCell.A0G(C69349Njo.TYPE_SWITCH, true);
            igdsListCell.setTitleTextSize(resources.getDimension(R.dimen.add_payment_bottom_sheet_row_subtitle_size));
            igdsListCell.setTitleMaxLines(2);
            int i = 2131969759;
            if (182.A06(r5, DbT.A0X(r2), 36320983644120061L)) {
                i = 2131969760;
            }
            String string = resources.getString(i);
            0qQ.A0A(string);
            igdsListCell.A0I(string);
            igdsListCell.setChecked(this.A0C);
            FdS.A00(igdsListCell, this, 17);
            0qQ.A0A(A0F2);
            0nA.A0p(A0F2, new C51404Fta(A0F2, this));
            this.A0E = A0F2;
        }
        IgdsBottomButtonLayout A0c = DbT.A0c(view, R.id.mention_user_search_action_button);
        if (this.A0H) {
            int i2 = this.A01;
            int size = this.A0M.size();
            boolean z = false;
            if (1 <= size && size <= i2) {
                z = true;
            }
            A0c.setPrimaryButtonEnabled(z);
            A0c.setDividerVisible(!this.A0I);
            A0c.setPrimaryAction(A0c.getResources().getString(2131952258), new FP2((Object) this, 27));
            0nA.A0p(A0c, new C51405Ftb(A0c, this));
        } else {
            A0c.setVisibility(8);
        }
        this.A05 = A0c;
    }

    public static final void A00(C47505E5n e5n) {
        RecyclerView recyclerView = e5n.A0F;
        if (recyclerView == null) {
            0qQ.A0F("recyclerView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            0nA.A0X(recyclerView, e5n.A0D + e5n.A00 + e5n.A03);
        }
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final View C4U() {
        return this.mView;
    }

    public final int C8P() {
        return 0;
    }

    public final boolean CPc() {
        return this.A0P;
    }

    public final void DMu(int i) {
        this.A0D = i;
        A00(this);
    }

    public final String getModuleName() {
        return this.A0J;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0N);
    }

    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A0F;
        if (recyclerView != null) {
            if (recyclerView.getChildCount() != 0) {
                RecyclerView recyclerView2 = this.A0F;
                if (recyclerView2 != null) {
                    if (recyclerView2.computeVerticalScrollOffset() == 0) {
                        return true;
                    }
                    return false;
                }
            }
            return true;
        }
        0qQ.A0F("recyclerView");
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A01(boolean z) {
        ViewModelListUpdate A0R = DbS.A0R();
        HashSet hashSet = this.A0L;
        Iterator A1G = AnonymousClass7TE.A1G(hashSet);
        while (A1G.hasNext()) {
            User user = (User) AnonymousClass7TF.A0a(A1G);
            A0R.A00(new FY5(new F06(user, user.getUsername(), user.getFullName(), DbS.A0o(user), true)));
        }
        if (z) {
            Iterator A1G2 = AnonymousClass7TE.A1G(this.A0K);
            while (A1G2.hasNext()) {
                User user2 = (User) AnonymousClass7TF.A0a(A1G2);
                A0R.A00(new FY5(new F06(user2, user2.getUsername(), user2.getFullName(), DbS.A0o(user2), this.A0M.contains(user2))));
            }
        }
        HashSet hashSet2 = this.A0M;
        Iterator A1G3 = AnonymousClass7TE.A1G(hashSet2);
        while (A1G3.hasNext()) {
            User user3 = (User) AnonymousClass7TF.A0a(A1G3);
            if ((!z || !this.A0K.contains(user3)) && !this.A0O.containsKey(user3.getId())) {
                A0R.A00(new FY5(new F06(user3, user3.getUsername(), user3.getFullName(), DbS.A0o(user3), true)));
            }
        }
        Iterator A0s = AnonymousClass7TF.A0s(this.A0O);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            String A13 = DbT.A13(A1J);
            User user4 = (User) A1J.getValue();
            if (!2R8.A05(AnonymousClass7TE.A0l(this.A0N), A13) && !hashSet.contains(user4)) {
                if (!z || !this.A0K.contains(user4)) {
                    A0R.A00(new FY5(new F06(user4, user4.getUsername(), user4.getFullName(), DbS.A0o(user4), hashSet2.contains(user4))));
                }
            }
        }
        AnonymousClass2t9 r1 = this.A0G;
        if (r1 == null) {
            0qQ.A0F("recyclerViewAdapter");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r1.A05(A0R);
        }
    }

    public final int AhP(Context context) {
        return Dbb.A02(context);
    }

    public final /* synthetic */ float CoU() {
        return 0.6f;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1533691926);
        C47505E5n.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A0I = requireArguments.getBoolean("ARGS_SHOULD_SHOW_PRIVACY_TOGGLE");
        this.A0C = requireArguments.getBoolean("ARGS_MENTION_SHARING_ENABLED");
        this.A01 = requireArguments.getInt("ARGS_MAX_MENTION_COUNT");
        String string = requireArguments.getString("ARGS_MEDIA_ID");
        String str = "";
        if (string == null) {
            string = str;
        }
        this.A09 = string;
        String string2 = requireArguments.getString("ARGS_MEDIA_TYPE");
        if (string2 == null) {
            string2 = str;
        }
        this.A0A = string2;
        this.A02 = requireArguments.getInt("ARGS_MEDIA_POSITION");
        String string3 = requireArguments.getString("ARGS_SESSION_ID");
        if (string3 != null) {
            str = string3;
        }
        this.A0B = str;
        EW0 ew0 = (EW0) EW0.A01.get(requireArguments.getString("ARGS_ENTRY_POINT"));
        if (ew0 == null) {
            ew0 = EW0.ANYTIME_MENTION;
        }
        this.A06 = ew0;
        requireArguments.getString("ARGS_TITLE");
        this.A0H = requireArguments.getBoolean("ARGS_HAS_ACTION_BUTTON");
        AnonymousClass0fD.A09(403673716, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1761593195);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.mention_user_search_fragment, false);
        AnonymousClass0fD.A09(-1847286386, A022);
        return A0D2;
    }
}
