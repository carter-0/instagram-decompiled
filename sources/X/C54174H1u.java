package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import com.instagram.android.R;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.H1u  reason: case insensitive filesystem */
public final class C54174H1u extends AnonymousClass32G implements C229122ms, AnonymousClass4DU, C227252iu, AbsListView.OnScrollListener, AnonymousClass4DS, AnonymousClass4DT {
    public static final String __redex_internal_original_name = "ShortUrlFeedFragment";
    public C2366634p A00;
    public C2366634p A01;
    public AnonymousClass36D A02;
    public C324356z9 A03;
    public HDB A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public C227762js A0D;
    public 2el A0E;
    public C14190TrU A0F;
    public C234042wt A0G;
    public Dc1 A0H;
    public final Handler A0I = new Handler();
    public final AnonymousClass0eM A0J = C227642jf.A02(this);
    public final C229132mt A0K = new ISY(this, 9);
    public final GTW A0L = new GTW();

    public final boolean CKB() {
        return false;
    }

    public final boolean CWV() {
        return true;
    }

    public final boolean CbJ() {
        return true;
    }

    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        r5.ETj(AnonymousClass7TE.A0l(this.A0J), R.layout.action_bar_title_logo, DbZ.A02(this), 0);
        r5.Eu4(true);
        r5.ErT(this);
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
        2el r3 = this.A0E;
        if (r3 != null) {
            AnonymousClass0eM r6 = this.A0J;
            0lg A0X = DbT.A0X(r6);
            0Tu r5 = 0Tu.A05;
            if (182.A06(r5, A0X, 36330784759628559L) && 182.A06(r5, DbT.A0X(r6), 2342173793973256974L)) {
                List A002 = C238773Dj.A00.A00(view, AnonymousClass7TE.A0l(r6));
                AnonymousClass3DZ A003 = AnonymousClass3DZ.A00(this);
                AnonymousClass2eo[] r1 = (AnonymousClass2eo[]) A002.toArray(new AnonymousClass2eo[0]);
                r3.A08(view, A003, (AnonymousClass2eo[]) Arrays.copyOf(r1, r1.length));
            }
        }
        0S7.A00(this);
        ListView listView = this.A04;
        0qQ.A0C(listView, AnonymousClass000.A00(31));
        ((RefreshableListView) listView).setupAndEnableRefresh(C56801ICy.A00(this, 69));
        Context context = getContext();
        if (context != null) {
            C227762js r32 = this.A0D;
            if (r32 == null) {
                str = "_helper";
            } else {
                C238133Ar scrollingViewProxy = getScrollingViewProxy();
                HDB hdb = this.A04;
                if (hdb == null) {
                    str = "adapter";
                } else {
                    r32.A06(hdb, scrollingViewProxy, AnonymousClass3D4.A00(context));
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        0S7.A00(this);
        this.A04.setOnScrollListener(this);
    }

    public static final void A01(Activity activity, 1Xj r54, C54174H1u h1u, String str, String str2, String str3) {
        String str4 = str;
        if (str == null) {
            str4 = "";
        }
        AnonymousClass0eM r0 = h1u.A0J;
        1Xj r2 = r54;
        boolean A022 = 2R8.A02(AnonymousClass7TE.A0l(r0), r2);
        String str5 = str2;
        String str6 = str3;
        C53335GmL gmL = new C53335GmL(AnonymousClass5OB.DEEP_LINK, (Float) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, str4, (String) null, "feed_short_url", str5, (String) null, (String) null, str6, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, r2.A0r(), A022, true, false, false, false, false, false, false, r2.A5v(), false, false, false, false, false, false, false, false, r2.A4l(), false, false, false, false, false, false, false, false);
        Activity activity2 = activity;
        C53335GmL gmL2 = gmL;
        C3018960m.A00().A00().A00(activity2, (C59544JNq) null, gmL2, AnonymousClass7TE.A0l(r0), (C273414mX) null, (C62320sa) null, 182.A06(0Tu.A05, DbT.A0X(r0), 36318771736287670L), false, r2.CcK());
    }

    public static final void A02(C54174H1u h1u) {
        C2366634p r0 = h1u.A00;
        if (r0 != null) {
            r0.A04();
        }
        C324356z9 r3 = h1u.A03;
        if (r3 == null) {
            C51965G9l.A16();
            throw AnonymousClass00P.createAndThrow();
        }
        String str = h1u.A08;
        if (str == null) {
            str = "";
        }
        r3.A03(C3724090s.A04(AnonymousClass7TE.A0l(h1u.A0J), str), new C54378HAt(h1u, 4));
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return DbT.A0X(this.A0J);
    }

    public final C227762js BD0() {
        C227762js r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("_helper");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CJz() {
        HDB hdb = this.A04;
        if (hdb == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        } else if (!AnonymousClass7TE.A1b(((AnonymousClass2rW) hdb.A00).A01)) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean CT5() {
        C324356z9 r0 = this.A03;
        if (r0 != null) {
            return C51973G9u.A1Y(r0);
        }
        C51965G9l.A16();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void EKl() {
        if (this.mView != null) {
            0S7.A00(this);
            this.A04.setSelection(0);
        }
    }

    public final String getModuleName() {
        return "feed_short_url";
    }

    public final boolean isLoading() {
        C324356z9 r0 = this.A03;
        if (r0 == null) {
            C51965G9l.A16();
            throw AnonymousClass00P.createAndThrow();
        } else if (r0.A03.A03 == AnonymousClass05K.A00 || this.A0A) {
            return true;
        } else {
            return false;
        }
    }

    public final void CgO() {
        A02(this);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.07Z, X.4DU, X.0S7, X.0iw, androidx.fragment.app.Fragment, X.H1u, java.lang.Object, X.4DV, X.32G] */
    /* JADX WARNING: type inference failed for: r8v0, types: [X.3kK, java.lang.Object, X.1L1] */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.lang.Float, java.lang.String, X.30S] */
    /* JADX WARNING: type inference failed for: r1v34, types: [android.widget.ListAdapter, X.HDB] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r2v46, types: [X.HDB] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r68) {
        /*
            r67 = this;
            r0 = -274391664(0xffffffffefa51d90, float:-1.0220153E29)
            int r13 = X.AnonymousClass0fD.A02(r0)
            r0 = r67
            r1 = r68
            X.C54174H1u.super.onCreate(r1)
            android.content.Context r12 = r0.requireContext()
            X.0eM r14 = r0.A0J
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r14)
            android.content.Context r1 = r0.requireContext()
            X.2kR r9 = new X.2kR
            r9.<init>(r1, r2, r0)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r14)
            X.6vO r10 = new X.6vO
            r10.<init>(r1)
            android.os.Bundle r3 = r0.requireArguments()
            r1 = 58
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String r1 = r3.getString(r1)
            java.lang.String r16 = ""
            if (r1 != 0) goto L_0x003e
            r1 = r16
        L_0x003e:
            r0.A09 = r1
            r45 = 0
            X.1L1 r8 = new X.1L1
            r8.<init>()
            r8.A00 = r1
            r1 = 2895(0xb4f, float:4.057E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            java.lang.String r1 = r3.getString(r2)
            if (r1 == 0) goto L_0x032f
            java.lang.String r1 = r3.getString(r2)
            if (r1 != 0) goto L_0x005d
            r1 = r16
        L_0x005d:
            X.1sy r25 = X.1sy.valueOf(r1)
        L_0x0061:
            java.lang.String r1 = "open_comments"
            boolean r1 = r3.getBoolean(r1)
            r7 = 1
            if (r1 == 0) goto L_0x006c
            r0.A0B = r7
        L_0x006c:
            r1 = 5097(0x13e9, float:7.142E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r1 = r3.getBoolean(r1)
            if (r1 == 0) goto L_0x007a
            r0.A0C = r7
        L_0x007a:
            X.0lg r5 = X.DbT.A0X(r14)
            X.0Tu r4 = X.0Tu.A05
            r1 = 36319626434911786(0x81088200071e2a, double:3.0320162326106785E-306)
            boolean r39 = X.182.A06(r4, r5, r1)
            X.0lg r5 = X.DbT.A0X(r14)
            r1 = 36316757396427387(0x8105e60002127b, double:3.030201841120454E-306)
            boolean r2 = X.182.A06(r4, r5, r1)
            r1 = 50
            java.lang.String r6 = X.AnonymousClass000.A00(r1)
            if (r2 == 0) goto L_0x026f
            X.2el r1 = X.C51969G9p.A0k()
            r0.A0E = r1
            X.0lg r2 = X.DbT.A0X(r14)
            X.2el r1 = r0.A0E
            X.2nI r49 = X.C229382nI.A02(r0, r0, r2, r1)
            X.0Pk r5 = X.0Pl.A0n
            android.content.Context r2 = r0.requireContext()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r14)
            X.0Pl r57 = r5.A00(r2, r1)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r14)
            X.2oD r2 = new X.2oD
            r2.<init>(r0, r1, r0, r0)
            androidx.fragment.app.FragmentActivity r51 = r0.requireActivity()
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0qQ.A0C(r1, r6)
            X.3jo r1 = (X.C249453jo) r1
            r5 = 0
            r64 = 0
            X.2s3 r50 = new X.2s3
            r52 = r0
            r53 = r1
            r54 = r49
            r55 = r2
            r56 = r9
            r58 = r8
            r59 = r5
            r50.<init>(r51, r52, r53, r54, r55, r56, r57, r58, r59)
            androidx.fragment.app.FragmentActivity r48 = r0.requireActivity()
            X.GTW r1 = r0.A0L
            java.lang.Integer r61 = X.AnonymousClass05K.A01
            r46 = r3
            r47 = r0
            r51 = r1
            r52 = r10
            r53 = r9
            r54 = r5
            r55 = r25
            r56 = r5
            r57 = r5
            r58 = r5
            r59 = r0
            r60 = r5
            r62 = r5
            r63 = r5
            r65 = r39
            r66 = r64
            X.HDB r2 = X.GUR.A00(r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66)
        L_0x0114:
            r0.A04 = r2
            int r2 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            r7 = 0
            X.2js r10 = X.C227752jr.A00(r12, r5, r7)
            r0.A0D = r10
            java.lang.String r15 = "_helper"
            X.HDB r6 = r0.A04
            java.lang.String r12 = "adapter"
            if (r6 == 0) goto L_0x026a
            X.2ku r2 = r1.A01
            X.2xD r11 = new X.2xD
            r11.<init>(r0, r10, r2, r6)
            r2 = 2891(0xb4b, float:4.051E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            java.lang.String r2 = r3.getString(r2)
            if (r2 != 0) goto L_0x013c
            r2 = r16
        L_0x013c:
            r0.A05 = r2
            r2 = 2893(0xb4d, float:4.054E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            java.lang.String r2 = r3.getString(r2)
            r0.A07 = r2
            r2 = 2892(0xb4c, float:4.053E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            java.lang.String r2 = r3.getString(r2)
            r0.A06 = r2
            r2 = 2894(0xb4e, float:4.055E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            java.lang.String r6 = r3.getString(r2)
            X.0hq r3 = r0.mFragmentManager
            X.HDB r2 = r0.A04
            if (r2 == 0) goto L_0x026a
            X.32x r10 = new X.32x
            r10.<init>(r0, r3, r2, r9)
            r10.A0C = r11
            r10.A0R = r8
            X.2el r2 = r0.A0E
            if (r2 == 0) goto L_0x0197
            X.0lg r8 = X.DbT.A0X(r14)
            r2 = 36330784759628559(0x8112a80002430f, double:3.039072802092533E-306)
            boolean r2 = X.182.A06(r4, r8, r2)
            if (r2 == 0) goto L_0x0197
            X.0lg r8 = X.DbT.A0X(r14)
            r2 = 2342173793973256974(0x208112a80001430e, double:4.0747304415013435E-152)
            boolean r2 = X.182.A06(r4, r8, r2)
            if (r2 == 0) goto L_0x0197
            X.2el r2 = r0.A0E
            r10.A04 = r2
            r10.A0H = r5
        L_0x0197:
            X.332 r4 = r10.A00()
            android.content.Context r3 = r0.requireContext()
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r14)
            X.6z9 r2 = X.C51970G9q.A0g(r3, r0, r2)
            r0.A03 = r2
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r14)
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            X.2mt r8 = r0.A0K
            r3 = 3
            X.TrU r2 = new X.TrU
            r2.<init>(r10, r8, r9, r3)
            r0.A0F = r2
            r1.EBt(r2)
            r1.EBt(r4)
            X.2js r2 = r0.A0D
            if (r2 != 0) goto L_0x01cb
            X.0qQ.A0F(r15)
        L_0x01c6:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01cb:
            r1.EBt(r2)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r14)
            X.2wt r1 = new X.2wt
            r1.<init>(r0, r2, r0)
            r0.A0G = r1
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r14)
            r1 = 6
            X.ISl r2 = new X.ISl
            r2.<init>(r0, r1)
            X.36D r1 = new X.36D
            r1.<init>(r3, r2, r7, r7)
            r0.A02 = r1
            X.2jd r2 = new X.2jd
            r2.<init>()
            r2.A0E(r1)
            X.2wt r1 = r0.A0G
            if (r1 != 0) goto L_0x01fc
            java.lang.String r3 = "broadcastHandler"
        L_0x01f8:
            X.0qQ.A0F(r3)
            goto L_0x01c6
        L_0x01fc:
            r2.A0E(r1)
            r2.A0E(r4)
            r0.A0b(r2)
            X.HDB r1 = r0.A04
            if (r1 == 0) goto L_0x026a
            r0.A0V(r1)
            X.0lg r1 = X.DbT.A0X(r14)
            X.Dc1 r1 = X.GAH.A00(r1)
            r0.A0H = r1
            java.lang.String r3 = "deeplinkPerfLogger"
            if (r1 == 0) goto L_0x01f8
            java.lang.String r2 = "short_url_request"
            X.Dc0 r1 = r1.A00
            X.34p r1 = r1.A02(r2)
            r0.A01 = r1
            X.Dc1 r1 = r0.A0H
            if (r1 == 0) goto L_0x01f8
            java.lang.String r2 = "media_request"
            X.Dc0 r1 = r1.A00
            X.34p r1 = r1.A02(r2)
            r0.A00 = r1
            android.os.Bundle r2 = r0.requireArguments()
            r1 = 41
            java.lang.String r1 = X.C273654mx.A00(r1)
            java.lang.String r2 = r2.getString(r1)
            if (r6 == 0) goto L_0x024e
            r0.A08 = r6
            A02(r0)
        L_0x0247:
            r0 = 1335004599(0x4f928db7, float:4.9175219E9)
            X.AnonymousClass0fD.A09(r0, r13)
            return
        L_0x024e:
            if (r2 == 0) goto L_0x0247
            X.34p r1 = r0.A01
            if (r1 == 0) goto L_0x0257
            r1.A08(r5)
        L_0x0257:
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r14)
            X.1OC r2 = X.C49168EqZ.A00(r1, r2)
            X.ECs r1 = new X.ECs
            r1.<init>(r0)
            r2.A00 = r1
            r0.schedule(r2)
            goto L_0x0247
        L_0x026a:
            X.0qQ.A0F(r12)
            goto L_0x01c6
        L_0x026f:
            r5 = r45
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r14)
            X.0rQ r2 = X.C231512rn.A00(r1)
            java.lang.String r1 = "feed_short_url"
            boolean r1 = r2.A07(r1)
            if (r1 != 0) goto L_0x02cb
            X.0lg r11 = X.DbT.A0X(r14)
            r1 = 36319626434584103(0x81088200021e27, double:3.0320162324034505E-306)
            boolean r1 = X.182.A06(r4, r11, r1)
            if (r1 != 0) goto L_0x02cb
            if (r39 != 0) goto L_0x02cb
            r21 = r5
        L_0x0294:
            androidx.fragment.app.FragmentActivity r19 = r0.requireActivity()
            r34 = 0
            X.32Q r28 = X.AnonymousClass32Q.A00
            X.GTW r1 = r0.A0L
            java.lang.Integer r31 = X.AnonymousClass05K.A00
            X.GAP r2 = new X.GAP
            r22 = r1
            r23 = r10
            r24 = r9
            r26 = r5
            r27 = r5
            r29 = r0
            r30 = r8
            r32 = r5
            r33 = r5
            r35 = r34
            r36 = r7
            r37 = r34
            r38 = r34
            r40 = r34
            r41 = r34
            r18 = r0
            r20 = r5
            r17 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            goto L_0x0114
        L_0x02cb:
            X.2el r1 = X.C51969G9p.A0k()
            r0.A0E = r1
            X.0lg r2 = X.DbT.A0X(r14)
            X.2el r1 = r0.A0E
            X.2nI r44 = X.C229382nI.A02(r0, r0, r2, r1)
            X.0Pk r11 = X.0Pl.A0n
            android.content.Context r2 = r0.requireContext()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r14)
            X.0Pl r49 = r11.A00(r2, r1)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r14)
            X.2oD r2 = new X.2oD
            r2.<init>(r0, r1, r0, r0)
            androidx.fragment.app.FragmentActivity r41 = r0.requireActivity()
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0qQ.A0C(r1, r6)
            X.3jo r1 = (X.C249453jo) r1
            java.lang.Integer r53 = X.AnonymousClass05K.A00
            r59 = 0
            r6 = 9
            X.0qQ.A0B(r1, r6)
            X.2s3 r21 = new X.2s3
            r40 = r21
            r42 = r0
            r43 = r1
            r46 = r5
            r47 = r2
            r48 = r9
            r50 = r5
            r51 = r8
            r52 = r5
            r54 = r5
            r55 = r5
            r56 = r5
            r57 = r5
            r58 = r5
            r60 = r59
            r61 = r59
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61)
            goto L_0x0294
        L_0x032f:
            r25 = r45
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54174H1u.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2080179746);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_feed, viewGroup, false);
        AnonymousClass0fD.A09(1425210695, A022);
        return inflate;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1847839445);
        C54174H1u.super.onPause();
        C227762js r2 = this.A0D;
        if (r2 == null) {
            0qQ.A0F("_helper");
            throw AnonymousClass00P.createAndThrow();
        }
        C238133Ar scrollingViewProxy = getScrollingViewProxy();
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        r2.A09(scrollingViewProxy);
        AnonymousClass0fD.A09(463396191, A022);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.3Jo] */
    public final void onResume() {
        String str;
        int A022 = AnonymousClass0fD.A02(-349190748);
        super.onResume();
        Context context = getContext();
        if (context != null) {
            C227762js r4 = this.A0D;
            if (r4 == null) {
                str = "_helper";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            float A002 = (float) AnonymousClass3D4.A00(context);
            r4.A04(2dZ.A0t.A03(getActivity()).A0P, new Object(), A002);
        }
        Dc1 dc1 = this.A0H;
        if (dc1 == null) {
            str = "deeplinkPerfLogger";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        dc1.A01();
        AnonymousClass0fD.A09(-506908450, A022);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A0D2 = AnonymousClass7TG.A0D(absListView, 1174751905);
        this.A0L.onScroll(absListView, i, i2, i3);
        AnonymousClass0fD.A0A(1681636380, A0D2);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0D2 = AnonymousClass7TG.A0D(absListView, 975372356);
        this.A0L.onScrollStateChanged(absListView, i);
        AnonymousClass0fD.A0A(214093904, A0D2);
    }
}
