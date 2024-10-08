package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebookpay.widget.accessibility.AccessibleTextView;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public abstract class RRI {
    public Q6J A00;
    public Map A01;

    public final void A01() {
        View findViewById;
        View findViewById2;
        if (this instanceof C8121QhD) {
            View view = ((BrowserLiteFragment) ((C8121QhD) this).A01).A0B;
            if (view != null && (findViewById2 = view.findViewById(R.id.metacheckout_disclosure_footer)) != null) {
                findViewById2.setVisibility(8);
                C8121QhD.A00(view, 0);
                return;
            }
            return;
        }
        View view2 = ((BrowserLiteFragment) ((C8120QhC) this).A00).A0B;
        if (view2 != null && (findViewById = view2.findViewById(R.id.metapay_disclosure_footer)) != null) {
            findViewById.setVisibility(8);
        }
    }

    public final void A02() {
        int A002;
        int A003;
        int indexOfKey;
        int indexOfKey2;
        int i;
        Resources resources;
        if (this instanceof C8121QhD) {
            C8121QhD qhD = (C8121QhD) this;
            View view = ((BrowserLiteFragment) qhD.A01).A0B;
            if (view != null) {
                View findViewById = view.findViewById(R.id.metacheckout_disclosure_footer);
                if (findViewById != null) {
                    findViewById.setVisibility(0);
                } else {
                    ViewStub viewStub = (ViewStub) view.findViewById(R.id.shops_lite_disclaimer_stub);
                    if (viewStub != null) {
                        View A0H = JTP.A0H(viewStub, R.layout.ads_disclosure_footer_metacheckout);
                        0qQ.A07(A0H);
                        Q6J q6j = qhD.A00;
                        if (q6j != null) {
                            View A0b = AnonymousClass7TE.A0b(A0H, R.id.metacheckout_disclosure_footer_divider);
                            AnonymousClass2E0.A0A();
                            Pxf.A1B(A0H, q6j.getColor(R.color.igds_elevated_background));
                            AnonymousClass2E0.A0A();
                            Pxf.A1B(A0b, q6j.getColor(R.color.igds_separator));
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            Q8I q8i = new Q8I(0, qhD, q6j);
                            C13895TjI tjI = qhD.A03;
                            spannableStringBuilder.append(tjI.getText());
                            int AtB = tjI.AtB();
                            int AtF = tjI.AtF();
                            spannableStringBuilder.setSpan(q8i, AtB, AtF, 33);
                            TextView A0B = DbW.A0B(A0H, R.id.metacheckout_disclosure_footer_body_text);
                            DbX.A1G(A0B, spannableStringBuilder);
                            AnonymousClass2E0.A0A();
                            A0B.setHighlightColor(q6j.getColor(R.color.igds_elevated_background));
                            C10395RrW A004 = C9227RUe.A00(q6j);
                            XRw xRw = XRw.A04;
                            SparseIntArray sparseIntArray = A004.A01;
                            if (sparseIntArray == null || (indexOfKey2 = sparseIntArray.indexOfKey(R.attr.fds_usage_primary_text)) < 0) {
                                A002 = RVM.A00(A004.A00, xRw);
                            } else {
                                A002 = sparseIntArray.valueAt(indexOfKey2);
                            }
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(A002), 0, AtB, 33);
                            C10395RrW A005 = C9227RUe.A00(q6j);
                            XRw xRw2 = XRw.A03;
                            SparseIntArray sparseIntArray2 = A005.A01;
                            if (sparseIntArray2 == null || (indexOfKey = sparseIntArray2.indexOfKey(R.attr.fds_usage_blue_link)) < 0) {
                                A003 = RVM.A00(A005.A00, xRw2);
                            } else {
                                A003 = sparseIntArray2.valueAt(indexOfKey);
                            }
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(A003), AtB, AtF, 33);
                            try {
                                A0B.setContentDescription(tjI.getDescription());
                            } catch (Exception unused) {
                            }
                        }
                    } else {
                        return;
                    }
                }
                Context context = qhD.A00;
                if (context == null || (resources = context.getResources()) == null) {
                    i = 0;
                } else {
                    i = (resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material) * 2) + resources.getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size) + resources.getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height);
                }
                C8121QhD.A00(view, i);
                Intent intent = qhD.A02.getIntent();
                if (intent == null || intent.getBooleanExtra("BrowserLiteIntent.EXTRA_IS_LOGGING_ENABLED", true)) {
                    C8902REu rEu = C8902REu.CLIENT_RENDER_OFFSITEFOOTER_DISPLAY;
                    0sm r0 = qhD.A01;
                    if (r0 == null) {
                        r0 = 0Yt.A0E();
                    }
                    C11418SSt.A03(rEu, r0);
                    return;
                }
                return;
            }
            return;
        }
        C8120QhC qhC = (C8120QhC) this;
        View view2 = ((BrowserLiteFragment) qhC.A00).A0B;
        if (view2 != null) {
            View findViewById2 = view2.findViewById(R.id.metapay_disclosure_footer);
            if (findViewById2 != null) {
                findViewById2.setVisibility(0);
                return;
            }
            ViewStub viewStub2 = (ViewStub) view2.findViewById(R.id.top_addon_footer_stub);
            if (viewStub2 != null) {
                View A0H2 = JTP.A0H(viewStub2, R.layout.ads_disclosure_footer_metapay);
                0qQ.A07(A0H2);
                Q6J q6j2 = qhC.A00;
                if (q6j2 != null) {
                    AccessibleTextView accessibleTextView = (AccessibleTextView) A0H2.findViewById(R.id.metapay_disclosure_footer_body_text);
                    View findViewById3 = A0H2.findViewById(R.id.metapay_disclosure_footer_divider);
                    String A16 = AnonymousClass7TE.A16(q6j2, R.string.f0nameremoved);
                    String A0c = DbY.A0c(q6j2, A16, R.string.f0nameremoved);
                    Q6J q6j3 = qhC.A00;
                    CharSequence charSequence = A0c;
                    if (q6j3 != null) {
                        ArrayList A1C = AnonymousClass7TE.A1C();
                        SR9 sr9 = new SR9();
                        sr9.A03("https://www.facebook.com/privacy/explanation/");
                        sr9.A01 = R.string.f0nameremoved;
                        SR9.A02(sr9, "[[data_terms_token]]", A1C);
                        SR9 sr92 = new SR9();
                        sr92.A03("https://www.facebook.com/terms.php");
                        sr92.A01 = R.string.f0nameremoved;
                        SR9.A02(sr92, "[[terms_token]]", A1C);
                        QmZ A006 = C9671Rep.A00(q6j3, ImmutableList.copyOf((Collection) A1C), A0c, false);
                        C12468Sv0 sv0 = new C12468Sv0(qhC, 4);
                        0qQ.A0B(sv0, 0);
                        charSequence = A006.A01(sv0, false);
                    }
                    SpannableStringBuilder A0C = DbS.A0C(charSequence);
                    StyleSpan styleSpan = new StyleSpan(1);
                    int A08 = 00l.A08(A0C, A16, 0, false);
                    A0C.setSpan(styleSpan, A08, A16.length() + A08, 33);
                    DbX.A1G(accessibleTextView, A0C);
                    accessibleTextView.A00(AnonymousClass7TE.A16(q6j2, R.string.f0nameremoved));
                    SRn.A02(accessibleTextView, RH2.A14);
                    AnonymousClass2E0.A0A();
                    Pxf.A1B(A0H2, q6j2.getColor(R.color.igds_elevated_background));
                    AnonymousClass2E0.A0A();
                    Pxf.A1B(findViewById3, q6j2.getColor(R.color.igds_separator));
                }
            }
        }
    }
}
