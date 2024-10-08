package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;

/* renamed from: X.GKz  reason: case insensitive filesystem */
public final class C52258GKz implements C273424mY {
    public GCC A00;
    public boolean A01;
    public final FragmentActivity A02;
    public final ClipsViewerConfig A03;
    public final UserSession A04;
    public final C55925Hpn A05;
    public final GC3 A06;
    public final C52016GBn A07;
    public final C52012GBj A08;

    public final boolean DAA(C317396nC r2, float f, float f2) {
        0qQ.A0B(r2, 0);
        return r2.A04();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: X.Gxw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: X.Gxw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: X.K0E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: X.Gxw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: X.Gxw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: X.Gxw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: X.Gxw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: X.K0E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: X.K0E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: X.UTo} */
    /* JADX WARNING: type inference failed for: r1v13, types: [X.2uf] */
    /* JADX WARNING: type inference failed for: r1v22 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DAZ(X.C317396nC r9, float r10, float r11, float r12, float r13, float r14) {
        /*
            r8 = this;
            r2 = 0
            X.0qQ.A0B(r9, r2)
            r8.A01 = r2
            androidx.fragment.app.FragmentActivity r1 = r8.A02
            r0 = 60
            float r1 = X.0nA.A04(r1, r0)
            float r0 = java.lang.Math.abs(r11)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0022
            r0 = 19
            X.Iw1 r9 = X.C58692Iw1.A00(r9, r8, r0)
            r12 = 0
            r13 = r12
            r8.A06(r9, r10, r11, r12, r13)
        L_0x0021:
            return
        L_0x0022:
            android.view.View r3 = r8.A00()
            if (r3 != 0) goto L_0x0114
            r12 = 0
        L_0x0029:
            android.view.View r1 = r8.A00()
            r13 = 0
            if (r1 == 0) goto L_0x0053
            com.instagram.ui.simplevideolayout.SimpleVideoLayout r4 = r8.A01()
            if (r4 == 0) goto L_0x0053
            com.instagram.clips.intf.ClipsViewerConfig r0 = r8.A03
            float r3 = r0.A03
            float r13 = r0.A05
            int r1 = r1.getHeight()
            int r0 = r4.getHeight()
            int r1 = r1 - r0
            float r1 = (float) r1
            r0 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 / r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r0
            float r13 = r13 + r3
            float r0 = r4.getPivotY()
            float r13 = r13 - r0
            float r13 = r13 + r1
        L_0x0053:
            r0 = 55
            X.Imz r9 = new X.Imz
            r9.<init>(r8, r0)
            r8.A06(r9, r10, r11, r12, r13)
            com.instagram.clips.intf.ClipsViewerConfig r3 = r8.A03
            float r0 = r3.A04
            r7 = 0
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            com.instagram.ui.simplevideolayout.SimpleVideoLayout r1 = r8.A01()
            if (r0 != 0) goto L_0x00cc
            if (r1 == 0) goto L_0x009b
            float r1 = X.AnonymousClass7TE.A03(r1)
            float r0 = r3.A03
            float r6 = X.C51967G9n.A00(r1, r0)
            android.view.View r5 = r8.A00()
            if (r5 == 0) goto L_0x00c6
            com.instagram.ui.simplevideolayout.SimpleVideoLayout r4 = r8.A01()
            if (r4 == 0) goto L_0x00c6
            int r3 = r4.getHeight()
            int r1 = r4.getWidth()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r2, r2, r1, r3)
            r5.setClipBounds(r0)
            r0 = 1
            X.UTo r1 = new X.UTo
            r1.<init>(r3, r0, r5, r4)
        L_0x0098:
            A03(r1, r7, r6)
        L_0x009b:
            com.instagram.common.session.UserSession r3 = r8.A04
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330496996950686(0x8112650004429e, double:3.038890819816319E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0021
            r4 = 1065353216(0x3f800000, float:1.0)
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            android.view.View r2 = r8.A00()
            if (r2 != 0) goto L_0x00be
            X.2uf r1 = new X.2uf
            r1.<init>()
        L_0x00ba:
            A03(r1, r4, r3)
            return
        L_0x00be:
            r0 = 12
            X.K0E r1 = new X.K0E
            r1.<init>(r2, r0)
            goto L_0x00ba
        L_0x00c6:
            X.2uf r1 = new X.2uf
            r1.<init>()
            goto L_0x0098
        L_0x00cc:
            if (r1 == 0) goto L_0x009b
            float r6 = r3.A06
            float r0 = X.AnonymousClass7TE.A02(r1)
            float r6 = r6 / r0
            float r5 = r3.A03
            float r0 = X.AnonymousClass7TE.A03(r1)
            float r5 = r5 / r0
            int r0 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L_0x00f5
            r3 = 1
            android.view.View r1 = r8.A00()
            if (r1 != 0) goto L_0x010e
            X.2uf r0 = new X.2uf
            r0.<init>()
        L_0x00f2:
            A03(r0, r4, r6)
        L_0x00f5:
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x009b
            android.view.View r1 = r8.A00()
            if (r1 != 0) goto L_0x0108
            X.2uf r0 = new X.2uf
            r0.<init>()
        L_0x0104:
            A03(r0, r4, r5)
            goto L_0x009b
        L_0x0108:
            X.Gxw r0 = new X.Gxw
            r0.<init>(r1, r2)
            goto L_0x0104
        L_0x010e:
            X.Gxw r0 = new X.Gxw
            r0.<init>(r1, r3)
            goto L_0x00f2
        L_0x0114:
            com.instagram.clips.intf.ClipsViewerConfig r0 = r8.A03
            float r1 = r0.A06
            float r12 = r0.A04
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r12 = r12 + r1
            float r0 = r3.getPivotX()
            float r12 = r12 - r0
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52258GKz.DAZ(X.6nC, float, float, float, float, float):void");
    }

    public final boolean DlG(C317396nC r2, float f, float f2) {
        return false;
    }

    public final void DvA(C317396nC r1) {
    }

    public static final C52079GDz A02(C52258GKz gKz) {
        Object obj;
        View A022 = C52012GBj.A02(gKz.A08);
        if (A022 != null) {
            obj = A022.getTag();
        } else {
            obj = null;
        }
        if (obj instanceof C52079GDz) {
            return (C52079GDz) obj;
        }
        return null;
    }

    public static final void A05(C52258GKz gKz, boolean z) {
        FragmentActivity fragmentActivity = gKz.A02;
        int A032 = AnonymousClass7TF.A03(fragmentActivity, R.attr.igds_color_clips_tab_bar_background);
        int color = fragmentActivity.getColor(2Yu.A0C(fragmentActivity));
        if (z) {
            if (!gKz.A03.A1l) {
                A032 = color;
            } else {
                A032 = 0nH.A06(A032, 0.5f);
            }
        }
        View findViewById = fragmentActivity.findViewById(R.id.root_clips_layout);
        Resources resources = fragmentActivity.getResources();
        0Sd.A00(resources);
        if (findViewById != null) {
            findViewById.setBackgroundColor(A032);
            2db.A02(fragmentActivity, A032);
            2db.A06(fragmentActivity, z);
            return;
        }
        throw AnonymousClass7TE.A0z(StringFormatUtil.formatStrLocaleSafe("Required view with ID %s not found. Either your layout is missing the ID you requested, or you want to use getOptionalView. Only use getOptionalView if you're sure that you need logic that depends on whether a particular child view exists.", new Object[]{resources.getResourceEntryName(R.id.root_clips_layout)}));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: X.Gxy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: X.Gxy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: X.Gxy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: X.Gxy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: X.Gxy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: X.Gxy} */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, X.0rk] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A06(X.C62320sa r11, float r12, float r13, float r14, float r15) {
        /*
            r10 = this;
            X.0rk r5 = new X.0rk
            r5.<init>()
            r0 = 2
            r5.A00 = r0
            X.IxT r3 = new X.IxT
            r4 = r11
            r6 = r12
            r8 = r13
            r7 = r14
            r9 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r2 = 1
            android.view.View r1 = r10.A00()
            if (r1 != 0) goto L_0x0037
            X.2uf r0 = new X.2uf
            r0.<init>()
        L_0x001e:
            A03(r0, r12, r14)
            r2 = 0
            android.view.View r1 = r10.A00()
            if (r1 != 0) goto L_0x0031
            X.2uf r0 = new X.2uf
            r0.<init>()
        L_0x002d:
            A03(r0, r13, r15)
            return
        L_0x0031:
            X.Gxy r0 = new X.Gxy
            r0.<init>(r1, r3, r2)
            goto L_0x002d
        L_0x0037:
            X.Gxy r0 = new X.Gxy
            r0.<init>(r1, r3, r2)
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52258GKz.A06(X.0sa, float, float, float, float):void");
    }

    public final void DAS(C317396nC r2, float f, float f2, float f3, boolean z) {
        if (this.A01) {
            View A002 = A00();
            if (A002 != null) {
                A002.setTranslationY(f2);
            }
            View A003 = A00();
            if (A003 != null) {
                A003.setTranslationX(f);
            }
        }
    }

    public final boolean DAg(C317396nC r6, float f, float f2, float f3, float f4, boolean z) {
        float f5;
        C52078GDy gDy;
        if (this.A08.A06() == 0) {
            FragmentActivity fragmentActivity = this.A02;
            if (((float) ViewConfiguration.get(fragmentActivity).getScaledTouchSlop()) * -1.0f >= f2) {
                this.A01 = true;
                this.A06.A00((View) null, (View) null, (View) null, A02(this));
                GCC gcc = this.A00;
                if (gcc != null) {
                    11Z.A02(new C52321GNn(gcc, 8));
                }
                int dimensionPixelOffset = fragmentActivity.getResources().getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                C52079GDz A022 = A02(this);
                if (!(A022 == null || (gDy = A022.A07) == null)) {
                    gDy.A02().setVisibility(4);
                }
                A04(this, (float) dimensionPixelOffset);
                A05(this, true);
                View A002 = A00();
                if (A002 != null) {
                    SimpleVideoLayout A012 = A01();
                    if (A012 != null) {
                        f5 = A012.getPivotY();
                    } else {
                        f5 = 0.0f;
                    }
                    A002.setPivotY(f5);
                }
                return true;
            }
        }
        return false;
    }

    public C52258GKz(FragmentActivity fragmentActivity, ClipsViewerConfig clipsViewerConfig, UserSession userSession, C55925Hpn hpn, GC3 gc3, C52016GBn gBn, C52012GBj gBj) {
        C51972G9s.A1B(userSession, gBn);
        C51972G9s.A1E(clipsViewerConfig, hpn);
        this.A04 = userSession;
        this.A02 = fragmentActivity;
        this.A08 = gBj;
        this.A07 = gBn;
        this.A06 = gc3;
        this.A03 = clipsViewerConfig;
        this.A05 = hpn;
    }

    private final View A00() {
        C52078GDy gDy;
        C52079GDz A022 = A02(this);
        if (A022 == null || (gDy = A022.A07) == null) {
            return null;
        }
        return gDy.A08;
    }

    private final SimpleVideoLayout A01() {
        C52078GDy gDy;
        C52079GDz A022 = A02(this);
        if (A022 == null || (gDy = A022.A07) == null) {
            return null;
        }
        return gDy.A03();
    }

    public static final void A03(C232922uf r5, float f, float f2) {
        2cs A022 = 2cp.A00().A02();
        A022.A06 = true;
        A022.A08((double) f, true);
        A022.A0A(r5);
        A022.A09(C71392co.A04(35.0d, 6.0d));
        A022.A06((double) f2);
    }

    public static final void A04(C52258GKz gKz, float f) {
        SimpleVideoLayout A012 = gKz.A01();
        if (A012 != null) {
            A012.setClipToOutline(true);
        }
        SimpleVideoLayout A013 = gKz.A01();
        if (A013 != null) {
            A013.setOutlineProvider(new C52860Gdt(f, 2));
        }
        SimpleVideoLayout A014 = gKz.A01();
        if (A014 != null) {
            A014.invalidateOutline();
        }
    }
}
