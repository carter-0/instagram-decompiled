package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.android.R;
import com.instagram.api.schemas.ErrorIdentifier;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.UZd  reason: case insensitive filesystem */
public final class C15275UZd extends AnonymousClass4DH implements AnonymousClass4DS, X3L {
    public static final String __redex_internal_original_name = "PromoteErrorFragment";
    public View A00;
    public ViewStub A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public ErrorIdentifier A05;
    public C18654Vw9 A06;
    public SpinnerImageView A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public ViewStub A0C;
    public TextView A0D;
    public boolean A0E;
    public final AnonymousClass0eM A0F = C20702WxZ.A01(this, 28);
    public final AnonymousClass0eM A0G = C20702WxZ.A01(this, 29);
    public final AnonymousClass0eM A0H = C20702WxZ.A01(this, 31);
    public final AnonymousClass0eM A0I = C20702WxZ.A01(this, 30);
    public final AnonymousClass0eM A0J = C20702WxZ.A01(this, 32);

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, X.UZd, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.C15275UZd r5) {
        /*
            r0 = 1
            A09(r5, r0)
            X.UzE r4 = X.C16678UzE.ERROR
            X.0xx r3 = X.AnonymousClass07a.A00(r5)
            r2 = 0
            r1 = 3
            X.MGz r0 = new X.MGz
            r0.<init>((java.lang.Object) r4, (java.lang.Object) r5, (X.AnonymousClass4D7) r2, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            X.0eM r2 = r5.A0F
            java.lang.Object r1 = r2.getValue()
            X.W1k r1 = (X.C18784W1k) r1
            java.lang.String r0 = r4.toString()
            r1.A07(r0)
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = A03(r5)
            com.instagram.user.model.User r0 = r1.A01(r0)
            boolean r0 = r0.A1d()
            if (r0 == 0) goto L_0x0041
            java.lang.Object r1 = r2.getValue()
            X.W1k r1 = (X.C18784W1k) r1
            X.WOR r0 = new X.WOR
            r0.<init>(r5)
            r1.A05(r0)
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15275UZd.A06(X.UZd):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (r1 != false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r5) {
        /*
            r4 = this;
            r3 = 0
            android.content.Context r1 = X.DbT.A06(r4, r5, r3)
            com.instagram.api.schemas.ErrorIdentifier r0 = r4.A05
            if (r0 != 0) goto L_0x0013
            java.lang.String r0 = "errorIdentifier"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0013:
            java.lang.String r0 = X.C16901VAe.A00(r1, r0)
            r5.setTitle(r0)
            X.3JR r2 = new X.3JR
            r2.<init>()
            X.0hq r0 = r4.mFragmentManager
            if (r0 == 0) goto L_0x0034
            int r0 = r0.A0M()
            if (r0 != 0) goto L_0x0034
            com.instagram.business.promote.model.PromoteData r0 = A01(r4)
            boolean r1 = r0.A2t
            r0 = 2131239025(0x7f082071, float:1.8094345E38)
            if (r1 == 0) goto L_0x0037
        L_0x0034:
            r0 = 2131237906(0x7f081c12, float:1.8092076E38)
        L_0x0037:
            r2.A01(r0)
            r1 = 36
            X.WBB r0 = new X.WBB
            r0.<init>(r4, r1)
            X.DbX.A1A(r0, r2, r5)
            r5.Ets(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15275UZd.configureActionBar(X.2da):void");
    }

    public final String getModuleName() {
        return "promote_error";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        SpinnerImageView A0k = DbX.A0k(view);
        this.A07 = A0k;
        if (A0k == null) {
            str = "loadingSpinner";
        } else {
            JTO.A1X(A0k);
            this.A01 = DbU.A0D(view, R.id.promote_empty_view_stub);
            this.A06 = new C18654Vw9(view, C16678UzE.ERROR);
            this.A0C = DbU.A0D(view, R.id.promote_error_learn_more_link_view_stub);
            C13991Tnr.A0w(this);
            if (A0B(this)) {
                A05(this);
            }
            if (this.A00 == null) {
                ViewStub viewStub = this.A01;
                if (viewStub == null) {
                    str = "errorViewStub";
                } else {
                    View inflate = viewStub.inflate();
                    this.A00 = inflate;
                    if (inflate != null) {
                        this.A03 = DbU.A0G(inflate, R.id.promote_empty_view_title);
                        View view2 = this.A00;
                        if (view2 != null) {
                            this.A04 = DbU.A0G(view2, R.id.promote_error_meta_status_link_view_stub);
                            TextView textView = this.A03;
                            if (textView == null) {
                                str = "errorViewTitle";
                            } else {
                                textView.setText(2131970543);
                                View view3 = this.A00;
                                if (view3 != null) {
                                    this.A02 = AnonymousClass7TE.A0d(view3, R.id.promote_empty_view_description);
                                    ErrorIdentifier errorIdentifier = this.A05;
                                    if (errorIdentifier == null) {
                                        str = "errorIdentifier";
                                    } else if (errorIdentifier == ErrorIdentifier.AD_ACCOUNT_UNSETTLED) {
                                        View view4 = this.A00;
                                        if (view4 != null) {
                                            ImageView A0J2 = DbX.A0J(view4, R.id.promote_empty_view_icon);
                                            Drawable A002 = AnonymousClass2dd.A00(DbV.A05(this), R.drawable.instagram_business_images_account_unsettled_icon);
                                            0qQ.A07(A002);
                                            A0J2.setImageDrawable(A002);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    0qQ.A0F("errorView");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            A07(this);
            if (A0A(this)) {
                C18654Vw9 vw9 = this.A06;
                if (vw9 == null) {
                    str = "actionButtonHolder";
                } else {
                    vw9.A01();
                    A04(this);
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final WGU A00(C15275UZd uZd) {
        return C13990Tnq.A0M(uZd.A0G);
    }

    public static final PromoteData A01(C15275UZd uZd) {
        return (PromoteData) AnonymousClass7TE.A14(uZd.A0I);
    }

    public static UserSession A02(C15275UZd uZd) {
        WGU.A03(C16678UzE.ERROR, A00(uZd), (Boolean) null, "request_review");
        return A03(uZd);
    }

    public static final UserSession A03(C15275UZd uZd) {
        return (UserSession) AnonymousClass7TE.A14(uZd.A0J);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        r4.A02(r0);
        r1 = r4.A00.getContext();
        r6 = X.AnonymousClass7TE.A16(r1, 2131970548);
        r2 = new android.text.SpannableStringBuilder(X.DbY.A0c(r1, r6, 2131970537));
        X.C18654Vw9.A00(r1, r2, r3, r4, r5, r6, X.AnonymousClass000.A00(634), "help_link_page_terms", X.2Yu.A06(r1));
        r0 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0063, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0065, code lost:
        r0.setFooterText(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0068, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        r4.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C15275UZd r9) {
        /*
            X.Vw9 r4 = r9.A06
            if (r4 != 0) goto L_0x000e
            java.lang.String r0 = "actionButtonHolder"
        L_0x0006:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000e:
            androidx.fragment.app.FragmentActivity r3 = r9.requireActivity()
            com.instagram.common.session.UserSession r5 = A03(r9)
            com.instagram.api.schemas.ErrorIdentifier r1 = r9.A05
            if (r1 != 0) goto L_0x001d
            java.lang.String r0 = "errorIdentifier"
            goto L_0x0006
        L_0x001d:
            boolean r0 = X.C66581MXm.A1Z(r5)
            r4.A05(r0)
            r4.A03(r9)
            int r0 = r1.ordinal()
            switch(r0) {
                case 44: goto L_0x0081;
                case 45: goto L_0x0075;
                case 46: goto L_0x0075;
                case 47: goto L_0x006d;
                case 48: goto L_0x0071;
                case 49: goto L_0x0085;
                case 50: goto L_0x002e;
                case 51: goto L_0x002e;
                case 52: goto L_0x0075;
                case 53: goto L_0x0079;
                case 54: goto L_0x007d;
                case 55: goto L_0x007d;
                case 56: goto L_0x002e;
                case 57: goto L_0x002e;
                case 58: goto L_0x002e;
                case 59: goto L_0x002e;
                case 60: goto L_0x002e;
                case 61: goto L_0x006d;
                case 62: goto L_0x002e;
                case 63: goto L_0x002e;
                case 64: goto L_0x002e;
                case 65: goto L_0x002e;
                case 66: goto L_0x0033;
                case 67: goto L_0x002f;
                case 68: goto L_0x0069;
                default: goto L_0x002e;
            }
        L_0x002e:
            return
        L_0x002f:
            r0 = 2131970526(0x7f1349de, float:1.9578006E38)
            goto L_0x0036
        L_0x0033:
            r0 = 2131970529(0x7f1349e1, float:1.9578012E38)
        L_0x0036:
            r4.A02(r0)
            android.view.View r0 = r4.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2131970548(0x7f1349f4, float:1.957805E38)
            java.lang.String r6 = X.AnonymousClass7TE.A16(r1, r0)
            r0 = 2131970537(0x7f1349e9, float:1.9578028E38)
            java.lang.String r0 = X.DbY.A0c(r1, r6, r0)
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>(r0)
            int r9 = X.2Yu.A06(r1)
            r0 = 634(0x27a, float:8.88E-43)
            java.lang.String r7 = X.AnonymousClass000.A00(r0)
            java.lang.String r8 = "help_link_page_terms"
            X.C18654Vw9.A00(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r4.A02
            if (r0 == 0) goto L_0x002e
            r0.setFooterText(r2)
            return
        L_0x0069:
            r0 = 2131970539(0x7f1349eb, float:1.9578032E38)
            goto L_0x0088
        L_0x006d:
            r0 = 2131970282(0x7f1348ea, float:1.957751E38)
            goto L_0x0088
        L_0x0071:
            r0 = 2131970538(0x7f1349ea, float:1.957803E38)
            goto L_0x0088
        L_0x0075:
            r0 = 2131970540(0x7f1349ec, float:1.9578034E38)
            goto L_0x0088
        L_0x0079:
            r0 = 2131970536(0x7f1349e8, float:1.9578026E38)
            goto L_0x0088
        L_0x007d:
            r0 = 2131970105(0x7f134839, float:1.9577152E38)
            goto L_0x0088
        L_0x0081:
            r0 = 2131970527(0x7f1349df, float:1.9578008E38)
            goto L_0x0088
        L_0x0085:
            r0 = 2131968772(0x7f134304, float:1.9574448E38)
        L_0x0088:
            r4.A02(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15275UZd.A04(X.UZd):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r1 != null) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C15275UZd r2) {
        /*
            android.widget.TextView r1 = r2.A0D
            if (r1 != 0) goto L_0x0021
            android.view.ViewStub r0 = r2.A0C
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = "learnMoreLinkViewStub"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0012:
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            X.0qQ.A0C(r1, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2.A0D = r1
            if (r1 == 0) goto L_0x0025
        L_0x0021:
            r0 = 0
            r1.setVisibility(r0)
        L_0x0025:
            android.widget.TextView r1 = r2.A0D
            if (r1 == 0) goto L_0x002e
            r0 = 37
            X.WBB.A01(r1, r0, r2)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15275UZd.A05(X.UZd):void");
    }

    public static final void A07(C15275UZd uZd) {
        String str;
        String str2;
        ErrorIdentifier errorIdentifier = uZd.A05;
        if (errorIdentifier == null) {
            str = "errorIdentifier";
        } else {
            str = "errorViewTitle";
            if (errorIdentifier == ErrorIdentifier.UNKNOWN_ERROR || (str2 = uZd.A0A) == null) {
                TextView textView = uZd.A03;
                if (textView != null) {
                    textView.setText(2131970543);
                }
            } else {
                TextView textView2 = uZd.A03;
                if (textView2 != null) {
                    textView2.setText(str2);
                }
            }
            String str3 = uZd.A09;
            if (str3 == null) {
                UserSession A032 = A03(uZd);
                0qQ.A0B(A032, 0);
                if (182.A06(0Tu.A05, A032, 36321176917648529L)) {
                    TextView textView3 = uZd.A04;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                    TextView textView4 = uZd.A04;
                    if (textView4 != null) {
                        WBB.A01(textView4, 38, uZd);
                        return;
                    }
                    return;
                }
                return;
            }
            ErrorIdentifier errorIdentifier2 = uZd.A05;
            str = "errorIdentifier";
            if (errorIdentifier2 != null) {
                if (errorIdentifier2 == ErrorIdentifier.AD_ACCOUNT_DISABLED_FOR_ADS_INTEGRITY_POLICY || errorIdentifier2 == ErrorIdentifier.BUSINESS_ACCOUNT_BANHAMMERED || errorIdentifier2 == ErrorIdentifier.BUSINESS_ACCOUNT_BANHAMMERED_AND_BUSINESS_VERIFICATION_REQUIRED) {
                    String A0m = DbU.A0m(uZd, 2131970531);
                    ErrorIdentifier errorIdentifier3 = uZd.A05;
                    if (errorIdentifier3 != null) {
                        int i = 2131970532;
                        if (errorIdentifier3 == ErrorIdentifier.BUSINESS_ACCOUNT_BANHAMMERED_AND_BUSINESS_VERIFICATION_REQUIRED) {
                            i = 2131970530;
                        }
                        String A0z = DbV.A0z(uZd, A0m, i);
                        0qQ.A0A(A0z);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A0z);
                        View view = uZd.A00;
                        if (view == null) {
                            str = "errorView";
                        } else {
                            AnonymousClass7AV.A05(spannableStringBuilder, new C16300UsR(uZd, view.getContext().getColor(2Yu.A06(uZd.getContext()))), A0m);
                            TextView textView5 = uZd.A02;
                            if (textView5 != null) {
                                textView5.setText(spannableStringBuilder);
                                TextView textView6 = uZd.A02;
                                if (textView6 != null) {
                                    DbT.A1H(textView6);
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    TextView textView7 = uZd.A02;
                    if (textView7 != null) {
                        textView7.setText(str3);
                        return;
                    }
                }
                0qQ.A0F("errorViewDescription");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A08(C15275UZd uZd, C268654dm r2) {
        ErrorIdentifier errorIdentifier;
        C15254UXo uXo;
        UKM ukm;
        if (r2 == null || (uXo = (C15254UXo) r2.A00()) == null || (ukm = uXo.A01) == null || (errorIdentifier = ukm.A01) == null) {
            errorIdentifier = ErrorIdentifier.UNKNOWN_ERROR;
        }
        uZd.A05 = errorIdentifier;
        A09(uZd, false);
        A07(uZd);
    }

    public static final void A09(C15275UZd uZd, boolean z) {
        TextView textView;
        int i = 8;
        SpinnerImageView spinnerImageView = uZd.A07;
        if (z) {
            if (spinnerImageView != null) {
                DbS.A1T(spinnerImageView);
                View view = uZd.A00;
                if (view != null) {
                    view.setVisibility(8);
                    C18654Vw9 vw9 = uZd.A06;
                    if (vw9 != null) {
                        vw9.A00.setVisibility(8);
                        TextView textView2 = uZd.A0D;
                        if (textView2 != null) {
                            textView2.setVisibility(8);
                        }
                        textView = uZd.A04;
                        if (textView == null) {
                            return;
                        }
                    }
                    0qQ.A0F("actionButtonHolder");
                    throw AnonymousClass00P.createAndThrow();
                }
                0qQ.A0F("errorView");
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F("loadingSpinner");
            throw AnonymousClass00P.createAndThrow();
        }
        if (spinnerImageView != null) {
            JTO.A1X(spinnerImageView);
            View view2 = uZd.A00;
            if (view2 != null) {
                int i2 = 0;
                view2.setVisibility(0);
                if (A0A(uZd)) {
                    C18654Vw9 vw92 = uZd.A06;
                    if (vw92 != null) {
                        vw92.A00.setVisibility(0);
                    }
                    0qQ.A0F("actionButtonHolder");
                    throw AnonymousClass00P.createAndThrow();
                }
                TextView textView3 = uZd.A0D;
                if (textView3 != null) {
                    if (!A0B(uZd)) {
                        i2 = 8;
                    }
                    textView3.setVisibility(i2);
                }
                textView = uZd.A04;
                if (textView == null) {
                    return;
                }
                if (uZd.A09 == null) {
                    i = 0;
                }
            }
            0qQ.A0F("errorView");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("loadingSpinner");
        throw AnonymousClass00P.createAndThrow();
        textView.setVisibility(i);
    }

    public static final boolean A0A(C15275UZd uZd) {
        ErrorIdentifier errorIdentifier = uZd.A05;
        if (errorIdentifier == null) {
            0qQ.A0F("errorIdentifier");
            throw AnonymousClass00P.createAndThrow();
        } else if (errorIdentifier == ErrorIdentifier.NO_ACCESS_TO_AD_ACCOUNT || errorIdentifier == ErrorIdentifier.AD_ACCOUNT_NOT_ACTIVE || errorIdentifier == ErrorIdentifier.AD_ACCOUNT_UNSETTLED || errorIdentifier == ErrorIdentifier.AD_ACCOUNT_DISABLED_ELIGIBLE_FOR_SELF_RESOLUTION || errorIdentifier == ErrorIdentifier.PAGE_NOT_CREATED || errorIdentifier == ErrorIdentifier.PAGE_NOT_OWNED || errorIdentifier == ErrorIdentifier.PAGE_NOT_PUBLISHED || errorIdentifier == ErrorIdentifier.BUSINESS_ACCOUNT_BANHAMMERED || errorIdentifier == ErrorIdentifier.BUSINESS_ACCOUNT_BANHAMMERED_BY_ACE || errorIdentifier == ErrorIdentifier.BUSINESS_ACCOUNT_BANHAMMERED_BY_COMMERCE_DNR || errorIdentifier == ErrorIdentifier.AD_ACCOUNT_DISABLED_FOR_PAYMENT_RISK || errorIdentifier == ErrorIdentifier.AD_ACCOUNT_DISABLED_FOR_ADS_INTEGRITY_POLICY || errorIdentifier == ErrorIdentifier.BUSINESS_ACCOUNT_BANHAMMERED_AND_BUSINESS_VERIFICATION_REQUIRED || errorIdentifier == ErrorIdentifier.ADS_FREE_SUBSCRIPTION) {
            return true;
        } else {
            return false;
        }
    }

    public static final boolean A0B(C15275UZd uZd) {
        ErrorIdentifier errorIdentifier = uZd.A05;
        if (errorIdentifier == null) {
            0qQ.A0F("errorIdentifier");
            throw AnonymousClass00P.createAndThrow();
        } else if (errorIdentifier == ErrorIdentifier.BUSINESS_TWO_FAC_ENABLED || errorIdentifier == ErrorIdentifier.NO_ACCESS_TO_AD_ACCOUNT || errorIdentifier == ErrorIdentifier.NOT_PAGE_ADVERTISER || errorIdentifier == ErrorIdentifier.AD_ACCOUNT_NOT_ACTIVE) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, android.content.Context, com.instagram.base.activity.BaseFragmentActivity, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005d, code lost:
        X.C16904VAh.A00(r2, r3, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0060, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0076, code lost:
        X.HWE.A00(r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c2, code lost:
        r3 = new X.C15621Ufn(r8, r0);
        X.0qQ.A0B(r2, 1);
        r2 = X.AnonymousClass7TG.A0a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ce, code lost:
        if (r1 == false) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d0, code lost:
        r0 = "business/account/create_and_claim_page/";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d2, code lost:
        r2.A0E = r0;
        r2.A9m(X.AnonymousClass000.A00(4766), r6);
        r2.A0Q(X.CF6.class, X.D0W.class);
        r2.A0R = true;
        r0 = r2.A0M();
        r0.A00 = r3;
        X.1ES.A00(r7, r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ef, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00f0, code lost:
        r0 = "business/account/claim_unowned_page/";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0173, code lost:
        X.WGU.A03(r2, r3, (java.lang.Boolean) null, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0177, code lost:
        X.DbT.A1K(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x017a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0199, code lost:
        X.C18676VwZ.A02(r3, r1, r2, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x019f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CtD() {
        /*
            r8 = this;
            com.instagram.api.schemas.ErrorIdentifier r0 = r8.A05
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "errorIdentifier"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000e:
            int r0 = r0.ordinal()
            r4 = 1
            switch(r0) {
                case 44: goto L_0x017b;
                case 45: goto L_0x006c;
                case 46: goto L_0x004c;
                case 47: goto L_0x00f3;
                case 48: goto L_0x0017;
                case 49: goto L_0x0165;
                case 50: goto L_0x0016;
                case 51: goto L_0x0016;
                case 52: goto L_0x0061;
                case 53: goto L_0x003a;
                case 54: goto L_0x014f;
                case 55: goto L_0x015a;
                case 56: goto L_0x0016;
                case 57: goto L_0x0016;
                case 58: goto L_0x0016;
                case 59: goto L_0x0016;
                case 60: goto L_0x0016;
                case 61: goto L_0x00f3;
                case 62: goto L_0x0016;
                case 63: goto L_0x0016;
                case 64: goto L_0x0016;
                case 65: goto L_0x0016;
                case 66: goto L_0x009f;
                case 67: goto L_0x007b;
                default: goto L_0x0016;
            }
        L_0x0016:
            return
        L_0x0017:
            X.0eM r0 = r8.A0G
            X.WGU r3 = X.C13990Tnq.A0M(r0)
            X.UzE r2 = X.C16678UzE.ERROR
            java.lang.String r1 = "pay_now"
            r0 = 0
            X.WGU.A03(r2, r3, r0, r1)
            r8.A0E = r4
            java.lang.String r0 = r8.A08
            if (r0 == 0) goto L_0x0016
            androidx.fragment.app.FragmentActivity r3 = r8.requireActivity()
            com.instagram.common.session.UserSession r2 = A03(r8)
            X.WOD r1 = new X.WOD
            r1.<init>(r8, r0)
            goto L_0x0199
        L_0x003a:
            com.instagram.common.session.UserSession r3 = A02(r8)
            androidx.fragment.app.FragmentActivity r2 = r8.requireActivity()
            r0 = 2131970545(0x7f1349f1, float:1.9578044E38)
            java.lang.String r1 = X.DbU.A0m(r8, r0)
            java.lang.String r0 = "https://business.facebook.com"
            goto L_0x005d
        L_0x004c:
            com.instagram.common.session.UserSession r3 = A02(r8)
            androidx.fragment.app.FragmentActivity r2 = r8.requireActivity()
            r0 = 2131970523(0x7f1349db, float:1.9578E38)
            java.lang.String r1 = X.DbU.A0m(r8, r0)
            java.lang.String r0 = "https://help.instagram.com/contact/502692143473097"
        L_0x005d:
            X.C16904VAh.A00(r2, r3, r1, r0)
            return
        L_0x0061:
            com.instagram.common.session.UserSession r2 = A02(r8)
            androidx.fragment.app.FragmentActivity r1 = r8.requireActivity()
            java.lang.String r0 = "instagram_business_request_review_button"
            goto L_0x0076
        L_0x006c:
            com.instagram.common.session.UserSession r2 = A02(r8)
            androidx.fragment.app.FragmentActivity r1 = r8.requireActivity()
            java.lang.String r0 = "instagram_ad_account_request_review_button"
        L_0x0076:
            X.HWE.A00(r1, r2, r0)
            goto L_0x0177
        L_0x007b:
            X.0eM r0 = r8.A0G
            X.WGU r3 = X.C13990Tnq.A0M(r0)
            X.UzE r2 = X.C16678UzE.ERROR
            java.lang.String r1 = "claim"
            r0 = 0
            X.WGU.A03(r2, r3, r0, r1)
            android.content.Context r7 = r8.requireContext()
            com.instagram.common.session.UserSession r2 = A03(r8)
            com.instagram.business.promote.model.PromoteData r0 = A01(r8)
            java.lang.String r6 = r0.A1A
            r1 = 0
            X.0gy r5 = X.AnonymousClass07i.A00(r8)
            r0 = 17
            goto L_0x00c2
        L_0x009f:
            X.0eM r0 = r8.A0G
            X.WGU r3 = X.C13990Tnq.A0M(r0)
            X.UzE r2 = X.C16678UzE.ERROR
            java.lang.String r1 = "create"
            r0 = 0
            X.WGU.A03(r2, r3, r0, r1)
            android.content.Context r7 = r8.requireContext()
            com.instagram.common.session.UserSession r2 = A03(r8)
            com.instagram.business.promote.model.PromoteData r0 = A01(r8)
            java.lang.String r6 = r0.A1A
            r1 = 1
            X.0gy r5 = X.AnonymousClass07i.A00(r8)
            r0 = 18
        L_0x00c2:
            X.Ufn r3 = new X.Ufn
            r3.<init>(r8, r0)
            X.0qQ.A0B(r2, r4)
            X.1NY r2 = X.AnonymousClass7TG.A0a(r2)
            if (r1 == 0) goto L_0x00f0
            java.lang.String r0 = "business/account/create_and_claim_page/"
        L_0x00d2:
            r2.A0E = r0
            r0 = 4766(0x129e, float:6.679E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A9m(r0, r6)
            java.lang.Class<X.CF6> r1 = X.CF6.class
            java.lang.Class<X.D0W> r0 = X.D0W.class
            r2.A0Q(r1, r0)
            r2.A0R = r4
            X.1OC r0 = r2.A0M()
            r0.A00 = r3
            X.1ES.A00(r7, r5, r0)
            return
        L_0x00f0:
            java.lang.String r0 = "business/account/claim_unowned_page/"
            goto L_0x00d2
        L_0x00f3:
            X.0eM r0 = r8.A0G
            X.WGU r2 = X.C13990Tnq.A0M(r0)
            X.UzE r7 = X.C16678UzE.ERROR
            java.lang.String r1 = "payments"
            r0 = 0
            X.WGU.A03(r7, r2, r0, r1)
            com.instagram.common.session.UserSession r0 = A03(r8)
            java.lang.String r6 = "promote_no_permissions"
            X.C18707VyY.A01(r0, r6)
            r8.A0E = r4
            com.instagram.base.activity.BaseFragmentActivity r5 = X.C13989Tnp.A0R(r8)
            com.instagram.common.session.UserSession r3 = A03(r8)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36311371507302916(0x81010000000204, double:3.026795783150904E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x013a
            androidx.fragment.app.FragmentActivity r3 = r8.requireActivity()
            androidx.fragment.app.FragmentActivity r0 = r8.requireActivity()
            X.0gy r2 = X.AnonymousClass07i.A00(r0)
            com.instagram.common.session.UserSession r1 = A03(r8)
            X.WOl r0 = new X.WOl
            r0.<init>(r4, r5, r8)
            X.C18794W2b.A01(r3, r2, r0, r1)
            return
        L_0x013a:
            com.instagram.common.session.UserSession r2 = A03(r8)
            r0 = 0
            X.AnonymousClass7TF.A1C(r5, r0, r2)
            X.0gy r1 = X.AnonymousClass07i.A00(r5)
            X.WOn r0 = new X.WOn
            r0.<init>(r5, r7, r2, r6)
            X.C18794W2b.A01(r5, r1, r0, r2)
            return
        L_0x014f:
            X.0eM r0 = r8.A0G
            X.WGU r3 = X.C13990Tnq.A0M(r0)
            X.UzE r2 = X.C16678UzE.ERROR
            java.lang.String r1 = "ace_banhammer_close"
            goto L_0x0173
        L_0x015a:
            X.0eM r0 = r8.A0G
            X.WGU r3 = X.C13990Tnq.A0M(r0)
            X.UzE r2 = X.C16678UzE.ERROR
            java.lang.String r1 = "dnr_banhammer_close"
            goto L_0x0173
        L_0x0165:
            X.0eM r0 = r8.A0G
            X.WGU r3 = X.C13990Tnq.A0M(r0)
            X.UzE r2 = X.C16678UzE.ERROR
            r0 = 3685(0xe65, float:5.164E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
        L_0x0173:
            r0 = 0
            X.WGU.A03(r2, r3, r0, r1)
        L_0x0177:
            X.DbT.A1K(r8)
            return
        L_0x017b:
            X.0eM r0 = r8.A0G
            X.WGU r3 = X.C13990Tnq.A0M(r0)
            X.UzE r2 = X.C16678UzE.ERROR
            java.lang.String r1 = "ad_account_disabled_self_resolution"
            r0 = 0
            X.WGU.A03(r2, r3, r0, r1)
            r8.A0E = r4
            androidx.fragment.app.FragmentActivity r3 = r8.requireActivity()
            com.instagram.common.session.UserSession r2 = A03(r8)
            r0 = 2
            X.WOB r1 = new X.WOB
            r1.<init>(r8, r0)
        L_0x0199:
            X.X3J r1 = (X.X3J) r1
            r0 = 0
            X.C18676VwZ.A02(r3, r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15275UZd.CtD():void");
    }

    public final AnonymousClass0wW getSession() {
        return A03(this);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(1859127664);
        C15275UZd.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A0A = bundle2.getString("error_title");
            this.A09 = bundle2.getString(TraceFieldType.Error);
            this.A08 = bundle2.getString("ad_account_id");
            this.A0B = bundle2.getString("paymentMethodID");
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            str = bundle3.getString("error_type");
        } else {
            str = null;
        }
        ErrorIdentifier errorIdentifier = (ErrorIdentifier) ErrorIdentifier.A01.get(str);
        if (errorIdentifier == null) {
            errorIdentifier = ErrorIdentifier.UNRECOGNIZED;
        }
        this.A05 = errorIdentifier;
        AnonymousClass0fD.A09(-1763667249, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(986148906);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_error_view, viewGroup, false);
        AnonymousClass0fD.A09(622422238, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1633271395);
        super.onDestroyView();
        this.A04 = null;
        AnonymousClass0fD.A09(1278714154, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(750325690);
        super.onResume();
        if (this.A0E) {
            ErrorIdentifier errorIdentifier = this.A05;
            if (errorIdentifier == null) {
                0qQ.A0F("errorIdentifier");
                throw AnonymousClass00P.createAndThrow();
            } else if (errorIdentifier == ErrorIdentifier.NO_ACCESS_TO_AD_ACCOUNT || errorIdentifier == ErrorIdentifier.AD_ACCOUNT_NOT_ACTIVE || errorIdentifier == ErrorIdentifier.AD_ACCOUNT_UNSETTLED || errorIdentifier == ErrorIdentifier.AD_ACCOUNT_DISABLED_ELIGIBLE_FOR_SELF_RESOLUTION) {
                this.A0E = false;
                A06(this);
            }
        }
        AnonymousClass0fD.A09(-72355982, A022);
    }
}
