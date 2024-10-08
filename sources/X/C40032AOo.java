package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.AOo  reason: case insensitive filesystem */
public final class C40032AOo implements View.OnLayoutChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public C40032AOo(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.A00 = i;
        this.A01 = obj5;
        this.A03 = obj2;
        this.A07 = obj6;
        this.A05 = obj3;
        this.A04 = obj4;
        this.A06 = obj7;
        this.A02 = obj;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = view;
        if (this.A00 != 0) {
            view.removeOnLayoutChangeListener(this);
            C308586Uv r3 = (C308586Uv) this.A04;
            C64113LOb lOb = ((C255773uh) this.A05).A0E;
            lOb.getClass();
            Object obj = this.A02;
            Object obj2 = this.A01;
            Object obj3 = this.A07;
            r3.A06(lOb, new C58701IwA(5, r3, obj2, obj, this.A06, view2, this.A03, obj3));
            return;
        }
        view.removeOnLayoutChangeListener(this);
        ImageUrl imageUrl = ((NHY) this.A01).A03;
        if (imageUrl != null) {
            View view3 = (View) this.A05;
            0qQ.A0A(view3);
            View view4 = (View) this.A04;
            0qQ.A0A(view4);
            View view5 = (View) this.A06;
            0qQ.A0A(view5);
            C2367935c.A00((Context) this.A02, view3, view4, view5, imageUrl);
        }
        ((View) this.A03).requestLayout();
    }
}
