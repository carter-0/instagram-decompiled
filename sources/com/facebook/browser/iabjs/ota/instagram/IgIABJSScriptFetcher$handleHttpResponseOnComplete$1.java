package com.facebook.browser.iabjs.ota.instagram;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import X.SKG;
import android.content.Context;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.io.ByteArrayOutputStream;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.browser.iabjs.ota.instagram.IgIABJSScriptFetcher$handleHttpResponseOnComplete$1", f = "IgIABJSScriptFetcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class IgIABJSScriptFetcher$handleHttpResponseOnComplete$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ SKG A02;
    public final /* synthetic */ QuickPerformanceLogger A03;
    public final /* synthetic */ ByteArrayOutputStream A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgIABJSScriptFetcher$handleHttpResponseOnComplete$1(Context context, SKG skg, QuickPerformanceLogger quickPerformanceLogger, ByteArrayOutputStream byteArrayOutputStream, String str, String str2, String str3, String str4, AnonymousClass4D7 r10, int i) {
        super(2, r10);
        this.A02 = skg;
        this.A01 = context;
        this.A05 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A08 = str4;
        this.A03 = quickPerformanceLogger;
        this.A00 = i;
        this.A04 = byteArrayOutputStream;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.browser.iabjs.ota.instagram.IgIABJSScriptFetcher$handleHttpResponseOnComplete$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r13) {
        SKG skg = this.A02;
        Context context = this.A01;
        String str = this.A05;
        String str2 = this.A07;
        String str3 = this.A06;
        String str4 = this.A08;
        return new IgIABJSScriptFetcher$handleHttpResponseOnComplete$1(context, skg, this.A03, this.A04, str, str2, str3, str4, r13, this.A00);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((IgIABJSScriptFetcher$handleHttpResponseOnComplete$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.1zE.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0094, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0097, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        X.1zE.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009b, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e A[Catch:{ FileNotFoundException -> 0x009e, IOException -> 0x009c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.0eS.A00(r14)
            android.content.Context r6 = r13.A01
            java.lang.String r1 = r13.A05
            java.lang.String r9 = r13.A07
            java.lang.String r10 = r13.A06
            java.lang.String r11 = r13.A08
            com.facebook.quicklog.QuickPerformanceLogger r5 = r13.A03
            int r4 = r13.A00
            java.io.ByteArrayOutputStream r3 = r13.A04
            r2 = 646461712(0x26883910, float:9.452363E-16)
            r5.markerStart(r2, r4)     // Catch:{ FileNotFoundException -> 0x009e, IOException -> 0x009c }
            java.lang.String r0 = "script_name"
            r5.markerAnnotate(r2, r4, r0, r10)     // Catch:{ FileNotFoundException -> 0x009e, IOException -> 0x009c }
            java.lang.String r0 = "file_name"
            r5.markerAnnotate(r2, r4, r0, r1)     // Catch:{ FileNotFoundException -> 0x009e, IOException -> 0x009c }
            byte[] r0 = r3.toByteArray()     // Catch:{ FileNotFoundException -> 0x009e, IOException -> 0x009c }
            java.io.ByteArrayInputStream r8 = new java.io.ByteArrayInputStream     // Catch:{ FileNotFoundException -> 0x009e, IOException -> 0x009c }
            r8.<init>(r0)     // Catch:{ FileNotFoundException -> 0x009e, IOException -> 0x009c }
            r0 = 0
            java.io.FileOutputStream r0 = r6.openFileOutput(r1, r0)     // Catch:{ all -> 0x0095 }
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0095 }
            r7.<init>(r0)     // Catch:{ all -> 0x0095 }
            r6 = 2
            X.C11108SAj.A00(r8, r7)     // Catch:{ all -> 0x008e }
            r7.close()     // Catch:{ all -> 0x0095 }
            r8.close()     // Catch:{ FileNotFoundException -> 0x009e, IOException -> 0x009c }
            X.SCp r0 = X.C11159SCp.A00     // Catch:{ FileNotFoundException -> 0x009e, IOException -> 0x009c }
            X.AnonymousClass7TF.A1H(r10, r11)     // Catch:{ FileNotFoundException -> 0x009e, IOException -> 0x009c }
            X.0xa r0 = X.C11159SCp.A02     // Catch:{ FileNotFoundException -> 0x009e, IOException -> 0x009c }
            X.DbX.A1U(r0, r10, r11)     // Catch:{ FileNotFoundException -> 0x009e, IOException -> 0x009c }
            com.instagram.common.session.UserSession r8 = X.C11159SCp.A01     // Catch:{ FileNotFoundException -> 0x009e, IOException -> 0x009c }
            X.0Tu r7 = X.0Tu.A06     // Catch:{ FileNotFoundException -> 0x009e, IOException -> 0x009c }
            r0 = 36322860551907966(0x810b73006c2a7e, double:3.0340615012218066E-306)
            boolean r0 = X.182.A06(r7, r8, r0)     // Catch:{ FileNotFoundException -> 0x009e, IOException -> 0x009c }
            if (r0 == 0) goto L_0x0075
            X.TTt r1 = X.C13294TTt.A00     // Catch:{ FileNotFoundException -> 0x009e, IOException -> 0x009c }
            java.lang.String r0 = "autofill_contact_nonce_experiment"
        L_0x005e:
            X.0eP r0 = X.AnonymousClass7TE.A1L(r0, r1)     // Catch:{ FileNotFoundException -> 0x009e, IOException -> 0x009c }
        L_0x0062:
            java.util.Map r0 = X.0se.A0M(r0)     // Catch:{ FileNotFoundException -> 0x009e, IOException -> 0x009c }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ FileNotFoundException -> 0x009e, IOException -> 0x009c }
            X.0sa r0 = (X.C62320sa) r0     // Catch:{ FileNotFoundException -> 0x009e, IOException -> 0x009c }
            if (r0 == 0) goto L_0x0071
            r0.invoke()     // Catch:{ FileNotFoundException -> 0x009e, IOException -> 0x009c }
        L_0x0071:
            r5.markerEnd(r2, r4, r6)     // Catch:{ FileNotFoundException -> 0x009e, IOException -> 0x009c }
            goto L_0x00b8
        L_0x0075:
            r0 = 36322860551711355(0x810b7300692a7b, double:3.034061501097469E-306)
            boolean r0 = X.182.A06(r7, r8, r0)     // Catch:{ FileNotFoundException -> 0x009e, IOException -> 0x009c }
            if (r0 == 0) goto L_0x0085
            X.TTu r1 = X.C13295TTu.A00     // Catch:{ FileNotFoundException -> 0x009e, IOException -> 0x009c }
            java.lang.String r0 = "autofill_contact_js_v2"
            goto L_0x005e
        L_0x0085:
            java.lang.String r1 = "autofill_contact_enhanced"
            X.TTv r0 = X.C13296TTv.A00     // Catch:{ FileNotFoundException -> 0x009e, IOException -> 0x009c }
            X.0eP r0 = X.AnonymousClass7TE.A1L(r1, r0)     // Catch:{ FileNotFoundException -> 0x009e, IOException -> 0x009c }
            goto L_0x0062
        L_0x008e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r0 = move-exception
            X.1zE.A00(r7, r1)     // Catch:{ all -> 0x0095 }
            throw r0     // Catch:{ all -> 0x0095 }
        L_0x0095:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r0 = move-exception
            X.1zE.A00(r8, r1)     // Catch:{ FileNotFoundException -> 0x009e, IOException -> 0x009c }
            throw r0     // Catch:{ FileNotFoundException -> 0x009e, IOException -> 0x009c }
        L_0x009c:
            r7 = move-exception
            goto L_0x00a9
        L_0x009e:
            r7 = move-exception
            java.lang.String r8 = "file_not_found error"
            java.lang.String r0 = r7.getMessage()     // Catch:{ all -> 0x00be }
            X.SKG.A00(r5, r8, r0, r4, r2)     // Catch:{ all -> 0x00be }
            goto L_0x00b2
        L_0x00a9:
            java.lang.String r8 = "io_error"
            java.lang.String r0 = r7.getMessage()     // Catch:{ all -> 0x00be }
            X.SKG.A00(r5, r8, r0, r4, r2)     // Catch:{ all -> 0x00be }
        L_0x00b2:
            r12 = 646448498(0x26880572, float:9.438372E-16)
            X.SKG.A01(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00be }
        L_0x00b8:
            r3.close()
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x00be:
            r0 = move-exception
            r3.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.iabjs.ota.instagram.IgIABJSScriptFetcher$handleHttpResponseOnComplete$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
