package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager;
import com.instagram.igds.components.imagebutton.IgImageButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* renamed from: X.UAk  reason: case insensitive filesystem */
public final class C14813UAk extends AnonymousClass3B3 implements C331097Pn {
    public int A00;
    public RectF A01;
    public Set A02;
    public RecyclerView A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final int A09;
    public final int A0A;
    public final LinearGradient A0B;
    public final Paint A0C;
    public final Paint A0D;
    public final Drawable A0E;
    public final Drawable A0F;
    public final Drawable A0G;
    public final Drawable A0H;
    public final TextPaint A0I;
    public final UserSession A0J;
    public final C14387TvG A0K;
    public final List A0L = new ArrayList();
    public final boolean A0M;
    public final boolean A0N;
    public final GestureDetector A0O;
    public final C20908X3z A0P;

    public final boolean DLA(MotionEvent motionEvent, RecyclerView recyclerView) {
        boolean z;
        C15038UKr uKr = null;
        Integer num = null;
        boolean A1U = AnonymousClass7TF.A1U(0, recyclerView, motionEvent);
        if (motionEvent.getActionMasked() != 3) {
            List list = this.A0L;
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (((C15038UKr) next).A0A.A01 != null) {
                    arrayList.add(next);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                C15038UKr uKr2 = (C15038UKr) it.next();
                if (uKr2.A09.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    RectF rectF = uKr2.A08;
                    float x = motionEvent.getX();
                    if (rectF != null && x <= rectF.right + (this.A07 * 3.0f)) {
                        num = AnonymousClass05K.A00;
                        z = true;
                        uKr = uKr2;
                        break;
                    }
                }
            }
            0kx r2 = new 0kx(recyclerView);
            while (r2.hasNext()) {
                View view = (View) r2.next();
                if (view instanceof IgImageButton) {
                    ((IgImageButton) view).setEnableTouchOverlay(!z);
                }
            }
            if (z && this.A0O.onTouchEvent(motionEvent) && num == AnonymousClass05K.A00) {
                C20908X3z x3z = this.A0P;
                if (x3z != null) {
                    x3z.DIq(uKr.A0A);
                }
                return A1U;
            } else if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == A1U) {
                A00((RectF) null, this);
            }
        }
        return false;
    }

    public final void DeF(boolean z) {
    }

    public final void DsW(MotionEvent motionEvent, RecyclerView recyclerView) {
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, AnonymousClass3AW r37) {
        LinearGradient linearGradient;
        int i;
        float f;
        Drawable drawable;
        Drawable drawable2;
        float f2;
        Drawable drawable3;
        VZS vzs;
        C249703kE A0W;
        Set set;
        Canvas canvas2 = canvas;
        RecyclerView recyclerView2 = recyclerView;
        boolean A1U = AnonymousClass7TF.A1U(0, canvas2, recyclerView2);
        0qQ.A0B(r37, 2);
        this.A03 = recyclerView2;
        List<C15038UKr> list = this.A0L;
        list.clear();
        C252553pI r1 = recyclerView2.A0D;
        if (r1 != null && (r1 instanceof FlowingGridLayoutManager)) {
            FlowingGridLayoutManager flowingGridLayoutManager = (FlowingGridLayoutManager) r1;
            int A1b = flowingGridLayoutManager.A1b();
            int A1c = flowingGridLayoutManager.A1c();
            if (A1b >= 0) {
                int i2 = 0;
                int i3 = A1b;
                if (i3 <= A1c) {
                    int i4 = i3;
                    while (true) {
                        C14227TsA tsA = this.A0K.A00.A0E;
                        if (i4 < tsA.getCount()) {
                            Object item = tsA.getItem(i4);
                            if (!(!(item instanceof C296935qt) || (vzs = ((C296935qt) item).A00) == null || (A0W = recyclerView2.A0W(i4)) == null)) {
                                Rect rect = new Rect();
                                RecyclerView.A0E(A0W.itemView, rect);
                                int i5 = this.A00;
                                int i6 = rect.top;
                                if (i5 < i6) {
                                    i5 = i6;
                                }
                                int i7 = this.A09 + i5;
                                if (!vzs.A03 && (set = this.A02) != null) {
                                    String str = vzs.A02;
                                    boolean contains = set.contains(str);
                                    0qQ.A0A(Boolean.valueOf(contains));
                                    if (!contains) {
                                        vzs.A00 = Integer.valueOf(set.size());
                                        set.add(str);
                                    }
                                }
                                list.add(new C15038UKr(new Rect(0, i5, recyclerView2.getWidth(), i7), vzs, rect.top));
                            }
                        }
                        if (i4 == A1c) {
                            break;
                        }
                        i4++;
                    }
                }
                LinkedList linkedList = new LinkedList();
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    C15038UKr uKr = (C15038UKr) list.get(i8);
                    if (i8 < C51966G9m.A06(list)) {
                        int i9 = i8 + 1;
                        if (uKr.A09.bottom > ((C15038UKr) list.get(i9)).A09.top) {
                            Rect rect2 = uKr.A09;
                            rect2.offset(0, ((C15038UKr) list.get(i9)).A09.top - rect2.bottom);
                        }
                    }
                    float f3 = 0.0f;
                    if (uKr.A0A.A03) {
                        if (!linkedList.contains(Integer.valueOf(i8))) {
                            linkedList.offer(Integer.valueOf(i8));
                        }
                        if (i8 < C51966G9m.A06(list) && ((C15038UKr) list.get(i8 + 1)).A09.top - uKr.A09.bottom <= 0) {
                            linkedList.remove(Integer.valueOf(i8));
                        }
                        Number number = (Number) linkedList.peek();
                        if ((number == null || number.intValue() != i8) && linkedList.peek() != null && uKr.A05 > this.A00) {
                            Object peek = linkedList.peek();
                            0qQ.A07(peek);
                            uKr.A04 = Math.max(0.0f, 1.0f - ((C15038UKr) list.get(AnonymousClass7TE.A0M(peek))).A04);
                        }
                    }
                    float f4 = ((float) uKr.A05) / -100.0f;
                    if (f4 < -0.0f) {
                        f3 = 1.0f;
                    } else if (f4 <= 1.0f) {
                        f3 = 1.0f - f4;
                    }
                    uKr.A04 = f3;
                    uKr.A02 = f3;
                    uKr.A01 = f3;
                    uKr.A00 = f3;
                    uKr.A03 = f3;
                }
                for (C15038UKr uKr2 : list) {
                    RectF rectF = this.A01;
                    if (rectF != null) {
                        RectF rectF2 = uKr2.A08;
                        if (rectF2 != null && RectF.intersects(rectF2, rectF)) {
                            uKr2.A04 = 0.5f;
                        }
                        RectF rectF3 = uKr2.A07;
                        if (rectF3 != null && RectF.intersects(rectF3, rectF)) {
                            uKr2.A02 = 0.5f;
                        }
                        RectF rectF4 = uKr2.A06;
                        if (rectF4 != null && RectF.intersects(rectF4, rectF)) {
                            uKr2.A01 = 0.5f;
                        }
                    }
                }
                int size2 = list.size();
                while (true) {
                    int i10 = i2;
                    if (i10 < size2) {
                        C15038UKr uKr3 = (C15038UKr) list.get(i10);
                        if (uKr3.A0A.A04 && uKr3.A09.bottom > this.A00) {
                            if (uKr3.A0A.A03) {
                                if (182.A06(0Tu.A05, this.A0J, 36313544761739354L)) {
                                    if (i2 == 0 && A1b == 0) {
                                    }
                                }
                            }
                            canvas2.save();
                            Rect rect3 = uKr3.A09;
                            canvas2.translate(0.0f, (float) rect3.top);
                            float f5 = uKr3.A03;
                            int i11 = (f5 > 1.0f ? 1 : (f5 == 1.0f ? 0 : -1));
                            Paint paint = this.A0D;
                            if (i11 == 0) {
                                linearGradient = this.A0B;
                            } else {
                                int A062 = 0nH.A06(this.A0A, f5);
                                linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, (float) this.A09, A062, 0, Shader.TileMode.CLAMP);
                            }
                            paint.setShader(linearGradient);
                            canvas2.drawRect(0.0f, 0.0f, (float) rect3.right, (float) (rect3.bottom - rect3.top), paint);
                            VZS vzs2 = uKr3.A0A;
                            VZS vzs3 = vzs2;
                            String str2 = vzs2.A02;
                            boolean z = true;
                            if (str2.length() > 0) {
                                StringBuilder sb = new StringBuilder();
                                char charAt = str2.charAt(0);
                                boolean isLowerCase = Character.isLowerCase(charAt);
                                String valueOf = String.valueOf(charAt);
                                if (isLowerCase) {
                                    0qQ.A0C(valueOf, AnonymousClass000.A00(336));
                                    valueOf = AnonymousClass7TF.A0k(valueOf);
                                }
                                sb.append(valueOf);
                                str2 = AnonymousClass7TF.A0l(C66580MXl.A0z(str2, A1U ? 1 : 0), sb);
                            }
                            Rect rect4 = new Rect(0, 0, 0, 0);
                            RectF rectF5 = new RectF();
                            int i12 = (int) (uKr3.A04 * 255.0f);
                            TextPaint textPaint = this.A0I;
                            textPaint.getTextBounds(str2, 0, str2.length(), rect4);
                            textPaint.setAlpha(i12);
                            rectF5.set(rect4);
                            uKr3.A08 = rectF5;
                            canvas2.save();
                            float f6 = this.A07;
                            canvas2.translate(f6 - ((float) rect4.left), this.A08 - ((float) rect4.top));
                            int width = rect3.width();
                            Drawable drawable4 = this.A0E;
                            int A063 = (int) (((float) (width - AnonymousClass7TF.A06(drawable4))) - (f6 * 2.0f));
                            boolean z2 = this.A0M;
                            boolean z3 = z2;
                            if (z2) {
                                A063 -= (int) ((this.A04 * 2.0f) + ((float) AnonymousClass7TF.A06(this.A0F)));
                            }
                            boolean z4 = this.A0N;
                            if (z4) {
                                A063 -= (int) ((this.A04 * 2.0f) + ((float) AnonymousClass7TF.A06(this.A0G)));
                            }
                            if (rect4.width() > A063) {
                                String obj = TextUtils.ellipsize(str2, textPaint, (float) A063, TextUtils.TruncateAt.END).toString();
                                textPaint.getTextBounds(obj, 0, DbX.A05(obj), rect4);
                                canvas2.drawText(obj, 0, obj.length(), 0.0f, 0.0f, textPaint);
                            } else {
                                canvas2.drawText(str2, 0.0f, 0.0f, textPaint);
                            }
                            C298795u2 r14 = vzs3.A01;
                            if (r14 != null) {
                                canvas2.save();
                                canvas2.translate(((float) rect4.width()) + this.A06, (((float) rect4.top) + ((float) (rect4.height() / 2))) - ((float) (JTP.A06(drawable4) / 2)));
                                Drawable drawable5 = drawable4;
                                drawable5.setAlpha(i12);
                                drawable5.draw(canvas2);
                                canvas2.restore();
                                C296865qm A002 = A07.A00(this.A0J).A00(r14.A00, r14.A03);
                                if ((z4 || z3) && A002 != C296865qm.NOT_A_TOPIC) {
                                    canvas2.translate(-f6, 0.0f);
                                    if (z3) {
                                        if (z4) {
                                            if (A002 != C296865qm.INTERESTED) {
                                                z = false;
                                            }
                                            i = (int) (uKr3.A04 * 255.0f);
                                            float f7 = this.A05;
                                            float f8 = ((float) rect4.top) - f7;
                                            float f9 = ((float) rect4.bottom) + f7;
                                            float f10 = ((float) rect3.right) - f6;
                                            float f11 = this.A04;
                                            float f12 = f11;
                                            float f13 = f11 * 2.0f;
                                            drawable2 = this.A0F;
                                            float A064 = (f10 - f13) - ((float) AnonymousClass7TF.A06(drawable2));
                                            uKr3.A06 = new RectF(A064, f8, f10, f9);
                                            float f14 = A064 - 1.0f;
                                            float f15 = f14 - f13;
                                            if (z) {
                                                drawable3 = this.A0G;
                                            } else {
                                                drawable3 = this.A0H;
                                            }
                                            float A065 = f15 - ((float) AnonymousClass7TF.A06(drawable3));
                                            uKr3.A07 = new RectF(A065, f8, f14, f9);
                                            RectF rectF6 = new RectF(A065, f8, f10, f9);
                                            Paint paint2 = this.A0C;
                                            C13988Tno.A0o(uKr3.A00, 255.0f, paint2);
                                            canvas2.drawRoundRect(rectF6, 25.0f, 25.0f, paint2);
                                            canvas2.drawLine(f14, f8, A064, f9, textPaint);
                                            Drawable drawable6 = this.A0G;
                                            canvas2.save();
                                            canvas2.translate(A065 + f12, (((float) rect4.top) + ((float) (rect4.height() / 2))) - ((float) (JTP.A06(drawable6) / 2)));
                                            if (!z) {
                                                drawable6 = this.A0H;
                                            }
                                            drawable6.setAlpha(i);
                                            drawable6.draw(canvas2);
                                            canvas2.restore();
                                            f2 = A064 + f12;
                                        } else {
                                            i = (int) (uKr3.A01 * 255.0f);
                                            float f16 = ((float) rect3.right) - f6;
                                            float f17 = this.A04;
                                            drawable2 = this.A0F;
                                            float A066 = (f16 - (f17 * 2.0f)) - ((float) AnonymousClass7TF.A06(drawable2));
                                            float f18 = this.A05;
                                            RectF rectF7 = new RectF(A066, ((float) rect4.top) - f18, f16, ((float) rect4.bottom) + f18);
                                            uKr3.A06 = rectF7;
                                            Paint paint3 = this.A0C;
                                            C13988Tno.A0o(uKr3.A00, 255.0f, paint3);
                                            canvas2.drawRoundRect(rectF7, 25.0f, 25.0f, paint3);
                                            f2 = f17 + A066;
                                        }
                                        canvas2.save();
                                        canvas2.translate(f2, (((float) rect4.top) + ((float) (rect4.height() / 2))) - ((float) (JTP.A06(drawable2) / 2)));
                                    } else if (z4) {
                                        if (A002 != C296865qm.INTERESTED) {
                                            z = false;
                                        }
                                        i = (int) (uKr3.A04 * 255.0f);
                                        RectF rectF8 = uKr3.A06;
                                        if (rectF8 != null) {
                                            f = rectF8.left;
                                            f6 = 3.0f;
                                        } else {
                                            f = (float) rect3.right;
                                        }
                                        float f19 = f - f6;
                                        float f20 = this.A04;
                                        float f21 = f19 - (f20 * 2.0f);
                                        if (z) {
                                            drawable = this.A0G;
                                        } else {
                                            drawable = this.A0H;
                                        }
                                        float A067 = f21 - ((float) AnonymousClass7TF.A06(drawable));
                                        float f22 = this.A05;
                                        RectF rectF9 = new RectF(A067, ((float) rect4.top) - f22, f19, ((float) rect4.bottom) + f22);
                                        uKr3.A07 = rectF9;
                                        canvas2.drawRoundRect(rectF9, 25.0f, 25.0f, this.A0C);
                                        drawable2 = this.A0G;
                                        canvas2.save();
                                        canvas2.translate(A067 + f20, (((float) rect4.top) + ((float) (rect4.height() / 2))) - ((float) (JTP.A06(drawable2) / 2)));
                                        if (!z) {
                                            drawable2 = this.A0H;
                                        }
                                    }
                                    drawable2.setAlpha(i);
                                    drawable2.draw(canvas2);
                                    canvas2.restore();
                                }
                            }
                            canvas2.restore();
                            canvas2.restore();
                        }
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public C14813UAk(Context context, UserSession userSession, C14387TvG tvG, C20908X3z x3z, Set set, boolean z, boolean z2) {
        C14387TvG tvG2 = tvG;
        boolean A1Z = DbW.A1Z(tvG2);
        this.A0J = userSession;
        this.A0K = tvG2;
        this.A0P = x3z;
        this.A0N = z;
        this.A0M = z2;
        this.A02 = set;
        this.A0O = new GestureDetector(context, new N1R(this, A1Z));
        Paint paint = new Paint();
        this.A0D = paint;
        TextPaint textPaint = new TextPaint();
        this.A0I = textPaint;
        Paint paint2 = new Paint();
        this.A0C = paint2;
        this.A07 = (float) context.getResources().getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A08 = (float) context.getResources().getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A04 = (float) context.getResources().getDimensionPixelOffset(R.dimen.ad4ad_button_bottom_margin);
        this.A05 = (float) context.getResources().getDimensionPixelOffset(R.dimen.accent_edge_thickness);
        this.A06 = (float) context.getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material);
        RectF rectF = 0nA.A01;
        this.A09 = context.getResources().getDimensionPixelOffset(R.dimen.action_bar_immersive_gradient_height);
        int A042 = (int) 0nA.A04(context, 14);
        int A043 = (int) 0nA.A04(context, 16);
        Drawable drawable = context.getDrawable(R.drawable.instagram_chevron_right_pano_outline_12);
        0qQ.A0A(drawable);
        Drawable mutate = drawable.mutate();
        mutate.setTint(-1);
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        this.A0E = mutate;
        Drawable drawable2 = context.getDrawable(R.drawable.instagram_star_pano_filled_24);
        0qQ.A0A(drawable2);
        Drawable mutate2 = drawable2.mutate();
        mutate2.setTint(-1);
        mutate2.setBounds(0, 0, A043, A043);
        this.A0G = mutate2;
        Drawable drawable3 = context.getDrawable(R.drawable.instagram_star_pano_outline_24);
        0qQ.A0A(drawable3);
        Drawable mutate3 = drawable3.mutate();
        mutate3.setTint(-1);
        mutate3.setBounds(0, 0, A043, A043);
        this.A0H = mutate3;
        Drawable drawable4 = context.getDrawable(R.drawable.instagram_x_pano_outline_16);
        0qQ.A0A(drawable4);
        Drawable mutate4 = drawable4.mutate();
        mutate4.setTint(-1);
        mutate4.setBounds(0, 0, A042, A042);
        this.A0F = mutate4;
        textPaint.setColor(-1);
        textPaint.setAntiAlias(A1Z);
        textPaint.setTypeface(Typeface.defaultFromStyle(A1Z ? 1 : 0));
        textPaint.setTextSize((24.0f * AnonymousClass7TF.A0E(context).scaledDensity) + 0.5f);
        AnonymousClass7TE.A1N(context, paint2, 2Yu.A0H(context, R.attr.igds_color_secondary_button_on_media));
        int color = context.getColor(R.color.black_60_transparent);
        this.A0A = color;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, (float) this.A09, color, 0, Shader.TileMode.CLAMP);
        this.A0B = linearGradient;
        paint.setShader(linearGradient);
    }

    public static final void A00(RectF rectF, C14813UAk uAk) {
        if (!0qQ.A0K(rectF, uAk.A01)) {
            uAk.A01 = rectF;
            RecyclerView recyclerView = uAk.A03;
            if (recyclerView != null) {
                recyclerView.A0i();
            }
        }
    }
}
