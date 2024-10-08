package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;

public final class K5D extends AnonymousClass4DH implements C41829B2k {
    public static final String __redex_internal_original_name = "EffectGalleryCategoryPageFragment";
    public int A00;
    public int A01;
    public int A02 = 3;
    public ViewGroup A03;
    public GridLayoutManager A04;
    public RecyclerView A05;
    public C60461Jlt A06;
    public C60438JlW A07;
    public C60287Jij A08;
    public AnonymousClass86D A09;
    public C60472Jm4 A0A;
    public Integer A0B = AnonymousClass05K.A0N;
    public boolean A0C;
    public C249403jg A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final AnonymousClass0eM A0H = C227642jf.A02(this);

    public final void DVy() {
        String str;
        this.A0E = false;
        A02(this);
        C60287Jij jij = this.A08;
        if (jij != null) {
            jij.A03.A01("page_deselected");
            jij.A08.clear();
        }
        RecyclerView recyclerView = this.A05;
        if (recyclerView != null) {
            C60472Jm4 jm4 = this.A0A;
            if (jm4 == null) {
                str = "paginationScrollListener";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            recyclerView.A16(jm4);
        }
        RecyclerView recyclerView2 = this.A05;
        if (recyclerView2 != null) {
            C249403jg r0 = this.A0D;
            if (r0 == null) {
                str = "onScrollListener";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            recyclerView2.A16(r0);
        }
    }

    public final void DW7() {
        String str;
        this.A0E = true;
        A02(this);
        C60287Jij jij = this.A08;
        if (jij != null) {
            JTR.A1S(jij.A07, jij.A05.A0H);
        }
        RecyclerView recyclerView = this.A05;
        if (recyclerView != null) {
            C60472Jm4 jm4 = this.A0A;
            if (jm4 == null) {
                str = "paginationScrollListener";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            recyclerView.A15(jm4);
        }
        RecyclerView recyclerView2 = this.A05;
        if (recyclerView2 != null) {
            C249403jg r0 = this.A0D;
            if (r0 == null) {
                str = "onScrollListener";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            recyclerView2.A15(r0);
        }
        A01(this);
    }

    public final String getModuleName() {
        return "ig_camera_mini_gallery_category_page";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C60287Jij jij;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A03 = DbU.A0C(view, R.id.saved_empty_state);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            view.setId(bundle2.getInt(AnonymousClass000.A00(2775)));
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), this.A02);
        gridLayoutManager.A03 = true;
        gridLayoutManager.A01 = new C60366JkE(this, 1);
        this.A04 = gridLayoutManager;
        C60472Jm4 jm4 = new C60472Jm4(gridLayoutManager, new M0E(this), 8);
        jm4.A00 = true;
        this.A0A = jm4;
        this.A06 = new C60461Jlt(this.A02, DbY.A01(requireContext()), this.A0C, 0mk.A02(view.getContext()));
        RecyclerView A0I = DbT.A0I(view, R.id.camera_effect_preview_video_recycler_view);
        A0I.setLayoutManager(this.A04);
        A0I.setAdapter(this.A07);
        C60461Jlt jlt = this.A06;
        if (jlt != null) {
            A0I.A11(jlt);
            this.A05 = A0I;
            this.A0D = new C60473Jm5(this, 0);
            this.A0F = true;
            if (this.A0G && (jij = this.A08) != null) {
                jij.A01();
            }
            if (this.A0E) {
                DW7();
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A00(K5D k5d) {
        C60287Jij jij;
        C60438JlW jlW;
        AnonymousClass86D r6 = k5d.A09;
        if (r6 != null && (jij = k5d.A08) != null && (jlW = k5d.A07) != null) {
            int i = k5d.A00;
            int i2 = k5d.A01;
            ArrayList A1C = AnonymousClass7TE.A1C();
            if (i >= 0) {
                List list = jlW.A06;
                if (i < list.size() && i2 >= 0 && i2 < list.size() && i <= i2) {
                    while (true) {
                        C62947Koz koz = ((LQR) list.get(i)).A00;
                        if (koz != null) {
                            A1C.add(koz);
                        }
                        if (i == i2) {
                            break;
                        }
                        i++;
                    }
                }
            }
            r6.A0C(jij.A07, A1C);
        }
    }

    public static final void A01(K5D k5d) {
        GridLayoutManager gridLayoutManager;
        C60438JlW jlW;
        String A012;
        int A022;
        AnonymousClass86D r0 = k5d.A09;
        if (r0 != null && (gridLayoutManager = k5d.A04) != null && (jlW = k5d.A07) != null && (A012 = AnonymousClass8YC.A01((AnonymousClass84D) r0.A04.A00.getValue())) != null && (A022 = jlW.A02(A012)) >= 0) {
            gridLayoutManager.A1p(A022, DbY.A01(k5d.requireContext()));
        }
    }

    public static final void A02(K5D k5d) {
        RecyclerView recyclerView;
        C60438JlW jlW;
        K5D k5d2 = k5d;
        AnonymousClass86D r0 = k5d2.A09;
        if (r0 != null && (recyclerView = k5d2.A05) != null && (jlW = k5d2.A07) != null) {
            int A0K = JTR.A0K(r0.A0N);
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int i = A0K - 219;
            int i2 = jlW.A02;
            int i3 = jlW.A03;
            int i4 = i2 + i3;
            int i5 = computeVerticalScrollOffset / i4;
            int i6 = i2 - (computeVerticalScrollOffset % i4);
            float f = (float) i2;
            int i7 = i5 + 1;
            int i8 = i7;
            if (((double) (((float) i6) / f)) > 0.5d) {
                i7 = i5;
            }
            int i9 = (i - i6) - i3;
            int i10 = i9 / i4;
            boolean A1R = AnonymousClass7TF.A1R((((double) (((float) (i9 % i4)) / f)) > 0.5d ? 1 : (((double) (((float) (i9 % i4)) / f)) == 0.5d ? 0 : -1)));
            if (i6 > 0) {
                i5 = i8;
            }
            int i11 = i5 + i10;
            if (!A1R) {
                i11--;
            }
            int i12 = jlW.A04;
            int i13 = i7 * i12;
            int i14 = ((i11 * i12) + i12) - 1;
            int A022 = DbT.A02(jlW.A06, 1);
            if (i14 > A022) {
                i14 = A022;
            }
            int i15 = new int[]{i13, i14}[0];
            if (i15 < 0) {
                i15 = 0;
            }
            k5d2.A00 = i15;
            if (i14 < 0) {
                i14 = 0;
            }
            k5d2.A01 = i14;
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0H);
    }

    public final boolean isScrolledToBottom() {
        RecyclerView recyclerView = this.A05;
        boolean z = true;
        if (recyclerView != null) {
            z = recyclerView.canScrollVertically(1);
        }
        return !z;
    }

    public final boolean isScrolledToTop() {
        boolean z;
        RecyclerView recyclerView = this.A05;
        if (recyclerView != null) {
            z = JTP.A1Y(recyclerView);
        } else {
            z = true;
        }
        return !z;
    }

    public final void onSetUserVisibleHint(boolean z, boolean z2) {
        C60287Jij jij;
        super.onSetUserVisibleHint(this.A0G, z2);
        this.A0G = z;
        if (isVisible() && this.A0F && (jij = this.A08) != null) {
            jij.A01();
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1670327476);
        K5D.super.onCreate(bundle);
        requireArguments();
        this.A0B = AnonymousClass05K.A0Y;
        this.A02 = 3;
        setModuleNameV2("ig_camera_mini_gallery_category_page");
        AnonymousClass0fD.A09(-983293024, A022);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007c, code lost:
        if (X.0qQ.A0K(r6.A07, "SAVED") == false) goto L_0x007e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r20, android.view.ViewGroup r21, android.os.Bundle r22) {
        /*
            r19 = this;
            r0 = 1476458585(0x5800f859, float:5.6721653E14)
            int r5 = X.AnonymousClass0fD.A02(r0)
            r0 = 0
            r1 = r20
            X.0qQ.A0B(r1, r0)
            r11 = r19
            r2 = r21
            r3 = r22
            X.K5D.super.onCreateView(r1, r2, r3)
            androidx.fragment.app.FragmentActivity r8 = r11.requireActivity()
            X.2YN r4 = new X.2YN     // Catch:{ Exception -> 0x0131 }
            r4.<init>(r8)     // Catch:{ Exception -> 0x0131 }
            java.lang.Class<X.86D> r3 = X.AnonymousClass86D.class
            X.2YL r3 = r4.A00(r3)     // Catch:{ Exception -> 0x0131 }
            X.86D r3 = (X.AnonymousClass86D) r3     // Catch:{ Exception -> 0x0131 }
            r11.A09 = r3     // Catch:{ Exception -> 0x0131 }
            android.os.Bundle r4 = r11.requireArguments()
            r3 = 1161(0x489, float:1.627E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            java.lang.String r4 = X.C320236s2.A01(r4, r3)
            X.86D r3 = r11.A09
            java.lang.String r7 = "Required value was null."
            if (r3 == 0) goto L_0x012c
            java.lang.String r17 = r3.A05()
            X.0eM r3 = r11.A0H
            com.instagram.common.session.UserSession r15 = X.AnonymousClass7TE.A0l(r3)
            X.86D r14 = r11.A09
            if (r14 == 0) goto L_0x0127
            com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService r13 = r14.A0D
            X.DbZ.A0t(r0, r4, r15, r13)
            X.KEO r12 = new X.KEO
            r18 = r0
            r16 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18)
            X.2YN r6 = X.JTO.A0L(r12, r11)
            java.lang.Class<X.Jij> r4 = X.C60287Jij.class
            X.2YL r6 = r6.A00(r4)
            X.Jij r6 = (X.C60287Jij) r6
            r11.A08 = r6
            X.86D r4 = r11.A09
            if (r4 == 0) goto L_0x011c
            java.util.concurrent.atomic.AtomicBoolean r4 = r4.A0L
            boolean r4 = r4.get()
            if (r4 != 0) goto L_0x007e
            java.lang.String r7 = r6.A07
            java.lang.String r4 = "SAVED"
            boolean r7 = X.0qQ.A0K(r7, r4)
            r4 = 1
            if (r7 != 0) goto L_0x007f
        L_0x007e:
            r4 = 0
        L_0x007f:
            r11.A0C = r4
            X.Lcr r10 = new X.Lcr
            r10.<init>(r11)
            android.content.Context r4 = r11.requireContext()
            int r14 = X.DbY.A01(r4)
            java.lang.Integer r13 = r11.A0B
            int r15 = r11.A02
            boolean r4 = r11.A0C
            X.Kzc r9 = new X.Kzc
            r9.<init>(r11)
            com.instagram.common.session.UserSession r12 = X.AnonymousClass7TE.A0l(r3)
            X.JlW r7 = new X.JlW
            r16 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r11.A07 = r7
            X.2Fj r7 = r6.A01
            java.lang.String r3 = "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.instagram.ar.core.discovery.minigallery.viewmodels.PagedData<com.instagram.camera.effect.models.effectpreview.EffectPreviewItem>>"
            X.0qQ.A0C(r7, r3)
            X.07Z r6 = r11.getViewLifecycleOwner()
            r4 = 32
            X.MP6 r3 = new X.MP6
            r3.<init>(r11, r4)
            r8 = 38
            X.Dba.A16(r6, r7, r3, r8)
            X.86D r3 = r11.A09
            if (r3 == 0) goto L_0x00d7
            X.848 r3 = r3.A04
            X.05G r3 = r3.A00
            androidx.lifecycle.CoroutineLiveData r7 = X.DbT.A0G(r3)
            X.07Z r6 = r11.getViewLifecycleOwner()
            r4 = 33
            X.MP6 r3 = new X.MP6
            r3.<init>(r11, r4)
            X.Dba.A16(r6, r7, r3, r8)
        L_0x00d7:
            X.86D r3 = r11.A09
            if (r3 == 0) goto L_0x00f5
            X.05G r6 = r3.A0N
            r3 = 1000(0x3e8, double:4.94E-321)
            X.0r6 r3 = X.AnonymousClass11F.A00(r6, r3)
            androidx.lifecycle.CoroutineLiveData r7 = X.DbT.A0G(r3)
            X.07Z r6 = r11.getViewLifecycleOwner()
            r4 = 34
            X.MP6 r3 = new X.MP6
            r3.<init>(r11, r4)
            X.Dba.A16(r6, r7, r3, r8)
        L_0x00f5:
            X.86D r3 = r11.A09
            r4 = 1
            if (r3 == 0) goto L_0x010f
            boolean r3 = r3.A09
            if (r3 != r4) goto L_0x010f
        L_0x00fe:
            if (r4 == 0) goto L_0x0111
            android.view.LayoutInflater r3 = X.JTS.A0A(r1, r11)
            r1 = 2131625316(0x7f0e0564, float:1.8877837E38)
            android.view.View r1 = r3.inflate(r1, r2, r0)
            r0 = -1259503892(0xffffffffb4ed7eec, float:-4.4237038E-7)
            goto L_0x0156
        L_0x010f:
            r4 = 0
            goto L_0x00fe
        L_0x0111:
            r3 = 2131625316(0x7f0e0564, float:1.8877837E38)
            android.view.View r1 = r1.inflate(r3, r2, r0)
            r0 = -989497158(0xffffffffc50578ba, float:-2135.5454)
            goto L_0x0156
        L_0x011c:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r7)
            r0 = 1442961758(0x5601d95e, float:3.5692646E13)
            X.AnonymousClass0fD.A09(r0, r5)
            throw r1
        L_0x0127:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x012c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x0131:
            r6 = move-exception
            java.lang.String r4 = "EffectGalleryCategoryPageFragment"
            r3 = 938(0x3aa, float:1.314E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            X.0wb.A06(r4, r3, r6)
            X.86D r3 = r11.A09
            r4 = 1
            if (r3 == 0) goto L_0x0165
            boolean r3 = r3.A09
            if (r3 != r4) goto L_0x0165
        L_0x0146:
            if (r4 == 0) goto L_0x015a
            android.view.LayoutInflater r3 = X.JTS.A0A(r1, r11)
            r1 = 2131625316(0x7f0e0564, float:1.8877837E38)
            android.view.View r1 = r3.inflate(r1, r2, r0)
            r0 = 1910412513(0x71de94e1, float:2.204341E30)
        L_0x0156:
            X.AnonymousClass0fD.A09(r0, r5)
            return r1
        L_0x015a:
            r3 = 2131625316(0x7f0e0564, float:1.8877837E38)
            android.view.View r1 = r1.inflate(r3, r2, r0)
            r0 = 751756944(0x2ccee690, float:5.8804697E-12)
            goto L_0x0156
        L_0x0165:
            r4 = 0
            goto L_0x0146
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K5D.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
