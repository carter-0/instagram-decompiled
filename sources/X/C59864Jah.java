package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.creation.base.ui.mediatabbar.MediaTabBar;
import com.instagram.creation.base.ui.mediatabbar.Tab;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.Jah  reason: case insensitive filesystem */
public final class C59864Jah extends FrameLayout implements GestureDetector.OnGestureListener {
    public float A00;
    public int A01;
    public View A02;
    public Tab A03;
    public Tab A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public float A09;
    public TextView A0A;
    public Runnable A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final GestureDetector A0F;
    public final 2cs A0G;
    public final 2cs A0H = AnonymousClass7TF.A0J();
    public final MediaTabBar A0I;
    public final C59865Jai A0J;
    public final C59866Jaj A0K;
    public final Set A0L;
    public final boolean A0M;

    public C59864Jah(Context context) {
        super(context, (AttributeSet) null);
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.A0F = gestureDetector;
        2cs A0J2 = AnonymousClass7TF.A0J();
        A0J2.A09(JXH.A00);
        A0J2.A06 = true;
        this.A0G = A0J2;
        this.A0L = new CopyOnWriteArraySet();
        this.A0J = new C59865Jai(this);
        this.A0K = new C59866Jaj(this);
        this.A08 = true;
        Context context2 = getContext();
        this.A0M = 0mk.A02(context2);
        this.A05 = true;
        gestureDetector.setIsLongpressEnabled(false);
        LayoutInflater.from(2Yu.A0I(context, R.attr.mediaTabStyle)).inflate(R.layout.media_tab_host, this);
        MediaTabBar mediaTabBar = (MediaTabBar) requireViewById(R.id.media_tab_bar);
        this.A0I = mediaTabBar;
        ViewGroup.LayoutParams layoutParams = mediaTabBar.getLayoutParams();
        Resources resources = getResources();
        0qQ.A07(context2);
        DbT.A1B(resources, layoutParams, JWN.A05(context2) ? R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size : R.dimen.biz_sign_up_divider_bottom_margin);
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        boolean z = false;
        if (motionEvent.getAction() == 0) {
            this.A0D = false;
            this.A09 = 0.0f;
            this.A06 = false;
            this.A07 = false;
            this.A00 = 0.0f;
        }
        if (this.A0H.A01 == 0.0d && this.A08) {
            if (this.A06 && !this.A0D) {
                z = true;
            }
            this.A0F.onTouchEvent(motionEvent);
        }
        return z;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        0qQ.A0B(motionEvent2, 1);
        0qQ.A0A(motionEvent);
        float scaledTouchSlop = (float) ViewConfiguration.get(getContext()).getScaledTouchSlop();
        float A002 = AnonymousClass7TE.A00(motionEvent.getRawX(), motionEvent2.getRawX());
        float A003 = AnonymousClass7TE.A00(motionEvent.getRawY(), motionEvent2.getRawY());
        float A004 = (float) JTR.A00(A002, A003);
        float degrees = (float) Math.toDegrees(Math.asin((double) (A003 / A004)));
        if (A004 > scaledTouchSlop && !this.A06 && !this.A07) {
            this.A00 = motionEvent2.getRawX();
            if (degrees < 45.0f) {
                this.A06 = true;
            } else {
                this.A07 = true;
                return true;
            }
        }
        return true;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public final void setThemeBackground(Context context) {
        0qQ.A0B(context, 0);
        DbT.A16(context, this, 2Yu.A0C(context));
    }

    public static final void A02(C59864Jah jah) {
        if (jah.A02 == null) {
            View A0F2 = DbY.A0F(jah, R.id.media_tab_bar_text_info_stub);
            jah.A0A = AnonymousClass7TE.A0d(A0F2, R.id.media_tab_bar_text_info);
            jah.A02 = A0F2;
        }
    }

    /* access modifiers changed from: private */
    public final float getClampedSpringValue() {
        return (float) Math.min(Math.max(this.A0G.A09.A00, 0.0d), (double) ((this.A0I.getChildCount() - 1) * getWidth()));
    }

    private final void setDragOffset(float f) {
        JTP.A1K(this.A0G, f);
    }

    public final void A03(Tab tab, boolean z) {
        int i;
        if (!this.A0C) {
            this.A0B = new C59880Jb3(this, tab, z);
        } else if (tab != null) {
            if (this.A0M) {
                i = (this.A0I.getChildCount() - 1) - tab.A00;
            } else {
                i = tab.A00;
            }
            int childCount = this.A0I.getChildCount() - 1;
            if (childCount > i) {
                childCount = i;
            }
            if (childCount < 0) {
                childCount = 0;
            }
            2cs r2 = this.A0G;
            double width = (double) (childCount * getWidth());
            if (z) {
                r2.A06(width);
            } else {
                r2.A08(width, true);
            }
            if (!this.A0E) {
                Tab currentTab = getCurrentTab();
                for (C66502MUg DqB : this.A0L) {
                    DqB.DqB(currentTab);
                }
                this.A04 = getCurrentTab();
                this.A0E = true;
            }
        }
    }

    public final Tab getCurrentTab() {
        int currentIndex;
        MediaTabBar mediaTabBar = this.A0I;
        if (this.A0M) {
            currentIndex = (mediaTabBar.getChildCount() - 1) - getCurrentIndex();
        } else {
            currentIndex = getCurrentIndex();
        }
        View childAt = mediaTabBar.getChildAt(currentIndex);
        if (childAt != null) {
            return (Tab) childAt.getTag();
        }
        return null;
    }

    public final int getTabCount() {
        return this.A0I.getChildCount();
    }

    public final int getTabHeight() {
        MediaTabBar mediaTabBar = this.A0I;
        int i = mediaTabBar.getLayoutParams().height;
        if (i <= 0) {
            return mediaTabBar.getHeight();
        }
        return i;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A09 = f;
        return false;
    }

    public final void setTabTranslationX(float f) {
        MediaTabBar mediaTabBar = this.A0I;
        mediaTabBar.setTranslationX(f * AnonymousClass7TE.A02(mediaTabBar));
    }

    private final int getCurrentIndex() {
        double round = (double) Math.round(getCurrentProgress());
        return (int) Math.min(Math.max(round, 0.0d), (double) (this.A0I.getChildCount() - 1));
    }

    /* access modifiers changed from: private */
    public final float getCurrentProgress() {
        return getClampedSpringValue() / ((float) getWidth());
    }

    private final float getDragOffset() {
        return getClampedSpringValue();
    }

    private final int getTargetIndex() {
        int currentIndex = getCurrentIndex();
        float currentProgress = getCurrentProgress() % 1.0f;
        double d = this.A0G.A09.A01;
        if (d > 0.0d) {
            if (((double) currentProgress) <= 0.5d) {
                currentIndex++;
            }
        } else if (d < 0.0d && ((double) currentProgress) >= 0.5d) {
            currentIndex--;
        }
        int A072 = C51970G9q.A07(currentIndex, currentIndex);
        int childCount = this.A0I.getChildCount() - 1;
        if (A072 > childCount) {
            return childCount;
        }
        return A072;
    }

    private final float getTargetOffset() {
        return (float) (getTargetIndex() * getWidth());
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(876257023);
        super.onAttachedToWindow();
        this.A0G.A0A(this.A0J);
        if (this.A05) {
            this.A0H.A0A(this.A0K);
        } else {
            this.A0I.setVisibility(8);
        }
        AnonymousClass0fD.A0D(-1558042344, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(455441176);
        super.onDetachedFromWindow();
        this.A0G.A0B(this.A0J);
        this.A0H.A0B(this.A0K);
        AnonymousClass0fD.A0D(510412799, A062);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && !this.A0C) {
            this.A0C = true;
            Runnable runnable = this.A0B;
            if (runnable != null) {
                runnable.run();
                this.A0B = null;
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        int A052 = AnonymousClass0fD.A05(891406714);
        0qQ.A0B(motionEvent, 0);
        if (this.A0H.A01 != 0.0d || !this.A08) {
            AnonymousClass0fD.A0C(20990423, A052);
            return false;
        }
        this.A0F.onTouchEvent(motionEvent);
        float rawX = motionEvent.getRawX();
        if (!this.A06) {
            f = 0.0f;
        } else {
            f = rawX - this.A00;
        }
        int action = motionEvent.getAction();
        if (action == 1) {
            float f2 = this.A09;
            setDragOffset(getClampedSpringValue() - f);
            2cs r2 = this.A0G;
            r2.A07((double) (-1.0f * f2));
            r2.A06((double) getTargetOffset());
        } else if (action == 2 && this.A06) {
            setDragOffset(getClampedSpringValue() - f);
        }
        this.A00 = motionEvent.getRawX();
        AnonymousClass0fD.A0C(-257315910, A052);
        return true;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.A0D = z;
    }

    public final void setTextInfoBar(String str) {
        A02(this);
        this.A05 = false;
        this.A0I.setVisibility(8);
        View view = this.A02;
        if (view != null) {
            view.setVisibility(0);
            TextView textView = this.A0A;
            if (textView != null) {
                textView.setText(str);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void setTabPagingEnabled(boolean z) {
        this.A08 = z;
    }
}
