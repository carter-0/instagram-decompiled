package X;

import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.user.model.User;

public final class ADC {
    public View A00;
    public ViewGroup A01;
    public ViewStub A02;
    public C70968OTp A03;
    public final FragmentActivity A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final C39781A9a A07;

    public static final SpannableString A00(ADC adc, User user, String str) {
        SpannableString spannableString = new SpannableString(str);
        FragmentActivity fragmentActivity = adc.A04;
        spannableString.setSpan(new C69195Ngt(adc, user, fragmentActivity.getColor(2Yu.A07(fragmentActivity))), 0, spannableString.length(), 33);
        return spannableString;
    }

    public ADC(ViewStub viewStub, FragmentActivity fragmentActivity, AnonymousClass0iw r9, AnonymousClass4DJ r10, UserSession userSession, Capabilities capabilities, AnonymousClass7SX r13) {
        AnonymousClass7TG.A1R(viewStub, r9);
        this.A06 = userSession;
        this.A04 = fragmentActivity;
        this.A02 = viewStub;
        this.A05 = r9;
        this.A07 = A02.A00(fragmentActivity.getApplicationContext());
        this.A03 = new C70968OTp(fragmentActivity, r10, userSession, capabilities, r13);
    }
}
