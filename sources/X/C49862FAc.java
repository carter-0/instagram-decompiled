package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.List;

/* renamed from: X.FAc  reason: case insensitive filesystem */
public class C49862FAc {
    public float A00 = 1.0f;
    public int A01 = -1;
    public int A02;
    public int A03 = -1;
    public Drawable A04;
    public View.OnClickListener A05;
    public CharSequence A06;
    public CharSequence A07;
    public List A08;

    public C49862FAc(View.OnClickListener onClickListener, int i) {
        this.A02 = i;
        this.A05 = onClickListener;
    }

    public C49862FAc(CharSequence charSequence, View.OnClickListener onClickListener) {
        this.A07 = charSequence;
        this.A05 = onClickListener;
    }
}
