package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.Uc7  reason: case insensitive filesystem */
public final class C15401Uc7 extends C273374mT implements AnonymousClass4DR {
    public static final C63903LBj A0M = new Object();
    public static final String __redex_internal_original_name = "PeopleTagSearchFragment";
    public int A00;
    public ContextThemeWrapper A01;
    public ListView A02;
    public IgdsInlineSearchBox A03;
    public C14221Ts1 A04;
    public X76 A05;
    public C18012Vjo A06;
    public Integer A07 = AnonymousClass05K.A0C;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public int A0E;
    public C358448av A0F;
    public WGQ A0G;
    public String A0H = "";
    public boolean A0I;
    public boolean A0J;
    public final C19551Wbb A0K = new C19551Wbb(this, 3);
    public final C17280VPh A0L = new C17280VPh(this);

    public static final void A02(C15401Uc7 uc7, String str) {
        uc7.A0C = false;
        uc7.A0H = str;
        C18012Vjo vjo = uc7.A06;
        String str2 = "adapter";
        if (vjo != null) {
            vjo.A00 = str;
            ((C14200Trf) vjo.A02.getValue()).A04();
            C15475UdQ udQ = (C15475UdQ) vjo.A05.getValue();
            udQ.A01();
            udQ.updateListView();
            if (uc7.A0H.length() == 0) {
                AnonymousClass7TH.A0R(uc7.A02);
                C18012Vjo vjo2 = uc7.A06;
                if (vjo2 != null) {
                    vjo2.A00();
                    return;
                }
            } else {
                if (!uc7.A0J) {
                    uc7.A0J = true;
                    C358448av r0 = uc7.A0F;
                    if (r0 == null) {
                        str2 = "searchLogger";
                    } else {
                        r0.CkS();
                    }
                }
                ListView listView = uc7.A02;
                if (listView != null) {
                    listView.setVisibility(0);
                }
                C18012Vjo vjo3 = uc7.A06;
                if (vjo3 != null) {
                    if (G9t.A1b(vjo3.A03)) {
                        C14221Ts1 ts1 = uc7.A04;
                        if (ts1 == null) {
                            str2 = "queuedTypeaheadManager";
                        } else {
                            ts1.A06(uc7.A0H);
                        }
                    }
                    C18012Vjo vjo4 = uc7.A06;
                    if (vjo4 != null) {
                        vjo4.A01(C13991Tnr.A0d(uc7, uc7.A0H, 2131972817), uc7.A00, false);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "collaborator_search";
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("HAS_USER_TYPED_SOMETHING", this.A0J);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C18012Vjo vjo = this.A06;
        String str = "adapter";
        if (vjo != null) {
            boolean A1b = G9t.A1b(vjo.A03);
            ListView listView = this.A02;
            if (A1b) {
                if (listView != null) {
                    DbT.A16(getThemedContext(), listView, 2Yu.A0C(getThemedContext()));
                }
            } else if (listView != null) {
                Pxf.A1B(listView, 2Yu.A0F(getThemedContext(), R.attr.peopleTagSearchBackground));
            }
            ListView listView2 = this.A02;
            if (listView2 != null) {
                listView2.setCacheColorHint(2Yu.A0F(getThemedContext(), R.attr.peopleTagSearchCacheColorHint));
            }
            ListView listView3 = this.A02;
            if (listView3 != null) {
                C18012Vjo vjo2 = this.A06;
                if (vjo2 != null) {
                    listView3.setAdapter((2Rv) vjo2.A05.getValue());
                }
            }
            IgdsInlineSearchBox igdsInlineSearchBox = this.A03;
            if (igdsInlineSearchBox != null) {
                igdsInlineSearchBox.A0E.requestFocus();
            }
            IgdsInlineSearchBox igdsInlineSearchBox2 = this.A03;
            if (igdsInlineSearchBox2 != null) {
                igdsInlineSearchBox2.A04();
            }
            WGQ wgq = this.A0G;
            if (wgq == null) {
                str = "facebookInviteEventLogger";
            } else {
                C18012Vjo vjo3 = this.A06;
                if (vjo3 != null) {
                    int count = ((2Rv) vjo3.A05.getValue()).getCount();
                    0qQ.A0B(getSession(), 1);
                    0xI A002 = 0xI.A00(wgq.A00, "search_list_ig_fb_toggle");
                    A002.A0C("referring_screen", AnonymousClass000.A00(3745));
                    A002.A0C("invite_flow", "fb");
                    A002.A0C("extra_action", "page_loaded");
                    A002.A08(Integer.valueOf(count), "ig_count");
                    DbU.A1R(A002, wgq.A01);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(C15401Uc7 uc7, User user, int i) {
        C358448av r0 = uc7.A0F;
        if (r0 == null) {
            0qQ.A0F("searchLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        String id = user.getId();
        Integer num = AnonymousClass05K.A0N;
        r0.CkL(OVV.A00((Integer) null, "server_results", id, "USER", (String) null, "server"), num, AnonymousClass05K.A0C, uc7.A0H, "", i);
    }

    /* renamed from: A03 */
    public final ContextThemeWrapper getThemedContext() {
        ContextThemeWrapper contextThemeWrapper = this.A01;
        if (contextThemeWrapper != null) {
            return contextThemeWrapper;
        }
        0qQ.A0F("themedContext");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean onBackPressed() {
        X76 x76 = this.A05;
        if (x76 == null) {
            return true;
        }
        x76.AVW();
        return true;
    }

    public static final void A01(C15401Uc7 uc7, User user, int i) {
        FragmentActivity requireActivity;
        C358248ab r2;
        int i2;
        String A0b;
        Boolean Ak3;
        if (0qQ.A0K(user.getId(), uc7.getSession().A06)) {
            FragmentActivity requireActivity2 = uc7.requireActivity();
            r2 = new C358248ab((Activity) requireActivity2);
            A0b = requireActivity2.getString(2131954748);
        } else if (ORH.A00(uc7.getSession(), user)) {
            C49926FFc.A03(uc7.requireActivity(), uc7, uc7.getSession(), uc7.A0D);
            0wc A012 = AnonymousClass0kN.A01(uc7, uc7.getSession());
            UserSession session = uc7.getSession();
            0qQ.A0B(session, 1);
            String str = session.A06;
            String id = user.getId();
            boolean A0Q = AnonymousClass2f1.A00(session).A0Q(user);
            HashMap A0q = DbZ.A0q();
            0Aj A0e = AnonymousClass7TE.A0e(A012, "ig_wellbeing_tag_controls_action");
            A0e.A9F(C273654mx.A00(230), DbV.A0q(str));
            DbS.A1J(A0e, "click");
            DbS.A1H(A0e, "non_taggable_user_in_search_collab");
            A0e.A9F("ig_userid", AnonymousClass7TE.A10(id));
            A0e.A7p(AnonymousClass000.A00(311), Boolean.valueOf(A0Q));
            A0e.A9H(AnonymousClass000.A00(1333), A0q);
            A0e.Cgf();
        } else {
            Boolean Ak2 = user.A03.Ak2();
            if (Ak2 == null || !Ak2.booleanValue()) {
                requireActivity = uc7.requireActivity();
                r2 = new C358248ab((Activity) requireActivity);
                i2 = 2131954746;
            } else if (uc7.A08 == null || (Ak3 = user.A03.Ak3()) == null || Ak3.booleanValue()) {
                A00(uc7, user, i);
                X76 x76 = uc7.A05;
                if (x76 != null) {
                    x76.AAN(user, true);
                    return;
                }
                return;
            } else {
                requireActivity = uc7.requireActivity();
                r2 = new C358248ab((Activity) requireActivity);
                i2 = 2131954747;
            }
            A0b = DbY.A0b(requireActivity, user, i2);
        }
        r2.A0q(A0b);
        r2.A06();
        DbT.A1V(r2);
        0wc A0122 = AnonymousClass0kN.A01(uc7, uc7.getSession());
        UserSession session2 = uc7.getSession();
        0qQ.A0B(session2, 1);
        String str2 = session2.A06;
        String id2 = user.getId();
        boolean A0Q2 = AnonymousClass2f1.A00(session2).A0Q(user);
        HashMap A0q2 = DbZ.A0q();
        0Aj A0e2 = AnonymousClass7TE.A0e(A0122, "ig_wellbeing_tag_controls_action");
        A0e2.A9F(C273654mx.A00(230), DbV.A0q(str2));
        DbS.A1J(A0e2, "click");
        DbS.A1H(A0e2, "non_taggable_user_in_search_collab");
        A0e2.A9F("ig_userid", AnonymousClass7TE.A10(id2));
        A0e2.A7p(AnonymousClass000.A00(311), Boolean.valueOf(A0Q2));
        A0e2.A9H(AnonymousClass000.A00(1333), A0q2);
        A0e2.Cgf();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: X.0iw} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x010a, code lost:
        if (r2.equals(r1.A0K()) == false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x012f, code lost:
        if (X.182.A06(r3, r4, 36326485497296675L) != false) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0136, code lost:
        if (r1 != false) goto L_0x0138;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r21) {
        /*
            r20 = this;
            r0 = 1734518957(0x6762a8ad, float:1.07036634E24)
            int r0 = X.AnonymousClass0fD.A02(r0)
            r7 = r20
            r1 = r21
            X.C15401Uc7.super.onCreate(r1)
            r2 = 1
            r7.setRetainInstance(r2)
            java.lang.String r1 = "collaborator_search"
            r7.setModuleNameV2(r1)
            com.instagram.common.session.UserSession r3 = r7.getSession()
            X.WGQ r1 = new X.WGQ
            r1.<init>(r7, r3)
            r7.A0G = r1
            android.content.Context r3 = r7.requireContext()
            r1 = 2130970798(0x7f0408ae, float:1.7550316E38)
            android.view.ContextThemeWrapper r1 = X.2Yu.A0I(r3, r1)
            r7.A01 = r1
            android.os.Bundle r3 = r7.requireArguments()
            java.lang.String r1 = "peopleTags"
            java.util.ArrayList r18 = r3.getParcelableArrayList(r1)
            if (r18 != 0) goto L_0x003d
            X.0sn r18 = X.0sn.A00
        L_0x003d:
            android.content.Context r3 = r7.requireContext()
            r1 = 2131100272(0x7f060270, float:1.781292E38)
            int r1 = r3.getColor(r1)
            r7.A00 = r1
            android.os.Bundle r3 = r7.requireArguments()
            r1 = 1802(0x70a, float:2.525E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r1 = r3.getBoolean(r1)
            r7.A0D = r1
            android.os.Bundle r5 = r7.requireArguments()
            r1 = 1675(0x68b, float:2.347E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r1)
            r1 = 99
            java.lang.String r4 = X.C66579MXk.A00(r1)
            java.lang.String r3 = r5.getString(r3, r4)
            X.0qQ.A07(r3)
            r1 = 2074(0x81a, float:2.906E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0191
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x007f:
            r7.A07 = r1
            android.os.Bundle r3 = r7.requireArguments()
            java.lang.String r1 = "media_id"
            java.lang.String r1 = r3.getString(r1)
            r7.A0A = r1
            android.os.Bundle r3 = r7.requireArguments()
            java.lang.String r1 = "SET_FRAGMENT_BACKGROUND_WHITE"
            boolean r1 = r3.getBoolean(r1)
            r7.A0I = r1
            android.os.Bundle r3 = r7.requireArguments()
            r1 = 1121(0x461, float:1.571E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String r1 = r3.getString(r1)
            r7.A08 = r1
            android.os.Bundle r3 = r7.requireArguments()
            r1 = 3146(0xc4a, float:4.408E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String r1 = r3.getString(r1)
            r7.A09 = r1
            android.os.Bundle r3 = r7.requireArguments()
            r1 = 1378(0x562, float:1.931E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r1 = r3.getBoolean(r1)
            r7.A0B = r1
            com.instagram.common.session.UserSession r6 = r7.getSession()
            r8 = 0
            X.7g1 r10 = new X.7g1
            r10.<init>()
            r3 = 0
            X.Wbb r9 = r7.A0K
            X.0qQ.A0B(r9, r3)
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            r12 = 0
            r14 = 200(0xc8, double:9.9E-322)
            r16 = r3
            r17 = r3
            X.Ts1 r1 = X.C14225Ts5.A00(r6, r7, r8, r9, r10, r11, r12, r14, r16, r17)
            r7.A04 = r1
            java.lang.String r1 = r7.A09
            if (r1 == 0) goto L_0x010c
            com.instagram.common.session.UserSession r1 = r7.getSession()
            X.17i r4 = X.17h.A00(r1)
            java.lang.String r1 = r7.A09
            com.instagram.user.model.User r1 = r4.A02(r1)
            if (r1 == 0) goto L_0x010c
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Boolean r1 = r1.A0K()
            boolean r1 = r2.equals(r1)
            r5 = 1
            if (r1 != 0) goto L_0x010d
        L_0x010c:
            r5 = 0
        L_0x010d:
            boolean r1 = r7.A0D
            if (r1 == 0) goto L_0x0131
            com.instagram.common.session.UserSession r4 = r7.getSession()
            X.0qQ.A0B(r4, r3)
            X.0Tu r3 = X.0Tu.A05
            r1 = 36326485497231138(0x810ebf00003722, double:3.036353931240664E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x0131
            r1 = 36326485497296675(0x810ebf00013723, double:3.03635393128211E-306)
            boolean r2 = X.182.A06(r3, r4, r1)
            r1 = 1
            if (r2 == 0) goto L_0x0132
        L_0x0131:
            r1 = 0
        L_0x0132:
            if (r5 != 0) goto L_0x0138
            r19 = 0
            if (r1 == 0) goto L_0x013a
        L_0x0138:
            r19 = 1
        L_0x013a:
            android.view.ContextThemeWrapper r12 = r7.getThemedContext()
            com.instagram.common.session.UserSession r14 = r7.getSession()
            X.VPh r3 = r7.A0L
            X.Ts1 r1 = r7.A04
            if (r1 != 0) goto L_0x0152
            java.lang.String r0 = "queuedTypeaheadManager"
        L_0x014a:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0152:
            X.7g2 r2 = r1.A06
            boolean r1 = r7.A0D
            if (r1 == 0) goto L_0x018e
            java.lang.String r1 = r7.A08
            if (r1 == 0) goto L_0x018b
            java.lang.Integer r17 = X.AnonymousClass05K.A0C
        L_0x015e:
            X.Vjo r11 = new X.Vjo
            r13 = r7
            r15 = r2
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r7.A06 = r11
            java.lang.String r6 = X.AnonymousClass7TG.A0j()
            com.instagram.common.session.UserSession r5 = r7.getSession()
            com.instagram.common.session.UserSession r4 = r7.getSession()
            X.0Tu r3 = X.0Tu.A05
            r1 = 36311173938807242(0x8100d2000001ca, double:3.026670840038695E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            X.8av r1 = X.C358428at.A01(r7, r5, r6, r1)
            r7.A0F = r1
            if (r1 != 0) goto L_0x01ab
            java.lang.String r0 = "searchLogger"
            goto L_0x014a
        L_0x018b:
            java.lang.Integer r17 = X.AnonymousClass05K.A01
            goto L_0x015e
        L_0x018e:
            java.lang.Integer r17 = X.AnonymousClass05K.A0N
            goto L_0x015e
        L_0x0191:
            r1 = 2075(0x81b, float:2.908E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x01a1
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x007f
        L_0x01a1:
            boolean r1 = r3.equals(r4)
            if (r1 == 0) goto L_0x01e4
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x007f
        L_0x01ab:
            r1.CkQ()
            com.instagram.common.session.UserSession r3 = r7.getSession()
            X.TwM r2 = X.C14439TwN.A00(r3)
            X.0eM r1 = r2.A02
            boolean r1 = X.G9t.A1b(r1)
            if (r1 == 0) goto L_0x01dd
            boolean r1 = X.2R8.A00(r3)
            if (r1 != 0) goto L_0x01cc
            X.0eM r1 = r2.A01
            boolean r1 = X.G9t.A1b(r1)
            if (r1 != 0) goto L_0x01dd
        L_0x01cc:
            X.Tws r1 = X.C14471Twt.A05
            X.Twt r1 = r1.A00(r3)
            X.2Fk r3 = r1.A00
            r2 = 3
            X.WEC r1 = new X.WEC
            r1.<init>(r2, r7, r3)
            r3.A06(r7, r1)
        L_0x01dd:
            r1 = -154160733(0xfffffffff6cfb1a3, float:-2.1062663E33)
            X.AnonymousClass0fD.A09(r1, r0)
            return
        L_0x01e4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15401Uc7.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        IgdsInlineSearchBox igdsInlineSearchBox;
        int A022 = AnonymousClass0fD.A02(-874973801);
        0qQ.A0B(layoutInflater, 0);
        View A092 = DbW.A09(layoutInflater.cloneInContext(getThemedContext()), viewGroup, R.layout.fragment_people_tag_search, false);
        if (this.A0I) {
            DbT.A16(getThemedContext(), A092, R.color.design_dark_default_color_on_background);
        }
        if (bundle != null) {
            this.A0J = bundle.getBoolean("HAS_USER_TYPED_SOMETHING");
        }
        IgdsInlineSearchBox igdsInlineSearchBox2 = (IgdsInlineSearchBox) A092.requireViewById(R.id.row_search_edit_text);
        this.A03 = igdsInlineSearchBox2;
        if (igdsInlineSearchBox2 != null) {
            igdsInlineSearchBox2.setHint(AnonymousClass7TF.A0d(getThemedContext().getResources(), 2131972814));
        }
        IgdsInlineSearchBox igdsInlineSearchBox3 = this.A03;
        if (igdsInlineSearchBox3 != null) {
            igdsInlineSearchBox3.setImeOptions(268435463);
        }
        if (!this.A0C && (igdsInlineSearchBox = this.A03) != null) {
            igdsInlineSearchBox.A02 = new WY0(this);
        }
        if (this.A0D) {
            View view = 2b1.A01(A092.requireViewById(R.id.collaborator_search_empty_state_view_stub), false, false).getView();
            0qQ.A0C(view, "null cannot be cast to non-null type com.instagram.ui.emptystaterow.EmptyStateView");
            EmptyStateView emptyStateView = (EmptyStateView) view;
            int i2 = 2131964478;
            if (182.A06(0Tu.A05, getSession(), 36313012185138775L)) {
                i2 = 2131952284;
            }
            C320156rr r4 = C320156rr.EMPTY;
            emptyStateView.A0T(r4, i2);
            boolean A1W = AnonymousClass7TF.A1W(AnonymousClass05K.A0C, AnonymousClass0t1.A01.A01(getSession()).A0N());
            if (this.A0B) {
                i = 2131969585;
                if (A1W) {
                    i = 2131969771;
                }
            } else {
                i = 2131956268;
                if (A1W) {
                    i = 2131969766;
                }
            }
            emptyStateView.A0S(r4, i);
            emptyStateView.A0I();
            emptyStateView.A0H();
            emptyStateView.setVisibility(0);
        }
        this.A02 = (ListView) A092.requireViewById(16908298);
        AnonymousClass0fD.A09(-2018628363, A022);
        return A092;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1101423506);
        super.onDestroy();
        C14221Ts1 ts1 = this.A04;
        if (ts1 == null) {
            0qQ.A0F("queuedTypeaheadManager");
            throw AnonymousClass00P.createAndThrow();
        }
        ts1.onDestroy();
        AnonymousClass0fD.A09(1745484849, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(960634967);
        super.onDestroyView();
        IgdsInlineSearchBox igdsInlineSearchBox = this.A03;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A02 = null;
        }
        this.A03 = null;
        this.A02 = null;
        this.A05 = null;
        AnonymousClass0fD.A09(-1286939628, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1115416664);
        C15401Uc7.super.onPause();
        IgdsInlineSearchBox igdsInlineSearchBox = this.A03;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A03();
        }
        Window A0G2 = DbV.A0G(this);
        if (A0G2 != null) {
            A0G2.setSoftInputMode(this.A0E);
            AnonymousClass0fD.A09(751177529, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-68064212, A022);
        throw A0y;
    }

    public final void onResume() {
        String searchString;
        int A022 = AnonymousClass0fD.A02(1578427980);
        super.onResume();
        Window A0G2 = DbV.A0G(this);
        if (A0G2 != null) {
            this.A0E = A0G2.getAttributes().softInputMode;
            A0G2.setSoftInputMode(16);
            IgdsInlineSearchBox igdsInlineSearchBox = this.A03;
            if (!(igdsInlineSearchBox == null || (searchString = igdsInlineSearchBox.getSearchString()) == null)) {
                A02(this, searchString);
            }
            AnonymousClass0fD.A09(-659270521, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-1468152890, A022);
        throw A0y;
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-1318260115);
        C15401Uc7.super.onStart();
        if (this.A0C) {
            AnonymousClass7TF.A16(this.A02);
            C18012Vjo vjo = this.A06;
            if (vjo == null) {
                DbS.A13();
                throw AnonymousClass00P.createAndThrow();
            }
            vjo.A00();
            IgdsInlineSearchBox igdsInlineSearchBox = this.A03;
            if (igdsInlineSearchBox != null) {
                igdsInlineSearchBox.A02 = new WY0(this);
            }
        }
        AnonymousClass0fD.A09(-1096763834, A022);
    }
}
