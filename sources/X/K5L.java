package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.ui.primer.ColorTint;
import com.instagram.ui.primer.PrimerBottomSheetConfig;
import com.instagram.ui.primer.TitleIcon;

public final class K5L extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "PrimerBottomSheetFragment";
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public PrimerBottomSheetConfig A02;
    public CharSequence A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final boolean onBackPressed() {
        PrimerBottomSheetConfig primerBottomSheetConfig = this.A02;
        if (primerBottomSheetConfig == null) {
            0qQ.A0F("config");
            throw AnonymousClass00P.createAndThrow();
        } else if (primerBottomSheetConfig.A0E) {
            return false;
        } else {
            return isVisible();
        }
    }

    public final String getModuleName() {
        PrimerBottomSheetConfig primerBottomSheetConfig = (PrimerBottomSheetConfig) requireArguments().getParcelable("arg_config");
        if (primerBottomSheetConfig != null) {
            return primerBottomSheetConfig.A0A;
        }
        return __redex_internal_original_name;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1225709233);
        K5L.super.onCreate(bundle);
        this.A02 = (PrimerBottomSheetConfig) C320236s2.A00(requireArguments(), PrimerBottomSheetConfig.class, "arg_config");
        AnonymousClass0fD.A09(1628438356, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int paddingStart;
        int paddingTop;
        int paddingEnd;
        int paddingBottom;
        int A022 = AnonymousClass0fD.A02(1307353795);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.primer_bottom_sheet, viewGroup, false);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TF.A0F(inflate, R.id.headline);
        PrimerBottomSheetConfig primerBottomSheetConfig = this.A02;
        if (primerBottomSheetConfig != null) {
            TitleIcon titleIcon = primerBottomSheetConfig.A01;
            if (titleIcon != null) {
                Context requireContext = requireContext();
                Drawable drawable = requireContext.getDrawable(titleIcon.A00);
                if (drawable != null) {
                    ColorTint colorTint = titleIcon.A01;
                    if (colorTint != null && colorTint.A02 == 0) {
                        drawable = AnonymousClass3JT.A03(requireContext, drawable, requireContext.getColor(colorTint.A01), requireContext.getColor(colorTint.A00));
                    }
                    igdsHeadline.setImageDrawable(drawable);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            PrimerBottomSheetConfig primerBottomSheetConfig2 = this.A02;
            if (primerBottomSheetConfig2 != null) {
                igdsHeadline.setHeadline(primerBottomSheetConfig2.A00);
                Resources A05 = DbU.A05(igdsHeadline);
                PrimerBottomSheetConfig primerBottomSheetConfig3 = this.A02;
                if (primerBottomSheetConfig3 != null) {
                    Integer num = primerBottomSheetConfig3.A04;
                    Integer num2 = primerBottomSheetConfig3.A05;
                    Integer num3 = primerBottomSheetConfig3.A03;
                    Integer num4 = primerBottomSheetConfig3.A02;
                    if (num != null) {
                        paddingStart = A05.getDimensionPixelSize(num.intValue());
                    } else {
                        paddingStart = igdsHeadline.getPaddingStart();
                    }
                    if (num2 != null) {
                        paddingTop = A05.getDimensionPixelSize(num2.intValue());
                    } else {
                        paddingTop = igdsHeadline.getPaddingTop();
                    }
                    if (num3 != null) {
                        paddingEnd = A05.getDimensionPixelSize(num3.intValue());
                    } else {
                        paddingEnd = igdsHeadline.getPaddingEnd();
                    }
                    if (num4 != null) {
                        paddingBottom = A05.getDimensionPixelSize(num4.intValue());
                    } else {
                        paddingBottom = igdsHeadline.getPaddingBottom();
                    }
                    igdsHeadline.setPadding(paddingStart, paddingTop, paddingEnd, paddingBottom);
                    PrimerBottomSheetConfig primerBottomSheetConfig4 = this.A02;
                    if (primerBottomSheetConfig4 != null) {
                        Integer num5 = primerBottomSheetConfig4.A08;
                        if (num5 != null) {
                            igdsHeadline.setBody(num5.intValue());
                        }
                        PrimerBottomSheetConfig primerBottomSheetConfig5 = this.A02;
                        if (primerBottomSheetConfig5 != null) {
                            if (primerBottomSheetConfig5.A0G) {
                                DbT.A1F(inflate, R.id.headline_divider, 0);
                            }
                            PrimerBottomSheetConfig primerBottomSheetConfig6 = this.A02;
                            if (primerBottomSheetConfig6 != null) {
                                String str = primerBottomSheetConfig6.A09;
                                if (str != null) {
                                    TextView A0R = AnonymousClass7TG.A0R(inflate, R.id.main_body_text);
                                    A0R.setText(str);
                                    A0R.setVisibility(0);
                                    DbX.A1B(inflate, R.id.item_list_divider);
                                }
                                RecyclerView A0I = DbT.A0I(inflate, R.id.info_list);
                                PrimerBottomSheetConfig primerBottomSheetConfig7 = this.A02;
                                if (primerBottomSheetConfig7 != null) {
                                    A0I.setAdapter(new C60412Jl5(primerBottomSheetConfig7.A06, primerBottomSheetConfig7.A07, primerBottomSheetConfig7.A0D));
                                    IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass7TF.A0F(inflate, R.id.primer_bottom_button);
                                    PrimerBottomSheetConfig primerBottomSheetConfig8 = this.A02;
                                    if (primerBottomSheetConfig8 != null) {
                                        igdsBottomButtonLayout.setPrimaryActionText(primerBottomSheetConfig8.A0B);
                                        igdsBottomButtonLayout.setPrimaryActionOnClickListener(this.A00);
                                        PrimerBottomSheetConfig primerBottomSheetConfig9 = this.A02;
                                        if (primerBottomSheetConfig9 != null) {
                                            igdsBottomButtonLayout.setSecondaryActionText(primerBottomSheetConfig9.A0C);
                                            igdsBottomButtonLayout.setSecondaryActionOnClickListener(this.A01);
                                            PrimerBottomSheetConfig primerBottomSheetConfig10 = this.A02;
                                            if (primerBottomSheetConfig10 != null) {
                                                boolean z = primerBottomSheetConfig10.A0F;
                                                CharSequence charSequence = this.A03;
                                                if (z) {
                                                    igdsBottomButtonLayout.setFooterText(charSequence);
                                                } else {
                                                    igdsBottomButtonLayout.setFooterAboveActionText(charSequence);
                                                }
                                                AnonymousClass0fD.A09(1928993386, A022);
                                                return inflate;
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
        0qQ.A0F("config");
        throw AnonymousClass00P.createAndThrow();
    }
}
