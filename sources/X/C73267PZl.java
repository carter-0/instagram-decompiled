package X;

import android.app.Activity;
import android.graphics.Rect;
import android.util.Rational;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.rtc.views.omnigrid.GridLayoutInput;
import com.facebook.rtc.views.omnigrid.GridLayoutInputItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.PZl  reason: case insensitive filesystem */
public final class C73267PZl implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C69110Nep A01;

    public C73267PZl(C69110Nep nep, int i) {
        this.A00 = i;
        this.A01 = nep;
    }

    public final void run() {
        C69110Nep nep;
        int i;
        int i2;
        Rect rect;
        List<C68166N3g> list;
        if (this.A00 > 2) {
            nep = this.A01;
            if (AnonymousClass7TF.A1Z(nep.A0K)) {
                OWU A0D = C71135OdY.A0D(nep);
                C68164N3e n3e = A0D.A02;
                if (n3e == null || (list = n3e.A08) == null) {
                    rect = AnonymousClass7TE.A0W();
                } else {
                    ArrayList A0r = AnonymousClass7TG.A0r(list);
                    for (C68166N3g n3g : list) {
                        A0r.add(new GridLayoutInputItem(n3g.A02, n3g.A03, C70371O3x.A00, AnonymousClass7TF.A1W(n3g.A07, AnonymousClass05K.A00), 0, (Object) null));
                    }
                    N4M A002 = OWU.A00(A0D, AnonymousClass05K.A1I);
                    C73604Pgf pgf = C73604Pgf.A00;
                    GridLayoutInput gridLayoutInput = new GridLayoutInput(A0r, A002.A02(AnonymousClass7TE.A0S(A0D.A06)), IgNetworkConsentStorage.MAX_ENTRIES, IgNetworkConsentStorage.MAX_ENTRIES);
                    rect = AnonymousClass7TE.A0W();
                    N48 n48 = (N48) pgf.invoke(gridLayoutInput);
                    0qQ.A0B(n48, 0);
                    List<C68152N2s> list2 = n48.A09;
                    if (!list2.isEmpty()) {
                        rect.top = Integer.MAX_VALUE;
                        rect.bottom = 0;
                        rect.left = Integer.MAX_VALUE;
                        rect.right = 0;
                        for (C68152N2s n2s : list2) {
                            C15048ULb uLb = n2s.A02;
                            int i3 = uLb.A01;
                            if (i3 > 0 || uLb.A03 > 0 || uLb.A02 > 0 || uLb.A00 > 0) {
                                rect.left = Math.min(rect.left, i3);
                                rect.top = Math.min(rect.top, uLb.A03);
                                rect.right = Math.max(rect.right, uLb.A02);
                                rect.bottom = Math.max(rect.bottom, uLb.A00);
                            }
                        }
                    }
                }
                i = rect.width();
                i2 = rect.height();
                nep.A0A.A05(new PNN(new Rational(i, i2)));
            }
        }
        nep = this.A01;
        Activity activity = nep.A05;
        i = 0nA.A09(activity);
        i2 = 0nA.A08(activity);
        nep.A0A.A05(new PNN(new Rational(i, i2)));
    }
}
