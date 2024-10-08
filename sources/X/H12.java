package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.api.schemas.ClipsTemplateBrowserV2Type;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class H12 extends AnonymousClass4DH implements AnonymousClass4DR, XBP {
    public static final String __redex_internal_original_name = "ClipsTemplateBrowserTabbedFragment";
    public ClipsTemplateBrowserV2Type A00 = ClipsTemplateBrowserV2Type.MAIN;
    public AnonymousClass0iw A01;
    public C16343UtG A02;
    public H1I A03;
    public H1I A04;
    public ArrayList A05;
    public HashMap A06;
    public String A07;
    public ArrayList A08;
    public List A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final C53080GiE A0C;

    public final /* bridge */ /* synthetic */ OIJ AN9(Object obj) {
        0qQ.A0B(obj, 0);
        HashMap hashMap = this.A06;
        if (hashMap == null) {
            0qQ.A0F("tabModels");
            throw AnonymousClass00P.createAndThrow();
        }
        OIJ oij = (OIJ) hashMap.get(obj);
        if (oij != null) {
            return oij;
        }
        throw C51973G9u.A0g(obj, AnonymousClass000.A00(485), AnonymousClass7TE.A1A());
    }

    public final boolean onBackPressed() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v50, types: [X.3B3, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x013f, code lost:
        if (r3 != null) goto L_0x0141;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x019b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            r14 = this;
            r12 = 0
            X.0qQ.A0B(r15, r12)
            r10 = r14
            r0 = r16
            super.onViewCreated(r15, r0)
            android.os.Bundle r1 = r14.requireArguments()
            r0 = 542(0x21e, float:7.6E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r1.getBoolean(r0)
            if (r0 == 0) goto L_0x0052
            r0 = 2131430262(0x7f0b0b76, float:1.848222E38)
            android.view.View r5 = r15.findViewById(r0)
            if (r5 == 0) goto L_0x024f
            android.content.res.Resources r1 = X.DbV.A05(r14)
            r0 = 2131165230(0x7f07002e, float:1.7944671E38)
            r2 = 2131165230(0x7f07002e, float:1.7944671E38)
            int r4 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = X.DbV.A05(r14)
            r0 = 2131165203(0x7f070013, float:1.7944616E38)
            int r3 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r0 = X.DbV.A05(r14)
            int r2 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r1 = X.DbV.A05(r14)
            r0 = 2131165193(0x7f070009, float:1.7944596E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r5.setPadding(r4, r3, r2, r0)
        L_0x0052:
            android.view.View r1 = r14.requireView()
            r0 = 2131442519(0x7f0b3b57, float:1.850708E38)
            android.view.View r1 = r1.findViewById(r0)
            r0 = 30
            X.C56801ICy.A01(r1, r0, r14)
            android.view.View r1 = r14.requireView()
            r0 = 2131441424(0x7f0b3710, float:1.850486E38)
            android.view.View r6 = r1.findViewById(r0)
            android.view.View r1 = r14.requireView()
            r0 = 2131427367(0x7f0b0027, float:1.8476348E38)
            android.view.View r7 = r1.findViewById(r0)
            android.view.View r1 = r14.requireView()
            r0 = 2131442535(0x7f0b3b67, float:1.8507113E38)
            android.view.View r4 = r1.findViewById(r0)
            android.view.View r1 = r14.requireView()
            r0 = 2131442534(0x7f0b3b66, float:1.850711E38)
            android.widget.TextView r3 = X.AnonymousClass7TE.A0d(r1, r0)
            java.util.ArrayList r0 = r14.A05
            if (r0 == 0) goto L_0x011f
            int r8 = r0.size()
        L_0x0096:
            r2 = 8
            if (r0 == 0) goto L_0x0130
            if (r8 <= 0) goto L_0x0130
            X.0eM r0 = r14.A0A
            X.0lg r9 = X.DbT.A0X(r0)
            X.0Tu r5 = X.0Tu.A05
            r0 = 36320768896148308(0x81098c00062354, double:3.032738729696977E-306)
            boolean r0 = X.182.A06(r5, r9, r0)
            if (r0 == 0) goto L_0x0130
            android.content.res.Resources r5 = X.DbV.A05(r14)
            r0 = 1
            r1 = 2131975042(0x7f135b82, float:1.9587165E38)
            if (r8 != r0) goto L_0x00bc
            r1 = 2131975041(0x7f135b81, float:1.9587163E38)
        L_0x00bc:
            java.lang.Object[] r0 = X.AnonymousClass7TF.A1b(r8)
            java.lang.String r0 = r5.getString(r1, r0)
            X.0qQ.A07(r0)
            r3.setText(r0)
            if (r6 == 0) goto L_0x00d4
            r6.setVisibility(r12)
            r0 = 31
            X.C56801ICy.A01(r6, r0, r14)
        L_0x00d4:
            android.view.View r1 = r14.requireView()
            r0 = 2131442757(0x7f0b3c45, float:1.8507563E38)
            android.view.View r6 = r1.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            X.GiE r5 = r14.A0C
            r6.setAdapter(r5)
            X.GiP r0 = new X.GiP
            r0.<init>()
            r6.A11(r0)
            java.util.ArrayList r1 = r14.A08
            if (r1 == 0) goto L_0x0122
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x0122
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r1.iterator()
        L_0x0100:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0145
            java.lang.Object r0 = r2.next()
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r1.inJustDecodeBounds = r12
            java.lang.String r0 = r0.A0X
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0, r1)
            if (r0 == 0) goto L_0x0100
            r8.add(r0)
            goto L_0x0100
        L_0x011f:
            r8 = 0
            goto L_0x0096
        L_0x0122:
            if (r7 == 0) goto L_0x0127
            r7.setVisibility(r2)
        L_0x0127:
            r6.setVisibility(r2)
            if (r4 == 0) goto L_0x0141
            r4.setVisibility(r2)
            goto L_0x0141
        L_0x0130:
            if (r6 == 0) goto L_0x0135
            r6.setVisibility(r2)
        L_0x0135:
            if (r7 == 0) goto L_0x013a
            r7.setVisibility(r2)
        L_0x013a:
            if (r4 == 0) goto L_0x013f
            r4.setVisibility(r2)
        L_0x013f:
            if (r3 == 0) goto L_0x016e
        L_0x0141:
            r3.setVisibility(r2)
            goto L_0x016e
        L_0x0145:
            if (r7 == 0) goto L_0x014a
            r7.setVisibility(r12)
        L_0x014a:
            r0 = 3
            java.util.List r2 = X.00k.A0d(r8, r0)
            java.util.List r1 = r5.A00
            X.Ghu r0 = new X.Ghu
            r0.<init>(r1, r2)
            X.2ta r0 = X.C232332tX.A00(r0)
            r1.clear()
            r1.addAll(r2)
            r0.A03(r5)
            r6.setVisibility(r12)
            if (r4 == 0) goto L_0x016b
            r4.setVisibility(r12)
        L_0x016b:
            r3.setVisibility(r12)
        L_0x016e:
            r0 = 2131432929(0x7f0b15e1, float:1.848763E38)
            android.view.View r9 = X.AnonymousClass7TF.A0G(r15, r0)
            com.instagram.ui.widget.fixedtabbar.FixedTabBar r9 = (com.instagram.ui.widget.fixedtabbar.FixedTabBar) r9
            java.lang.Integer r0 = X.AnonymousClass05K.A05
            X.2eS.A04(r9, r0)
            r0 = 2131442525(0x7f0b3b5d, float:1.8507092E38)
            android.view.View r8 = X.AnonymousClass7TF.A0F(r15, r0)
            androidx.viewpager.widget.ViewPager r8 = (androidx.viewpager.widget.ViewPager) r8
            X.0hq r7 = r14.getChildFragmentManager()
            X.0qQ.A07(r7)
            java.util.List r11 = r14.A09
            r3 = 0
            if (r11 != 0) goto L_0x019b
            java.lang.String r0 = "tabs"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x019b:
            X.UtG r6 = new X.UtG
            r13 = r12
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r14.A02 = r6
            com.instagram.api.schemas.ClipsTemplateBrowserV2Type r0 = r14.A00
            r6.A03(r0)
            X.0eM r2 = r14.A0B
            java.lang.Object r0 = r2.getValue()
            X.Gh4 r0 = (X.C53013Gh4) r0
            com.instagram.api.schemas.ClipsTemplateBrowserV2Type r1 = r14.A00
            X.0qQ.A0B(r1, r12)
            X.05G r0 = r0.A02
            r0.Epw(r1)
            java.lang.Object r0 = r2.getValue()
            X.Gh4 r0 = (X.C53013Gh4) r0
            X.0r6 r1 = r0.A01
            r0 = 46
            X.ImP r0 = X.C58103ImP.A01(r14, r3, r0)
            X.DbZ.A1C(r14, r0, r1)
            X.0eM r0 = r14.A0A
            X.27r r1 = X.C51971G9r.A0g(r0)
            android.os.Bundle r0 = r14.requireArguments()
            java.lang.String r6 = "entry_point"
            java.io.Serializable r2 = r0.getSerializable(r6)
            if (r2 != 0) goto L_0x024c
            X.293 r2 = X.293.A06
        L_0x01df:
            X.29Z r4 = r1.A0F
            X.0qQ.A0B(r2, r12)
            X.0wc r1 = r4.A01
            r0 = 159(0x9f, float:2.23E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            X.283 r5 = r4.A04
            java.lang.String r0 = r5.A0L
            if (r0 != 0) goto L_0x01fc
            java.lang.String r0 = X.AnonymousClass7TF.A0b()
            r5.A0L = r0
        L_0x01fc:
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x024b
            X.80P r1 = X.AnonymousClass80P.TEMPLATE_BROWSER
            java.lang.String r0 = "tool_type"
            r3.A8M(r1, r0)
            java.lang.String r1 = "IG_CAMERA_TEMPLATE_BROWSER_OPEN"
            java.lang.String r0 = "legacy_falco_event_name"
            r3.AAJ(r0, r1)
            java.lang.String r1 = r5.A0L
            if (r1 != 0) goto L_0x0216
            java.lang.String r1 = ""
        L_0x0216:
            java.lang.String r0 = "camera_session_id"
            r3.AAJ(r0, r1)
            X.28D r0 = r5.A09
            r3.A8M(r0, r6)
            r1 = 2
            java.lang.String r0 = "event_type"
            X.AnonymousClass7TE.A1W(r3, r0, r1)
            X.JVj r0 = r5.A0C
            if (r0 != 0) goto L_0x022c
            X.JVj r0 = X.C59725JVj.CLIPS_TEMPLATE
        L_0x022c:
            X.C51965G9l.A1A(r0, r3)
            java.lang.String r1 = "clips_template_browser"
            java.lang.String r0 = "module"
            r3.AAJ(r0, r1)
            X.4yP r1 = r4.A0J()
            java.lang.String r0 = "camera_destination"
            r3.A8M(r1, r0)
            r0 = 1878(0x756, float:2.632E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.A8M(r2, r0)
            r3.Cgf()
        L_0x024b:
            return
        L_0x024c:
            X.293 r2 = (X.293) r2
            goto L_0x01df
        L_0x024f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H12.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* bridge */ /* synthetic */ Fragment ALb(Object obj) {
        H1I h1i;
        String str;
        ClipsTemplateBrowserV2Type clipsTemplateBrowserV2Type = (ClipsTemplateBrowserV2Type) obj;
        int A022 = DbU.A02(clipsTemplateBrowserV2Type, 0);
        if (A022 == 1) {
            h1i = this.A03;
            if (h1i == null) {
                str = "browseTabFragment";
            }
            return h1i;
        } else if (A022 == 2) {
            h1i = this.A04;
            if (h1i == null) {
                str = "savedTabFragment";
            }
            return h1i;
        } else {
            throw C51973G9u.A0g(clipsTemplateBrowserV2Type, AnonymousClass000.A00(485), AnonymousClass7TE.A1A());
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ void DqK(Object obj) {
        H1I h1i;
        String str;
        ClipsTemplateBrowserV2Type clipsTemplateBrowserV2Type = (ClipsTemplateBrowserV2Type) obj;
        0qQ.A0B(clipsTemplateBrowserV2Type, 0);
        this.A00 = clipsTemplateBrowserV2Type;
        ClipsTemplateBrowserV2Type clipsTemplateBrowserV2Type2 = this.A00;
        0qQ.A0B(clipsTemplateBrowserV2Type2, 0);
        ((C53013Gh4) this.A0B.getValue()).A02.Epw(clipsTemplateBrowserV2Type2);
        ClipsTemplateBrowserV2Type clipsTemplateBrowserV2Type3 = this.A00;
        int ordinal = clipsTemplateBrowserV2Type3.ordinal();
        if (ordinal == 1) {
            h1i = this.A03;
            if (h1i == null) {
                str = "browseTabFragment";
            }
            this.A01 = h1i;
            return;
        } else if (ordinal == 2) {
            h1i = this.A04;
            if (h1i == null) {
                str = "savedTabFragment";
            }
            this.A01 = h1i;
            return;
        } else {
            throw AnonymousClass7TE.A0z(AnonymousClass7TG.A0m(clipsTemplateBrowserV2Type3, "Invalid tab ", AnonymousClass7TE.A1A()));
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        AnonymousClass0iw r0 = this.A01;
        if (r0 != null) {
            return r0.getModuleName();
        }
        0qQ.A0F("currentAnalyticsModule");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public H12() {
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58709IwI(new C58709IwI(this, 8), 9));
        0Yh A0z = DbS.A0z(C53013Gh4.class);
        this.A0B = DbS.A0I(new C58709IwI(A002, 10), new C58693Iw2(0, this, A002), C58690Ivz.A00((Object) null, A002, 49), A0z);
        this.A0C = new C53080GiE((List) null, (DefaultConstructorMarker) null, 1);
        this.A0A = C227642jf.A02(this);
    }

    public final void onCreate(Bundle bundle) {
        28D r6;
        String str;
        int A022 = AnonymousClass0fD.A02(-169770545);
        H12.super.onCreate(bundle);
        ClipsTemplateBrowserV2Type clipsTemplateBrowserV2Type = ClipsTemplateBrowserV2Type.MAIN;
        ClipsTemplateBrowserV2Type clipsTemplateBrowserV2Type2 = ClipsTemplateBrowserV2Type.SAVED;
        this.A09 = 0sr.A1P(new ClipsTemplateBrowserV2Type[]{clipsTemplateBrowserV2Type, clipsTemplateBrowserV2Type2});
        HashMap A1E = AnonymousClass7TE.A1E();
        this.A06 = A1E;
        A1E.put(clipsTemplateBrowserV2Type, new OIJ((Drawable) null, (Drawable) null, (View) null, requireContext().getString(2131975045), (String) null, -1, R.color.template_browser_tab_colors, R.color.black, -1, -1, -1, -1, -1, R.dimen.abc_edit_text_inset_top_material, R.style.igds_emphasized_title_bold, 5));
        HashMap hashMap = this.A06;
        if (hashMap == null) {
            str = "tabModels";
        } else {
            hashMap.put(clipsTemplateBrowserV2Type2, new OIJ((Drawable) null, (Drawable) null, (View) null, requireContext().getString(2131975053), (String) null, -1, R.color.template_browser_tab_colors, R.color.black, -1, -1, -1, -1, -1, R.dimen.abc_edit_text_inset_top_material, R.style.igds_emphasized_title_bold, 3));
            Bundle requireArguments = requireArguments();
            String A002 = C273654mx.A00(32);
            this.A05 = requireArguments.getParcelableArrayList(A002);
            this.A08 = requireArguments().getParcelableArrayList(C273654mx.A00(210));
            Bundle requireArguments2 = requireArguments();
            String A003 = AnonymousClass000.A00(424);
            this.A07 = requireArguments2.getString(A003);
            Bundle requireArguments3 = requireArguments();
            String A004 = AnonymousClass000.A00(96);
            Object obj = requireArguments3.get(A004);
            if (obj instanceof 28D) {
                r6 = (28D) obj;
            } else {
                r6 = null;
            }
            AnonymousClass0eM r16 = this.A0A;
            UserSession A0l = AnonymousClass7TE.A0l(r16);
            293 serializable = requireArguments().getSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            if (serializable == null) {
                serializable = 293.A06;
            }
            ArrayList arrayList = this.A05;
            String str2 = this.A07;
            Bundle A0B2 = DbV.A0B(A0l, 0);
            A0B2.putString("IgSessionManager.SESSION_TOKEN_KEY", A0l.A05);
            A0B2.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, serializable);
            String A005 = C273654mx.A00(542);
            A0B2.putBoolean(A005, false);
            A0B2.putSerializable("clips_template_browser_v2_type", clipsTemplateBrowserV2Type);
            if (arrayList != null) {
                A0B2.putParcelableArrayList(A002, arrayList);
            }
            if (r6 != null) {
                A0B2.putSerializable(A004, r6);
            }
            if (str2 != null) {
                A0B2.putString(A003, str2);
            }
            H1I h1i = new H1I();
            h1i.setArguments(A0B2);
            this.A03 = h1i;
            UserSession A0l2 = AnonymousClass7TE.A0l(r16);
            293 serializable2 = requireArguments().getSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            if (serializable2 == null) {
                serializable2 = 293.A06;
            }
            Bundle A0B3 = DbV.A0B(A0l2, 0);
            A0B3.putString("IgSessionManager.SESSION_TOKEN_KEY", A0l2.A05);
            A0B3.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, serializable2);
            A0B3.putBoolean(A005, false);
            A0B3.putSerializable("clips_template_browser_v2_type", clipsTemplateBrowserV2Type2);
            H1I h1i2 = new H1I();
            h1i2.setArguments(A0B3);
            this.A04 = h1i2;
            H1I h1i3 = this.A03;
            if (h1i3 == null) {
                str = "browseTabFragment";
            } else {
                this.A01 = h1i3;
                AnonymousClass0fD.A09(1609645316, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2032721231);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.clips_template_browser_tabbed_v2_layout, viewGroup, false);
        AnonymousClass0fD.A09(828469128, A022);
        return inflate;
    }
}
