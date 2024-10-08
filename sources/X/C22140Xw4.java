package X;

import android.content.Context;
import com.facebook.flexiblesampling.SamplingPolicyConfig;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Xw4  reason: case insensitive filesystem */
public final class C22140Xw4 implements 1v4 {
    public static final long A0B = TimeUnit.SECONDS.toMillis(60);
    public ByteArrayOutputStream A00;
    public boolean A01;
    public C21130XFx A02;
    public final C251593nM A03;
    public final 1tn A04;
    public final C66841qe A05;
    public final 1rB A06;
    public final SamplingPolicyConfig A07;
    public final Context A08;
    public final 1qQ A09;
    public final 1sY A0A;

    private C21130XFx A00() {
        C21130XFx xFx = this.A02;
        if (xFx != null) {
            return xFx;
        }
        C21130XFx xFx2 = new C21130XFx(this.A09.ALR("Analytics-NormalPri-InMemory-Scheduler", 10).getLooper(), this);
        this.A02 = xFx2;
        return xFx2;
    }

    public final void Crk() {
        if (this.A00 != null) {
            C21130XFx A002 = A00();
            ByteArrayOutputStream byteArrayOutputStream = this.A00;
            A002.removeMessages(1, byteArrayOutputStream);
            AnonymousClass7TE.A1S(A002, byteArrayOutputStream, 1);
            return;
        }
        throw AnonymousClass7TE.A0z("mByteArrayOutputStream is null");
    }

    public final void Cro() {
        if (this.A00 == null) {
            throw AnonymousClass7TE.A0z("mByteArrayOutputStream is null");
        } else if (!this.A01) {
            this.A01 = true;
            C21130XFx A002 = A00();
            ByteArrayOutputStream byteArrayOutputStream = this.A00;
            A002.sendMessageDelayed(A002.obtainMessage(1, byteArrayOutputStream), A0B);
        }
    }

    public final void CsG(String str) {
        if (this.A00 != null) {
            C21130XFx A002 = A00();
            ByteArrayOutputStream byteArrayOutputStream = this.A00;
            A002.removeMessages(1, byteArrayOutputStream);
            AnonymousClass7TE.A1S(A002, byteArrayOutputStream, 1);
        }
    }

    public final /* bridge */ /* synthetic */ void Ean(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) obj;
        if (this.A00 != byteArrayOutputStream) {
            this.A00 = byteArrayOutputStream;
            this.A01 = false;
        }
    }

    public final void FHz() {
        if (this.A00 != null) {
            C21130XFx A002 = A00();
            ByteArrayOutputStream byteArrayOutputStream = this.A00;
            A002.removeMessages(1, byteArrayOutputStream);
            AnonymousClass7TE.A1S(A002, byteArrayOutputStream, 1);
        }
    }

    public C22140Xw4(Context context, 1tn r6, AnonymousClass0K0 r7, 1sY r8) {
        this.A08 = context;
        this.A04 = r6;
        this.A0A = r8;
        try {
            1ss A002 = 1ss.A00(context);
            this.A05 = (C66841qe) 1ss.A01(A002, r6.A02.getName(), A002.A05);
            Class cls = r6.A01;
            1rB r0 = null;
            1ss A003 = 1ss.A00(context);
            SamplingPolicyConfig samplingPolicyConfig = (SamplingPolicyConfig) 1ss.A02(A003, cls.getName(), A003.A03);
            this.A07 = samplingPolicyConfig;
            Class cls2 = r6.A00;
            if (cls2 != null) {
                1ss A004 = 1ss.A00(context);
                r0 = (1rB) 1ss.A02(A004, cls2.getName(), A004.A02);
            }
            this.A06 = r0;
            this.A09 = 1ss.A00(context).A04(r6.A03.getName());
            this.A03 = new C251593nM(context, r7, samplingPolicyConfig, r6.A05);
        } catch (IllegalAccessException e) {
            throw C21056XCh.A08(this.A04, e);
        } catch (InstantiationException e2) {
            throw C21056XCh.A08(this.A04, e2);
        } catch (NoSuchMethodException e3) {
            throw C21056XCh.A08(this.A04, e3);
        } catch (InvocationTargetException e4) {
            throw C21056XCh.A08(this.A04, e4);
        }
    }

    public final void Crp(long j) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Crq(long[] jArr, int i, int i2) {
        throw AnonymousClass00P.createAndThrow();
    }
}
