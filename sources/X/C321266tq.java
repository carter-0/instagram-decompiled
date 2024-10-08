package X;

import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import java.util.List;

/* renamed from: X.6tq  reason: invalid class name and case insensitive filesystem */
public final class C321266tq implements C252203oj {
    public float A00;
    public List A01;
    public C62320sa A02;
    public boolean A03;
    public final GestureDetector A04;
    public final ViewGroup A05;
    public final 2cs A06;
    public final 2cs A07;
    public final 2cs A08;
    public final 2cs A09;
    public final 2cs A0A;
    public final C71392co A0B;
    public final ProfileCoinFlipView A0C;
    public final C62320sa A0D;
    public final C62320sa A0E;
    public final boolean A0F;
    public final C71392co A0G = C71392co.A04(10.0d, 10.0d);
    public final C71392co A0H;
    public final C62320sa A0I;

    public C321266tq(ViewGroup viewGroup, C320946tJ r14, ProfileCoinFlipView profileCoinFlipView, List list, C62320sa r17, C62320sa r18, C62320sa r19, C62320sa r20, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(viewGroup, 1);
        0qQ.A0B(profileCoinFlipView, 2);
        this.A05 = viewGroup;
        this.A0C = profileCoinFlipView;
        this.A01 = list;
        this.A0F = z;
        this.A0I = r17;
        this.A0E = r18;
        this.A02 = r19;
        this.A0D = r20;
        C71392co A042 = C71392co.A04(40.0d, 6.0d);
        this.A0B = A042;
        this.A0H = C71392co.A04(120.0d, 20.0d);
        2cs A022 = C61340me.A00().A02();
        A022.A06 = false;
        A022.A0A(this);
        this.A08 = A022;
        this.A04 = new GestureDetector(profileCoinFlipView.getContext(), new C321276tr(this, z3));
        2cs A023 = C61340me.A00().A02();
        A023.A09(C71392co.A04(180.0d, 20.0d));
        A023.A06 = true;
        A023.A0A(new C321286ts(this));
        this.A0A = A023;
        2cs A024 = C61340me.A00().A02();
        A024.A09(C71392co.A04(180.0d, 20.0d));
        A024.A06 = true;
        A024.A0A(new C321296tt(this));
        this.A06 = A024;
        2cs A025 = C61340me.A00().A02();
        A025.A09(C71392co.A04(200.0d, 20.0d));
        A025.A0A(new C321306tu(this));
        this.A09 = A025;
        2cs A026 = C61340me.A00().A02();
        A026.A09(C71392co.A03(10.0d, 20.0d));
        A026.A06 = false;
        A026.A0A(new C321316tv(this));
        this.A07 = A026;
        A022.A09(A042);
        A04(r14);
        if (z2) {
            viewGroup.setOnTouchListener(new C321326tw(this));
        }
    }

    public final void A04(C320946tJ r4) {
        0qQ.A0B(r4, 0);
        int ordinal = r4.ordinal();
        if (ordinal == 0) {
            this.A08.A05(0.0d);
        } else if (ordinal == 1) {
            this.A08.A02();
            ProfileCoinFlipView profileCoinFlipView = this.A0C;
            profileCoinFlipView.A0E();
            profileCoinFlipView.A01.setAvatarScale(1.0f);
        } else {
            throw new RuntimeException();
        }
    }

    public final void DmB(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public static final void A00(C321266tq r5) {
        2cs r0;
        if (r5.A0C.A01 == C320946tJ.PROFILE_PICTURE) {
            List<View> list = r5.A01;
            if (list != null) {
                for (View visibility : list) {
                    visibility.setVisibility(4);
                }
            }
            r0 = r5.A0A;
        } else {
            r0 = r5.A06;
        }
        r0.A06(1.0d);
    }

    public static final void A01(C321266tq r5) {
        2cs r0;
        if (r5.A0C.A01 == C320946tJ.PROFILE_PICTURE) {
            List<View> list = r5.A01;
            if (list != null) {
                for (View visibility : list) {
                    visibility.setVisibility(0);
                }
            }
            r0 = r5.A0A;
        } else {
            r0 = r5.A06;
        }
        r0.A06(0.0d);
    }

    public static final void A02(C321266tq r4) {
        if (r4.A0F) {
            ProfileCoinFlipView profileCoinFlipView = r4.A0C;
            if (profileCoinFlipView.A01 == C320946tJ.AVATAR) {
                r4.A09.A05(1.0d);
                profileCoinFlipView.postDelayed(new C51163FpZ(r4), 250);
                List<View> list = r4.A01;
                if (list != null) {
                    for (View visibility : list) {
                        visibility.setVisibility(4);
                    }
                }
            }
        }
    }

    public final void A03() {
        this.A08.A00();
        this.A07.A00();
        this.A0A.A00();
        this.A06.A00();
        this.A09.A00();
    }

    public final void DmC(2cs r4) {
        ProfileCoinFlipView profileCoinFlipView = this.A0C;
        if (profileCoinFlipView.A01 == C320946tJ.AVATAR) {
            profileCoinFlipView.A0D();
            A02(this);
        }
        A01(this);
        this.A0I.invoke();
    }

    public final void DmE(2cs r6) {
        C320946tJ r3;
        float scaleX;
        if (r6 != null) {
            float f = ((float) r6.A09.A00) * 180.0f;
            ProfileCoinFlipView profileCoinFlipView = this.A0C;
            profileCoinFlipView.setRotationY(f);
            float abs = Math.abs(f) % 360.0f;
            if (abs < 90.0f || abs > 270.0f) {
                r3 = C320946tJ.PROFILE_PICTURE;
            } else {
                r3 = C320946tJ.AVATAR;
            }
            if (r3.ordinal() == 0 ? profileCoinFlipView.getScaleX() >= 0.0f : profileCoinFlipView.getScaleX() <= 0.0f) {
                scaleX = profileCoinFlipView.getScaleX();
            } else {
                scaleX = -profileCoinFlipView.getScaleX();
            }
            profileCoinFlipView.setScaleX(scaleX);
            profileCoinFlipView.A0F(r3);
        }
    }

    public final void A05(boolean z, boolean z2) {
        C71392co r0;
        A00(this);
        2cs r4 = this.A08;
        if (z) {
            r0 = this.A0G;
        } else {
            r0 = this.A0H;
        }
        r4.A09(r0);
        r4.A0A(new DcD(this));
        double d = r4.A09.A00;
        int i = 1;
        int i2 = -1;
        if (z2) {
            i2 = 1;
        }
        if (z) {
            i = 2;
        }
        r4.A06(d - ((double) (i2 * i)));
    }
}
