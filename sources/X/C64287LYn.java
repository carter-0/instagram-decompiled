package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStub;
import android.widget.Adapter;
import android.widget.ListView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.LYn  reason: case insensitive filesystem */
public final class C64287LYn implements View.OnTouchListener, C252203oj, C66441MRv, GestureDetector.OnGestureListener {
    public float A00;
    public View A01;
    public View A02;
    public View A03;
    public ListView A04;
    public C61687KHv A05;
    public LZF A06;
    public U1A A07;
    public ReboundViewPager A08;
    public TouchInterceptorFrameLayout A09;
    public JZ7 A0A;
    public CirclePageIndicator A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public float A0H;
    public float A0I;
    public float A0J;
    public boolean A0K;
    public boolean A0L;
    public final GestureDetector A0M;
    public final View.OnTouchListener A0N = new C64286LYm((Object) this, 5);
    public final View A0O;
    public final View A0P;
    public final View A0Q;
    public final ViewStub A0R;
    public final 2cs A0S;
    public final AnonymousClass0iw A0T;
    public final UserSession A0U;
    public final AnonymousClass3E6 A0V;
    public final AnonymousClass8MH A0W;
    public final KKB A0X;
    public final double A0Y;
    public final LBQ A0Z;

    public final void DmB(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final boolean onDown(MotionEvent motionEvent) {
        this.A0J = 0.0f;
        this.A0E = true;
        this.A0K = false;
        this.A0C = false;
        this.A0H = motionEvent.getRawX();
        this.A0I = motionEvent.getRawY();
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public static void A00(MotionEvent motionEvent, C64287LYn lYn) {
        if (!lYn.A0K && !lYn.A0C) {
            float rawX = lYn.A0H - motionEvent.getRawX();
            float rawY = lYn.A0I - motionEvent.getRawY();
            if (JTR.A00(rawX, rawY) <= lYn.A0Y) {
                return;
            }
            if (JTS.A00(rawY, rawX) < 20.0d) {
                lYn.A0K = true;
            } else {
                lYn.A0C = true;
            }
        }
    }

    public static void A01(C64287LYn lYn, float f) {
        2cs r6 = lYn.A0S;
        float A032 = JTO.A03(r6);
        double height = (double) lYn.A0Q.getHeight();
        float min = (float) Math.min(Math.max((double) (A032 - f), 0.0d), height);
        if (A032 != min) {
            JTP.A1K(r6, min);
        }
    }

    public static boolean A02(C64287LYn lYn) {
        Object obj;
        if (lYn.A08.getVisibility() == 0) {
            obj = lYn.A08.A0F;
        } else {
            obj = lYn.A04;
        }
        if (obj == null) {
            return false;
        }
        return true;
    }

    public final void A04(boolean z) {
        if (this.A09 == null) {
            TouchInterceptorFrameLayout inflate = this.A0R.inflate();
            this.A09 = inflate;
            View requireViewById = inflate.requireViewById(R.id.asset_picker);
            this.A02 = requireViewById;
            this.A03 = requireViewById.requireViewById(R.id.drag_chevron);
            this.A01 = this.A09.requireViewById(R.id.asset_items_container);
            this.A05 = new C61687KHv(this.A09, this);
            UserSession userSession = this.A0U;
            AnonymousClass0iw r4 = this.A0T;
            TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A09;
            KKB kkb = this.A0X;
            AnonymousClass3E6 r6 = this.A0V;
            AnonymousClass8MH r7 = this.A0W;
            this.A06 = new LZF(touchInterceptorFrameLayout, r4, userSession, r6, r7, kkb, this);
            this.A04 = (ListView) this.A09.findViewById(R.id.assets_search_results_list);
            CirclePageIndicator circlePageIndicator = (CirclePageIndicator) this.A02.requireViewById(R.id.page_indicator);
            this.A0B = circlePageIndicator;
            circlePageIndicator.A09 = true;
            this.A08 = (ReboundViewPager) this.A02.requireViewById(R.id.assets_view_pager);
            View view = this.A0Q;
            JZ7 jz7 = new JZ7(view, r4, userSession, (C357638Yz) null, r7, kkb, true, false);
            this.A0A = jz7;
            this.A08.setAdapter((Adapter) jz7);
            ReboundViewPager reboundViewPager = this.A08;
            reboundViewPager.setDraggingEnabled(false);
            reboundViewPager.A0P(this.A0B);
            2cs r2 = this.A0S;
            r2.A0A(this);
            r2.A08((double) view.getHeight(), true);
            this.A09.A00(this.A0N, this);
        }
        if (this.A07 == null) {
            this.A09.getClass();
            int dimensionPixelSize = this.A09.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
            C17669Vc0 vc0 = new C17669Vc0(this.A02, "EmojiPickerController", this.A0P, this.A0O);
            vc0.A02 = 15;
            vc0.A00 = 12;
            vc0.A03 = this.A09.getContext().getColor(R.color.black_20_transparent);
            vc0.A04 = dimensionPixelSize;
            U1A u1a = new U1A(vc0);
            this.A07 = u1a;
            this.A02.setBackground(u1a);
        }
        this.A07.setVisible(true, false);
        TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = this.A09;
        touchInterceptorFrameLayout2.getClass();
        boolean z2 = false;
        touchInterceptorFrameLayout2.setVisibility(0);
        ArrayList A1C = AnonymousClass7TE.A1C();
        boolean z3 = !this.A0X.A03().isEmpty();
        if (z3) {
            LMR lmr = new LMR();
            lmr.A01 = "recent_emoji_set_id";
            lmr.A00 = C62554Khk.RECENT_NAMETAG_EMOJIS_SET;
            A1C.add(lmr);
        }
        LMR.A00(A1C, AnonymousClass7TE.A1C());
        this.A08.setDraggingEnabled(C51970G9q.A1W(A1C.size(), 1));
        CirclePageIndicator circlePageIndicator2 = this.A0B;
        int i = 8;
        if (A1C.size() > 1) {
            i = 0;
        }
        circlePageIndicator2.setVisibility(i);
        this.A0B.A01(this.A08.A08, A1C.size());
        if (z3 && !this.A0L) {
            this.A0B.A02(1);
            this.A08.A0R(true, 1.0f);
        }
        if (this.A0L || z3) {
            z2 = true;
        }
        this.A0L = z2;
        JZ7 jz72 = this.A0A;
        List list = jz72.A07;
        list.clear();
        list.addAll(A1C);
        0fE.A00(jz72, 792283702);
        LZF lzf = this.A06;
        if (lzf != null) {
            List list2 = lzf.A06.A04;
            list2.clear();
            list2.addAll(A1C);
        }
        if (!z) {
            this.A0S.A06((double) (AnonymousClass7TE.A03(this.A0Q) * 0.39999998f));
        }
    }

    public final boolean A05() {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A09;
        if (touchInterceptorFrameLayout == null || touchInterceptorFrameLayout.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final boolean A06(float f, boolean z) {
        double d;
        float A032;
        2cs r6 = this.A0S;
        if (!r6.A0C()) {
            return false;
        }
        C71412ct r7 = r6.A09;
        double d2 = r7.A00;
        if (!AnonymousClass7TF.A1Q((d2 > 0.0d ? 1 : (d2 == 0.0d ? 0 : -1))) || f > 0.0f) {
            View view = this.A0Q;
            if (d2 != ((double) view.getHeight()) || f < 0.0f) {
                float f2 = 3500.0f;
                if (z) {
                    f2 = 10000.0f;
                }
                if (Math.abs(f) <= f2) {
                    if (z) {
                        A032 = AnonymousClass7TE.A03(view) * 0.39999998f;
                    } else {
                        if (r7.A00 >= ((double) ((AnonymousClass7TE.A03(view) * 0.39999998f) / 2.0f))) {
                            if (r7.A00 <= ((double) (AnonymousClass7TE.A03(view) * 0.7f))) {
                                A032 = AnonymousClass7TE.A03(view) * 0.39999998f;
                            }
                        }
                        d = 0.0d;
                        r6.A06(d);
                        return true;
                    }
                    d = (double) A032;
                    r6.A06(d);
                    return true;
                } else if (f > 0.0f) {
                    r6.A07((double) f);
                } else if (f >= 0.0f) {
                    return true;
                } else {
                    r6.A07((double) f);
                    d = 0.0d;
                    r6.A06(d);
                    return true;
                }
                d = (double) view.getHeight();
                r6.A06(d);
                return true;
            }
        }
        DmC(r6);
        return true;
    }

    public final Integer Aci() {
        return AnonymousClass05K.A0N;
    }

    public final void DmC(2cs r6) {
        LBQ lbq;
        boolean z;
        if (this.A0S.A09.A00 == ((double) this.A0Q.getHeight())) {
            C61687KHv kHv = this.A05;
            if (kHv != null) {
                kHv.A00();
            }
            AnonymousClass7TH.A0R(this.A09);
            U1A u1a = this.A07;
            z = false;
            if (u1a != null) {
                u1a.setVisible(false, false);
            }
            lbq = this.A0Z;
        } else {
            lbq = this.A0Z;
            z = true;
        }
        lbq.A09 = z;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A0J = f2;
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.A0E) {
            this.A0E = false;
            this.A00 = f2;
            return true;
        } else if (!this.A0C) {
            return true;
        } else {
            A01(this, f2);
            return true;
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean onTouchEvent = this.A0M.onTouchEvent(motionEvent);
        A00(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 3) {
            return onTouchEvent;
        }
        A06(this.A0J, false);
        return onTouchEvent;
    }

    public C64287LYn(View view, LBQ lbq, AnonymousClass0iw r6, UserSession userSession, AnonymousClass3E6 r8, AnonymousClass8MH r9) {
        this.A0Q = view;
        this.A0U = userSession;
        this.A0T = r6;
        this.A0O = view.requireViewById(R.id.card_view);
        this.A0P = view.requireViewById(R.id.grid_pattern_view);
        this.A0R = DbU.A0D(view, R.id.asset_picker_view_stub);
        this.A0X = new KKB(userSession);
        this.A0W = r9;
        this.A0Z = lbq;
        this.A0V = r8;
        2cs A0J2 = AnonymousClass7TF.A0J();
        A0J2.A06 = true;
        this.A0S = A0J2;
        Context context = view.getContext();
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.A0M = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.A0Y = (double) ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final void A03(boolean z) {
        if (A05()) {
            2cs r3 = this.A0S;
            int height = this.A0Q.getHeight();
            if (z) {
                r3.A06((double) height);
                return;
            }
            r3.A08((double) height, true);
            DmC(r3);
        }
    }

    public final void DmE(2cs r3) {
        this.A02.setTranslationY(JTO.A03(r3));
        U1A u1a = this.A07;
        if (u1a != null) {
            u1a.invalidateSelf();
        }
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        LMR lmr;
        double d;
        if (motionEvent.getY() < this.A02.getY()) {
            A03(true);
            return true;
        }
        float y = motionEvent.getY();
        if (y < this.A02.getY() + ((float) this.A03.getTop()) || y > this.A02.getY() + ((float) this.A03.getBottom())) {
            return false;
        }
        ReboundViewPager reboundViewPager = this.A08;
        if (reboundViewPager == null || reboundViewPager.getChildCount() == 0) {
            lmr = null;
        } else {
            lmr = (LMR) this.A0A.getItem(this.A08.A08);
        }
        if (lmr == null || this.A0A.A03(lmr)) {
            2cs r5 = this.A0S;
            if (!r5.A0C()) {
                return true;
            }
            if (r5.A09.A00 == 0.0d) {
                d = (double) this.A0Q.getHeight();
            } else {
                d = 0.0d;
            }
            r5.A06(d);
            return true;
        }
        this.A0A.A02(lmr, true);
        return true;
    }
}
