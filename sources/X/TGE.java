package X;

import android.os.Handler;
import android.text.TextUtils;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class TGE implements Runnable {
    public SRO A00;
    public final /* synthetic */ C12231Spl A01;

    public TGE(SRO sro, C12231Spl spl) {
        this.A01 = spl;
        this.A00 = sro;
    }

    public final void run() {
        C12231Spl spl = this.A01;
        SRO sro = this.A00;
        TO6 to6 = C12231Spl.A0E;
        AtomicReference atomicReference = new AtomicReference("");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        atomicReference.set(((AnonymousClass45I) spl.A03).getString(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, ""));
        countDownLatch.countDown();
        try {
            countDownLatch.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            0KC.A0G("DefaultAnalyticsLogger", "Waiting for user id interrupted", e);
        }
        String str = (String) atomicReference.get();
        if (TextUtils.isEmpty(str)) {
            str = "0";
        }
        if (!(sro instanceof C7857Qbh) && !(sro instanceof C7858Qbi) && !(sro instanceof C7859Qbj)) {
            sro.A06.put("pk", str);
        }
        List list = spl.A00.A07;
        list.add(sro);
        Handler handler = spl.A01;
        handler.removeMessages(1);
        if (list.size() >= 50) {
            C12231Spl.A00(spl);
        } else {
            handler.sendEmptyMessageDelayed(1, 300000);
        }
    }
}
