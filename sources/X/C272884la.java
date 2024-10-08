package X;

import android.content.Context;
import com.facebook.common.build.BuildConstants;
import com.facebook.vmasaver.VmaSaver;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: X.4la  reason: invalid class name and case insensitive filesystem */
public final class C272884la implements Callable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C272834lV A01;

    public C272884la(Context context, C272834lV r2) {
        this.A01 = r2;
        this.A00 = context;
    }

    /* JADX WARNING: type inference failed for: r0v49, types: [X.RRL, java.lang.Object] */
    public final Object call() {
        Object obj;
        short s;
        IllegalStateException illegalStateException;
        String A04;
        File filesDir;
        File parentFile;
        File canonicalFile;
        RRL rrl;
        String str;
        C272834lV r6 = this.A01;
        0wb r10 = 0wb.A01;
        r10.Ew0("helium:lazy_webview_activated", "WebViewProvider accessed lazily");
        02m r3 = 02m.A0p;
        0qQ.A07(r3);
        r3.markerStart(47655768);
        try {
            r3.markerPoint(47655768, "device_eligibility_start");
            Integer A012 = C272854lX.A01();
            boolean z = false;
            if (A012 == AnonymousClass05K.A00) {
                z = true;
            }
            boolean z2 = false;
            obj = null;
            if (!z) {
                switch (A012.intValue()) {
                    case 1:
                        str = "FAIL_WOULD_DOWNGRADE_USER_PROFILE";
                        break;
                    case 2:
                        str = "FAIL_PRELOADS_TRAMPOLINE_NOT_OPERATIONAL";
                        break;
                    case 3:
                        str = "FAIL_LIBRARY_ON_ASEC";
                        break;
                    default:
                        str = "PASS";
                        break;
                }
                0KC.A0P("HeliumWebViewFactoryProvider", "Device ineligible for Helium: %s", new Object[]{str});
                r3.markerPoint(47655768, "device_eligibility_fail", str);
                s = 4;
            } else {
                r3.markerPoint(47655768, "device_eligibility_end");
                if (!BuildConstants.A02()) {
                    r3.markerPoint(47655768, "reclaim_address_space_start");
                    VmaSaver.freeWebviewReservedMemory();
                    r3.markerPoint(47655768, "reclaim_address_space_end");
                }
                Context context = this.A00;
                SDS sds = new SDS(context);
                r3.markerAnnotate(47655768, "split_apk_exists", 0gH.A01(context, "heliumiab"));
                if (C272854lX.A00 != null) {
                    z2 = true;
                }
                r3.markerAnnotate(47655768, "voltron_preloaded", z2);
                if (C272854lX.A00 == null) {
                    r3.markerPoint(47655768, "voltron_load_start");
                    try {
                        Context context2 = r6.A00;
                        0gM A002 = 0gM.A00(context2, AnonymousClass0yE.A00(context2), C60290fq.A00(context2));
                        synchronized (C9913RjS.class) {
                            RRL rrl2 = C9913RjS.A00;
                            rrl = rrl2;
                            if (rrl2 == null) {
                                ? obj2 = new Object();
                                A002.A03("heliumiab");
                                C9913RjS.A00 = obj2;
                                rrl = obj2;
                            }
                        }
                        C272854lX.A00 = rrl;
                        r3.markerPoint(47655768, Pxd.A00(929));
                    } catch (FileNotFoundException e) {
                        r3.markerPoint(47655768, "voltron_load_fail");
                        0fA r4 = C272844lW.A00;
                        if (r4 != null) {
                            0f9 AEf = r4.AEf(AnonymousClass000.A00(3267), 19791876);
                            AEf.ERJ(e);
                            AEf.report();
                        }
                        r10.Ew6("helium:voltron_load_error", "Failed to load Helium Voltron module", 1, e);
                        return null;
                    }
                }
                boolean z3 = false;
                File A003 = SDS.A00(sds, "d.libhelium.so");
                if (!(!A003.exists() || (filesDir = sds.A00.getFilesDir()) == null || (parentFile = filesDir.getParentFile()) == null || (canonicalFile = parentFile.getCanonicalFile()) == null)) {
                    File canonicalFile2 = A003.getCanonicalFile();
                    0qQ.A07(canonicalFile2);
                    z3 = AnonymousClass5Kg.A09(canonicalFile2, canonicalFile);
                }
                if (z3) {
                    illegalStateException = new IllegalStateException("Goofy linking required, but unsupported");
                } else {
                    RRL rrl3 = C272854lX.A00;
                    C249363jc A013 = AnonymousClass11c.A00().A01();
                    0lg r42 = r6.A01;
                    0Tu r5 = 0Tu.A05;
                    boolean A06 = 182.A06(r5, r42, 36321404552291681L);
                    boolean A062 = 182.A06(r5, r42, 2342164413764871508L);
                    if (!182.A06(r5, r42, 36321404551701850L)) {
                        A04 = "";
                    } else {
                        A04 = 182.A04(r5, r42, 36884354505048633L);
                    }
                    0qQ.A0A(A04);
                    long A014 = 182.A01(r5, r42, 36602879528473413L);
                    String A042 = 182.A04(r5, r42, 36884354505441850L);
                    boolean z4 = false;
                    if (C273214mA.A00.A01(r6.A00, 182.A06(r5, r42, 2342164413765133655L), 182.A06(r5, r42, 36321404551898460L)) == AnonymousClass05K.A0N) {
                        z4 = true;
                    }
                    C10790RyC ryC = new C10790RyC(A04, A042, A014, A06, A062, z4, 182.A06(0Tu.A06, r42, 36330982327993192L));
                    0wc A02 = AnonymousClass0kN.A02(r42);
                    0qQ.A0C(A02, "null cannot be cast to non-null type com.facebook.analytics.structuredlogger.base.Logger<kotlin.Any>");
                    obj = rrl3.A01(context, A013, A02, sds, ryC, r3, 19E.A02(AnonymousClass12T.A00.AOJ(860110062, 3)));
                    if (obj != null) {
                        C272854lX.A03 = true;
                        s = 2;
                    } else {
                        r3.markerPoint(47655768, "voltron_load_fail");
                        illegalStateException = new IllegalStateException("Helium loading failed");
                    }
                }
                throw illegalStateException;
            }
        } catch (IOException e2) {
            0KC.A05(SDS.class, "There was an error determining whether the split APK was installed.", e2);
        } catch (Throwable th) {
            r10.Ew6("helium:provider_load_error", "Failed to load Helium WebViewFactoryProvider", 1, th);
            r3.markerEnd(47655768, 3);
            throw th;
        }
        r3.markerEnd(47655768, s);
        return obj;
    }
}
