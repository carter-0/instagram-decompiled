package com.instagram.ui.widget.balloonsview;

import X.0qQ;
import X.0sn;
import X.1NK;
import X.1OO;
import X.AnonymousClass37Q;
import X.AnonymousClass7TE;
import X.C62490Kgf;
import X.C63883LAm;
import X.DbT;
import X.DbZ;
import X.JTT;
import X.Lf2;
import X.MT2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BalloonsView extends View {
    public static final Random A0C = new Random();
    public MT2 A00;
    public C62490Kgf A01;
    public boolean A02;
    public boolean A03;
    public float A04;
    public long A05;
    public final Paint A06;
    public final RectF A07;
    public final List A08;
    public final int A09;
    public final int A0A;
    public final ArrayList A0B;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BalloonsView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void setBalloonType(C62490Kgf kgf) {
        0qQ.A0B(kgf, 0);
        if (kgf != this.A01) {
            setupBalloons(kgf);
        }
        this.A01 = kgf;
    }

    public static final void A00(BalloonsView balloonsView) {
        if (!balloonsView.A03) {
            List list = balloonsView.A08;
            0qQ.A06(list);
            if (!list.isEmpty()) {
                balloonsView.A03 = true;
                balloonsView.postInvalidateOnAnimation();
                balloonsView.A05 = SystemClock.elapsedRealtime();
            }
        }
    }

    private final void setupBalloons(C62490Kgf kgf) {
        ArrayList arrayList = this.A0B;
        arrayList.clear();
        int ordinal = kgf.ordinal();
        int i = 12;
        if (ordinal == 0) {
            i = 24;
        } else if (!(ordinal == 1 || ordinal == 2)) {
            throw AnonymousClass7TE.A1K();
        }
        int i2 = 0;
        do {
            arrayList.add(new C63883LAm(kgf, this.A09));
            i2++;
        } while (i2 < i);
    }

    public final boolean getAnimateTopToBottom() {
        return this.A02;
    }

    public final MT2 getAnimationListener() {
        return this.A00;
    }

    public final C62490Kgf getBalloonType() {
        return this.A01;
    }

    public final void onDraw(Canvas canvas) {
        float f;
        int i;
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas2, 0);
        if (this.A03) {
            int height = canvas2.getHeight();
            this.A04 = (float) (getWidth() / 8);
            ArrayList arrayList = this.A0B;
            int size = arrayList.size();
            int i2 = 0;
            boolean z = false;
            while (i2 < size) {
                C63883LAm lAm = (C63883LAm) DbZ.A0g(arrayList, i2);
                if (lAm.A00 == null) {
                    List list = this.A08;
                    lAm.A00 = (Bitmap) list.get(A0C.nextInt(list.size()));
                }
                Bitmap bitmap = lAm.A00;
                Bitmap bitmap2 = bitmap;
                if (bitmap != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - this.A05;
                    if (elapsedRealtime >= 0) {
                        float f2 = (float) elapsedRealtime;
                        if (f2 < lAm.A03) {
                            float f3 = f2 / lAm.A03;
                            int height2 = bitmap2.getHeight() / 2;
                            if (this.A02) {
                                f = ((float) height2) + (((float) height) * f3 * 0.5f);
                            } else {
                                f = ((float) (height - height2)) - ((((float) height) * f3) * 0.5f);
                            }
                            float f4 = f + ((float) (lAm.A02 * ((double) this.A0A)));
                            float f5 = this.A04;
                            float f6 = ((float) (lAm.A01 * ((double) f5))) + (f5 * ((float) (i2 % 8))) + ((float) lAm.A07);
                            double d = (double) f3;
                            double d2 = (double) lAm.A06;
                            float A032 = f6 + ((float) AnonymousClass37Q.A03((double) ((float) ((Math.sin((((double) (lAm.A05 * 6.0f)) * 3.141592653589793d) * d) + 1.0d) / 2.0d)), -d2, d2));
                            float width = (float) (bitmap2.getWidth() / 2);
                            int i3 = (f3 > 0.9f ? 1 : (f3 == 0.9f ? 0 : -1));
                            float f7 = lAm.A04;
                            if (i3 > 0) {
                                f7 = (float) (((double) f7) * AnonymousClass37Q.A04(d, 0.8999999761581421d, 1.0d, 1.0d, 1.5d));
                            }
                            float f8 = width * f7;
                            if (f3 > 0.9f) {
                                i = (int) AnonymousClass37Q.A04(d, 0.8999999761581421d, 1.0d, 255.0d, 0.0d);
                            } else {
                                i = 255;
                            }
                            RectF rectF = this.A07;
                            rectF.left = A032 - f8;
                            rectF.right = A032 + f8;
                            rectF.top = f4 - f8;
                            rectF.bottom = f4 + f8;
                            Paint paint = this.A06;
                            paint.setAlpha(i);
                            canvas2.drawBitmap(bitmap2, (Rect) null, rectF, paint);
                            z = true;
                        }
                    }
                    i2++;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            if (z) {
                postInvalidateOnAnimation();
                return;
            }
            setupBalloons(this.A01);
            this.A08.clear();
            this.A03 = false;
            MT2 mt2 = this.A00;
            if (mt2 != null) {
                mt2.DbU();
            }
        }
    }

    public final void A01(ImageUrl imageUrl) {
        List<ImageUrl> A1I = AnonymousClass7TE.A1I(imageUrl);
        0sn r1 = 0sn.A00;
        0qQ.A0B(r1, 1);
        if (!this.A03) {
            List list = this.A08;
            int A012 = DbT.A01(A1I, list.size());
            if (A012 > 0) {
                Iterator it = r1.iterator();
                while (it.hasNext()) {
                    list.add(it.next());
                }
                if (AnonymousClass7TE.A1b(A1I)) {
                    for (ImageUrl A0J : A1I) {
                        1OO A0J2 = 1NK.A00().A0J(A0J, (String) null);
                        A0J2.A02(new Lf2(this, A012, 1));
                        A0J2.A01();
                    }
                    return;
                }
                A00(this);
            }
        }
    }

    public final void setAnimateTopToBottom(boolean z) {
        this.A02 = z;
    }

    public final void setAnimating(boolean z) {
        this.A03 = z;
    }

    public final void setAnimationListener(MT2 mt2) {
        this.A00 = mt2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BalloonsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A08 = Collections.synchronizedList(AnonymousClass7TE.A1C());
        this.A09 = context.getResources().getDimensionPixelSize(R.dimen.action_sheet_divider_margin_top);
        this.A0A = context.getResources().getDimensionPixelSize(R.dimen.achievements_list_container_height);
        this.A07 = AnonymousClass7TE.A0Y();
        this.A06 = AnonymousClass7TE.A0V(1);
        this.A0B = AnonymousClass7TE.A1C();
        C62490Kgf kgf = C62490Kgf.Emoji;
        this.A01 = kgf;
        setupBalloons(kgf);
    }

    public /* synthetic */ BalloonsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BalloonsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
