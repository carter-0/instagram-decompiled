package com.instagram.profile.edithighlightsmigration;

import X.0Tu;
import X.0qQ;
import X.13s;
import X.182;
import X.1FR;
import X.2da;
import X.2el;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0t1;
import X.AnonymousClass0wW;
import X.AnonymousClass2eo;
import X.AnonymousClass32Q;
import X.AnonymousClass376;
import X.AnonymousClass3BU;
import X.AnonymousClass3DZ;
import X.AnonymousClass3JR;
import X.AnonymousClass3PO;
import X.AnonymousClass3PP;
import X.AnonymousClass4DH;
import X.AnonymousClass4DS;
import X.AnonymousClass4DU;
import X.AnonymousClass6W8;
import X.AnonymousClass726;
import X.AnonymousClass728;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13991Tnr;
import X.C15476UdR;
import X.C15953UlV;
import X.C17884Vhb;
import X.C20962X6p;
import X.C227642jf;
import X.C228172ku;
import X.C229122ms;
import X.C268654dm;
import X.C273664mz;
import X.C294255m9;
import X.C294265mA;
import X.C319976rX;
import X.C319986rY;
import X.C321426u9;
import X.C321456uC;
import X.C321636uV;
import X.C321646uW;
import X.C321926uy;
import X.C3251771i;
import X.C3251871j;
import X.C46323Dbr;
import X.C61082JwK;
import X.C65588LwO;
import X.C71396Ojv;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbW;
import X.DbX;
import X.DbY;
import X.Ki3;
import X.UNQ;
import X.VFV;
import X.WBA;
import X.WQU;
import X.WWL;
import X.WX8;
import X.WXA;
import X.WZL;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.recyclerview.FastScrollingLinearLayoutManager;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.modal.ModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class HighlightsMigrationFragment extends AnonymousClass4DH implements C229122ms, AnonymousClass4DU, C321636uV, AnonymousClass4DS, C20962X6p {
    public C3251871j A00;
    public C321646uW A01;
    public WZL A02;
    public C15476UdR A03;
    public C321456uC A04;
    public User A05;
    public String A06;
    public boolean A07 = true;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final String A0B = AnonymousClass000.A00(2360);
    public final AnonymousClass0eM A0C = C227642jf.A02(this);
    public final WQU A0D = new WQU(this, 6);
    public final 2el A0E = DbY.A0U();
    public final C228172ku A0F = new C228172ku();
    public final AnonymousClass726 A0G = new WX8(this);
    public final AnonymousClass728 A0H = new WXA(this);
    public IgTextView highlightsMigrationScreenBodyText;
    public RecyclerView recyclerView;
    public IgdsMediaButton scrollToHighlightsButton;
    public IgdsBottomButtonLayout shareHighlightsButton;

    public final void DQ4(C268654dm r1, C294265mA r2) {
    }

    public final void DQ7(String str, Long l) {
    }

    public final void DQ9(C294265mA r1, boolean z, boolean z2, boolean z3) {
    }

    public final void DQA(Context context, C61082JwK jwK, C273664mz r10, C294265mA r11, boolean z, boolean z2) {
        String str;
        ArrayList arrayList;
        List list = r10.A03;
        boolean z3 = true;
        if (list != null) {
            arrayList = AnonymousClass7TG.A0r(list);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                UNQ unq = (UNQ) it.next();
                UserSession A0l = AnonymousClass7TE.A0l(this.A0C);
                User user = this.A05;
                if (user == null) {
                    str = "currentUser";
                    break;
                }
                C17884Vhb A002 = VFV.A00(unq, A0l, user);
                if (A002.A04 && !this.A0A) {
                    this.A0A = true;
                    this.A06 = A002.A00();
                }
                arrayList.add(A002);
            }
        } else {
            arrayList = null;
        }
        if (!this.A0A || z || !this.A07) {
            z3 = false;
        }
        if (arrayList != null) {
            WZL wzl = this.A02;
            if (wzl != null) {
                wzl.A04.A0A(arrayList);
                HighlightsMigrationFragment highlightsMigrationFragment = wzl.A02.A00;
                highlightsMigrationFragment.A04().A01(highlightsMigrationFragment.A09);
            } else {
                str = "highlightsMigrationDataSource";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        if (this.shareHighlightsButton != null && this.A09) {
            IgdsBottomButtonLayout A032 = A03();
            boolean A1b = AnonymousClass7TE.A1b(A04().A00());
            Resources A052 = DbV.A05(this);
            int i = 2131961484;
            if (A1b) {
                i = 2131961487;
            }
            A032.setPrimaryActionText(A052.getString(i));
        }
        if (z3) {
            IgdsMediaButton igdsMediaButton = this.scrollToHighlightsButton;
            if (igdsMediaButton != null) {
                igdsMediaButton.setVisibility(0);
                IgdsMediaButton igdsMediaButton2 = this.scrollToHighlightsButton;
                if (igdsMediaButton2 != null) {
                    WBA.A00(igdsMediaButton2, 60, this);
                    return;
                }
            }
            str = "scrollToHighlightsButton";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void Dcc(SpinnerImageView spinnerImageView, String str, int i, int i2, int i3) {
        Object obj;
        String str2;
        C15476UdR A042 = A04();
        HashMap hashMap = A042.A01;
        DbU.A1Y(str, hashMap, AnonymousClass7TF.A1Y(hashMap.get(str), false));
        WZL wzl = A042.A00;
        C15953UlV ulV = wzl.A04;
        ulV.A08(wzl.A03);
        Iterator it = ulV.A01.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((C17884Vhb) obj).A00(), str)) {
                break;
            }
        }
        C17884Vhb vhb = (C17884Vhb) obj;
        if (vhb != null) {
            vhb.A00 = !vhb.A00;
        }
        A042.notifyItemChanged(i3);
        if (DbX.A1a(A04().A01.get(str))) {
            str2 = "selected";
        } else {
            str2 = "unselected";
        }
        A02(this, "highlights_management_screen_highlight_toggle", str2);
        A03().setPrimaryButtonEnabled(AnonymousClass7TE.A1b(A04().A00()));
    }

    public final void Dce(String str, int i) {
        if (this.A08) {
            AnonymousClass0eM r3 = this.A0C;
            Reel A0S = C13991Tnr.A0S(str, r3);
            if (A0S == null || !A0S.A0z(AnonymousClass7TE.A0l(r3))) {
                AnonymousClass3PP A002 = AnonymousClass3PO.A00(DbW.A0S(r3, 0));
                A002.A02(AnonymousClass3BU.ON_TAP, str, "edit_profile_highlights_management", (Map) null);
                A002.A05(new C65588LwO(this, 2), str, (String) null, false);
                return;
            }
            A01(this, str);
        }
    }

    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        boolean z = this.A09;
        Resources A052 = DbV.A05(this);
        int i = 2131963445;
        if (z) {
            i = 2131963444;
        }
        String string = A052.getString(i);
        0qQ.A0A(string);
        r5.setTitle(string);
        AnonymousClass3JR r2 = new AnonymousClass3JR();
        r2.A01 = R.drawable.instagram_chevron_left_pano_outline_24;
        DbX.A1A(new WBA((Object) this, 59), r2, r5);
        if (182.A06(0Tu.A05, AnonymousClass7TF.A0L(this.A0C, 0), 36329019529182961L)) {
            AnonymousClass3JR r22 = new AnonymousClass3JR();
            r22.A06 = R.drawable.instagram_more_horizontal_pano_outline_24;
            r22.A05 = 2131963452;
            DbX.A19(new C71396Ojv(this, 7), r22, r5);
        }
    }

    public final String getModuleName() {
        return "edit_profile_highlights_management";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String str;
        View view2 = view;
        0qQ.A0B(view2, 0);
        RecyclerView A0I = DbT.A0I(view2, R.id.highlights_migration_rv);
        0qQ.A0B(A0I, 0);
        this.recyclerView = A0I;
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) view2.requireViewById(R.id.share_highlights_button);
        0qQ.A0B(igdsBottomButtonLayout, 0);
        this.shareHighlightsButton = igdsBottomButtonLayout;
        A03().setPrimaryButtonEnabled(false);
        A03().setPrimaryActionOnClickListener(new C71396Ojv(this, 8));
        boolean z = this.A09;
        IgdsBottomButtonLayout A032 = A03();
        Resources A052 = DbV.A05(this);
        if (z) {
            A032.setPrimaryActionText(A052.getString(2131961487));
            A03().setSecondaryActionOnClickListener(new WBA((Object) this, 61));
        } else {
            A032.setPrimaryActionText(A052.getString(2131961484));
            A03().setSecondaryActionText("");
        }
        IgdsMediaButton igdsMediaButton = (IgdsMediaButton) view2.requireViewById(R.id.scroll_to_highlights_button);
        0qQ.A0B(igdsMediaButton, 0);
        this.scrollToHighlightsButton = igdsMediaButton;
        IgTextView A0a = DbT.A0a(view2, R.id.highlights_migration_screen_body_text);
        0qQ.A0B(A0a, 0);
        this.highlightsMigrationScreenBodyText = A0a;
        if (this.A09) {
            String format = new SimpleDateFormat(this.A0B, 13s.A06).format(Long.valueOf(182.A01(0Tu.A05, AnonymousClass7TF.A0L(this.A0C, 0), 36610494505162761L) * 1000));
            boolean z2 = this.A08;
            Resources A053 = DbV.A05(this);
            int i = 2131961486;
            if (z2) {
                i = 2131961485;
            }
            string = AnonymousClass7TF.A0e(A053, format, i);
        } else {
            boolean z3 = this.A08;
            Resources A054 = DbV.A05(this);
            int i2 = 2131961489;
            if (z3) {
                i2 = 2131961488;
            }
            string = A054.getString(i2);
        }
        0qQ.A0A(string);
        A0a.setText(string);
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(A04());
            FastScrollingLinearLayoutManager fastScrollingLinearLayoutManager = new FastScrollingLinearLayoutManager(requireContext());
            RecyclerView recyclerView3 = this.recyclerView;
            if (recyclerView3 != null) {
                recyclerView3.setLayoutManager(fastScrollingLinearLayoutManager);
                C3251871j r10 = new C3251871j(fastScrollingLinearLayoutManager, new WWL(this, 2), C3251771i.A0C, false, false);
                this.A00 = r10;
                C228172ku r2 = this.A0F;
                r2.A02(r10);
                RecyclerView recyclerView4 = this.recyclerView;
                if (recyclerView4 != null) {
                    recyclerView4.A15(r2);
                    WZL wzl = this.A02;
                    if (wzl != null) {
                        AnonymousClass4DU r12 = wzl.A01;
                        AnonymousClass0eM r4 = this.A0C;
                        UserSession A0l = AnonymousClass7TE.A0l(r4);
                        User A0l2 = DbX.A0l(AnonymousClass0t1.A01, r4);
                        2el r11 = this.A0E;
                        this.A04 = C321426u9.A00(this, A0l, r11, r12, C294255m9.A07, AnonymousClass32Q.A01, A0l2, new HashSet(), new HashSet());
                        AnonymousClass3DZ A002 = AnonymousClass3DZ.A00(this);
                        RecyclerView recyclerView5 = this.recyclerView;
                        if (recyclerView5 != null) {
                            r11.A08(recyclerView5, A002, new AnonymousClass2eo[0]);
                            super.onViewCreated(view2, bundle);
                            C321646uW r3 = this.A01;
                            if (r3 != null) {
                                C294265mA r22 = C294265mA.EDIT_PROFILE_HIGHLIGHTS_MANAGEMENT_SCREEN_GRID;
                                C46323Dbr dbr = new C46323Dbr(DbU.A0u(r4));
                                1FR r42 = new 1FR(AnonymousClass05K.A01);
                                0qQ.A0B(r22, 0);
                                C321646uW.A00(r3, r22).A00(r42, dbr, true, true, true, false);
                                return;
                            }
                            str = "profileFeedNetworkController";
                        }
                    } else {
                        str = "highlightsMigrationDataSource";
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
        str = "recyclerView";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(Reel reel, HighlightsMigrationFragment highlightsMigrationFragment, int i, boolean z) {
        DbX.A0R(highlightsMigrationFragment.A0C).A00(new C321926uy(reel, i, z));
    }

    public static final void A01(HighlightsMigrationFragment highlightsMigrationFragment, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("edit_highlights_reel_id", str);
        bundle.putBoolean("archive_multi_select_mode", true);
        bundle.putSerializable("highlight_management_source", Ki3.HIGHLIGHTS_MANAGEMENT_SCREEN);
        new AnonymousClass6W8(highlightsMigrationFragment.getActivity(), bundle, DbT.A0X(highlightsMigrationFragment.A0C), ModalActivity.class, "manage_highlights").A0A(highlightsMigrationFragment.getActivity(), 201);
    }

    public static final void A02(HighlightsMigrationFragment highlightsMigrationFragment, String str, String str2) {
        String str3;
        C319976rX r1 = C319976rX.A00;
        HighlightsMigrationFragment highlightsMigrationFragment2 = highlightsMigrationFragment;
        AnonymousClass0eM r0 = highlightsMigrationFragment.A0C;
        UserSession A0l = AnonymousClass7TE.A0l(r0);
        C319986rY r4 = C319986rY.SELF;
        String A0u = DbU.A0u(r0);
        if (highlightsMigrationFragment.A09) {
            str3 = "forced_migration";
        } else {
            str3 = "opt_in";
        }
        r1.A0D(highlightsMigrationFragment2, A0l, r4, str, A0u, str3, str2);
    }

    public final IgdsBottomButtonLayout A03() {
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.shareHighlightsButton;
        if (igdsBottomButtonLayout != null) {
            return igdsBottomButtonLayout;
        }
        0qQ.A0F("shareHighlightsButton");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C15476UdR A04() {
        C15476UdR udR = this.A03;
        if (udR != null) {
            return udR;
        }
        0qQ.A0F("highlightsMigrationGridAdapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CJz() {
        WZL wzl = this.A02;
        if (wzl != null) {
            return AnonymousClass7TE.A1b(wzl.A04.A01);
        }
        0qQ.A0F("highlightsMigrationDataSource");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CKB() {
        C321646uW r2 = this.A01;
        if (r2 != null) {
            C294265mA r1 = C294265mA.EDIT_PROFILE_HIGHLIGHTS_MANAGEMENT_SCREEN_GRID;
            0qQ.A0B(r1, 0);
            return C321646uW.A00(r2, r1).A03.A05();
        }
        0qQ.A0F("profileFeedNetworkController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CT5() {
        C321646uW r2 = this.A01;
        if (r2 != null) {
            C294265mA r1 = C294265mA.EDIT_PROFILE_HIGHLIGHTS_MANAGEMENT_SCREEN_GRID;
            0qQ.A0B(r1, 0);
            return C321646uW.A00(r2, r1).A01();
        }
        0qQ.A0F("profileFeedNetworkController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void CgO() {
        C321646uW r2 = this.A01;
        if (r2 != null) {
            C294265mA r1 = C294265mA.EDIT_PROFILE_HIGHLIGHTS_MANAGEMENT_SCREEN_GRID;
            C46323Dbr dbr = new C46323Dbr(DbU.A0u(this.A0C));
            1FR r3 = new 1FR(AnonymousClass05K.A01);
            0qQ.A0B(r1, 0);
            C321646uW.A00(r2, r1).A00(r3, dbr, false, false, true, false);
            return;
        }
        0qQ.A0F("profileFeedNetworkController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DQ6(C294265mA r3) {
        if (!this.A0A && !isLoading() && CKB()) {
            CgO();
        } else if (this.A0A) {
            A04().A01(this.A09);
            this.A07 = false;
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0C);
    }

    public final boolean isLoading() {
        C321646uW r2 = this.A01;
        if (r2 != null) {
            C294265mA r1 = C294265mA.EDIT_PROFILE_HIGHLIGHTS_MANAGEMENT_SCREEN_GRID;
            0qQ.A0B(r1, 0);
            return C321646uW.A00(r2, r1).A02();
        }
        0qQ.A0F("profileFeedNetworkController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CWV() {
        if (isLoading()) {
            WZL wzl = this.A02;
            if (wzl == null) {
                0qQ.A0F("highlightsMigrationDataSource");
                throw AnonymousClass00P.createAndThrow();
            } else if (AnonymousClass7TE.A1b(wzl.A04.A01)) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: X.X6p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: X.2ms} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: X.6uV} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r24, android.view.ViewGroup r25, android.os.Bundle r26) {
        /*
            r23 = this;
            r0 = -981845147(0xffffffffc57a3b65, float:-4003.7122)
            int r4 = X.AnonymousClass0fD.A02(r0)
            r1 = 0
            r8 = r23
            r5 = r24
            android.content.Context r16 = X.DbT.A06(r8, r5, r1)
            X.0eM r0 = r8.A0C
            com.instagram.common.session.UserSession r17 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.6vQ r6 = new X.6vQ
            r6.<init>(r2)
            X.0eE r2 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r22 = X.DbX.A0l(r2, r0)
            X.VOd r3 = new X.VOd
            r3.<init>(r8)
            X.32Q r14 = X.AnonymousClass32Q.A01
            X.WZL r15 = new X.WZL
            r18 = r8
            r19 = r3
            r20 = r6
            r21 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r8.A02 = r15
            android.content.Context r7 = r8.requireContext()
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r0)
            X.WZL r12 = r8.A02
            if (r12 == 0) goto L_0x00b2
            X.726 r10 = r8.A0G
            X.728 r11 = r8.A0H
            r3 = 0
            X.UdR r6 = new X.UdR
            r13 = r8
            r15 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r8.A03 = r6
            android.content.Context r10 = r8.requireContext()
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r0)
            android.content.Context r7 = r8.requireContext()
            X.0gy r6 = X.AnonymousClass07i.A00(r8)
            X.2lw r12 = new X.2lw
            r12.<init>(r7, r6, r3)
            X.5mA r6 = X.C294265mA.EDIT_PROFILE_HIGHLIGHTS_MANAGEMENT_SCREEN_GRID
            java.util.List r16 = X.AnonymousClass7TE.A1I(r6)
            X.6uW r9 = new X.6uW
            r13 = r3
            r14 = r8
            r15 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r8.A01 = r9
            X.1Ng r7 = X.DbX.A0R(r0)
            java.lang.Class<X.376> r6 = X.AnonymousClass376.class
            X.WQU r3 = r8.A0D
            r7.A01(r3, r6)
            com.instagram.user.model.User r2 = X.DbX.A0l(r2, r0)
            r8.A05 = r2
            boolean r2 = r2.A2P()
            r8.A09 = r2
            X.0lg r6 = X.AnonymousClass7TF.A0L(r0, r1)
            X.0Tu r0 = X.0Tu.A05
            r2 = 36329019528724202(0x81110d000c3eea, double:3.037956462960603E-306)
            boolean r0 = X.182.A06(r0, r6, r2)
            r8.A08 = r0
            r0 = 2131625685(0x7f0e06d5, float:1.8878585E38)
            r2 = r25
            android.view.View r1 = r5.inflate(r0, r2, r1)
            r0 = 242545345(0xe74f2c1, float:3.0192204E-30)
            X.AnonymousClass0fD.A09(r0, r4)
            return r1
        L_0x00b2:
            java.lang.String r0 = "highlightsMigrationDataSource"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profile.edithighlightsmigration.HighlightsMigrationFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1219577821);
        super.onDestroyView();
        HighlightsMigrationFragmentLifecycleUtil.cleanupReferences(this);
        this.A0F.A00();
        DbX.A0R(this.A0C).A02(this.A0D, AnonymousClass376.class);
        AnonymousClass0fD.A09(-1036110152, A022);
    }
}
