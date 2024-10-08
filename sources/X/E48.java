package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.igds.components.textcell.IgdsFooterCell;

public final class E48 extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CreatorAITermsNuxFragment";
    public 2da A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = AnonymousClass1YB.A00(new C58683Ivs(this, 44));
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final AnonymousClass0eM A06;
    public final String A07;

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        this.A00 = r3;
        r3.EVS(true);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A0C = 2131954722;
        A0K.A0G = FP5.A00(this, 68);
        r3.A8p(new AnonymousClass3Jb(A0K));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        String A0t = DbS.A0t(this.A02);
        String A0t2 = DbS.A0t(this.A01);
        boolean A1Z = AnonymousClass7TF.A1Z(this.A03);
        AnonymousClass7TF.A1H(A0t, A0t2);
        FA6.A00((FA6) this.A04.getValue(), "view_fan_onboarding_nux", A0t, A0t2, A1Z);
        IgdsBulletCell igdsBulletCell = (IgdsBulletCell) view2.findViewById(R.id.creator_ai_nux_bullet_one);
        IgdsBulletCell igdsBulletCell2 = (IgdsBulletCell) view2.findViewById(R.id.creator_ai_nux_bullet_two);
        IgdsBulletCell igdsBulletCell3 = (IgdsBulletCell) view2.findViewById(R.id.creator_ai_nux_bullet_three);
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) view2.findViewById(R.id.creator_ai_nux_bottom_button_layout);
        07U r6 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C41548AwF(view2, r6, viewLifecycleOwner, this, igdsBottomButtonLayout, igdsBulletCell, igdsBulletCell2, igdsBulletCell3, (IgdsHeadline) view2.findViewById(R.id.creator_ai_nux_headline), (IgdsFooterCell) view2.findViewById(R.id.creator_ai_terms_footer), (AnonymousClass4D7) null), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final String getModuleName() {
        return this.A07;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final boolean onBackPressed() {
        String A0t = DbS.A0t(this.A02);
        String A0t2 = DbS.A0t(this.A01);
        boolean A1Z = AnonymousClass7TF.A1Z(this.A03);
        AnonymousClass7TG.A1N(A0t, A0t2);
        FA6.A00((FA6) this.A04.getValue(), "cancel_fan_onboarding_nux", A0t, A0t2, A1Z);
        ((C46767Dku) this.A06.getValue()).A00();
        return false;
    }

    public E48() {
        0eO r3 = 0eO.A02;
        String A002 = C273654mx.A00(136);
        this.A01 = AnonymousClass0eN.A00(r3, new C51803G2m((Object) this, A002, A002, 32));
        String A003 = C273654mx.A00(42);
        this.A02 = AnonymousClass0eN.A00(r3, new C51803G2m((Object) this, A003, A003, 33));
        String A004 = AnonymousClass000.A00(1240);
        this.A03 = AnonymousClass0eN.A00(r3, new C51803G2m((Object) this, A004, A004, 34));
        C58683Ivs ivs = new C58683Ivs(this, 48);
        AnonymousClass0eM A005 = AnonymousClass0eN.A00(r3, new C58683Ivs(new C58683Ivs(this, 45), 46));
        this.A06 = DbS.A0I(new C58683Ivs(A005, 47), ivs, new C58689Ivy(13, A005, (Object) null), DbS.A0z(C46767Dku.class));
        this.A07 = "creator_ai_nux";
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(557987280);
        E48.super.onCreate(bundle);
        2YL A0H = DbS.A0H(this.A06);
        C318136oS A002 = C318116oQ.A00(A0H);
        C58102ImO imO = new C58102ImO(A0H, (AnonymousClass4D7) null, 19);
        19B r3 = 19B.A00;
        1Eo.A05(r3, imO, A002);
        1Eo.A05(r3, new C58102ImO(A0H, (AnonymousClass4D7) null, 20), C318116oQ.A00(A0H));
        AnonymousClass0fD.A09(-2004017514, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2021020787);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.creator_ai_in_thread_nux, false);
        AnonymousClass0fD.A09(-807781549, A022);
        return A0D;
    }
}
