package X;

import android.app.ActivityManager;
import com.instagram.autoplay.models.AutoplayConfigRoot;
import com.instagram.autoplay.models.AutoplayConfiguration;
import com.instagram.autoplay.models.AutoplayCustomization;
import com.instagram.autoplay.models.AutoplayGlobalConfig;
import com.instagram.autoplay.models.AutoplayLayout;
import com.instagram.autoplay.models.AutoplayWhichVideos;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.TvL  reason: case insensitive filesystem */
public final class C14392TvL extends 1P0 {
    public final C14352Tuh A00;
    public final C14079TpT A01;
    public final UserSession A02;
    public final AnonymousClass0eM A03;

    public C14392TvL(C14352Tuh tuh, C14079TpT tpT, UserSession userSession) {
        int i;
        float f;
        this.A02 = userSession;
        this.A01 = tpT;
        this.A00 = tuh;
        try {
            i = Runtime.getRuntime().availableProcessors();
        } catch (Exception e) {
            0KC.A0F("Autoplay", "failed to get numberOfCores", e);
            i = -1;
        }
        Integer valueOf = Integer.valueOf(i);
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            Object systemService = AnonymousClass0B3.A00().getSystemService("activity");
            0qQ.A0C(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
            f = (float) (((double) memoryInfo.totalMem) / Math.pow(10.0d, 9.0d));
        } catch (Exception e2) {
            0KC.A0F("Autoplay", "failed to get ramCount", e2);
            f = -1.0f;
        }
        Float valueOf2 = Float.valueOf(f);
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A02();
        A0b.A0A("api/v1/clips/autoplay_configs/");
        A0b.A0Q(B7P.class, B7M.class);
        if (valueOf2 != null) {
            A0b.A0B("ram_size_in_gb", f);
        }
        if (valueOf != null) {
            A0b.A0C("core_count", i);
        }
        1OC A0M = A0b.A0M();
        0qQ.A0C(A0M, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetClipsAutoplayConfigsResponseIntf>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetClipsAutoplayConfigsResponseIntf>>");
        A0M.A00 = this;
        1ES.A05(A0M, 126117213, 4, true, false);
        this.A03 = AnonymousClass0eN.A01(new C51801G2k(this, 20));
    }

    private final AutoplayConfiguration A00(AutoplayLayout autoplayLayout, List list) {
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C14413Tvi tvi = (C14413Tvi) it.next();
            A0r.add(new AutoplayCustomization(tvi.A03, tvi.A01, tvi.A00, tvi.A02, AutoplayWhichVideos.Companion.valueOf(tvi.A04)));
        }
        return new AutoplayConfiguration(autoplayLayout, 00k.A0a(A0r), 0, 0);
    }

    public final void onFail(C268654dm r6) {
        int A0D = AnonymousClass7TG.A0D(r6, 1342790375);
        StringBuilder sb = new StringBuilder();
        sb.append("onFail: ");
        Throwable A012 = r6.A01();
        0KC.A0C("Autoplay", AnonymousClass7TF.A0i(A012, sb));
        0f9 AEf = ((0fA) this.A03.getValue()).AEf("configOnFail", 126117213);
        AEf.ERJ(A012);
        AEf.report();
        C14392TvL.super.onFail(r6);
        AnonymousClass0fD.A0A(471741230, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(1396610061);
        AnonymousClass371 r15 = (AnonymousClass371) obj;
        int A0D = AnonymousClass7TG.A0D(r15, -1642545119);
        C14414Tvj tvj = (C14414Tvj) ((X9u) r15.FH3());
        C14412Tvh tvh = tvj.A00;
        int i = tvh.A06;
        int i2 = tvh.A05;
        int i3 = tvh.A03;
        boolean z = tvh.A07;
        int i4 = tvh.A02;
        int i5 = tvh.A04;
        AutoplayConfigRoot autoplayConfigRoot = new AutoplayConfigRoot(new AutoplayGlobalConfig(i, i2, i3, z, tvh.A01, tvh.A00, i4, i5), 0sr.A1P(new AutoplayConfiguration[]{A00(AutoplayLayout.EXPLORE_DIAGONAL, tvj.A01), A00(AutoplayLayout.EXPLORE_LOW_DIAGONAL, tvj.A02)}));
        C14079TpT tpT = this.A01;
        0xa r1 = (0xa) tpT.A06.getValue();
        if (r1 != null) {
            ReentrantReadWriteLock reentrantReadWriteLock = tpT.A05;
            reentrantReadWriteLock.writeLock().lock();
            try {
                String A0B = tpT.A02.A0B(autoplayConfigRoot);
                0xY AR4 = r1.AR4();
                AR4.E5g("last_config_from_server", A0B);
                AR4.apply();
                tpT.A00 = autoplayConfigRoot;
            } catch (Exception e) {
                0KC.A0F("Autoplay", "SharedPreferences exception", e);
            } catch (Throwable th) {
                reentrantReadWriteLock.writeLock().unlock();
                throw th;
            }
            reentrantReadWriteLock.writeLock().unlock();
        }
        this.A00.A00();
        C14392TvL.super.onSuccess(r15);
        AnonymousClass0fD.A0A(-587995184, A0D);
        AnonymousClass0fD.A0A(-1561799813, A032);
    }
}
