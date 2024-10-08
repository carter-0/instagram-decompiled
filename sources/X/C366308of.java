package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import com.instagram.user.model.Product;

/* renamed from: X.8of  reason: invalid class name and case insensitive filesystem */
public final class C366308of implements C3508386o {
    public AnonymousClass876 A00;
    public AnonymousClass871 A01;
    public Integer A02;
    public boolean A03;
    public boolean A04;
    public final View A05;
    public final UserSession A06;
    public final TargetViewSizeProvider A07;
    public final AnonymousClass86i A08;
    public final C366288od A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H;
    public final AnonymousClass0eM A0I;
    public final AnonymousClass0eM A0J;
    public final C252203oj A0K = new C366318og(this);

    public C366308of(View view, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass86i r7, C366288od r8) {
        0qQ.A0B(view, 1);
        0qQ.A0B(targetViewSizeProvider, 3);
        0qQ.A0B(r7, 5);
        this.A05 = view;
        this.A06 = userSession;
        this.A07 = targetViewSizeProvider;
        this.A09 = r8;
        this.A08 = r7;
        0eO r2 = 0eO.A02;
        this.A0B = AnonymousClass0eN.A00(r2, new AnonymousClass9LC(this, 13));
        this.A0F = AnonymousClass0eN.A00(r2, new AnonymousClass9LC(this, 17));
        this.A0E = AnonymousClass0eN.A00(r2, new AnonymousClass9LC(this, 16));
        this.A0A = AnonymousClass0eN.A00(r2, new AnonymousClass9LC(this, 12));
        this.A0G = AnonymousClass0eN.A00(r2, new AnonymousClass9LC(this, 18));
        this.A0I = AnonymousClass0eN.A00(r2, new AnonymousClass9LC(this, 20));
        this.A0H = AnonymousClass0eN.A00(r2, new AnonymousClass9LC(this, 19));
        this.A0C = AnonymousClass0eN.A00(r2, new AnonymousClass9LC(this, 14));
        this.A0D = AnonymousClass0eN.A00(r2, new AnonymousClass9LC(this, 15));
        this.A0J = AnonymousClass0eN.A00(r2, new AnonymousClass9LC(this, 21));
    }

    public final void Dke() {
    }

    public final void E4E() {
        this.A04 = false;
        onPause();
    }

    public final void E4F() {
        this.A04 = true;
        ((View) this.A0E.getValue()).setVisibility(0);
        onResume();
    }

    public final void ETd(String str) {
        AnonymousClass87G r3;
        CameraAREffect cameraAREffect;
        boolean z;
        boolean z2;
        String str2 = str;
        if (str == null || 00l.A0W(str)) {
            Object value = this.A0H.getValue();
            0qQ.A07(value);
            ((View) value).setContentDescription(((View) this.A0G.getValue()).getContext().getString(2131968391));
            C347487wt r2 = (C347487wt) this.A0D.getValue();
            IgTextView igTextView = r2.A05;
            igTextView.setTextSize(14.0f);
            if (r2.A0A) {
                r2.setBackground((Drawable) null);
            }
            r2.A0D();
            igTextView.setText(r2.getContext().getString(2131968391));
            return;
        }
        AnonymousClass876 r1 = this.A00;
        if (r1 != null) {
            r3 = r1.A02(r1.A00);
        } else {
            r3 = null;
        }
        String str3 = null;
        if (r3 != null) {
            cameraAREffect = r3.A00();
        } else {
            cameraAREffect = null;
        }
        Object value2 = this.A0H.getValue();
        0qQ.A07(value2);
        ((View) value2).setContentDescription(str);
        C347487wt r12 = (C347487wt) this.A0D.getValue();
        if (r3 != null) {
            str3 = r3.A01(((View) this.A0G.getValue()).getContext());
        }
        if (cameraAREffect != null) {
            z = cameraAREffect.CbC();
            z2 = true;
        } else {
            z = false;
            z2 = false;
        }
        r12.setCurrentTitle(new C342507oi(str2, str3, false, z, false, z2, z2));
    }

    public final void FLO() {
    }

    public final void A00() {
        AnonymousClass87G r3;
        AnonymousClass87I r2;
        AnonymousClass876 r1 = this.A00;
        if (r1 != null) {
            r3 = r1.A02(r1.A00);
        } else {
            r3 = null;
        }
        String str = null;
        if (r3 != null) {
            r2 = r3.A04;
            if (r2 == null) {
                r2 = AnonymousClass87I.EMPTY;
            }
        } else {
            r2 = null;
        }
        if (r2 == AnonymousClass87I.LOADING_AR_EFFECT) {
            ((C347487wt) this.A0D.getValue()).A0D();
            return;
        }
        if (r3 != null) {
            str = r3.A0G;
        }
        ETd(str);
    }

    public final boolean AFa() {
        if (this.A04) {
            AnonymousClass0eM r1 = this.A0G;
            if (!((View) r1.getValue()).isEnabled() || ((ReboundViewPager) r1.getValue()).A0O != AnonymousClass3TF.IDLE) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void AIy(AnonymousClass876 r15, AnonymousClass871 r16) {
        if (!this.A03) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            ((ViewGroup) this.A0C.getValue()).addView((View) this.A0D.getValue(), layoutParams);
        }
        AnonymousClass0eM r6 = this.A0B;
        AnonymousClass871 r1 = r16;
        ((C3508886t) r6.getValue()).A02 = r1;
        ((C3508886t) r6.getValue()).A01 = r15;
        this.A00 = r15;
        this.A01 = r1;
        if (r15 != null) {
            this.A03 = true;
            AnonymousClass0eM r3 = this.A0G;
            Context context = ((View) r3.getValue()).getContext();
            Resources resources = context.getResources();
            int A002 = AnonymousClass879.A00(context);
            int width = ((NineSixteenLayoutConfigImpl) this.A07).A0K.getWidth();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.audio_page_audio_filter_tooltip_vertical_offset);
            AnonymousClass0eM r7 = this.A0J;
            0nA.A0V((View) this.A0I.getValue(), ((Number) r7.getValue()).intValue() - dimensionPixelSize);
            0nA.A0V((View) r3.getValue(), ((Number) r7.getValue()).intValue());
            float f = (float) A002;
            float f2 = (float) width;
            C342277oK r8 = new C342277oK(C342257oI.A00(f, f2 / 2.0f, (float) resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material), (float) resources.getDimensionPixelSize(R.dimen.abc_star_medium), (float) resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen)), f, f2, (float) ((Number) r7.getValue()).intValue(), (float) dimensionPixelSize);
            ((ReboundViewPager) r3.getValue()).A0C = A002;
            int i = 0;
            ((ReboundViewPager) r3.getValue()).A0M(4, false);
            ((ReboundViewPager) r3.getValue()).setPageSpacing(0.0f);
            ((ReboundViewPager) r3.getValue()).setScrollMode(A2C.A00);
            ((ReboundViewPager) r3.getValue()).A0J = r8;
            AnonymousClass0eM r5 = this.A0H;
            Object value = r5.getValue();
            0qQ.A07(value);
            ((ShutterButton) value).setInnerCircleAlpha(0.0f);
            ((C3508886t) r6.getValue()).A00 = (ReboundViewPager) r3.getValue();
            ((C3508886t) r6.getValue()).A00("camera_dial_postcap");
            r15.A02 = r8;
            r8.A00 = r15.A04;
            r15.A03 = new C40311Aa2(this);
            int i2 = r15.A00;
            if (r15.A07(i2)) {
                i = i2;
            }
            ((ReboundViewPager) r3.getValue()).A0K(i);
            ((ReboundViewPager) r3.getValue()).A0N(r15, (float) i);
            Aa5 aa5 = new Aa5(this);
            Object value2 = r5.getValue();
            0qQ.A07(value2);
            C342377oU r32 = new C342377oU(context, (View) value2, (View) r3.getValue(), aa5);
            ((TouchInterceptorFrameLayout) this.A0A.getValue()).A00(r32.A02, r32.A01);
        }
    }

    public final int B6L() {
        return ((ReboundViewPager) this.A0G.getValue()).A09;
    }

    public final int BLQ() {
        return ((ReboundViewPager) this.A0G.getValue()).A0A;
    }

    public final int BcK() {
        return ((Number) this.A0J.getValue()).intValue();
    }

    public final C252203oj BoF() {
        return this.A0K;
    }

    public final boolean CZ5() {
        return this.A03;
    }

    public final void EKh(int i, boolean z) {
        AnonymousClass876 r2 = this.A00;
        if (this.A03 && r2 != null) {
            AnonymousClass0eM r1 = this.A0G;
            if (!((View) r1.getValue()).isEnabled()) {
                return;
            }
            if (r2.A07(i)) {
                ReboundViewPager reboundViewPager = (ReboundViewPager) r1.getValue();
                if (z) {
                    reboundViewPager.A0L(i, 0.0f);
                } else {
                    reboundViewPager.A0K(i);
                }
            } else {
                0kD.A07("PostCaptureDialViewController", 002.A0O("Invalid Scroll position passed: ", i), (Throwable) null);
            }
        }
    }

    public final void EL8(String str) {
        Integer valueOf;
        AnonymousClass876 r0 = this.A00;
        if (r0 != null && (valueOf = Integer.valueOf(r0.A00(str))) != null) {
            ELA((String) null, valueOf.intValue(), false);
        }
    }

    public final void ELA(String str, int i, boolean z) {
        int i2 = i;
        ((ReboundViewPager) this.A0G.getValue()).A0K(i);
        AnonymousClass876 r0 = this.A00;
        if (r0 != null) {
            r0.A05(str, i2, false, z, false);
        }
        this.A02 = null;
    }

    public final void EXs(boolean z) {
        ((C3508886t) this.A0B.getValue()).A05 = z;
    }

    public final void Egp(Product product) {
        throw new UnsupportedOperationException("Post capture dial does not support products");
    }

    public final void Egv(boolean z) {
        throw new UnsupportedOperationException("Post capture dial does not support products");
    }

    public final void FL7(float f) {
        ((View) this.A0E.getValue()).setAlpha(f);
        ((C347487wt) this.A0D.getValue()).setGroupAlpha(f);
    }

    public final View getView() {
        return (View) this.A0E.getValue();
    }

    public final void onPause() {
        Integer valueOf;
        if (this.A04) {
            AnonymousClass0eM r4 = this.A0G;
            AnonymousClass0eM r3 = this.A0B;
            ((ReboundViewPager) r4.getValue()).A0Q((AnonymousClass4HF) r3.getValue());
            if (this.A03 && ((ReboundViewPager) r4.getValue()).A0O != AnonymousClass3TF.IDLE) {
                AnonymousClass876 r2 = this.A00;
                if (r2 == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(Math.max(0, Math.min(AnonymousClass1GB.A01(((ReboundViewPager) r4.getValue()).A01), r2.getCount() - 1)));
                }
                this.A02 = valueOf;
                if (valueOf != null) {
                    ((ReboundViewPager) r4.getValue()).A0K(valueOf.intValue());
                }
            }
            C229402nK r0 = ((C3508886t) r3.getValue()).A03;
            if (r0 != null) {
                r0.onPause();
            }
        }
    }

    public final void onResume() {
        Integer num;
        int intValue;
        if (this.A04) {
            AnonymousClass0eM r2 = this.A0B;
            ((ReboundViewPager) this.A0G.getValue()).A0P((AnonymousClass4HF) r2.getValue());
            if (this.A03 && (num = this.A02) != null && (intValue = num.intValue()) >= 0) {
                AnonymousClass876 r0 = this.A00;
                if (r0 != null) {
                    r0.A03(intValue);
                }
                this.A02 = null;
            }
            r2.getValue();
        }
    }
}
