package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.model.XplatAssetType;
import com.facebook.cameracore.ardelivery.xplat.models.XplatRemoteAsset;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9lC  reason: invalid class name and case insensitive filesystem */
public final class C386809lC extends 0ng {
    public final /* synthetic */ C39738A7e A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ List A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386809lC(C39738A7e a7e, String str, List list) {
        super(27, 3, false, false);
        this.A00 = a7e;
        this.A01 = str;
        this.A02 = list;
    }

    public final void run() {
        AGn aGn;
        Throwable th;
        AnonymousClass6i7 A002;
        C39738A7e a7e = this.A00;
        String str = this.A01;
        List<ARRequestAsset> list = this.A02;
        C392449up r2 = AGn.A02;
        int i = 6;
        if (a7e.A00) {
            i = 25;
        }
        int i2 = i + 3;
        synchronized (r2) {
            aGn = AGn.A01;
            if (aGn == null) {
                aGn = new AGn(i2);
                AGn.A01 = aGn;
            }
            0qQ.A0A(aGn);
        }
        A37 a37 = a7e.A03;
        C314366i5 r5 = a7e.A02;
        UserSession userSession = a7e.A05;
        C352718Eo r1 = new C352718Eo();
        r1.A03 = str;
        String A0g = AnonymousClass7TF.A0g(userSession);
        if (A0g == null) {
            A0g = AnonymousClass7TF.A0c();
        }
        r1.A05 = A0g;
        C352728Ep A003 = r1.A00();
        synchronized (aGn) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                th = AnonymousClass7TE.A0z("This method should be called on a non-UI thread");
            } else if (!list.isEmpty()) {
                Context context = a37.A00;
                if (0mb.A00(context) > 104857600) {
                    LinkedHashMap A1H = AnonymousClass7TE.A1H();
                    int i3 = aGn.A00;
                    for (ARRequestAsset aRRequestAsset : list) {
                        AnonymousClass80A r12 = aRRequestAsset.A02;
                        ARAssetType aRAssetType = r12.A02;
                        if (aRAssetType == ARAssetType.SUPPORT) {
                            0KC.A0E("AREffectSmartPrefetcher", "use ModelManager.fetchLatestModels to fetch model assets");
                        } else if (aRAssetType == ARAssetType.EFFECT) {
                            String str2 = r12.A09;
                            if (!A1H.containsKey(str2)) {
                                A1H.put(str2, aRRequestAsset);
                                if (A1H.size() >= i3) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            th = AnonymousClass7TE.A0w(AnonymousClass7TG.A0m(aRAssetType, "Got unsupported asset type: ", AnonymousClass7TE.A1A()));
                        }
                    }
                    ArrayList A1D = AnonymousClass7TE.A1D(A1H.values());
                    long A05 = 0JN.A01().A05() - 104857600;
                    long j = 0;
                    if (A05 > 0) {
                        long maxSizeBytes = r5.A05.getMaxSizeBytes(AnonymousClass7TE.A1I(Integer.valueOf(XplatAssetType.AREffect.getValue())), 0JN.A01().A05());
                        if ((maxSizeBytes ^ Long.MIN_VALUE) >= -1) {
                            maxSizeBytes = Long.MAX_VALUE;
                        }
                        j = Math.min(A05, maxSizeBytes);
                    }
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    Iterator it = A1D.iterator();
                    while (it.hasNext()) {
                        ARRequestAsset aRRequestAsset2 = (ARRequestAsset) it.next();
                        long j2 = aRRequestAsset2.A01;
                        if (j2 == -1) {
                            0KC.A0Q("IgAREffectSmartPrefetcher", "Got unknown size for asset id=%s", new Object[]{aRRequestAsset2.A02.A0A});
                        } else {
                            boolean A1W = AnonymousClass7TF.A1W(aRRequestAsset2.A02.A02, ARAssetType.EFFECT);
                            17k.A0I(A1W, C273654mx.A00(459), new Object[0]);
                            if (!r5.A05.isEffectCached(new XplatRemoteAsset(aRRequestAsset2), true) && j2 <= j) {
                                j -= j2;
                                A1C.add(aRRequestAsset2);
                            }
                        }
                    }
                    Iterator it2 = A1C.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        List singletonList = Collections.singletonList(next);
                        AQQ aqq = new AQQ(countDownLatch);
                        0qQ.A0B(singletonList, 0);
                        A002 = C314366i5.A00((Handler) null, aqq, r5.A04, r5, A003, singletonList, true);
                        while (AnonymousClass7TF.A1R((0mb.A00(context) > 104857600 ? 1 : (0mb.A00(context) == 104857600 ? 0 : -1)))) {
                            if (countDownLatch.getCount() <= 0) {
                                break;
                            }
                            try {
                                countDownLatch.await(1, TimeUnit.SECONDS);
                            } catch (InterruptedException e) {
                                0KC.A0J("AREffectSmartPrefetcher", "Got unexpected InterruptedException", e);
                            }
                        }
                        if (countDownLatch.getCount() > 0) {
                            break;
                        }
                    }
                    A002.cancel();
                }
            }
            throw th;
        }
    }
}
