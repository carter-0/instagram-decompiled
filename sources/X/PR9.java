package X;

import android.view.View;
import android.widget.CompoundButton;

public class PR9 implements C74278Ps6 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public View.OnClickListener A06;
    public View.OnLongClickListener A07;
    public CompoundButton.OnCheckedChangeListener A08;
    public C358618bC A09;
    public CharSequence A0A;
    public CharSequence A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public PR9(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.A0B = charSequence;
        this.A0A = charSequence2;
        this.A0D = z;
        this.A08 = onCheckedChangeListener;
    }

    public PR9(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, CharSequence charSequence, boolean z) {
        this.A0B = charSequence;
        this.A0D = z;
        this.A08 = onCheckedChangeListener;
    }

    public PR9(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, C358618bC r2, int i, boolean z) {
        this.A04 = i;
        this.A0D = z;
        this.A08 = onCheckedChangeListener;
        this.A09 = r2;
    }

    public PR9(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, int i, boolean z) {
        this.A04 = i;
        this.A0D = z;
        this.A08 = onCheckedChangeListener;
    }
}
