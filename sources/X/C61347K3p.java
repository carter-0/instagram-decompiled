package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.K3p  reason: case insensitive filesystem */
public abstract class C61347K3p extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "VideoEditFragment$SubFragment";
    public View A00;
    public UserSession A01;
    public C273524mj A02;
    public ConstrainedTextureView A03;
    public C63955LFb A04;
    public C378379Po A05;
    public FilterGroupModel A06;
    public LP1 A07;

    public final UserSession A0A() {
        UserSession userSession = this.A01;
        if (userSession != null) {
            return userSession;
        }
        DbS.A17();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0C() {
        if (!(this instanceof C61870KPj) && (this instanceof C61869KPi)) {
            C61869KPi kPi = (C61869KPi) this;
            if (kPi.A09) {
                if (kPi.A05 != null) {
                    float f = RecyclerView.A1E;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            kPi.A09 = false;
        }
    }

    public final AnonymousClass3Q2 A0B(UserSession userSession) {
        return 28K.A00(userSession).A03(JTU.A0L(requireContext()).E2M());
    }
}
