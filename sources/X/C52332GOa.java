package X;

import android.content.Context;
import com.instagram.android.R;
import java.util.BitSet;

/* renamed from: X.GOa  reason: case insensitive filesystem */
public final class C52332GOa extends C251343mx {
    public final float A00;
    public final float A01;
    public final int A02;
    public final C251263mp A03;
    public final Integer A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public final C251263mp A0X(AnonymousClass3Y5 r23) {
        C251263mp A0E;
        int color;
        AnonymousClass3Y5 r0 = r23;
        0qQ.A0B(r0, 0);
        C52334GOc gOc = new C52334GOc(r0.A05, new C52335GOd());
        float f = this.A01;
        C52335GOd gOd = gOc.A01;
        AnonymousClass2V4 r14 = gOc.A02;
        gOd.A00 = (float) r14.A00(f);
        int i = this.A02;
        gOd.A02 = i;
        gOd.A01 = (float) r14.A00(this.A00);
        gOd.A0C = true;
        C251263mp r02 = this.A03;
        C52335GOd gOd2 = gOc.A01;
        if (r02 == null) {
            A0E = null;
        } else {
            A0E = r02.A0E();
        }
        gOd2.A07 = A0E;
        BitSet bitSet = gOc.A02;
        bitSet.set(0);
        Context context = gOc.A01.A0C;
        if (this.A08 && context != null) {
            Integer num = this.A04;
            boolean z = this.A05;
            boolean z2 = this.A07;
            boolean z3 = this.A06;
            if (num != null) {
                color = num.intValue();
            } else {
                boolean A032 = AnonymousClass1GD.A03();
                int i2 = R.color.design_dark_default_color_on_background;
                if (A032) {
                    i2 = R.color.cds_white_a20;
                }
                color = context.getColor(i2);
            }
            gOd.A01 = (float) r14.A00(0.0f);
            gOd.A00 = (float) r14.A00(0.0f);
            gOd.A02 = 0;
            C244143ai r11 = C244143ai.TOP;
            int A002 = r14.A00(4.0f);
            C251253mo r12 = gOc.A00;
            r12.A0Z().E1a(r11, A002);
            r12.A0Z().A0K(context.getResources().getDimensionPixelSize(R.dimen.audio_page_audio_filter_tooltip_vertical_offset));
            r12.A0Z().E1a(C244143ai.BOTTOM, r14.A00(10.0f));
            r12.A0Z().A0T(C244143ai.START, r14.A00(5.0f));
            r12.A0Z().A0T(C244143ai.END, r14.A00(5.0f));
            2TG A022 = 2TC.A02(r12.A0Z());
            A022.A0F |= 65536;
            A022.A0g = false;
            2TG A023 = 2TC.A02(r12.A0Z());
            A023.A0F |= 8388608;
            A023.A0f = false;
            gOd.A08 = true;
            gOd.A09 = true;
            gOd.A0A = true;
            gOd.A0B = true;
            Context context2 = context;
            gOc.A04(new C59704JUm(context2, i, color, 626, z, false, z2, z3));
        }
        C244113af.A00(bitSet, gOc.A03, 1);
        gOc.A02();
        return gOd;
    }

    public C52332GOa(C251263mp r1, Integer num, float f, float f2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = f;
        this.A00 = f2;
        this.A03 = r1;
        this.A02 = i;
        this.A04 = num;
        this.A08 = z;
        this.A05 = z2;
        this.A07 = z3;
        this.A06 = z4;
    }
}
