package X;

import android.content.Context;
import android.view.View;
import java.util.AbstractCollection;

/* renamed from: X.Fmc  reason: case insensitive filesystem */
public class C50989Fmc implements C74277Ps5, C74278Ps6 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public View.OnClickListener A05;
    public View.OnLongClickListener A06;
    public CharSequence A07;
    public CharSequence A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public Context A0C;
    public final int A0D;

    public static C50989Fmc A00(Context context, View.OnClickListener onClickListener, int i) {
        return new C50989Fmc(context, onClickListener, i);
    }

    public static void A01(Context context, View.OnClickListener onClickListener, CharSequence charSequence, AbstractCollection abstractCollection) {
        abstractCollection.add(new C50989Fmc(context, onClickListener, charSequence));
    }

    public static void A02(Context context, View.OnClickListener onClickListener, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new C50989Fmc(context, onClickListener, i));
    }

    public C50989Fmc(Context context, View.OnClickListener onClickListener, CharSequence charSequence) {
        this.A0A = true;
        this.A0C = context;
        this.A08 = charSequence;
        this.A05 = onClickListener;
        this.A0D = 2Yu.A07(context);
        this.A00 = 2Yu.A08(context);
    }

    public C50989Fmc(Context context, View.OnClickListener onClickListener, int i, int i2) {
        this.A0A = true;
        this.A0C = context;
        this.A04 = i;
        this.A05 = onClickListener;
        this.A0D = i2;
        this.A00 = 2Yu.A08(context);
    }

    public C50989Fmc(Context context, CharSequence charSequence, int i) {
        this.A0A = true;
        this.A0C = context;
        this.A08 = charSequence;
        this.A0D = i;
    }

    public C50989Fmc(Context context, View.OnClickListener onClickListener, int i) {
        this(context, onClickListener, i, 2Yu.A07(context));
    }
}
