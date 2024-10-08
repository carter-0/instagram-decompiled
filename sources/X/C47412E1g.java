package X;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.android.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.E1g  reason: case insensitive filesystem */
public final class C47412E1g extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "TranslateToBottomSheetFragment";
    public String A00;
    public Context A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03;

    public final String getModuleName() {
        return "translate_to_bottomsheet_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) AnonymousClass7TF.A0G(view, R.id.translate_to_bottomsheet_layout);
        Integer[] A002 = AnonymousClass05K.A00(5);
        int length = A002.length;
        int i2 = 0;
        while (i2 < length) {
            Integer num = A002[i2];
            Context context = this.A01;
            if (context != null) {
                IgdsListCell igdsListCell = new IgdsListCell(context, (AttributeSet) null);
                Context context2 = this.A01;
                if (context2 != null) {
                    switch (num.intValue()) {
                        case 1:
                            i = 2131964635;
                            break;
                        case 2:
                            i = 2131964636;
                            break;
                        case 3:
                            i = 2131964633;
                            break;
                        case 4:
                            i = 2131964634;
                            break;
                        default:
                            i = 2131964632;
                            break;
                    }
                    igdsListCell.A0I(AnonymousClass7TE.A16(context2, i));
                    igdsListCell.A0G(C69349Njo.TYPE_RADIO, true);
                    07U r11 = 07U.A05;
                    AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
                    AnonymousClass7TE.A1Z(new C59703JUk((Object) num, (Object) this, (Object) viewLifecycleOwner, (Object) igdsListCell, (Object) r11, (AnonymousClass4D7) null, 22), AnonymousClass07a.A00(viewLifecycleOwner));
                    igdsListCell.A0D(new FQ1(5, num, this));
                    viewGroup.addView(igdsListCell);
                    i2++;
                }
            }
            0qQ.A0F("context");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public C47412E1g() {
        C20609Wvq wvq = new C20609Wvq(this, 23);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20609Wvq(new C20609Wvq(this, 20), 21));
        this.A03 = DbS.A0I(new C20609Wvq(A002, 22), wvq, new C41566AwY(48, (Object) null, A002), DbS.A0z(C46745DkY.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1587939566);
        C47412E1g.super.onCreate(bundle);
        this.A01 = requireContext();
        AnonymousClass0fD.A09(-1920534990, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-813171420);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.translate_to_bottomsheet, false);
        AnonymousClass0fD.A09(1288032919, A022);
        return A0D;
    }

    public final void onDestroy() {
        int i;
        int A022 = AnonymousClass0fD.A02(1071140235);
        super.onDestroy();
        AnonymousClass0eM r8 = this.A03;
        String str = (String) ((C46745DkY) r8.getValue()).A01.getValue();
        String str2 = this.A00;
        if (str2 != null) {
            if (0qQ.A0K(str, str2)) {
                i = 828133300;
            } else {
                AnonymousClass0eM r4 = this.A02;
                Set A0J = DbX.A0h(r4).A0J(0sc.A06(new String[]{00R.A03(DbT.A10(AnonymousClass1Q2.A02()), 2)}));
                String str3 = this.A00;
                if (str3 != null) {
                    A0J.remove(str3);
                    A0J.add(str);
                    DbX.A0h(r4).A1A(A0J);
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    for (EWL ewl : EWL.A02) {
                        2IV r5 = new 2IV();
                        String str4 = ewl.A01;
                        r5.A08("enabled", DbT.A0l(A0J.contains(str4)));
                        r5.A09(str4, "language");
                        A1C.add(r5);
                    }
                    2IV r2 = new 2IV();
                    r2.A05("translate_from_preference", A1C);
                    2IS A04 = C41845B3m.A04();
                    2IS A042 = C41845B3m.A04();
                    A04.A00(r2, "input");
                    PandoGraphQLRequest A002 = C50169FSb.A00(A04, A042);
                    1vn A0G = Dba.A0G(r4);
                    0qQ.A0A(A002);
                    A0G.ATL(C50155FRn.A00, FSM.A00, A002);
                    0qQ.A0B(str, 0);
                    ((C46745DkY) r8.getValue()).A00.Epw(str);
                    0xY A0N = AnonymousClass7TF.A0N(AnonymousClass7TE.A0l(r4));
                    A0N.E5g("translate_to_language", str);
                    A0N.apply();
                    AnonymousClass0K0 r22 = GraphQlCallInput.A02;
                    0Df A032 = C41845B3m.A03(r22, 0, "preference_rank");
                    0Df.A00(A032, str, "language");
                    0Df A023 = r22.A02();
                    A023.A0E(A032, "translate_to_preference");
                    2IS A043 = C41845B3m.A04();
                    PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41847B3o.A04(A023, A043, "input"), "SetTranslateToPreference", A043.getParamsCopy(), C41845B3m.A04().getParamsCopy(), BdB.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_set_translate_to_preference", AnonymousClass7TE.A1C());
                    Dba.A0G(r4).ATL(C50156FRo.A00, FSN.A00, pandoGraphQLRequest);
                    i = -947529500;
                }
            }
            AnonymousClass0fD.A09(i, A022);
            return;
        }
        0qQ.A0F("initialSelectedLanguage");
        throw AnonymousClass00P.createAndThrow();
    }
}
