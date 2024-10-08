package com.instagram.common.ui.widget.recyclerview;

import X.0KC;
import X.0mi;
import X.0nA;
import X.0pe;
import X.0qQ;
import X.0sC;
import X.0wb;
import X.2Rw;
import X.2cp;
import X.2cs;
import X.AnonymousClass000;
import X.AnonymousClass03P;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass34S;
import X.AnonymousClass3AS;
import X.AnonymousClass52S;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C16504Uw0;
import X.C19991WjC;
import X.C19992WjD;
import X.C19993WjE;
import X.C20199Wmx;
import X.C231402rc;
import X.C249403jg;
import X.C252203oj;
import X.C252553pI;
import X.C317406nD;
import X.C323716xz;
import X.C61340me;
import X.C66580MXl;
import X.C71392co;
import X.C71412ct;
import X.DbT;
import X.JTP;
import X.JTQ;
import X.JTT;
import X.Pxf;
import X.U9b;
import X.UAY;
import X.UZ2;
import X.W6D;
import X.WTZ;
import X.X1M;
import X.X1N;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Scroller;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.webrtc.CameraVideoCapturer;

public final class RefreshableRecyclerViewLayout extends FrameLayout implements C252203oj, C317406nD {
    public static boolean A0Z;
    public static boolean A0a;
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public long A05;
    public Scroller A06;
    public C323716xz A07;
    public X1M A08;
    public X1N A09;
    public Object A0A;
    public Method A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public float A0F;
    public float A0G;
    public long A0H;
    public AnonymousClass3AS A0I;
    public C16504Uw0 A0J;
    public Runnable A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public final ImageView A0O;
    public final RecyclerView A0P;
    public final 2cs A0Q;
    public final 2cs A0R;
    public final U9b A0S;
    public final List A0T;
    public final Handler A0U;
    public final AnonymousClass03P A0V;
    public final C231402rc A0W;
    public final Runnable A0X;
    public final Runnable A0Y;

    public final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new W6D(90);
        public Parcelable A00;

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.A00, i);
        }
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, X.03P] */
    /* JADX WARNING: type inference failed for: r0v10, types: [X.U9b, X.52S] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RefreshableRecyclerViewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A0U = new Handler();
        this.A0X = new C19991WjC(this);
        this.A0Y = new C19992WjD(this);
        this.A0T = new ArrayList();
        this.A0W = new UAY(this, 4);
        this.A0J = C16504Uw0.IDLE;
        this.A0H = 800;
        this.A0L = false;
        this.A0M = false;
        this.A0V = new Object();
        this.A0S = new AnonymousClass52S(context);
        2cp A002 = C61340me.A00();
        2cs A022 = A002.A02();
        A022.A09(C71392co.A04(25.0d, 9.5d));
        A022.A00 = 0.5d;
        A022.A02 = 50.0d;
        A022.A0A(this);
        this.A0R = A022;
        2cs A023 = A002.A02();
        A023.A09(C71392co.A04(0.0d, 0.35d));
        A023.A00 = 0.5d;
        A023.A02 = 50.0d;
        A023.A0A(this);
        this.A0Q = A023;
        A002.A04.add(this);
        this.A0G = 0nA.A04(context, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
        this.A0F = 0nA.A04(context, CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS);
        RecyclerView recyclerView = new RecyclerView(context);
        this.A0P = recyclerView;
        recyclerView.setClipChildren(this.A0L);
        recyclerView.setClipToPadding(this.A0M);
        addView(recyclerView);
        ImageView imageView = new ImageView(context);
        this.A0O = imageView;
        imageView.setVisibility(8);
        addView(imageView);
        A01();
    }

    public final void Cxs(2cp r1) {
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r11) {
        0qQ.A0B(r11, 0);
        2cs r6 = this.A0R;
        if (r11 == r6) {
            C71412ct r9 = r6.A09;
            float f = (float) r9.A00;
            if (this.A0E && !this.A0D && r6.A01 == ((double) getOverScrollRestTarget()) && r6.A0D()) {
                this.A0E = false;
                this.A00 = 0.0f;
                A02(0.0f, (float) r9.A01);
                r6.A08(0.0d, true);
                f = 0.0f;
            }
            boolean A1Q = AnonymousClass7TF.A1Q(this.A04);
            RecyclerView recyclerView = this.A0P;
            if (A1Q) {
                recyclerView.setTranslationX(f);
            } else {
                recyclerView.setTranslationY(f);
            }
            List list = this.A0T;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C249403jg r0 = (C249403jg) ((AnonymousClass34S) list.get(i)).A01;
                if (r0 != null) {
                    r0.onScrolled(recyclerView, 0, 0);
                }
            }
            A01();
        } else if (r11 == this.A0Q) {
            A06(this);
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        if (motionEvent.getActionMasked() == 1) {
            this.A0N = false;
            post(this.A0Y);
        }
        return false;
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        float f3;
        this.A00 = 0.0f;
        if (this.A04 != 0) {
            f = f2;
        }
        if (A09()) {
            f3 = this.A0G;
        } else {
            f3 = this.A0F;
        }
        float abs = Math.abs(f);
        if (abs > f3) {
            f = (f / abs) * f3;
        }
        if (A09()) {
            this.A0E = true;
            A07(this);
            2cs r4 = this.A0R;
            r4.A04();
            r4.A07(-((double) f));
            return true;
        }
        A02(this.A00, f);
        return true;
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        int i3;
        0qQ.A0B(iArr, 3);
        int i4 = 0;
        if (A09()) {
            if (this.A04 != 0) {
                i = i2;
            }
            i3 = A00(i, true);
            if (i3 > 0) {
                requestDisallowInterceptTouchEvent(true);
            }
        } else {
            i3 = 0;
        }
        boolean z = false;
        int i5 = 0;
        if (this.A04 == 0) {
            z = true;
            i5 = i3;
        }
        iArr[0] = i5;
        if (!z) {
            i4 = i3;
        }
        iArr[1] = i4;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        0qQ.A0B(parcelable, 0);
        super.onRestoreInstanceState(parcelable);
        C252553pI r1 = this.A0P.A0D;
        if (r1 != null) {
            r1.A1P(((SavedState) parcelable).A00);
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        this.A0E = false;
        A07(this);
        this.A0R.A01();
        this.A0N = true;
        setItemAnimationsEnabled(false);
        return true;
    }

    public final void onStopNestedScroll(View view) {
        0qQ.A0B(view, 0);
        this.A0V.A01 = 0;
        this.A0N = false;
        if (this.A01 < 1.0f || this.A09 == null || this.A07 == null || this.A0P.getChildCount() <= 0) {
            A04(this);
        } else if (!this.A0D) {
            this.A05 = System.currentTimeMillis();
            setItemAnimationsEnabled(false);
            this.A0D = true;
            X1N x1n = this.A09;
            if (x1n != null) {
                UZ2 uz2 = ((WTZ) x1n).A00;
                uz2.A06.A09 = true;
                uz2.A05.A00(uz2, uz2);
            }
            C323716xz r0 = this.A07;
            if (r0 != null) {
                r0.A02(true);
            }
            this.A0R.A06((double) getOverScrollRestTarget());
            A01();
        }
        this.A0R.A06((double) getOverScrollRestTarget());
        A01();
    }

    private final int A00(int i, boolean z) {
        float f;
        if (this.A08 != null) {
            f = 0.5f;
        } else if (this.A01 <= 0.0f || this.A09 == null || this.A07 == null || this.A0P.getChildCount() <= 0) {
            f = 0.1f;
        } else {
            f = 0mi.A02(this.A01, 0.25f, 1.0f, 1.0f, 0.1f);
        }
        float min = Math.min(f, 1.0f);
        2cs r5 = this.A0R;
        float f2 = (float) r5.A09.A00;
        boolean z2 = true;
        if (f2 != 0.0f && f2 / ((float) i) >= 0.0f) {
            z2 = false;
        }
        float f3 = (float) i;
        if (z2) {
            f3 *= min;
        }
        if (!z || (!this.A0C && (z2 || Math.abs(f2) > ((float) Math.abs(i))))) {
            JTP.A1K(r5, f2 - f3);
            return i;
        }
        r5.A08(0.0d, true);
        this.A0C = false;
        return Math.round(f2);
    }

    private final void A01() {
        float f;
        float translationY;
        if (!(this.A09 == null || this.A07 == null)) {
            RecyclerView recyclerView = this.A0P;
            if (recyclerView.getChildCount() > 0) {
                if (this.A0N || this.A02 > 0.0f) {
                    float f2 = (float) this.A03;
                    C323716xz r4 = this.A07;
                    if (r4 != null) {
                        boolean A1Q = AnonymousClass7TF.A1Q(this.A04);
                        ImageView imageView = this.A0O;
                        if (A1Q) {
                            int width = imageView.getWidth();
                            int i = r4.A02;
                            if (width != i) {
                                JTQ.A0w(imageView, i, -1);
                                width = r4.A02;
                            }
                            f = -((float) width);
                            translationY = recyclerView.getTranslationX() + f;
                            imageView.setTranslationX(((float) this.A03) + translationY);
                        } else {
                            int height = imageView.getHeight();
                            int i2 = r4.A01;
                            if (height != i2) {
                                JTQ.A0w(imageView, -1, i2);
                                height = r4.A01;
                            }
                            f = -((float) height);
                            translationY = recyclerView.getTranslationY() + f;
                            imageView.setTranslationY(((float) this.A03) + translationY);
                        }
                        float f3 = f2 - f;
                        float f4 = 1.0f - 0.0f;
                        float f5 = 0.0f;
                        if (f3 != 0.0f) {
                            f5 = (translationY - f) / f3;
                        }
                        float f6 = (f5 * f4) + 0.0f;
                        this.A02 = 0mi.A00(f6, 0.0f, 1.0f);
                        this.A01 = f6;
                        int i3 = 4;
                        if (f6 > 0.0f) {
                            i3 = 0;
                        }
                        imageView.setVisibility(i3);
                        r4.A01(this.A02);
                        return;
                    }
                    throw AnonymousClass7TE.A0y();
                }
                return;
            }
        }
        this.A0O.setVisibility(8);
    }

    private final void A02(float f, float f2) {
        Scroller scroller = this.A06;
        if (scroller != null) {
            scroller.fling(0, Math.round(f), 0, Math.round(-f2), 0, 0, -2147483647, Integer.MAX_VALUE);
            Runnable runnable = this.A0K;
            if (runnable == null) {
                runnable = new C20199Wmx(scroller, this);
                this.A0K = runnable;
            }
            postOnAnimation(runnable);
            return;
        }
        2cs r4 = this.A0Q;
        JTP.A1K(r4, f);
        r4.A07(-((double) f2));
    }

    private final void A03(int i, int i2) {
        Method method = this.A0B;
        Object obj = this.A0A;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, new Object[]{this.A0P, Integer.valueOf(i), Integer.valueOf(i2)});
            } catch (Exception e) {
                A08(this, e, AnonymousClass05K.A01);
            }
        }
    }

    public static final void A04(RefreshableRecyclerViewLayout refreshableRecyclerViewLayout) {
        if (refreshableRecyclerViewLayout.A0D) {
            long currentTimeMillis = System.currentTimeMillis() - refreshableRecyclerViewLayout.A05;
            long j = refreshableRecyclerViewLayout.A0H;
            if (currentTimeMillis < j) {
                Handler handler = refreshableRecyclerViewLayout.A0U;
                Runnable runnable = refreshableRecyclerViewLayout.A0X;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, j - currentTimeMillis);
                return;
            }
            refreshableRecyclerViewLayout.A0D = false;
            C323716xz r0 = refreshableRecyclerViewLayout.A07;
            if (r0 != null) {
                r0.A02(false);
            }
            refreshableRecyclerViewLayout.setItemAnimationsEnabled(true);
            refreshableRecyclerViewLayout.A0R.A06((double) refreshableRecyclerViewLayout.getOverScrollRestTarget());
            refreshableRecyclerViewLayout.A01();
        }
    }

    public static final void A05(RefreshableRecyclerViewLayout refreshableRecyclerViewLayout) {
        C16504Uw0 uw0;
        boolean A0C2;
        boolean z = false;
        if (refreshableRecyclerViewLayout.A0N) {
            uw0 = C16504Uw0.DRAGGING;
        } else {
            if (refreshableRecyclerViewLayout.A0R.A0C()) {
                Scroller scroller = refreshableRecyclerViewLayout.A06;
                if (scroller != null) {
                    A0C2 = scroller.isFinished();
                } else {
                    A0C2 = refreshableRecyclerViewLayout.A0Q.A0C();
                }
                if (A0C2) {
                    refreshableRecyclerViewLayout.setScrollState(C16504Uw0.IDLE);
                    z = true;
                    refreshableRecyclerViewLayout.setItemAnimationsEnabled(z);
                }
            }
            uw0 = C16504Uw0.COASTING;
        }
        refreshableRecyclerViewLayout.setScrollState(uw0);
        refreshableRecyclerViewLayout.setItemAnimationsEnabled(z);
    }

    public static final void A07(RefreshableRecyclerViewLayout refreshableRecyclerViewLayout) {
        Scroller scroller = refreshableRecyclerViewLayout.A06;
        if (scroller != null) {
            scroller.setFinalY(scroller.getCurrY());
            scroller.abortAnimation();
            scroller.forceFinished(true);
            return;
        }
        refreshableRecyclerViewLayout.A0Q.A01();
    }

    public static final void A08(RefreshableRecyclerViewLayout refreshableRecyclerViewLayout, Exception exc, Integer num) {
        String str;
        if (num == AnonymousClass05K.A01 && A0Z) {
            return;
        }
        if (num != AnonymousClass05K.A00 || !A0a) {
            StringBuilder sb = new StringBuilder();
            int intValue = num.intValue();
            if (intValue != 0) {
                str = AnonymousClass000.A00(2312);
            } else {
                str = "REFLECTION";
            }
            C66580MXl.A1V("GapWorker access failure: ", str, sb);
            sb.append("\n");
            try {
                Object obj = refreshableRecyclerViewLayout.A0A;
                if (obj != null) {
                    0sC A002 = 0pe.A00(obj.getClass().getDeclaredMethods());
                    while (A002.hasNext()) {
                        Pxf.A1O(sb, (Method) A002.next());
                        sb.append("\n");
                    }
                } else {
                    sb.append("mGapWorker is null");
                    sb.append("\n");
                }
            } catch (Exception unused) {
            }
            0KC.A0F("RefreshableRecyclerViewLayout", sb.toString(), exc);
            0wb.A06("RefreshableRecyclerView#GapWorkerAccessFailed", DbT.A10(sb), exc);
            if (intValue != 1) {
                A0a = true;
            } else {
                A0Z = true;
            }
        }
    }

    private final boolean A09() {
        Integer num;
        int i;
        boolean z;
        RecyclerView recyclerView = this.A0P;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.A0D;
        Integer num2 = null;
        if (linearLayoutManager != null) {
            num = Integer.valueOf(linearLayoutManager.A1a());
            num2 = Integer.valueOf(linearLayoutManager.A1b());
        } else {
            num = null;
        }
        2Rw r0 = recyclerView.A0A;
        if (r0 != null) {
            i = r0.getItemCount();
        } else {
            i = 0;
        }
        int i2 = i - 1;
        if ((num == null || num.intValue() != 0) && (num2 == null || num2.intValue() != i2)) {
            z = false;
        } else {
            z = true;
        }
        if (this.A0R.A0E(0.0d) || recyclerView.getScrollState() == 0 || !z) {
            return false;
        }
        return true;
    }

    private final float getCoastingValue() {
        Scroller scroller = this.A06;
        if (scroller != null) {
            return (float) scroller.getCurrY();
        }
        return (float) this.A0Q.A09.A00;
    }

    private final float getCoastingVelocity() {
        Scroller scroller = this.A06;
        if (scroller == null) {
            return (float) this.A0Q.A09.A01;
        }
        int i = 1;
        if (scroller.getStartY() > scroller.getFinalY()) {
            i = -1;
        }
        return scroller.getCurrVelocity() * ((float) i);
    }

    private final float getOverScrollRestTarget() {
        if (this.A0D) {
            return getRefreshingScrollPosition();
        }
        return 0.0f;
    }

    private final float getRefreshingScrollPosition() {
        int height;
        boolean A1Q = AnonymousClass7TF.A1Q(this.A04);
        ImageView imageView = this.A0O;
        if (A1Q) {
            height = imageView.getWidth();
        } else {
            height = imageView.getHeight();
        }
        return (float) (height + this.A03);
    }

    private final void setItemAnimationsEnabled(boolean z) {
        AnonymousClass3AS r0;
        RecyclerView recyclerView = this.A0P;
        AnonymousClass3AS r02 = recyclerView.A0C;
        if (r02 != null) {
            this.A0I = r02;
        }
        if (z) {
            r0 = this.A0I;
        } else {
            r0 = null;
        }
        recyclerView.setItemAnimator(r0);
    }

    private final void setScrollState(C16504Uw0 uw0) {
        if (uw0 != this.A0J) {
            System.currentTimeMillis();
            this.A0J = uw0;
            List list = this.A0T;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((AnonymousClass34S) list.get(i)).A01 != null) {
                    AnonymousClass0fD.A0A(2131744890, AnonymousClass0fD.A03(373499187));
                }
            }
        }
    }

    public final long getMinRefreshAnimationDuration() {
        return this.A0H;
    }

    public int getNestedScrollAxes() {
        AnonymousClass03P r0 = this.A0V;
        return r0.A01 | r0.A00;
    }

    public final RecyclerView getRecyclerView() {
        return this.A0P;
    }

    public final C16504Uw0 getScrollState() {
        return this.A0J;
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        if (this.A04 != 0) {
            i3 = i4;
        }
        A00(i3, false);
    }

    public final void setAdapter(2Rw r4) {
        RecyclerView recyclerView = this.A0P;
        2Rw r1 = recyclerView.A0A;
        if (r1 != null) {
            r1.unregisterAdapterDataObserver(this.A0W);
        }
        recyclerView.setAdapter(r4);
        if (r4 != null) {
            r4.registerAdapterDataObserver(this.A0W);
        }
    }

    public final void setItemAnimator(AnonymousClass3AS r2) {
        this.A0P.setItemAnimator(r2);
    }

    public final void setLayoutManager(C252553pI r3) {
        if (r3 instanceof LinearLayoutManager) {
            this.A04 = ((LinearLayoutManager) r3).A01;
            this.A0P.setLayoutManager(r3);
            return;
        }
        throw new IllegalArgumentException("layoutManager must be an instanceof LinearLayoutManager");
    }

    public final void setMinRefreshAnimationDuration(long j) {
        this.A0H = j;
    }

    public final void setOverScrollDelegate(X1M x1m) {
        this.A08 = x1m;
    }

    public final void setRefreshDelegate(X1N x1n) {
        this.A09 = x1n;
    }

    public static final void A06(RefreshableRecyclerViewLayout refreshableRecyclerViewLayout) {
        boolean A0C2;
        float coastingValue = refreshableRecyclerViewLayout.getCoastingValue();
        int round = Math.round(refreshableRecyclerViewLayout.A00 - coastingValue);
        if (AnonymousClass7TF.A1Q(refreshableRecyclerViewLayout.A04)) {
            RecyclerView recyclerView = refreshableRecyclerViewLayout.A0P;
            if (recyclerView.canScrollHorizontally(round)) {
                recyclerView.scrollBy(round, 0);
                refreshableRecyclerViewLayout.A03(round, 0);
                refreshableRecyclerViewLayout.A00 = coastingValue;
            }
        }
        if (refreshableRecyclerViewLayout.A04 != 0) {
            RecyclerView recyclerView2 = refreshableRecyclerViewLayout.A0P;
            if (recyclerView2.canScrollVertically(round)) {
                recyclerView2.scrollBy(0, round);
                refreshableRecyclerViewLayout.A03(0, round);
                refreshableRecyclerViewLayout.A00 = coastingValue;
            }
        }
        Scroller scroller = refreshableRecyclerViewLayout.A06;
        if (scroller != null) {
            A0C2 = scroller.isFinished();
        } else {
            A0C2 = refreshableRecyclerViewLayout.A0Q.A0C();
        }
        if (!A0C2) {
            float coastingVelocity = refreshableRecyclerViewLayout.getCoastingVelocity();
            A07(refreshableRecyclerViewLayout);
            2cs r2 = refreshableRecyclerViewLayout.A0R;
            r2.A07((double) coastingVelocity);
            r2.A06((double) refreshableRecyclerViewLayout.getOverScrollRestTarget());
        }
        refreshableRecyclerViewLayout.A00 = coastingValue;
    }

    public final void A0A() {
        A04(this);
        C323716xz r1 = this.A07;
        if (r1 != null) {
            r1.A04 = false;
            r1.A03 = true;
            r1.invalidateSelf();
        }
        this.A0R.A06((double) getOverScrollRestTarget());
        setItemAnimationsEnabled(true);
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(1046087597);
        super.onAttachedToWindow();
        post(new C19993WjE(this));
        AnonymousClass0fD.A0D(1216161592, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-620280144);
        super.onDetachedFromWindow();
        this.A0Q.A01();
        this.A0R.A01();
        AnonymousClass0fD.A0D(1229215183, A062);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A01();
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        AnonymousClass7TG.A1N(view, view2);
        this.A0V.A01 = i;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$BaseSavedState, com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout$SavedState, android.os.Parcelable] */
    public final Parcelable onSaveInstanceState() {
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        C252553pI r0 = this.A0P.A0D;
        if (r0 != null) {
            baseSavedState.A00 = r0.A1M();
        }
        return baseSavedState;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setClipChildren(boolean z) {
        super.setClipChildren(z);
        this.A0L = z;
        RecyclerView recyclerView = this.A0P;
        if (recyclerView != null) {
            recyclerView.setClipChildren(z);
        }
    }

    public void setClipToPadding(boolean z) {
        super.setClipToPadding(z);
        this.A0M = z;
        RecyclerView recyclerView = this.A0P;
        if (recyclerView != null) {
            recyclerView.setClipToPadding(z);
        }
    }

    public final void Cuk(2cp r1) {
        A05(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RefreshableRecyclerViewLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RefreshableRecyclerViewLayout(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ RefreshableRecyclerViewLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}
