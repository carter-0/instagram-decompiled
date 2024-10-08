package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
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

public final class P1D implements C74508Pw3 {
    public AnonymousClass9IC A00 = new AnonymousClass9IC(31, 1, false, false, false, false, false);
    public boolean A01;
    public OKT A02;
    public final Context A03;
    public final ViewGroup A04;
    public final C71273OhE A05 = new C71273OhE(this, 9);
    public final C252213ok A06 = new C72237Oz5(this, 6);
    public final AnonymousClass3E6 A07;
    public final AnonymousClass7HL A08;
    public final OBT A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;

    public final void ADf(AnonymousClass7L0 r19) {
        float f;
        OBT obt = this.A09;
        AnonymousClass0eM r4 = this.A0E;
        int height = AnonymousClass7TH.A06(r4).getHeight();
        AnonymousClass7L0 r5 = r19;
        int i = r5.A04;
        Drawable drawable = r5.A0F;
        0qQ.A0C(drawable, C273654mx.A00(0));
        GradientDrawable gradientDrawable = (GradientDrawable) drawable;
        gradientDrawable.setColor(i);
        int i2 = r5.A03;
        if (i2 != 0) {
            if (r5.A0J) {
                f = (float) AnonymousClass7TE.A0H(obt.A00.getResources());
            } else {
                f = 0.0f;
            }
            gradientDrawable.setStroke(JTR.A08(obt.A00), i2, f, f);
        } else {
            gradientDrawable.setStroke(0, 0);
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        int[] iArr = r5.A0K;
        int length = iArr.length;
        if (length == 0) {
            C66582MXn.A11(shapeDrawable, 2Yu.A0F(obt.A00, R.attr.cyanBubbleBackground));
        } else if (length == 1) {
            C66582MXn.A11(shapeDrawable, iArr[0]);
        } else {
            AnonymousClass7I8 r2 = obt.A01;
            Shape shape = shapeDrawable.getShape();
            C308486Ul.A01((Bitmap) null, Paint.Cap.BUTT, Paint.Style.FILL, shapeDrawable, shape, iArr, (float) r2.A00(), 0.0f).Eov(r2.A00() - height);
        }
        ColorFilter A002 = AnonymousClass37O.A00(r5.A05);
        int i3 = r5.A0C;
        AnonymousClass37O.A00(i3);
        ColorFilter A003 = AnonymousClass37O.A00(i3);
        ColorFilter A004 = AnonymousClass37O.A00(i3);
        int i4 = r5.A0B;
        AnonymousClass7TH.A06(r4).setBackground(gradientDrawable);
        AnonymousClass0eM r3 = this.A0B;
        JTR.A0Z(r3).setBackground(shapeDrawable);
        JTR.A0Z(r3).getDrawable().setColorFilter(A002);
        JTR.A0Z(this.A0D).setColorFilter(A002);
        JTR.A0Z(this.A0G).setColorFilter(A003);
        JTR.A0Z(this.A0A).setColorFilter(A004);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.A03, r5.A0E);
        AnonymousClass0eM r1 = this.A0C;
        JTQ.A0A(r1).setTextAppearance(contextThemeWrapper, R.style.InThreadComposerTextAreaRedesign);
        if (i4 != 0) {
            JTQ.A0A(r1).setHintTextColor(i4);
        }
    }

    public final void Epd(C333547Zj r3, boolean z) {
        0qQ.A0B(r3, 1);
        if (z && this.A02 == null) {
            this.A02 = new OKT(this.A04, r3);
        }
        OKT okt = this.A02;
        if (okt != null) {
            okt.A00();
        }
    }

    public final void AAP() {
        JTQ.A0A(this.A0C).addTextChangedListener(this.A05);
    }

    public final ImageView Ajf() {
        return JTR.A0Z(this.A0B);
    }

    public final boolean CW1() {
        return this.A01;
    }

    public final void EEj() {
        JTQ.A0A(this.A0C).removeTextChangedListener(this.A05);
    }

    public final void EHy() {
        DbS.A1C(JTQ.A0A(this.A0C));
    }

    public final void Ed3(AnonymousClass9IC r4) {
        this.A00 = r4;
        int i = 0;
        JTR.A0Z(this.A0B).setVisibility(DbW.A01(r4.A02 ? 1 : 0));
        AnonymousClass7TH.A06(this.A0G).setVisibility(DbW.A01(r4.A05 ? 1 : 0));
        AnonymousClass7TH.A06(this.A0D).setVisibility(DbW.A01(r4.A03 ? 1 : 0));
        AnonymousClass7TH.A06(this.A0A).setVisibility(DbW.A01(r4.A01 ? 1 : 0));
        View A062 = AnonymousClass7TH.A06(this.A0F);
        if (!r4.A04) {
            i = 8;
        }
        A062.setVisibility(i);
    }

    public final void Eic(boolean z) {
        0nA.A0u(this.A04, z);
    }

    public final void Eid(int i) {
        this.A04.setVisibility(i);
    }

    public /* synthetic */ P1D(ViewGroup viewGroup, AnonymousClass3E6 r11, AnonymousClass7HL r12) {
        Context context = viewGroup.getContext();
        0qQ.A0B(context, 0);
        OBT obt = new OBT(context, new AnonymousClass7I8(context));
        AnonymousClass7TG.A1Q(r12, r11);
        this.A04 = viewGroup;
        this.A08 = r12;
        this.A07 = r11;
        this.A03 = context;
        this.A09 = obt;
        0eO r1 = 0eO.A02;
        this.A0B = C67570Mq4.A00(this, r1, 16);
        this.A0E = C67570Mq4.A00(this, r1, 19);
        this.A0C = C67570Mq4.A00(this, r1, 17);
        this.A0G = C67570Mq4.A00(this, r1, 21);
        this.A0D = C67570Mq4.A00(this, r1, 18);
        this.A0A = C67570Mq4.A00(this, r1, 15);
        this.A0F = C67570Mq4.A00(this, r1, 20);
        C71401Ok0.A01(JTR.A0Z(this.A0B), 13, this);
        C71401Ok0.A01(AnonymousClass7TH.A06(this.A0F), 14, this);
    }

    public final void A9B() {
        AAP();
        this.A07.A9Y(this.A06);
    }

    public final void EE0() {
        EEj();
        this.A07.EEH(this.A06);
    }
}
