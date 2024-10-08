package com.instagram.video.live.mvvm.view.likes.customviews;

import X.0l2;
import X.0mk;
import X.0qQ;
import X.2Yu;
import X.AnonymousClass0fD;
import X.AnonymousClass1MK;
import X.AnonymousClass37Q;
import X.C13988Tno;
import X.C14045Tom;
import X.C17122VIs;
import X.C17687VcI;
import X.C240563Lj;
import X.C306386Ly;
import X.C66580MXl;
import X.DbV;
import X.JTO;
import X.JTR;
import X.JTT;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.webrtc.CameraVideoCapturer;

public final class ProfilePictureLikesView extends View {
    public AnonymousClass1MK A00;
    public boolean A01;
    public int A02;
    public long A03;
    public long A04;
    public 0l2 A05;
    public final Bitmap A06;
    public final List A07;
    public final List A08;
    public final List A09;
    public final Map A0A;
    public final Paint A0B;
    public final RectF A0C;
    public final ArrayList A0D;
    public final List A0E;
    public final List A0F;
    public final boolean A0G;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ProfilePictureLikesView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        0qQ.A0B(context, 1);
    }

    public final void onDraw(Canvas canvas) {
        int A042;
        float f;
        float width;
        Canvas canvas2;
        C17687VcI vcI;
        ProfilePictureLikesView profilePictureLikesView;
        float width2;
        Canvas canvas3 = canvas;
        0qQ.A0B(canvas3, 0);
        int height = canvas3.getHeight();
        boolean z = false;
        for (C17687VcI vcI2 : this.A09) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - vcI2.A05;
            if (1 <= elapsedRealtime && elapsedRealtime < 4000) {
                float f2 = ((float) elapsedRealtime) / 4000.0f;
                Bitmap bitmap = this.A06;
                float height2 = ((float) (height - (bitmap.getHeight() / 2))) - (((float) height) * f2);
                C17687VcI vcI3 = vcI2;
                A04(canvas3, vcI3, A00(vcI2, f2), height2, (float) (bitmap.getWidth() / 2), C17122VIs.A00(f2, vcI2.A00 + 0.05f));
                z = true;
            }
        }
        for (C17687VcI vcI4 : this.A08) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - vcI4.A05;
            if (1 <= elapsedRealtime2 && elapsedRealtime2 < 4000) {
                float f3 = ((float) elapsedRealtime2) / 4000.0f;
                Bitmap bitmap2 = this.A06;
                float height3 = ((float) (height - (bitmap2.getHeight() / 2))) - (((float) height) * f3);
                Canvas canvas4 = canvas3;
                C17687VcI vcI5 = vcI4;
                A04(canvas4, vcI5, A00(vcI4, f3), height3, (float) (bitmap2.getWidth() / 2), C17122VIs.A00(f3, vcI4.A00 + 0.05f));
                z = true;
            }
        }
        for (C17687VcI vcI6 : this.A07) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime() - vcI6.A05;
            if (1 <= elapsedRealtime3 && elapsedRealtime3 < 4000) {
                float f4 = ((float) elapsedRealtime3) / 4000.0f;
                Bitmap bitmap3 = this.A06;
                float height4 = ((float) (height - (bitmap3.getHeight() / 2))) - (((float) height) * f4);
                float A002 = A00(vcI6, f4);
                float f5 = vcI6.A00;
                float f6 = 0.05f + f5;
                int A003 = C17122VIs.A00(f4, f6);
                if (f4 < 0.07f) {
                    width2 = ((float) bitmap3.getWidth()) / 2.0f;
                } else if (f4 < f5) {
                    width2 = ((float) bitmap3.getWidth()) / 2.0f;
                    A003 = 255;
                } else {
                    if (f4 < f6) {
                        float A043 = (float) AnonymousClass37Q.A04((double) f4, (double) f5, (double) f6, 0.0d, 1.0d);
                        f = height4;
                        canvas2 = canvas3;
                        vcI = vcI6;
                        profilePictureLikesView = this;
                        profilePictureLikesView.A03(canvas2, vcI, A002, f, (float) ((int) (((1.0f + (A043 / 2.0f)) * ((float) bitmap3.getWidth())) / 2.0f)), (int) ((1.0f - A043) * 255.0f));
                        A003 = 255;
                        width = (float) ((int) ((A043 * ((float) bitmap3.getWidth())) / 2.0f));
                    } else {
                        f = height4;
                        width = (float) (bitmap3.getWidth() / 2);
                        canvas2 = canvas3;
                        vcI = vcI6;
                        profilePictureLikesView = this;
                    }
                    profilePictureLikesView.A04(canvas2, vcI, A002, f, width, A003);
                    z = true;
                }
                A03(canvas3, vcI6, A002, height4, width2, A003);
                z = true;
            }
        }
        for (C17687VcI vcI7 : this.A0F) {
            long elapsedRealtime4 = SystemClock.elapsedRealtime() - vcI7.A05;
            if (elapsedRealtime4 > 0) {
                int i = vcI7.A01;
                if (elapsedRealtime4 < ((long) i)) {
                    float pow = (float) Math.pow((double) (3.0f * (((float) elapsedRealtime4) / ((float) i))), 0.6000000238418579d);
                    float f7 = (float) height;
                    Canvas canvas5 = canvas3;
                    C17687VcI vcI8 = vcI7;
                    A04(canvas5, vcI8, ((float) getHeartsColumnCenterX()) + (((float) (vcI7.A04 * vcI7.A02)) * pow), f7 - (pow * f7), 0.0f, C17122VIs.A00(pow, vcI7.A00 + 0.05f));
                    z = true;
                }
            }
        }
        for (C17687VcI vcI9 : this.A0E) {
            long elapsedRealtime5 = SystemClock.elapsedRealtime() - vcI9.A05;
            if (1 <= elapsedRealtime5 && elapsedRealtime5 < 4000) {
                float f8 = ((float) elapsedRealtime5) / 4000.0f;
                float f9 = (float) height;
                float f10 = f9 - (f8 * f9);
                float A004 = A00(vcI9, f8);
                if (f8 > 0.1f) {
                    A042 = 0;
                } else {
                    A042 = (int) AnonymousClass37Q.A04((double) f8, 0.0d, 0.10000000149011612d, 0.0d, 0.0d);
                }
                Canvas canvas6 = canvas3;
                C17687VcI vcI10 = vcI9;
                A04(canvas6, vcI10, A004, f10, (float) A042, C17122VIs.A00(f8, vcI9.A00 + 0.05f));
                z = true;
            }
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    private final C17687VcI A01(Bitmap bitmap, String str, long j, boolean z) {
        C17687VcI vcI = (C17687VcI) this.A05.A7A();
        if (vcI == null) {
            vcI = new C17687VcI();
        }
        Paint paint = new Paint();
        Spannable spannable = C306386Ly.A0d;
        C306386Ly r1 = new C306386Ly(getContext(), this.A06.getWidth());
        r1.A0M(str);
        r1.A0A(48.0f);
        Bitmap A002 = C14045Tom.A00(r1);
        Resources A0B2 = C66580MXl.A0B(this);
        vcI.A05 = j;
        double random = Math.random();
        int i = 1;
        if (random < 0.5d) {
            i = -1;
        }
        vcI.A04 = i;
        vcI.A00 = 0.1f;
        if (z) {
            vcI.A00 = 0.1f + (vcI.A09.nextFloat() * 0.3f);
        }
        vcI.A01 = CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
        int dimensionPixelSize = A0B2.getDimensionPixelSize(R.dimen.accent_edge_thickness);
        vcI.A03 = vcI.A09.nextInt(dimensionPixelSize * 2) - dimensionPixelSize;
        vcI.A02 = (int) (random * ((double) dimensionPixelSize));
        if (bitmap != null) {
            C240563Lj r2 = new C240563Lj(bitmap, false);
            vcI.A08 = r2;
            r2.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
        } else {
            vcI.A08 = null;
        }
        vcI.A06 = A002;
        vcI.A07 = paint;
        return vcI;
    }

    public static final void A02(Bitmap bitmap, ProfilePictureLikesView profilePictureLikesView, String str, boolean z) {
        List list;
        long max;
        long j;
        Bitmap bitmap2 = bitmap;
        ProfilePictureLikesView profilePictureLikesView2 = profilePictureLikesView;
        String str2 = str;
        if (bitmap2 != null) {
            list = profilePictureLikesView.A07;
            if (list.size() < 200) {
                long random = (long) (1.0d * (100.0d + (300.0d * Math.random())));
                if (z) {
                    j = SystemClock.elapsedRealtime();
                } else {
                    j = Math.max(SystemClock.elapsedRealtime(), profilePictureLikesView.A03 + random);
                }
                profilePictureLikesView2.A03 = j;
            } else {
                return;
            }
        } else {
            list = profilePictureLikesView.A08;
            if (list.size() < 200) {
                if (z) {
                    max = SystemClock.elapsedRealtime();
                } else {
                    max = Math.max(SystemClock.elapsedRealtime(), profilePictureLikesView.A04 + ((long) (1.0d * (100.0d + (300.0d * Math.random())))));
                    profilePictureLikesView2.A04 = max;
                }
                bitmap2 = null;
            } else {
                return;
            }
        }
        list.add(profilePictureLikesView2.A01(bitmap2, str2, j, z));
    }

    private final void A04(Canvas canvas, C17687VcI vcI, float f, float f2, float f3, int i) {
        RectF rectF = this.A0C;
        rectF.left = f - f3;
        rectF.right = f + f3;
        rectF.top = f2 - f3;
        rectF.bottom = f2 + f3;
        Paint paint = vcI.A07;
        if (paint != null) {
            paint.setAlpha(i);
        }
        Bitmap bitmap = vcI.A06;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (Rect) null, rectF, paint);
        }
    }

    private final int getHeartsColumnCenterX() {
        if (this.A0G) {
            return getLeft() + (this.A02 / 2);
        }
        return getRight() - (this.A02 / 2);
    }

    private final float A00(C17687VcI vcI, float f) {
        double sin = (double) ((float) ((Math.sin((((double) (vcI.A04 * 6)) * 3.141592653589793d) * ((double) f)) + 1.0d) / 2.0d));
        double d = (double) vcI.A02;
        return ((float) (getHeartsColumnCenterX() + vcI.A03)) + ((float) AnonymousClass37Q.A03(sin, -d, d));
    }

    private final void A03(Canvas canvas, C17687VcI vcI, float f, float f2, float f3, int i) {
        canvas.save();
        canvas.translate(f, f2);
        Paint paint = vcI.A07;
        if (paint != null) {
            this.A0B.setColorFilter(paint.getColorFilter());
        }
        Paint paint2 = this.A0B;
        paint2.setAlpha(i);
        canvas.drawCircle(0.0f, 0.0f, f3, paint2);
        Drawable drawable = vcI.A08;
        if (drawable != null) {
            float intrinsicWidth = (2.0f * f3) / ((float) drawable.getIntrinsicWidth());
            float f4 = -f3;
            canvas.translate(f4, f4);
            canvas.scale(intrinsicWidth, intrinsicWidth);
            drawable.setAlpha(i);
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    public static final void A05(ProfilePictureLikesView profilePictureLikesView, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17687VcI vcI = (C17687VcI) it.next();
            if (SystemClock.elapsedRealtime() - vcI.A05 > ((long) vcI.A01)) {
                it.remove();
                profilePictureLikesView.A05.ECR(vcI);
            }
        }
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(1360959763);
        super.onAttachedToWindow();
        this.A01 = true;
        AnonymousClass0fD.A0D(287862490, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-1871599809);
        super.onDetachedFromWindow();
        this.A01 = false;
        AnonymousClass0fD.A0D(-1546883154, A062);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfilePictureLikesView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        0qQ.A0B(context, 1);
        this.A05 = new 0l2(583);
        this.A09 = new ArrayList();
        this.A08 = new ArrayList();
        this.A07 = new ArrayList();
        this.A0F = new ArrayList();
        this.A0E = new ArrayList();
        Resources resources = getResources();
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, R.drawable.live_like);
        0qQ.A07(decodeResource);
        this.A06 = decodeResource;
        Paint paint = new Paint(1);
        this.A0B = paint;
        this.A0C = new RectF();
        this.A0G = 0mk.A02(context);
        ArrayList arrayList = new ArrayList();
        this.A0D = arrayList;
        this.A0A = new HashMap();
        JTO.A1N(paint);
        paint.setColorFilter(DbV.A06(context, R.color.fds_white_alpha90));
        C13988Tno.A0u(resources, paint, R.dimen.account_recs_header_image_margin);
        this.A02 = JTR.A04(context);
        int i3 = 0;
        int[] iArr = {2Yu.A0H(context, R.attr.igds_color_gradient_red), R.color.activator_card_progress_bad, 2Yu.A0H(context, R.attr.igds_color_gradient_yellow), R.color.igds_active_badge, 2Yu.A0H(context, R.attr.igds_color_gradient_blue), 2Yu.A0H(context, R.attr.igds_color_gradient_purple)};
        ArrayList arrayList2 = new ArrayList(6);
        do {
            int i4 = iArr[i3];
            Paint paint2 = new Paint(1);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColorFilter(new PorterDuffColorFilter(getContext().getColor(i4), PorterDuff.Mode.SRC_IN));
            arrayList2.add(paint2);
            i3++;
        } while (i3 < 6);
        arrayList.addAll(arrayList2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ProfilePictureLikesView(Context context) {
        this(context, (AttributeSet) null, 0, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProfilePictureLikesView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i3), JTT.A01(i3, i), (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ProfilePictureLikesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        0qQ.A0B(context, 1);
    }
}
