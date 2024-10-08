package X;

import android.content.res.Resources;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.Iif  reason: case insensitive filesystem */
public final class C57924Iif implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ HN0 A01;
    public final /* synthetic */ I4J A02;

    public C57924Iif(View view, HN0 hn0, I4J i4j) {
        this.A02 = i4j;
        this.A00 = view;
        this.A01 = hn0;
    }

    public final void run() {
        int i;
        CharSequence string;
        int dimensionPixelSize;
        I4J i4j = this.A02;
        View view = this.A00;
        HN0 hn0 = this.A01;
        int ordinal = hn0.ordinal();
        Resources resources = i4j.A01;
        switch (ordinal) {
            case 0:
                i = 2131972146;
                break;
            case 1:
                i = 2131967826;
                break;
            case 2:
                i = 2131967791;
                break;
            case 3:
                i = 2131975555;
                break;
            case 4:
                i = 2131973593;
                break;
            default:
                string = resources.getText(2131961880);
                break;
        }
        string = resources.getString(i);
        0qQ.A07(string);
        AnonymousClass5Gt r4 = new AnonymousClass5Gt(i4j.A00, new C315476jx(string));
        if (ordinal == 3) {
            r4.A04(view, (int) resources.getDimension(R.dimen.account_group_management_clickable_width), (int) resources.getDimension(R.dimen.audio_page_audio_filter_tooltip_vertical_offset), false);
        } else {
            if (I4J.A00(hn0, i4j) == C226262fy.ABOVE_ANCHOR) {
                dimensionPixelSize = -resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
            } else {
                dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
            }
            r4.A04(view, 0, dimensionPixelSize, true);
        }
        r4.A06(I4J.A00(hn0, i4j));
        DbU.A1T(r4);
        0xa A03 = 1Al.A01(i4j.A02).A03(1An.A0I);
        String str = hn0.A02;
        int i2 = A03.getInt(str, 0);
        0xY AR4 = A03.AR4();
        switch (ordinal) {
            case 0:
            case 5:
                AR4.E5c(hn0.A01, System.currentTimeMillis());
                break;
        }
        AR4.E5Z(str, i2 + 1);
        AR4.apply();
    }
}
