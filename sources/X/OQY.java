package X;

import android.content.Context;
import android.text.Editable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

public abstract class OQY {
    public static final void A00(Context context, UserSession userSession, C329247Id r10, ComposerAutoCompleteTextView composerAutoCompleteTextView, Object obj, boolean z) {
        C3260875i r4;
        XSV xsv;
        Object obj2 = obj;
        AnonymousClass7TG.A1R(context, userSession);
        if (obj != null) {
            if (composerAutoCompleteTextView != null && composerAutoCompleteTextView.A01) {
                CharSequence A00 = composerAutoCompleteTextView.A00(obj);
                if (obj instanceof C3260975j) {
                    if (z && ((C3260975j) obj2).A02 == AnonymousClass7OS.AI && !DbT.A1a(AnonymousClass7TE.A0q(userSession), "has_seen_multi_modal_ai_nux")) {
                        DbW.A1L(AnonymousClass7TF.A0N(userSession), "has_seen_multi_modal_ai_nux");
                        C49951FGg.A03(context, userSession);
                    }
                    if (A00.length() > 0) {
                        composerAutoCompleteTextView.A03(A00);
                    } else {
                        composerAutoCompleteTextView.A04("");
                    }
                    ((C3260975j) obj2).A01.A00();
                } else if (obj instanceof C3261075k) {
                    C3261075k r5 = (C3261075k) obj2;
                    C3260875i r12 = r5.A01;
                    Integer A03 = r12.A03();
                    if (!r5.A08 || A03 == null || !A01(composerAutoCompleteTextView, A03.intValue())) {
                        A00(context, userSession, r10, composerAutoCompleteTextView, r12, z);
                        composerAutoCompleteTextView.getText().insert(composerAutoCompleteTextView.getSelectionStart(), String.valueOf(r5.A02.A02().A00));
                    }
                    A00(context, userSession, r10, composerAutoCompleteTextView, r5.A02, z);
                }
                if (obj2 instanceof C68976Nc5) {
                    composerAutoCompleteTextView.A04(A00);
                } else {
                    composerAutoCompleteTextView.A03(A00);
                }
            }
            if (r10 != null) {
                C329257Ie r1 = r10.A03;
                if ((obj2 instanceof C3260875i) && (r4 = (C3260875i) obj2) != null) {
                    C329267If r2 = r1.A00;
                    String A002 = C329257Ie.A00(r4);
                    String str = r4.A01().A00;
                    AnonymousClass7TG.A1N(A002, str);
                    0Aj A0e = AnonymousClass7TE.A0e(r2.A00, "ig_direct_command_system_selected");
                    if (A0e.isSampled()) {
                        boolean A1W = C66582MXn.A1W(r2.A02);
                        C254783t2 r52 = r2.A01;
                        String A02 = AnonymousClass4KK.A02(r52);
                        if (A02 == null) {
                            A02 = "";
                        }
                        Long A10 = AnonymousClass7TE.A10(A02);
                        boolean A07 = AnonymousClass6W3.A07(r52);
                        if (A07) {
                            if (A1W) {
                                xsv = XSV.A03;
                            } else {
                                xsv = XSV.A04;
                            }
                        } else if (A1W) {
                            xsv = XSV.A05;
                        } else {
                            xsv = XSV.A06;
                        }
                        0bb r13 = new 0bb();
                        r13.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A02);
                        r13.A06("key", A02);
                        r13.A01(xsv, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                        A0e.AAK(r13, "thread");
                        A0e.A9F("recipient_id", A10);
                        A0e.AAJ(C273654mx.A00(2182), str);
                        DbS.A1N(A0e, A002);
                        C66581MXm.A1H(A0e, A07);
                        C66584MXp.A0r(A0e, r52);
                        A0e.Cgf();
                    }
                }
            } else {
                return;
            }
        } else if (r10 == null) {
            return;
        }
        0Aj A0e2 = AnonymousClass7TE.A0e(r10.A01.A00, "msg_mention_clicks");
        if (A0e2.isSampled()) {
            A0e2.A7p("is_xac_thread", AnonymousClass7TE.A0u());
            A0e2.A7p("is_group_thread", AnonymousClass7TE.A0v());
            A0e2.Cgf();
        }
    }

    public static final boolean A01(ComposerAutoCompleteTextView composerAutoCompleteTextView, int i) {
        if (composerAutoCompleteTextView == null) {
            return false;
        }
        Editable text = composerAutoCompleteTextView.getText();
        0sC A00 = 0pe.A00(text.getSpans(0, text.length(), OCB.class));
        while (A00.hasNext()) {
            Integer A03 = ((OCB) A00.next()).A00.A03();
            if (A03 != null && A03.intValue() == i) {
                return true;
            }
        }
        return false;
    }
}
