package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.E1q  reason: case insensitive filesystem */
public final class C47422E1q extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ChannelDurationSelectorFragment";
    public C49328Etj A00;
    public EWM A01;
    public boolean A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.07Z, X.E1q, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        View requireViewById = view2.requireViewById(R.id.channel_duration_chooser_indefinite_option);
        IgdsListCell igdsListCell = (IgdsListCell) requireViewById;
        0qQ.A0A(igdsListCell);
        EWM ewm = EWM.INDEFINITE;
        A00(ewm, igdsListCell);
        0qQ.A07(requireViewById);
        View requireViewById2 = view2.requireViewById(R.id.channel_duration_chooser_3_month_option);
        IgdsListCell igdsListCell2 = (IgdsListCell) requireViewById2;
        0qQ.A0A(igdsListCell2);
        EWM ewm2 = EWM.THREE_MONTHS;
        A00(ewm2, igdsListCell2);
        0qQ.A07(requireViewById2);
        View requireViewById3 = view2.requireViewById(R.id.channel_duration_chooser_1_month_option);
        IgdsListCell igdsListCell3 = (IgdsListCell) requireViewById3;
        0qQ.A0A(igdsListCell3);
        EWM ewm3 = EWM.ONE_MONTH;
        A00(ewm3, igdsListCell3);
        0qQ.A07(requireViewById3);
        View requireViewById4 = view2.requireViewById(R.id.channel_duration_chooser_1_day_option);
        IgdsListCell igdsListCell4 = (IgdsListCell) requireViewById4;
        0qQ.A0A(igdsListCell4);
        A00(EWM.ONE_DAY, igdsListCell4);
        0qQ.A07(requireViewById4);
        View requireViewById5 = view2.requireViewById(R.id.channel_duration_chooser_1_week_option);
        IgdsListCell igdsListCell5 = (IgdsListCell) requireViewById5;
        0qQ.A0A(igdsListCell5);
        A00(EWM.ONE_WEEK, igdsListCell5);
        0qQ.A07(requireViewById5);
        IgTextView A0G = AnonymousClass7TF.A0G(view2, R.id.options_description);
        EWM ewm4 = this.A01;
        if (ewm4 != null) {
            int i = 0;
            int i2 = 8;
            if (ewm4 == ewm) {
                i2 = 0;
            }
            igdsListCell.setVisibility(i2);
            EWM ewm5 = this.A01;
            if (ewm5 != null) {
                int i3 = 8;
                if (ewm5 == ewm2) {
                    i3 = 0;
                }
                igdsListCell2.setVisibility(i3);
                EWM ewm6 = this.A01;
                if (ewm6 != null) {
                    if (ewm6 != ewm3) {
                        i = 8;
                    }
                    igdsListCell3.setVisibility(i);
                    AnonymousClass11O.A03(DbW.A0E(this), new C61860pz(new C51644Fy3(A0G, this, igdsListCell, igdsListCell2, igdsListCell3, igdsListCell4, igdsListCell5, (AnonymousClass4D7) null), ((C46746DkZ) this.A04.getValue()).A01));
                    return;
                }
            }
        }
        0qQ.A0F("initialOption");
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A00(EWM ewm, IgdsListCell igdsListCell) {
        igdsListCell.A06(ewm.A01);
        igdsListCell.A0G(C69349Njo.TYPE_RADIO, true);
        igdsListCell.A0D(new FQ1(7, ewm, this));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public C47422E1q() {
        C46570DhC dhC = new C46570DhC(this, 25);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C46570DhC(new C46570DhC(this, 22), 23));
        this.A04 = DbS.A0I(new C46570DhC(A002, 24), dhC, new C73915Plq(23, A002, (Object) null), DbS.A0z(C46746DkZ.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(903797573);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_direct_channel_duration_chooser, false);
        AnonymousClass0fD.A09(254150434, A022);
        return A0D;
    }
}
