package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.ArrayList;

public final /* synthetic */ class M8I implements Runnable {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ ReelViewerFragment A01;

    public /* synthetic */ M8I(Intent intent, ReelViewerFragment reelViewerFragment) {
        this.A01 = reelViewerFragment;
        this.A00 = intent;
    }

    public final void run() {
        ReelViewerFragment reelViewerFragment = this.A01;
        Intent intent = this.A00;
        FragmentActivity requireActivity = reelViewerFragment.requireActivity();
        UserSession session = reelViewerFragment.getSession();
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(AnonymousClass000.A00(123));
        0qQ.A0B(session, 1);
        2MD A012 = 2MD.A01();
        OIS A002 = OU0.A00(session.A06);
        A002.A0G = "story_posted_notification_type";
        A002.A0H = LSf.A01(requireActivity, parcelableArrayListExtra);
        A002.A04 = AnonymousClass7TF.A0Q(session).Bh3();
        A002.A03 = PushChannelType.LOCAL;
        JTT.A1O(A002, A012);
        reelViewerFragment.A1q = null;
    }
}
