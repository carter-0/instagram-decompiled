package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8v6  reason: invalid class name and case insensitive filesystem */
public final class C369648v6 extends C299875vz implements C268714ds, C300645xY {
    public final int A00 = this.A08.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
    public final int A01;
    public final int A02 = this.A08.getResources().getDimensionPixelSize(R.dimen.poll_v2_sticker_result_percentage_text_size);
    public final int A03 = this.A08.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
    public final int A04 = this.A08.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
    public final int A05 = this.A08.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
    public final int A06;
    public final int A07;
    public final Context A08;
    public final C19474WaM A09;
    public final C306386Ly A0A;
    public final boolean A0B;
    public final int A0C;
    public final int A0D = this.A08.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
    public final int A0E = this.A08.getResources().getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
    public final int A0F = this.A08.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
    public final Drawable A0G;
    public final Drawable A0H;
    public final Drawable A0I;
    public final Drawable A0J;
    public final ArrayList A0K;
    public final List A0L;
    public final List A0M;
    public final List A0N;
    public final List A0O;
    public final List A0P;

    public C369648v6(Context context, C19474WaM waM) {
        Drawable drawable;
        C306386Ly r5;
        ArrayList arrayList;
        0qQ.A0B(context, 1);
        0qQ.A0B(waM, 2);
        this.A08 = context;
        this.A09 = waM;
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.challenge_sticker_button_text_size);
        boolean z = waM.A08;
        this.A0B = z;
        this.A0N = waM.A05;
        int dimensionPixelSize = this.A08.getResources().getDimensionPixelSize(R.dimen.before_and_after_media_card_width);
        this.A07 = dimensionPixelSize;
        int dimensionPixelSize2 = this.A08.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A06 = dimensionPixelSize2;
        int dimensionPixelSize3 = this.A08.getResources().getDimensionPixelSize(R.dimen.poll_v2_sticker_title_text_size);
        boolean z2 = waM.A04 != null;
        this.A0C = waM.A06.size();
        Drawable drawable2 = context.getDrawable(R.drawable.poll_v2_sticker_background);
        if (drawable2 != null) {
            this.A0G = drawable2;
            Drawable drawable3 = null;
            if (z2) {
                drawable = A00(R.drawable.poll_v2_sticker_title_background);
            } else {
                drawable = null;
            }
            this.A0J = drawable;
            if (z2) {
                r5 = new C306386Ly(context, dimensionPixelSize - (dimensionPixelSize2 * 2));
                Context context2 = r5.A0Z;
                0qQ.A07(context2);
                AJB.A06(context2, r5, (float) dimensionPixelSize3, 0.0f);
                r5.A0F(context2.getColor(2Yu.A0A(context2)));
                String str = waM.A04;
                r5.A0M(str == null ? "" : str);
            } else {
                r5 = null;
            }
            this.A0A = r5;
            Drawable drawable4 = context.getDrawable(R.drawable.poll_v2_sticker_option_background);
            if (drawable4 != null) {
                this.A0I = drawable4;
                drawable3 = z ? A00(R.drawable.poll_v2_sticker_option_background) : drawable3;
                this.A0H = drawable3;
                List<C272004jw> list = this.A09.A06;
                ArrayList arrayList2 = new ArrayList(0Yv.A1E(list, 10));
                for (C272004jw r0 : list) {
                    String str2 = r0.A02;
                    if (str2 == null) {
                        str2 = "";
                    }
                    arrayList2.add(A01(str2, false));
                }
                this.A0O = arrayList2;
                if (this.A0B) {
                    List<C272004jw> list2 = this.A09.A06;
                    arrayList = new ArrayList(0Yv.A1E(list2, 10));
                    for (C272004jw r02 : list2) {
                        String str3 = r02.A02;
                        if (str3 == null) {
                            str3 = "";
                        }
                        arrayList.add(A01(str3, true));
                    }
                } else {
                    arrayList = 0sn.A00;
                }
                this.A0L = arrayList;
                List A022 = A02(false);
                this.A0P = A022;
                List A023 = A02(true);
                this.A0M = A023;
                ArrayList arrayList3 = new ArrayList();
                this.A0K = arrayList3;
                arrayList3.add(drawable2);
                if (drawable != null) {
                    arrayList3.add(drawable);
                }
                if (r5 != null) {
                    arrayList3.add(r5);
                }
                arrayList3.add(drawable4);
                if (drawable3 != null) {
                    arrayList3.add(drawable3);
                }
                arrayList3.addAll(arrayList2);
                arrayList3.addAll(arrayList);
                arrayList3.addAll(A022);
                arrayList3.addAll(A023);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final String C4F() {
        return C273654mx.A00(882);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A0G.draw(canvas);
        Drawable drawable = this.A0J;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        C306386Ly r0 = this.A0A;
        if (r0 != null) {
            r0.draw(canvas);
        }
        canvas.save();
        int i = this.A0C;
        for (int i2 = 0; i2 < i; i2++) {
            this.A0I.draw(canvas);
            ((Drawable) this.A0O.get(i2)).draw(canvas);
            if (this.A0B) {
                ((Drawable) this.A0P.get(i2)).draw(canvas);
                List list = this.A0N;
                if (list != null) {
                    float intValue = (float) ((Number) list.get(i2)).intValue();
                    Drawable drawable2 = this.A0H;
                    if (drawable2 != null) {
                        Rect bounds = drawable2.getBounds();
                        0qQ.A07(bounds);
                        int width = bounds.width();
                        float f = (float) bounds.left;
                        float f2 = (float) bounds.top;
                        canvas.save();
                        canvas.clipRect(f, f2, (((float) width) * (intValue / 100.0f)) + f, (float) bounds.bottom);
                        drawable2.draw(canvas);
                        ((Drawable) this.A0L.get(i2)).draw(canvas);
                        ((Drawable) this.A0M.get(i2)).draw(canvas);
                        canvas.restore();
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            canvas.translate(0.0f, (float) (this.A0E + this.A0F));
        }
        canvas.restore();
    }

    private final Drawable A00(int i) {
        Drawable drawable = this.A08.getDrawable(i);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            0qQ.A0C(mutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) mutate).setColors(C14276Tsz.A02(this.A09.A00));
            0qQ.A07(mutate);
            return mutate;
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final C306386Ly A01(String str, boolean z) {
        Context context = this.A08;
        C306386Ly r2 = new C306386Ly(context, ((this.A07 - (this.A06 * 2)) - this.A00) - this.A03);
        r2.A0A((float) this.A01);
        r2.A0K(Layout.Alignment.ALIGN_NORMAL);
        int i = R.attr.igds_color_text_on_white;
        if (z) {
            i = R.attr.igds_color_primary_text_on_media;
        }
        r2.A0F(context.getColor(2Yu.A0H(context, i)));
        r2.A0b.setFakeBoldText(true);
        r2.A0M(str);
        return r2;
    }

    private final List A02(boolean z) {
        if (!this.A0B) {
            return 0sn.A00;
        }
        List<Number> list = this.A0N;
        if (list != null) {
            ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
            for (Number intValue : list) {
                int intValue2 = intValue.intValue();
                Context context = this.A08;
                C306386Ly r3 = new C306386Ly(context, this.A03);
                Context context2 = r3.A0Z;
                0qQ.A07(context2);
                AJB.A06(context2, r3, (float) this.A02, 0.0f);
                int i = R.attr.igds_color_text_on_white;
                if (z) {
                    i = R.attr.igds_color_primary_text_on_media;
                }
                r3.A0F(context.getColor(2Yu.A0H(context, i)));
                r3.A0M(0mp.A06("%d%%", new Object[]{Integer.valueOf(intValue2)}));
                arrayList.add(r3);
            }
            return arrayList;
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A03(Drawable drawable, int i, int i2) {
        int i3 = i - ((int) (((float) this.A03) / 2.0f));
        int i4 = i2 + ((int) (((float) this.A0E) / 2.0f));
        drawable.setBounds(i3 - ((int) (((float) drawable.getIntrinsicWidth()) / 2.0f)), i4 - ((int) (((float) drawable.getIntrinsicHeight()) / 2.0f)), i3 + ((int) (((float) drawable.getIntrinsicWidth()) / 2.0f)), i4 + ((int) (((float) drawable.getIntrinsicHeight()) / 2.0f)));
    }

    private final void A04(Drawable drawable, int i, int i2, int i3) {
        int i4 = i + this.A00;
        int i5 = i2 - this.A03;
        int i6 = i3 + ((int) (((float) this.A0E) / 2.0f));
        drawable.setBounds(i4, i6 - ((int) (((float) drawable.getIntrinsicHeight()) / 2.0f)), i5, i6 + ((int) (((float) drawable.getIntrinsicHeight()) / 2.0f)));
    }

    public final List A07() {
        return this.A0K;
    }

    public final boolean A0A() {
        return !this.A0B;
    }

    public final C2802350v BzV() {
        return this.A09;
    }

    public final int getIntrinsicHeight() {
        int i;
        C306386Ly r1 = this.A0A;
        if (r1 != null) {
            i = ((this.A05 + this.A04) + r1.A06) - r1.A08;
        } else {
            i = 0;
        }
        return i + this.A0D + (this.A0C * (this.A0E + this.A0F)) + this.A06;
    }

    public final int getIntrinsicWidth() {
        return this.A07;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5;
        super.setBounds(i, i2, i3, i4);
        int i6 = (int) (((float) (i + i3)) / 2.0f);
        float f = (float) i6;
        float f2 = ((float) this.A07) / 2.0f;
        int i7 = (int) (f - f2);
        float f3 = (float) ((int) (((float) (i2 + i4)) / 2.0f));
        float intrinsicHeight = ((float) getIntrinsicHeight()) / 2.0f;
        int i8 = (int) (f3 - intrinsicHeight);
        int i9 = (int) (f + f2);
        this.A0G.setBounds(i7, i8, i9, (int) (f3 + intrinsicHeight));
        C306386Ly r8 = this.A0A;
        if (r8 != null) {
            i5 = ((this.A05 + this.A04) + r8.A06) - r8.A08;
        } else {
            i5 = 0;
        }
        Drawable drawable = this.A0J;
        if (drawable != null) {
            drawable.setBounds(i7, i8, i9, i8 + i5);
        }
        if (r8 != null) {
            int i10 = r8.A08;
            int i11 = (int) (((float) r8.A0A) / 2.0f);
            r8.setBounds(i6 - i11, (this.A05 + i8) - i10, i6 + i11, ((i8 + i5) - this.A04) + i10);
        }
        int i12 = i8 + i5 + this.A0D + this.A0F;
        int i13 = this.A06;
        int i14 = i + i13;
        int i15 = i3 - i13;
        int i16 = this.A0E + i12;
        this.A0I.setBounds(i14, i12, i15, i16);
        Drawable drawable2 = this.A0H;
        if (drawable2 != null) {
            drawable2.setBounds(i14, i12, i15, i16);
        }
        int i17 = this.A0C;
        for (int i18 = 0; i18 < i17; i18++) {
            A04((Drawable) this.A0O.get(i18), i14, i15, i12);
            if (this.A0B) {
                A04((Drawable) this.A0L.get(i18), i14, i15, i12);
                A03((Drawable) this.A0P.get(i18), i15, i12);
                A03((Drawable) this.A0M.get(i18), i15, i12);
            }
        }
    }
}
