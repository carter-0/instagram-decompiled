package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public abstract class E4Z extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "OnboardingIntroFragment";
    public C46788DlI A00;
    public final AnonymousClass0eM A01 = C51793G2c.A00(this, 36);
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public static final void A00(View view, String str) {
        ViewStub A0F = DbS.A0F(view, R.id.preview);
        A0F.setLayoutResource(R.layout.video_view);
        View findViewById = A0F.inflate().findViewById(R.id.preview);
        View findViewById2 = findViewById.findViewById(R.id.loading_spinner);
        VideoView videoView = (VideoView) findViewById.findViewById(R.id.video);
        videoView.setVideoPath(str);
        videoView.setZOrderOnTop(true);
        videoView.setOnErrorListener(FK3.A00);
        videoView.setOnPreparedListener(new LVJ(findViewById2, 5));
        videoView.start();
        view.getViewTreeObserver().addOnGlobalLayoutListener(new WCB(6, view, videoView));
    }

    public static final void A02(E4Z e4z) {
        C46788DlI A03 = e4z.A03();
        FragmentActivity requireActivity = e4z.requireActivity();
        UserSession A0l = AnonymousClass7TE.A0l(e4z.A02);
        0qQ.A07(e4z.getString(e4z.A03().A01()));
        A03.A06(e4z, requireActivity, A0l, e4z.getModuleName(), (String) null);
    }

    public void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, A03().A01());
    }

    public abstract String getModuleName();

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 8888) {
            if (intent == null || !intent.getBooleanExtra("EXTRA_IS_ONBOARDING_COMPLETE", false)) {
                A03().A05();
            } else {
                A04("finished", "payouts_onboarding", getModuleName(), (String) null);
                A02(this);
                FCM.A01(requireContext());
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C51645Fy4.A01(this, DbV.A0J(this), 15);
    }

    public static final void A01(View view, String str, String str2, int i) {
        if (view != null) {
            DbS.A0G(view, R.id.icon).setImageResource(i);
            TextView A0d = AnonymousClass7TE.A0d(view, R.id.title);
            A0d.setText(str);
            if (str2 != null) {
                A0d.setTextAppearance(R.style.igds_emphasized_label);
                TextView A0d2 = AnonymousClass7TE.A0d(view, R.id.sub_title);
                A0d2.setVisibility(0);
                A0d2.setText(str2);
            }
        }
    }

    public final C46788DlI A03() {
        C46788DlI dlI = this.A00;
        if (dlI != null) {
            return dlI;
        }
        0qQ.A0F("productOnboardingViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A04(String str, String str2, String str3, String str4) {
        ((C50332FYn) this.A01.getValue()).A02(FCG.A01(A03().A02()), FCG.A02(A03().A02()), str, str2, str3, A03().A04(), str4);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final boolean onBackPressed() {
        String moduleName;
        String str;
        String str2;
        boolean z;
        if (this instanceof C47921EMy) {
            DbT.A1I(this);
            return true;
        }
        if (this instanceof C47920EMx) {
            moduleName = C47920EMx.__redex_internal_original_name;
            str = "back_button_clicked";
            str2 = "feature_preview";
        } else {
            moduleName = getModuleName();
            str = "back_button_clicked";
            str2 = "what_you_need";
        }
        A04(str, str2, moduleName, (String) null);
        if (this instanceof C47919EMw) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            DbT.A1I(this);
            return true;
        }
        C49004Eng.A00(this, A03());
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(766345826);
        E4Z.super.onCreate(bundle);
        C46788DlI A002 = C47742EFc.A00(requireActivity(), this.A02);
        0qQ.A0B(A002, 0);
        this.A00 = A002;
        AnonymousClass0fD.A09(-45663658, A022);
    }
}
