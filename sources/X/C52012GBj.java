package X;

import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.video.heroplayer.ipc.HeroScrollSetting;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import java.util.Set;

/* renamed from: X.GBj  reason: case insensitive filesystem */
public final class C52012GBj extends C231402rc {
    public ViewPager2 A00;
    public C267324bN A01;
    public GDC A02;
    public C66900Mei A03;
    public C52014GBl A04 = new C52014GBl();
    public Integer A05;
    public final HeroScrollSetting A06;
    public final ClipsViewerConfig A07;
    public final UserSession A08;
    public final GD6 A09;
    public final C52013GBk A0A = new C52013GBk(this);
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final C52009GBg A0E;

    public final View A0A(int i) {
        C252553pI r0;
        try {
            RecyclerView A032 = A03(this);
            if (A032 != null) {
                r0 = A032.A0D;
            } else {
                r0 = null;
            }
            if (r0 != null) {
                return r0.A1D(i);
            }
        } catch (NullPointerException e) {
            0wb.A05("ClipsViewPagerImpl_getViewAtIndex", 002.A0c("View at index ", " is null.", i), 1, e);
        }
        return null;
    }

    public final void A0J(AnonymousClass32U r2) {
        Set set;
        0qQ.A0B(r2, 0);
        C52014GBl gBl = this.A04;
        if (gBl != null && (set = gBl.A03) != null) {
            set.add(r2);
        }
    }

    public final void A0K(AnonymousClass32U r2) {
        Set set;
        0qQ.A0B(r2, 0);
        C52014GBl gBl = this.A04;
        if (gBl != null && (set = gBl.A03) != null) {
            set.remove(r2);
        }
    }

    public static final RecyclerView A03(C52012GBj gBj) {
        View view;
        ViewPager2 viewPager2 = gBj.A00;
        if (viewPager2 != null) {
            view = viewPager2.getChildAt(0);
        } else {
            view = null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        return null;
    }

    public static final void A05(C52012GBj gBj, int i, boolean z) {
        ViewPager2 viewPager2 = gBj.A00;
        if (viewPager2 != null && viewPager2.A06.A06.A07) {
            gBj.A0G();
            C52014GBl gBl = gBj.A04;
            if (gBl != null) {
                for (AnonymousClass32U DWY : gBl.A03) {
                    DWY.DWY();
                }
            }
        }
        ViewPager2 viewPager22 = gBj.A00;
        if (viewPager22 != null) {
            viewPager22.A03(i, z);
        }
    }

    public final int A06() {
        ViewPager2 viewPager2 = this.A00;
        if (viewPager2 != null) {
            return viewPager2.A00;
        }
        return 0;
    }

    public final int A08() {
        int A0A2 = this.A09.A0A.A0A() - 1;
        if (A0A2 < 0) {
            return 0;
        }
        return A0A2;
    }

    public final C267324bN A0C(int i) {
        if (i < 0) {
            return null;
        }
        C52009GBg gBg = this.A09.A0A;
        if (i < gBg.A0A()) {
            return gBg.A0E(i);
        }
        return null;
    }

    public final Integer A0D() {
        ViewPager2 viewPager2 = this.A00;
        if (viewPager2 != null) {
            int i = viewPager2.A08.A02;
            if (Integer.valueOf(i) != null) {
                if (i == 1) {
                    return AnonymousClass05K.A01;
                }
                if (i == 2) {
                    return AnonymousClass05K.A0C;
                }
            }
        }
        return AnonymousClass05K.A00;
    }

    public final void A0E() {
        ViewPager2 viewPager2 = this.A00;
        if (viewPager2 != null) {
            viewPager2.setUserInputEnabled(false);
        }
    }

    public final void A0F() {
        ViewPager2 viewPager2 = this.A00;
        if (viewPager2 != null) {
            viewPager2.setUserInputEnabled(true);
        }
    }

    public final void A0G() {
        C14072TpM tpM;
        ViewPager2 viewPager2 = this.A00;
        if (viewPager2 != null) {
            GD1 gd1 = viewPager2.A06;
            C14056Tp4 tp4 = gd1.A06;
            if (tp4.A07) {
                tp4.A07 = false;
                C14056Tp4.A01(tp4);
                VUM vum = tp4.A04;
                if (vum.A01 == 0) {
                    int i = vum.A02;
                    if (!(i == tp4.A01 || (tpM = tp4.A05) == null)) {
                        tpM.A01(i);
                    }
                    C14056Tp4.A02(tp4, 0);
                    C14056Tp4.A00(tp4);
                } else {
                    C14056Tp4.A02(tp4, 2);
                }
                VelocityTracker velocityTracker = gd1.A04;
                velocityTracker.computeCurrentVelocity(IgNetworkConsentStorage.MAX_ENTRIES, (float) gd1.A02);
                if (!gd1.A05.A1F((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
                    ViewPager2 viewPager22 = gd1.A07;
                    View A032 = viewPager22.mPagerSnapHelper.A03(viewPager22.A02);
                    if (A032 != null) {
                        int[] A092 = viewPager22.mPagerSnapHelper.A09(A032, viewPager22.A02);
                        int i2 = A092[0];
                        if (i2 != 0 || A092[1] != 0) {
                            viewPager22.A04.A0u(i2, A092[1]);
                        }
                    }
                }
            }
        }
    }

    public final void A0H(int i) {
        ViewPager2 viewPager2 = this.A00;
        if (viewPager2 != null) {
            viewPager2.post(new C57885Ii2(this, i));
        }
    }

    public final void A0I(int i, boolean z) {
        if (this.A0E.A01 || this.A09.A02) {
            this.A05 = Integer.valueOf(i);
            GD6 gd6 = this.A09;
            gd6.A0E.add(new C73671Phk(this, i, 3, z));
            return;
        }
        A05(this, i, z);
    }

    public final void onItemRangeInserted(int i, int i2) {
        Integer num;
        ViewPager2 viewPager2;
        ViewPager2 viewPager22 = this.A00;
        boolean z = true;
        if (!(viewPager22 != null && i == viewPager22.A00 && this.A05 == null)) {
            z = false;
        }
        ClipsViewerConfig clipsViewerConfig = this.A07;
        if (clipsViewerConfig.A1Y) {
            if (DbS.A04(0Tu.A05, this.A08, 36608828058769160L) == 0 && z && (viewPager2 = this.A00) != null) {
                viewPager2.post(new C57884Ii1(this, i2));
            }
        } else if (clipsViewerConfig.A1i) {
        } else {
            if ((z || ((num = this.A05) != null && i == num.intValue())) && viewPager22 != null) {
                viewPager22.post(new GLZ(this, i));
            }
        }
    }

    public C52012GBj(HeroScrollSetting heroScrollSetting, ClipsViewerConfig clipsViewerConfig, UserSession userSession, C52009GBg gBg, GD6 gd6, boolean z, boolean z2, boolean z3) {
        C51972G9s.A1B(userSession, gBg);
        0qQ.A0B(clipsViewerConfig, 8);
        this.A08 = userSession;
        this.A09 = gd6;
        this.A0B = z;
        this.A0E = gBg;
        this.A0D = z2;
        this.A06 = heroScrollSetting;
        this.A0C = z3;
        this.A07 = clipsViewerConfig;
    }

    public static int A00(C52012GBj gBj, int i) {
        int A062 = gBj.A06();
        int A092 = gBj.A09();
        int A063 = gBj.A06();
        int i2 = A063 + 1;
        if (A062 == A092) {
            return A063 - i;
        }
        return i2;
    }

    public static int A01(C62320sa r0) {
        return ((C52012GBj) r0.invoke()).A06();
    }

    public static View A02(C52012GBj gBj) {
        return gBj.A0A(gBj.A06());
    }

    public static C267324bN A04(C52012GBj gBj) {
        return gBj.A0C(gBj.A06());
    }

    public final int A07() {
        C252553pI r1;
        RecyclerView A032 = A03(this);
        if (A032 != null) {
            r1 = A032.A0D;
        } else {
            r1 = null;
        }
        if (r1 instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) r1).A1a();
        }
        return -1;
    }

    public final int A09() {
        C252553pI r1;
        RecyclerView A032 = A03(this);
        if (A032 != null) {
            r1 = A032.A0D;
        } else {
            r1 = null;
        }
        if (r1 instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) r1).A1b();
        }
        return -1;
    }

    public final C267324bN A0B() {
        return A04(this);
    }

    public final void A0L(boolean z) {
        if (A06() < A08()) {
            A0I(A06() + 1, z);
        }
    }
}
