package X;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.logging.LoggingContext;
import com.instagram.android.R;
import java.util.Map;

/* renamed from: X.QhK  reason: case insensitive filesystem */
public final class C8126QhK extends QCJ {
    public QDM A00;
    public LoggingContext A01;
    public ContextThemeWrapper A02;
    public ECPPaymentRequest A03;
    public final AnonymousClass2gO A04 = C11652Sdu.A00(this, 3);
    public final Map A05 = AnonymousClass7TF.A0w(C298525tb.ITEM_LIST, new C11360SOw(false));
    public final AnonymousClass0eM A06 = C13346TVt.A00(this, 6);

    /* JADX WARNING: type inference failed for: r4v0, types: [X.QhK, X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.QCJ] */
    public final void onViewCreated(View view, Bundle bundle) {
        AnonymousClass2Fj FHY;
        AnonymousClass2Fj FHY2;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        STG.A02(this);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass7TF.A0F(view, R.id.recyclerView);
        DbU.A15(requireActivity(), recyclerView, 1, false);
        recyclerView.setItemAnimator((AnonymousClass3AS) null);
        recyclerView.setAdapter((2Rw) this.A06.getValue());
        C11360SOw A0T = Pxh.A0T(C298525tb.ITEM_LIST, this.A05);
        if (A0T != null) {
            A0T.A02(new C13346TVt(this, 7));
        }
        QDM qdm = this.A00;
        if (qdm != null) {
            ECPHandler eCPHandler = qdm.A00;
            if (!(eCPHandler == null || (FHY2 = eCPHandler.FHY()) == null)) {
                FHY2.A08(this.A04);
            }
            QDM qdm2 = this.A00;
            if (qdm2 != null) {
                ECPHandler eCPHandler2 = qdm2.A00;
                if (eCPHandler2 != null && (FHY = eCPHandler2.FHY()) != null) {
                    FHY.A06(this, this.A04);
                    return;
                }
                return;
            }
        }
        0qQ.A0F("ecpViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(1614821285);
        C8126QhK.super.onCreate(bundle);
        this.A01 = (LoggingContext) Pxj.A0H(this);
        ECPPaymentRequest A012 = QCJ.A01(this);
        this.A03 = A012;
        LoggingContext loggingContext = this.A01;
        if (loggingContext == null) {
            str = "loggingContext";
        } else if (A012 == null) {
            str = "ecpPaymentRequest";
        } else {
            this.A00 = C11086S9g.A00(this, A012, loggingContext);
            AnonymousClass0fD.A09(-1867836128, A022);
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-730699084);
        ContextThemeWrapper A002 = QCJ.A00(this, layoutInflater);
        this.A02 = A002;
        View inflate = layoutInflater.cloneInContext(A002).inflate(R.layout.ecp_see_item_details_fragment, viewGroup, false);
        AnonymousClass0fD.A09(746017516, A022);
        return inflate;
    }
}
