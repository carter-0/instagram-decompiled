package com.instagram.direct.inbox.notes.ui;

import X.002;
import X.0mk;
import X.0nA;
import X.0qQ;
import X.0yU;
import X.2Su;
import X.2Yu;
import X.2b1;
import X.AnonymousClass00P;
import X.AnonymousClass07V;
import X.AnonymousClass0yP;
import X.AnonymousClass1GD;
import X.AnonymousClass37O;
import X.AnonymousClass3JT;
import X.AnonymousClass6KK;
import X.AnonymousClass6KL;
import X.AnonymousClass72s;
import X.C13907Tl7;
import X.C14667U0n;
import X.C252063oV;
import X.C2606346l;
import X.C263324Kh;
import X.C319756rA;
import X.C59704JUm;
import X.C61380mr;
import X.C62320sa;
import X.C66037M8w;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public final class NoteBubbleView extends ConstraintLayout {
    public View A00;
    public CardView A01;
    public CardView A02;
    public CardView A03;
    public AnonymousClass07V A04;
    public IgLinearLayout A05;
    public IgLinearLayout A06;
    public IgLinearLayout A07;
    public IgTextView A08;
    public IgTextView A09;
    public IgImageView A0A;
    public IgImageView A0B;
    public IgImageView A0C;
    public IgImageView A0D;
    public C252063oV A0E;
    public C252063oV A0F;
    public AnonymousClass6KL A0G;
    public SpinnerImageView A0H;
    public boolean A0I;
    public IgTextView A0J;
    public IgTextView A0K;
    public IgTextView A0L;
    public IgTextView A0M;
    public IgTextView A0N;
    public IgTextView A0O;
    public IgTextView A0P;
    public IgTextView A0Q;
    public IgImageView A0R;
    public IgImageView A0S;
    public Integer A0T;
    public Integer A0U;
    public Integer A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public final float A0b;
    public final int A0c;
    public final int A0d;
    public final C13907Tl7 A0e;
    public final float A0f;
    public final float A0g;
    public final int A0h;
    public final int A0i;
    public final int A0j;
    public final Paint A0k;
    public final Paint A0l;
    public final RectF A0m;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NoteBubbleView(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }

    public final void A0F(CharSequence charSequence, String str, String str2, boolean z) {
        int color;
        IgLinearLayout igLinearLayout;
        Integer num = this.A0V;
        if (num != null) {
            color = num.intValue();
        } else {
            color = this.A06.getContext().getColor(2Yu.A0H(getContext(), R.attr.igds_color_primary_icon));
        }
        AnonymousClass6KL A002 = AnonymousClass6KK.A00(1.0f, getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material), true);
        A002.A0A.setColor(color);
        this.A0G = A002;
        IgImageView igImageView = this.A0S;
        if (igImageView != null) {
            igImageView.setImageDrawable(A002);
        }
        IgTextView igTextView = this.A08;
        if (igTextView != null) {
            igTextView.setText(str);
        }
        IgTextView igTextView2 = this.A0Q;
        if (igTextView2 != null) {
            igTextView2.setText(A01(str2, z));
        }
        AnonymousClass07V r1 = this.A04;
        if (r1 != null) {
            C13907Tl7 tl7 = this.A0e;
            r1.A0A(tl7);
            r1.A09(tl7);
            IgTextView igTextView3 = this.A0Q;
            if (igTextView3 != null) {
                igTextView3.setSelected(true);
            }
            int length = charSequence.length();
            IgTextView igTextView4 = this.A0P;
            if (length > 0) {
                if (igTextView4 != null) {
                    igTextView4.setText(charSequence);
                }
                IgTextView igTextView5 = this.A0P;
                if (igTextView5 != null) {
                    igTextView5.setVisibility(0);
                }
            } else if (igTextView4 != null) {
                igTextView4.setVisibility(8);
            }
            if (this.A0I && (igLinearLayout = this.A05) != null) {
                int i = this.A0i;
                igLinearLayout.setPadding(i, this.A0h, i, i);
            }
            Integer num2 = this.A0V;
            if (num2 != null) {
                int intValue = num2.intValue();
                IgTextView igTextView6 = this.A0P;
                if (igTextView6 != null) {
                    igTextView6.setTextColor(intValue);
                }
                IgTextView igTextView7 = this.A0Q;
                if (igTextView7 != null) {
                    igTextView7.setTextColor(intValue);
                }
                IgTextView igTextView8 = this.A08;
                if (igTextView8 != null) {
                    igTextView8.setTextColor(intValue);
                }
            }
            Context context = getContext();
            0qQ.A07(context);
            setBubbleBackgroundColor(A00(context));
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A0G(CharSequence charSequence, String str, String str2, boolean z) {
        Context context = getContext();
        0qQ.A07(context);
        Drawable A052 = AnonymousClass3JT.A05(context, R.drawable.instagram_headphones_pano_filled_12, context.getColor(2Yu.A0B(context)));
        IgImageView igImageView = this.A0R;
        if (igImageView != null) {
            igImageView.setImageDrawable(A052);
        }
        SpannableStringBuilder A012 = A01(str2, z);
        A012.append(" ");
        A012.append(context.getText(2131965115));
        A012.append(" ");
        A012.append(str);
        IgTextView igTextView = this.A0M;
        if (igTextView != null) {
            igTextView.setText(A012);
        }
        IgTextView igTextView2 = this.A0M;
        if (igTextView2 != null) {
            igTextView2.setSelected(true);
        }
        IgTextView igTextView3 = this.A0K;
        if (igTextView3 != null) {
            igTextView3.setVisibility(0);
        }
        IgTextView igTextView4 = this.A0M;
        if (igTextView4 != null) {
            igTextView4.setAlpha(1.0f);
        }
        IgImageView igImageView2 = this.A0R;
        if (igImageView2 != null) {
            igImageView2.setAlpha(1.0f);
        }
        int length = charSequence.length();
        IgTextView igTextView5 = this.A0L;
        if (length > 0) {
            if (igTextView5 != null) {
                igTextView5.setText(charSequence);
            }
            IgTextView igTextView6 = this.A0L;
            if (igTextView6 != null) {
                igTextView6.setVisibility(0);
            }
        } else if (igTextView5 != null) {
            igTextView5.setVisibility(8);
        }
    }

    public final void A0H(CharSequence charSequence, boolean z) {
        IgTextView igTextView = this.A0M;
        float f = 1.0f;
        if (igTextView != null) {
            float f2 = 0.3f;
            if (z) {
                f2 = 1.0f;
            }
            igTextView.setAlpha(f2);
        }
        IgImageView igImageView = this.A0R;
        if (igImageView != null) {
            if (!z) {
                f = 0.3f;
            }
            igImageView.setAlpha(f);
        }
        IgTextView igTextView2 = this.A0M;
        if (igTextView2 != null) {
            Context context = getContext();
            int i = 2131965116;
            if (z) {
                i = 2131965118;
            }
            igTextView2.setText(context.getText(i));
        }
        IgTextView igTextView3 = this.A0M;
        boolean z2 = true;
        if (igTextView3 != null) {
            igTextView3.setSelected(true);
        }
        if (charSequence.length() <= 0) {
            z2 = false;
        }
        IgTextView igTextView4 = this.A0L;
        if (z2) {
            if (igTextView4 != null) {
                igTextView4.setText(charSequence);
            }
            IgTextView igTextView5 = this.A0L;
            if (igTextView5 != null) {
                igTextView5.setVisibility(0);
            }
        } else if (igTextView4 != null) {
            igTextView4.setVisibility(8);
        }
        IgTextView igTextView6 = this.A0K;
        if (igTextView6 != null) {
            igTextView6.setVisibility(8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r12.A0B.getVisibility() == 0) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispatchDraw(android.graphics.Canvas r13) {
        /*
            r12 = this;
            r10 = 0
            r6 = r13
            X.0qQ.A0B(r13, r10)
            super.dispatchDraw(r13)
            androidx.cardview.widget.CardView r5 = r12.A01
            int r0 = r5.getVisibility()
            if (r0 == 0) goto L_0x0039
            X.3oV r0 = r12.A0F
            int r0 = r0.CFV()
            if (r0 == 0) goto L_0x0039
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r12.A0A
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0039
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r12.A0D
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0039
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r12.A0C
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0039
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r12.A0B
            int r0 = r0.getVisibility()
            r1 = 0
            if (r0 != 0) goto L_0x003a
        L_0x0039:
            r1 = 1
        L_0x003a:
            boolean r0 = r12.A0I
            if (r0 != 0) goto L_0x00bc
            if (r1 == 0) goto L_0x00bc
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r12.A0D
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x00d6
            r4 = 1094713344(0x41400000, float:12.0)
        L_0x004a:
            boolean r2 = r12.A0W
            if (r2 == 0) goto L_0x00c2
            int r1 = r5.getWidth()
            com.instagram.common.ui.base.IgLinearLayout r5 = r12.A06
            int r0 = r5.getPaddingStart()
            int r1 = r1 + r0
            float r1 = (float) r1
            android.content.res.Resources r0 = r12.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r4 = r4 * r0
            float r1 = r1 - r4
        L_0x0066:
            int r4 = r12.getHeight()
            int r0 = r5.getPaddingBottom()
            int r4 = r4 - r0
            float r4 = (float) r4
            float r5 = r12.getLargeThoughtBubbleRadius()
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
            float r4 = r4 - r5
            r8 = 1097859072(0x41700000, float:15.0)
            r9 = 1127481344(0x43340000, float:180.0)
            float r0 = r0 * r8
            float r9 = r9 - r0
            android.graphics.RectF r7 = r12.A0m
            float r0 = r12.getLargeThoughtBubbleRadius()
            float r0 = r1 - r0
            r7.left = r0
            float r0 = r12.getLargeThoughtBubbleRadius()
            float r0 = r0 + r1
            r7.right = r0
            float r0 = r12.getLargeThoughtBubbleRadius()
            float r0 = r4 - r0
            r7.top = r0
            float r0 = r12.getLargeThoughtBubbleRadius()
            float r0 = r0 + r4
            r7.bottom = r0
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x00bf
            android.graphics.Paint r11 = r12.A0l
        L_0x00a6:
            r6.drawArc(r7, r8, r9, r10, r11)
            float r0 = r12.getSmallThoughtBubbleXOffset()
            if (r2 == 0) goto L_0x00bd
            float r1 = r1 + r0
        L_0x00b0:
            float r0 = r12.getSmallThoughtBubbleYOffset()
            float r4 = r4 + r0
            float r0 = r12.getSmallThoughtBubbleRadius()
            r13.drawCircle(r1, r4, r0, r11)
        L_0x00bc:
            return
        L_0x00bd:
            float r1 = r1 - r0
            goto L_0x00b0
        L_0x00bf:
            android.graphics.Paint r11 = r12.A0k
            goto L_0x00a6
        L_0x00c2:
            com.instagram.common.ui.base.IgLinearLayout r5 = r12.A06
            int r0 = r5.getPaddingEnd()
            float r1 = (float) r0
            android.content.res.Resources r0 = r12.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r4 = r4 * r0
            float r1 = r1 + r4
            goto L_0x0066
        L_0x00d6:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r12.A0C
            int r0 = r0.getVisibility()
            r4 = 1099956224(0x41900000, float:18.0)
            if (r0 != 0) goto L_0x004a
            r4 = 1090519040(0x41000000, float:8.0)
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.notes.ui.NoteBubbleView.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void setCustomTheme(NoteCustomTheme noteCustomTheme) {
        Integer num;
        Integer num2;
        Integer num3 = null;
        if (noteCustomTheme == null || noteCustomTheme.C54() == null) {
            num = null;
        } else {
            num = Integer.valueOf(Color.parseColor(noteCustomTheme.C54()));
        }
        this.A0V = num;
        if (noteCustomTheme == null || noteCustomTheme.Aej() == null) {
            num2 = null;
        } else {
            num2 = Integer.valueOf(Color.parseColor(noteCustomTheme.Aej()));
        }
        this.A0T = num2;
        if (!(noteCustomTheme == null || noteCustomTheme.C1z() == null)) {
            num3 = Integer.valueOf(Color.parseColor(noteCustomTheme.C1z()));
        }
        this.A0U = num3;
    }

    public final void setLocationContent(String str, CharSequence charSequence, String str2) {
        C2606346l r1;
        Drawable mutate;
        0qQ.A0B(str, 0);
        0qQ.A0B(charSequence, 1);
        Context context = getContext();
        Drawable drawable = context.getDrawable(R.drawable.instagram_location_filled_12);
        if (!(drawable == null || (mutate = drawable.mutate()) == null)) {
            mutate.setColorFilter(new PorterDuffColorFilter(context.getColor(R.color.igds_internal_vibrant_pink), PorterDuff.Mode.SRC_IN));
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        if (drawable != null) {
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        }
        SpannableString spannableString = new SpannableString(002.A0D(str, ' '));
        if (drawable != null) {
            r1 = new C2606346l(drawable);
            r1.A01 = (int) C61380mr.A00(context, 4.0f);
        } else {
            r1 = null;
        }
        spannableString.setSpan(r1, 0, 1, 33);
        IgTextView igTextView = this.A0O;
        if (igTextView != null) {
            igTextView.setText(spannableString);
            0nA.A0p(igTextView, new C66037M8w(igTextView, charSequence, str));
        }
    }

    public final void setMusicContentLayout(AnonymousClass07V r6) {
        0qQ.A0B(r6, 0);
        this.A04 = r6;
        C252063oV r3 = this.A0F;
        this.A05 = (IgLinearLayout) r3.getView().requireViewById(R.id.pog_music_note_content_container_view);
        this.A08 = r3.getView().requireViewById(R.id.pog_music_note_artist_name);
        IgTextView requireViewById = r3.getView().requireViewById(R.id.pog_music_note_song_title_text);
        requireViewById.setTextColor(requireViewById.getContext().getColor(R.color.igds_primary_text));
        this.A0Q = requireViewById;
        this.A0S = r3.getView().requireViewById(R.id.pog_music_note_music_icon);
        this.A0P = r3.getView().requireViewById(R.id.pog_music_note_text);
        this.A01.setVisibility(8);
        CardView cardView = this.A02;
        if (cardView != null) {
            cardView.setVisibility(8);
        }
        this.A0E.setVisibility(8);
        CardView cardView2 = this.A03;
        if (cardView2 != null) {
            cardView2.setVisibility(8);
        }
        r3.setVisibility(0);
        ((CardView) r3.getView()).setRadius(this.A0f);
        A03(r3.getView(), false);
        IgLinearLayout igLinearLayout = this.A06;
        int i = this.A0c;
        igLinearLayout.setPadding(i, this.A0d, i, i);
        invalidate();
    }

    public final void setText(CharSequence charSequence, boolean z, String str, C62320sa r7) {
        0qQ.A0B(charSequence, 0);
        0qQ.A0B(str, 2);
        0qQ.A0B(r7, 3);
        getTextView().setTextSize(this.A0g);
        getTextView().setText(charSequence);
        this.A0J.setText(str);
        C319756rA.A00.A04(getTextView(), r7, z, false);
    }

    public final void setTextView(IgTextView igTextView) {
        0qQ.A0B(igTextView, 0);
        this.A09 = igTextView;
    }

    private final int A00(Context context) {
        int i;
        Integer num = this.A0T;
        if (num != null) {
            return num.intValue();
        }
        if (AnonymousClass1GD.A03()) {
            boolean z = this.A0I;
            i = R.attr.igds_color_elevated_highlight_background;
            if (z) {
                i = R.attr.igds_color_elevated_background;
            }
        } else {
            i = R.attr.igds_color_primary_background;
        }
        return context.getColor(2Yu.A0H(context, i));
    }

    private final SpannableStringBuilder A01(String str, boolean z) {
        Drawable drawable;
        if (z) {
            drawable = getContext().getDrawable(R.drawable.music_explicit);
        } else {
            drawable = null;
        }
        Context context = getContext();
        int color = context.getColor(2Yu.A0H(context, R.attr.igds_color_secondary_icon));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        if (drawable != null) {
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            Drawable mutate = drawable.mutate();
            if (mutate != null) {
                mutate.setColorFilter(color, PorterDuff.Mode.SRC_IN);
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(str);
        if (z && drawable != null) {
            C263324Kh.A02(drawable, spannableStringBuilder, spannableStringBuilder.length(), 12, 12);
        }
        return spannableStringBuilder;
    }

    private final void A02() {
        this.A07.setVisibility(8);
        CardView cardView = this.A01;
        cardView.setVisibility(0);
        cardView.setRadius(this.A0b);
        this.A0F.setVisibility(8);
        CardView cardView2 = this.A02;
        if (cardView2 != null) {
            cardView2.setVisibility(8);
        }
        this.A0E.setVisibility(8);
        CardView cardView3 = this.A03;
        if (cardView3 != null) {
            cardView3.setVisibility(8);
        }
        IgTextView textView = getTextView();
        IgLinearLayout igLinearLayout = this.A06;
        textView.setTextColor(igLinearLayout.getContext().getColor(2Yu.A0H(getContext(), R.attr.igds_color_secondary_text)));
        AnonymousClass07V r1 = this.A04;
        if (r1 != null) {
            r1.A0A(this.A0e);
        }
        A03(igLinearLayout, true);
        invalidate();
    }

    private final void A03(View view, boolean z) {
        int color;
        Drawable jUm;
        Integer num = this.A0U;
        if (num != null) {
            color = num.intValue();
        } else {
            color = getContext().getColor(R.color.cds_white_a20);
        }
        if (this.A0I) {
            view.setClipToOutline(false);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            if (this.A0a) {
                this.A06.setLayerType(1, (Paint) null);
            }
            if (z) {
                IgLinearLayout igLinearLayout = this.A06;
                igLinearLayout.setTranslationY(22.0f);
                igLinearLayout.setTranslationX(8.0f);
                this.A01.setBackground((Drawable) null);
                view.setPadding(3, 0, 3, 15);
                Context context = getContext();
                0qQ.A07(context);
                jUm = new C14667U0n(context, A00(context), color);
            } else {
                Context context2 = getContext();
                0qQ.A07(context2);
                jUm = new C59704JUm(context2, A00(context2), color, 1906, AnonymousClass1GD.A03(), false, false, this.A0Z);
            }
            view.setBackground(jUm);
        }
    }

    private final float getLargeThoughtBubbleRadius() {
        float f = 5.0f;
        if (this.A0Y) {
            f = 8.0f;
        }
        Context context = getContext();
        0qQ.A07(context);
        return C61380mr.A00(context, f);
    }

    private final float getSmallThoughtBubbleRadius() {
        float f = 2.0f;
        if (this.A0Y) {
            f = 2.75f;
        }
        Context context = getContext();
        0qQ.A07(context);
        return C61380mr.A00(context, f);
    }

    private final float getSmallThoughtBubbleXOffset() {
        float f = -4.0f;
        if (this.A0Y) {
            f = -6.0f;
        }
        Context context = getContext();
        0qQ.A07(context);
        return C61380mr.A00(context, f);
    }

    private final float getSmallThoughtBubbleYOffset() {
        float f = 7.0f;
        if (this.A0Y) {
            f = 11.0f;
        }
        Context context = getContext();
        0qQ.A07(context);
        return C61380mr.A00(context, f);
    }

    public static /* synthetic */ void setContentLayout$default(NoteBubbleView noteBubbleView, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 2Yu.A0H(noteBubbleView.getContext(), R.attr.igds_color_primary_text);
        }
        noteBubbleView.setContentLayout(i);
    }

    private final void setContentLayoutGeneric(int i) {
        int color;
        IgLinearLayout igLinearLayout = this.A07;
        igLinearLayout.setVisibility(0);
        getTextView().setVisibility(0);
        IgTextView igTextView = this.A0J;
        CharSequence text = igTextView.getText();
        0qQ.A07(text);
        boolean z = false;
        if (text.length() > 0) {
            z = true;
        }
        int i2 = 8;
        if (z) {
            i2 = 0;
        }
        igTextView.setVisibility(i2);
        this.A0A.setVisibility(8);
        this.A0D.setVisibility(8);
        this.A0C.setVisibility(8);
        this.A0B.setVisibility(8);
        CardView cardView = this.A03;
        if (cardView != null) {
            cardView.setVisibility(8);
        }
        CardView cardView2 = this.A01;
        cardView2.setVisibility(0);
        cardView2.setRadius(this.A0f);
        IgLinearLayout igLinearLayout2 = this.A06;
        int i3 = this.A0c;
        igLinearLayout2.setPadding(i3, this.A0d, i3, i3);
        this.A0F.setVisibility(8);
        CardView cardView3 = this.A02;
        if (cardView3 != null) {
            cardView3.setVisibility(8);
        }
        this.A0E.setVisibility(8);
        AnonymousClass07V r1 = this.A04;
        if (r1 != null) {
            r1.A0A(this.A0e);
        }
        if (this.A0I) {
            igLinearLayout.setPadding(i3, this.A0h, i3, this.A0j);
        }
        if (this.A0Y) {
            igLinearLayout.setPadding(0, i3, 0, i3);
        } else {
            Context context = getContext();
            0qQ.A07(context);
            igLinearLayout.setMinimumHeight((int) 0nA.A04(context, 40));
        }
        Context context2 = getContext();
        0qQ.A07(context2);
        setBubbleBackgroundColor(A00(context2));
        Integer num = this.A0V;
        if (num != null) {
            color = num.intValue();
        } else {
            color = context2.getColor(i);
        }
        getTextView().setTextColor(color);
        igTextView.setTextColor(color);
    }

    public static /* synthetic */ void setContentLayoutGeneric$default(NoteBubbleView noteBubbleView, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 2Yu.A07(noteBubbleView.getContext());
        }
        noteBubbleView.setContentLayoutGeneric(i);
    }

    public static /* synthetic */ void setContentNoteLayout$default(NoteBubbleView noteBubbleView, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 2Yu.A0H(noteBubbleView.getContext(), R.attr.igds_color_primary_text);
        }
        noteBubbleView.setContentNoteLayout(i);
    }

    public static /* synthetic */ void setCreationLayoutForContentNotesShare$default(NoteBubbleView noteBubbleView, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        noteBubbleView.setCreationLayoutForContentNotesShare(i);
    }

    public static /* synthetic */ void setCreationLayoutForShareSheet$default(NoteBubbleView noteBubbleView, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        noteBubbleView.setCreationLayoutForShareSheet(i);
    }

    public static /* synthetic */ void setCreationLayoutForShareSheetSuggestedGrid$default(NoteBubbleView noteBubbleView, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        noteBubbleView.setCreationLayoutForShareSheetSuggestedGrid(i);
    }

    public static /* synthetic */ void setIconicRedesignLayout$default(NoteBubbleView noteBubbleView, View view, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        noteBubbleView.A03(view, z);
    }

    public static /* synthetic */ void setText$default(NoteBubbleView noteBubbleView, CharSequence charSequence, boolean z, String str, C62320sa r5, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        noteBubbleView.setText(charSequence, z, str, r5);
    }

    public final void A0D() {
        if (this.A02 == null) {
            View inflate = ((ViewStub) this.A00.findViewById(R.id.location_note_bubble_view_layout)).inflate();
            this.A02 = (CardView) inflate.requireViewById(R.id.pog_location_note_card_view);
            this.A0O = inflate.requireViewById(R.id.pog_location_note_title);
            this.A0N = inflate.requireViewById(R.id.pog_location_note_text);
        }
        CardView cardView = this.A03;
        if (cardView != null) {
            cardView.setVisibility(8);
        }
        this.A01.setVisibility(8);
        this.A0F.setVisibility(8);
        CardView cardView2 = this.A02;
        if (cardView2 != null) {
            cardView2.setVisibility(0);
        }
        CardView cardView3 = this.A02;
        if (cardView3 != null) {
            cardView3.setRadius(this.A0f);
        }
        IgLinearLayout igLinearLayout = this.A06;
        int i = this.A0c;
        igLinearLayout.setPadding(i, this.A0d, i, i);
        invalidate();
    }

    public final void A0E() {
        C252063oV r2 = this.A0E;
        r2.setVisibility(0);
        this.A0M = r2.getView().requireViewById(R.id.listening_now_note_title);
        this.A0K = r2.getView().requireViewById(R.id.listening_now_subtitle);
        this.A0R = r2.getView().requireViewById(R.id.listening_now_note_icon);
        this.A0L = r2.getView().requireViewById(R.id.listening_now_note_text);
        ((CardView) r2.getView()).setRadius(this.A0f);
        this.A01.setVisibility(8);
        CardView cardView = this.A02;
        if (cardView != null) {
            cardView.setVisibility(8);
        }
        CardView cardView2 = this.A03;
        if (cardView2 != null) {
            cardView2.setVisibility(8);
        }
        this.A0F.setVisibility(8);
        IgLinearLayout igLinearLayout = this.A06;
        int i = this.A0c;
        igLinearLayout.setPadding(i, this.A0d, i, i);
        invalidate();
    }

    public final void A0I(boolean z, boolean z2, boolean z3, boolean z4) {
        this.A0I = z;
        this.A0a = z2;
        this.A0Z = z3;
        this.A0Y = z4;
    }

    public final IgTextView getTextView() {
        IgTextView igTextView = this.A09;
        if (igTextView != null) {
            return igTextView;
        }
        0qQ.A0F("textView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setBubbleBackgroundColor(int i) {
        this.A0k.setColorFilter(AnonymousClass37O.A00(i));
        this.A01.setCardBackgroundColor(i);
        C252063oV r1 = this.A0F;
        if (r1.CVM()) {
            ((CardView) r1.getView()).setCardBackgroundColor(i);
        }
    }

    public final void setCreationLayoutForContentNotesShare(int i) {
        if (i != 0) {
            this.A0C.setImageTintList(ColorStateList.valueOf(getContext().getColor(i)));
        }
        this.A0C.setVisibility(0);
        CardView cardView = this.A01;
        cardView.setClipChildren(false);
        cardView.setClipToOutline(false);
        IgLinearLayout igLinearLayout = this.A07;
        igLinearLayout.setClipChildren(false);
        igLinearLayout.setClipToOutline(false);
        A02();
    }

    public final void setCreationLayoutForShareSheet(int i) {
        if (i != 0) {
            this.A0D.setImageTintList(ColorStateList.valueOf(getContext().getColor(i)));
        }
        this.A0D.setVisibility(0);
        CardView cardView = this.A01;
        cardView.setClipChildren(false);
        cardView.setClipToOutline(false);
        IgLinearLayout igLinearLayout = this.A07;
        igLinearLayout.setClipChildren(false);
        igLinearLayout.setClipToOutline(false);
        A02();
    }

    public final void setCreationLayoutForShareSheetSuggestedGrid(int i) {
        if (i != 0) {
            this.A0B.setImageTintList(ColorStateList.valueOf(getContext().getColor(i)));
        }
        this.A0B.setVisibility(0);
        CardView cardView = this.A01;
        cardView.setClipChildren(false);
        cardView.setClipToOutline(false);
        IgLinearLayout igLinearLayout = this.A07;
        igLinearLayout.setClipChildren(false);
        igLinearLayout.setClipToOutline(false);
        A02();
    }

    public final void setContentLayout(int i) {
        setContentLayoutGeneric(i);
        A03(this.A01, false);
        invalidate();
    }

    public final void setContentNoteLayout(int i) {
        setContentLayoutGeneric(i);
        A03(this.A01, false);
        getTextView().setMaxLines(3);
        invalidate();
    }

    public final void setBubbleOnTop(boolean z) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoteBubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        0qQ.A0B(context, 1);
        this.A0f = C61380mr.A00(context, 16.0f);
        this.A0b = C61380mr.A00(context, 16.0f);
        this.A0g = 11.0f;
        this.A0m = new RectF();
        this.A0d = context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A0c = context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        this.A0h = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A0i = context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A0j = context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(context.getColor(R.color.notes_bubble_background));
        this.A0k = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        if (AnonymousClass1GD.A03()) {
            boolean z = this.A0I;
            i2 = R.attr.igds_color_elevated_highlight_background;
            if (z) {
                i2 = R.attr.igds_color_elevated_background;
            }
        } else {
            i2 = R.attr.igds_color_primary_background;
        }
        paint2.setColor(context.getColor(2Yu.A0H(context, i2)));
        this.A0l = paint2;
        boolean z2 = true;
        this.A0e = new AnonymousClass72s(this);
        setWillNotDraw(false);
        if (!this.A0X) {
            this.A0X = ((int) 0yU.A01(AnonymousClass0yP.A00(36604949705593984L))) <= 0 ? false : z2;
        }
        LayoutInflater from = LayoutInflater.from(context);
        0qQ.A07(from);
        View A012 = 2Su.A01(from, (ViewGroup.LayoutParams) null, this, R.layout.cf_hub_pog_note_bubble_view, false, this.A0X);
        this.A00 = A012;
        this.A06 = (IgLinearLayout) A012.requireViewById(R.id.pog_note_bubble_root_view);
        this.A01 = (CardView) this.A00.requireViewById(R.id.pog_note_bubble_card_view);
        setTextView(this.A00.requireViewById(R.id.pog_bubble_text));
        this.A0A = this.A00.requireViewById(R.id.pog_bubble_creation_plus);
        this.A0D = this.A00.requireViewById(R.id.pog_bubble_creation_plus_small);
        this.A0C = this.A00.requireViewById(R.id.pog_bubble_creation_plus_mini);
        this.A0B = this.A00.requireViewById(R.id.pog_bubble_creation_plus_medium);
        this.A0F = 2b1.A01(this.A00.requireViewById(R.id.music_note_bubble_view_layout), false, false);
        this.A0J = this.A00.requireViewById(R.id.friend_map_pog_notes_subtitle);
        this.A07 = (IgLinearLayout) this.A00.requireViewById(R.id.pog_bubble_text_container);
        this.A0W = 0mk.A02(getContext());
        this.A0E = 2b1.A01(this.A00.requireViewById(R.id.listening_now_note_bubble_view_layout), false, false);
        setBubbleBackgroundColor(A00(context));
        addView(this.A00);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NoteBubbleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
