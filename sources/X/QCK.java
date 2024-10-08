package X;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebookpay.common.recyclerview.adapteritems.PuxTermsConditionItem;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.listcell.ListCell;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import java.util.List;

public final class QCK extends Fragment {
    public ContextThemeWrapper A00;
    public TextView A01;
    public PuxTermsConditionItem A02;
    public QDN A03;
    public ListCell A04;
    public ListCell A05;
    public ListCell A06;
    public ListCell A07;
    public int A08 = 1;

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        this.A03 = C11086S9g.A01(this, (ECPPaymentRequest) null, (LoggingContext) Pxj.A0H(this));
        if (getActivity() != null) {
            view.requireViewById(R.id.terms_scroll_view);
            TextView A0G = DbU.A0G(view, R.id.sheet_body_text);
            0qQ.A0A(A0G);
            SRn.A02(A0G, RH2.PRIMARY_TEXT_DEEMPHASIZED);
            C11409SSh.A05(A0G, 2132017643, false);
            this.A01 = A0G;
            ListCell listCell = (ListCell) view.requireViewById(R.id.terms_link);
            0qQ.A0A(listCell);
            A01(listCell);
            this.A07 = listCell;
            ListCell listCell2 = (ListCell) view.requireViewById(R.id.policy_link);
            0qQ.A0A(listCell2);
            A01(listCell2);
            this.A05 = listCell2;
            ListCell listCell3 = (ListCell) view.requireViewById(R.id.support_link);
            0qQ.A0A(listCell3);
            A01(listCell3);
            this.A06 = listCell3;
            ListCell listCell4 = (ListCell) view.requireViewById(R.id.additional_link);
            0qQ.A0A(listCell4);
            A01(listCell4);
            this.A04 = listCell4;
        }
        int i = this.A08;
        if (i == 0 || i == 8) {
            Pxi.A0K(this).A0H();
        }
    }

    private final void A00(C7X c7x, ListCell listCell) {
        if (c7x != null) {
            listCell.setPrimaryText(C41845B3m.A0l(c7x, 0));
            ImmutableList A0E = c7x.A0E();
            0qQ.A07(A0E);
            AnonymousClass0fU.A00(new C11484Sb7(AnonymousClass7TE.A19(C11295SKd.A00(A0E), 0), this, 2), listCell);
            C18674VwX.A01(listCell, AnonymousClass05K.A01, (String) null);
            return;
        }
        listCell.setVisibility(8);
    }

    public static final void A01(ListCell listCell) {
        listCell.setPrimaryTextStyle(RH2.PRIMARY_TEXT);
        Q9O q9o = new Q9O(AnonymousClass7TE.A0S(listCell));
        q9o.setIcon(RH3.A0e);
        listCell.setRightAddOnIcon(q9o);
    }

    public final void onCreate(Bundle bundle) {
        CheckoutConfiguration checkoutConfiguration;
        int A022 = AnonymousClass0fD.A02(1337189204);
        QCK.super.onCreate(bundle);
        ECPPaymentRequest eCPPaymentRequest = (ECPPaymentRequest) requireArguments().getParcelable("ECP_LAUNCH_PARAMS");
        if (!(eCPPaymentRequest == null || (checkoutConfiguration = eCPPaymentRequest.A01) == null)) {
            this.A08 = checkoutConfiguration.A00;
        }
        AnonymousClass0fD.A09(-1104134292, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(419946044);
        ContextThemeWrapper A0K = Pxj.A0K(this, layoutInflater);
        this.A00 = A0K;
        View inflate = layoutInflater.cloneInContext(A0K).inflate(R.layout.ecp_terms_condition_content_fragment, viewGroup, false);
        AnonymousClass0fD.A09(365068557, A022);
        return inflate;
    }

    public final void onResume() {
        PuxTermsConditionItem puxTermsConditionItem;
        String str;
        String str2;
        int A022 = AnonymousClass0fD.A02(-1225017767);
        QCK.super.onResume();
        QDN qdn = this.A03;
        if (qdn == null) {
            str = "ecpViewModel";
        } else {
            SUj A0W = Pxe.A0W(qdn.A0z);
            if (A0W == null || (puxTermsConditionItem = (PuxTermsConditionItem) A0W.A01) == null || A0W.A00 == C8882RDz.ERROR) {
                puxTermsConditionItem = new PuxTermsConditionItem((C7X) null, (C7X) null, (C7X) null, (C7X) null, RH6.A0m, (String) null, (String) null, (List) null, (List) null, false);
            }
            this.A02 = puxTermsConditionItem;
            String str3 = puxTermsConditionItem.A06;
            if (str3 != null) {
                ContextThemeWrapper contextThemeWrapper = this.A00;
                if (contextThemeWrapper == null) {
                    str2 = "viewContext";
                    0qQ.A0F(str2);
                    throw AnonymousClass00P.createAndThrow();
                }
                C9656Rea.A00(contextThemeWrapper, this, C8924RFs.A0G, str3, (String) null, TV4.A00, TV5.A00, false, false);
            }
            PuxTermsConditionItem puxTermsConditionItem2 = this.A02;
            String str4 = "termsCondition";
            if (puxTermsConditionItem2 != null) {
                List list = puxTermsConditionItem2.A07;
                if (list != null) {
                    TextView textView = this.A01;
                    if (textView == null) {
                        str = "sheetBodyTextView";
                    } else {
                        textView.setText(C66581MXm.A0w("\n\n", list));
                    }
                }
                ListCell listCell = this.A07;
                if (listCell == null) {
                    str4 = "termsListCell";
                } else {
                    PuxTermsConditionItem puxTermsConditionItem3 = this.A02;
                    if (puxTermsConditionItem3 != null) {
                        A00(puxTermsConditionItem3.A02, listCell);
                        ListCell listCell2 = this.A05;
                        if (listCell2 == null) {
                            str4 = "policyListCell";
                        } else {
                            PuxTermsConditionItem puxTermsConditionItem4 = this.A02;
                            if (puxTermsConditionItem4 != null) {
                                A00(puxTermsConditionItem4.A03, listCell2);
                                PuxTermsConditionItem puxTermsConditionItem5 = this.A02;
                                if (puxTermsConditionItem5 != null) {
                                    List list2 = puxTermsConditionItem5.A08;
                                    if (list2 != null) {
                                        int size = list2.size();
                                        str = "additionalListCell";
                                        str2 = "supportListCell";
                                        if (size == 1) {
                                            ListCell listCell3 = this.A06;
                                            if (listCell3 != null) {
                                                A00((C7X) list2.get(0), listCell3);
                                                ListCell listCell4 = this.A04;
                                                if (listCell4 != null) {
                                                    listCell4.setVisibility(8);
                                                }
                                            }
                                            0qQ.A0F(str2);
                                            throw AnonymousClass00P.createAndThrow();
                                        } else if (size == 2) {
                                            ListCell listCell5 = this.A06;
                                            if (listCell5 != null) {
                                                A00((C7X) list2.get(0), listCell5);
                                                ListCell listCell6 = this.A04;
                                                if (listCell6 != null) {
                                                    A00((C7X) list2.get(1), listCell6);
                                                }
                                            }
                                            0qQ.A0F(str2);
                                            throw AnonymousClass00P.createAndThrow();
                                        }
                                    }
                                    AnonymousClass0fD.A09(1768747827, A022);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            0qQ.A0F(str4);
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
