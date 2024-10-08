package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.cvat.ctvoiceeffect.CTVoiceEffectProcessor;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.lang.Thread;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public abstract class SAL {
    /* JADX WARNING: type inference failed for: r0v14, types: [X.Tgw, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v15, types: [X.Tgv, X.Srl, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v17, types: [com.facebook.videolite.transcoder.base.composition.MediaEffect, java.lang.Object, X.Sre] */
    public static final STM A00(Context context, 0fA r15, C7255Q1d q1d, MediaEffect mediaEffect, UserSession userSession, C357968a9 r19, File file, File file2, Float f, float f2, long j, long j2) {
        C13852TiV srC;
        0fA r13 = r15;
        File file3 = file2;
        C51969G9p.A1N(file3, 8, r15);
        C266824aP r11 = new C266824aP();
        C266764aJ r10 = new C266764aJ(C266714aE.AUDIO);
        C266744aH r9 = new C266744aH(file);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C266724aF A0V = Pxe.A0V(timeUnit, j, j + j2);
        C266724aF A0V2 = Pxe.A0V(timeUnit, 0, j2);
        Pxg.A1K(A0V, r10, r9);
        MediaEffect mediaEffect2 = mediaEffect;
        if (mediaEffect != null) {
            SIO.A00(A0V2, mediaEffect2, r10);
        }
        r10.A00(f2);
        if (f != null) {
            float floatValue = f.floatValue();
            ? obj = new Object();
            obj.A00 = floatValue;
            SIO.A00(A0V2, obj, r10);
        }
        Pxf.A1F(r11, r10);
        MediaComposition mediaComposition = new MediaComposition(r11);
        C7954Qdv qdv = new C7954Qdv(r19, 2);
        C10862RzN A00 = SF8.A00(mediaComposition, file3);
        if (mediaEffect2 instanceof C12334Srg) {
            srC = new CTVoiceEffectProcessor();
        } else {
            srC = new C12309SrC();
            0qQ.A0A(srC);
        }
        SFQ sfq = A00.A0C;
        int i = sfq.A04;
        int i2 = sfq.A01;
        Integer num = C9956RkB.A00;
        SEV sev = new SEV(i, i2);
        srC.configure(new C10568RuN(sev, sev, 1));
        Integer num2 = AnonymousClass05K.A01;
        C7255Q1d q1d2 = q1d;
        ThreadPoolExecutor A03 = q1d2.A03(num2, (Thread.UncaughtExceptionHandler) null);
        Context context2 = context;
        C12322SrS srS = new C12322SrS(context);
        File cacheDir = context.getCacheDir();
        0qQ.A07(cacheDir);
        C10683RwN rwN = new C10683RwN(userSession, cacheDir, true, false);
        try {
            SJL sjl = new SJL();
            C13804ThT thT = rwN.A03;
            SEV sev2 = sev;
            C12322SrS srS2 = srS;
            C7954Qdv qdv2 = qdv;
            C13804ThT thT2 = thT;
            C10686RwQ rwQ = new C10686RwQ(1, (String) null, (Map) null, false);
            Context context3 = context2;
            C12314SrH srH = new C12314SrH(context3, sev2, srS2, sjl, qdv2, thT2, rwQ, A00, file3.getPath(), A03);
            C12374SsN ssN = new C12374SsN(new C7257Q1f(), new Object());
            C13590TdI tdI = rwN.A01;
            C7235Q0h q0h = Q12.A00;
            ? obj2 = new Object();
            obj2.A00 = q0h;
            C13724Tfu tfu = C9935Rjo.A00;
            S30 A002 = S30.A00(context2, srS, tdI, obj2, ssN);
            A002.A01 = tfu;
            return new STM(q1d2, (SNJ) null, new C10794RyG(srC, srH, (SOP) null, (C11352SOl) null, A00), srS, (S0X) null, A00, A002, num2);
        } catch (Exception unused) {
            r13.AEf("Failed to create AudioEncoderOutputBufferConsumer for applying audio filter", 245701013);
            return null;
        }
    }

    public static final void A01(0fA r3, STM stm) {
        0qQ.A0B(r3, 1);
        Handler handler = stm.A0D;
        Pxf.A15(handler, 3);
        Pxf.A15(handler, 1);
        try {
            stm.A0F.A02.FNG();
            stm.A05();
        } catch (Exception unused) {
            r3.AEf("Audio filter failed to transcode", 245701013);
        }
    }
}
