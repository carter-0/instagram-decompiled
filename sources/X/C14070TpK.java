package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: X.TpK  reason: case insensitive filesystem */
public final class C14070TpK extends C14071TpL {
    public Drawable A00;
    public ColorStateList A01 = null;
    public PorterDuff.Mode A02 = null;
    public boolean A03 = false;
    public boolean A04 = false;
    public final SeekBar A05;

    public final void A02(AttributeSet attributeSet, int i) {
        super.A02(attributeSet, i);
        SeekBar seekBar = this.A05;
        Context context = seekBar.getContext();
        int[] iArr = AnonymousClass2Z3.A06;
        2Yi A002 = 2Yi.A00(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = A002.A02;
        03v.A06(context, typedArray, attributeSet, seekBar, iArr, i, 0);
        Drawable A032 = A002.A03(0);
        if (A032 != null) {
            seekBar.setThumb(A032);
        }
        Drawable A022 = A002.A02(1);
        C13989Tnp.A14(this.A00);
        this.A00 = A022;
        if (A022 != null) {
            A022.setCallback(seekBar);
            A022.setLayoutDirection(seekBar.getLayoutDirection());
            if (A022.isStateful()) {
                C13988Tno.A0x(A022, seekBar);
            }
            A00();
        }
        seekBar.invalidate();
        if (typedArray.hasValue(3)) {
            this.A02 = AnonymousClass3NX.A00(this.A02, typedArray.getInt(3, -1));
            this.A04 = true;
        }
        if (typedArray.hasValue(2)) {
            this.A01 = A002.A01(2);
            this.A03 = true;
        }
        typedArray.recycle();
        A00();
    }

    private void A00() {
        Drawable drawable = this.A00;
        if (drawable == null) {
            return;
        }
        if (this.A03 || this.A04) {
            Drawable mutate = drawable.mutate();
            this.A00 = mutate;
            if (this.A03) {
                mutate.setTintList(this.A01);
            }
            if (this.A04) {
                this.A00.setTintMode(this.A02);
            }
            if (this.A00.isStateful()) {
                C13988Tno.A0x(this.A00, this.A05);
            }
        }
    }

    public C14070TpK(SeekBar seekBar) {
        super(seekBar);
        this.A05 = seekBar;
    }
}
