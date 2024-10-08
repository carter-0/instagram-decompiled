package X;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

public final class E7Q extends MYR implements AnonymousClass4DS, C252213ok, C337267fz {
    public static final String __redex_internal_original_name = "DiscoverPeopleQuickFriendingFragment";
    public ViewGroup A00;
    public LinearLayout A01;
    public ShimmerFrameLayout A02;
    public ShimmerFrameLayout A03;
    public AnonymousClass0iw A04;
    public C46768Dkv A05;
    public C51950G8t A06;
    public C47290DuJ A07;
    public C50915Fku A08;
    public C14221Ts1 A09;
    public ProgressButton A0A;
    public SearchEditText A0B;
    public C230012om A0C;
    public HashSet A0D = AnonymousClass7TE.A1F();
    public boolean A0E;
    public int A0F;
    public TextView A0G;
    public 2da A0H;
    public AnonymousClass3E6 A0I;
    public FEU A0J;
    public final String A0K = "dp_nux_quick_friending";
    public final ArrayList A0L = AnonymousClass7TE.A1C();
    public final HashMap A0M = AnonymousClass7TE.A1E();
    public final HashMap A0N = AnonymousClass7TE.A1E();
    public final HashSet A0O = AnonymousClass7TE.A1F();
    public final HashSet A0P = AnonymousClass7TE.A1F();
    public final LinkedHashSet A0Q = DbS.A0y();
    public final AnonymousClass0eM A0R = C227642jf.A02(this);

    public final /* synthetic */ 1OC AMw(C15050ULg uLg, String str) {
        return A1E.A00(uLg, this, str);
    }

    public final 1OC AMx(String str, String str2) {
        0qQ.A0B(str, 0);
        AnonymousClass0eM r0 = this.A0R;
        return C18242Vo9.A00(FFZ.A00(AnonymousClass7TE.A0l(r0)), AnonymousClass7TE.A0l(r0), str, "discover_people_nux_quick_friending");
    }

    public final /* synthetic */ void DeG(C15050ULg uLg) {
        AnonymousClass9V2.A02(uLg, this);
    }

    public final void DeH(String str) {
    }

    public final /* synthetic */ void DeJ(C15050ULg uLg, C268654dm r2) {
        AnonymousClass9V2.A01(uLg, r2, this);
    }

    public final /* synthetic */ void DeT(C15050ULg uLg) {
        AnonymousClass9V2.A03(uLg, this);
    }

    public final void DeW(String str) {
    }

    public final /* synthetic */ void Dej(C15050ULg uLg) {
        AnonymousClass9V2.A04(uLg, this);
    }

    public final /* synthetic */ void Der(C15050ULg uLg, AnonymousClass1XT r2) {
        AnonymousClass9V2.A00(uLg, r2, this);
    }

    public final /* synthetic */ void Dnw(boolean z) {
    }

    public final void configureActionBar(2da r6) {
        int i;
        0qQ.A0B(r6, 0);
        this.A0H = r6;
        r6.setTitle(getString(2131961025));
        this.A06 = C49047EoR.A00(this);
        r6.Eu4(false);
        1AA A022 = 182.A02(DbT.A0X(this.A0R), 37167521698611652L);
        if (A022 != null) {
            i = Double.valueOf(A022.Aym(0Tu.A04, 37167521698611652L));
        } else {
            i = 0;
        }
        AnonymousClass7TF.A0D().postDelayed(new C51234Fqp(this), TimeUnit.SECONDS.toMillis(AnonymousClass7TE.A0R(i)));
    }

    public final String getModuleName() {
        return "discover_people_nux_quick_friending";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = (LinearLayout) view.requireViewById(R.id.footer_container);
        View requireViewById = view.requireViewById(R.id.progress_button);
        0qQ.A0C(requireViewById, "null cannot be cast to non-null type com.instagram.ui.widget.progressbutton.ProgressButton");
        ProgressButton progressButton = (ProgressButton) requireViewById;
        this.A0A = progressButton;
        if (progressButton != null) {
            FP0.A00(progressButton, 47, this);
        }
        ProgressButton progressButton2 = this.A0A;
        if (progressButton2 != null) {
            progressButton2.setEnabled(false);
        }
        ProgressButton progressButton3 = this.A0A;
        if (progressButton3 != null) {
            progressButton3.setText(2131962530);
        }
        this.A02 = (ShimmerFrameLayout) view.requireViewById(R.id.progress_container);
        int i = this.A0F;
        int i2 = R.id.progress_subtitle_bottom;
        if (i > 0) {
            i2 = R.id.progress_subtitle_top;
        }
        TextView A0R2 = AnonymousClass7TG.A0R(view, i2);
        this.A0G = A0R2;
        String str = "progressSubtitle";
        if (A0R2 != null) {
            A0R2.setVisibility(0);
            boolean z = this.A0E;
            ProgressButton progressButton4 = this.A0A;
            if (z) {
                if (progressButton4 != null) {
                    DbU.A11(requireContext(), progressButton4, R.drawable.shimmer_rounded_rect);
                    progressButton4.setText((CharSequence) "");
                    progressButton4.setEnabled(false);
                }
                TextView textView = this.A0G;
                if (textView != null) {
                    DbU.A11(requireContext(), textView, R.drawable.shimmer_rounded_rect);
                    textView.setText("");
                }
            } else {
                if (progressButton4 != null) {
                    progressButton4.setText(2131962530);
                }
                ShimmerFrameLayout shimmerFrameLayout = this.A02;
                if (shimmerFrameLayout == null) {
                    str = "progressContainer";
                } else {
                    shimmerFrameLayout.A04((AnonymousClass3O5) null);
                }
            }
            C46864Dmg.A00(getRecyclerView(), this, 8);
            ViewGroup A0I2 = DbX.A0I(view, R.id.search_bar);
            0nA.A0Z(A0I2, 12);
            0nA.A0b(A0I2, 12);
            View childAt = A0I2.getChildAt(0);
            0qQ.A0C(childAt, AnonymousClass000.A00(1640));
            SearchEditText searchEditText = (SearchEditText) childAt;
            this.A0B = searchEditText;
            str = "searchEditText";
            if (searchEditText != null) {
                FPM.A00(searchEditText, 12, this);
                if (this.A0E) {
                    SearchEditText searchEditText2 = this.A0B;
                    if (searchEditText2 != null) {
                        searchEditText2.setEnabled(false);
                    }
                }
                ColorFilter A0A2 = Dbb.A0A(requireContext(), this);
                SearchEditText searchEditText3 = this.A0B;
                if (searchEditText3 != null) {
                    Drawable drawable = searchEditText3.getCompoundDrawablesRelative()[0];
                    if (drawable != null) {
                        drawable.mutate();
                        drawable.setAlpha(51);
                        drawable.setColorFilter(A0A2);
                    }
                    C50915Fku fku = this.A08;
                    if (fku == null) {
                        str = "searchBarController";
                    } else {
                        SearchEditText searchEditText4 = this.A0B;
                        if (searchEditText4 != null) {
                            fku.A00(searchEditText4, !this.A0E);
                            this.A03 = (ShimmerFrameLayout) view.requireViewById(R.id.search_bar_container);
                            this.A00 = DbU.A0C(view, R.id.search_bar);
                            if (!this.A0E) {
                                ShimmerFrameLayout shimmerFrameLayout2 = this.A03;
                                if (shimmerFrameLayout2 == null) {
                                    str = "searchBarContainer";
                                } else {
                                    shimmerFrameLayout2.A04((AnonymousClass3O5) null);
                                }
                            }
                            A04(this);
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final AnonymousClass6KM A00(C47217Dt4 dt4, int i) {
        User user = dt4.A00;
        if (user == null) {
            return null;
        }
        AnonymousClass6KM r1 = new AnonymousClass6KM("discover_people_nux_quick_friending", user.getId(), "discover_people_nux_quick_friending");
        String str = dt4.A05;
        if (str != null) {
            r1.A07 = str;
        }
        r1.A00 = i;
        String str2 = dt4.A02;
        if (str2 != null) {
            r1.A04 = str2;
        }
        return r1;
    }

    public static final void A03(E7Q e7q) {
        C47290DuJ duJ = e7q.A07;
        if (duJ == null) {
            0qQ.A0F("perfLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        duJ.A0E("fetch_request_start");
        1OC A022 = C46396DeJ.A02(AnonymousClass7TE.A0l(e7q.A0R), (String) null, (String) null, (String) null, true, false);
        A022.A00 = new ECM(e7q);
        e7q.schedule(A022);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.07Z, X.E7Q, java.lang.Object, X.MYR] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.E7Q r7) {
        /*
            X.DuJ r0 = r7.A07
            java.lang.String r6 = "perfLogger"
            r1 = 0
            if (r0 == 0) goto L_0x006d
            X.34p r0 = r0.A00
            r5 = 1
            r0.A08(r1)
            X.DuJ r1 = r7.A07
            if (r1 == 0) goto L_0x006d
            java.lang.String r0 = "get_users_start"
            r1.A0E(r0)
            r2 = 36323096768228182(0x810baa00032b56, double:3.034210885373878E-306)
            X.Dkv r0 = r7.A05
            java.lang.String r6 = "suggestionsViewModel"
            if (r0 == 0) goto L_0x006d
            X.05G r0 = r0.A01
            boolean r0 = X.DbX.A1b(r0)
            if (r0 == 0) goto L_0x0052
            X.0eM r4 = r7.A0R
            X.0lg r0 = X.DbT.A0X(r4)
            X.1AA r1 = X.182.A02(r0, r2)
            if (r1 == 0) goto L_0x0052
            X.0Tu r0 = X.0Tu.A04
            boolean r0 = r1.Ah0(r0, r2)
            if (r0 != r5) goto L_0x0052
            X.Dkv r0 = r7.A05
            if (r0 == 0) goto L_0x006d
            X.05G r0 = r0.A00
            boolean r0 = X.DbX.A1b(r0)
            r4.getValue()
            if (r0 != 0) goto L_0x0056
            r0 = 1001137806(0x3bac268e, float:0.0052536195)
            r7.A0C(r0)
        L_0x0052:
            A03(r7)
            return
        L_0x0056:
            r0 = 1001144203(0x3bac3f8b, float:0.0052565983)
            r7.A0C(r0)
            X.JXP r1 = X.JXP.LOADING
            X.0sn r0 = X.0sn.A00
            r7.updateUi(r1, r0)
            X.0xx r1 = X.DbW.A0E(r7)
            r0 = 46
            X.C51645Fy4.A01(r7, r1, r0)
            return
        L_0x006d:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E7Q.A04(X.E7Q):void");
    }

    public static final void A05(E7Q e7q) {
        String str;
        if (e7q.A0E) {
            ProgressButton progressButton = e7q.A0A;
            if (progressButton != null) {
                DbU.A11(e7q.requireContext(), progressButton, R.drawable.reg_blue_button_background__filled_blue_disabled_progress);
                progressButton.setText(2131962530);
                progressButton.setEnabled(AnonymousClass7TF.A1R(e7q.A0O.size() + e7q.A0Q.size()));
            }
            TextView textView = e7q.A0G;
            if (textView == null) {
                str = "progressSubtitle";
            } else {
                textView.setBackground((Drawable) null);
                DbU.A1G(textView, e7q, 2131961023);
                ShimmerFrameLayout shimmerFrameLayout = e7q.A02;
                if (shimmerFrameLayout == null) {
                    str = "progressContainer";
                } else {
                    shimmerFrameLayout.A03();
                    shimmerFrameLayout.A04((AnonymousClass3O5) null);
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A06(E7Q e7q) {
        String str;
        if (e7q.A0E) {
            ShimmerFrameLayout shimmerFrameLayout = e7q.A03;
            if (shimmerFrameLayout == null) {
                str = "searchBarContainer";
            } else {
                shimmerFrameLayout.A03();
                shimmerFrameLayout.A04((AnonymousClass3O5) null);
                SearchEditText searchEditText = e7q.A0B;
                if (searchEditText == null) {
                    str = "searchEditText";
                } else {
                    searchEditText.setSearchIconEnabled(true);
                    searchEditText.setHint(2131961024);
                    searchEditText.setEnabled(true);
                    ViewGroup viewGroup = e7q.A00;
                    if (viewGroup == null) {
                        str = "searchBar";
                    } else {
                        DbU.A11(e7q.requireContext(), viewGroup, R.drawable.searchbar_background);
                        return;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A07(E7Q e7q) {
        2da r3 = e7q.A0H;
        if (r3 != null) {
            r3.ErE(new FP0((Object) e7q, 48), 2131973916);
            e7q.A0H = null;
        }
    }

    public final /* synthetic */ boolean Cch() {
        return false;
    }

    public final void DMr(int i, boolean z) {
        if (i == 0) {
            AnonymousClass7TF.A16(this.A01);
            SearchEditText searchEditText = this.A0B;
            if (searchEditText == null) {
                0qQ.A0F("searchEditText");
                throw AnonymousClass00P.createAndThrow();
            } else {
                searchEditText.clearFocus();
            }
        }
    }

    public final void DeM(C268654dm r3, String str) {
        C14221Ts1 ts1 = this.A09;
        if (ts1 == null) {
            0qQ.A0F("typeaheadManager");
            throw AnonymousClass00P.createAndThrow();
        } else if (!ts1.A04()) {
            updateUi(JXP.ERROR, 0sn.A00);
        }
    }

    public final void Dem(String str) {
        C50915Fku fku = this.A08;
        if (fku == null) {
            0qQ.A0F("searchBarController");
            throw AnonymousClass00P.createAndThrow();
        } else if (fku.A01.length() > 0) {
            updateUi(JXP.LOADING, 0sn.A00);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        if (r5.A0O.contains(r1) != false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void Dev(X.AnonymousClass1XT r18, java.lang.String r19) {
        /*
            r17 = this;
            r1 = r18
            X.Nfd r1 = (X.C69154Nfd) r1
            r0 = r19
            boolean r4 = X.AnonymousClass7TG.A1Z(r0, r1)
            r5 = r17
            X.Ts1 r0 = r5.A09
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = "typeaheadManager"
        L_0x0012:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001a:
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x0096
            X.Fku r0 = r5.A08
            if (r0 != 0) goto L_0x0027
            java.lang.String r0 = "searchBarController"
            goto L_0x0012
        L_0x0027:
            java.lang.String r0 = r0.A01
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0096
            java.util.List r0 = r1.A01
            if (r0 == 0) goto L_0x0096
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r0.iterator()
        L_0x003b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0093
            com.instagram.user.model.User r1 = X.DbT.A0k(r7)
            java.lang.String r11 = r1.getFullName()
            java.lang.String r12 = r1.getUsername()
            com.instagram.common.typedurl.ImageUrl r9 = r1.Bh3()
            java.lang.String r13 = X.DbS.A0o(r1)
            X.Exx r10 = new X.Exx
            r10.<init>(r5, r1, r4)
            java.util.LinkedHashSet r0 = r5.A0Q
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x006b
            java.util.HashSet r0 = r5.A0O
            boolean r0 = r0.contains(r1)
            r15 = 0
            if (r0 == 0) goto L_0x006c
        L_0x006b:
            r15 = 1
        L_0x006c:
            boolean r0 = r1.isVerified()
            if (r0 == 0) goto L_0x0087
            X.0eM r0 = r5.A0R
            X.0lg r6 = X.DbT.A0X(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327378850429320(0x810f8f00003988, double:3.036918891400439E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            r16 = 1
            if (r0 != 0) goto L_0x0089
        L_0x0087:
            r16 = 0
        L_0x0089:
            r14 = -1
            X.DtW r8 = new X.DtW
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r3.add(r8)
            goto L_0x003b
        L_0x0093:
            r5.A0B(r3)
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E7Q.Dev(X.1XT, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v0, types: [X.2tF, java.lang.Object] */
    public final Collection getDefinitions() {
        return 0sr.A1P(new C232232tF[]{new Object(), new Object()});
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(C51824G3i.A00);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0R);
    }

    private final ArrayList A01() {
        boolean z;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator A1G = AnonymousClass7TE.A1G(this.A0Q);
        while (A1G.hasNext()) {
            User user = (User) AnonymousClass7TF.A0a(A1G);
            String fullName = user.getFullName();
            String username = user.getUsername();
            ImageUrl Bh3 = user.Bh3();
            String A0o = DbS.A0o(user);
            C49562Exx exx = new C49562Exx(this, user, true);
            if (user.isVerified()) {
                z = true;
                if (182.A06(0Tu.A05, DbT.A0X(this.A0R), 36327378850429320L)) {
                    A1C.add(new C47245DtW(Bh3, exx, fullName, username, A0o, -1, true, z));
                }
            }
            z = false;
            A1C.add(new C47245DtW(Bh3, exx, fullName, username, A0o, -1, true, z));
        }
        return A1C;
    }

    public static final ArrayList A02(E7Q e7q) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A012 = e7q.A01();
        A1C.addAll(e7q.A01());
        ArrayList A0r = AnonymousClass7TG.A0r(A012);
        Iterator it = A012.iterator();
        while (it.hasNext()) {
            A0r.add(((C47245DtW) it.next()).A06);
        }
        HashSet hashSet = new HashSet(A0r);
        ArrayList arrayList = e7q.A0L;
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!hashSet.contains(((C47245DtW) next).A06)) {
                A1C2.add(next);
            }
        }
        A1C.addAll(A1C2);
        return A1C;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0054, code lost:
        if (X.182.A06(X.0Tu.A05, X.DbT.A0X(r5.A0R), 36327378850429320L) == false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A08(X.E7Q r20, java.util.List r21) {
        /*
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r10 = r21.iterator()
            r6 = 0
        L_0x0009:
            boolean r0 = r10.hasNext()
            r5 = r20
            if (r0 == 0) goto L_0x0086
            int r9 = r6 + 1
            java.lang.Object r3 = r10.next()
            X.Dt4 r3 = (X.C47217Dt4) r3
            com.instagram.user.model.User r4 = r3.A00
            if (r4 == 0) goto L_0x0084
            int r0 = r5.A0F
            r18 = 0
            if (r6 >= r0) goto L_0x0025
            r18 = 1
        L_0x0025:
            java.lang.String r14 = r4.getFullName()
            java.lang.String r15 = r4.getUsername()
            com.instagram.common.typedurl.ImageUrl r12 = r4.Bh3()
            java.lang.String r16 = X.DbS.A0o(r4)
            r0 = 0
            X.Exx r13 = new X.Exx
            r13.<init>(r5, r4, r0)
            boolean r0 = r4.isVerified()
            if (r0 == 0) goto L_0x0056
            X.0eM r0 = r5.A0R
            X.0lg r8 = X.DbT.A0X(r0)
            X.0Tu r7 = X.0Tu.A05
            r0 = 36327378850429320(0x810f8f00003988, double:3.036918891400439E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            r19 = 1
            if (r0 != 0) goto L_0x0058
        L_0x0056:
            r19 = 0
        L_0x0058:
            X.DtW r11 = new X.DtW
            r17 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r2.add(r11)
            if (r18 == 0) goto L_0x007b
            java.util.HashSet r0 = r5.A0O
            r0.add(r4)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.util.HashMap r1 = r5.A0M
            java.lang.String r0 = r4.getUsername()
            r1.put(r0, r6)
            java.util.HashSet r0 = r5.A0D
            r0.add(r4)
        L_0x007b:
            java.util.HashMap r1 = r5.A0N
            java.lang.String r0 = r4.getUsername()
            r1.put(r0, r3)
        L_0x0084:
            r6 = r9
            goto L_0x0009
        L_0x0086:
            java.util.ArrayList r0 = r5.A0L
            r0.clear()
            r0.addAll(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E7Q.A08(X.E7Q, java.util.List):void");
    }

    public final void A0C(int i) {
        0f9 A002 = 0wj.A00(getClass().getSimpleName(), i, true);
        A002.ABQ("ci_nux_qf_iterations", "Checking whether cache results are available on load.");
        A002.report();
    }

    public final AnonymousClass4D6 Bpf() {
        return 1ES.A01();
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.Dbx, X.DuJ, X.MYU] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0064, code lost:
        if (r6.Ah0(X.0Tu.A04, 36323096768293719L) != true) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r16) {
        /*
            r15 = this;
            r0 = -962525116(0xffffffffc6a10844, float:-20612.133)
            int r3 = X.AnonymousClass0fD.A02(r0)
            r10 = r15
            r0 = r16
            X.E7Q.super.onCreate(r0)
            X.0eM r5 = r15.A0R
            X.0lg r0 = X.DbT.A0X(r5)
            r1 = 36604571744736324(0x820baa00001444, double:3.2122167939263835E-306)
            X.1AA r4 = X.182.A02(r0, r1)
            if (r4 == 0) goto L_0x0027
            X.0Tu r0 = X.0Tu.A04
            long r1 = r4.BOa(r0, r1)
            int r0 = (int) r1
            r15.A0F = r0
        L_0x0027:
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r5)
            r9 = 0
            X.7g1 r12 = new X.7g1
            r12.<init>()
            r14 = 0
            r7 = 1
            java.lang.Integer r13 = X.AnonymousClass05K.A00
            r11 = r9
            X.Ts1 r0 = X.C14225Ts5.A01(r8, r9, r10, r11, r12, r13, r14)
            r15.A09 = r0
            java.lang.String r1 = X.AnonymousClass7TG.A0j()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            X.8av r0 = X.C358428at.A00(r15, r0, r1)
            X.Fkt r8 = new X.Fkt
            r8.<init>(r15, r0)
            X.0lg r2 = X.DbT.A0X(r5)
            r0 = 36323096768293719(0x810baa00042b57, double:3.034210885415324E-306)
            X.1AA r6 = X.182.A02(r2, r0)
            r4 = 0
            if (r6 == 0) goto L_0x0066
            X.0Tu r2 = X.0Tu.A04
            boolean r1 = r6.Ah0(r2, r0)
            r0 = 1
            if (r1 == r7) goto L_0x0067
        L_0x0066:
            r0 = 0
        L_0x0067:
            r15.A0E = r0
            if (r0 != 0) goto L_0x006e
            r4 = 2131961024(0x7f1324c0, float:1.9558733E38)
        L_0x006e:
            X.Fku r0 = new X.Fku
            r0.<init>(r8, r4)
            r15.A08 = r0
            X.3E5 r0 = X.AnonymousClass3E4.A01(r15, r14, r7)
            r15.A0I = r0
            r0.A9Y(r15)
            X.FUC r0 = new X.FUC
            r0.<init>()
            r15.A04 = r0
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r5)
            X.0iw r1 = r15.A04
            java.lang.String r6 = "analyticsModule"
            if (r1 == 0) goto L_0x00d4
            X.2om r0 = new X.2om
            r0.<init>(r1, r2)
            r15.A0C = r0
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r5)
            java.lang.String r2 = "quick_friending"
            r0 = 31800709(0x1e53d85, float:8.420959E-38)
            X.0qQ.A0B(r4, r7)
            X.DuJ r1 = new X.DuJ
            r1.<init>(r4, r2, r0)
            r15.A07 = r1
            android.content.Context r0 = r15.requireContext()
            X.DbY.A0v(r0, r1, r15, r5)
            X.2YN r1 = X.DbW.A0F(r15)
            java.lang.Class<X.Dkv> r0 = X.C46768Dkv.class
            X.2YL r0 = r1.A00(r0)
            X.Dkv r0 = (X.C46768Dkv) r0
            r15.A05 = r0
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r5)
            X.0iw r1 = r15.A04
            if (r1 == 0) goto L_0x00d4
            X.FEU r0 = new X.FEU
            r0.<init>(r1, r2)
            r15.A0J = r0
            r0 = 670287899(0x27f3c81b, float:6.7663004E-15)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        L_0x00d4:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E7Q.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1443094475);
        0qQ.A0B(layoutInflater, 0);
        C49938FFr.A01(DbT.A0X(this.A0R), this.A0K);
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        AnonymousClass0fD.A09(951250910, A022);
        return onCreateView;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(23101998);
        super.onDestroyView();
        this.A01 = null;
        AnonymousClass3E6 r0 = this.A0I;
        if (r0 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.EEH(this);
        AnonymousClass0fD.A09(538422257, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1928137893);
        E7Q.super.onStart();
        AnonymousClass3E6 r1 = this.A0I;
        if (r1 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        r1.DmJ(requireActivity());
        AnonymousClass0fD.A09(-974460664, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-843188977);
        E7Q.super.onStop();
        AnonymousClass3E6 r0 = this.A0I;
        if (r0 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.onStop();
        AnonymousClass0fD.A09(-1086315825, A022);
    }

    public final /* synthetic */ 1GP AMy(C15050ULg uLg, String str) {
        return null;
    }
}
