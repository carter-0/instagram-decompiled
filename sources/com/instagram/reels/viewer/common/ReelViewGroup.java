package com.instagram.reels.viewer.common;

import X.002;
import X.01V;
import X.0Tu;
import X.0eO;
import X.0nA;
import X.0qQ;
import X.0sr;
import X.0tS;
import X.182;
import X.2Y9;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass1GB;
import X.AnonymousClass6YD;
import X.AnonymousClass6YE;
import X.AnonymousClass6YR;
import X.AnonymousClass6YS;
import X.AnonymousClass9M1;
import X.C255783ui;
import X.C306746Ni;
import X.C315696kN;
import X.C315706kO;
import X.C315716kP;
import X.C316216lI;
import X.C317146mn;
import X.C317516nO;
import X.C63040xi;
import X.GYE;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ReelViewGroup extends FrameLayout implements C315696kN {
    public AnonymousClass6YS A00;
    public float A01;
    public UserSession A02;
    public IgProgressImageView A03;
    public final Paint A04;
    public final Paint A05;
    public final C317516nO A06;
    public final List A07;
    public final Paint A08;
    public final Paint A09;
    public final Rect A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReelViewGroup(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void dispatchDraw(Canvas canvas) {
        int width;
        boolean z;
        0qQ.A0B(canvas, 0);
        super.dispatchDraw(canvas);
        if (A04()) {
            if (2Y9.A00) {
                IgProgressImageView igProgressImageView = this.A03;
                if (igProgressImageView != null) {
                    width = igProgressImageView.getWidth();
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                width = getWidth();
            }
            if (A05()) {
                A03(canvas, new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER), width);
                if (A07() || A06()) {
                    List list = this.A07;
                    ArrayList<C255783ui> arrayList = new ArrayList<>();
                    for (Object next : list) {
                        int ordinal = ((C255783ui) next).A11.ordinal();
                        if (ordinal == 21) {
                            z = A07();
                        } else if (ordinal == 23 || ordinal == 24) {
                            z = A06();
                        }
                        if (z) {
                            arrayList.add(next);
                        }
                    }
                    for (C255783ui A022 : arrayList) {
                        A02(canvas, this.A04, A022, width);
                    }
                }
                A03(canvas, new PorterDuffXfermode(PorterDuff.Mode.DARKEN), width);
                return;
            }
            C63040xi r1 = 0tS.A4E;
            Context context = getContext();
            0qQ.A07(context);
            0tS A012 = r1.A01(context);
            if (((Boolean) A012.A2w.CDM(A012, 0tS.A4G[3])).booleanValue()) {
                for (C255783ui A023 : this.A07) {
                    A02(canvas, this.A05, A023, width);
                }
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        return getSwipeController().A00.onTouchEvent(motionEvent);
    }

    public final void setUserSession(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        this.A02 = userSession;
        if (A04()) {
            invalidate();
        }
    }

    private final void A03(Canvas canvas, PorterDuffXfermode porterDuffXfermode, int i) {
        C63040xi r1 = 0tS.A4E;
        Context context = getContext();
        0qQ.A07(context);
        0tS A012 = r1.A01(context);
        if (((Boolean) A012.A2I.CDM(A012, 0tS.A4G[41])).booleanValue()) {
            Paint paint = this.A08;
            paint.setXfermode(porterDuffXfermode);
            UserSession userSession = this.A02;
            Rect rect = this.A0A;
            Paint paint2 = this.A09;
            int containerHeight = getContainerHeight();
            int horizontalMarginWidth = getHorizontalMarginWidth();
            0qQ.A0B(rect, 2);
            0qQ.A0B(paint2, 4);
            if (userSession != null) {
                Canvas canvas2 = canvas;
                canvas2.save();
                int i2 = 0;
                0Tu r3 = 0Tu.A06;
                float A002 = (float) 182.A00(r3, userSession, 37167968375079373L);
                if (A002 < 0.0f) {
                    A002 = 0.0f;
                } else if (A002 > 1.0f) {
                    A002 = 1.0f;
                }
                float A003 = (float) 182.A00(r3, userSession, 37167968375013836L);
                if (A003 < 0.0f) {
                    A003 = 0.0f;
                } else if (A003 > 1.0f) {
                    A003 = 1.0f;
                }
                float A004 = (float) 182.A00(r3, userSession, 37167968374948299L);
                if (A004 < 0.0f) {
                    A004 = 0.0f;
                } else if (A004 > 1.0f) {
                    A004 = 1.0f;
                }
                float A005 = (float) 182.A00(r3, userSession, 37167968374882762L);
                if (A005 < 0.0f) {
                    A005 = 0.0f;
                } else if (A005 > 1.0f) {
                    A005 = 1.0f;
                }
                float f = (float) i;
                int A013 = AnonymousClass1GB.A01(A002 * f);
                float f2 = (float) containerHeight;
                int A014 = AnonymousClass1GB.A01(A003 * f2);
                rect.set(0, 0, AnonymousClass1GB.A01(f * A004), AnonymousClass1GB.A01(f2 * A005));
                rect.offset(A013 + horizontalMarginWidth, A014);
                canvas2.drawRect(rect, paint);
                for (Object next : 0sr.A1P(new String[]{002.A0N(" h = ", A005), 002.A0N(" w = ", A004), 002.A0N(" y = ", A003), 002.A0N(" x = ", A002), " TAA"})) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        0sr.A1T();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    canvas2.drawText((String) next, (float) rect.left, ((float) rect.bottom) - (((float) i3) * paint2.getTextSize()), paint2);
                    i2 = i3;
                }
                canvas2.restore();
            }
        }
    }

    private final boolean A04() {
        C63040xi r1 = 0tS.A4E;
        Context context = getContext();
        0qQ.A07(context);
        0tS A012 = r1.A01(context);
        if (((Boolean) A012.A2w.CDM(A012, 0tS.A4G[3])).booleanValue() || A05()) {
            return true;
        }
        return false;
    }

    private final boolean A05() {
        C63040xi r1 = 0tS.A4E;
        Context context = getContext();
        0qQ.A07(context);
        0tS A012 = r1.A01(context);
        if (((Boolean) A012.A2I.CDM(A012, 0tS.A4G[41])).booleanValue() || A07() || A06()) {
            return true;
        }
        return false;
    }

    private final boolean A06() {
        C63040xi r1 = 0tS.A4E;
        Context context = getContext();
        0qQ.A07(context);
        0tS A012 = r1.A01(context);
        return ((Boolean) A012.A2G.CDM(A012, 0tS.A4G[43])).booleanValue();
    }

    private final boolean A07() {
        C63040xi r1 = 0tS.A4E;
        Context context = getContext();
        0qQ.A07(context);
        0tS A012 = r1.A01(context);
        return ((Boolean) A012.A2H.CDM(A012, 0tS.A4G[42])).booleanValue();
    }

    private final int getContainerHeight() {
        IgProgressImageView igProgressImageView = this.A03;
        if (igProgressImageView != null) {
            return igProgressImageView.getHeight();
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public final AnonymousClass6YR getOrchestratorListener() {
        return (AnonymousClass6YR) this.A0B.getValue();
    }

    /* access modifiers changed from: private */
    public final GYE getSwipeController() {
        return (GYE) this.A0C.getValue();
    }

    private final GestureDetector getTapDetector() {
        return (GestureDetector) this.A0D.getValue();
    }

    public final void A08(List list, float f) {
        this.A01 = f;
        List list2 = this.A07;
        list2.clear();
        if (list != null) {
            list2.addAll(list);
        }
        01V.A1D(list2, new AnonymousClass6YE(AnonymousClass6YD.A00));
        if (A04()) {
            invalidate();
        }
    }

    private final void A02(Canvas canvas, Paint paint, C255783ui r12, int i) {
        int containerHeight = getContainerHeight();
        float f = this.A01;
        Rect rect = this.A0A;
        C306746Ni.A02(rect, r12, f, i, containerHeight, getHorizontalMarginWidth());
        canvas.save();
        canvas.rotate(r12.A01 * 360.0f, (float) rect.centerX(), (float) rect.centerY());
        canvas.drawRect(rect, paint);
        canvas.restore();
    }

    private final int getHorizontalMarginWidth() {
        Context context = getContext();
        0qQ.A07(context);
        if (C316216lI.A0C(context)) {
            return C316216lI.A01(context);
        }
        return 0;
    }

    public final void A92(C317146mn r2) {
        getOrchestratorListener().A00.add(r2);
    }

    public final void onFinishInflate() {
        int A062 = AnonymousClass0fD.A06(-1786698181);
        super.onFinishInflate();
        this.A03 = (IgProgressImageView) findViewById(R.id.reel_viewer_image_view);
        AnonymousClass0fD.A0D(797628635, A062);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0fD.A05(-758948095);
        0qQ.A0B(motionEvent, 0);
        boolean onTouchEvent = getTapDetector().onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            AnonymousClass6YS r5 = this.A00;
            if (r5 != null) {
                MotionEvent motionEvent2 = r5.A00;
                if (motionEvent2 != null) {
                    long eventTime = motionEvent.getEventTime() - motionEvent2.getEventTime();
                    float rawX = motionEvent2.getRawX() - motionEvent.getRawX();
                    float rawY = motionEvent2.getRawY() - motionEvent.getRawY();
                    Context context = r5.A01;
                    float A012 = 0nA.A01(context, rawX);
                    float A013 = 0nA.A01(context, rawY);
                    if (rawY >= 0.0f && A013 >= ((float) ((Number) r5.A05.getValue()).longValue())) {
                        float f = (float) eventTime;
                        float abs = Math.abs((A012 / f) * 100.0f);
                        float abs2 = Math.abs((A013 / f) * 100.0f);
                        if (abs <= abs2 && ((double) abs2) >= ((Number) r5.A06.getValue()).doubleValue()) {
                            double abs3 = Math.abs(90.0d - Math.toDegrees(Math.atan2((double) rawY, (double) rawX)));
                            AnonymousClass0eM r1 = r5.A04;
                            if (((Number) r1.getValue()).intValue() <= 0 || abs3 <= ((double) ((Number) r1.getValue()).intValue())) {
                                r5.A03.Dq1(motionEvent2, motionEvent, 0.0f, 0.0f);
                            }
                        }
                    }
                }
                MotionEvent motionEvent3 = r5.A00;
                if (motionEvent3 != null) {
                    motionEvent3.recycle();
                    r5.A00 = null;
                }
            }
            getOrchestratorListener().DvB(onTouchEvent);
        }
        AnonymousClass0fD.A0C(1255483052, A052);
        return onTouchEvent;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReelViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A06 = new C315706kO(this);
        this.A07 = new ArrayList();
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(Color.argb(150, 0, 0, 0));
        this.A05 = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setColor(Color.argb(150, 25, 184, 223));
        this.A08 = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        paint3.setColor(Color.argb(150, 231, 226, 45));
        this.A04 = paint3;
        Paint paint4 = new Paint();
        paint4.setStyle(style);
        paint4.setColor(Color.argb(255, 255, 255, 255));
        paint4.setTextSize(TypedValue.applyDimension(2, 9.0f, context.getResources().getDisplayMetrics()));
        paint4.setTypeface(Typeface.MONOSPACE);
        paint4.setTextAlign(Paint.Align.LEFT);
        paint4.setFakeBoldText(true);
        this.A09 = paint4;
        this.A0A = new Rect();
        0eO r2 = 0eO.A02;
        this.A0C = AnonymousClass0eN.A00(r2, new AnonymousClass9M1(19, context, this));
        this.A0B = AnonymousClass0eN.A00(r2, C315716kP.A00);
        this.A0D = AnonymousClass0eN.A00(r2, new AnonymousClass9M1(20, context, this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReelViewGroup(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReelViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
