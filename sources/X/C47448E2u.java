package X;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.E2u  reason: case insensitive filesystem */
public final class C47448E2u extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PhoneVerifyFragment";
    public long A00;
    public CountDownTimer A01;
    public EditText A02;
    public TextView A03;
    public TextView A04;
    public ActionButton A05;
    public AnonymousClass0wW A06;
    public UserSession A07;
    public FBN A08;
    public FX2 A09;
    public FX3 A0A;
    public FX4 A0B;
    public FX5 A0C;
    public FKo A0D;
    public EVZ A0E;
    public ProgressButton A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public InputMethodManager A0K;
    public final Handler A0L = new Handler();
    public final 1P0 A0M = new C47699EDi(this, 12);
    public final 1P0 A0N = new C47699EDi(this, 13);
    public final Runnable A0O = new C51220Fqb(this);

    public final String getModuleName() {
        return "phone_verify";
    }

    public static void A00(C47448E2u e2u) {
        if (e2u.A0E == EVZ.ARGUMENT_TWOFAC_FLOW) {
            0JA.A03(e2u.A07, "createEnableSMSTwoFactorRequest() additionally includes a checkNotNull in IgApi.Builder to assert that the user session is not null");
            1OC A032 = FFP.A03(e2u.requireContext(), e2u.A07, DbU.A0l(e2u.requireArguments(), PaymentDetailChangeTypes$Companion.PHONE_NUMBER), new 11S("\\D+").A00(AnonymousClass7TF.A0f(e2u.A0D.A01), ""));
            A032.A00 = e2u.A0N;
            e2u.schedule(A032);
        }
        0JA.A03(e2u.A07, "createVerifySMSCodeTask() additionally includes a checkNotNull in IgApi.Builder to assert that the user session is not null");
        Bundle requireArguments = e2u.requireArguments();
        1OC A052 = C318486p2.A05(e2u.A07, requireArguments.getString(PaymentDetailChangeTypes$Companion.PHONE_NUMBER), new 11S("\\D+").A00(AnonymousClass7TF.A0f(e2u.A0D.A01), ""), requireArguments.getBoolean("HAS_SMS_CONSENT"));
        A052.A00 = e2u.A0N;
        e2u.schedule(A052);
    }

    public final AnonymousClass0wW getSession() {
        return this.A06;
    }

    public final void configureActionBar(2da r4) {
        this.A05 = r4.ErL(new FP3((Object) this, 14), 2131976393);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.FBN, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        EVZ evz;
        int A022 = AnonymousClass0fD.A02(-1652015096);
        int A023 = AnonymousClass0fD.A02(803847063);
        C47448E2u.super.onCreate(bundle);
        this.A06 = DbX.A0T(this);
        if (bundle == null) {
            bundle = this.mArguments;
        }
        ? obj = new Object();
        obj.A02 = bundle.getInt("resend_sms_delay_sec");
        obj.A01 = bundle.getInt("robocall_count_down_time_sec");
        obj.A03 = bundle.getBoolean("robocall_after_max_sms");
        obj.A00 = bundle.getInt("max_sms_count");
        this.A08 = obj;
        this.A00 = SystemClock.elapsedRealtime();
        AnonymousClass0fD.A09(-1270960520, A023);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A07 = DbX.A0U(this);
            String A0E2 = Dbc.A0E(DbU.A0l(bundle2, PaymentDetailChangeTypes$Companion.PHONE_NUMBER));
            this.A0H = A0E2;
            if (A0E2 != null) {
                this.A0H = A0E2.replace("-", " ");
            }
        }
        this.A0K = (InputMethodManager) requireActivity().getSystemService("input_method");
        boolean z = false;
        if (bundle2 != null && bundle2.getBoolean("AUTO_CONFIRM_SMS", false)) {
            z = true;
        }
        this.A0I = z;
        Bundle bundle3 = this.mArguments;
        if (bundle3 == null) {
            evz = EVZ.ARGUMENT_DEFAULT_FLOW;
        } else {
            evz = EVZ.values()[bundle3.getInt("flow_key")];
        }
        this.A0E = evz;
        this.A0J = EVZ.ARGUMENT_EDIT_PROFILE_FLOW.equals(evz);
        AnonymousClass0fD.A09(-1298985371, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        int A022 = AnonymousClass0fD.A02(-1682722048);
        int A023 = AnonymousClass0fD.A02(1504536409);
        boolean z = this.A0J;
        int i = R.layout.fragment_verify;
        if (z) {
            i = R.layout.fragment_verify_new;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        this.A03 = DbU.A0G(inflate, R.id.code_verification_instruction);
        if (this.A0J) {
            this.A0G = getString(2131976378);
            string = DbU.A07(inflate.getResources(), this.A0H, 2131972257).toString();
        } else {
            String string2 = getString(2131976379);
            this.A0G = string2;
            string = getString(2131976376, new Object[]{this.A0H, string2});
        }
        String str = this.A0G;
        TextView textView = this.A03;
        FP3 fp3 = new FP3((Object) this, 1);
        SpannableStringBuilder A0C2 = DbS.A0C(string);
        AnonymousClass7AV.A05(A0C2, new C48040ESf(Integer.valueOf(textView.getCurrentTextColor()), fp3, 2), str);
        DbT.A1H(textView);
        textView.setHighlightColor(0);
        textView.setText(A0C2);
        AnonymousClass0fD.A09(892733533, A023);
        if (this.A0J) {
            ProgressButton A0O2 = Dba.A0O(inflate);
            this.A0F = A0O2;
            A0O2.setEnabled(false);
            FP3.A00(this.A0F, 13, this);
        } else {
            this.A04 = DbU.A0G(inflate, R.id.code_verification_instruction);
            String string3 = getString(2131954974);
            String A0z = DbV.A0z(this, string3, 2131976394);
            TextView textView2 = this.A04;
            0JA.A03(textView2, "Set as non-null in the line directly preceding this method call in OnCreateView");
            FP3 fp32 = new FP3((Object) this, 15);
            SpannableStringBuilder A0C3 = DbS.A0C(A0z);
            AnonymousClass7AV.A05(A0C3, new C48040ESf(Integer.valueOf(textView2.getCurrentTextColor()), fp32, 2), string3);
            DbT.A1H(textView2);
            textView2.setHighlightColor(0);
            textView2.setText(A0C3);
        }
        EditText A0E2 = DbU.A0E(inflate, R.id.confirmation_code);
        this.A02 = A0E2;
        FKo fKo = new FKo(A0E2, this);
        this.A0D = fKo;
        this.A02.addTextChangedListener(fKo);
        FQe.A00(this.A02, this, 6);
        if (this.A0J) {
            C49948FGd.A04((SearchEditText) this.A02);
        }
        if (this.A0I) {
            1xC r2 = 1xC.A01;
            FX4 fx4 = new FX4(this);
            this.A0B = fx4;
            r2.A02(fx4, C50255FVm.class);
            FX2 fx2 = new FX2(this);
            this.A09 = fx2;
            r2.A02(fx2, C50252FVj.class);
            FX5 fx5 = new FX5(this);
            this.A0C = fx5;
            r2.A02(fx5, C50263FVu.class);
            FX3 fx3 = new FX3(this);
            this.A0A = fx3;
            r2.A02(fx3, C50262FVt.class);
        }
        AnonymousClass0fD.A09(1059740674, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1653739574);
        super.onDestroy();
        CountDownTimer countDownTimer = this.A01;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A01 = null;
        }
        AnonymousClass0fD.A09(-187956484, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1871408601);
        InputMethodManager inputMethodManager = this.A0K;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.A02.getWindowToken(), 0);
        }
        this.A02.removeCallbacks(this.A0O);
        this.A0D = null;
        this.A02 = null;
        this.A04 = null;
        this.A05 = null;
        this.A0F = null;
        if (this.A0I) {
            1xC r2 = 1xC.A01;
            FX4 fx4 = this.A0B;
            if (fx4 != null) {
                r2.A03(fx4, C50255FVm.class);
            }
            FX2 fx2 = this.A09;
            if (fx2 != null) {
                r2.A03(fx2, C50252FVj.class);
            }
            FX5 fx5 = this.A0C;
            if (fx5 != null) {
                r2.A03(fx5, C50263FVu.class);
            }
            FX3 fx3 = this.A0A;
            if (fx3 != null) {
                r2.A03(fx3, C50262FVt.class);
            }
        }
        super.onDestroyView();
        AnonymousClass0fD.A09(-2024631975, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1801650564);
        int A023 = AnonymousClass0fD.A02(248008605);
        super.onResume();
        FBN fbn = this.A08;
        if (fbn.A03 && fbn.A00 <= 0 && SystemClock.elapsedRealtime() - this.A00 >= ((long) (fbn.A02 * IgNetworkConsentStorage.MAX_ENTRIES)) && this.A01 == null) {
            C46670Diz diz = new C46670Diz(this, (long) (fbn.A01 * IgNetworkConsentStorage.MAX_ENTRIES));
            this.A01 = diz;
            diz.start();
        }
        AnonymousClass0fD.A09(-1688372431, A023);
        this.A02.postDelayed(this.A0O, 200);
        AnonymousClass0fD.A09(-1510732322, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.A08.A01(bundle);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(916723602);
        C47448E2u.super.onStart();
        this.A02.requestFocus();
        AnonymousClass0fD.A09(317712146, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1162232179);
        C47448E2u.super.onStop();
        DbS.A1D(this);
        Window A0G2 = DbV.A0G(this);
        A0G2.getClass();
        A0G2.setSoftInputMode(3);
        AnonymousClass0fD.A09(-1295161056, A022);
    }
}
