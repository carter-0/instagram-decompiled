package X;

import com.instagram.android.R;
import java.util.ArrayList;

/* renamed from: X.7cH  reason: invalid class name and case insensitive filesystem */
public final class C335037cH extends C251343mx {
    public final int A00;

    public final C251263mp A0X(AnonymousClass3Y5 r36) {
        AnonymousClass3Y5 r12 = r36;
        0qQ.A0B(r12, 0);
        AnonymousClass3O5 r25 = (AnonymousClass3O5) AnonymousClass3Zw.A00(r12, new C377119Kp(r12, 42), new Object[0]);
        int i = this.A00;
        if (i <= 0) {
            i = 4;
        }
        int min = Math.min(i, 10);
        AnonymousClass3XV r0 = 2WX.A02;
        Integer num = AnonymousClass05K.A00;
        2WX r02 = new 2WX((2WX) null, new AnonymousClass9JQ(num, 100.0f, 0));
        2V1 r03 = r12.A05;
        2V1 r34 = r03;
        2Wb r10 = new 2Wb(r03, new ArrayList());
        for (int i2 = 0; i2 < min; i2++) {
            long A0C = C244013aV.A0C(r10, R.dimen.account_discovery_bottom_gap);
            long A0C2 = C244013aV.A0C(r10, R.dimen.activation_card_icon_container_width);
            long A0C3 = C244013aV.A0C(r10, R.dimen.account_discovery_bottom_gap);
            long A0C4 = C244013aV.A0C(r10, R.dimen.add_account_icon_circle_radius);
            Integer num2 = AnonymousClass05K.A07;
            2WX r13 = new 2WX((2WX) null, new AnonymousClass9JR(num2, 0, A0C));
            Integer num3 = AnonymousClass05K.A08;
            2WX r04 = new 2WX(new 2WX(new 2WX(new 2WX(new 2WX(r13, new AnonymousClass9JR(num3, 0, A0C3)), new AnonymousClass9JR(AnonymousClass05K.A09, 0, A0C2)), new AnonymousClass9JR(AnonymousClass05K.A0A, 0, A0C4)), new AnonymousClass9JQ(num, 100.0f, 0)), new AnonymousClass9JQ(AnonymousClass05K.A0C, 0.0f, 1));
            2Wb r5 = new 2Wb(r10.Aqq(), new ArrayList());
            int A02 = C244013aV.A02(r5, R.color.gradient_dark);
            int A002 = 2Wd.A00(r5.Bnf(), C244013aV.A0C(r5, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
            2WX r132 = new 2WX((2WX) null, new AnonymousClass9JR(num, 0, C244013aV.A0C(r5, R.dimen.abc_dropdownitem_icon_width)));
            long A0C5 = C244013aV.A0C(r5, R.dimen.abc_dropdownitem_icon_width);
            Integer num4 = AnonymousClass05K.A01;
            r5.A00(new C336017dv(new 2WX(r132, new AnonymousClass9JR(num4, 0, A0C5)), A02, A002));
            2WX r05 = new 2WX((2WX) null, new AnonymousClass9JQ(num, 100.0f, 0));
            2Wb r4 = new 2Wb(r5.A00, new ArrayList());
            r4.A00(new C336017dv(new 2WX(new 2WX(new 2WX((2WX) null, new AnonymousClass9JQ(num, 40.0f, 0)), new AnonymousClass9JR(num4, 0, C244013aV.A0C(r4, R.dimen.account_discovery_bottom_gap))), new AnonymousClass9JR(num2, 0, C244013aV.A0C(r4, R.dimen.account_discovery_bottom_gap))), C244013aV.A02(r4, R.color.gradient_dark), 2Wd.A00(r4.Bnf(), C244013aV.A0C(r4, R.dimen.abc_edit_text_inset_bottom_material))));
            r4.A00(new C336017dv(new 2WX(new 2WX(new 2WX(new 2WX((2WX) null, new AnonymousClass9JQ(num, 80.0f, 0)), new AnonymousClass9JR(num4, 0, C244013aV.A0C(r4, R.dimen.account_discovery_bottom_gap))), new AnonymousClass9JR(num2, 0, C244013aV.A0C(r4, R.dimen.account_discovery_bottom_gap))), new AnonymousClass9JR(num3, 0, C244013aV.A0C(r4, R.dimen.abc_button_inset_vertical_material))), C244013aV.A02(r4, R.color.gradient_dark), 2Wd.A00(r4.Bnf(), C244013aV.A0C(r4, R.dimen.abc_edit_text_inset_bottom_material))));
            r5.A00(C243563Zg.A06(r4, r5, r05, (C243573Zh) null, (C243573Zh) null, (C243583Zi) null, false));
            r10.A00(C243563Zg.A0H(r5, r10, r04, (C243573Zh) null, (C243573Zh) null, (C243583Zi) null, (C244343b2) null, false));
        }
        2Tl A06 = C243563Zg.A06(r10, r12, r02, (C243573Zh) null, (C243573Zh) null, (C243583Zi) null, false);
        2WX r3 = new 2WX((2WX) null, new AnonymousClass9JR(AnonymousClass05K.A08, 0, C244013aV.A0C(r12, R.dimen.abc_button_padding_horizontal_material)));
        2Wb r2 = new 2Wb(r34, new ArrayList());
        0qQ.A0A(r25);
        r2.A00(new C336037dx(A06, (2WX) null, r25));
        return C243563Zg.A0H(r2, r12, r3, (C243573Zh) null, (C243573Zh) null, (C243583Zi) null, (C244343b2) null, false);
    }

    public C335037cH(int i) {
        this.A00 = i;
    }

    public C335037cH() {
        this(0);
    }
}
