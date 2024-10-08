package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import java.util.Map;

public final class AKT implements DialogInterface.OnClickListener {
    public final /* synthetic */ DialogInterface.OnClickListener A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ Map A02;

    public AKT(DialogInterface.OnClickListener onClickListener, UserSession userSession, Map map) {
        this.A00 = onClickListener;
        this.A01 = userSession;
        this.A02 = map;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.onClick(dialogInterface, i);
        JVF.A05(new 0xG("BrandedContentTaggingUpsellController"), this.A01, AnonymousClass05K.A0k, this.A02);
    }
}
