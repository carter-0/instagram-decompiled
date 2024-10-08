package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Dll  reason: case insensitive filesystem */
public final class C46809Dll extends U9W {
    public float A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final Context A09;
    public final Paint A0A;
    public final Paint A0B;
    public final Drawable A0C;
    public final Drawable A0D;
    public final Drawable A0E;
    public final UserSession A0F;
    public final boolean A0G;
    public final float A0H;
    public final C2365134a A0I;
    public final boolean A0J;

    public C46809Dll(Context context, UserSession userSession, C2365134a r9) {
        super(0, 8);
        this.A09 = context;
        this.A0F = userSession;
        this.A0I = r9;
        0Tu r2 = 0Tu.A05;
        this.A0J = 182.A06(r2, userSession, 36320313631252728L);
        this.A0G = 182.A06(r2, userSession, 36320313631645948L);
        float A002 = DbX.A00(context);
        this.A06 = A002;
        this.A08 = A002 / 2.0f;
        Drawable drawable = context.getDrawable(R.drawable.instagram_group_pano_filled_24);
        Drawable drawable2 = null;
        if (drawable != null) {
            DbX.A11(context, drawable, 2Yu.A0B(context));
        } else {
            drawable = null;
        }
        this.A0E = drawable;
        Drawable drawable3 = context.getDrawable(R.drawable.instagram_chevron_left_pano_outline_24);
        if (drawable3 != null) {
            DbX.A11(context, drawable3, 2Yu.A0B(context));
        } else {
            drawable3 = null;
        }
        this.A0C = drawable3;
        Drawable drawable4 = context.getDrawable(R.drawable.instagram_chevron_right_pano_outline_24);
        if (drawable4 != null) {
            DbX.A11(context, drawable4, 2Yu.A0B(context));
            drawable2 = drawable4;
        }
        this.A0D = drawable2;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        AnonymousClass7TE.A1N(context, paint, R.color.context_line_color);
        this.A0A = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        AnonymousClass7TE.A1N(context, paint2, R.color.context_line_color);
        paint2.setStrokeWidth(context.getResources().getDimension(R.dimen.abc_control_corner_material));
        paint2.setStyle(Paint.Style.STROKE);
        this.A0B = paint2;
        float dimension = context.getResources().getDimension(R.dimen.abc_button_padding_horizontal_material);
        this.A07 = dimension;
        this.A0H = dimension + ((A002 + A00()) * 2.0f);
        this.A01 = true;
        this.A05 = true;
    }

    public final void clearView(RecyclerView recyclerView, C249703kE r19) {
        Integer num;
        String str;
        C249703kE r3 = r19;
        RecyclerView recyclerView2 = recyclerView;
        AnonymousClass7TF.A1H(recyclerView2, r3);
        if (this.A03) {
            boolean z = !this.A02;
            this.A02 = z;
            C2365134a r1 = this.A0I;
            r1.A08(z);
            C2366734q r6 = new C2366734q(r1, this.A0F);
            if (this.A01) {
                num = AnonymousClass05K.A0j;
            } else {
                num = AnonymousClass05K.A0u;
            }
            String str2 = r1.A03.A04;
            if (this.A02) {
                str = "ig_group_story_tray_swipe_entry";
            } else {
                str = "ig_group_story_tray_swipe_exit";
            }
            r6.A00((EZX) null, num, (Integer) null, (String) null, (String) null, str2, (String) null, (String) null, (String) null, str);
        }
        this.A03 = false;
        super.clearView(recyclerView2, r3);
    }

    public final int getMovementFlags(RecyclerView recyclerView, C249703kE r8) {
        0qQ.A0B(r8, 1);
        if (r8.itemView.getTag() instanceof C240733Ma) {
            Object tag = r8.itemView.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.reels.ui.ReelFeedTrayViewBinder.Holder");
            View childAt = ((C240733Ma) tag).A00.getChildAt(0);
            if (0qQ.A0K(childAt.getContentDescription(), "reels_tray_container")) {
                C252553pI r3 = ((RecyclerView) childAt).A0D;
                0qQ.A0C(r3, C273654mx.A00(7));
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r3;
                int i = 0;
                if (linearLayoutManager.A1c() == 0) {
                    i = (8 << 8) | (8 << 0);
                }
                if (!this.A0J || linearLayoutManager.A1d() != linearLayoutManager.A0U() - 1) {
                    return i;
                }
                return i | (4 << 0) | (4 << 8);
            }
        }
        return 0;
    }

    public final float getSwipeEscapeVelocity(float f) {
        return 9999.0f;
    }

    public final float getSwipeThreshold(C249703kE r2) {
        return 9999.0f;
    }

    public final void onChildDraw(Canvas canvas, RecyclerView recyclerView, C249703kE r20, float f, float f2, int i, boolean z) {
        Context context;
        float dimension;
        Drawable drawable;
        Drawable drawable2;
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas2, 0);
        RecyclerView recyclerView2 = recyclerView;
        C249703kE r4 = r20;
        AnonymousClass7TF.A1B(recyclerView2, 1, r4);
        float f3 = f;
        float abs = Math.abs(f3);
        this.A00 = abs;
        View view = r4.itemView;
        0qQ.A06(view);
        if (Build.VERSION.SDK_INT >= 30) {
            if (this.A00 < this.A0H) {
                this.A05 = true;
            } else if (this.A05) {
                view.performHapticFeedback(16);
                this.A05 = false;
            }
        }
        if (!this.A02 && this.A0G) {
            float f4 = abs / 600.0f;
            float f5 = 1.0f;
            if (1.0f > f4) {
                f5 = f4;
            }
            float f6 = 1.0f - f5;
            RecyclerView recyclerView3 = this.A0I.A0P.A03;
            if (recyclerView3 != null) {
                View childAt = recyclerView3.getChildAt(0);
                if (childAt != null) {
                    childAt.setScaleX(f6);
                    childAt.setScaleY(f6);
                }
                recyclerView3.setTranslationX(f3);
            }
        }
        float top = ((float) view.getTop()) + (((float) view.getHeight()) / 2.0f);
        float left = (float) view.getLeft();
        if (this.A02 || !this.A0G) {
            context = this.A09;
            dimension = context.getResources().getDimension(R.dimen.abc_button_padding_horizontal_material);
        } else {
            context = this.A09;
            int A002 = (int) 182.A00(0Tu.A05, this.A0F, 37164738562556246L);
            if (A002 <= 16) {
                A002 = 50;
            }
            dimension = 0nA.A04(context, A002) - this.A06;
        }
        float A003 = A00();
        float f7 = this.A00;
        float f8 = this.A06;
        float f9 = this.A07;
        if (f7 >= ((dimension + f8) * 2.0f) + f9) {
            float f10 = (f7 - f9) / 2.0f;
            float f11 = f8 + A003;
            if (f10 > f11) {
                f10 = f11;
            }
            float f12 = left + f9 + f10;
            float f13 = ((f10 - f8) - dimension) / (A003 - dimension);
            int i2 = (int) (255.0f * f13);
            boolean z2 = false;
            if (f >= 0.0f) {
                z2 = true;
            }
            this.A01 = z2;
            int i3 = AnonymousClass7TF.A0E(context).widthPixels;
            boolean z3 = this.A01;
            if (!z3) {
                f12 = ((float) i3) - f12;
            }
            if (f13 == 1.0f) {
                canvas2.drawCircle(f12, top, f8, this.A0A);
                if (!this.A02) {
                    drawable2 = this.A0E;
                } else if (this.A01) {
                    drawable2 = this.A0C;
                } else {
                    drawable2 = this.A0D;
                }
                if (drawable2 != null) {
                    float f14 = this.A08;
                    drawable2.setBounds((int) (f12 - f14), (int) (top - f14), (int) (f12 + f14), (int) (f14 + top));
                    drawable2.setAlpha(i2);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                if (!this.A02) {
                    drawable = this.A0E;
                } else if (z3) {
                    drawable = this.A0C;
                } else {
                    drawable = this.A0D;
                }
                if (drawable != null) {
                    drawable2 = new ScaleDrawable(drawable, 17, f13, f13).getDrawable();
                    if (drawable2 != null) {
                        drawable2.setAlpha(i2);
                        float f15 = this.A08 * f13;
                        drawable2.setBounds((int) (f12 - f15), (int) (top - f15), (int) (f12 + f15), (int) (f15 + top));
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            drawable2.draw(canvas2);
            Paint paint = this.A0B;
            paint.setAlpha(i2);
            canvas2.drawArc(new RectF(f12 - f8, top - f8, f12 + f8, top + f8), 270.0f, 360.0f * f13, false, paint);
        }
        if (this.A02 || !this.A0G) {
            C249703kE r10 = r4;
            RecyclerView recyclerView4 = recyclerView2;
            Canvas canvas3 = canvas2;
            super.onChildDraw(canvas3, recyclerView4, r10, f3, f2, i, z);
        }
    }

    public final boolean onMove(RecyclerView recyclerView, C249703kE r3, C249703kE r4) {
        return false;
    }

    public final void onSelectedChanged(C249703kE r5, int i) {
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                this.A04 = true;
                this.A02 = this.A0I.A0A();
            }
        } else if (this.A04) {
            if (this.A00 <= this.A0H) {
                z = false;
            }
            this.A03 = z;
            this.A04 = false;
        }
    }

    public final void onSwiped(C249703kE r1, int i) {
    }

    private final float A00() {
        if (this.A02 || !this.A0G) {
            return DbX.A00(this.A09);
        }
        Context context = this.A09;
        int A002 = (int) 182.A00(0Tu.A05, this.A0F, 37164738562556246L);
        if (A002 <= 16) {
            A002 = 50;
        }
        return 0nA.A04(context, A002);
    }
}
