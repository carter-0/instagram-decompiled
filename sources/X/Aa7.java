package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import com.instagram.user.model.Product;

public final class Aa7 implements C3508386o {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public View A05;
    public C342277oK A06;
    public ReboundViewPager A07;
    public AnonymousClass876 A08;
    public AnonymousClass871 A09;
    public boolean A0A;
    public final Context A0B;
    public final ViewStub A0C;
    public final ViewStub A0D;
    public final TouchInterceptorFrameLayout A0E;
    public final TargetViewSizeProvider A0F;
    public final C3508886t A0G;
    public final ShutterButton A0H;
    public final View A0I;
    public final C252203oj A0J = new C383689fz(this);
    public final UserSession A0K;
    public final C3508686r A0L;

    public Aa7(View view, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider) {
        this.A0I = view;
        this.A0K = userSession;
        this.A0F = targetViewSizeProvider;
        this.A0D = (ViewStub) AnonymousClass7TE.A0b(view, R.id.dial_ar_effect_picker_container_stub);
        this.A0E = AnonymousClass7TE.A0b(view, R.id.dial_picker_shutter_button_container);
        this.A0G = new C3508886t(view, userSession, false, true);
        this.A0L = new Aa1(this);
        this.A0C = (ViewStub) AnonymousClass7TE.A0b(view, R.id.dial_ar_effect_picker_background_stub);
        this.A0H = (ShutterButton) AnonymousClass7TE.A0b(view, R.id.camera_shutter_button);
        this.A00 = 1.0f;
        this.A04 = -1;
        Context context = view.getContext();
        this.A0B = context;
        Resources resources = context.getResources();
        this.A03 = resources.getDimensionPixelSize(R.dimen.dynamic_ads_picker_padding_top);
        this.A02 = resources.getDimensionPixelSize(R.dimen.album_music_sticker_circular_album_art_size);
        this.A01 = resources.getDimensionPixelSize(R.dimen.ad_not_delivering_thumbnail_height);
    }

    public final void E4F() {
        this.A0A = true;
        A00();
        this.A0H.setInnerCircleAlpha(0.0f);
        onResume();
    }

    public final void ETd(String str) {
    }

    public final void Egp(Product product) {
    }

    public final void Egv(boolean z) {
    }

    public final void FLO() {
    }

    private final void A00() {
        if (this.A07 == null) {
            Context context = this.A0B;
            Resources resources = context.getResources();
            int A002 = AnonymousClass879.A00(context);
            float f = (float) A002;
            float A003 = (float) AnonymousClass81W.A00(this.A0F);
            int i = this.A02;
            float f2 = (float) this.A03;
            this.A06 = new C342277oK(C342257oI.A00(f, A003 / 2.0f, AnonymousClass7TE.A01(resources, R.dimen.abc_dialog_padding_material), AnonymousClass7TE.A01(resources, R.dimen.abc_star_medium), AnonymousClass7TE.A01(resources, R.dimen.abc_alert_dialog_button_dimen)), f, A003, (float) i, f2);
            ReboundViewPager reboundViewPager = this.A07;
            if (reboundViewPager == null) {
                View inflate = this.A0D.inflate();
                0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager");
                reboundViewPager = (ReboundViewPager) inflate;
                this.A07 = reboundViewPager;
                this.A0G.A00 = reboundViewPager;
            }
            View view = this.A05;
            if (view == null) {
                view = this.A0C.inflate();
                this.A05 = view;
            }
            0nA.A0V(reboundViewPager, i);
            0qQ.A0A(view);
            0nA.A0V(view, this.A01);
            reboundViewPager.setVisibility(0);
            reboundViewPager.A0C = A002;
            reboundViewPager.A0M(4, false);
            reboundViewPager.setPageSpacing(0.0f);
            reboundViewPager.setScrollMode(AnonymousClass3TG.WHEEL_OF_FORTUNE);
            reboundViewPager.setItemPositioner(this.A06);
            this.A0G.A00("ar_commerce_primary_dial");
            C342377oU r0 = new C342377oU(context, this.A0H, reboundViewPager, new Aa4(this));
            this.A0E.A00(r0.A02, r0.A01);
            A01();
        }
    }

    private final void A01() {
        AnonymousClass876 r3 = this.A08;
        if (r3 != null) {
            C342277oK r1 = this.A06;
            r3.A02 = r1;
            if (r1 != null) {
                r1.A00 = r3.A04;
            }
            r3.A03 = this.A0L;
            int i = r3.A00;
            if (!r3.A07(i)) {
                i = 0;
            }
            ReboundViewPager reboundViewPager = this.A07;
            if (reboundViewPager != null) {
                reboundViewPager.A0K(i);
            }
            ReboundViewPager reboundViewPager2 = this.A07;
            if (reboundViewPager2 != null) {
                reboundViewPager2.A0N(r3, (float) i);
            }
        }
    }

    public final boolean AFa() {
        ReboundViewPager reboundViewPager;
        if (!this.A0A || (reboundViewPager = this.A07) == null || reboundViewPager.A0O != AnonymousClass3TF.IDLE) {
            return false;
        }
        return true;
    }

    public final void AIy(AnonymousClass876 r3, AnonymousClass871 r4) {
        this.A09 = r4;
        C3508886t r1 = this.A0G;
        r1.A02 = r4;
        if (this.A08 != r3) {
            this.A08 = r3;
            r1.A01 = r3;
            if (AnonymousClass7TF.A1V(this.A07)) {
                A01();
            }
        }
    }

    public final int B6L() {
        ReboundViewPager reboundViewPager = this.A07;
        if (reboundViewPager != null) {
            return reboundViewPager.A09;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final int BLQ() {
        ReboundViewPager reboundViewPager = this.A07;
        if (reboundViewPager != null) {
            return reboundViewPager.A0A;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final int BcK() {
        return this.A02;
    }

    public final C252203oj BoF() {
        return this.A0J;
    }

    public final boolean CZ5() {
        return AnonymousClass7TF.A1V(this.A07);
    }

    public final void Dke() {
        ReboundViewPager reboundViewPager = this.A07;
        if (reboundViewPager != null) {
            reboundViewPager.requestDisallowInterceptTouchEvent(true);
        }
    }

    public final void EKh(int i, boolean z) {
        AnonymousClass876 r0;
        if (AnonymousClass7TF.A1V(this.A07) && (r0 = this.A08) != null) {
            if (r0.A07(i)) {
                ReboundViewPager reboundViewPager = this.A07;
                if (z) {
                    if (reboundViewPager != null) {
                        reboundViewPager.A0L(i, 0.0f);
                    }
                } else if (reboundViewPager != null) {
                    reboundViewPager.A0K(i);
                }
            } else {
                0wb.A03("ArCommercePrimaryDialViewController", "Invalid Scroll position passed");
            }
        }
    }

    public final void EL8(String str) {
        AnonymousClass876 r0 = this.A08;
        if (r0 != null) {
            ELA((String) null, r0.A00(str), false);
        }
    }

    public final void EXs(boolean z) {
        this.A0G.A05 = z;
    }

    public final void FL7(float f) {
        float f2;
        this.A00 = f;
        if (!AnonymousClass7TF.A1V(this.A07)) {
            0wb.A03("ArCommercePrimaryDialViewController", "updatePickerAlpha() was called but picker was not initialized");
            return;
        }
        ReboundViewPager reboundViewPager = this.A07;
        if (reboundViewPager != null) {
            reboundViewPager.setAlpha(f);
        }
        ReboundViewPager reboundViewPager2 = this.A07;
        if (reboundViewPager2 != null) {
            int i = 4;
            if (this.A00 > 0.0f) {
                i = 0;
            }
            reboundViewPager2.setVisibility(i);
        }
        ShutterButton shutterButton = this.A0H;
        AnonymousClass876 r0 = this.A08;
        if (r0 == null || r0.getCount() == 0) {
            f2 = 1.0f;
        } else {
            f2 = 1.0f - this.A00;
        }
        shutterButton.setInnerCircleAlpha(f2);
    }

    public final View getView() {
        return this.A07;
    }

    public final void onPause() {
        AnonymousClass3TF r1;
        ReboundViewPager reboundViewPager;
        if (this.A0A) {
            if (AnonymousClass7TF.A1V(this.A07) && (reboundViewPager = this.A07) != null) {
                reboundViewPager.A0Q(this.A0G);
            }
            if (AnonymousClass7TF.A1V(this.A07)) {
                ReboundViewPager reboundViewPager2 = this.A07;
                if (reboundViewPager2 != null) {
                    r1 = reboundViewPager2.A0O;
                } else {
                    r1 = null;
                }
                if (r1 != AnonymousClass3TF.IDLE) {
                    if (reboundViewPager2 != null) {
                        int A012 = AnonymousClass1GB.A01(reboundViewPager2.A01);
                        AnonymousClass876 r0 = this.A08;
                        if (r0 != null) {
                            int count = r0.getCount() - 1;
                            if (count > A012) {
                                count = A012;
                            }
                            A012 = count;
                        }
                        int i = 0;
                        if (0 < A012) {
                            i = A012;
                        }
                        this.A04 = i;
                        ReboundViewPager reboundViewPager3 = this.A07;
                        if (reboundViewPager3 != null) {
                            reboundViewPager3.A0K(i);
                        }
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
            }
            C229402nK r02 = this.A0G.A03;
            if (r02 != null) {
                r02.onPause();
            }
        }
    }

    public final void onResume() {
        AnonymousClass876 r1;
        int i;
        ReboundViewPager reboundViewPager;
        if (this.A0A) {
            if (AnonymousClass7TF.A1V(this.A07) && (reboundViewPager = this.A07) != null) {
                reboundViewPager.A0P(this.A0G);
            }
            if (AnonymousClass7TF.A1V(this.A07) && (r1 = this.A08) != null && (i = this.A04) >= 0) {
                r1.A03(i);
                this.A04 = -1;
            }
        }
    }

    public final void E4E() {
        onPause();
        this.A0A = false;
        this.A0H.setInnerCircleAlpha(1.0f);
    }

    public final void ELA(String str, int i, boolean z) {
        A00();
        ReboundViewPager reboundViewPager = this.A07;
        int i2 = i;
        if (reboundViewPager != null) {
            reboundViewPager.A0K(i);
        }
        AnonymousClass876 r0 = this.A08;
        if (r0 != null) {
            r0.A05(str, i2, false, z, false);
        }
        this.A04 = -1;
    }
}
