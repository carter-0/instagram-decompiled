package X;

import android.content.Context;
import android.os.Looper;
import com.facebook.falco.fabric.FFSingletonJNILogger;
import com.facebook.falco.fabric.FFSingletonJNILogger$CollectionControlDecision;
import com.facebook.falco.fabric.FFSingletonJNILogger$CollectionControlDecisionStatus;
import com.facebook.falco.sampling.FFSamplingBridgeJava;
import com.facebook.flexiblesampling.SamplingResult;
import java.io.IOException;

/* renamed from: X.4g4  reason: invalid class name and case insensitive filesystem */
public final class C270024g4 implements 1sp {
    public long A00;
    public C14698U1y A01;
    public 1tG A02;
    public final Context A03;
    public final XbC A04;
    public final C21389XZw A05;
    public final C21447Xaz A06;
    public final AnonymousClass4uV A07;
    public final 0ZW A08;

    public C270024g4(Context context, Looper looper, XbC xbC, C21389XZw xZw, C21447Xaz xaz, AnonymousClass4uV r8, 0ZW r9, VRC vrc, C17193VLx vLx) {
        0qQ.A0B(r9, 4);
        this.A04 = xbC;
        this.A03 = context;
        this.A07 = r8;
        this.A08 = r9;
        this.A05 = xZw;
        this.A06 = xaz;
        this.A01 = new C14698U1y(looper, vrc, vLx);
        try {
            0dV.A06(context, 0);
            FFSingletonJNILogger.setAppId("567067343352427");
            FFSingletonJNILogger.setClientToken(AnonymousClass000.A00(600));
            FFSingletonJNILogger.setUserAgent(xZw.A00);
            FFSingletonJNILogger.setSamplingEnabled(true);
            FFSingletonJNILogger.setCCEnabled(xaz.A04);
            FFSingletonJNILogger.setFailOpenSampling(true);
            FFSingletonJNILogger.setBaseFilePath(xaz.A03);
            FFSingletonJNILogger.setOneFabricHCEnabled(xaz.A05);
            FFSingletonJNILogger.setMaxPayloadSize(xaz.A01);
            FFSingletonJNILogger.setMaxNumberOfEvents(xaz.A00);
            FFSingletonJNILogger.setStaggerUploadDelay(xaz.A02);
            if (xaz.A06) {
                FFSingletonJNILogger.enableLifoUpload();
            }
            FFSamplingBridgeJava.init(r8, r9, xZw.A01);
        } catch (IOException unused) {
            throw new RuntimeException("SoLoader.init() failed");
        }
    }

    public final void CsH(1tF r1) {
    }

    public final void E4Z(1tH r3) {
        0qQ.A0B(r3, 0);
        C14698U1y u1y = this.A01;
        u1y.sendMessage(u1y.obtainMessage(u1y.A01, r3));
    }

    public final void E4a(1tH r3) {
        0qQ.A0B(r3, 0);
        C14698U1y u1y = this.A01;
        u1y.sendMessage(u1y.obtainMessage(u1y.A01, r3));
    }

    public final SamplingResult EsY(String str) {
        int i;
        boolean z = false;
        0qQ.A0B(str, 0);
        boolean z2 = false;
        FFSingletonJNILogger$CollectionControlDecision collectionControlCheck = FFSingletonJNILogger.collectionControlCheck(this.A00, str, 1, System.currentTimeMillis(), false, false, "", "");
        FFSingletonJNILogger$CollectionControlDecisionStatus fFSingletonJNILogger$CollectionControlDecisionStatus = collectionControlCheck.status;
        FFSingletonJNILogger$CollectionControlDecisionStatus fFSingletonJNILogger$CollectionControlDecisionStatus2 = FFSingletonJNILogger$CollectionControlDecisionStatus.SUCCESS;
        boolean z3 = true;
        if (fFSingletonJNILogger$CollectionControlDecisionStatus == fFSingletonJNILogger$CollectionControlDecisionStatus2) {
            i = (int) collectionControlCheck.sampleRate;
            1tG r0 = this.A02;
            if (r0 == null) {
                0qQ.A0F("batchSession");
                throw AnonymousClass00P.createAndThrow();
            } else if (r0.A01 != null) {
                z = true;
                z2 = true;
            }
        } else {
            if (fFSingletonJNILogger$CollectionControlDecisionStatus == FFSingletonJNILogger$CollectionControlDecisionStatus.EVENT_CONFIG_NOT_SET) {
                z = true;
            }
            i = 1;
        }
        long j = collectionControlCheck.collectionControlChecksum;
        if (fFSingletonJNILogger$CollectionControlDecisionStatus == fFSingletonJNILogger$CollectionControlDecisionStatus2) {
            z3 = false;
        }
        return new SamplingResult(j, i, z, z2, z3);
    }

    public final void ExG(1tG r32) {
        long createIdentitiesWithFacebookUser;
        1tG r0 = r32;
        0qQ.A0B(r0, 0);
        this.A02 = r0;
        1tF r1 = r0.A01;
        if (r1 != null) {
            r1.A00(this.A04);
        }
        XbC xbC = this.A04;
        boolean z = xbC.A02;
        long j = 0;
        String str = xbC.A05;
        String str2 = xbC.A06;
        String str3 = xbC.A07;
        long j2 = xbC.A03;
        String str4 = xbC.A04;
        1tG r02 = this.A02;
        if (!z) {
            if (r02 != null) {
                String str5 = r02.A02;
                String[] strArr = (String[]) xbC.A01.toArray(new String[0]);
                Long l = xbC.A00;
                if (l != null) {
                    j = l.longValue();
                }
                createIdentitiesWithFacebookUser = FFSingletonJNILogger.createIdentitiesWithAppScopedUser(str, str2, str3, j2, str4, "", str5, 0, 0, strArr, j, "");
            }
            0qQ.A0F("batchSession");
            throw AnonymousClass00P.createAndThrow();
        }
        if (r02 != null) {
            createIdentitiesWithFacebookUser = FFSingletonJNILogger.createIdentitiesWithFacebookUser(str, str2, str3, j2, str4, "", r02.A02, 0, 0, (String[]) xbC.A01.toArray(new String[0]), 0, 0);
        }
        0qQ.A0F("batchSession");
        throw AnonymousClass00P.createAndThrow();
        this.A00 = createIdentitiesWithFacebookUser;
        FFSingletonJNILogger.setShouldRequestDebugConfig(true);
        C14698U1y u1y = this.A01;
        u1y.sendMessage(u1y.obtainMessage(u1y.A02, Long.valueOf(this.A00)));
    }

    public final void FHz() {
    }
}
