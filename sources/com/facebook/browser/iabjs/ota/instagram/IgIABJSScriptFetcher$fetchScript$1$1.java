package com.facebook.browser.iabjs.ota.instagram;

import X.0eS;
import X.0qQ;
import X.0sL;
import X.1Hj;
import X.1IW;
import X.1QS;
import X.1QU;
import X.AnonymousClass1CO;
import X.AnonymousClass1Ek;
import X.AnonymousClass1T9;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import X.JTO;
import X.JTS;
import X.SKG;
import X.T6L;
import X.TY5;
import android.content.Context;
import com.facebook.quicklog.QuickPerformanceLogger;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.browser.iabjs.ota.instagram.IgIABJSScriptFetcher$fetchScript$1$1", f = "IgIABJSScriptFetcher.kt", i = {}, l = {331}, m = "invokeSuspend", n = {}, s = {})
public final class IgIABJSScriptFetcher$fetchScript$1$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public final /* synthetic */ int A0A;
    public final /* synthetic */ Context A0B;
    public final /* synthetic */ SKG A0C;
    public final /* synthetic */ QuickPerformanceLogger A0D;
    public final /* synthetic */ 1QS A0E;
    public final /* synthetic */ 1QU A0F;
    public final /* synthetic */ String A0G;
    public final /* synthetic */ String A0H;
    public final /* synthetic */ String A0I;
    public final /* synthetic */ String A0J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgIABJSScriptFetcher$fetchScript$1$1(Context context, SKG skg, QuickPerformanceLogger quickPerformanceLogger, 1QS r5, 1QU r6, String str, String str2, String str3, String str4, AnonymousClass4D7 r11, int i) {
        super(2, r11);
        this.A0D = quickPerformanceLogger;
        this.A0A = i;
        this.A0H = str;
        this.A0I = str2;
        this.A0J = str3;
        this.A0C = skg;
        this.A0B = context;
        this.A0G = str4;
        this.A0E = r5;
        this.A0F = r6;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.browser.iabjs.ota.instagram.IgIABJSScriptFetcher$fetchScript$1$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r14) {
        QuickPerformanceLogger quickPerformanceLogger = this.A0D;
        int i = this.A0A;
        String str = this.A0H;
        String str2 = this.A0I;
        String str3 = this.A0J;
        SKG skg = this.A0C;
        return new IgIABJSScriptFetcher$fetchScript$1$1(this.A0B, skg, quickPerformanceLogger, this.A0E, this.A0F, str, str2, str3, this.A0G, r14, i);
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [com.facebook.browser.iabjs.ota.instagram.IgIABJSScriptFetcher$fetchScript$1$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r2 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            QuickPerformanceLogger quickPerformanceLogger = this.A0D;
            int i = this.A0A;
            String str = this.A0H;
            String str2 = this.A0I;
            String str3 = this.A0J;
            SKG skg = this.A0C;
            Context context = this.A0B;
            String str4 = this.A0G;
            1QS r3 = this.A0E;
            1QU r1 = this.A0F;
            this.A01 = quickPerformanceLogger;
            this.A02 = str;
            this.A03 = str2;
            this.A04 = str3;
            this.A05 = skg;
            this.A06 = context;
            this.A07 = str4;
            this.A08 = r3;
            this.A09 = r1;
            this.A00 = 1;
            1IW A0s = JTS.A0s(this);
            quickPerformanceLogger.markerStart(646459455, i);
            quickPerformanceLogger.markerAnnotate(646459455, i, "script_name", str);
            quickPerformanceLogger.markerAnnotate(646459455, i, "script_url", str2);
            quickPerformanceLogger.markerAnnotate(646459455, i, "script_version", str3);
            try {
                AnonymousClass1T9 A022 = AnonymousClass1CO.A00().A02(new T6L(context, skg, quickPerformanceLogger, str4, str2, str, str3, A0s, i), r3, r1);
                0qQ.A07(A022);
                A0s.CO0(new TY5(A022, 3));
            } catch (Exception e) {
                A0s.resumeWith(JTO.A1B(e));
            }
            obj = A0s.A0E();
            if (obj == r2) {
                return r2;
            }
        }
        return obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((IgIABJSScriptFetcher$fetchScript$1$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
