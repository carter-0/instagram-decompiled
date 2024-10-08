package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

public final class P1C implements C74508Pw3 {
    public boolean A00;
    public OKT A01;
    public final Context A02;
    public final View A03;
    public final ViewGroup A04;
    public final ViewGroup A05;
    public final ImageView A06;
    public final AnonymousClass7HL A07;
    public final AnonymousClass7I8 A08;
    public final ComposerAutoCompleteTextView A09;
    public final C71273OhE A0A = new C71273OhE(this, 8);
    public final UserSession A0B;
    public final C252213ok A0C = new C72237Oz5(this, 5);
    public final AnonymousClass3E6 A0D;

    public final void ADf(AnonymousClass7L0 r14) {
        float f;
        Context context = this.A02;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, r14.A0E);
        int i = r14.A04;
        Drawable drawable = r14.A0F;
        0qQ.A0C(drawable, C273654mx.A00(0));
        GradientDrawable gradientDrawable = (GradientDrawable) drawable;
        gradientDrawable.setColor(i);
        int i2 = r14.A03;
        if (i2 != 0) {
            if (r14.A0J) {
                f = (float) AnonymousClass7TE.A0H(context.getResources());
            } else {
                f = 0.0f;
            }
            gradientDrawable.setStroke(JTR.A08(context), i2, f, f);
        } else {
            gradientDrawable.setStroke(0, 0);
        }
        ViewGroup viewGroup = this.A04;
        viewGroup.setBackground(gradientDrawable);
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A09;
        composerAutoCompleteTextView.setTextAppearance(contextThemeWrapper, R.style.InThreadComposerTextAreaRedesign);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        int[] iArr = r14.A0K;
        int length = iArr.length;
        if (length == 0) {
            C66582MXn.A11(shapeDrawable, 2Yu.A0F(context, R.attr.cyanBubbleBackground));
        } else if (length == 1) {
            C66582MXn.A11(shapeDrawable, iArr[0]);
        } else {
            AnonymousClass7I8 r1 = this.A08;
            Shape shape = shapeDrawable.getShape();
            Paint.Style style = Paint.Style.FILL;
            C308486Ul.A01((Bitmap) null, Paint.Cap.BUTT, style, shapeDrawable, shape, iArr, (float) r1.A00(), 0.0f).Eov(r1.A00() - viewGroup.getHeight());
        }
        ImageView imageView = this.A06;
        imageView.setBackground(shapeDrawable);
        AnonymousClass7TE.A1R(imageView.getDrawable(), r14.A05);
        int i3 = r14.A0B;
        if (i3 != 0) {
            composerAutoCompleteTextView.setHintTextColor(i3);
        }
    }

    public final void Epd(C333547Zj r3, boolean z) {
        0qQ.A0B(r3, 1);
        if (z && this.A01 == null) {
            this.A01 = new OKT(this.A05, r3);
        }
        OKT okt = this.A01;
        if (okt != null) {
            okt.A00();
        }
    }

    public final void AAP() {
        this.A09.addTextChangedListener(this.A0A);
    }

    public final ImageView Ajf() {
        return this.A06;
    }

    public final boolean CW1() {
        return this.A00;
    }

    public final void EEj() {
        this.A09.removeTextChangedListener(this.A0A);
    }

    public final void EHy() {
        DbS.A1C(this.A09);
    }

    public final void Ed3(AnonymousClass9IC r3) {
        this.A06.setVisibility(DbW.A01(r3.A02 ? 1 : 0));
    }

    public final void Eic(boolean z) {
        0nA.A0u(this.A05, z);
    }

    public final void Eid(int i) {
        this.A05.setVisibility(i);
    }

    public P1C(ViewGroup viewGroup, UserSession userSession, AnonymousClass3E6 r6, AnonymousClass7HL r7) {
        C51974G9v.A1P(viewGroup, userSession, r7, r6);
        this.A05 = viewGroup;
        this.A0B = userSession;
        this.A07 = r7;
        this.A0D = r6;
        this.A06 = DbX.A0J(viewGroup, R.id.row_thread_composer_button_camera);
        Context context = viewGroup.getContext();
        this.A02 = context;
        this.A04 = DbX.A0I(viewGroup, R.id.row_thread_composer_textarea_container);
        this.A09 = (ComposerAutoCompleteTextView) AnonymousClass7TF.A0F(viewGroup, R.id.row_thread_composer_edittext);
        View A0G = AnonymousClass7TF.A0G(viewGroup, R.id.row_thread_composer_button_send);
        this.A03 = A0G;
        0qQ.A07(context);
        this.A08 = new AnonymousClass7I8(context);
        C71401Ok0.A01(this.A06, 11, this);
        C71401Ok0.A01(A0G, 12, this);
    }

    public final void A9B() {
        AAP();
        this.A0D.A9Y(this.A0C);
    }

    public final void EE0() {
        EEj();
        this.A0D.EEH(this.A0C);
    }
}
