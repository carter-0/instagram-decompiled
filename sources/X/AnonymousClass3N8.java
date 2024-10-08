package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.3N8  reason: invalid class name */
public abstract class AnonymousClass3N8 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public abstract View A00();

    public abstract View A01();

    public abstract TextView A03();

    public abstract TextView A04();

    public abstract TextView A05();

    public abstract C252063oV A07();

    public boolean A08() {
        return true;
    }

    public TextView A02() {
        return null;
    }

    public C252063oV A06() {
        return null;
    }

    public AnonymousClass3N8(Context context, Resources resources) {
        String string = resources.getString(2131967956);
        0qQ.A07(string);
        this.A03 = string;
        String string2 = resources.getString(2131967960);
        0qQ.A07(string2);
        this.A06 = string2;
        String string3 = resources.getString(2131967958);
        0qQ.A07(string3);
        this.A04 = string3;
        String string4 = resources.getString(2131967955);
        0qQ.A07(string4);
        this.A02 = string4;
        String string5 = resources.getString(2131967959);
        0qQ.A07(string5);
        this.A05 = string5;
        String string6 = resources.getString(2131972420);
        0qQ.A07(string6);
        this.A07 = string6;
        String string7 = resources.getString(2131972421);
        0qQ.A07(string7);
        this.A08 = string7;
        String string8 = resources.getString(2131970877);
        0qQ.A07(string8);
        this.A09 = string8;
        this.A00 = context.getColor(2Yu.A0H(context, R.attr.igds_color_secondary_text));
        this.A01 = context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_text));
    }
}
