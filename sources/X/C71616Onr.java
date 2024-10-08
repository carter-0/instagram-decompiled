package X;

import android.content.res.AssetManager;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.mobileconfig.MobileConfigCxxPerfLogger;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import com.facebook.mobileconfig.MobileConfigManagerParamsHolder;
import com.facebook.mobileconfig.MobileConfigUsingPureJavaDependencies;
import com.facebook.mobileconfig.common.FBMobileConfigGlobalContextHolder;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.Onr  reason: case insensitive filesystem */
public final class C71616Onr implements 19p {
    public final /* synthetic */ AssetManager A00;
    public final /* synthetic */ MobileConfigManagerParamsHolder A01;
    public final /* synthetic */ 0lg A02;
    public final /* synthetic */ 19k A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ HashMap A07;

    public C71616Onr(AssetManager assetManager, MobileConfigManagerParamsHolder mobileConfigManagerParamsHolder, 0lg r3, 19k r4, String str, String str2, String str3, HashMap hashMap) {
        this.A02 = r3;
        this.A03 = r4;
        this.A06 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A00 = assetManager;
        this.A01 = mobileConfigManagerParamsHolder;
        this.A07 = hashMap;
    }

    public final MobileConfigManagerHolderImpl AL2(File file, String str) {
        MobileConfigUsingPureJavaDependencies mobileConfigUsingPureJavaDependencies = MobileConfigUsingPureJavaDependencies.$redex_init_class;
        0lg r0 = this.A02;
        return new MobileConfigUsingPureJavaDependencies((AndroidAsyncExecutorFactory) null, new 1AI(r0, false), r0 instanceof UserSession, this.A03, (MobileConfigCxxPerfLogger) null).createManager(file, this.A06, this.A04, str, 2, this.A05, this.A00, false, this.A01, this.A07, (MobileConfigManagerHolderImpl) null, (AnonymousClass1AK) null, (ScheduledExecutorService) null, false, (FBMobileConfigGlobalContextHolder) null);
    }
}
