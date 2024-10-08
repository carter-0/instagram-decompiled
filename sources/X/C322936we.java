package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.api.schemas.IGUserHighlightsTrayType;
import com.instagram.archive.data.HighlightsSettingsRepository;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.profile.intf.AutoLaunchReelParams;
import com.instagram.repository.storyhighlights.StoryHighlightsTrayManager$Instance;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.6we  reason: invalid class name and case insensitive filesystem */
public final class C322936we extends C252233om implements C317776no, C322946wf, C230222pE {
    public AnonymousClass3BQ A00 = AnonymousClass3BQ.PROFILE_HIGHLIGHTS_TRAY;
    public AutoLaunchReelParams A01;
    public String A02;
    public List A03;
    public AnonymousClass6UX A04;
    public final Activity A05;
    public final C2366634p A06;
    public final C322126vI A07;
    public final HighlightsSettingsRepository A08;
    public final AnonymousClass0iw A09;
    public final UserSession A0A;
    public final C323016wn A0B;
    public final UserDetailFragment A0C;
    public final StoryHighlightsTrayManager$Instance A0D;
    public final boolean A0E;
    public final 1Ng A0F;
    public final 1wn A0G = new C322996wl(this);
    public final C322896wa A0H;
    public final UserDetailTabController A0I;
    public final UserDetailTabController A0J;
    public final Dc6 A0K;
    public final AnonymousClass32A A0L;
    public final boolean A0M;
    public final boolean A0N;

    /* JADX WARNING: type inference failed for: r0v17, types: [X.6wo, java.lang.Object] */
    public C322936we(C2366634p r5, C322126vI r6, AnonymousClass0iw r7, UserSession userSession, C322896wa r9, UserDetailFragment userDetailFragment, UserDetailTabController userDetailTabController, UserDetailTabController userDetailTabController2, Dc6 dc6, AutoLaunchReelParams autoLaunchReelParams, String str, boolean z) {
        0qQ.A0B(userSession, 3);
        0qQ.A0B(userDetailTabController, 7);
        0qQ.A0B(r5, 9);
        this.A0C = userDetailFragment;
        this.A07 = r6;
        this.A0A = userSession;
        this.A09 = r7;
        this.A0E = z;
        this.A0I = userDetailTabController;
        this.A01 = autoLaunchReelParams;
        this.A06 = r5;
        this.A0H = r9;
        this.A0K = dc6;
        this.A0J = userDetailTabController2;
        this.A0M = 0eE.A00(userSession).A00().A2P();
        this.A0F = AnonymousClass1Nd.A00(userSession);
        this.A05 = userDetailFragment.requireActivity();
        this.A0D = C322966wh.A02.A00(userSession, str);
        this.A0L = new AnonymousClass32A(userDetailFragment, userSession, new AnonymousClass328(userDetailFragment, -1));
        this.A0N = 182.A06(0Tu.A05, userSession, 36322697336138082L);
        C323016wn A002 = C323006wm.A00(userSession);
        this.A0B = A002;
        this.A08 = C323036wp.A00(new Object(), userSession);
        r6.A01 = this;
        0eE.A00(userSession).A00().A03.Edy(Boolean.valueOf(A002.A00.getBoolean("my_week_enabled", false)));
    }

    public final void A07(String str) {
        UserSession userSession = this.A0A;
        0qQ.A0B(userSession, 0);
        02m.A0p.markerStart(18284551);
        this.A06.A08((String) null);
        StoryHighlightsTrayManager$Instance storyHighlightsTrayManager$Instance = this.A0D;
        Context requireContext = this.A0C.requireContext();
        0Tu r4 = 0Tu.A05;
        boolean A062 = 182.A06(r4, userSession, 36329019528068836L);
        storyHighlightsTrayManager$Instance.A00 = requireContext;
        storyHighlightsTrayManager$Instance.A03 = true;
        for (C317776no DJR : storyHighlightsTrayManager$Instance.A06) {
            DJR.DJR(true);
        }
        C322966wh r2 = storyHighlightsTrayManager$Instance.A09;
        UserSession userSession2 = r2.A00;
        0qQ.A0B(userSession2, 0);
        String str2 = str;
        if (182.A06(r4, userSession2, 36320008687460214L)) {
            C322986wk r7 = storyHighlightsTrayManager$Instance.A05;
            C318466oz r10 = C318466oz.A00;
            Integer A002 = C322966wh.A00(r2);
            0qQ.A0B(r10, 4);
            C262224Cq r1 = r7.A01;
            1Eo.A05(19B.A00, new C41547AwD(requireContext, r7, A002, userSession2, r10, str2, (AnonymousClass4D7) null, 0, true), r1);
            return;
        }
        C322986wk r0 = storyHighlightsTrayManager$Instance.A05;
        C318466oz r3 = C318466oz.A00;
        Integer A003 = C322966wh.A00(r2);
        r0.A00(requireContext, userSession2, r3, false, Boolean.valueOf(A062), (Boolean) null, A003, str2, true);
    }

    public final void CLl(String str) {
    }

    public final boolean Cdz(Reel reel) {
        if (this.A02 == null) {
            return false;
        }
        String id = reel.getId();
        0qQ.A07(id);
        String str = this.A02;
        if (str == null) {
            throw new IllegalArgumentException("Required value was null.");
        } else if (!00l.A0d(id, str, false)) {
            return false;
        } else {
            this.A02 = null;
            return true;
        }
    }

    public final void Cmq() {
    }

    public final void D0J(Reel reel) {
    }

    public final void DBv() {
        if (!A06(true)) {
            C310336ap r2 = new C310336ap();
            UserDetailFragment userDetailFragment = this.A0C;
            r2.A0D = userDetailFragment.getString(2131961613);
            r2.A0L = true;
            String string = userDetailFragment.getString(2131961612);
            0qQ.A07(string);
            r2.A0G = string;
            r2.A0A(new WYC(this));
            r2.A0O = true;
            r2.A06();
            1xC.A01.A00(new AnonymousClass3GP(r2.A00()));
        }
    }

    public final /* synthetic */ void DFj(Reel reel, AnonymousClass6UY r2) {
    }

    public final void DIR() {
    }

    public final void DJS(AnonymousClass3HO r19, List list, boolean z) {
        Integer num;
        AnonymousClass71H r2;
        View findViewById;
        List list2 = list;
        0qQ.A0B(list2, 2);
        AnonymousClass3HO r4 = r19;
        C239753Ia A002 = r4.FH3();
        UserSession userSession = this.A0A;
        1E4.A00(userSession);
        C239773Ic r1 = A002.A00;
        if (r1 != null) {
            Dc6 dc6 = this.A0K;
            if (dc6 != null) {
                String moduleName = this.A09.getModuleName();
                0qQ.A0B(moduleName, 1);
                List<C46251DSg> BPh = r1.BPh();
                if (BPh != null) {
                    ArrayList<DTI> arrayList = new ArrayList<>();
                    for (C46251DSg Bni : BPh) {
                        0sn Bni2 = Bni.Bni();
                        if (Bni2 == null) {
                            Bni2 = 0sn.A00;
                        }
                        018.A16(Bni2, arrayList);
                    }
                    for (DTI BFv : arrayList) {
                        ExtendedImageUrl BFv2 = BFv.BFv();
                        if (BFv2 != null) {
                            14G.A05(new 14G());
                            1NK.A07(new C50244FVb(BFv2, dc6, moduleName));
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        IGUserHighlightsTrayType iGUserHighlightsTrayType = A002.A01;
        if (iGUserHighlightsTrayType != null) {
            Dc6 dc62 = this.A0K;
            if (dc62 != null) {
                dc62.A01 = iGUserHighlightsTrayType;
            }
            this.A0J.A0P.A00();
        }
        boolean z2 = false;
        if (iGUserHighlightsTrayType != IGUserHighlightsTrayType.SUBTAB) {
            if (iGUserHighlightsTrayType == IGUserHighlightsTrayType.CARDS) {
                z2 = true;
            }
            boolean z3 = this.A0E;
            if (z3) {
                this.A0B.A01(0qQ.A0K(A002.A07, true));
            }
            C322126vI r6 = this.A07;
            r6.A09(z2);
            if (z2) {
                num = AnonymousClass05K.A0C;
            } else {
                num = AnonymousClass05K.A01;
            }
            UserDetailFragment userDetailFragment = this.A0C;
            View view = userDetailFragment.mView;
            Object obj = null;
            if (!(view == null || (findViewById = view.findViewById(R.id.highlights_tray)) == null)) {
                obj = findViewById.getTag();
            }
            if ((obj instanceof AnonymousClass71H) && (r2 = (AnonymousClass71H) obj) != null) {
                AnonymousClass71I.A00(userDetailFragment.requireContext(), r2, num);
            }
            if (z3) {
                0h9 r0 = userDetailFragment.mLifecycleRegistry;
                0qQ.A07(r0);
                AnonymousClass0xx A003 = C71772f0.A00(r0);
                AnonymousClass9KI r11 = new AnonymousClass9KI(this, A002, list2, (AnonymousClass4D7) null, 6, z2);
                1Eo.A03(AnonymousClass05K.A00, 19B.A00, r11, A003);
            }
            r6.A02 = true;
            A05(list2, new AnonymousClass9LD(this, 11), z);
            0qQ.A0B(userSession, 0);
            02m.A0p.markerEnd(18284551, 2);
            long j = r4.mServerElapsedTime;
            if (j >= 0) {
                this.A06.A01.A0F("story_highlights_ig_server_request_elapsed_time_ms", (float) j);
            }
            this.A06.A05();
            return;
        }
        C322126vI r02 = this.A07;
        r02.A04 = false;
        r02.A05();
        r02.notifyDataSetChanged();
    }

    public final /* synthetic */ void DR6() {
    }

    public final void DTT(Reel reel) {
        if (!A06(true)) {
            C331127Pr r0 = new C331127Pr(this.A0A);
            String str = null;
            r0.A0T = null;
            C331157Pu A002 = r0.A00();
            Activity activity = this.A05;
            if (reel != null) {
                str = reel.getId();
            }
            E0d e0d = new E0d();
            Bundle bundle = new Bundle();
            bundle.putString("reel_id_tag", str);
            e0d.setArguments(bundle);
            A002.A02(activity, e0d);
            AnonymousClass37D A012 = AnonymousClass37D.A00.A01(activity);
            if (A012 != null) {
                ((AnonymousClass37F) A012).A0H = new C57393IZy(this);
            }
        }
    }

    public final void DU2() {
    }

    public final void DVw() {
    }

    public final /* synthetic */ void DWD(long j, int i) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ void DWE(long j) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DcC(Reel reel) {
        0qQ.A0B(reel, 0);
        C322126vI r2 = this.A07;
        r2.Ei9(00k.A0f(r2.A04(), reel), false, this.A0A);
    }

    public final void DcY(C62539KhV khV, String str) {
    }

    public final /* synthetic */ void DcZ(Reel reel, AnonymousClass3BN r2, int i) {
    }

    public final void Dca(C249703kE r12, AnonymousClass3O9 r13, Integer num, String str, String str2, List list, int i, boolean z) {
        ArrayList A0U;
        String str3;
        AnonymousClass3BQ r0;
        0qQ.A0B(str, 0);
        0qQ.A0B(list, 2);
        0qQ.A0B(r12, 3);
        C65591LwR lwR = null;
        if (!A06(00l.A0d(str, "myWeek", false))) {
            UserSession userSession = this.A0A;
            Reel A0M2 = 1OP.A05(userSession).A0M(str);
            if (A0M2 == null && (A0M2 = this.A07.A03(str)) == null) {
                0wb.A03("ProfileReelTrayController", "Reel is null. Prematurely aborting stories viewer entry.");
                return;
            }
            if (A0M2.A0p()) {
                A0U = new ArrayList();
                A0U.add(A0M2);
                lwR = new C65591LwR(A0M2, this);
                str3 = "tap_reel_suggested_highlights";
            } else {
                A0U = 00k.A0U(this.A07.A04());
                str3 = "tap_reel_highlights";
            }
            this.A0C.A0y(Boolean.valueOf(r12 instanceof C60704Jpp), str3, str, A0M2.A1S);
            if (A0M2.A0p()) {
                r0 = AnonymousClass3BQ.PROFILE_SUGGESTED_HIGHLIGHT;
            } else {
                r0 = AnonymousClass3BQ.PROFILE_HIGHLIGHTS_TRAY;
            }
            this.A00 = r0;
            AnonymousClass3BQ r1 = AnonymousClass3BQ.PROFILE_HIGHLIGHTS_TRAY;
            0qQ.A0B(userSession, 0);
            int i2 = i;
            C2366334m.A00(userSession).A03(A0M2, r1, i2);
            Reel A032 = this.A07.A03(str);
            ViewParent parent = r12.itemView.getParent();
            0qQ.A0C(parent, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            A00((RecyclerView) parent, A032, this.A00, this, lwR, A0U, i2);
        }
    }

    public final /* synthetic */ void Dcb(C249703kE r1, AnonymousClass3O9 r2, Integer num, String str, String str2, String str3, List list, float f, int i, int i2, boolean z) {
    }

    public final void Dcd(Reel reel, AnonymousClass3BN r2, Integer num, int i) {
    }

    public final void Dcf(List list, int i, String str) {
        0qQ.A0B(str, 0);
        UserSession userSession = this.A0A;
        Reel A0M2 = 1OP.A05(userSession).A0M(str);
        if (A0M2 != null && A0M2.A0W != null) {
            Activity activity = this.A05;
            UserDetailFragment userDetailFragment = this.A0C;
            new W2M(activity, userDetailFragment, userDetailFragment, userSession, A0M2).A04(new C19148WNe(A0M2, this, str), AnonymousClass05K.A01);
        }
    }

    public final void Dci(String str) {
    }

    public final /* synthetic */ void Dcl(Reel reel) {
    }

    public final void Du3(int i) {
    }

    public final void E0D(C249703kE r1, Reel reel, Integer num, String str, String str2, List list) {
    }

    public final boolean EsD(Integer num, int i, int i2) {
        0qQ.A0B(num, 2);
        return this.A0D.EsD(num, i, i2);
    }

    /* JADX WARNING: type inference failed for: r17v2, types: [X.XC0] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.XC0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(androidx.recyclerview.widget.RecyclerView r14, com.instagram.model.reels.Reel r15, X.AnonymousClass3BQ r16, X.C322936we r17, X.C20960X6n r18, java.util.List r19, int r20) {
        /*
            if (r15 != 0) goto L_0x000a
            java.lang.String r1 = "ProfileReelTrayController"
            java.lang.String r0 = "Reel is null. Prematurely aborting stories viewer entry."
            X.0wb.A03(r1, r0)
            return
        L_0x000a:
            r9 = r14
            r0 = r20
            X.3kE r3 = r14.A0W(r0)
            r2 = 0
            if (r3 != 0) goto L_0x0015
            r3 = r2
        L_0x0015:
            X.32D r0 = new X.32D
            r0.<init>()
            r5 = 1
            r0.A07 = r5
            com.instagram.model.reels.ReelViewerConfig r1 = new com.instagram.model.reels.ReelViewerConfig
            r1.<init>((X.AnonymousClass32D) r0)
            boolean r4 = r3 instanceof X.C60704Jpp
            r13 = r17
            if (r4 == 0) goto L_0x006c
            android.app.Activity r6 = r13.A05
            X.6vI r0 = r13.A07
            X.Upm r7 = new X.Upm
            r7.<init>(r6, r14, r0, r13)
            r13.A04 = r7
        L_0x0033:
            X.32A r14 = r13.A0L
            r14.A05 = r7
            com.instagram.profile.fragment.UserDetailFragment r6 = r13.A0C
            X.2pH r0 = r6.A1M
            java.lang.String r0 = r0.A04
            r14.A0C = r0
            X.WNI r0 = r6.A0l()
            r14.A01 = r0
            r14.A0F = r5
            r14.A03 = r1
            r0 = r18
            r14.A06 = r0
            boolean r0 = r15.A1R
            if (r0 == 0) goto L_0x006a
            com.instagram.common.session.UserSession r0 = r13.A0A
            int r1 = r15.A03(r0)
        L_0x0057:
            r18 = r19
            if (r4 == 0) goto L_0x0086
            boolean r0 = r3 instanceof X.XC0
            if (r0 == 0) goto L_0x0062
            X.XC0 r3 = (X.XC0) r3
            r2 = r3
        L_0x0062:
            r17 = r2
            r20 = r1
            r14.A07(r15, r16, r17, r18, r19, r20)
            return
        L_0x006a:
            r1 = -1
            goto L_0x0057
        L_0x006c:
            android.app.Activity r8 = r13.A05
            com.instagram.common.session.UserSession r11 = r13.A0A
            X.0iw r10 = r13.A09
            boolean r0 = r15.A0p()
            if (r0 == 0) goto L_0x0083
            X.3BQ r12 = X.AnonymousClass3BQ.PROFILE_SUGGESTED_HIGHLIGHT
        L_0x007a:
            r14 = 0
            X.6UW r7 = new X.6UW
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r13.A04 = r7
            goto L_0x0033
        L_0x0083:
            X.3BQ r12 = X.AnonymousClass3BQ.PROFILE_HIGHLIGHTS_TRAY
            goto L_0x007a
        L_0x0086:
            r14.A00 = r1
            boolean r0 = r3 instanceof X.AnonymousClass3N2
            if (r0 == 0) goto L_0x008f
            r2 = r3
            X.3N3 r2 = (X.AnonymousClass3N3) r2
        L_0x008f:
            r17 = r2
            r20 = r18
            r14.A05(r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C322936we.A00(androidx.recyclerview.widget.RecyclerView, com.instagram.model.reels.Reel, X.3BQ, X.6we, X.X6n, java.util.List, int):void");
    }

    public static final void A01(UserSession userSession, C322936we r5, int i) {
        Activity activity = r5.A05;
        View findViewById = activity.findViewById(R.id.tray_edit_button);
        if (findViewById != null) {
            AnonymousClass5Gt r0 = new AnonymousClass5Gt(activity, new C315476jx(i));
            r0.A03(findViewById);
            r0.A01();
            r0.A00().A07(userSession);
        }
    }

    public static final void A02(C322936we r4) {
        r4.A0C.A10("reel_tray", "highlight_creation_tap");
        JZV.A07(r4.A05, Ki3.SELF_PROFILE, r4.A0A, true);
    }

    public static final void A03(C322936we r3) {
        UserSession userSession = r3.A0A;
        1OP r0 = 1OP.$redex_init_class;
        0qQ.A0B(userSession, 0);
        AnonymousClass3PC A002 = AnonymousClass3PA.A00(userSession);
        0qQ.A07(A002);
        r3.A05(00k.A0U(A002.A00.values()), C319416qY.A00, true);
    }

    public static final void A04(C322936we r8, String str) {
        String str2;
        C319976rX r1 = C319976rX.A00;
        UserSession userSession = r8.A0A;
        AnonymousClass0iw r2 = r8.A09;
        C319986rY r4 = C319986rY.SELF;
        String str3 = userSession.A06;
        if (r8.A0M) {
            str2 = "forced_migration";
        } else {
            str2 = "opt_in";
        }
        r1.A0D(r2, userSession, r4, str, str3, str2, (String) null);
    }

    private final void A05(List list, C62320sa r14, boolean z) {
        if (!this.A0N || !list.isEmpty()) {
            UserSession userSession = this.A0A;
            01V.A1D(list, Reel.A00(userSession, list));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (!z) {
                linkedHashSet.addAll(this.A07.A04());
            }
            linkedHashSet.addAll(list);
            C322126vI.A01((MRU) null, this.A07, 00k.A0a(linkedHashSet), new C3252871u(this, r14, z));
            0Tu r4 = 0Tu.A05;
            if (182.A06(r4, userSession, 36324913539330518L) && (z || !182.A06(r4, userSession, 36324913539396055L))) {
                ArrayList arrayList = new ArrayList();
                int A012 = (int) 182.A01(r4, userSession, 36606388516165029L);
                int A013 = (int) 182.A01(r4, userSession, 36606388516230566L);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Reel reel = (Reel) it.next();
                    arrayList.add(new AnonymousClass3PJ(AnonymousClass3BU.FOREGROUND_PREFETCH, reel.getId(), A012, reel.A03(userSession), -1));
                    if (arrayList.size() > A013) {
                        break;
                    }
                }
                AnonymousClass3BV.A00(userSession).A0C(this.A09.getModuleName(), (String) null, arrayList);
            }
            this.A0I.A0F();
        }
    }

    private final boolean A06(boolean z) {
        if (!z) {
            return false;
        }
        UserDetailFragment userDetailFragment = this.A0C;
        if (!userDetailFragment.A15()) {
            return false;
        }
        UserSession userSession = this.A0A;
        if (!182.A06(0Tu.A05, userSession, 36322289314900017L)) {
            return false;
        }
        userDetailFragment.A10("reel_tray", "tap_reel_highlights_updates_hub");
        C309516Yo r1 = new C309516Yo(userDetailFragment.requireActivity(), userSession);
        r1.A0D(LT8.A05(userSession.A05));
        r1.A0F = true;
        r1.A04();
        return true;
    }

    public final void AUz() {
        this.A0D.AUz();
    }

    public final /* synthetic */ int C8o() {
        return 0;
    }

    public final boolean CJl() {
        return this.A0D.A02;
    }

    public final /* synthetic */ boolean CKY() {
        return false;
    }

    public final boolean CKZ() {
        return this.A0D.CKZ();
    }

    public final void D6h(View view) {
        UserSession userSession = this.A0A;
        if (182.A06(0Tu.A05, userSession, 36326464022460183L)) {
            View view2 = view;
            Context context = view2.getContext();
            0qQ.A0A(context);
            C355148Ov r1 = new C355148Ov(context, userSession, (Integer) null, false);
            String string = context.getResources().getString(2131974427);
            0qQ.A07(string);
            C367618rI r5 = new C367618rI((Drawable) null, context.getDrawable(R.drawable.instagram_story_highlight_pano_outline_24), (C15048ULb) null, new C40541Ado(this), (Integer) null, string, 0, 0, 0, false, false, false, true, false, false, false);
            String string2 = context.getResources().getString(2131967778);
            0qQ.A07(string2);
            r1.A02(0sr.A1P(new C367618rI[]{r5, new C367618rI((Drawable) null, context.getDrawable(R.drawable.instagram_music_add_pano_outline_24), (C15048ULb) null, new C50477FcP(), (Integer) null, string2, 0, 0, 0, false, false, false, true, false, false, false)}));
            r1.showAsDropDown(view2);
            return;
        }
        A02(this);
    }

    public final void DJP(boolean z) {
        C322126vI r2 = this.A07;
        if (r2.A05) {
            r2.A05 = false;
            r2.A06();
        }
    }

    public final void DJQ(boolean z) {
        Dc6 dc6;
        User user;
        UserSession userSession = this.A0A;
        0qQ.A0B(userSession, 0);
        02m.A0p.markerEnd(18284551, 3);
        if (!182.A06(0Tu.A05, userSession, 36325274316976952L) || !((dc6 = this.A0K) == null || (user = dc6.A03) == null || !C324376zB.A02(userSession, user))) {
            this.A06.A01();
        } else {
            this.A06.A05();
        }
    }

    public final void DJR(boolean z) {
        C322126vI r2 = this.A07;
        if (!r2.A05) {
            r2.A05 = true;
            r2.A06();
        }
    }

    public final void onCreate() {
        this.A0F.A01(this.A0G, AnonymousClass6UQ.class);
    }

    public final void onDestroy() {
        this.A0F.A02(this.A0G, AnonymousClass6UQ.class);
    }

    public final void onDestroyView() {
        List<ViewTreeObserver.OnGlobalLayoutListener> list = this.A03;
        if (list != null) {
            for (ViewTreeObserver.OnGlobalLayoutListener removeOnGlobalLayoutListener : list) {
                this.A0C.requireView().getViewTreeObserver().removeOnGlobalLayoutListener(removeOnGlobalLayoutListener);
            }
        }
        StoryHighlightsTrayManager$Instance storyHighlightsTrayManager$Instance = this.A0D;
        Set set = storyHighlightsTrayManager$Instance.A06;
        set.remove(this);
        if (set.isEmpty()) {
            storyHighlightsTrayManager$Instance.A00 = null;
        }
        this.A03 = null;
    }

    public final void onResume() {
        String str;
        if (this.A0E) {
            ArrayList A052 = 28K.A00(this.A0A).A05(AnonymousClass05K.A0N);
            C322126vI r7 = this.A07;
            Object obj = null;
            r7.A00 = null;
            if (!A052.isEmpty()) {
                Iterator it = A052.iterator();
                if (it.hasNext()) {
                    obj = it.next();
                    if (it.hasNext()) {
                        long j = ((AnonymousClass3Q2) obj).A0e;
                        do {
                            Object next = it.next();
                            long j2 = ((AnonymousClass3Q2) next).A0e;
                            if (j < j2) {
                                obj = next;
                                j = j2;
                            }
                        } while (it.hasNext());
                    }
                }
                AnonymousClass3Q2 r8 = (AnonymousClass3Q2) obj;
                if (r8 != null) {
                    AnonymousClass8VT r0 = r8.A1Y;
                    if (r0 == null || (str = r0.A00) == null) {
                        str = "myWeek";
                    }
                    this.A02 = str;
                    Bitmap decodeFile = BitmapFactory.decodeFile(r8.A33);
                    String str2 = this.A02;
                    if (!(str2 == null || !00l.A0d(str2, "myWeek", false) || decodeFile == null)) {
                        r7.A00 = decodeFile;
                    }
                    new Handler(Looper.getMainLooper()).postDelayed(new C65916M4f(this), 3000);
                }
            } else {
                this.A0C.A16();
            }
            A03(this);
            return;
        }
        this.A07.A06();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.A0D.A01(this, this.A0C);
    }
}
