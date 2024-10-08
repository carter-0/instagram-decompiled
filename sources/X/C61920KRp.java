package X;

import android.view.View;
import com.instagram.igtv.widget.ExpandableTextView;

/* renamed from: X.KRp  reason: case insensitive filesystem */
public final class C61920KRp extends C253103qD {
    public final int A00 = 1;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61920KRp(LD7 ld7, int i) {
        super("", i, false);
        this.A01 = ld7;
    }

    public final void onClick(View view) {
        SUL sul;
        switch (this.A00) {
            case 0:
                JYT jyt = ((C67116Mia) this.A01).A00;
                sul = Dba.A0J(jyt.A00, jyt.A01, 2EG.A1V, C66579MXk.A00(326));
                sul.A0S = C66579MXk.A00(778);
                break;
            case 1:
                LD7 ld7 = (LD7) this.A01;
                sul = Dba.A0J(ld7.A00, ld7.A01, 2EG.A1V, AnonymousClass000.A00(1421));
                break;
            default:
                C66401MQh mQh = ((ExpandableTextView) this.A01).A01;
                if (mQh != null) {
                    C60676JpN jpN = ((C65415Lsv) mQh).A00;
                    int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                    C60430JlN jlN = jpN.A07.A01;
                    if (jlN == null) {
                        0qQ.A0F("seriesAdapter");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    jlN.A03 = true;
                    jlN.notifyItemChanged(0);
                    return;
                }
                return;
        }
        sul.A0A();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61920KRp(C67116Mia mia, int i) {
        super("", i, false);
        this.A01 = mia;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61920KRp(ExpandableTextView expandableTextView, int i) {
        super(false, i);
        this.A01 = expandableTextView;
    }
}
