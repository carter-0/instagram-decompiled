package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;

/* renamed from: X.GzN  reason: case insensitive filesystem */
public final class C54092GzN extends C240373Kq {
    public static final String __redex_internal_original_name = "InstagramConsentFlowDialogFragment";
    public C55702Hlz A00;
    public C229382nI A01;
    public AnonymousClass6NS A02;
    public final 2el A03 = 2el.A00();
    public final AnonymousClass0eM A04 = C227642jf.A01(this);

    public final String getModuleName() {
        return "InstagramConsentFlowDialog";
    }

    /* JADX WARNING: type inference failed for: r0v36, types: [X.1Ko, java.lang.Object] */
    public final Dialog A0F(Bundle bundle) {
        String str;
        float f;
        String str2;
        String str3;
        String str4;
        Drawable drawable;
        C277014uI r18;
        Context requireContext = requireContext();
        if (this.A00 != null) {
            A0D(false);
            AnonymousClass6NS r2 = this.A02;
            if (r2 != null) {
                C55702Hlz hlz = this.A00;
                if (hlz != null) {
                    C276544tV r10 = hlz.A02;
                    DisplayMetrics displayMetrics = DbV.A05(this).getDisplayMetrics();
                    0qQ.A07(displayMetrics);
                    int i = displayMetrics.widthPixels;
                    if (r10 == null || (str = r10.A0H()) == null) {
                        str = "10%";
                    }
                    try {
                        if (str.endsWith("%")) {
                            f = (AnonymousClass6Su.A00(str) / 100.0f) * ((float) displayMetrics.widthPixels);
                        } else {
                            f = AnonymousClass6Su.A01(str);
                        }
                    } catch (C258053yO e) {
                        0KC.A0J("ConsentFlowDialogUtil", 002.A0R("Cannot parse borderWidth: ", str), e);
                        f = ((float) displayMetrics.widthPixels) * 0.1f;
                    }
                    int i2 = i - (((int) f) * 2);
                    C13348TVv tVv = new C13348TVv(r2, 38);
                    C55702Hlz hlz2 = this.A00;
                    if (hlz2 != null) {
                        C3034368u r6 = hlz2.A01;
                        String str5 = null;
                        C273694n2 r5 = new C273694n2(requireContext);
                        r2.A07(r5);
                        Dba.A0z(r5, this.A03, this);
                        boolean A002 = AnonymousClass3HA.A00(requireContext);
                        ConstraintLayout constraintLayout = new ConstraintLayout(requireContext);
                        if (r10 != null) {
                            str2 = r10.A0E();
                        } else {
                            str2 = null;
                        }
                        constraintLayout.setMaxHeight(V6C.A00(str2, Integer.MAX_VALUE));
                        if (r10 != null) {
                            str3 = r10.A0I();
                        } else {
                            str3 = null;
                        }
                        constraintLayout.setMinHeight(V6C.A00(str3, 0));
                        C71492dQ r3 = new C71492dQ(-1, 0);
                        r3.A0c = constraintLayout.A03;
                        r3.A0e = constraintLayout.A05;
                        if (r10 != null) {
                            str5 = r10.A0J();
                        }
                        if (0qQ.A0K(str5, "cds")) {
                            float f2 = 8.0f;
                            if (r10 != null) {
                                f2 = r10.A02(35, 8.0f);
                            }
                            C361838gt C5w = new Object().C5w();
                            int A003 = C14560TyP.A00(A002, true);
                            StringBuilder A1A = AnonymousClass7TE.A1A();
                            A1A.append(f2);
                            C14560TyP A004 = C48305EcO.A00(requireContext, C5w, AnonymousClass7TF.A0l("dp", A1A), A002);
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            gradientDrawable.setColor(A003);
                            gradientDrawable.setCornerRadius(C18183Vmx.A00(requireContext, f2));
                            constraintLayout.addView(A004, r3);
                            drawable = gradientDrawable;
                        } else {
                            int color = requireContext.getColor(R.color.direct_widget_primary_background);
                            C276544tV r13 = null;
                            if (r10 != null) {
                                str4 = r10.A0J();
                            } else {
                                str4 = null;
                            }
                            if (0qQ.A0K(str4, "cds")) {
                                drawable = C51965G9l.A0D(0);
                            } else {
                                GradientDrawable gradientDrawable2 = new GradientDrawable();
                                if (r10 != null) {
                                    r13 = r10.A07(140);
                                }
                                if (r13 != null) {
                                    int i3 = 36;
                                    if (A002) {
                                        i3 = 35;
                                    }
                                    String A0K = r13.A0K(i3);
                                    if (A0K != null) {
                                        color = AnonymousClass6Su.A03(A0K);
                                    }
                                }
                                gradientDrawable2.setColor(color);
                                float f3 = 8.0f;
                                if (r10 != null) {
                                    f3 = r10.A02(35, 8.0f);
                                }
                                gradientDrawable2.setCornerRadius(C18183Vmx.A00(requireContext, f3));
                                drawable = gradientDrawable2;
                            }
                        }
                        constraintLayout.setBackground(drawable);
                        constraintLayout.addView(r5, r3);
                        C55437Hhh hhh = new C55437Hhh(this);
                        if (r10 != null) {
                            r18 = r10.A08();
                        } else {
                            r18 = null;
                        }
                        C52781GcY gcY = new C52781GcY(requireContext, hhh, r6, r18, tVv);
                        gcY.setCanceledOnTouchOutside(false);
                        gcY.setContentView(constraintLayout);
                        Window window = gcY.getWindow();
                        if (window == null) {
                            return gcY;
                        }
                        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                        layoutParams.copyFrom(window.getAttributes());
                        layoutParams.width = i2;
                        layoutParams.height = -2;
                        window.setAttributes(layoutParams);
                        window.setBackgroundDrawableResource(17170445);
                        return gcY;
                    }
                }
                0qQ.A0F("promptDisplayParameter");
                throw AnonymousClass00P.createAndThrow();
            }
            0KC.A0C(__redex_internal_original_name, "Got a null BloksParseResult");
        }
        return new Dialog(requireContext);
    }

    public final 0lg A0M() {
        return DbT.A0X(this.A04);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1185091852);
        C54092GzN.super.onCreate(bundle);
        this.A01 = C229382nI.A03(this, DbT.A0X(this.A04), this.A03);
        String string = requireArguments().getString("prompt_id");
        if (string != null) {
            C55702Hlz hlz = (C55702Hlz) C56480HzC.A01.get(string);
            if (hlz == null) {
                HSW.A00(this, string);
            } else {
                this.A00 = hlz;
                C3034368u r2 = hlz.A01;
                if (r2 != null) {
                    Context requireContext = requireContext();
                    C229382nI r0 = this.A01;
                    if (r0 == null) {
                        0qQ.A0F("bloksHost");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    this.A02 = AnonymousClass6NS.A00(requireContext, r2, r0).A00();
                }
            }
            AnonymousClass0fD.A09(-656931485, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(483051589, A022);
        throw A0y;
    }
}
