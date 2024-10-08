package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.android.R;
import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.io.Serializable;
import java.util.List;

public final class E25 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "TwoFacLoginVerifyFragment";
    public Handler A00;
    public View A01;
    public View A02;
    public CheckBox A03;
    public TextView A04;
    public QuickPerformanceLogger A05;
    public AnonymousClass0aP A06;
    public EW8 A07;
    public C49483EwO A08;
    public C49924FEz A09;
    public ConfirmationCodeEditText A0A;
    public ProgressButton A0B;
    public C46634DiE A0C;
    public Integer A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public TextView A0L;
    public TextView A0M;
    public TextView A0N;
    public String A0O;
    public boolean A0P;
    public boolean A0Q;
    public final 1P0 A0R = new C47699EDi(this, 36);
    public final 1P0 A0S = new C47699EDi(this, 37);
    public final C262934Go A0T = new ERK(this, 4);
    public final Runnable A0U = new C51225Fqg(this);
    public final TextWatcher A0V = new C48054ESy(this, 7);
    public final View.OnClickListener A0W = new FP3((Object) this, 48);
    public final View.OnClickListener A0X = new FP3((Object) this, 49);
    public final View.OnLongClickListener A0Y = new FPT(this, 1);
    public final TextView.OnEditorActionListener A0Z = new FQe(this, 8);
    public final 1P0 A0a = new C47699EDi(this, 35);
    public final C47699EDi A0b = new C47699EDi(this, 34);
    public final 1wn A0c = FXZ.A00(this, 26);

    public final String getModuleName() {
        return Dbq.A02();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        EW8 ew8 = this.A07;
        if (ew8 == null) {
            0qQ.A0F("twoFacClearMethod");
            throw AnonymousClass00P.createAndThrow();
        } else {
            bundle.putSerializable("saved_two_fac_clear_method", ew8);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A0Q) {
            C49924FEz fEz = this.A09;
            if (fEz == null) {
                str2 = "twoFacSecureNonceManager";
            } else {
                String str3 = this.A0E;
                if (str3 == null) {
                    str2 = "pk";
                } else {
                    C49924FEz.A00(fEz);
                    C49551Exm exm = (C49551Exm) fEz.A00.get(str3);
                    if (exm != null) {
                        str = exm.A01;
                    } else {
                        str = null;
                    }
                    FragmentActivity requireActivity = requireActivity();
                    AnonymousClass0aP r2 = this.A06;
                    if (r2 != null) {
                        String str4 = this.A0H;
                        if (str4 == null) {
                            str2 = Dbq.A03();
                        } else {
                            String str5 = this.A0G;
                            if (str5 == null) {
                                str2 = "twoFacIdentifier";
                            } else {
                                1OC A002 = FFP.A00(requireActivity, r2, str4, str5, str, String.valueOf(5), (List) null, false);
                                A002.A00 = new EMF(this, true);
                                schedule(A002);
                                double A003 = DbS.A00();
                                double A012 = DbS.A01();
                                AnonymousClass0aP r0 = this.A06;
                                if (r0 != null) {
                                    0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r0), "two_fac_login_attempt_with_trusted_device");
                                    Dbc.A0Y(A0e, A012, A003);
                                    DbW.A12(A0e, A003);
                                    C46634DiE diE = this.A0C;
                                    if (diE == null) {
                                        str2 = "twoFacStage";
                                    } else {
                                        DbZ.A1J(A0e, diE.A01);
                                        DbW.A13(A0e, A012);
                                        A0e.Cgf();
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    str2 = "loggedOutSession";
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        if (r0.isChecked() != true) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.E25 r12) {
        /*
            X.FBf r2 = X.C49881FBf.A00
            X.0aP r1 = r12.A06
            java.lang.String r3 = "loggedOutSession"
            if (r1 == 0) goto L_0x000e
            X.DiE r0 = r12.A0C
            if (r0 != 0) goto L_0x0016
            java.lang.String r3 = "twoFacStage"
        L_0x000e:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0016:
            java.lang.String r0 = r0.A01
            r10 = 0
            r2.A00(r1, r10, r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r12.A0B
            if (r0 != 0) goto L_0x0023
            java.lang.String r3 = "confirmButton"
            goto L_0x000e
        L_0x0023:
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0087
            com.facebook.quicklog.QuickPerformanceLogger r2 = r12.A05
            if (r2 != 0) goto L_0x0030
            java.lang.String r3 = "qplLogger"
            goto L_0x000e
        L_0x0030:
            r1 = 203167632(0xc1c1790, float:1.2024893E-31)
            java.lang.String r0 = "CONFIRM_CLICK"
            r2.markerPoint(r1, r0)
            android.content.Context r4 = r12.requireContext()
            X.0aP r5 = r12.A06
            if (r5 == 0) goto L_0x000e
            java.lang.String r6 = r12.A0H
            if (r6 != 0) goto L_0x0049
            java.lang.String r3 = X.Dbq.A03()
            goto L_0x000e
        L_0x0049:
            java.lang.String r7 = r12.A0G
            if (r7 != 0) goto L_0x0050
            java.lang.String r3 = "twoFacIdentifier"
            goto L_0x000e
        L_0x0050:
            com.instagram.ui.widget.edittext.ConfirmationCodeEditText r1 = r12.A0A
            if (r1 != 0) goto L_0x0057
            java.lang.String r3 = "confirmationCodeEditText"
            goto L_0x000e
        L_0x0057:
            android.graphics.RectF r0 = X.0nA.A01
            java.lang.String r8 = X.DbV.A0y(r1)
            android.widget.CheckBox r0 = r12.A03
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x006a
            boolean r0 = r0.isChecked()
            r11 = 1
            if (r0 == r1) goto L_0x006b
        L_0x006a:
            r11 = 0
        L_0x006b:
            X.EW8 r0 = r12.A07
            if (r0 != 0) goto L_0x0072
            java.lang.String r3 = "twoFacClearMethod"
            goto L_0x000e
        L_0x0072:
            int r0 = r0.A00
            java.lang.String r9 = java.lang.String.valueOf(r0)
            X.1OC r1 = X.FFP.A00(r4, r5, r6, r7, r8, r9, r10, r11)
            X.EMF r0 = new X.EMF
            r0.<init>(r12, r2)
            r1.A00 = r0
            r12.schedule(r1)
            return
        L_0x0087:
            android.content.Context r1 = r12.requireContext()
            r0 = 2131972963(0x7f135363, float:1.9582948E38)
            java.lang.String r0 = r12.getString(r0)
            X.C49952FGh.A06(r1, r0, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E25.A00(X.E25):void");
    }

    public static final void A01(E25 e25) {
        String str;
        AnonymousClass0aP r0 = e25.A06;
        if (r0 == null) {
            str = "loggedOutSession";
        } else {
            String str2 = e25.A0H;
            if (str2 == null) {
                str = Dbq.A03();
            } else {
                String A0a2 = Dbb.A0a(e25);
                String str3 = e25.A0G;
                if (str3 == null) {
                    str = "twoFacIdentifier";
                } else {
                    String A032 = Dbq.A03();
                    1NY A0a3 = AnonymousClass7TG.A0a(r0);
                    A0a3.A0A(Dbq.A05(737, 42, 53));
                    A0a3.A0Q(C47320Dun.class, F4W.class);
                    A0a3.A9m(Dbq.A04(), A0a2);
                    A0a3.A9m(A032, str2);
                    1OC A0T2 = DbT.A0T(A0a3, Dbq.A05(779, 21, 18), str3);
                    A0T2.A00 = e25.A0b;
                    e25.schedule(A0T2);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(E25 e25) {
        String str;
        C46634DiE diE;
        ConfirmationCodeEditText confirmationCodeEditText = e25.A0A;
        String str2 = "confirmationCodeEditText";
        if (confirmationCodeEditText != null) {
            DbS.A1C(confirmationCodeEditText);
            EW8 ew8 = e25.A07;
            if (ew8 == null) {
                str = "twoFacClearMethod";
            } else {
                str = "trustDeviceOptionsSection";
                if (ew8 == EW8.TRUSTED_NOTIFICATION) {
                    View view = e25.A02;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                } else if (e25.requireArguments().getBoolean("argument_show_trusted_device_option")) {
                    View view2 = e25.A02;
                    if (view2 != null) {
                        view2.setVisibility(0);
                        CheckBox checkBox = e25.A03;
                        if (checkBox != null) {
                            checkBox.setChecked(e25.A0J);
                        }
                    }
                }
                EW8 ew82 = e25.A07;
                str = "twoFacClearMethod";
                if (ew82 != null) {
                    if (ew82 == EW8.WHATSAPP) {
                        String str3 = e25.A0F;
                        if (str3 == null) {
                            str2 = "smsNotAllowedReason";
                        } else if (str3.length() != 0) {
                            ew82 = EW8.BACKUP_CODE;
                            e25.A07 = ew82;
                        }
                    }
                    int ordinal = ew82.ordinal();
                    str = "obfuscatedPhoneNumber";
                    if (ordinal == 0) {
                        TextView textView = e25.A0N;
                        if (textView != null) {
                            textView.setText(2131975718);
                            String str4 = e25.A0O;
                            if (str4 != null) {
                                String A0z = DbV.A0z(e25, str4, 2131975717);
                                0qQ.A07(A0z);
                                int length = A0z.length();
                                SpannableStringBuilder A0C2 = DbS.A0C(A0z);
                                0qQ.A07(A0C2.append(10));
                                A0C2.append(002.A0C(e25.getString(2131975665), '.'));
                                A0C2.setSpan(new ESx(e25, Dbb.A06(e25)), length, DbX.A05(A0C2.toString()), 18);
                                TextView textView2 = e25.A0L;
                                if (textView2 != null) {
                                    DbT.A1H(textView2);
                                    TextView textView3 = e25.A0L;
                                    if (textView3 != null) {
                                        textView3.setText(A0C2);
                                        TextView textView4 = e25.A0M;
                                        if (textView4 != null) {
                                            textView4.setVisibility(8);
                                            if (!e25.A0I) {
                                                A03(e25, true);
                                            }
                                            ConfirmationCodeEditText confirmationCodeEditText2 = e25.A0A;
                                            if (confirmationCodeEditText2 != null) {
                                                confirmationCodeEditText2.setVisibility(0);
                                                ConfirmationCodeEditText confirmationCodeEditText3 = e25.A0A;
                                                if (confirmationCodeEditText3 != null) {
                                                    confirmationCodeEditText3.A04(6, true);
                                                    diE = C46634DiE.A1a;
                                                    e25.A0C = diE;
                                                }
                                            }
                                        }
                                        0qQ.A0F("descriptionTextView");
                                        throw AnonymousClass00P.createAndThrow();
                                    }
                                }
                                0qQ.A0F("bodyTextView");
                                throw AnonymousClass00P.createAndThrow();
                            }
                        }
                        0qQ.A0F("titleTextView");
                        throw AnonymousClass00P.createAndThrow();
                    } else if (ordinal == 2) {
                        TextView textView5 = e25.A0N;
                        if (textView5 != null) {
                            textView5.setText(2131975721);
                            TextView textView6 = e25.A0L;
                            if (textView6 != null) {
                                int i = 2131975719;
                                if (e25.A0P) {
                                    i = 2131975713;
                                }
                                textView6.setText(i);
                                TextView textView7 = e25.A0M;
                                if (textView7 != null) {
                                    textView7.setText(2131975720);
                                    TextView textView8 = e25.A0M;
                                    if (textView8 != null) {
                                        textView8.setVisibility(0);
                                        ConfirmationCodeEditText confirmationCodeEditText4 = e25.A0A;
                                        if (confirmationCodeEditText4 != null) {
                                            confirmationCodeEditText4.setVisibility(0);
                                            ConfirmationCodeEditText confirmationCodeEditText5 = e25.A0A;
                                            if (confirmationCodeEditText5 != null) {
                                                confirmationCodeEditText5.A04(6, true);
                                                diE = C46634DiE.A1b;
                                                e25.A0C = diE;
                                            }
                                        }
                                    }
                                }
                                0qQ.A0F("descriptionTextView");
                                throw AnonymousClass00P.createAndThrow();
                            }
                            0qQ.A0F("bodyTextView");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        0qQ.A0F("titleTextView");
                        throw AnonymousClass00P.createAndThrow();
                    } else if (ordinal == 1) {
                        TextView textView9 = e25.A0N;
                        if (textView9 != null) {
                            textView9.setText(2131975716);
                            TextView textView10 = e25.A0L;
                            if (textView10 != null) {
                                textView10.setText(2131975714);
                                TextView textView11 = e25.A0M;
                                if (textView11 != null) {
                                    textView11.setText(2131975715);
                                    TextView textView12 = e25.A0M;
                                    if (textView12 != null) {
                                        textView12.setVisibility(0);
                                        ConfirmationCodeEditText confirmationCodeEditText6 = e25.A0A;
                                        if (confirmationCodeEditText6 != null) {
                                            confirmationCodeEditText6.setVisibility(0);
                                            ConfirmationCodeEditText confirmationCodeEditText7 = e25.A0A;
                                            if (confirmationCodeEditText7 != null) {
                                                confirmationCodeEditText7.A04(8, false);
                                                diE = C46634DiE.A1Z;
                                                e25.A0C = diE;
                                            }
                                        }
                                    }
                                }
                                0qQ.A0F("descriptionTextView");
                                throw AnonymousClass00P.createAndThrow();
                            }
                            0qQ.A0F("bodyTextView");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        0qQ.A0F("titleTextView");
                        throw AnonymousClass00P.createAndThrow();
                    } else if (ordinal == 3) {
                        TextView textView13 = e25.A0N;
                        if (textView13 != null) {
                            textView13.setText(2131965602);
                            TextView textView14 = e25.A0L;
                            if (textView14 != null) {
                                textView14.setText(2131965600);
                                TextView textView15 = e25.A0M;
                                if (textView15 != null) {
                                    textView15.setVisibility(0);
                                    TextView textView16 = e25.A0M;
                                    if (textView16 != null) {
                                        textView16.setText(2131965601);
                                        ConfirmationCodeEditText confirmationCodeEditText8 = e25.A0A;
                                        if (confirmationCodeEditText8 != null) {
                                            confirmationCodeEditText8.setVisibility(8);
                                            diE = C46634DiE.A1c;
                                            e25.A0C = diE;
                                        }
                                    }
                                }
                                0qQ.A0F("descriptionTextView");
                                throw AnonymousClass00P.createAndThrow();
                            }
                            0qQ.A0F("bodyTextView");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        0qQ.A0F("titleTextView");
                        throw AnonymousClass00P.createAndThrow();
                    } else if (ordinal != 5) {
                        0wb.A03(__redex_internal_original_name, "no clear method");
                    } else {
                        TextView textView17 = e25.A0N;
                        if (textView17 != null) {
                            textView17.setText(2131975801);
                            TextView textView18 = e25.A0L;
                            if (textView18 != null) {
                                String str5 = e25.A0O;
                                if (str5 != null) {
                                    DbX.A1F(textView18, e25, str5, 2131975799);
                                    TextView textView19 = e25.A0M;
                                    if (textView19 != null) {
                                        textView19.setVisibility(0);
                                        TextView textView20 = e25.A0M;
                                        if (textView20 != null) {
                                            textView20.setText(2131975800);
                                            ConfirmationCodeEditText confirmationCodeEditText9 = e25.A0A;
                                            if (confirmationCodeEditText9 != null) {
                                                confirmationCodeEditText9.setVisibility(0);
                                                ConfirmationCodeEditText confirmationCodeEditText10 = e25.A0A;
                                                if (confirmationCodeEditText10 != null) {
                                                    confirmationCodeEditText10.A04(6, true);
                                                    diE = C46634DiE.A1d;
                                                    e25.A0C = diE;
                                                }
                                            }
                                        }
                                    }
                                    0qQ.A0F("descriptionTextView");
                                    throw AnonymousClass00P.createAndThrow();
                                }
                            }
                            0qQ.A0F("bodyTextView");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        0qQ.A0F("titleTextView");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    AnonymousClass0aP r1 = e25.A06;
                    if (r1 == null) {
                        str2 = "loggedOutSession";
                    } else {
                        C46634DiE diE2 = e25.A0C;
                        if (diE2 == null) {
                            str2 = "twoFacStage";
                        } else {
                            C49938FFr.A01(r1, diE2.A01);
                            return;
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A03(E25 e25, boolean z) {
        String str;
        AnonymousClass0aP r0 = e25.A06;
        if (r0 != null) {
            0wc A022 = AnonymousClass0kN.A02(r0);
            double A002 = DbS.A00();
            double A012 = DbS.A01();
            0Aj A0e = AnonymousClass7TE.A0e(A022, "two_fac_resend_sms_tapped");
            if (A0e.isSampled()) {
                Dbc.A0Y(A0e, A012, A002);
                DbW.A12(A0e, A002);
                C46634DiE diE = e25.A0C;
                if (diE == null) {
                    str = "twoFacStage";
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                DbZ.A1J(A0e, diE.A01);
                FH8.A07(A0e, A012);
                A0e.Cgf();
            }
            if (!z) {
                C49483EwO ewO = e25.A08;
                str = "twoFacPhoneVerificationHelper";
                if (ewO != null) {
                    if (SystemClock.elapsedRealtime() - ewO.A01 < ((long) (ewO.A00 * IgNetworkConsentStorage.MAX_ENTRIES))) {
                        C48982EnK.A00(e25.requireContext(), ewO.A00);
                        return;
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            Context requireContext = e25.requireContext();
            AnonymousClass0aP r02 = e25.A06;
            if (r02 != null) {
                String str2 = e25.A0H;
                if (str2 == null) {
                    str = Dbq.A03();
                } else {
                    String str3 = e25.A0G;
                    if (str3 == null) {
                        str = "twoFacIdentifier";
                    } else {
                        1NY A0a2 = AnonymousClass7TG.A0a(r02);
                        A0a2.A0A("accounts/send_two_factor_login_sms/");
                        DbW.A1D(A0a2);
                        A0a2.A9m(Dbq.A03(), str2);
                        DbZ.A0y(requireContext, A0a2, Dbq.A04(), DbT.A0u(requireContext, A0a2, Dbq.A05(779, 21, 18), str3));
                        1OC A0K2 = DbW.A0K(A0a2);
                        A0K2.A00 = e25.A0a;
                        e25.schedule(A0K2);
                        QuickPerformanceLogger quickPerformanceLogger = e25.A05;
                        if (quickPerformanceLogger == null) {
                            str = "qplLogger";
                        } else {
                            quickPerformanceLogger.markerPoint(203167632, "RESEND_CODE_CLICK");
                            return;
                        }
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        str = "loggedOutSession";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void beforeOnPause() {
        Handler handler = this.A00;
        if (handler == null) {
            0qQ.A0F("notificationStatusHandler");
            throw AnonymousClass00P.createAndThrow();
        } else {
            handler.removeCallbacks(this.A0U);
        }
    }

    public final AnonymousClass0wW getSession() {
        AnonymousClass0aP r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("loggedOutSession");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void afterOnResume() {
        String str;
        super.afterOnResume();
        EW8 ew8 = this.A07;
        if (ew8 == null) {
            str = "twoFacClearMethod";
        } else if (ew8 == EW8.TRUSTED_NOTIFICATION) {
            Handler handler = this.A00;
            if (handler == null) {
                str = "notificationStatusHandler";
            } else {
                handler.postDelayed(this.A0U, 3000);
                return;
            }
        } else {
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        EW8 ew8;
        Serializable serializable;
        String str;
        int A022 = AnonymousClass0fD.A02(-1862661960);
        E25.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        08y r0 = 09i.A0A;
        0qQ.A0A(requireArguments);
        this.A06 = r0.A02(requireArguments);
        this.A08 = new C49483EwO();
        int i = requireArguments.getInt("resend_sms_delay_sec");
        C49483EwO ewO = this.A08;
        if (ewO == null) {
            str = "twoFacPhoneVerificationHelper";
        } else {
            ewO.A00 = i;
            int i2 = requireArguments.getInt("argument_two_fac_clear_method");
            EW8[] values = EW8.values();
            int length = values.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    ew8 = EW8.UNKNOWN;
                    break;
                }
                ew8 = values[i3];
                if (ew8.A00 == i2) {
                    break;
                }
                i3++;
            }
            this.A07 = ew8;
            1xC.A01.A02(this.A0c, C50254FVl.class);
            EW8 ew82 = this.A07;
            if (ew82 == null) {
                str = "twoFacClearMethod";
            } else {
                this.A0I = AnonymousClass7TF.A1W(ew82, EW8.SMS);
                this.A0K = requireArguments.getBoolean("ARGUMENT_SHOULD_REMEMBER_PASSWORD");
                this.A0H = requireArguments.getString("argument_username", "");
                this.A0E = requireArguments.getString("argument_pk", "");
                this.A0G = requireArguments.getString("argument_two_fac_identifier", "");
                this.A0O = requireArguments.getString("argument_abfuscated_phone_number", "");
                this.A0J = requireArguments.getBoolean("argument_should_opt_in_trusted_device_option");
                this.A0F = requireArguments.getString("argument_sms_not_allowed_reason", "");
                this.A0P = requireArguments.getBoolean("eligible_for_multiple_totp");
                this.A0Q = requireArguments.getBoolean("argument_is_trusted_device");
                if (this.A06 == null) {
                    str = "loggedOutSession";
                } else {
                    02m r1 = 02m.A0p;
                    this.A05 = r1;
                    if (r1 == null) {
                        str = "qplLogger";
                    } else {
                        r1.markerStart(203167632);
                        this.A00 = AnonymousClass7TF.A0D();
                        this.A0C = C46634DiE.A1Y;
                        this.A09 = FFR.A02();
                        if (bundle != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = bundle.getSerializable("saved_two_fac_clear_method", EW8.class);
                            } else {
                                serializable = bundle.getSerializable("saved_two_fac_clear_method");
                            }
                            0qQ.A0C(serializable, "null cannot be cast to non-null type com.instagram.login.twofac.constants.TwoFacConstants.TwoFacClearMethod");
                            this.A07 = (EW8) serializable;
                        }
                        AnonymousClass0fD.A09(1313565939, A022);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-479853866);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.two_fac_confirm_phone_number_fragment, viewGroup, false);
        this.A01 = inflate;
        if (inflate != null) {
            TextView A0G2 = DbU.A0G(inflate, R.id.two_fac_confirm_phone_number_title);
            this.A0N = A0G2;
            if (A0G2 == null) {
                0qQ.A0F("titleTextView");
                throw AnonymousClass00P.createAndThrow();
            }
            ViewGroup.MarginLayoutParams A0G3 = DbX.A0G(A0G2);
            A0G3.setMargins(A0G3.leftMargin, 0, A0G3.rightMargin, A0G3.bottomMargin);
            A0G2.setLayoutParams(A0G3);
            View view = this.A01;
            if (view != null) {
                ImageView A0G4 = DbS.A0G(view, R.id.two_fac_back_icon);
                if (A0G4 != null) {
                    A0G4.setVisibility(0);
                    AnonymousClass0fU.A00(this.A0X, A0G4);
                    DbU.A14(requireContext(), A0G4, 2Yu.A0B(A0G4.getContext()));
                }
                View view2 = this.A01;
                if (view2 != null) {
                    this.A0L = DbU.A0G(view2, R.id.two_fac_confirm_phone_number_body);
                    View view3 = this.A01;
                    if (view3 != null) {
                        this.A0M = DbU.A0G(view3, R.id.two_fac_confirm_phone_number_description);
                        View view4 = this.A01;
                        if (view4 != null) {
                            ProgressButton A0O2 = Dba.A0O(view4);
                            A0O2.setText(2131956481);
                            AnonymousClass0fU.A00(this.A0W, A0O2);
                            A0O2.setEnabled(false);
                            this.A0B = A0O2;
                            View view5 = this.A01;
                            if (view5 != null) {
                                ConfirmationCodeEditText confirmationCodeEditText = (ConfirmationCodeEditText) view5.requireViewById(R.id.edit_text);
                                confirmationCodeEditText.addTextChangedListener(this.A0V);
                                confirmationCodeEditText.setOnEditorActionListener(this.A0Z);
                                confirmationCodeEditText.setOnLongClickListener(this.A0Y);
                                confirmationCodeEditText.A02 = 0;
                                this.A0A = confirmationCodeEditText;
                                View view6 = this.A01;
                                if (view6 != null) {
                                    this.A02 = view6.requireViewById(R.id.two_fac_trusted_device_login_checkbox);
                                    View view7 = this.A01;
                                    if (view7 != null) {
                                        this.A03 = (CheckBox) view7.findViewById(R.id.two_fac_trusted_device_checkbox);
                                        View view8 = this.A01;
                                        if (view8 != null) {
                                            TextView A0G5 = DbU.A0G(view8, R.id.two_fac_bottom_button_secondary);
                                            A0G5.setText(2131975712);
                                            FP3.A00(A0G5, 50, this);
                                            A0G5.setVisibility(0);
                                            this.A04 = A0G5;
                                            View view9 = this.A01;
                                            if (view9 != null) {
                                                AnonymousClass7TH.A0R(view9.findViewById(R.id.footer));
                                                A02(this);
                                                View view10 = this.A01;
                                                if (view10 != null) {
                                                    AnonymousClass0fD.A09(-942325051, A022);
                                                    return view10;
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
        0qQ.A0F("rootView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1537464454);
        super.onDestroy();
        1xC.A01.A03(this.A0c, C50254FVl.class);
        AnonymousClass0fD.A09(1003426354, A022);
    }

    public final void onPause() {
        Window window;
        int A022 = AnonymousClass0fD.A02(1743958678);
        E25.super.onPause();
        Activity rootActivity = getRootActivity();
        if (!(rootActivity == null || (window = rootActivity.getWindow()) == null)) {
            window.setSoftInputMode(0);
            ConfirmationCodeEditText confirmationCodeEditText = this.A0A;
            if (confirmationCodeEditText == null) {
                0qQ.A0F("confirmationCodeEditText");
                throw AnonymousClass00P.createAndThrow();
            }
            0nA.A0N(confirmationCodeEditText);
        }
        AnonymousClass0fD.A09(383855930, A022);
    }

    public final void onResume() {
        Window window;
        int A022 = AnonymousClass0fD.A02(703619229);
        super.onResume();
        Activity rootActivity = getRootActivity();
        if (!(rootActivity == null || (window = rootActivity.getWindow()) == null)) {
            window.setSoftInputMode(16);
            ConfirmationCodeEditText confirmationCodeEditText = this.A0A;
            if (confirmationCodeEditText != null) {
                confirmationCodeEditText.requestFocus();
                ConfirmationCodeEditText confirmationCodeEditText2 = this.A0A;
                if (confirmationCodeEditText2 != null) {
                    0nA.A0Q(confirmationCodeEditText2);
                }
            }
            0qQ.A0F("confirmationCodeEditText");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A09(-1627768489, A022);
    }
}
