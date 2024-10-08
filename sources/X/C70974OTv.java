package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.OTv  reason: case insensitive filesystem */
public final class C70974OTv {
    public static final C71392co A0C = C71392co.A04(0.0d, 1.0E-4d);
    public static final C71392co A0D = C71392co.A04(8.0d, 6.5d);
    public float A00;
    public long A01;
    public final GestureDetector A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final ImageView A07;
    public final ImageView A08;
    public final 2cs A09;
    public final U11 A0A;
    public final boolean A0B;

    public C70974OTv(View view, View view2, View view3, View view4, ImageView imageView, ImageView imageView2, boolean z) {
        0qQ.A0B(view, 1);
        C51974G9v.A1S(imageView, view2, imageView2, view3, view4);
        this.A03 = view;
        this.A07 = imageView;
        this.A05 = view2;
        this.A08 = imageView2;
        this.A06 = view3;
        this.A04 = view4;
        this.A0B = z;
        2cs A022 = 2cp.A00().A02();
        A022.A09(A0C);
        A022.A0A(new NC9(this, 1));
        A022.A00 = 0.01d;
        this.A09 = A022;
        Context context = view.getContext();
        this.A02 = new GestureDetector(context, new C71541Omc(this));
        int i = U11.A0H;
        0qQ.A07(context);
        Drawable drawable = view.getResources().getDrawable(R.drawable.golden_ticket_back_logo);
        0qQ.A07(drawable);
        this.A0A = new U11(context, drawable, z);
        view2.setCameraDistance(view2.getResources().getDisplayMetrics().density * 5000.0f);
    }
}
