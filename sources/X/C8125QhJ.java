package X;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.EcpNuxLearnMoreScreenStyle;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.listcell.ListCell;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.QhJ  reason: case insensitive filesystem */
public final class C8125QhJ extends QCJ {
    public ContextThemeWrapper A00;
    public ECPPaymentRequest A01;
    public QDM A02;
    public LoggingContext A03;

    public final void onViewCreated(View view, Bundle bundle) {
        CharSequence charSequence;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (getActivity() != null) {
            ImageView A0F = DbU.A0F(view, R.id.pay_logo);
            A0F.setImageDrawable(AnonymousClass2E0.A0A().A05(AnonymousClass7TE.A0S(A0F), 39, 33));
            ContextThemeWrapper contextThemeWrapper = this.A00;
            if (contextThemeWrapper != null) {
                DbU.A12(contextThemeWrapper, A0F, 2131961173);
                TextView A0G = DbU.A0G(view, R.id.sheet_title_text);
                0qQ.A0A(A0G);
                SRn.A02(A0G, RH2.A0b);
                ContextThemeWrapper contextThemeWrapper2 = this.A00;
                if (contextThemeWrapper2 != null) {
                    A0G.setText(contextThemeWrapper2.getText(2131961382));
                    ListCell listCell = (ListCell) view.requireViewById(R.id.payment_cell);
                    RH2 rh2 = RH2.A0c;
                    listCell.setPrimaryTextStyle(rh2);
                    ContextThemeWrapper contextThemeWrapper3 = this.A00;
                    if (contextThemeWrapper3 != null) {
                        Pxh.A13(contextThemeWrapper3, listCell, 2131961380);
                        ContextThemeWrapper contextThemeWrapper4 = this.A00;
                        if (contextThemeWrapper4 != null) {
                            Q9S q9s = new Q9S(contextThemeWrapper4);
                            q9s.setIcon(RH3.A0F);
                            listCell.setLeftAddOnIcon(q9s);
                            ListCell listCell2 = (ListCell) view.requireViewById(R.id.data_cell);
                            listCell2.setPrimaryTextStyle(rh2);
                            ContextThemeWrapper contextThemeWrapper5 = this.A00;
                            if (contextThemeWrapper5 != null) {
                                Pxh.A13(contextThemeWrapper5, listCell2, 2131961377);
                                ContextThemeWrapper contextThemeWrapper6 = this.A00;
                                if (contextThemeWrapper6 != null) {
                                    Q9S q9s2 = new Q9S(contextThemeWrapper6);
                                    q9s2.setIcon(RH3.A0G);
                                    listCell2.setLeftAddOnIcon(q9s2);
                                    ListCell listCell3 = (ListCell) view.requireViewById(R.id.fraud_cell);
                                    listCell3.setPrimaryTextStyle(rh2);
                                    ContextThemeWrapper contextThemeWrapper7 = this.A00;
                                    if (contextThemeWrapper7 != null) {
                                        Pxh.A13(contextThemeWrapper7, listCell3, 2131961364);
                                        ContextThemeWrapper contextThemeWrapper8 = this.A00;
                                        if (contextThemeWrapper8 != null) {
                                            Q9S q9s3 = new Q9S(contextThemeWrapper8);
                                            q9s3.setIcon(RH3.A0E);
                                            listCell3.setLeftAddOnIcon(q9s3);
                                            ListCell listCell4 = (ListCell) view.requireViewById(R.id.pin_cell);
                                            listCell4.setPrimaryTextStyle(rh2);
                                            ContextThemeWrapper contextThemeWrapper9 = this.A00;
                                            if (contextThemeWrapper9 != null) {
                                                Pxh.A13(contextThemeWrapper9, listCell4, 2131961381);
                                                ContextThemeWrapper contextThemeWrapper10 = this.A00;
                                                if (contextThemeWrapper10 != null) {
                                                    Q9S q9s4 = new Q9S(contextThemeWrapper10);
                                                    q9s4.setIcon(RH3.A0I);
                                                    listCell4.setLeftAddOnIcon(q9s4);
                                                    ListCell listCell5 = (ListCell) view.requireViewById(R.id.help_cell);
                                                    listCell5.setPrimaryTextStyle(rh2);
                                                    ContextThemeWrapper contextThemeWrapper11 = this.A00;
                                                    if (contextThemeWrapper11 != null) {
                                                        Pxh.A13(contextThemeWrapper11, listCell5, 2131961379);
                                                        ContextThemeWrapper contextThemeWrapper12 = this.A00;
                                                        if (contextThemeWrapper12 != null) {
                                                            Q9S q9s5 = new Q9S(contextThemeWrapper12);
                                                            q9s5.setIcon(RH3.A0H);
                                                            listCell5.setLeftAddOnIcon(q9s5);
                                                            TextView A0G2 = DbU.A0G(view, R.id.footer_text);
                                                            0qQ.A0A(A0G2);
                                                            SRn.A02(A0G2, RH2.A0a);
                                                            ECPPaymentRequest eCPPaymentRequest = this.A01;
                                                            if (eCPPaymentRequest != null) {
                                                                EcpNuxLearnMoreScreenStyle ecpNuxLearnMoreScreenStyle = eCPPaymentRequest.A04.A08;
                                                                if (ecpNuxLearnMoreScreenStyle == null || (charSequence = ecpNuxLearnMoreScreenStyle.A00) == null) {
                                                                    ContextThemeWrapper contextThemeWrapper13 = this.A00;
                                                                    if (contextThemeWrapper13 != null) {
                                                                        String obj = contextThemeWrapper13.getText(2131961378).toString();
                                                                        ArrayList A1C = AnonymousClass7TE.A1C();
                                                                        SR9 sr9 = new SR9();
                                                                        sr9.A03("https://www.facebook.com/help/565350107604363?ref=learn_more");
                                                                        sr9.A01 = 2131961362;
                                                                        SR9.A02(sr9, "[[manage_payment_info_token]]", A1C);
                                                                        SR9 sr92 = new SR9();
                                                                        sr92.A03("https://www.facebook.com/privacy/explanation/");
                                                                        sr92.A01 = 2131961368;
                                                                        SR9.A02(sr92, "[[data_terms_token]]", A1C);
                                                                        SR9 sr93 = new SR9();
                                                                        sr93.A03("https://www.facebook.com/payments_terms/");
                                                                        sr93.A01 = 2131961418;
                                                                        SR9.A02(sr93, "[[payment_terms_token]]", A1C);
                                                                        QmZ A002 = C9671Rep.A00(requireContext(), ImmutableList.copyOf((Collection) A1C), obj, false);
                                                                        C12468Sv0 sv0 = new C12468Sv0(this, 8);
                                                                        0qQ.A0B(sv0, 0);
                                                                        charSequence = A002.A01(sv0, false);
                                                                    }
                                                                }
                                                                A0G2.setText(charSequence);
                                                                AnonymousClass2E0.A0A();
                                                                A0G2.setLinkTextColor(AnonymousClass7TE.A0S(A0G2).getColor(R.color.igds_link));
                                                                A0G2.setMovementMethod(new LinkMovementMethod());
                                                                A0G2.setTextAlignment(4);
                                                                View A0G3 = AnonymousClass7TF.A0G(view, R.id.divider);
                                                                ContextThemeWrapper contextThemeWrapper14 = this.A00;
                                                                if (contextThemeWrapper14 != null) {
                                                                    C11386SQz.A00(contextThemeWrapper14, A0G3, 19, false);
                                                                }
                                                            }
                                                            0qQ.A0F("ecpPaymentRequest");
                                                            throw AnonymousClass00P.createAndThrow();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            0qQ.A0F("viewContext");
            throw AnonymousClass00P.createAndThrow();
        }
        C8608Qxp A0K = Pxi.A0K(this);
        AnonymousClass7TF.A1J(A0K, A0K.A0D, C8608Qxp.A0X, 19, false);
        STG.A02(this);
        ECPPaymentRequest eCPPaymentRequest2 = this.A01;
        if (eCPPaymentRequest2 != null) {
            if (C11432SUd.A0N(eCPPaymentRequest2)) {
                Pxi.A0K(this).A0H();
                return;
            }
            return;
        }
        0qQ.A0F("ecpPaymentRequest");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(-1671690960);
        C8125QhJ.super.onCreate(bundle);
        this.A03 = (LoggingContext) Pxj.A0H(this);
        this.A01 = QCJ.A01(this);
        LoggingContext loggingContext = this.A03;
        if (loggingContext != null) {
            this.A02 = C11086S9g.A00(this, (ECPPaymentRequest) null, loggingContext);
            C12411Sto A0g = C51965G9l.A0g();
            LoggingContext loggingContext2 = this.A03;
            if (loggingContext2 != null) {
                QDM qdm = this.A02;
                if (qdm == null) {
                    str = "ecpNuxViewModel";
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                TY3.A00(C51965G9l.A0U(C51969G9p.A0d(A0g.A00, "client_load_ecpbranding_success"), 53), loggingContext2, SUU.A08(qdm.A0S), "ecp_branding_banner_learn_more_detail", 21);
                AnonymousClass0fD.A09(20044657, A022);
                return;
            }
        }
        str = "loggingContext";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(346895413);
        ContextThemeWrapper A002 = QCJ.A00(this, layoutInflater);
        this.A00 = A002;
        View inflate = layoutInflater.cloneInContext(A002).inflate(R.layout.ecp_nux_learn_more_fragment, viewGroup, false);
        AnonymousClass0fD.A09(246790472, A022);
        return inflate;
    }
}
