package com.instagram.business.fragment;

import X.0eE;
import X.0qQ;
import X.15p;
import X.1NY;
import X.2da;
import X.AnonymousClass0fD;
import X.AnonymousClass0t1;
import X.AnonymousClass0wW;
import X.AnonymousClass4DH;
import X.AnonymousClass4DS;
import X.AnonymousClass7AV;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C274674os;
import X.C324066yY;
import X.C47334Dv1;
import X.C47697EDg;
import X.C49935FFo;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbW;
import X.DbX;
import X.DbY;
import X.DbZ;
import X.Dba;
import X.E9A;
import X.ESx;
import X.F58;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.io.Serializable;
import java.util.List;

public class SupportServicePartnerSelectionFragment extends AnonymousClass4DH implements AnonymousClass4DS {
    public C274674os A00;
    public SMBPartnerType A01;
    public E9A A02;
    public C49935FFo A03;
    public UserSession A04;
    public String A05;
    public String A06;
    public List A07;
    public boolean A08;
    public SpinnerImageView mLoadingSpinner;
    public RecyclerView mRecyclerView;

    public final String getModuleName() {
        return "service_partner_selection";
    }

    public final void configureActionBar(2da r3) {
        if (this.A05.equals("sticker")) {
            r3.ErN(DbV.A05(this).getString(2131974805));
        } else {
            DbW.A1B(r3, 2131952133);
        }
    }

    public final AnonymousClass0wW getSession() {
        return this.A04;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(895805237);
        SupportServicePartnerSelectionFragment.super.onCreate(bundle);
        this.A02 = new E9A(this);
        Bundle requireArguments = requireArguments();
        this.A04 = DbX.A0U(this);
        this.A06 = DbU.A0l(requireArguments, "args_session_id");
        this.A05 = DbU.A0l(requireArguments, "args_entry_point");
        Serializable serializable = requireArguments.getSerializable("args_service_type");
        serializable.getClass();
        this.A01 = (SMBPartnerType) serializable;
        this.A03 = new C49935FFo(this, this.A04, this.A06, this.A05);
        UserSession userSession = this.A04;
        0eE r2 = AnonymousClass0t1.A01;
        this.A08 = AnonymousClass7TF.A1V(C324066yY.A00(this.A01, r2.A01(userSession)));
        this.A00 = C324066yY.A00(this.A01, r2.A01(this.A04));
        AnonymousClass0fD.A09(1304577856, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1720926573);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.support_service_partner_selection_fragment);
        AnonymousClass0fD.A09(52117911, A022);
        return A0C;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        boolean z;
        15p r3;
        1NY A0b;
        String str;
        super.onViewCreated(view, bundle);
        this.mLoadingSpinner = (SpinnerImageView) view.findViewById(R.id.loading_indicator);
        RecyclerView A0K = DbX.A0K(view);
        this.mRecyclerView = A0K;
        A0K.setAdapter(this.A02);
        if (this.A07 == null) {
            AnonymousClass7TF.A16(this.mLoadingSpinner);
            C47697EDg A002 = C47697EDg.A00(this, 32);
            SMBPartnerType sMBPartnerType = this.A01;
            if (sMBPartnerType.equals(SMBPartnerType.GIFT_CARD)) {
                UserSession userSession = this.A04;
                z = false;
                0qQ.A0B(userSession, 0);
                r3 = null;
                A0b = AnonymousClass7TG.A0b(userSession);
                str = "business/instant_experience/get_support_button_partners_bundle/";
            } else if (sMBPartnerType.equals(SMBPartnerType.FOOD_DELIVERY)) {
                UserSession userSession2 = this.A04;
                z = false;
                0qQ.A0B(userSession2, 0);
                r3 = null;
                A0b = AnonymousClass7TG.A0b(userSession2);
                str = "business/instant_experience/get_delivery_button_partners_bundle/";
            }
            A0b.A0E = str;
            A0b.A0O(r3, C47334Dv1.class, F58.class, z);
            A0b.A0R = true;
            DbW.A1E(A0b, A002, this);
        }
        TextView A062 = Dba.A06(view);
        if (this.A05.equals("sticker")) {
            i = 2131973131;
            if (this.A01.equals(SMBPartnerType.GIFT_CARD)) {
                i = 2131973132;
            }
        } else {
            i = 2131973130;
        }
        DbU.A1G(A062, this, i);
        TextView A052 = Dba.A05(view);
        int i2 = 2131973127;
        if (this.A05.equals("sticker")) {
            i2 = 2131973128;
            if (this.A01.equals(SMBPartnerType.GIFT_CARD)) {
                i2 = 2131973129;
            }
        }
        String string = getString(2131954400);
        SpannableStringBuilder A0E = DbY.A0E(this, string, i2);
        AnonymousClass7AV.A05(A0E, new ESx(Integer.valueOf(DbZ.A01(this)), (Object) this, 4), string);
        A052.setText(A0E);
        A052.setHighlightColor(0);
        DbT.A1H(A052);
    }
}
