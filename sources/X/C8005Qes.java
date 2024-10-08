package X;

import android.view.ContextThemeWrapper;
import androidx.fragment.app.FragmentActivity;
import com.facebookpay.apm.APMConfigurationImpl;
import com.facebookpay.bloks.nativeprops.APMBloksNativeProps;
import com.facebookpay.common.recyclerview.adapteritems.APMButtonsItem;
import com.facebookpay.expresscheckout.models.APMConfiguration;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.apm.ApmButtonsView;
import java.util.LinkedHashMap;

/* renamed from: X.Qes  reason: case insensitive filesystem */
public final class C8005Qes extends QEW {
    public final ContextThemeWrapper A00;
    public final FragmentActivity A01;
    public final 0sP A02;

    public C8005Qes(ContextThemeWrapper contextThemeWrapper, FragmentActivity fragmentActivity, LoggingContext loggingContext, 0sP r6) {
        super(RH6.A0B, loggingContext, false);
        this.A00 = contextThemeWrapper;
        this.A01 = fragmentActivity;
        this.A02 = r6;
    }

    public final void A0B(C7468QEx qEx, SUj sUj) {
        APMConfiguration aPMConfiguration;
        Integer num;
        boolean A1Z = AnonymousClass7TG.A1Z(sUj, qEx);
        APMButtonsItem aPMButtonsItem = (APMButtonsItem) sUj.A01;
        if (!(aPMButtonsItem == null || (num = aPMButtonsItem.A02) == null)) {
            qEx.A00.setPayWithCardText(num.intValue());
        }
        if (SUj.A0T(sUj)) {
            qEx.A00.A00.A06(A1Z);
            return;
        }
        ApmButtonsView apmButtonsView = qEx.A00;
        apmButtonsView.A00.A05();
        if (aPMButtonsItem != null && (aPMConfiguration = aPMButtonsItem.A01) != null) {
            APMBloksNativeProps aPMBloksNativeProps = aPMButtonsItem.A00;
            aPMBloksNativeProps.A00 = this.A02;
            FragmentActivity fragmentActivity = this.A01;
            C13925TlT tlT = ((APMConfigurationImpl) aPMConfiguration).A00;
            LinkedHashMap A07 = 0Yt.A07(new 0eP[]{AnonymousClass7TE.A1L(Py7.A00(), aPMBloksNativeProps.A06), AnonymousClass7TE.A1L("client_mutation_id", aPMBloksNativeProps.A02), AnonymousClass7TE.A1L(AnonymousClass000.A00(1171), aPMBloksNativeProps.A03), AnonymousClass7TE.A1L("otc_session_id", aPMBloksNativeProps.A05), AnonymousClass7TE.A1L("amount", aPMBloksNativeProps.A01), AnonymousClass7TE.A1L("currency_code", aPMBloksNativeProps.A04)});
            0sP r2 = aPMBloksNativeProps.A00;
            if (r2 != null) {
                A07.put("on_complete_callback", new Q3B(new C74179PqL(r2, 44)));
            }
            apmButtonsView.setupBloksApms(fragmentActivity, tlT, A07);
        }
    }
}
