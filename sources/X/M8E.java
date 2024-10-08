package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.video.live.mvvm.view.IgLiveWithGuestFragment;

public final class M8E implements Runnable {
    public final /* synthetic */ C62683Kkj A00;
    public final /* synthetic */ C62422KfX A01;

    public M8E(C62683Kkj kkj, C62422KfX kfX) {
        this.A01 = kfX;
        this.A00 = kkj;
    }

    public final void run() {
        IgLiveWithGuestFragment igLiveWithGuestFragment = this.A01.A0L;
        C62683Kkj kkj = this.A00;
        String str = null;
        11Z.A06("This operation must be run on UI thread.");
        M0W m0w = igLiveWithGuestFragment.A05;
        if (m0w == null) {
            0qQ.A0F("liveWithGuestWaterfall");
            throw AnonymousClass00P.createAndThrow();
        }
        String str2 = kkj.A01;
        String name = kkj.A00.name();
        String message = kkj.getMessage();
        if (message == null) {
            message = "null_message";
        }
        m0w.A0B(str2, name, message, true);
        Bundle A0a = AnonymousClass7TE.A0a();
        Context context = igLiveWithGuestFragment.getContext();
        if (context != null) {
            str = context.getString(2131965197);
        }
        A0a.putString(C273654mx.A00(110), str);
        Intent A09 = DbS.A09();
        A09.putExtras(A0a);
        igLiveWithGuestFragment.A0B = true;
        FragmentActivity activity = igLiveWithGuestFragment.getActivity();
        if (activity != null) {
            activity.setResult(0, A09);
            activity.onBackPressed();
        }
    }
}
