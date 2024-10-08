package X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import android.view.Surface;
import com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.igsandbox.IgSandboxARExperimentUtilHost$getBinder$1;
import com.facebook.cameracore.util.memory.VersionedSharedMemory;
import com.meta.arfx.engine.common.AREngineServiceManager$callback$1;
import com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost;
import com.meta.arfx.engine.interfaces.IAREngineServiceCallback;
import com.meta.arfx.engine.interfaces.IAREngineServiceController;
import com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public final class AIb {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Surface A08;
    public VersionedSharedMemory A09;
    public IAREngineServiceController A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Integer A0E;
    public Integer A0F;
    public boolean A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public C368568sr A0K = C368568sr.PROD;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public final Context A0V;
    public final Intent A0W;
    public final ServiceConnection A0X;
    public final A3K A0Y;
    public final A6T A0Z;
    public final IAREngineServiceCallback A0a;
    public final Object A0b;
    public final BlockingQueue A0c;
    public final C40107ARu A0d;
    public final IARAnalyticsLoggerHost A0e;
    public final IARNetworkClientWorkerHost A0f;

    private final boolean A01() {
        if (this.A0F == AnonymousClass05K.A01) {
            A06(this.A0K, this.A0H, this.A0U, this.A0R, this.A0T);
        }
        return AnonymousClass7TF.A1W(this.A0F, AnonymousClass05K.A0C);
    }

    public static final boolean A02(AIb aIb) {
        AIb aIb2 = aIb;
        if (aIb.A0B == AnonymousClass05K.A01) {
            String str = aIb.A0N;
            String str2 = aIb.A0O;
            String str3 = aIb.A0P;
            String str4 = aIb.A0L;
            String str5 = aIb.A0Q;
            int i = aIb.A0J;
            aIb2.A08(str, str2, str3, str4, str5, aIb.A0M, i, aIb2.A0I, aIb.A0S);
        }
        return AnonymousClass7TF.A1W(aIb2.A0B, AnonymousClass05K.A0C);
    }

    public final void A04(int i, int i2, int i3, int i4, boolean z) {
        int i5 = i;
        this.A03 = i;
        int i6 = i2;
        this.A02 = i2;
        int i7 = i3;
        this.A07 = i3;
        int i8 = i4;
        this.A06 = i4;
        boolean z2 = z;
        this.A0G = z;
        this.A0D = AnonymousClass05K.A01;
        if (this.A0A != null && A01()) {
            try {
                IAREngineServiceController iAREngineServiceController = this.A0A;
                if (iAREngineServiceController != null) {
                    iAREngineServiceController.ErR(i5, i6, i7, i8, z2);
                }
            } catch (RemoteException e) {
                0KC.A05(AIb.class, "setupImageSourceFacet() failed: ", e);
                A00(this);
            }
        }
    }

    public final void A06(C368568sr r12, int i, boolean z, boolean z2, boolean z3) {
        boolean z4 = z;
        this.A0U = z;
        this.A0K = r12;
        int i2 = i;
        this.A0H = i;
        boolean z5 = z2;
        this.A0R = z2;
        boolean z6 = z3;
        this.A0T = z6;
        Integer num = AnonymousClass05K.A01;
        this.A0F = num;
        if (this.A0A != null) {
            if (this.A0E == num) {
                A05(this.A08, this.A05, this.A04);
            }
            Integer num2 = this.A0E;
            Integer num3 = AnonymousClass05K.A0C;
            if (num2 == num3) {
                try {
                    IAREngineServiceController iAREngineServiceController = this.A0A;
                    if (iAREngineServiceController != null) {
                        int i3 = r12.A00;
                        iAREngineServiceController.EFA(this.A0e, new IgSandboxARExperimentUtilHost$getBinder$1(this.A0d), this.A0f, i3, i2, z4, z5, z6);
                    }
                    this.A0F = num3;
                } catch (RemoteException e) {
                    0KC.A05(AIb.class, "renderSessionInit() failed: ", e);
                    A00(this);
                }
            }
        }
    }

    public final void A08(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, boolean z) {
        String str7 = str;
        this.A0N = str;
        String str8 = str2;
        this.A0O = str8;
        String str9 = str3;
        this.A0P = str9;
        String str10 = str4;
        this.A0L = str10;
        String str11 = str5;
        this.A0Q = str11;
        int i3 = i;
        this.A0J = i3;
        String str12 = str6;
        this.A0M = str12;
        boolean z2 = z;
        this.A0S = z2;
        int i4 = i2;
        this.A0I = i4;
        this.A0B = AnonymousClass05K.A01;
        if (this.A0A != null && A01()) {
            try {
                this.A0c.clear();
                IAREngineServiceController iAREngineServiceController = this.A0A;
                if (iAREngineServiceController != null) {
                    iAREngineServiceController.EQO(this.A00);
                }
                IAREngineServiceController iAREngineServiceController2 = this.A0A;
                if (iAREngineServiceController2 != null) {
                    iAREngineServiceController2.EQT(this.A01);
                }
                IAREngineServiceController iAREngineServiceController3 = this.A0A;
                if (iAREngineServiceController3 != null) {
                    A6T a6t = this.A0Z;
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    Iterator A0v = AnonymousClass7TF.A0v(a6t.A02);
                    while (A0v.hasNext()) {
                        A1C.add(((B38) A0v.next()).BH4());
                    }
                    A1C.add(Q21.A00(AnonymousClass7TE.A1L("requiredDownloadableModules", a6t.A01)));
                    iAREngineServiceController3.EUp(str7, str8, str9, str10, str11, str12, A1C, i3, i4, z2);
                }
                this.A0B = AnonymousClass05K.A0C;
            } catch (RemoteException e) {
                0KC.A05(AIb.class, "setEffect() failed: ", e);
                A00(this);
            }
        }
    }

    public final boolean A09() {
        Integer num = this.A0E;
        Integer num2 = AnonymousClass05K.A01;
        if (num == num2) {
            A05(this.A08, this.A05, this.A04);
        }
        Integer num3 = this.A0E;
        Integer num4 = AnonymousClass05K.A0C;
        if (num3 == num4 && A01()) {
            if (this.A0D == num2) {
                A04(this.A03, this.A02, this.A07, this.A06, this.A0G);
            }
            if (this.A0D != num4 || !A02(this)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final void A00(AIb aIb) {
        Integer num = aIb.A0D;
        Integer num2 = AnonymousClass05K.A0C;
        if (num == num2) {
            num = AnonymousClass05K.A01;
        }
        aIb.A0D = num;
        Integer num3 = aIb.A0E;
        if (num3 == num2) {
            num3 = AnonymousClass05K.A01;
        }
        aIb.A0E = num3;
        Integer num4 = aIb.A0F;
        if (num4 == num2) {
            num4 = AnonymousClass05K.A01;
        }
        aIb.A0F = num4;
        Integer num5 = aIb.A0B;
        if (num5 == num2) {
            num5 = AnonymousClass05K.A01;
        }
        aIb.A0B = num5;
        Integer num6 = aIb.A0C;
        if (num6 == num2) {
            num6 = AnonymousClass05K.A01;
        }
        aIb.A0C = num6;
    }

    public final void A05(Surface surface, int i, int i2) {
        this.A08 = surface;
        this.A05 = i;
        this.A04 = i2;
        this.A0E = AnonymousClass05K.A01;
        IAREngineServiceController iAREngineServiceController = this.A0A;
        if (iAREngineServiceController != null) {
            try {
                iAREngineServiceController.End(surface, i, i2);
                this.A0E = AnonymousClass05K.A0C;
            } catch (RemoteException e) {
                0KC.A05(AIb.class, "setSurface() failed: ", e);
                A00(this);
            }
        }
    }

    public final void A07(VersionedSharedMemory versionedSharedMemory) {
        this.A09 = versionedSharedMemory;
        this.A0C = AnonymousClass05K.A01;
        IAREngineServiceController iAREngineServiceController = this.A0A;
        if (iAREngineServiceController != null) {
            try {
                iAREngineServiceController.ErQ(versionedSharedMemory);
                this.A0C = AnonymousClass05K.A0C;
            } catch (RemoteException e) {
                0KC.A05(AIb.class, "setupFrameDataBuffer() failed: ", e);
                A00(this);
            }
        }
    }

    public AIb(Context context, Intent intent, C40107ARu aRu, A3K a3k, A6T a6t, IARAnalyticsLoggerHost iARAnalyticsLoggerHost, IARNetworkClientWorkerHost iARNetworkClientWorkerHost) {
        this.A0V = context;
        this.A0Y = a3k;
        this.A0W = intent;
        this.A0Z = a6t;
        this.A0d = aRu;
        this.A0f = iARNetworkClientWorkerHost;
        this.A0e = iARAnalyticsLoggerHost;
        Integer num = AnonymousClass05K.A00;
        this.A0E = num;
        this.A0D = num;
        this.A0F = num;
        this.A0B = num;
        this.A0C = num;
        this.A0c = new LinkedBlockingQueue();
        this.A0b = new Object();
        this.A0X = new SVZ(this, 2);
        this.A0a = new AREngineServiceManager$callback$1(this);
    }

    public final void A03() {
        A00(this);
        IAREngineServiceController iAREngineServiceController = this.A0A;
        if (iAREngineServiceController != null) {
            try {
                iAREngineServiceController.EyA();
                IAREngineServiceController iAREngineServiceController2 = this.A0A;
                if (iAREngineServiceController2 != null) {
                    iAREngineServiceController2.EFB();
                }
            } catch (RemoteException e) {
                0KC.A05(AIb.class, "rebootRenderSession() failed: ", e);
            }
        }
    }
}
