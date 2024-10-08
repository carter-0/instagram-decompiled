package X;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.android.R;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.H0v  reason: case insensitive filesystem */
public final class C54151H0v extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CreatorInspirationHubFragment";
    public ViewPager2 A00;
    public H07 A01;
    public H1M A02;
    public H18 A03;
    public C53159GjV A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07 = C227642jf.A02(this);
    public final AnonymousClass0eM A08;

    public final void configureActionBar(2da r4) {
        r4.setTitle(DbT.A06(this, r4, 0).getString(2131957066));
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A01 = R.drawable.instagram_arrow_left_pano_outline_24;
        DbX.A1A(new C56800ICx(this, 38), A0K, r4);
        AnonymousClass3JR A0K2 = DbS.A0K();
        A0K2.A06 = R.drawable.instagram_new_post_pano_outline_24;
        A0K2.A05 = 2131964339;
        DbX.A19(new C56800ICx(this, 39), A0K2, r4);
    }

    public final String getModuleName() {
        return "creator_inspiration_hub_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C54694HOz hOz;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ArrayList A002 = A00(this);
        if (AnonymousClass7TF.A1Z(this.A06)) {
            ViewPager2 viewPager2 = (ViewPager2) DbV.A0T(view, R.id.view_pager_stub, false).getView();
            C53159GjV gjV = new C53159GjV(this, A002);
            this.A04 = gjV;
            viewPager2.setAdapter(gjV);
            viewPager2.setOffscreenPageLimit(A002.size() - 1);
            viewPager2.setUserInputEnabled(false);
            this.A00 = viewPager2;
            List A1P = 0sr.A1P(new Integer[]{Integer.valueOf(R.id.creator_inspiration_hub_clips_fragment_container), Integer.valueOf(R.id.creator_inspiration_hub_audio_fragment_container), Integer.valueOf(R.id.creator_inspiration_hub_accounts_fragment_container)});
            ArrayList<Object> A0r = AnonymousClass7TG.A0r(A1P);
            Iterator it = A1P.iterator();
            while (it.hasNext()) {
                A0r.add(view.requireViewById(AnonymousClass7TG.A0F(it)));
            }
            for (Object A1M : A0r) {
                C51969G9p.A1M(A1M);
            }
        }
        RecyclerView recyclerView = (RecyclerView) AnonymousClass7TF.A0G(view, R.id.creator_inspiration_hub_pills);
        AnonymousClass0eM r3 = this.A05;
        C46785DlD dlD = (C46785DlD) r3.getValue();
        Context requireContext = requireContext();
        Integer num = AnonymousClass05K.A00;
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString(AnonymousClass000.A00(1794));
        } else {
            str = null;
        }
        if (!0qQ.A0K(((C46785DlD) r3.getValue()).A03.getValue(), "")) {
            str = (String) ((C46785DlD) r3.getValue()).A03.getValue();
        } else if (str == null || str.equals("")) {
            if (182.A06(0Tu.A05, DbT.A0X(this.A07), 36323972941557388L)) {
                hOz = C54694HOz.AUDIO;
            } else {
                hOz = C54694HOz.CLIPS;
            }
            str = hOz.A00;
        }
        dlD.A01(requireContext, recyclerView, num, str, A002);
        DbZ.A1C(this, new C66929MfO(this, view, (AnonymousClass4D7) null, 0), ((C46785DlD) r3.getValue()).A03);
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null && bundle3.getBoolean(AnonymousClass000.A00(1819)) && !C51968G9o.A0o(this.A08).getBoolean("creator_inspiration_hub_toast_impression", false)) {
            C310336ap A0a = DbS.A0a();
            A0a.A0D = Html.fromHtml(DbV.A05(this).getString(2131957065));
            A0a.A01 = 5000;
            C57276IVl.A00(A0a, this, 4);
            view.postDelayed(new C57722IfP(A0a), 3000);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public final boolean onBackPressed() {
        C56079HsS A002 = HZR.A00(AnonymousClass7TE.A0l(this.A07));
        Long l = A002.A00;
        if (l != null) {
            C51965G9l.A0a(A002.A01).flowEndCancel(l.longValue(), CancelReason.USER_CANCELLED);
        }
        A002.A00 = null;
        return false;
    }

    public C54151H0v() {
        C58371Iqq iqq = C58371Iqq.A00;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new GW6(new GW6(this, 28), 29));
        this.A05 = DbS.A0I(new GW6(A002, 30), iqq, new C73664Phd(7, A002, (Object) null), DbS.A0z(C46785DlD.class));
        this.A08 = AnonymousClass0eN.A01(new GW6(this, 31));
        this.A06 = AnonymousClass1YB.A00(new GW6(this, 27));
    }

    public static final ArrayList A00(C54151H0v h0v) {
        C54694HOz hOz;
        ArrayList A1C = AnonymousClass7TE.A1C();
        AnonymousClass0eM r4 = h0v.A07;
        0lg A0X = DbT.A0X(r4);
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, A0X, 36323972941557388L)) {
            A1C.add(C54694HOz.AUDIO);
            hOz = C54694HOz.CLIPS;
        } else {
            A1C.add(C54694HOz.CLIPS);
            hOz = C54694HOz.AUDIO;
        }
        A1C.add(hOz);
        if (!182.A06(r3, DbT.A0X(r4), 2342166982155120266L)) {
            A1C.add(C54694HOz.ACCOUNTS);
        }
        return A1C;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        if (r9 != 9683) goto L_0x000b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            super.onActivityResult(r8, r9, r10)
            r2 = 9683(0x25d3, float:1.3569E-41)
            r1 = 201(0xc9, float:2.82E-43)
            if (r8 != r1) goto L_0x004a
            if (r9 == r2) goto L_0x0050
        L_0x000b:
            r2 = -1
            if (r9 != r2) goto L_0x00ed
            X.0eM r0 = r7.A05
            java.lang.Object r0 = r0.getValue()
            X.DlD r0 = (X.C46785DlD) r0
            X.0Ud r0 = r0.A03
            java.lang.Object r1 = r0.getValue()
            X.HOz r6 = X.C54694HOz.CLIPS
            java.lang.String r0 = "clips"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00ed
            X.0eM r0 = r7.A06
            boolean r1 = X.AnonymousClass7TF.A1Z(r0)
            r0 = 99
            java.lang.String r5 = X.AnonymousClass000.A00(r0)
            r3 = 0
            if (r1 == 0) goto L_0x0043
            X.GjV r4 = r7.A04
            if (r4 != 0) goto L_0x005d
            java.lang.String r0 = "creatorInspirationHubViewPagerAdapter"
        L_0x003b:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0043:
            X.H18 r1 = r7.A03
            if (r1 != 0) goto L_0x0077
            java.lang.String r0 = "reelsFragmentIntf"
            goto L_0x003b
        L_0x004a:
            r0 = 9587(0x2573, float:1.3434E-41)
            if (r8 != r0) goto L_0x005a
            if (r9 != r2) goto L_0x00ed
        L_0x0050:
            androidx.fragment.app.FragmentActivity r0 = r7.requireActivity()
            r0.setResult(r9)
            X.DbT.A1K(r7)
        L_0x005a:
            if (r8 != r1) goto L_0x00ed
            goto L_0x000b
        L_0x005d:
            java.util.List r0 = r4.A01
            int r1 = r0.indexOf(r6)
            if (r1 == r2) goto L_0x00ed
            X.01s r0 = r4.A00
            java.lang.Object r1 = X.AnonymousClass01t.A00(r0, r1)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L_0x00ed
            boolean r0 = r1 instanceof X.H18
            if (r0 == 0) goto L_0x00ed
            X.H18 r1 = (X.H18) r1
            if (r1 == 0) goto L_0x00ed
        L_0x0077:
            if (r10 == 0) goto L_0x007d
            java.lang.String r3 = r10.getStringExtra(r5)
        L_0x007d:
            X.Gh6 r0 = X.C51968G9o.A0q(r1)
            X.05G r0 = r0.A08
            java.lang.Object r0 = r0.getValue()
            X.GjI r0 = (X.C53146GjI) r0
            if (r0 == 0) goto L_0x00ed
            androidx.recyclerview.widget.RecyclerView r4 = r0.A01
            X.2Rw r1 = r4.A0A
            boolean r0 = r1 instanceof X.UAE
            if (r0 == 0) goto L_0x00ed
            X.UAE r1 = (X.UAE) r1
            X.WEU r0 = r1.A00
            java.util.List r1 = r0.A02
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00f1
            java.util.List r5 = java.util.Collections.emptyList()
        L_0x00a3:
            java.util.List r5 = X.C51966G9m.A1J(r5)
            boolean r0 = X.AnonymousClass7TE.A1b(r5)
            if (r0 == 0) goto L_0x00ed
            r1 = 0
            java.lang.Object r0 = r5.get(r1)
            boolean r0 = r0 instanceof X.C53061Ght
            if (r0 == 0) goto L_0x00ed
            java.lang.Object r1 = r5.get(r1)
            java.lang.String r0 = "null cannot be cast to non-null type instagram.features.clips.template.browser.view.ClipsTemplateBrowserHorizontalClipsItemPagingAdapter"
            X.0qQ.A0C(r1, r0)
            androidx.paging.PagingDataAdapter r1 = (androidx.paging.PagingDataAdapter) r1
            r5 = 0
            if (r3 == 0) goto L_0x00ed
            int r0 = r3.length()
            if (r0 == 0) goto L_0x00ed
            X.Wv8 r0 = r1.A01()
            java.util.List r0 = r0.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x00d4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ed
            X.4bN r0 = X.C51966G9m.A0m(r1)
            java.lang.String r0 = X.G9t.A1A(r0)
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 == 0) goto L_0x00ee
            if (r5 == r2) goto L_0x00ed
            r4.A0o(r5)
        L_0x00ed:
            return
        L_0x00ee:
            int r5 = r5 + 1
            goto L_0x00d4
        L_0x00f1:
            java.util.ArrayList r5 = X.C51970G9q.A0m(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x00f9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r0 = r1.next()
            X.Va2 r0 = (X.C17549Va2) r0
            X.2Rw r0 = r0.A03
            r5.add(r0)
            goto L_0x00f9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54151H0v.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1905271897);
        C54151H0v.super.onCreate(bundle);
        if (!AnonymousClass7TF.A1Z(this.A06)) {
            this.A03 = new H18();
            this.A02 = new H1M();
            this.A01 = new H07();
        }
        AnonymousClass0fD.A09(-2124851143, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(-1260925081);
        0qQ.A0B(layoutInflater, 0);
        0lg A0X = DbT.A0X(this.A07);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        } else {
            str = null;
        }
        0Aj A0e = AnonymousClass7TE.A0e(DbT.A0Q(this, A0X, 0), "instagram_organic_creator_inspiration_hub_load");
        if (A0e.isSampled()) {
            C51965G9l.A1M(A0e, "creator_inspiration_hub_fragment");
            A0e.AAJ("inspiration_entry_point", str);
            AnonymousClass7TH.A0V(A0e);
        }
        View inflate = layoutInflater.inflate(R.layout.creator_inspiration_hub_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1321201329, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1778244377);
        super.onDestroyView();
        if (AnonymousClass7TF.A1Z(this.A06)) {
            this.A00 = null;
        }
        AnonymousClass0fD.A09(-979681907, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-262957687);
        super.onResume();
        if (AnonymousClass3HA.A00(requireContext())) {
            C317756nm.A03(requireActivity(), this, AnonymousClass7TE.A0l(this.A07), false, false);
        }
        AnonymousClass0fD.A09(-1928273173, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(1862000611);
        C54151H0v.super.onStop();
        C317756nm.A04(requireActivity(), AnonymousClass7TE.A0l(this.A07), false);
        AnonymousClass0fD.A09(-1240811701, A022);
    }
}
