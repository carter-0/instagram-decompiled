package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.902  reason: invalid class name */
public final class AnonymousClass902 extends AnonymousClass4DH implements C273504mg, C273494mf {
    public static final String __redex_internal_original_name = "EffectMiniGalleryFragment";
    public int A00;
    public ViewPager A01;
    public TabLayout A02;
    public AnonymousClass90B A03;
    public AnonymousClass86D A04;
    public String A05;
    public List A06 = new ArrayList();
    public AnonymousClass37D A07;
    public final AnonymousClass0eM A08 = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final int getExtraDragSpace() {
        return 200;
    }

    public final String getModuleName() {
        return "ig_camera_mini_gallery";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewPager requireViewById = view.requireViewById(R.id.camera_effect_category_view_pager);
        0qQ.A07(requireViewById);
        ViewPager viewPager = requireViewById;
        this.A01 = viewPager;
        viewPager.setAdapter(this.A03);
        viewPager.A0J(new AQ2(this));
        View requireViewById2 = view.requireViewById(R.id.tab_layout);
        0qQ.A07(requireViewById2);
        TabLayout tabLayout = (TabLayout) requireViewById2;
        this.A02 = tabLayout;
        tabLayout.setTabMode(0);
        tabLayout.setupWithViewPager(viewPager);
    }

    private final void A00(int i, int i2, String str, int i3) {
        C324746zp A072;
        Drawable drawable;
        Context context;
        int i4;
        int A0H;
        TabLayout tabLayout = this.A02;
        if (tabLayout != null && (A072 = tabLayout.A07(i)) != null && (drawable = requireContext().getDrawable(i2)) != null) {
            Context requireContext = requireContext();
            AnonymousClass86D r0 = this.A04;
            boolean z = true;
            if (r0 == null || !r0.A09) {
                z = false;
            }
            if (i != i3) {
                context = getContext();
                i4 = R.attr.igds_color_secondary_icon;
                if (z) {
                    i4 = R.attr.igds_color_creation_tools_grey_04;
                }
                A0H = 2Yu.A0H(context, i4);
            } else if (z) {
                A0H = R.color.barcelona_story_share_light_mode;
            } else {
                context = getContext();
                i4 = R.attr.igds_color_primary_icon;
                A0H = 2Yu.A0H(context, i4);
            }
            drawable.setColorFilter(AnonymousClass37O.A00(requireContext.getColor(A0H)));
            A072.A02(drawable);
            A072.A04("");
            A072.A06 = str;
            C324756zq r02 = A072.A04;
            if (r02 != null) {
                r02.A04();
            }
        }
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return (AnonymousClass0wW) this.A08.getValue();
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final boolean isScrolledToBottom() {
        C41829B2k b2k;
        AnonymousClass90B r0 = this.A03;
        if (r0 == null || (b2k = (Fragment) r0.A02.get(r0.A00)) == null) {
            return false;
        }
        return b2k.isScrolledToBottom();
    }

    public final boolean isScrolledToTop() {
        C41829B2k b2k;
        AnonymousClass90B r0 = this.A03;
        if (r0 == null || (b2k = (Fragment) r0.A02.get(r0.A00)) == null) {
            return false;
        }
        return b2k.isScrolledToTop();
    }

    public final void onBottomSheetClosed() {
        AnonymousClass86D r0 = this.A04;
        if (r0 != null) {
            r0.A07();
        }
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        AnonymousClass37D r0 = this.A07;
        if (r0 != null) {
            int A082 = r0.A08() - i;
            AnonymousClass86D r02 = this.A04;
            if (r02 != null) {
                r02.A0N.Epw(Integer.valueOf(A082));
            }
        }
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public static final void A01(AnonymousClass902 r4, int i) {
        String str;
        Context context = r4.getContext();
        if (context != null) {
            str = 02K.A01(context).getString(2131972806);
        } else {
            str = null;
        }
        r4.A00(0, R.drawable.instagram_search_pano_outline_16, str, i);
        r4.A00(1, R.drawable.instagram_save_pano_outline_16, (String) null, i);
        0lg r1 = (0lg) r4.A08.getValue();
        0qQ.A0B(r1, 0);
        boolean booleanValue = C306096Kt.A00(r1).booleanValue();
        int i2 = R.drawable.instagram_sparkles_outline_16;
        if (booleanValue) {
            i2 = R.drawable.instagram_effects_pano_outline_16;
        }
        r4.A00(2, i2, (String) null, i);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1705306527);
        AnonymousClass902.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = requireArguments.getInt("effect_discovery_entry_point_key");
        this.A05 = requireArguments.getString("surface", AnonymousClass849.A06.toString());
        setModuleNameV2("ig_camera_mini_gallery");
        AnonymousClass0fD.A09(1761426824, A022);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r19, android.view.ViewGroup r20, android.os.Bundle r21) {
        /*
            r18 = this;
            r0 = 1819489723(0x6c7335bb, float:1.1760908E27)
            int r6 = X.AnonymousClass0fD.A02(r0)
            r2 = 0
            r4 = r19
            X.0qQ.A0B(r4, r2)
            r3 = r20
            r0 = r21
            r5 = r18
            X.AnonymousClass902.super.onCreateView(r4, r3, r0)
            androidx.fragment.app.FragmentActivity r7 = r5.requireActivity()
            X.2YN r1 = new X.2YN     // Catch:{ Exception -> 0x0028 }
            r1.<init>(r7)     // Catch:{ Exception -> 0x0028 }
            java.lang.Class<X.86D> r0 = X.AnonymousClass86D.class
            X.2YL r0 = r1.A00(r0)     // Catch:{ Exception -> 0x0028 }
            X.86D r0 = (X.AnonymousClass86D) r0     // Catch:{ Exception -> 0x0028 }
            goto L_0x0078
        L_0x0028:
            r7 = move-exception
            java.lang.String r1 = "EffectMiniGalleryFragment"
            r0 = 938(0x3aa, float:1.314E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0wb.A06(r1, r0, r7)
            X.37E r1 = X.AnonymousClass37D.A00
            android.content.Context r0 = r5.requireContext()
            X.37D r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x0043
            r0.A0B()
        L_0x0043:
            X.86D r0 = r5.A04
            r1 = 1
            if (r0 == 0) goto L_0x006a
            boolean r0 = r0.A09
            if (r0 != r1) goto L_0x006a
        L_0x004c:
            if (r1 == 0) goto L_0x006c
            android.content.Context r5 = r5.getContext()
            r1 = 2132017552(0x7f140190, float:1.9673386E38)
            X.3n1 r0 = new X.3n1
            r0.<init>((android.content.Context) r5, (int) r1)
            android.view.LayoutInflater r1 = r4.cloneInContext(r0)
            r0 = 2131625323(0x7f0e056b, float:1.887785E38)
            android.view.View r1 = r1.inflate(r0, r3, r2)
            r0 = 1484409582(0x587a4aee, float:1.10079891E15)
            goto L_0x01f2
        L_0x006a:
            r1 = 0
            goto L_0x004c
        L_0x006c:
            r0 = 2131625323(0x7f0e056b, float:1.887785E38)
            android.view.View r1 = r4.inflate(r0, r3, r2)
            r0 = -2142953331(0xffffffff8045208d, float:-6.348326E-39)
            goto L_0x01f2
        L_0x0078:
            r5.A04 = r0
            X.37E r0 = X.AnonymousClass37D.A00
            X.37D r0 = r0.A01(r7)
            r5.A07 = r0
            X.0hq r9 = r5.getChildFragmentManager()
            X.0qQ.A07(r9)
            X.0eM r0 = r5.A08
            java.lang.Object r8 = r0.getValue()
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            java.lang.String r1 = r5.A05
            java.lang.String r7 = "strSurface"
            if (r1 == 0) goto L_0x025e
            X.90B r0 = new X.90B
            r0.<init>(r9, r8, r1)
            r5.A03 = r0
            X.86D r1 = r5.A04
            if (r1 == 0) goto L_0x00a9
            java.lang.String r0 = r5.A05
            if (r0 == 0) goto L_0x025e
            r1.A09(r0)
        L_0x00a9:
            X.86D r7 = r5.A04
            if (r7 == 0) goto L_0x0137
            int r11 = r5.A00
            java.lang.String r0 = r7.A06
            if (r0 == 0) goto L_0x0256
            com.instagram.common.session.UserSession r8 = r7.A0E
            X.4Om r10 = X.C264044Oj.A00(r8)
            java.lang.String r9 = r7.A05()
            X.849 r0 = r7.A03
            X.4yP r1 = X.AnonymousClass903.A00(r0)
            X.90C r0 = X.AnonymousClass90C.MINI_GALLERY
            r10.CkY(r1, r0, r9, r11)
            X.86B r1 = r7.A0C
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A02
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x00e4
            X.29E r9 = r1.A01
            java.util.concurrent.atomic.AtomicLong r0 = r1.A03
            long r11 = r0.get()
            java.lang.String r10 = "fragment_opened"
            r13 = 0
            r14 = r13
            r15 = r13
            r16 = r13
            r9.A0D(r10, r11, r13, r14, r15, r16)
        L_0x00e4:
            X.1Av r0 = X.1Au.A00(r8)
            X.0xa r10 = r0.A01
            java.lang.String r9 = "mini_gallery_has_opened_mini_gallery_count_v2"
            int r1 = r10.getInt(r9, r2)
            r0 = 3
            if (r1 >= r0) goto L_0x0103
            X.0xY r1 = r10.AR4()
            int r0 = r10.getInt(r9, r2)
            int r0 = r0 + 1
            r1.E5Z(r9, r0)
            r1.apply()
        L_0x0103:
            X.05G r1 = r7.A0O
            X.86R r0 = X.AnonymousClass86R.OPEN
            r1.Epw(r0)
            X.90F r0 = new X.90F
            r0.<init>(r8)
            r7.A01 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.A0J
            r0.set(r2)
            X.86U r0 = r7.A02
            X.2Fj r0 = r0.A00
            java.lang.Object r0 = r0.A02()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0253
            java.lang.Object r0 = X.00k.A0O(r0, r2)
            X.9JA r0 = (X.AnonymousClass9JA) r0
            if (r0 == 0) goto L_0x0253
            java.lang.Object r1 = r0.A01
        L_0x012c:
            X.849 r0 = r7.A03
            if (r1 == r0) goto L_0x0137
            X.86U r0 = new X.86U
            r0.<init>()
            r7.A02 = r0
        L_0x0137:
            X.86D r9 = r5.A04
            if (r9 == 0) goto L_0x01cd
            X.86U r0 = r9.A02
            X.2Fj r0 = r0.A00
            java.lang.Object r0 = r0.A02()
            if (r0 == 0) goto L_0x0203
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.A0M
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0203
            X.86B r1 = r9.A0C
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A02
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0164
            X.29E r8 = r1.A01
            java.util.concurrent.atomic.AtomicLong r0 = r1.A03
            long r0 = r0.get()
            java.lang.String r7 = "categories_already_fetched"
            r8.A0C(r7, r0)
        L_0x0164:
            X.86U r0 = r9.A02
            X.2Fj r8 = r0.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.collections.List<com.instagram.ar.core.discovery.minigallery.models.MiniGalleryCategory>>"
            X.0qQ.A0C(r8, r0)
            X.07Z r7 = r5.getViewLifecycleOwner()
            r0 = 32
            X.9Kw r1 = new X.9Kw
            r1.<init>(r5, r0)
            X.Aue r0 = new X.Aue
            r0.<init>(r1)
            r8.A06(r7, r0)
            X.86U r0 = r9.A02
            X.85G r8 = r0.A04
            java.lang.String r10 = "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Int>"
            X.0qQ.A0C(r8, r10)
            X.07Z r7 = r5.getViewLifecycleOwner()
            r0 = 33
            X.9Kw r1 = new X.9Kw
            r1.<init>(r5, r0)
            X.Aue r0 = new X.Aue
            r0.<init>(r1)
            r8.A06(r7, r0)
            X.848 r0 = r9.A04
            X.05G r1 = r0.A00
            X.19B r0 = X.19B.A00
            androidx.lifecycle.CoroutineLiveData r8 = X.C226292g8.A00(r0, r1)
            X.07Z r7 = r5.getViewLifecycleOwner()
            r0 = 34
            X.9Kw r1 = new X.9Kw
            r1.<init>(r5, r0)
            X.Aue r0 = new X.Aue
            r0.<init>(r1)
            r8.A06(r7, r0)
            X.85G r7 = r9.A0F
            X.0qQ.A0C(r7, r10)
            r0 = 35
            X.9Kw r1 = new X.9Kw
            r1.<init>(r5, r0)
            X.Aue r0 = new X.Aue
            r0.<init>(r1)
            r7.A06(r5, r0)
        L_0x01cd:
            X.86D r0 = r5.A04
            r1 = 1
            if (r0 == 0) goto L_0x0201
            boolean r0 = r0.A09
            if (r0 != r1) goto L_0x0201
        L_0x01d6:
            if (r1 == 0) goto L_0x01f6
            android.content.Context r5 = r5.getContext()
            r1 = 2132017552(0x7f140190, float:1.9673386E38)
            X.3n1 r0 = new X.3n1
            r0.<init>((android.content.Context) r5, (int) r1)
            android.view.LayoutInflater r1 = r4.cloneInContext(r0)
            r0 = 2131625323(0x7f0e056b, float:1.887785E38)
            android.view.View r1 = r1.inflate(r0, r3, r2)
            r0 = 1036100932(0x3dc1a544, float:0.0945535)
        L_0x01f2:
            X.AnonymousClass0fD.A09(r0, r6)
            return r1
        L_0x01f6:
            r0 = 2131625323(0x7f0e056b, float:1.887785E38)
            android.view.View r1 = r4.inflate(r0, r3, r2)
            r0 = -281823851(0xffffffffef33b595, float:-5.5617336E28)
            goto L_0x01f2
        L_0x0201:
            r1 = 0
            goto L_0x01d6
        L_0x0203:
            X.4Co r0 = r9.A08
            r14 = 0
            if (r0 == 0) goto L_0x020b
            r0.AG7(r14)
        L_0x020b:
            X.86B r1 = r9.A0C
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A02
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0227
            X.29E r10 = r1.A01
            java.util.concurrent.atomic.AtomicLong r0 = r1.A03
            long r12 = r0.get()
            java.lang.String r11 = "requesting_category_fetch"
            r15 = r14
            r16 = r14
            r17 = r14
            r10.A0D(r11, r12, r14, r15, r16, r17)
        L_0x0227:
            com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService r8 = r9.A0D
            X.849 r7 = r9.A03
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.A0M
            boolean r1 = r0.get()
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.A0K
            boolean r0 = r0.get()
            X.0ro r7 = r8.A05(r7, r1, r0)
            r1 = 10
            X.9Jz r0 = new X.9Jz
            r0.<init>(r9, r14, r1)
            X.0pz r1 = new X.0pz
            r1.<init>(r0, r7)
            X.6oS r0 = X.C318116oQ.A00(r9)
            X.4Co r0 = X.AnonymousClass11O.A03(r0, r1)
            r9.A08 = r0
            goto L_0x0164
        L_0x0253:
            r1 = 0
            goto L_0x012c
        L_0x0256:
            java.lang.String r1 = "Please call MiniGallery.onOpenTapped, before launching the EffectMiniGalleryFragment"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x025e:
            X.0qQ.A0F(r7)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass902.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
