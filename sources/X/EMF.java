package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.io.IOException;

public final class EMF extends C47695EDe {
    public final boolean A00;
    public final /* synthetic */ E25 A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EMF(X.E25 r10, boolean r11) {
        /*
            r9 = this;
            r0 = r9
            r3 = r10
            r9.A01 = r10
            X.0aP r4 = r10.A06
            if (r4 != 0) goto L_0x0012
            java.lang.String r0 = "loggedOutSession"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0012:
            androidx.fragment.app.FragmentActivity r1 = r10.requireActivity()
            X.DiE r6 = X.C46634DiE.A1X
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            r5 = 0
            android.net.Uri r2 = X.C46413Dea.A01(r10)
            r8 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.A00 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EMF.<init>(X.E25, boolean):void");
    }

    public final void A04(EM4 em4) {
        int A0D = AnonymousClass7TG.A0D(em4, -1777652521);
        E25 e25 = this.A01;
        if (e25.requireArguments().getBoolean("argument_is_from_one_click_flow")) {
            0xY A0d = DbS.A0d(DbS.A0e());
            A0d.E5T("has_one_clicked_logged_in", true);
            A0d.apply();
        }
        String id = em4.A00.getId();
        AnonymousClass0aP r0 = e25.A06;
        String str = "loggedOutSession";
        if (r0 != null) {
            if (C319606qt.A01(r0).A0K(id)) {
                AnonymousClass0aP r02 = e25.A06;
                if (r02 != null) {
                    C319606qt A012 = C319606qt.A01(r02);
                    if (e25.A06 != null) {
                        A012.A0G(id);
                    }
                }
            }
            if (e25.A0K) {
                AnonymousClass0aP r03 = e25.A06;
                if (r03 != null) {
                    C319606qt A013 = C319606qt.A01(r03);
                    Integer num = AnonymousClass05K.A15;
                    AnonymousClass0aP r10 = e25.A06;
                    if (r10 != null) {
                        A013.A09(e25.getContext(), e25, r10, num, id, true);
                    }
                }
            }
            C49924FEz fEz = e25.A09;
            if (fEz == null) {
                str = "twoFacSecureNonceManager";
            } else {
                String str2 = e25.A0E;
                if (str2 == null) {
                    str = "pk";
                } else {
                    fEz.A01.remove(str2);
                    if (this.A00) {
                        double A002 = DbS.A00();
                        double A014 = DbS.A01();
                        AnonymousClass0aP r5 = e25.A06;
                        if (r5 != null) {
                            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r5), "two_fac_login_success_with_trusted_device");
                            Dbc.A0Y(A0e, A014, A002);
                            DbW.A12(A0e, A002);
                            C46634DiE diE = e25.A0C;
                            if (diE == null) {
                                str = "twoFacStage";
                            } else {
                                DbZ.A1J(A0e, diE.A01);
                                DbW.A13(A0e, A014);
                                A0e.Cgf();
                            }
                        }
                    }
                    QuickPerformanceLogger quickPerformanceLogger = e25.A05;
                    if (quickPerformanceLogger == null) {
                        str = "qplLogger";
                    } else {
                        quickPerformanceLogger.markerEnd(203167632, 2);
                        super.A04(em4);
                        AnonymousClass0fD.A0A(733348507, A0D);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onFail(C268654dm r12) {
        boolean z;
        String str;
        1XP r0;
        int A03 = AnonymousClass0fD.A03(743376107);
        0qQ.A0B(r12, 0);
        super.onFail(r12);
        if (!(r12 instanceof C268674do) || (r0 = (1XP) ((C268674do) r12).A00) == null || !r0.isCheckpointRequired()) {
            z = false;
        } else {
            z = true;
            DbT.A1I(this.A01);
        }
        if (this.A00 && !z) {
            E25 e25 = this.A01;
            EW8 ew8 = e25.A07;
            str = "twoFacClearMethod";
            if (ew8 != null) {
                if (ew8 == EW8.SMS) {
                    E25.A03(e25, true);
                } else if (ew8 == EW8.WHATSAPP) {
                    E25.A01(e25);
                }
                View view = e25.A01;
                if (view == null) {
                    str = "rootView";
                } else {
                    view.setVisibility(0);
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        1XP r2 = (1XP) r12.A00();
        if (r2 != null) {
            E25 e252 = this.A01;
            String errorMessage = r2.getErrorMessage();
            double A002 = DbS.A00();
            double A012 = DbS.A01();
            AnonymousClass0aP r7 = e252.A06;
            if (r7 != null) {
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r7), "two_fac_login_failed");
                Dbc.A0Y(A0e, A012, A002);
                C46634DiE diE = e252.A0C;
                if (diE != null) {
                    Dbc.A0c(A0e, "step", diE.A01, A002);
                    FH8.A07(A0e, A012);
                    A0e.AAJ(DialogModule.KEY_MESSAGE, errorMessage);
                    A0e.Cgf();
                    boolean hasErrorType = r2.hasErrorType("sms_code_validation_code_invalid");
                    str = "qplLogger";
                    QuickPerformanceLogger quickPerformanceLogger = e252.A05;
                    if (hasErrorType) {
                        if (quickPerformanceLogger != null) {
                            quickPerformanceLogger.markerPoint(203167632, "LOGIN_REQUEST_FAILED");
                        }
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                    if (quickPerformanceLogger != null) {
                        quickPerformanceLogger.markerEnd(203167632, 3);
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                    if (0qQ.A0K(r2.getErrorMessage(), e252.getString(2131975806))) {
                        1Q0 r1 = 1Q0.A21;
                        AnonymousClass0aP r02 = e252.A06;
                        if (r02 != null) {
                            FGI A02 = r1.A02(r02);
                            C46634DiE diE2 = e252.A0C;
                            if (diE2 != null) {
                                FGI.A03(A02, diE2);
                            }
                        }
                    } else if (r2.hasErrorType("invalid_trusted_device")) {
                        C49924FEz A022 = FFR.A02();
                        String str2 = e252.A0E;
                        if (str2 == null) {
                            str = "pk";
                            0qQ.A0F(str);
                            throw AnonymousClass00P.createAndThrow();
                        }
                        A022.A00.remove(str2);
                        try {
                            C49924FEz.A01(A022);
                        } catch (IOException e) {
                            0wb.A07("Two fac secure nonce manager", e);
                        }
                    }
                }
                str = "twoFacStage";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            str = "loggedOutSession";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A0A(698002047, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(2120426756);
        EMF.super.onFinish();
        boolean z = this.A00;
        E25 e25 = this.A01;
        if (z) {
            SQH.A01(e25.getParentFragmentManager());
        } else {
            ProgressButton progressButton = e25.A0B;
            String str = "confirmButton";
            if (progressButton != null) {
                progressButton.setEnabled(true);
                ProgressButton progressButton2 = e25.A0B;
                if (progressButton2 != null) {
                    progressButton2.setShowProgressBar(false);
                    TextView textView = e25.A04;
                    str = "secondaryButton";
                    if (textView != null) {
                        textView.setEnabled(true);
                        TextView textView2 = e25.A04;
                        if (textView2 != null) {
                            textView2.setAlpha(1.0f);
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A0A(1235212423, A03);
    }

    public final void onStart() {
        String str;
        int A03 = AnonymousClass0fD.A03(-1406853597);
        EMF.super.onStart();
        boolean z = this.A00;
        E25 e25 = this.A01;
        if (z) {
            View view = e25.A01;
            if (view == null) {
                str = "rootView";
            } else {
                view.setVisibility(8);
                SQH.A02(e25.getParentFragmentManager());
                AnonymousClass0fD.A0A(-1540164599, A03);
                return;
            }
        } else {
            ProgressButton progressButton = e25.A0B;
            str = "confirmButton";
            if (progressButton != null) {
                progressButton.setEnabled(false);
                ProgressButton progressButton2 = e25.A0B;
                if (progressButton2 != null) {
                    progressButton2.setShowProgressBar(true);
                    TextView textView = e25.A04;
                    str = "secondaryButton";
                    if (textView != null) {
                        textView.setEnabled(false);
                        TextView textView2 = e25.A04;
                        if (textView2 != null) {
                            textView2.setAlpha(0.25f);
                            AnonymousClass0fD.A0A(-1540164599, A03);
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass0fD.A0A(-225297542, C47695EDe.A00(this, obj, -365070744));
    }
}
