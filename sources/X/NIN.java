package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.direct.fragment.prompts.challenges.duration.ChallengeDurationSelectorFragment$configureOptions$8;
import com.instagram.igds.components.textcell.IgdsListCell;

public final class NIN extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ChallengeDurationSelectorFragment";
    public O6O A00;
    public C69369Nk9 A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.07Z, X.NIN, java.lang.Object, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        IgdsListCell igdsListCell = (IgdsListCell) AnonymousClass7TF.A0G(view2, R.id.challenge_duration_chooser_1_min_option);
        IgdsListCell igdsListCell2 = (IgdsListCell) AnonymousClass7TF.A0G(view2, R.id.challenge_duration_chooser_5_min_option);
        IgdsListCell igdsListCell3 = (IgdsListCell) AnonymousClass7TF.A0G(view2, R.id.challenge_duration_chooser_1_hour_option);
        IgdsListCell igdsListCell4 = (IgdsListCell) AnonymousClass7TF.A0G(view2, R.id.challenge_duration_chooser_1_day_option);
        IgdsListCell igdsListCell5 = (IgdsListCell) AnonymousClass7TF.A0G(view2, R.id.challenge_duration_chooser_3_days_option);
        IgdsListCell igdsListCell6 = (IgdsListCell) AnonymousClass7TF.A0G(view2, R.id.challenge_duration_chooser_5_days_option);
        IgdsListCell igdsListCell7 = (IgdsListCell) AnonymousClass7TF.A0G(view2, R.id.challenge_duration_chooser_7_days_option);
        igdsListCell4.A06(2131954922);
        igdsListCell5.A06(2131954923);
        igdsListCell6.A06(2131954924);
        igdsListCell7.A06(2131954926);
        C69349Njo njo = C69349Njo.TYPE_RADIO;
        igdsListCell4.A0G(njo, true);
        igdsListCell5.A0G(njo, true);
        igdsListCell6.A0G(njo, true);
        igdsListCell7.A0G(njo, true);
        C71469OlD.A01(igdsListCell4, this, 5);
        C71469OlD.A01(igdsListCell5, this, 6);
        C71469OlD.A01(igdsListCell6, this, 7);
        C71469OlD.A01(igdsListCell7, this, 8);
        if (182.A06(0Tu.A05, DbT.A0X(this.A02), 36324312244105182L)) {
            igdsListCell.setVisibility(0);
            igdsListCell2.setVisibility(0);
            igdsListCell3.setVisibility(0);
            igdsListCell.A0G(njo, true);
            igdsListCell2.A0G(njo, true);
            igdsListCell3.A0G(njo, true);
            igdsListCell.A06(2131954921);
            igdsListCell2.A06(2131954925);
            igdsListCell3.A06(2131954920);
            C71469OlD.A01(igdsListCell, this, 9);
            C71469OlD.A01(igdsListCell2, this, 10);
            C71469OlD.A01(igdsListCell3, this, 11);
        }
        JTS.A10(this, new ChallengeDurationSelectorFragment$configureOptions$8(this, igdsListCell4, igdsListCell5, igdsListCell6, igdsListCell7, igdsListCell, igdsListCell2, igdsListCell3, (AnonymousClass4D7) null), ((C67721Mta) this.A03.getValue()).A01);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public NIN() {
        C67570Mq4 mq4 = new C67570Mq4(this, 29);
        AnonymousClass0eM A002 = C67570Mq4.A00(new C67570Mq4(this, 26), 0eO.A02, 27);
        this.A03 = DbS.A0I(new C67570Mq4(A002, 28), mq4, C73915Plq.A00(A002, (Object) null, 35), DbS.A0z(C67721Mta.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(579165183);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_direct_challenge_duration_chooser, false);
        AnonymousClass0fD.A09(-1544780891, A022);
        return A0D;
    }
}
