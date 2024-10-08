package com.instagram.igds.components.bulletcell;

import X.00l;
import X.0nA;
import X.0qQ;
import X.2Yu;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C48944Emi;
import X.C71382cm;
import X.C71622eP;
import X.DbS;
import X.DbT;
import X.DbU;
import X.EWR;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgdsBulletCell extends FrameLayout {
    public EWR A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final ViewGroup A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsBulletCell(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void setIcon(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        this.A01.setImageDrawable(drawable);
    }

    public final void setSurfaceType(EWR ewr) {
        EWR ewr2;
        int A002;
        EWR ewr3;
        0qQ.A0B(ewr, 0);
        if (this.A00 != ewr) {
            this.A00 = ewr;
            ImageView imageView = this.A01;
            Context A0S = AnonymousClass7TE.A0S(this);
            int A022 = DbU.A02(this.A00, 1);
            if (A022 == 0) {
                ewr2 = EWR.DEFAULT;
            } else if (A022 == 1) {
                ewr2 = EWR.ON_MEDIA;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            imageView.setColorFilter(AnonymousClass7TF.A03(A0S, ewr2.A00));
            TextView textView = this.A03;
            DbT.A17(A0S, textView, C48944Emi.A00(A0S, this.A00));
            TextView textView2 = this.A02;
            int visibility = textView.getVisibility();
            EWR ewr4 = this.A00;
            if (visibility == 0) {
                int A023 = DbU.A02(ewr4, 1);
                if (A023 == 0) {
                    ewr3 = EWR.DEFAULT;
                } else if (A023 == 1) {
                    ewr3 = EWR.ON_MEDIA;
                } else {
                    throw AnonymousClass7TE.A1K();
                }
                A002 = 2Yu.A0H(A0S, ewr3.A02);
            } else {
                A002 = C48944Emi.A00(A0S, ewr4);
            }
            DbT.A17(A0S, textView2, A002);
        }
    }

    public final void setText(Integer num, Integer num2) {
        String str;
        int intValue;
        int intValue2;
        String str2 = null;
        if (num == null || (intValue2 = num.intValue()) == 0) {
            str = null;
        } else {
            str = getContext().getString(intValue2);
        }
        if (!(num2 == null || (intValue = num2.intValue()) == 0)) {
            str2 = getContext().getString(intValue);
        }
        A00(this, str, str2);
    }

    public static final void A00(IgdsBulletCell igdsBulletCell, CharSequence charSequence, CharSequence charSequence2) {
        Context A0S;
        int A002;
        EWR ewr;
        TextView textView = igdsBulletCell.A03;
        textView.setText(charSequence);
        TextView textView2 = igdsBulletCell.A02;
        textView2.setText(charSequence2);
        CharSequence text = textView.getText();
        0qQ.A07(text);
        boolean z = !00l.A0W(text);
        CharSequence text2 = textView2.getText();
        0qQ.A07(text2);
        boolean z2 = !00l.A0W(text2);
        if (z2 && z) {
            textView.setVisibility(0);
            Context A0S2 = AnonymousClass7TE.A0S(textView);
            0nA.A0i(textView, (int) 0nA.A00(A0S2, 12.0f), (int) 0nA.A00(A0S2, 5.0f));
            textView2.setVisibility(0);
            A0S = AnonymousClass7TE.A0S(textView2);
            0nA.A0X(textView2, (int) 0nA.A00(A0S, 12.0f));
            int A022 = DbU.A02(igdsBulletCell.A00, 1);
            if (A022 == 0) {
                ewr = EWR.DEFAULT;
            } else if (A022 == 1) {
                ewr = EWR.ON_MEDIA;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            A002 = 2Yu.A0H(A0S, ewr.A02);
        } else if (z) {
            textView.setVisibility(0);
            Context A0S3 = AnonymousClass7TE.A0S(textView);
            0nA.A0i(textView, (int) 0nA.A00(A0S3, 13.0f), (int) 0nA.A00(A0S3, 13.0f));
            textView2.setVisibility(8);
            return;
        } else if (z2) {
            textView.setVisibility(8);
            textView2.setVisibility(0);
            A0S = AnonymousClass7TE.A0S(textView2);
            0nA.A0i(textView2, (int) 0nA.A00(A0S, 13.0f), (int) 0nA.A00(A0S, 13.0f));
            A002 = C48944Emi.A00(A0S, igdsBulletCell.A00);
        } else {
            return;
        }
        DbT.A17(A0S, textView2, A002);
    }

    private final void setBodyTextMoveMethod(MovementMethod movementMethod) {
        if (movementMethod != null) {
            this.A02.setMovementMethod(movementMethod);
        }
    }

    public static /* synthetic */ void setIconInternal$default(IgdsBulletCell igdsBulletCell, int i, boolean z, int i2, Object obj) {
        if (i != 0) {
            igdsBulletCell.A01.setImageResource(i);
        }
    }

    public final EWR getSurfaceType() {
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r3.getPaddingRight() != 0) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setExcludeHorizontalPadding(boolean r5) {
        /*
            r4 = this;
            android.view.ViewGroup r3 = r4.A04
            int r0 = r3.getPaddingLeft()
            r2 = 0
            if (r0 != 0) goto L_0x0010
            int r1 = r3.getPaddingRight()
            r0 = 0
            if (r1 == 0) goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            if (r5 == 0) goto L_0x0019
            if (r0 == 0) goto L_0x0018
        L_0x0015:
            X.0nA.A0h(r3, r2, r2)
        L_0x0018:
            return
        L_0x0019:
            if (r0 != 0) goto L_0x0018
            android.content.res.Resources r1 = X.DbU.A05(r4)
            r0 = 2131165214(0x7f07001e, float:1.7944639E38)
            int r2 = r1.getDimensionPixelSize(r0)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.bulletcell.IgdsBulletCell.setExcludeHorizontalPadding(boolean):void");
    }

    public final void setIconColor(int i) {
        DbU.A14(getContext(), this.A01, i);
    }

    public final void setMovementMethod(MovementMethod movementMethod, MovementMethod movementMethod2) {
        this.A03.setMovementMethod(movementMethod);
        this.A02.setMovementMethod(movementMethod2);
    }

    public final void setTextColor(int i) {
        DbT.A17(getContext(), this.A02, i);
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsBulletCell(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        EWR ewr = EWR.DEFAULT;
        this.A00 = ewr;
        View.inflate(context, R.layout.layout_bullet_cell, this);
        ViewGroup A0E = DbS.A0E(this, R.id.bullet_cell_container);
        this.A04 = A0E;
        this.A01 = DbS.A0G(this, R.id.bullet_cell_icon);
        this.A03 = AnonymousClass7TE.A0d(this, R.id.bullet_cell_title);
        this.A02 = AnonymousClass7TE.A0d(this, R.id.bullet_cell_body);
        A0E.setImportantForAccessibility(1);
        A0E.setDescendantFocusability(393216);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C71382cm.A1O, i, 0);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(2, 0);
                String A002 = C71622eP.A00(context, obtainStyledAttributes, 4);
                String A003 = C71622eP.A00(context, obtainStyledAttributes, 0);
                boolean z = obtainStyledAttributes.getBoolean(1, false);
                int i2 = obtainStyledAttributes.getInt(3, 0);
                if (i2 != 0 && i2 == 1) {
                    ewr = EWR.ON_MEDIA;
                }
                setSurfaceType(ewr);
                obtainStyledAttributes.recycle();
                setExcludeHorizontalPadding(z);
                if (resourceId != 0) {
                    this.A01.setImageResource(resourceId);
                }
                A00(this, A002, A003);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    public final void setIcon(int i) {
        if (i != 0) {
            this.A01.setImageResource(i);
        }
    }

    public final void setText(CharSequence charSequence, CharSequence charSequence2) {
        A00(this, charSequence, charSequence2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IgdsBulletCell(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsBulletCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
