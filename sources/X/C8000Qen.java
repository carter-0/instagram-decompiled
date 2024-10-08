package X;

import android.view.ContextThemeWrapper;
import com.facebookpay.logging.LoggingContext;
import com.instagram.android.R;

/* renamed from: X.Qen  reason: case insensitive filesystem */
public final class C8000Qen extends QEW {
    public final int A00;
    public final int A01;
    public final ContextThemeWrapper A02;
    public final C13612Tde A03;
    public final 0sP A04;

    public C8000Qen(ContextThemeWrapper contextThemeWrapper, LoggingContext loggingContext, C13612Tde tde, 0sP r6) {
        super(RH6.A0H, loggingContext, false);
        this.A02 = contextThemeWrapper;
        this.A03 = tde;
        this.A04 = r6;
        this.A00 = SSH.A00(contextThemeWrapper, R.attr.fbpay_widget_component_horizontal_margin);
        this.A01 = DbY.A01(contextThemeWrapper);
    }
}
