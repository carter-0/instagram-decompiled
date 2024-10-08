package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;
import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.igds.components.button.IgdsButton;
import java.util.concurrent.TimeUnit;

public final class NJ3 extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CustomThemePreviewFragment";
    public int A00;
    public TextView A01;
    public ComposeView A02;
    public ConstraintLayout A03;
    public IgLinearLayout A04;
    public IgTextView A05;
    public IgTextView A06;
    public IgTextView A07;
    public IgTextView A08;
    public IgTextView A09;
    public IgTextView A0A;
    public IgView A0B;
    public IgView A0C;
    public C74391Pu7 A0D;
    public AnonymousClass7L2 A0E;
    public DirectThreadThemeInfo A0F;
    public IgdsButton A0G;
    public IgdsButton A0H;
    public C254743sy A0I;
    public AnonymousClass6ST A0J;
    public Integer A0K = AnonymousClass05K.A00;
    public String A0L;
    public boolean A0M;
    public final AnonymousClass0eM A0N = C227642jf.A02(this);

    public final void configureActionBar(2da r8) {
        0qQ.A0B(r8, 0);
        int intValue = this.A0K.intValue();
        if (intValue == 0) {
            r8.Eu4(true);
            r8.Eom(2131957271);
            AnonymousClass7L2 r0 = this.A0E;
            if (r0 != null) {
                r8.ENd(new ColorDrawable(r0.A04.A00));
                return;
            }
        } else if (intValue != 2) {
            r8.Etr(false);
            return;
        } else {
            r8.Eom(2131957271);
            r8.Eu4(false);
            AnonymousClass7L2 r02 = this.A0E;
            if (r02 != null) {
                r8.ENd(new ColorDrawable(r02.A04.A00));
                r8.Epb(2db.A01(getActivity()));
                C270354gb r1 = new C270354gb();
                r1.A0I(this.A03);
                r1.A0E(R.id.preview_message_1, 3, R.id.preview_thread, 3, r8.AYI());
                r1.A0G(this.A03);
                return;
            }
        }
        0qQ.A0F("themeToUse");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        IgTextView igTextView;
        CharSequence charSequence;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        CharSequence charSequence2 = null;
        AnonymousClass6ST r1 = new AnonymousClass6ST(requireContext(), true);
        this.A0J = r1;
        DbX.A15(requireContext(), r1);
        this.A0C = (IgView) view.requireViewById(R.id.top_gradient);
        this.A0B = (IgView) view.requireViewById(R.id.bottom_gradient);
        this.A04 = (IgLinearLayout) view.requireViewById(R.id.title_bar);
        this.A0A = DbT.A0a(view, R.id.title_text);
        this.A09 = DbT.A0a(view, R.id.subtitle_text);
        this.A0G = DbU.A0b(view, R.id.cancel_button);
        this.A0H = DbU.A0b(view, R.id.set_button);
        this.A03 = (ConstraintLayout) view.requireViewById(R.id.preview_thread);
        IgTextView A0a = DbT.A0a(view, R.id.preview_message_1);
        this.A05 = A0a;
        Integer num = this.A0K;
        Integer num2 = AnonymousClass05K.A01;
        if (num == num2 && A0a != null) {
            Resources resources = A0a.getResources();
            if (resources != null) {
                charSequence = resources.getText(2131957265);
            } else {
                charSequence = null;
            }
            A0a.setText(charSequence);
        }
        this.A06 = DbT.A0a(view, R.id.preview_message_2);
        this.A07 = DbT.A0a(view, R.id.preview_message_3);
        IgTextView A0a2 = DbT.A0a(view, R.id.preview_message_4);
        this.A08 = A0a2;
        if (this.A0K == num2 && A0a2 != null) {
            Resources resources2 = A0a2.getResources();
            if (resources2 != null) {
                charSequence2 = resources2.getText(2131957270);
            }
            A0a2.setText(charSequence2);
        }
        this.A01 = DbU.A0G(view, R.id.preview_timestamp);
        Integer num3 = this.A0K;
        Integer num4 = AnonymousClass05K.A0C;
        if (num3 == num4) {
            this.A02 = (ComposeView) view.requireViewById(R.id.create_button);
        }
        AnonymousClass9HC A0M2 = C66584MXp.A0M(AnonymousClass9HC.A1b, this.A0N);
        boolean A002 = AnonymousClass3HA.A00(requireActivity());
        this.A0M = A002;
        Context requireContext = requireContext();
        Integer num5 = num2;
        if (A002) {
            num5 = num4;
        }
        DirectThreadThemeInfo directThreadThemeInfo = this.A0F;
        if (directThreadThemeInfo == null) {
            0qQ.A0F("themeInfo");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass7L2 A012 = C329927Kt.A00.A01(requireContext, A0M2, directThreadThemeInfo, num5);
        this.A0E = A012;
        IgTextView igTextView2 = this.A05;
        if (igTextView2 != null) {
            igTextView2.setBackground(A012.A03.A04());
            IgTextView igTextView3 = this.A06;
            if (igTextView3 != null) {
                AnonymousClass7L2 r0 = this.A0E;
                if (r0 != null) {
                    igTextView3.setBackground(r0.A03.A04());
                    IgTextView igTextView4 = this.A07;
                    if (igTextView4 != null) {
                        AnonymousClass7L2 r02 = this.A0E;
                        if (r02 != null) {
                            igTextView4.setBackground(r02.A03.A04());
                            IgTextView igTextView5 = this.A08;
                            if (igTextView5 != null) {
                                AnonymousClass7L2 r03 = this.A0E;
                                if (r03 != null) {
                                    igTextView5.setBackground(r03.A03.A04());
                                    IgdsButton igdsButton = this.A0G;
                                    if (igdsButton != null) {
                                        C71401Ok0.A01(igdsButton, 50, this);
                                        if (this.A0K != num4) {
                                            IgdsButton igdsButton2 = this.A0H;
                                            if (igdsButton2 != null) {
                                                C71401Ok0.A01(igdsButton2, 51, this);
                                            } else {
                                                throw AnonymousClass7TE.A0z("Required value was null.");
                                            }
                                        }
                                        if (this.A0K == num4) {
                                            ConstraintLayout constraintLayout = this.A03;
                                            if (constraintLayout != null) {
                                                AnonymousClass7L2 r04 = this.A0E;
                                                if (r04 != null) {
                                                    constraintLayout.setBackgroundColor(r04.A04.A00);
                                                }
                                            }
                                            AnonymousClass7TH.A0R(this.A0H);
                                            ComposeView composeView = this.A02;
                                            if (composeView != null) {
                                                composeView.setVisibility(0);
                                            }
                                            ComposeView composeView2 = this.A02;
                                            if (composeView2 != null) {
                                                composeView2.setContent(AnonymousClass5PI.A04(new C59110J6s(this, 32), 107826460, true));
                                            }
                                            IgTextView igTextView6 = this.A08;
                                            if (igTextView6 != null) {
                                                DbT.A18(requireContext(), igTextView6, 2131957269);
                                            }
                                            C270354gb r4 = new C270354gb();
                                            r4.A0I(this.A03);
                                            r4.A0E(R.id.cancel_button, 4, R.id.preview_thread, 4, AnonymousClass2uJ.A00);
                                            r4.A0E(R.id.create_button, 4, R.id.preview_thread, 4, AnonymousClass2uJ.A00);
                                            r4.A0G(this.A03);
                                        }
                                        0nY.A00().ATE(new NRK(this));
                                        FragmentActivity requireActivity = requireActivity();
                                        AnonymousClass7L2 r05 = this.A0E;
                                        if (r05 != null) {
                                            2db.A02(requireActivity, r05.A04.A00);
                                            AnonymousClass7L2 r06 = this.A0E;
                                            if (r06 != null) {
                                                AnonymousClass2uJ.A04(requireActivity, r06.A04.A05);
                                                Integer num6 = this.A0K;
                                                Integer num7 = AnonymousClass05K.A00;
                                                if (num6 == num7) {
                                                    AnonymousClass7L2 r07 = this.A0E;
                                                    if (r07 != null) {
                                                        C329967Kx r42 = r07.A04;
                                                        IgView igView = this.A0C;
                                                        if (igView != null) {
                                                            IgView igView2 = this.A0B;
                                                            if (igView2 != null) {
                                                                igView.setVisibility(0);
                                                                igView2.setVisibility(0);
                                                                int i = r42.A00;
                                                                int i2 = r42.A05;
                                                                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                                                                GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{i, 0});
                                                                GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{0, i2});
                                                                igView.setBackground(gradientDrawable);
                                                                igView2.setBackground(gradientDrawable2);
                                                            } else {
                                                                throw AnonymousClass7TE.A0z("Required value was null.");
                                                            }
                                                        } else {
                                                            throw AnonymousClass7TE.A0z("Required value was null.");
                                                        }
                                                    }
                                                } else if (num6 == num2) {
                                                    IgView igView3 = this.A0C;
                                                    IgView igView4 = this.A0B;
                                                    if (!(igView3 == null || igView4 == null)) {
                                                        DirectThreadThemeInfo directThreadThemeInfo2 = this.A0F;
                                                        String str2 = "themeInfo";
                                                        if (directThreadThemeInfo2 != null) {
                                                            if (this.A0M) {
                                                                str = directThreadThemeInfo2.A0h;
                                                            } else {
                                                                str = directThreadThemeInfo2.A0m;
                                                            }
                                                            if (str != null) {
                                                                ViewGroup.LayoutParams layoutParams = igView3.getLayoutParams();
                                                                if (layoutParams != null) {
                                                                    layoutParams.height = DbV.A05(this).getDimensionPixelOffset(R.dimen.abc_dialog_padding_material);
                                                                }
                                                                ViewGroup.LayoutParams layoutParams2 = igView4.getLayoutParams();
                                                                if (layoutParams2 != null) {
                                                                    layoutParams2.height = DbV.A05(this).getDimensionPixelOffset(R.dimen.abc_dialog_padding_material);
                                                                }
                                                                C270354gb r5 = new C270354gb();
                                                                r5.A0I(this.A03);
                                                                r5.A09(igView3.getId(), 4);
                                                                r5.A09(igView4.getId(), 3);
                                                                r5.A0G(this.A03);
                                                                AnonymousClass7L2 r08 = this.A0E;
                                                                if (r08 == null) {
                                                                    str2 = "themeToUse";
                                                                } else {
                                                                    int i3 = r08.A04.A00;
                                                                    DirectThreadThemeInfo directThreadThemeInfo3 = this.A0F;
                                                                    if (directThreadThemeInfo3 != null) {
                                                                        int A003 = C329957Kw.A00(directThreadThemeInfo3, this.A0M);
                                                                        int A062 = 2eL.A06(i3, 204);
                                                                        int A063 = 2eL.A06(A003, 204);
                                                                        GradientDrawable.Orientation orientation2 = GradientDrawable.Orientation.TOP_BOTTOM;
                                                                        GradientDrawable gradientDrawable3 = new GradientDrawable(orientation2, new int[]{i3, A062, 0});
                                                                        GradientDrawable gradientDrawable4 = new GradientDrawable(orientation2, new int[]{0, A063, A003});
                                                                        igView3.setBackground(gradientDrawable3);
                                                                        igView4.setBackground(gradientDrawable4);
                                                                        igView3.setVisibility(0);
                                                                        igView4.setVisibility(0);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        0qQ.A0F(str2);
                                                        throw AnonymousClass00P.createAndThrow();
                                                    }
                                                }
                                                AnonymousClass7L2 r6 = this.A0E;
                                                if (r6 != null) {
                                                    if (this.A0K == num2) {
                                                        IgTextView igTextView7 = this.A0A;
                                                        String str3 = "themeInfo";
                                                        if (igTextView7 != null) {
                                                            Context requireContext2 = requireContext();
                                                            DirectThreadThemeInfo directThreadThemeInfo4 = this.A0F;
                                                            if (directThreadThemeInfo4 != null) {
                                                                DbX.A13(requireContext2, igTextView7, directThreadThemeInfo4.A0f, 2131960583);
                                                            }
                                                            0qQ.A0F(str3);
                                                            throw AnonymousClass00P.createAndThrow();
                                                        }
                                                        IgTextView igTextView8 = this.A0A;
                                                        if (igTextView8 != null) {
                                                            igTextView8.setVisibility(0);
                                                        }
                                                        DirectThreadThemeInfo directThreadThemeInfo5 = this.A0F;
                                                        if (directThreadThemeInfo5 != null) {
                                                            String str4 = directThreadThemeInfo5.A0k;
                                                            if (str4 != null) {
                                                                AnonymousClass7L2 r09 = this.A0E;
                                                                str3 = "themeToUse";
                                                                if (r09 != null) {
                                                                    int i4 = r09.A04.A03;
                                                                    if (!(i4 == 0 || (igTextView = this.A09) == null)) {
                                                                        igTextView.setTextColor(i4);
                                                                    }
                                                                    IgTextView igTextView9 = this.A09;
                                                                    if (igTextView9 != null) {
                                                                        igTextView9.setText(str4);
                                                                    }
                                                                    IgTextView igTextView10 = this.A09;
                                                                    if (igTextView10 != null) {
                                                                        igTextView10.setVisibility(0);
                                                                    }
                                                                }
                                                            }
                                                            IgLinearLayout igLinearLayout = this.A04;
                                                            if (igLinearLayout != null) {
                                                                igLinearLayout.setVisibility(0);
                                                            }
                                                        }
                                                        0qQ.A0F(str3);
                                                        throw AnonymousClass00P.createAndThrow();
                                                    }
                                                    int i5 = r6.A05.A04;
                                                    IgTextView igTextView11 = this.A05;
                                                    if (igTextView11 != null) {
                                                        igTextView11.setTextColor(i5);
                                                    }
                                                    IgTextView igTextView12 = this.A05;
                                                    if (igTextView12 != null) {
                                                        Drawable background = igTextView12.getBackground();
                                                        A00(background, C328637Fo.GROUP_WITH_BELOW, r6, true);
                                                        igTextView12.setBackground(background);
                                                    }
                                                    IgTextView igTextView13 = this.A05;
                                                    if (igTextView13 != null) {
                                                        igTextView13.post(new PVO(igTextView13));
                                                    }
                                                    IgTextView igTextView14 = this.A06;
                                                    if (igTextView14 != null) {
                                                        igTextView14.setTextColor(i5);
                                                    }
                                                    IgTextView igTextView15 = this.A06;
                                                    if (igTextView15 != null) {
                                                        Drawable background2 = igTextView15.getBackground();
                                                        A00(background2, C328637Fo.GROUP_WITH_ABOVE, r6, true);
                                                        igTextView15.setBackground(background2);
                                                    }
                                                    IgTextView igTextView16 = this.A06;
                                                    if (igTextView16 != null) {
                                                        igTextView16.post(new PVO(igTextView16));
                                                    }
                                                    IgTextView igTextView17 = this.A07;
                                                    if (igTextView17 != null) {
                                                        igTextView17.setTextColor(r6.A06.A04);
                                                    }
                                                    IgTextView igTextView18 = this.A07;
                                                    if (igTextView18 != null) {
                                                        Drawable background3 = igTextView18.getBackground();
                                                        A00(background3, C328637Fo.NONE, r6, false);
                                                        igTextView18.setBackground(background3);
                                                    }
                                                    IgTextView igTextView19 = this.A08;
                                                    if (igTextView19 != null) {
                                                        igTextView19.setTextColor(i5);
                                                    }
                                                    IgTextView igTextView20 = this.A08;
                                                    if (igTextView20 != null) {
                                                        Drawable background4 = igTextView20.getBackground();
                                                        A00(background4, C328637Fo.NONE, r6, true);
                                                        igTextView20.setBackground(background4);
                                                    }
                                                    IgTextView igTextView21 = this.A08;
                                                    if (igTextView21 != null) {
                                                        igTextView21.post(new PVO(igTextView21));
                                                    }
                                                    TextView textView = this.A01;
                                                    if (textView != null) {
                                                        textView.setText(AnonymousClass7F5.A00(requireContext(), TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis())));
                                                    }
                                                    if (this.A0K == num7) {
                                                        TextView textView2 = this.A01;
                                                        if (textView2 != null) {
                                                            C3256573p.A00(textView2, true);
                                                            return;
                                                        }
                                                        throw AnonymousClass7TE.A0z("Required value was null.");
                                                    }
                                                    TextView textView3 = this.A01;
                                                    if (textView3 != null) {
                                                        textView3.setTextColor(r6.A00);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            }
                                        }
                                        0qQ.A0F("themeToUse");
                                        throw AnonymousClass00P.createAndThrow();
                                    }
                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                }
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                0qQ.A0F("themeToUse");
                throw AnonymousClass00P.createAndThrow();
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public static final void A00(Drawable drawable, C328637Fo r7, AnonymousClass7L2 r8, boolean z) {
        r8.A05.A00(drawable, (AnonymousClass5FV) null, r7, z, false, false, false, false);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0N);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1447331178);
        NJ3.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A0L = C320236s2.A01(requireArguments, "ARGUMENT_UPLOAD_ID");
        this.A0I = (C254743sy) requireArguments.getParcelable(AnonymousClass000.A00(15));
        this.A0F = (DirectThreadThemeInfo) C320236s2.A00(requireArguments, DirectThreadThemeInfo.class, "ARGUEMENT_THEME");
        this.A00 = requireArguments.getInt(AnonymousClass000.A00(32), 0);
        this.A0K = AnonymousClass05K.A00(3)[requireArguments.getInt("ARGUMENT_PREVIEW_TYPE")];
        requireArguments.getBoolean(AnonymousClass000.A00(904), false);
        AnonymousClass0fD.A09(343305935, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1702803658);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_custom_theme_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-523516044, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1122415197);
        super.onDestroyView();
        this.A0C = null;
        this.A0B = null;
        this.A0G = null;
        this.A0H = null;
        this.A02 = null;
        this.A03 = null;
        this.A05 = null;
        this.A06 = null;
        this.A01 = null;
        this.A07 = null;
        this.A08 = null;
        this.A04 = null;
        this.A0A = null;
        this.A09 = null;
        AnonymousClass0fD.A09(984378194, A022);
    }
}
