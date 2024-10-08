package X;

import android.content.DialogInterface;
import com.instagram.model.mediatype.ProductType;
import java.util.List;
import java.util.Map;

public final class LV9 implements DialogInterface.OnShowListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ H0I A01;

    public LV9(H0I h0i, long j) {
        this.A01 = h0i;
        this.A00 = j;
    }

    public final void onShow(DialogInterface dialogInterface) {
        H0I h0i = this.A01;
        I6J.A00.A04(AnonymousClass7TE.A0l(h0i.A01), (ProductType) null, "challenge_end_dialog", (String) null, ((C53034GhQ) h0i.A00.getValue()).A04, (String) null, (List) null, (List) null, AnonymousClass7TE.A1I(Long.valueOf(this.A00)), (List) null, (List) null, (List) null, (Map) null);
    }
}
