package X;

import com.instagram.ui.widget.colourwheel.ColourWheelView;

/* renamed from: X.Age  reason: case insensitive filesystem */
public final class C40664Age implements C353808Jd {
    public final /* synthetic */ AIY A00;
    public final /* synthetic */ ColourWheelView A01;

    public final /* synthetic */ void D4b() {
    }

    public final /* synthetic */ void D4c() {
    }

    public final /* synthetic */ void D4d() {
    }

    public C40664Age(AIY aiy, ColourWheelView colourWheelView) {
        this.A00 = aiy;
        this.A01 = colourWheelView;
    }

    public final void D4Z(int i) {
        AIY aiy = this.A00;
        C352048Bm r2 = aiy.A01;
        if (r2 == null) {
            0kD.A01("TextModeComposerGradientBackgroundController", "mTextColorSchemeList is null onColourPreview");
            return;
        }
        r2.A02(i);
        AIY.A01(aiy, false);
    }

    public final void D4a(int i) {
        String id;
        AIY aiy = this.A00;
        C352048Bm r1 = aiy.A01;
        if (r1 == null) {
            0kD.A01("TextModeComposerGradientBackgroundController", "mTextColorSchemeList is null onColourSelected");
            return;
        }
        r1.A02(i);
        1Av r12 = aiy.A0E;
        String str = aiy.A03.A09;
        int i2 = aiy.A01.A01;
        0qQ.A0B(str, 0);
        0xa r4 = r12.A01;
        0xY AR4 = r4.AR4();
        AR4.E5Z(002.A0R("text_to_camera_custom_text_color_scheme_index_", str), i2);
        AR4.apply();
        String str2 = aiy.A03.A09;
        0qQ.A0B(str2, 0);
        0xY AR42 = r4.AR4();
        AR42.E5Z(002.A0R("text_to_camera_custom_text_color_scheme_colour_", str2), i);
        AR42.apply();
        aiy.A00 = i;
        AIY.A01(aiy, true);
        this.A01.setBaseDrawable(aiy.A0B.A01());
        C39657A3x a3x = aiy.A0C;
        0xY AR43 = AnonymousClass0xl.A00(C61170le.A00).A00.AR4();
        AR43.E5T("has_used_create_mode_colour_wheel", true);
        AR43.apply();
        C353798Jc r13 = a3x.A00;
        27r A012 = 27p.A01(r13.A0U);
        AnonymousClass87G A013 = r13.A0X.A0H.A01();
        if (A013 == null) {
            id = null;
        } else {
            id = A013.getId();
        }
        id.getClass();
        A012.A1R(C59725JVj.CREATE, id);
    }
}
