package X;

import android.app.Activity;
import android.app.Dialog;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.AbsListView;
import android.widget.TextView;
import android.widget.ViewAnimator;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Arrays;

/* renamed from: X.3GD  reason: invalid class name */
public final class AnonymousClass3GD extends AnonymousClass1GX {
    public int A00;
    public Dialog A01;
    public Dialog A02;
    public TextView A03;
    public C45417Cvx A04;
    public VSB A05;
    public boolean A06;
    public boolean A07;
    public final long A08 = SystemClock.elapsedRealtime();
    public final Activity A09;
    public final Handler A0A = new AnonymousClass3GE(this);
    public final UserSession A0B;
    public final C228162kt A0C;
    public final AnonymousClass4DU A0D;
    public final AnonymousClass3GC A0E;

    public static final void A00(Dialog dialog, C45417Cvx cvx, AnonymousClass3GD r6, int i) {
        AbsListView absListView = null;
        if (dialog != null) {
            absListView = (AbsListView) dialog.findViewById(R.id.multiQuestionSurveyList);
        }
        VZT vzt = (VZT) cvx.A04.get(i);
        String str = vzt.A03;
        0qQ.A07(str);
        TextView textView = r6.A03;
        if (textView != null) {
            textView.setText(str);
        }
        if (absListView != null) {
            VSB vsb = r6.A05;
            if (vsb == null) {
                0qQ.A0F("multiSelectNextListener");
                throw AnonymousClass00P.createAndThrow();
            }
            absListView.setAdapter(new C15451Ud2(vzt, vsb));
        }
        if (cvx.A00 == AnonymousClass05K.A00) {
            UserSession userSession = r6.A0B;
            AnonymousClass4DU r1 = r6.A0D;
            0qQ.A0B(userSession, 0);
            0xI A002 = 0xI.A00(r1, "user_sentiment_survey_presented");
            A002.A0C("survey_id", cvx.A01);
            C60510iO.A00(userSession).EFq(A002);
        }
    }

    public static final void A02(AnonymousClass3GD r2) {
        r2.A01 = null;
        r2.A02 = null;
        r2.A04 = null;
        r2.A06 = false;
        r2.A03 = null;
        r2.A0A.removeMessages(3);
        C228162kt r0 = r2.A0C;
        if (r0 != null) {
            r0.FJ2(r2);
        }
    }

    public static final void A01(C45417Cvx cvx, AnonymousClass3GD r11, String[] strArr) {
        View view;
        Dialog dialog;
        View findViewById;
        VZT vzt = (VZT) cvx.A04.get(r11.A00);
        vzt.A00++;
        UserSession userSession = r11.A0B;
        AnonymousClass4DU r6 = r11.A0D;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(strArr, 3);
        0qQ.A0B(r6, 4);
        Integer num = cvx.A00;
        Integer num2 = AnonymousClass05K.A01;
        if (num == num2) {
            String A002 = C273654mx.A00(404);
            C254523sc r5 = new C254523sc(r6, 002.A0R("instagram_ad_", A002));
            r5.A83 = 0sr.A1P(Arrays.copyOf(strArr, strArr.length));
            boolean z = true;
            boolean z2 = false;
            if (cvx.A02 != null) {
                z2 = true;
            }
            r5.A2C = Boolean.valueOf(z2);
            r5.A6X = vzt.A02;
            r5.A7J = cvx.A03;
            if (!C271764jY.A00(userSession, r5, r6, num2)) {
                0xI A003 = 0xI.A00(r6, 002.A0R("instagram_ad_", A002));
                A003.A0E("responses", strArr);
                if (cvx.A02 == null) {
                    z = false;
                }
                A003.A09("show_primer", Boolean.valueOf(z));
                A003.A0C("question_id", vzt.A02);
                A003.A0C("tracking_token", cvx.A03);
                C60510iO.A00(userSession).EHF(A003);
            }
        } else {
            0xI A004 = 0xI.A00(r6, "user_sentiment_survey");
            A004.A0C("survey_id", cvx.A01);
            A004.A0C("selected_survey_answer", strArr[0]);
            C60510iO.A00(userSession).EFq(A004);
        }
        r11.A00++;
        int size = cvx.A04.size() - 1;
        int i = r11.A00;
        Dialog dialog2 = r11.A01;
        if (i > size) {
            if (!(dialog2 == null || (findViewById = dialog2.findViewById(R.id.alertTitleContainer)) == null)) {
                findViewById.setVisibility(8);
            }
            if (!cvx.A06 && (dialog = r11.A01) != null) {
                View findViewById2 = dialog.findViewById(R.id.button_blue);
                0qQ.A07(findViewById2);
                findViewById2.setVisibility(0);
            }
            Dialog dialog3 = r11.A01;
            if (dialog3 != null) {
                view = dialog3.findViewById(R.id.surveyFlipper);
            } else {
                view = null;
            }
            0qQ.A0C(view, "null cannot be cast to non-null type android.widget.ViewFlipper");
            ((ViewAnimator) view).showNext();
            r11.A00 = 0;
            return;
        }
        A00(dialog2, cvx, r11, i);
    }

    public static final void A03(AnonymousClass3GD r8) {
        Handler handler = r8.A0A;
        handler.removeMessages(3);
        C228162kt r0 = r8.A0C;
        if (r0 != null && r0.AuP() == 0 && !r8.A07) {
            handler.sendEmptyMessageDelayed(3, (long) ((int) Math.max(2000, 15000 - (SystemClock.elapsedRealtime() - r8.A08))));
        }
    }

    public AnonymousClass3GD(Activity activity, UserSession userSession, C228162kt r5, AnonymousClass4DU r6, AnonymousClass3GC r7) {
        this.A09 = activity;
        this.A0B = userSession;
        this.A0D = r6;
        this.A0E = r7;
        this.A0C = r5;
    }

    public final void onScrollStateChanged(C238133Ar r3, int i) {
        int A032 = AnonymousClass0fD.A03(1709331444);
        A03(this);
        AnonymousClass0fD.A0A(1326561033, A032);
    }
}
