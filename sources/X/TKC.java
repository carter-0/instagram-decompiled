package X;

import android.util.Pair;
import com.facebook.mqtt.service.XplatNativeClientWrapper;
import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import java.util.ArrayList;
import java.util.List;

public final class TKC implements Runnable {
    public final /* synthetic */ Pair A00;
    public final /* synthetic */ ST9 A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ boolean A04;

    public TKC(Pair pair, ST9 st9, Boolean bool, Integer num, boolean z) {
        this.A01 = st9;
        this.A00 = pair;
        this.A04 = z;
        this.A02 = bool;
        this.A03 = num;
    }

    public final void run() {
        List list;
        List<SubscribeTopic> list2;
        String str;
        try {
            Pair pair = this.A00;
            Boolean bool = null;
            if (pair != null) {
                list = (List) pair.first;
                list2 = (List) pair.second;
            } else {
                list = null;
                list2 = null;
            }
            ArrayList A1C = AnonymousClass7TE.A1C();
            if (list2 != null) {
                for (SubscribeTopic subscribeTopic : list2) {
                    A1C.add(subscribeTopic.A01);
                }
            }
            ST9 st9 = this.A01;
            C2601944q r6 = st9.A0U;
            if (this.A04) {
                str = null;
            } else {
                bool = this.A02;
                str = C2605045x.A00().A03(bool);
            }
            byte[] convertForegroundStateWithSubscriptionToThriftPayload = r6.convertForegroundStateWithSubscriptionToThriftPayload(str, bool, this.A03, list, A1C);
            if (convertForegroundStateWithSubscriptionToThriftPayload != null) {
                st9.A04(new C12263SqH(this, list, list2), AnonymousClass05K.A01, XplatNativeClientWrapper.UPDATE_FOREGROUND_TOPIC, convertForegroundStateWithSubscriptionToThriftPayload);
            }
        } catch (C241873Rq unused) {
        }
    }
}
