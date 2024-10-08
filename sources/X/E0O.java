package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class E0O extends C240373Kq {
    public static final String __redex_internal_original_name = "LoginBypassActionHandlerFragment";
    public Integer A00;
    public String A01;
    public C62320sa A02 = C51783G1s.A00;
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final Handler A05 = AnonymousClass7TF.A0D();
    public final Runnable A06 = new C51207FqO(this);
    public final String A07 = "login_bypass_action_loading_screen";

    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        1ZF A002 = C48916EmG.A00();
        Context context = getContext();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            window = activity.getWindow();
        } else {
            window = null;
        }
        A002.A00(context, window, true, true);
    }

    public final /* bridge */ /* synthetic */ 0lg A0M() {
        return DbT.A0X(this.A04);
    }

    public final String getModuleName() {
        return this.A07;
    }

    public static final void A01(E0O e0o) {
        Window window;
        1ZF A002 = C48916EmG.A00();
        FragmentActivity activity = e0o.getActivity();
        if (activity != null) {
            window = activity.getWindow();
        } else {
            window = null;
        }
        A002.A01(window);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2040895768);
        Context context = getContext();
        if (context != null) {
            View A08 = DbU.A08(LayoutInflater.from(context), R.layout.login_bypass_loading_indicator_view);
            AnonymousClass0fD.A09(1882272235, A022);
            return A08;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(1850923249, A022);
        throw A0y;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1937423472);
        E0O.super.onPause();
        A07();
        this.A05.removeCallbacks(this.A06);
        A01(this);
        AnonymousClass0fD.A09(-761505720, A022);
    }

    public final void onResume() {
        String str;
        int A022 = AnonymousClass0fD.A02(457670951);
        E0O.super.onResume();
        FragmentActivity activity = getActivity();
        Handler handler = this.A05;
        Runnable runnable = this.A06;
        AnonymousClass0eM r7 = this.A04;
        handler.postDelayed(runnable, 182.A01(0Tu.A05, DbT.A0X(r7), 36605911774991696L));
        if (activity != null) {
            Integer num = this.A00;
            if (num == null) {
                DbS.A16();
                throw AnonymousClass00P.createAndThrow();
            }
            0eP A1L = AnonymousClass7TE.A1L("fbid", (Object) null);
            switch (num.intValue()) {
                case 1:
                    str = "tag_mention";
                    break;
                case 2:
                    str = "bff_netego_banner";
                    break;
                case 3:
                    str = "xav_switcher_client";
                    break;
                default:
                    str = "profile_links";
                    break;
            }
            LinkedHashMap A072 = 0Yt.A07(AnonymousClass7TH.A0h("launch_url", this.A01, A1L, AnonymousClass7TE.A1L("caller", str), AnonymousClass7TE.A1L("obid", (Object) null)));
            C229382nI A0N = DbT.A0N(activity, this, DbT.A0X(r7));
            FBO fbo = new FBO("com.bloks.www.xav.ig_x_fb.bypass_login.endpoint_generator");
            fbo.A04 = C359608dC.A01(A072);
            fbo.A02 = new FVR(this, 2);
            fbo.A01(activity, A0N);
        } else {
            A07();
        }
        AnonymousClass0fD.A09(-798459661, A022);
    }
}
