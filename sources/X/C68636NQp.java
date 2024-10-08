package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.NQp  reason: case insensitive filesystem */
public final class C68636NQp extends C268694dq {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04 = 3;
    public final int A05;
    public final int A06;
    public final Context A07;
    public final Paint A08;
    public final Path A09;
    public final UserSession A0A;
    public final C70558OBg A0B;
    public final Integer A0C;
    public final List A0D;
    public final List A0E;
    public final List A0F;
    public final C62320sa A0G;
    public final float[] A0H;
    public final int[] A0I;

    public /* synthetic */ C68636NQp(Context context, UserSession userSession, C70558OBg oBg, Integer num, List list) {
        List list2;
        List list3;
        float A002 = C69987NvR.A00(context);
        float A003 = C69987NvR.A00(context);
        C73763PjO pjO = C73763PjO.A00;
        0qQ.A0B(pjO, 11);
        this.A07 = context;
        this.A0A = userSession;
        this.A0B = oBg;
        this.A0C = num;
        this.A01 = A002;
        this.A03 = A003;
        this.A02 = 20.0f;
        this.A0G = pjO;
        HashSet A1F = AnonymousClass7TE.A1F();
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            C51971G9r.A1O(((C70557OBf) next).A00, next, A1F, A1C);
        }
        this.A0D = A1C;
        this.A0E = AnonymousClass7TE.A1C();
        this.A0F = AnonymousClass7TE.A1C();
        Context context2 = this.A07;
        0qQ.A0B(context2, 0);
        this.A06 = AnonymousClass7TF.A02(context2, R.dimen.account_discovery_bottom_gap);
        Context context3 = this.A07;
        0qQ.A0B(context3, 0);
        int A022 = AnonymousClass7TF.A02(context3, R.dimen.album_preview_add_item_margin);
        this.A05 = A022;
        this.A0H = new float[]{0.4f, 0.6f, 1.0f};
        this.A00 = ((float) A022) * 1.4f * (1.0f - (((float) (5 - A1C.size())) / 10.0f));
        this.A09 = C51965G9l.A0C();
        Context context4 = this.A07;
        0qQ.A0B(context4, 1);
        int A032 = AnonymousClass7TF.A03(context4, R.attr.igds_color_gradient_pink);
        Context context5 = this.A07;
        0qQ.A0B(context5, 1);
        int A033 = AnonymousClass7TF.A03(context5, R.attr.igds_color_gradient_red);
        Context context6 = this.A07;
        0qQ.A0B(context6, 1);
        this.A0I = new int[]{A032, A033, AnonymousClass7TF.A03(context6, R.attr.igds_color_gradient_yellow)};
        this.A08 = AnonymousClass7TE.A0V(3);
        List<C70557OBf> A0W = 00k.A0W(this.A0D);
        ArrayList A0r = AnonymousClass7TG.A0r(A0W);
        for (C70557OBf mrd : A0W) {
            A0r.add(new OF9(new C67650Mrd(this.A07, this.A0A, mrd, this.A0B, C73924Pm4.A01(this, 39)), this));
        }
        if (this.A0C == AnonymousClass05K.A00) {
            list2 = this.A0E;
            list3 = 00k.A0d(A0r, this.A04);
        } else {
            int size = A0r.size();
            list2 = this.A0E;
            list3 = A0r;
            if (size >= 4) {
                list2.addAll(00k.A0d(A0r, 2));
                list2 = this.A0F;
                list3 = 00k.A0h(A0r, Math.min(A0r.size(), this.A04) - 2);
            }
        }
        list2.addAll(list3);
        setBounds(new Rect(0, 0, getIntrinsicWidth(), getIntrinsicHeight()));
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        for (OF9 of9 : this.A0E) {
            canvas.save();
            float f = of9.A00;
            Drawable drawable = of9.A02;
            canvas.rotate(f, C66581MXm.A01(drawable), drawable.getBounds().exactCenterY());
            drawable.draw(canvas);
            canvas.restore();
        }
        for (OF9 of92 : this.A0F) {
            canvas.save();
            float f2 = of92.A00;
            Drawable drawable2 = of92.A02;
            canvas.rotate(f2, C66581MXm.A01(drawable2), drawable2.getBounds().exactCenterY());
            drawable2.draw(canvas);
            canvas.restore();
        }
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        A00(this.A0F, true);
        A00(this.A0E, false);
        float A002 = C61380mr.A00(this.A07, 5.0f);
        Path path = this.A09;
        path.reset();
        path.setFillType(Path.FillType.WINDING);
        float A012 = C66581MXm.A01(this);
        float exactCenterY = getBounds().exactCenterY();
        float f = this.A00;
        path.addCircle(A012, exactCenterY, f, Path.Direction.CW);
        Paint paint = this.A08;
        int[] iArr = this.A0I;
        paint.setShader(new LinearGradient(((float) getBounds().right) + A002, ((float) getBounds().top) + A002, ((float) getBounds().left) - A002, ((float) getBounds().bottom) - A002, iArr, this.A0H, Shader.TileMode.CLAMP));
        paint.setAlpha(7);
        paint.setShadowLayer(f - 4.0f, 0.0f, 0.0f, 03t.A00(iArr));
        float f2 = f - 2.0f;
        0qQ.A0B(iArr, 0);
        if (iArr.length == 0) {
            throw new NoSuchElementException(AnonymousClass000.A00(872));
        }
        paint.setShadowLayer(f2, 0.0f, 0.0f, iArr[0]);
    }

    private final void A00(List list, boolean z) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        Object valueOf;
        List list2 = list;
        if (!list2.isEmpty()) {
            boolean A1Q = AnonymousClass7TF.A1Q(list2.size() % 2);
            float A012 = C66581MXm.A01(this);
            int intrinsicWidth = ((OF9) 00k.A0I(list2)).A02.getIntrinsicWidth();
            int intrinsicHeight = ((OF9) 00k.A0I(list2)).A02.getIntrinsicHeight();
            int i2 = getBounds().top;
            if (z) {
                i = Float.valueOf(((float) intrinsicHeight) * (1.0f - this.A03));
            } else {
                i = 0;
            }
            int A0M = i2 + AnonymousClass7TE.A0M(i);
            if (A1Q) {
                f = ((float) intrinsicWidth) * (1.0f - this.A01);
            } else {
                f = (float) (intrinsicWidth / 2);
            }
            int i3 = (int) (A012 - f);
            int size = list2.size();
            OF9 of9 = (OF9) 00k.A0I(list2);
            int i4 = i3 + intrinsicWidth;
            of9.A02.setBounds(i3, A0M, i4, A0M + intrinsicHeight);
            if (A1Q) {
                f2 = -this.A02;
            } else {
                f2 = 0.0f;
            }
            of9.A00 = f2;
            int i5 = size - 1;
            of9.A01 = size;
            int size2 = list2.size();
            int i6 = 1;
            boolean z2 = true;
            while (i6 < size2) {
                if (z2) {
                    f3 = (float) i4;
                    f4 = (float) intrinsicWidth;
                    f5 = this.A01;
                } else {
                    f3 = (float) i3;
                    f4 = (float) intrinsicWidth;
                    f5 = 1.0f - this.A01;
                }
                int i7 = (int) (f3 - (f4 * f5));
                int i8 = 2;
                if (A1Q) {
                    i8 = 1;
                }
                if (i6 <= i8 || !this.A0F.isEmpty()) {
                    valueOf = Float.valueOf(0.0f);
                } else {
                    valueOf = Integer.valueOf(this.A06);
                }
                int A0M2 = A0M - AnonymousClass7TE.A0M(valueOf);
                if (z2) {
                    i4 = i7 + intrinsicWidth;
                } else {
                    i3 = i7;
                }
                OF9 of92 = (OF9) list2.get(i6);
                of92.A02.setBounds(i7, A0M2, i7 + intrinsicWidth, A0M2 + intrinsicHeight);
                float f6 = this.A02;
                int i9 = -1;
                if (z2) {
                    i9 = 1;
                }
                of92.A00 = f6 * ((float) i9);
                of92.A01 = i5;
                z2 = !z2;
                i6++;
                i5--;
            }
            if (list2.size() > 1) {
                C73429PcU.A01(20, list2);
            }
        }
    }

    public final List A07() {
        ArrayList A0S = 00k.A0S(this.A0F, this.A0E);
        ArrayList A0r = AnonymousClass7TG.A0r(A0S);
        Iterator it = A0S.iterator();
        while (it.hasNext()) {
            A0r.add(((OF9) it.next()).A02);
        }
        return 00k.A0U(A0r);
    }

    public final int getIntrinsicHeight() {
        int i = this.A05;
        int i2 = 0;
        if (!this.A0F.isEmpty()) {
            i2 = AnonymousClass1GB.A01(((float) i) * (1.0f - this.A03));
        } else {
            List list = this.A0E;
            int size = list.size() % 2;
            int size2 = list.size();
            if (size != 0 ? size2 > 2 : size2 > 1) {
                i2 = this.A06;
            }
        }
        return i + i2;
    }

    public final int getIntrinsicWidth() {
        float f;
        int i = this.A05;
        List list = this.A0F;
        if (list.isEmpty()) {
            list = this.A0E;
        }
        0qQ.A0B(list, 0);
        int A062 = C51966G9m.A06(list);
        if (list.size() % 2 == 0) {
            f = 0.0f;
        } else {
            f = this.A01;
        }
        return i + (A062 * AnonymousClass1GB.A01(1.0f - f) * i);
    }

    public final void setAlpha(int i) {
        for (OF9 of9 : this.A0E) {
            of9.A02.setAlpha(i);
        }
        for (OF9 of92 : this.A0F) {
            of92.A02.setAlpha(i);
        }
        invalidateSelf();
    }
}
