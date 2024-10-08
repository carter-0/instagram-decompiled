package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.textcell.IgdsListCell;

public final class NIO extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ChallengePrizeSelectorFragment";
    public O6P A00;
    public C69373NkD A01;
    public String A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.NIO, X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsListCell igdsListCell = (IgdsListCell) AnonymousClass7TF.A0G(view, R.id.challenge_prize_chooser_shoutout_option);
        IgdsListCell igdsListCell2 = (IgdsListCell) AnonymousClass7TF.A0G(view, R.id.challenge_prize_chooser_message_option);
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.challenge_prize_chooser_custom_option_edit);
        IgdsListCell igdsListCell3 = (IgdsListCell) AnonymousClass7TF.A0G(view, R.id.challenge_prize_chooser_custom_option_radio);
        igdsListCell.A0I(DbU.A0m(this, 2131954942));
        igdsListCell2.A0I(DbU.A0m(this, 2131954940));
        C69373NkD nkD = this.A01;
        if (nkD == null) {
            str = "initialOption";
        } else {
            if (nkD == C69373NkD.CUSTOM) {
                String str2 = this.A02;
                if (str2 == null) {
                    str = "customOptionValue";
                } else {
                    A0R.setText(str2, TextView.BufferType.EDITABLE);
                }
            } else {
                A0R.setHint(getString(2131954938));
            }
            igdsListCell.A0H(DbU.A0m(this, 2131954941));
            igdsListCell2.A0H(DbU.A0m(this, 2131954939));
            C69349Njo njo = C69349Njo.TYPE_RADIO;
            igdsListCell.A0G(njo, true);
            igdsListCell2.A0G(njo, true);
            igdsListCell3.A0G(njo, true);
            C71469OlD.A01(igdsListCell, this, 12);
            C71469OlD.A01(igdsListCell2, this, 13);
            C71469OlD.A01(igdsListCell3, this, 14);
            C71273OhE.A00(A0R, this, 12);
            JTS.A10(this, new MGM(igdsListCell2, igdsListCell, this, igdsListCell3, (AnonymousClass4D7) null, 5), ((C67722Mtb) this.A04.getValue()).A01);
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public NIO() {
        C67570Mq4 mq4 = new C67570Mq4(this, 34);
        AnonymousClass0eM A002 = C67570Mq4.A00(new C67570Mq4(this, 31), 0eO.A02, 32);
        this.A04 = DbS.A0I(new C67570Mq4(A002, 33), mq4, C73915Plq.A00(A002, (Object) null, 36), DbS.A0z(C67722Mtb.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1652202534);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_direct_challenge_prize_chooser, false);
        AnonymousClass0fD.A09(81500118, A022);
        return A0D;
    }
}
