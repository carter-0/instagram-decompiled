package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class Q9z extends LinearLayout implements C13601TdT {
    public LinearLayout A00;
    public C8040Qfk A01;
    public Map A02;
    public final 0sP A03 = TY1.A00(this, 20);

    public void setViewModel(C8040Qfk qfk) {
        RH6 rh6;
        C8040Qfk qfk2 = qfk;
        0qQ.A0B(qfk2, 0);
        this.A01 = qfk2;
        this.A00 = Pxe.A0M(this, R.id.address_list_container);
        this.A02 = AnonymousClass7TE.A1H();
        0sP r11 = this.A03;
        C8040Qfk qfk3 = this.A01;
        if (qfk3 != null) {
            C7994Qeh qeh = new C7994Qeh(qfk3.A01, r11, true);
            Map map = this.A02;
            String str = "viewBinders";
            if (map != null) {
                map.put(qeh.A02, qeh);
                C8040Qfk qfk4 = this.A01;
                if (qfk4 != null) {
                    C8010Qex qex = new C8010Qex(AnonymousClass7TE.A0S(this), (AnonymousClass07Z) null, qfk4.A01, r11, TX9.A00, (0sP) null, true);
                    Map map2 = this.A02;
                    if (map2 != null) {
                        map2.put(qex.A02, qex);
                        C8040Qfk qfk5 = this.A01;
                        if (qfk5 != null) {
                            if (!(SRc.A0A(qfk5) instanceof SelectionActionViewItem)) {
                                C8040Qfk qfk6 = this.A01;
                                if (qfk6 != null) {
                                    C7997Qek qek = new C7997Qek(qfk6.A01, r11, true, qfk6.A03);
                                    Map map3 = this.A02;
                                    if (map3 != null) {
                                        map3.put(qek.A02, qek);
                                    }
                                }
                            }
                            C8040Qfk qfk7 = this.A01;
                            if (qfk7 == null) {
                                str = "viewModel";
                            } else {
                                ArrayList A1C = AnonymousClass7TE.A1C();
                                for (Object A0O : qfk7.A02) {
                                    SUj.A0O(A0O, A1C);
                                }
                                if (!(SRc.A0A(qfk7) instanceof SelectionActionViewItem)) {
                                    SUj.A0O(qfk7.A00, A1C);
                                }
                                Iterator it = A1C.iterator();
                                while (it.hasNext()) {
                                    SUj sUj = (SUj) it.next();
                                    Map map4 = this.A02;
                                    if (map4 != null) {
                                        0qQ.A0C(sUj, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
                                        BaseCheckoutItem baseCheckoutItem = (BaseCheckoutItem) sUj.A01;
                                        if (baseCheckoutItem != null) {
                                            rh6 = baseCheckoutItem.BJZ();
                                        } else {
                                            rh6 = null;
                                        }
                                        QEW qew = (QEW) map4.get(rh6);
                                        if (qew != null) {
                                            C249703kE A09 = qew.A09(this);
                                            LinearLayout linearLayout = this.A00;
                                            if (linearLayout == null) {
                                                str = "listContainer";
                                            } else {
                                                linearLayout.addView(A09.itemView);
                                                qew.A0A(A09, sUj);
                                            }
                                        }
                                    }
                                }
                                return;
                            }
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("viewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public Q9z(Context context) {
        super(context);
        View.inflate(getContext(), R.layout.fbpay_ui_address_list_cell, this);
    }
}
