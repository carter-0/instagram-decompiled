package X;

import android.view.View;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;

/* renamed from: X.Wet  reason: case insensitive filesystem */
public final class C19752Wet implements X5E {
    public final int A00;
    public final Object A01;

    public C19752Wet(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void D1Z(IgRadioGroup igRadioGroup, int i) {
        Object obj;
        Integer num;
        C68484NKb nKb;
        C69257NiJ niJ;
        switch (this.A00) {
            case 0:
                if (i != -1) {
                    View findViewById = igRadioGroup.findViewById(i);
                    if (findViewById != null) {
                        obj = findViewById.getTag();
                    } else {
                        obj = null;
                    }
                    if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
                        ((C14788U8z) ((C15299Ua6) this.A01).A0G.getValue()).A04(num);
                        return;
                    }
                }
                ((C14788U8z) ((C15299Ua6) this.A01).A0G.getValue()).A04((Integer) null);
                return;
            case 1:
                if (i == -1) {
                    C17939ViU viU = (C17939ViU) this.A01;
                    viU.A06.A09(viU.A05, (String) null);
                    return;
                }
                Object tag = AnonymousClass7TF.A0G(igRadioGroup, i).getTag();
                DbS.A1Y(tag);
                C17939ViU viU2 = (C17939ViU) this.A01;
                viU2.A06.A09(viU2.A05, (String) tag);
                return;
            case 2:
                U8Y u8y = (U8Y) ((C15300Ua7) this.A01).A04.getValue();
                Object tag2 = igRadioGroup.requireViewById(i).getTag();
                0qQ.A0C(tag2, "null cannot be cast to non-null type com.instagram.api.schemas.XIGIGBoostCallToAction");
                XIGIGBoostCallToAction xIGIGBoostCallToAction = (XIGIGBoostCallToAction) tag2;
                0qQ.A0B(xIGIGBoostCallToAction, 0);
                u8y.A07.Epw(xIGIGBoostCallToAction);
                u8y.A02.A0d = xIGIGBoostCallToAction;
                return;
            default:
                if (i == -1) {
                    nKb = (C68484NKb) this.A01;
                    niJ = null;
                } else {
                    View requireViewById = igRadioGroup.requireViewById(i);
                    nKb = (C68484NKb) this.A01;
                    niJ = (C69257NiJ) requireViewById.getTag();
                }
                nKb.A01 = niJ;
                return;
        }
    }
}
