package X;

import android.animation.Animator;
import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.8gm  reason: invalid class name and case insensitive filesystem */
public final class C361778gm extends C249383je implements View.OnTouchListener, C317516nO {
    public float A00 = 15.0f;
    public long A01 = 1500;
    public VelocityTracker A02;
    public C41781B0k A03;
    public boolean A04;
    public float A05;
    public boolean A06;
    public final int A07;
    public final Handler A08 = new Handler();
    public final View A09;
    public final View A0A;
    public final View A0B;
    public final TextView A0C;
    public final UserSession A0D;
    public final C361768gl A0E;
    public final Runnable A0F = new C361788gn(this);
    public final boolean A0G;
    public final GestureDetector A0H;
    public final C361658ga A0I;
    public final C361748gj A0J;
    public final C361688gd A0K;

    public final boolean onDown(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        float y = motionEvent.getY();
        this.A04 = true;
        this.A05 = y;
        if (A02(A00(y)) != null) {
            if (182.A06(0Tu.A05, this.A0D, 36323010868685553L)) {
                this.A08.removeCallbacks(this.A0F);
            }
            ViewPropertyAnimator duration = this.A0C.animate().setDuration(200);
            int i = -1;
            if (this.A0G) {
                i = 1;
            }
            duration.translationX((float) (i * this.A07)).setListener((Animator.AnimatorListener) null);
            return true;
        }
        A05();
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        if (this.A0E.CbI()) {
            this.A09.setVisibility(0);
            if (!182.A06(0Tu.A05, this.A0D, 36323010868685553L) || this.A0C.getVisibility() == 0) {
                this.A0H.onTouchEvent(motionEvent);
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            return true;
                        }
                    }
                }
                this.A04 = false;
                Handler handler = this.A08;
                Runnable runnable = this.A0F;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, this.A01);
                this.A0C.animate().setDuration(200).translationX(0.0f).setListener((Animator.AnimatorListener) null);
                return true;
            }
            TextView textView = this.A0C;
            if (textView.getVisibility() != 0 || textView.getAlpha() <= 0.0f) {
                return false;
            }
            return true;
        }
        this.A09.setVisibility(4);
        return false;
    }

    private final float A00(float f) {
        View view = this.A09;
        View view2 = this.A0A;
        return ((float) (C229632nm.A03((int) ((view.getY() + f) - this.A05), view2.getPaddingTop(), (view2.getHeight() - view.getHeight()) - view2.getPaddingBottom()) - view2.getPaddingTop())) / ((float) A01());
    }

    private final int A01() {
        View view = this.A0A;
        return ((view.getHeight() - this.A09.getHeight()) - view.getPaddingBottom()) - view.getPaddingTop();
    }

    private final String A02(float f) {
        C361658ga r1 = this.A0I;
        int Bqm = r1.Bqm(this.A0E.Bqq(f));
        List Bqr = r1.Bqr();
        if (Bqm < 0 || Bqm >= Bqr.size()) {
            return null;
        }
        Object obj = Bqr.get(Bqm);
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.String");
        return (String) obj;
    }

    private final void A03() {
        this.A08.removeCallbacks(this.A0F);
        this.A06 = true;
        TextView textView = this.A0C;
        textView.setVisibility(0);
        View view = this.A0B;
        view.setVisibility(0);
        textView.setAlpha(1.0f);
        view.setAlpha(1.0f);
        C41781B0k b0k = this.A03;
        if (b0k != null) {
            AnonymousClass85X r1 = ((AnonymousClass9Q2) b0k).A00.A01.A0n;
            if (!r1.A0C) {
                r1.A0U.setVisibility(8);
            }
        }
    }

    private final void A04(float f) {
        View view = this.A0A;
        int paddingTop = (int) (((float) view.getPaddingTop()) + (((float) A01()) * f));
        int paddingTop2 = view.getPaddingTop();
        int height = view.getHeight();
        View view2 = this.A09;
        if (paddingTop <= (height - view2.getHeight()) - view.getPaddingBottom() && paddingTop2 <= paddingTop) {
            view2.setY((float) paddingTop);
            String A022 = A02(f);
            TextView textView = this.A0C;
            if (!2PP.A00(A022, textView.getText())) {
                textView.setText(A022);
            }
        }
    }

    public final void A05() {
        this.A08.removeCallbacks(this.A0F);
        this.A06 = false;
        this.A0C.setVisibility(4);
        this.A0B.setVisibility(4);
        C41781B0k b0k = this.A03;
        if (b0k != null) {
            AnonymousClass85X r1 = ((AnonymousClass9Q2) b0k).A00.A01.A0n;
            if (!r1.A0C) {
                r1.A0U.setVisibility(0);
            }
        }
    }

    public final void A06() {
        CharSequence text = this.A0C.getText();
        if (text == null || text.length() <= 0 || A01() <= 0) {
            A05();
            return;
        }
        A03();
        if (!this.A04) {
            Handler handler = this.A08;
            Runnable runnable = this.A0F;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, this.A01);
        }
    }

    public final void A07(int i) {
        float f;
        C361768gl r4 = this.A0E;
        boolean CbI = r4.CbI();
        View view = this.A09;
        if (CbI) {
            view.setVisibility(0);
            if (!this.A04) {
                VelocityTracker velocityTracker = this.A02;
                if (velocityTracker != null) {
                    velocityTracker.computeCurrentVelocity(1);
                    f = Math.abs(velocityTracker.getYVelocity());
                } else {
                    f = 0.0f;
                }
                if (f > this.A00) {
                    this.A06 = true;
                }
                if (this.A06) {
                    A03();
                    Handler handler = this.A08;
                    Runnable runnable = this.A0F;
                    handler.removeCallbacks(runnable);
                    handler.postDelayed(runnable, this.A01);
                }
                A04(r4.Bq7(i));
                return;
            }
            A06();
            return;
        }
        view.setVisibility(4);
    }

    public C361778gm(View view, UserSession userSession, C361658ga r6, C361768gl r7, C361748gj r8, C361688gd r9) {
        this.A0D = userSession;
        this.A0E = r7;
        this.A0J = r8;
        C361798go r0 = new C361798go(this);
        ViewGroup viewGroup = r8.A00;
        viewGroup.setOnTouchListener(r0);
        this.A0I = r6;
        this.A0A = view;
        View requireViewById = view.requireViewById(R.id.fast_scroll);
        this.A09 = requireViewById;
        this.A0B = view.findViewById(R.id.fast_scroll_thumb);
        requireViewById.setOnTouchListener(this);
        this.A0C = (TextView) view.findViewById(R.id.fast_scroll_section_bubble);
        Context context = viewGroup.getContext();
        0qQ.A07(context);
        this.A0G = 0mk.A02(context);
        this.A0K = r9;
        this.A07 = view.getResources().getDimensionPixelSize(R.dimen.caption_overlay_offset_with_social_bubble);
        GestureDetector gestureDetector = new GestureDetector(requireViewById.getContext(), this);
        this.A0H = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        r9.registerDataSetObserver(new C361808gp(this));
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int A032 = AnonymousClass0fD.A03(-2074724034);
        0qQ.A0B(motionEvent2, 1);
        float A002 = A00(motionEvent2.getY());
        C361748gj r3 = this.A0J;
        int A003 = r3.A00();
        C361688gd r2 = this.A0K;
        int AJv = r2.AJv(A003);
        C361768gl r1 = this.A0E;
        A04(r1.Bq7(AJv));
        int Boo = r1.Boo(A002);
        int BXr = r1.BXr(Boo, A002);
        int AJz = r2.AJz(Boo);
        if (AJz >= 0) {
            r3.A01(AJz, BXr);
        }
        r3.A02(0, 0);
        AnonymousClass0fD.A0A(1575966879, A032);
        return true;
    }

    public final void onScrollStateChanged(C238133Ar r3, int i) {
        AnonymousClass0fD.A0A(728882835, AnonymousClass0fD.A03(844044414));
    }

    public final void onScroll(C238133Ar r3, int i, int i2, int i3, int i4, int i5) {
        int A032 = AnonymousClass0fD.A03(-1254855078);
        A07(i);
        AnonymousClass0fD.A0A(-345681714, A032);
    }
}
