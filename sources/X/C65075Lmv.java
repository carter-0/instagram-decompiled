package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Lmv  reason: case insensitive filesystem */
public final class C65075Lmv implements MXK, XBP {
    public View A00;
    public ViewPager A01;
    public C61406K6c A02;
    public C61406K6c A03;
    public C16343UtG A04;
    public final Context A05;
    public final FragmentActivity A06;
    public final 0hq A07;
    public final UserSession A08;
    public final C62320sa A09;
    public final boolean A0A;
    public final AnonymousClass861 A0B;

    /* JADX WARNING: type inference failed for: r0v32, types: [java.lang.Object, X.5n1] */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0113, code lost:
        X.0qQ.A0F(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View A00(android.view.ViewGroup r16) {
        /*
            r15 = this;
            r11 = r15
            android.view.View r3 = r15.A00
            if (r3 != 0) goto L_0x013e
            android.content.Context r0 = r15.A05
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            boolean r1 = r15.A0A
            r0 = 2131624513(0x7f0e0241, float:1.8876208E38)
            if (r1 == 0) goto L_0x0015
            r0 = 2131624516(0x7f0e0244, float:1.8876214E38)
        L_0x0015:
            r8 = 0
            r3 = r16
            android.view.View r3 = r2.inflate(r0, r3, r8)
            r0 = 2131430032(0x7f0b0a90, float:1.8481754E38)
            android.view.View r0 = r3.requireViewById(r0)
            androidx.viewpager.widget.ViewPager r0 = (androidx.viewpager.widget.ViewPager) r0
            r15.A01 = r0
            r2 = 0
            if (r1 != 0) goto L_0x0077
            r0 = 2131428164(0x7f0b0344, float:1.8477965E38)
            android.view.View r1 = X.AnonymousClass7TF.A0G(r3, r0)
            r0 = 27
            X.LY0.A00(r1, r0, r15)
            r0 = 2131428163(0x7f0b0343, float:1.8477963E38)
            android.view.View r4 = X.AnonymousClass7TF.A0F(r3, r0)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r4 = (com.instagram.igds.components.mediabutton.IgdsMediaButton) r4
            com.instagram.common.session.UserSession r6 = r15.A08
            X.0Tu r5 = X.0Tu.A06
            r0 = 36323805437832726(0x810c4f00032e16, double:3.034659050885375E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x0117
            r4.setVisibility(r8)
            android.content.res.Resources r1 = X.DbU.A05(r3)
            r0 = 2131955206(0x7f130e06, float:1.9546933E38)
            java.lang.String r0 = r1.getString(r0)
            r4.setLabel(r0)
            r0 = 2131231358(0x7f08027e, float:1.8078795E38)
            r4.setBackgroundResource(r0)
            r1 = 2131238733(0x7f081f4d, float:1.8093753E38)
            X.5n1 r0 = new X.5n1
            r0.<init>()
            r0.A00 = r1
            r4.setStartAddOn(r0, r2)
            r0 = 53
            X.LY8.A00(r4, r0, r3, r15)
        L_0x0077:
            X.Kgm r4 = X.C62496Kgm.GALLERY_SAVED
            X.K6c r1 = new X.K6c
            r1.<init>()
            android.os.Bundle r0 = X.AnonymousClass7TE.A0a()
            java.lang.String r5 = "arg_asset_entry_point"
            r0.putSerializable(r5, r4)
            r1.setArguments(r0)
            r15.A02 = r1
            X.Kgm r4 = X.C62496Kgm.GALLERY_TRENDING
            X.K6c r1 = new X.K6c
            r1.<init>()
            android.os.Bundle r0 = X.AnonymousClass7TE.A0a()
            r0.putSerializable(r5, r4)
            r1.setArguments(r0)
            r15.A03 = r1
            r0 = 2131432929(0x7f0b15e1, float:1.848763E38)
            android.view.View r10 = X.AnonymousClass7TF.A0G(r3, r0)
            com.instagram.ui.widget.fixedtabbar.FixedTabBar r10 = (com.instagram.ui.widget.fixedtabbar.FixedTabBar) r10
            r10.setIndicatorEnabled(r8)
            X.Kg6 r4 = X.C62456Kg6.TRENDING
            X.Kg6 r0 = X.C62456Kg6.SAVED
            X.Kg6[] r0 = new X.C62456Kg6[]{r4, r0}
            java.util.List r12 = X.0sr.A1P(r0)
            java.util.Iterator r9 = r12.iterator()
        L_0x00bb:
            boolean r0 = r9.hasNext()
            java.lang.String r1 = "viewPager"
            if (r0 == 0) goto L_0x00fb
            r9.next()
            int r7 = r8 + 1
            if (r8 >= 0) goto L_0x00d2
            X.0sr.A1T()
        L_0x00cd:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00d2:
            X.0hq r6 = r15.A07
            androidx.viewpager.widget.ViewPager r0 = r15.A01
            if (r0 == 0) goto L_0x0113
            int r5 = r0.getId()
            r0 = 2606(0xa2e, float:3.652E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 58
            java.lang.String r0 = X.002.A0J(r1, r0, r5, r8)
            androidx.fragment.app.Fragment r1 = r6.A0R(r0)
            if (r1 == 0) goto L_0x00f9
            X.0s1 r0 = new X.0s1
            r0.<init>(r6)
            r0.A03(r1)
            r0.A06()
        L_0x00f9:
            r8 = r7
            goto L_0x00bb
        L_0x00fb:
            X.0hq r8 = r15.A07
            androidx.viewpager.widget.ViewPager r9 = r15.A01
            if (r9 == 0) goto L_0x0113
            r13 = 0
            X.UtG r7 = new X.UtG
            r14 = r13
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r15.A04 = r7
            r7.A03(r4)
            X.K6c r0 = r15.A02
            if (r0 != 0) goto L_0x011e
            java.lang.String r1 = "savedTabFragment"
        L_0x0113:
            X.0qQ.A0F(r1)
            goto L_0x00cd
        L_0x0117:
            r0 = 8
            r4.setVisibility(r0)
            goto L_0x0077
        L_0x011e:
            r0.A00()
            com.instagram.common.session.UserSession r0 = r15.A08
            X.6tY r1 = X.C353578Ie.A00(r0)
            r0 = 20
            r1.A01(r0, r2)
            androidx.fragment.app.FragmentActivity r2 = r15.A06
            X.LZW r1 = new X.LZW
            r1.<init>(r15, r13)
            r0 = 145(0x91, float:2.03E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A0v(r1, r2, r0)
            r15.A00 = r3
        L_0x013e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65075Lmv.A00(android.view.ViewGroup):android.view.View");
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final void AJD() {
    }

    public final int B8T() {
        return 0;
    }

    public final void CN3(ViewGroup viewGroup) {
        viewGroup.removeAllViews();
        viewGroup.addView(A00(viewGroup));
        A02();
        AnonymousClass861 r0 = this.A0B;
        if (r0 != null) {
            r0.A01();
            r0.A06(0);
        }
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final void Dfp() {
    }

    public final void cancel() {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final void A01() {
        C62456Kg6 kg6;
        C61406K6c k6c;
        String str;
        C16343UtG utG = this.A04;
        if (utG != null && (kg6 = (C62456Kg6) utG.A02()) != null) {
            int ordinal = kg6.ordinal();
            if (ordinal == 0) {
                k6c = this.A03;
                if (k6c == null) {
                    str = "trendingTabFragment";
                }
                k6c.A00();
                return;
            } else if (ordinal == 1) {
                k6c = this.A02;
                if (k6c == null) {
                    str = "savedTabFragment";
                }
                k6c.A00();
                return;
            } else {
                return;
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r2 = this;
            X.UtG r0 = r2.A04
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = r0.A02()
            X.Kg6 r0 = (X.C62456Kg6) r0
            if (r0 == 0) goto L_0x0036
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0024
            r0 = 1
            if (r1 != r0) goto L_0x0036
            X.K6c r0 = r2.A02
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "savedTabFragment"
        L_0x001c:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0024:
            X.K6c r0 = r2.A03
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "trendingTabFragment"
            goto L_0x001c
        L_0x002b:
            X.JZf r1 = r0.A00
            if (r1 == 0) goto L_0x0036
            r0 = 0
            r1.A06 = r0
            r0 = 0
            X.C59811JZf.A00(r1, r0)
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65075Lmv.A02():void");
    }

    public final /* bridge */ /* synthetic */ Fragment ALb(Object obj) {
        C61406K6c k6c;
        String str;
        int A022 = DbU.A02((C62456Kg6) obj, 0);
        if (A022 == 0) {
            k6c = this.A03;
            if (k6c == null) {
                str = "trendingTabFragment";
            }
            return k6c;
        } else if (A022 == 1) {
            k6c = this.A02;
            if (k6c == null) {
                str = "savedTabFragment";
            }
            return k6c;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ OIJ AN9(Object obj) {
        int i;
        C62456Kg6 kg6 = (C62456Kg6) obj;
        0qQ.A0B(kg6, 0);
        View inflate = LayoutInflater.from(this.A05).inflate(R.layout.clips_hub_tab_button_view, (ViewGroup) null);
        TextView A0R = AnonymousClass7TG.A0R(inflate, R.id.tab_title_text);
        ImageView A0J = DbX.A0J(inflate, R.id.tab_title_icon);
        int ordinal = kg6.ordinal();
        if (ordinal == 0) {
            A0R.setText(2131955212);
            i = R.drawable.instagram_arrow_up_right_pano_filled_12;
        } else if (ordinal == 1) {
            A0R.setText(2131955210);
            i = R.drawable.instagram_save_pano_filled_12;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        A0J.setImageResource(i);
        return new OIJ((Drawable) null, (Drawable) null, inflate, (String) null, (String) null, -1, -1, -1, -1, -1, -1, R.dimen.abc_button_padding_horizontal_material, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding, -1, -1, -1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AQD(float r4) {
        /*
            r3 = this;
            X.UtG r0 = r3.A04
            if (r0 == 0) goto L_0x0038
            java.lang.Object r0 = r0.A02()
            X.Kg6 r0 = (X.C62456Kg6) r0
            if (r0 == 0) goto L_0x0038
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0024
            r0 = 1
            if (r1 != r0) goto L_0x0038
            X.K6c r0 = r3.A02
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "savedTabFragment"
        L_0x001c:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0024:
            X.K6c r0 = r3.A03
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "trendingTabFragment"
            goto L_0x001c
        L_0x002b:
            X.JZf r0 = r0.A00
            if (r0 == 0) goto L_0x0038
            androidx.recyclerview.widget.RecyclerView r2 = r0.A01()
            int r1 = (int) r4
            r0 = 0
            r2.scrollBy(r0, r1)
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65075Lmv.AQD(float):void");
    }

    public final List Bdz() {
        return AnonymousClass7TE.A1I(C62578KiB.FULLY_REVEALED);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003a A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CQZ() {
        /*
            r3 = this;
            X.UtG r0 = r3.A04
            if (r0 == 0) goto L_0x002b
            java.lang.Object r0 = r0.A02()
            X.Kg6 r0 = (X.C62456Kg6) r0
            if (r0 == 0) goto L_0x002b
            int r0 = r0.ordinal()
        L_0x0010:
            r1 = 1
            r2 = 0
            if (r0 == r2) goto L_0x0024
            if (r0 != r1) goto L_0x003b
            X.K6c r0 = r3.A02
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = "savedTabFragment"
        L_0x001c:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0024:
            X.K6c r0 = r3.A03
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = "trendingTabFragment"
            goto L_0x001c
        L_0x002b:
            r0 = -1
            goto L_0x0010
        L_0x002d:
            X.JZf r0 = r0.A00
            if (r0 == 0) goto L_0x003a
            androidx.recyclerview.widget.RecyclerView r0 = r0.A01()
            boolean r1 = X.C2808154f.A04(r0)
            return r1
        L_0x003a:
            r1 = 0
        L_0x003b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65075Lmv.CQZ():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003a A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CQa() {
        /*
            r3 = this;
            X.UtG r0 = r3.A04
            if (r0 == 0) goto L_0x002b
            java.lang.Object r0 = r0.A02()
            X.Kg6 r0 = (X.C62456Kg6) r0
            if (r0 == 0) goto L_0x002b
            int r0 = r0.ordinal()
        L_0x0010:
            r1 = 1
            r2 = 0
            if (r0 == r2) goto L_0x0024
            if (r0 != r1) goto L_0x003b
            X.K6c r0 = r3.A02
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = "savedTabFragment"
        L_0x001c:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0024:
            X.K6c r0 = r3.A03
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = "trendingTabFragment"
            goto L_0x001c
        L_0x002b:
            r0 = -1
            goto L_0x0010
        L_0x002d:
            X.JZf r0 = r0.A00
            if (r0 == 0) goto L_0x003a
            androidx.recyclerview.widget.RecyclerView r0 = r0.A01()
            boolean r1 = X.C2808154f.A05(r0)
            return r1
        L_0x003a:
            r1 = 0
        L_0x003b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65075Lmv.CQa():boolean");
    }

    public final void Cyv() {
        ViewGroup viewGroup;
        View view = this.A00;
        ViewParent viewParent = null;
        if (view != null) {
            viewParent = view.getParent();
        }
        if ((viewParent instanceof ViewGroup) && (viewGroup = (ViewGroup) viewParent) != null) {
            viewGroup.removeView(this.A00);
        }
        A01();
        AnonymousClass861 r0 = this.A0B;
        if (r0 != null) {
            r0.A03();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DG2(float r4, float r5) {
        /*
            r3 = this;
            X.UtG r0 = r3.A04
            if (r0 == 0) goto L_0x0038
            java.lang.Object r0 = r0.A02()
            X.Kg6 r0 = (X.C62456Kg6) r0
            if (r0 == 0) goto L_0x0038
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0024
            r0 = 1
            if (r1 != r0) goto L_0x0038
            X.K6c r0 = r3.A02
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "savedTabFragment"
        L_0x001c:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0024:
            X.K6c r0 = r3.A03
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "trendingTabFragment"
            goto L_0x001c
        L_0x002b:
            X.JZf r0 = r0.A00
            if (r0 == 0) goto L_0x0038
            androidx.recyclerview.widget.RecyclerView r2 = r0.A01()
            r1 = 0
            int r0 = (int) r5
            r2.A1F(r1, r0)
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65075Lmv.DG2(float, float):void");
    }

    public final /* bridge */ /* synthetic */ void DqK(Object obj) {
        int A022 = DbU.A02((C62456Kg6) obj, 0);
        if (A022 == 0) {
            C61406K6c k6c = this.A03;
            if (k6c != null) {
                C59811JZf jZf = k6c.A00;
                if (jZf != null) {
                    jZf.A06 = false;
                    C59811JZf.A00(jZf, (String) null);
                }
                C61406K6c k6c2 = this.A02;
                if (k6c2 != null) {
                    k6c2.A00();
                    return;
                }
                0qQ.A0F("savedTabFragment");
                throw AnonymousClass00P.createAndThrow();
            }
        } else if (A022 == 1) {
            C61406K6c k6c3 = this.A03;
            if (k6c3 != null) {
                k6c3.A00();
                C61406K6c k6c4 = this.A02;
                if (k6c4 != null) {
                    C59811JZf jZf2 = k6c4.A00;
                    if (jZf2 != null) {
                        jZf2.A06 = false;
                        C59811JZf.A00(jZf2, (String) null);
                        return;
                    }
                    return;
                }
                0qQ.A0F("savedTabFragment");
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            throw AnonymousClass7TE.A1K();
        }
        0qQ.A0F("trendingTabFragment");
        throw AnonymousClass00P.createAndThrow();
    }

    public C65075Lmv(Context context, FragmentActivity fragmentActivity, 0hq r3, UserSession userSession, AnonymousClass861 r5, C62320sa r6, boolean z) {
        AnonymousClass7TG.A1P(userSession, fragmentActivity);
        this.A08 = userSession;
        this.A05 = context;
        this.A06 = fragmentActivity;
        this.A07 = r3;
        this.A0A = z;
        this.A0B = r5;
        this.A09 = r6;
    }
}
