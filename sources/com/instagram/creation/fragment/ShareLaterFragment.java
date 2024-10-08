package com.instagram.creation.fragment;

import X.0Aj;
import X.0Tu;
import X.0mM;
import X.0nA;
import X.0qQ;
import X.2da;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0kN;
import X.AnonymousClass0wW;
import X.AnonymousClass4DH;
import X.AnonymousClass4DS;
import X.AnonymousClass5w8;
import X.AnonymousClass5w9;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass818;
import X.AnonymousClass8PU;
import X.C2594141p;
import X.C295095nZ;
import X.C3034168s;
import X.C357128Wq;
import X.C363658k8;
import X.C367188qK;
import X.C376569Im;
import X.C48153EZv;
import X.C59904JbT;
import X.C60058JeZ;
import X.C61500KAf;
import X.C62320sa;
import X.C63435Kwv;
import X.C64367Laj;
import X.C65240Lpk;
import X.C65627Lx4;
import X.C65667Lxi;
import X.DbS;
import X.DbV;
import X.DbW;
import X.DbX;
import X.DbY;
import X.Dbc;
import X.F2E;
import X.G7M;
import X.JTO;
import X.JTT;
import X.LEO;
import X.LWP;
import X.LYB;
import X.MT7;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.model.sharelater.ShareLaterMedia;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ShareLaterFragment extends AnonymousClass4DH implements AnonymousClass0iw, AnonymousClass4DS, MT7 {
    public static final CallerContext A0I = CallerContext.A01("ShareLaterFragment");
    public UserSession A00;
    public 0mM A01;
    public C363658k8 A02 = new C65240Lpk(this, 0);
    public F2E A03;
    public ShareLaterMedia A04;
    public IgAutoCompleteTextView A05;
    public C357128Wq A06;
    public String A07;
    public List A08;
    public AtomicBoolean A09;
    public int A0A;
    public View A0B;
    public G7M A0C;
    public C367188qK A0D;
    public boolean A0E;
    public final Handler A0F = new Handler();
    public final C61500KAf A0G = new C61500KAf(this, 15);
    public final TextWatcher A0H = new LWP((Object) this, 7);
    public C60058JeZ appShareTable;

    public final void Cvj(C48153EZv eZv) {
        String str;
        C48153EZv eZv2 = eZv;
        0qQ.A0B(eZv, 0);
        UserSession userSession = this.A00;
        String str2 = "userSession";
        if (userSession != null) {
            if (eZv.A08(userSession, this.A04)) {
                ShareLaterMedia shareLaterMedia = this.A04;
                if (shareLaterMedia != null) {
                    if (!eZv.A0A(shareLaterMedia) && eZv == C48153EZv.A05) {
                        C367188qK r3 = this.A0D;
                        if (r3 == null) {
                            str2 = "noticeManager";
                        } else {
                            FragmentActivity requireActivity = requireActivity();
                            UserSession userSession2 = this.A00;
                            if (userSession2 != null) {
                                LEO A002 = C63435Kwv.A00(requireActivity, AnonymousClass818.IG_FEED_SHARE_LATER, userSession2);
                                ShareLaterMedia shareLaterMedia2 = this.A04;
                                if (shareLaterMedia2 != null) {
                                    str = shareLaterMedia2.A05;
                                } else {
                                    str = null;
                                }
                                A002.A08 = str;
                                A002.A00 = getContext();
                                r3.A01((C376569Im) null, A002, C65667Lxi.A00);
                            }
                        }
                    }
                    ShareLaterMedia shareLaterMedia3 = this.A04;
                    if (shareLaterMedia3 != null) {
                        UserSession userSession3 = this.A00;
                        if (userSession3 != null) {
                            G7M g7m = this.A0C;
                            if (g7m == null) {
                                str2 = "authorizeListener";
                            } else {
                                eZv2.A03(this, userSession3, shareLaterMedia3, g7m, (Boolean) null, (C62320sa) null);
                                C60058JeZ jeZ = this.appShareTable;
                                if (jeZ != null) {
                                    jeZ.A06(this.A04);
                                }
                                A00(this);
                                return;
                            }
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        String A0d = AnonymousClass7TF.A0d(DbV.A05(this), 2131973441);
        ? obj = new Object();
        obj.A02 = A0d;
        this.A0B = C59904JbT.A00(new LYB((Object) this, 39), r4, obj);
        A00(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: X.0iw} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r17, android.os.Bundle r18) {
        /*
            r16 = this;
            r3 = 0
            r7 = r17
            X.0qQ.A0B(r7, r3)
            r8 = r16
            r0 = r18
            super.onViewCreated(r7, r0)
            r4 = 2131429607(0x7f0b08e7, float:1.8480892E38)
            android.view.View r1 = r7.requireViewById(r4)
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r1 = (com.instagram.ui.widget.textview.IgAutoCompleteTextView) r1
            r8.A05 = r1
            X.0qQ.A0A(r1)
            com.instagram.model.sharelater.ShareLaterMedia r0 = r8.A04
            X.0qQ.A0A(r0)
            java.lang.String r0 = r0.A04
            r1.setText(r0)
            android.content.res.Resources r1 = X.DbV.A05(r8)
            r0 = 2131165286(0x7f070066, float:1.7944785E38)
            int r2 = r1.getDimensionPixelSize(r0)
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r1 = r8.A05
            X.0qQ.A0A(r1)
            r0 = 1075838976(0x40200000, float:2.5)
            r1.A00 = r0
            r1.A01 = r2
            android.content.Context r10 = r8.requireContext()
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r5 = r8.A05
            if (r5 == 0) goto L_0x0195
            com.instagram.common.session.UserSession r2 = r8.A00
            if (r2 != 0) goto L_0x0051
            java.lang.String r4 = "userSession"
        L_0x0049:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0051:
            X.0gy r1 = X.AnonymousClass07i.A00(r8)
            r14 = 0
            X.2lw r0 = new X.2lw
            r0.<init>(r10, r1, r14)
            java.lang.String r15 = "share_post_page"
            r11 = r8
            r12 = r0
            r13 = r2
            X.7eF r0 = X.C336207eF.A01(r10, r11, r12, r13, r14, r15)
            r5.setAdapter(r0)
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r0 = r8.A05
            X.0qQ.A0A(r0)
            r5 = 1
            r0.A07 = r5
            com.instagram.model.sharelater.ShareLaterMedia r0 = r8.A04
            X.0qQ.A0A(r0)
            X.1iA r1 = r0.A02
            X.1iA r0 = X.1iA.A0a
            if (r1 != r0) goto L_0x0080
            r0 = 2131429611(0x7f0b08eb, float:1.84809E38)
            X.DbT.A1F(r7, r0, r3)
        L_0x0080:
            r0 = 2131441218(0x7f0b3642, float:1.8504441E38)
            android.view.ViewGroup r2 = X.DbX.A0I(r7, r0)
            android.content.Context r1 = r8.requireContext()
            java.lang.String r0 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r0)
            r0 = 327(0x147, float:4.58E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r0 = r1.isEnabled()
            if (r0 != r5) goto L_0x00b9
            android.widget.TextView r4 = X.AnonymousClass7TG.A0R(r2, r4)
            android.content.Context r1 = r8.requireContext()
            android.content.Context r0 = r8.requireContext()
            int r0 = X.2Yu.A08(r0)
            int r0 = r1.getColor(r0)
            r4.setHintTextColor(r0)
        L_0x00b9:
            X.EZv r0 = X.C48153EZv.A05
            com.instagram.common.session.UserSession r0 = r8.A00
            java.lang.String r4 = "userSession"
            if (r0 == 0) goto L_0x0049
            com.google.common.collect.ImmutableList r0 = X.C63418Kwe.A00(r0)
            r8.A08 = r0
            android.content.Context r6 = r8.requireContext()
            java.util.List r13 = r8.A08
            com.instagram.common.session.UserSession r9 = r8.A00
            if (r9 == 0) goto L_0x0049
            X.Lzq r11 = new X.Lzq
            r11.<init>(r8)
            com.instagram.model.sharelater.ShareLaterMedia r10 = r8.A04
            java.lang.String r12 = "share_later"
            X.JeZ r5 = new X.JeZ
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r8.appShareTable = r5
            r5.A07 = r8
            android.content.Context r0 = r8.requireContext()
            int r1 = X.AnonymousClass7TG.A02(r0)
            X.JeZ r0 = r8.appShareTable
            X.0qQ.A0A(r0)
            r0.setPadding(r1, r3, r1, r1)
            X.JeZ r1 = r8.appShareTable
            X.0qQ.A0A(r1)
            com.instagram.model.sharelater.ShareLaterMedia r0 = r8.A04
            r1.A06(r0)
            X.JeZ r0 = r8.appShareTable
            r2.addView(r0)
            r0 = 8
            X.Dbc.A0q(r8, r0)
            X.1Yl r6 = X.C357108Wn.A00()
            com.instagram.common.session.UserSession r9 = r8.A00
            if (r9 == 0) goto L_0x0049
            X.1Yl r0 = X.C357108Wn.A00()
            X.8Wp r10 = r0.A01()
            r0 = 2131443955(0x7f0b40f3, float:1.8509993E38)
            android.view.ViewStub r7 = X.DbU.A0D(r7, r0)
            r0 = 2
            X.M17 r11 = new X.M17
            r11.<init>(r8, r0)
            X.8Wq r0 = r6.A00(r7, r8, r9, r10, r11)
            r8.A06 = r0
            X.1Yl r0 = X.C357108Wn.A00()
            X.8Wp r1 = r0.A01()
            com.instagram.common.session.UserSession r0 = r8.A00
            if (r0 == 0) goto L_0x0049
            boolean r0 = r1.Esl(r0)
            if (r0 == 0) goto L_0x0163
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r2 = r8.A05
            java.lang.String r1 = "Required value was null."
            if (r2 == 0) goto L_0x0190
            android.text.TextWatcher r0 = r8.A0H
            r2.addTextChangedListener(r0)
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r0 = r8.A05
            if (r0 == 0) goto L_0x018b
            java.lang.String r2 = X.AnonymousClass7TF.A0f(r0)
            if (r2 == 0) goto L_0x0163
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0163
            X.8Wq r1 = r8.A06
            X.0qQ.A0A(r1)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r2)
            r1.A07(r0)
        L_0x0163:
            com.instagram.common.session.UserSession r3 = r8.A00
            if (r3 == 0) goto L_0x0049
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318471090673803(0x8107750025188b, double:3.03128558826238E-306)
            boolean r0 = X.DbY.A1Y(r2, r3, r0)
            if (r0 == 0) goto L_0x018a
            com.instagram.common.session.UserSession r0 = r8.A00
            if (r0 == 0) goto L_0x0049
            X.8qK r3 = new X.8qK
            r3.<init>(r0)
            android.content.Context r2 = r8.requireContext()
            com.instagram.common.session.UserSession r1 = r8.A00
            if (r1 == 0) goto L_0x0049
            X.8qM r0 = X.C367208qM.A04
            r3.A00(r2, r1, r0)
        L_0x018a:
            return
        L_0x018b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0190:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0195:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.ShareLaterFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(ShareLaterFragment shareLaterFragment) {
        boolean z;
        if (shareLaterFragment.A0B != null) {
            List list = shareLaterFragment.A08;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C48153EZv eZv = (C48153EZv) it.next();
                    ShareLaterMedia shareLaterMedia = shareLaterFragment.A04;
                    if (shareLaterMedia != null) {
                        if (eZv.A0A(shareLaterMedia)) {
                            z = true;
                            break;
                        }
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
            }
            z = false;
            View view = shareLaterFragment.A0B;
            0qQ.A0A(view);
            view.setEnabled(z);
        }
    }

    public final String getModuleName() {
        return "share_later";
    }

    public final AnonymousClass0wW getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        DbS.A17();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C48153EZv eZv;
        super.onActivityResult(i, i2, intent);
        UserSession userSession = this.A00;
        if (userSession == null) {
            DbS.A17();
            throw AnonymousClass00P.createAndThrow();
        }
        ShareLaterMedia shareLaterMedia = this.A04;
        if (shareLaterMedia != null) {
            CallerContext callerContext = C64367Laj.A00;
            if (i == 64206) {
                eZv = C48153EZv.A05;
            } else {
                eZv = null;
            }
            if (i2 == -1 && eZv != null && eZv != C48153EZv.A05 && !(!eZv.A07(userSession))) {
                eZv.A06(shareLaterMedia, true);
            }
            C60058JeZ jeZ = this.appShareTable;
            if (jeZ != null) {
                jeZ.A06(this.A04);
            }
            A00(this);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void onCreate(Bundle bundle) {
        String str;
        List list;
        ShareLaterMedia shareLaterMedia;
        List list2;
        ImmutableList copyOf;
        int A022 = AnonymousClass0fD.A02(-707099283);
        ShareLaterFragment.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        UserSession A0U = DbX.A0U(this);
        this.A00 = A0U;
        if (A0U != null) {
            this.A0D = new C367188qK(A0U);
            Parcelable parcelable = requireArguments.getParcelable(AnonymousClass000.A00(479));
            if (parcelable != null) {
                ShareLaterMedia shareLaterMedia2 = (ShareLaterMedia) parcelable;
                this.A04 = shareLaterMedia2;
                this.A0C = new C65627Lx4(this, 0);
                if (shareLaterMedia2 == null || (list = shareLaterMedia2.A06) == null || ImmutableList.copyOf((Collection) list) == null || (shareLaterMedia = this.A04) == null || (list2 = shareLaterMedia.A06) == null || (copyOf = ImmutableList.copyOf((Collection) list2)) == null || !copyOf.contains("FB")) {
                    UserSession userSession = this.A00;
                    if (userSession != null) {
                        AnonymousClass8PU.A07(userSession);
                    }
                }
                UserSession userSession2 = this.A00;
                if (userSession2 != null) {
                    ShareLaterMedia shareLaterMedia3 = this.A04;
                    if (shareLaterMedia3 == null || (str = shareLaterMedia3.A05) == null) {
                        str = "";
                    }
                    0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this, userSession2), "external_share_view_impression");
                    if (A0e.isSampled()) {
                        DbW.A15(A0e, this);
                        A0e.AAJ("share_location", "share_later_view");
                        A0e.AAJ("media_id", str);
                        A0e.Cgf();
                    }
                    UserSession userSession3 = this.A00;
                    if (userSession3 != null) {
                        if (!DbY.A1Y(0Tu.A05, userSession3, 2342156197492164411L)) {
                            F2E f2e = this.A03;
                            if (f2e == null) {
                                UserSession userSession4 = this.A00;
                                if (userSession4 != null) {
                                    f2e = new F2E(userSession4);
                                    this.A03 = f2e;
                                }
                            }
                            f2e.A00();
                        }
                        AnonymousClass0fD.A09(977559693, A022);
                        return;
                    }
                }
            } else {
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A09(-201413691, A022);
                throw A0y;
            }
        }
        0qQ.A0F("userSession");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1093815926);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.share_later, viewGroup, false);
        AnonymousClass0fD.A09(1127471542, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(2057362160);
        super.onDestroy();
        this.A02 = null;
        AnonymousClass0fD.A09(1698922519, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-791657412);
        super.onDestroyView();
        this.A05 = null;
        this.A0B = null;
        this.appShareTable = null;
        C357128Wq r0 = this.A06;
        if (r0 != null) {
            r0.A05();
            this.A06 = null;
        }
        Dbc.A0q(this, 0);
        AnonymousClass0fD.A09(-1011879891, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-534038520);
        ShareLaterFragment.super.onPause();
        0nA.A0N(this.A05);
        C2594141p.A00(requireActivity(), this.A0A);
        Window A0G2 = DbV.A0G(this);
        if (A0G2 != null) {
            A0G2.setSoftInputMode(48);
            AnonymousClass0fD.A09(1353401139, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-1299283131, A022);
        throw A0y;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(345812117);
        super.onResume();
        C60058JeZ jeZ = this.appShareTable;
        if (jeZ != null) {
            jeZ.A06(this.A04);
            C60058JeZ jeZ2 = this.appShareTable;
            if (jeZ2 != null) {
                jeZ2.setEnabled(true);
                C60058JeZ jeZ3 = this.appShareTable;
                0qQ.A0A(jeZ3);
                Iterator it = jeZ3.A0O.iterator();
                while (it.hasNext()) {
                    JTO.A0H(it).setAlpha(1.0f);
                }
            }
        }
        A00(this);
        AnonymousClass5w9 r0 = AnonymousClass5w8.A05;
        UserSession userSession = this.A00;
        if (userSession != null) {
            AnonymousClass5w9.A00(userSession).A08((C3034168s) null);
            this.A0A = requireActivity().getRequestedOrientation();
            C2594141p.A00(requireActivity(), -1);
            Window A0G2 = DbV.A0G(this);
            if (A0G2 != null) {
                A0G2.setSoftInputMode(16);
                UserSession userSession2 = this.A00;
                if (userSession2 != null) {
                    C295095nZ A0S = JTT.A0S(userSession2);
                    if (!this.A0E && A0S != null && AnonymousClass5w9.A02(A0S)) {
                        UserSession userSession3 = this.A00;
                        if (userSession3 != null) {
                            if (AnonymousClass5w9.A01(userSession3) && !A0S.A00 && A0S.A05) {
                                C60058JeZ jeZ4 = this.appShareTable;
                                0qQ.A0A(jeZ4);
                                requireContext();
                                UserSession userSession4 = this.A00;
                                if (userSession4 != null) {
                                    AnonymousClass5w9.A00(userSession4);
                                    jeZ4.A05(A0S, (IgdsSwitch) null, (String) null, "share_later", false);
                                    this.A0E = true;
                                }
                            }
                        }
                    }
                    AnonymousClass0fD.A09(1674476790, A022);
                    return;
                }
            } else {
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A09(114832037, A022);
                throw A0y;
            }
        }
        0qQ.A0F("userSession");
        throw AnonymousClass00P.createAndThrow();
    }
}
