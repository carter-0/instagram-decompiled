package X;

import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.ArrayList;
import java.util.List;

public final class M1P implements 1aV {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public M1P(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A02 = obj;
        this.A01 = obj3;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C64102LMw lMw;
        if (this.A00 != 0) {
            int ordinal = ((C8913RFg) ((QP6) obj).A04).ordinal();
            if (ordinal != 2) {
                if (ordinal == 3) {
                    lMw = (C64102LMw) this.A02;
                    C313616gj r2 = (C313616gj) this.A01;
                    LEK lek = r2.A08;
                    if (lek != null) {
                        lek.A00(AnonymousClass05K.A0Y);
                    }
                    C358248ab A0U = DbW.A0U(r2.A0K);
                    A0U.A09(2131965432);
                    A0U.A08(2131965431);
                    Dba.A1L(A0U);
                    C62010KVj A002 = C63492Kxw.A00(r2.A0N);
                    0Aj A0e = AnonymousClass7TE.A0e(A002.A00, "ig_user_pay_viewer_payment_error_dialog_shown");
                    C64090LMi lMi = A002.A01;
                    C64090LMi.A00(A0e, lMi, "media_id", lMi.A02);
                    A0e.AAJ("product_type", lMi.A03);
                    A0e.AAJ(DevServerEntity.COLUMN_DESCRIPTION, "");
                    A0e.Cgf();
                } else if (ordinal == 5) {
                    lMw = (C64102LMw) this.A02;
                } else {
                    return;
                }
                lMw.A01.A01();
                return;
            }
            C64102LMw.A00(((C2815858p) this.A03).A01, (C313616gj) this.A01, (C64102LMw) this.A02);
        } else if (!((C8918RFl) obj).A01) {
            LFO lfo = (LFO) this.A03;
            T7R t7r = lfo.A05;
            C61071Jw9 jw9 = (C61071Jw9) this.A02;
            List<C60944Ju2> list = (List) jw9.A04;
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            for (C60944Ju2 ju2 : list) {
                A0r.add(ju2.A04);
            }
            t7r.A04(new C64430Lbl(0, jw9, lfo, this.A01), A0r, (List) null);
        } else {
            C249523jv r3 = (C249523jv) this.A01;
            r3.FIG(new C61131Jxh("iap_init_failure", (String) null, (String) null));
            r3.AI3((Throwable) null);
        }
    }
}
