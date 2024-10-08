package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckBox;
import android.widget.TextView;
import com.instagram.igds.components.imagebutton.IgImageButton;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Wb3  reason: case insensitive filesystem */
public final class C19517Wb3 implements XC0 {
    public X3D A00;
    public final int A01;
    public final View A02;
    public final View A03;
    public final CheckBox A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final C60005JdE A09;
    public final AnonymousClass3NM A0A;
    public final C71662eb A0B;
    public final C71662eb A0C;
    public final IgImageButton A0D;
    public final MediaFrameLayout A0E;

    public final /* synthetic */ void Eui(boolean z) {
    }

    public final /* synthetic */ RectF AhX() {
        return 0nA.A0F(this.A0E);
    }

    public final RectF Beu() {
        return 0nA.A0F(this.A0E);
    }

    public final void CLk() {
        this.A0E.setVisibility(4);
    }

    public final void Ev3() {
        this.A0E.setVisibility(0);
    }

    public C19517Wb3(View view, View view2, ViewStub viewStub, ViewStub viewStub2, CheckBox checkBox, TextView textView, TextView textView2, TextView textView3, TextView textView4, C60005JdE jdE, IgImageButton igImageButton, MediaFrameLayout mediaFrameLayout) {
        Context context = mediaFrameLayout.getContext();
        this.A01 = context.getColor(2Yu.A04(context));
        this.A0E = mediaFrameLayout;
        this.A0D = igImageButton;
        this.A09 = jdE;
        this.A02 = view;
        this.A05 = textView2;
        0oh.A07(context, AnonymousClass7TG.A0N(context), textView2, AnonymousClass05K.A01);
        this.A07 = textView;
        this.A03 = view2;
        this.A04 = checkBox;
        this.A0B = new C71662eb(viewStub);
        this.A0C = new C71662eb(viewStub2);
        this.A06 = textView3;
        this.A08 = textView4;
        AnonymousClass3NG r2 = new AnonymousClass3NG(mediaFrameLayout);
        r2.A07 = true;
        r2.A02 = 0.98f;
        r2.A04 = new C15848UjY(this, 0);
        this.A0A = r2.A00();
    }
}
