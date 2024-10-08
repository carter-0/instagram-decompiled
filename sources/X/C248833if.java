package X;

import android.content.Context;
import android.util.Log;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.3if  reason: invalid class name and case insensitive filesystem */
public final class C248833if extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248833if(2Lk r7) {
        super("initializeRiskyStartupConfig", 1053074567, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        DataOutputStream dataOutputStream;
        2Lk r2 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        Context context = r2.A01;
        UserSession userSession = r2.A04;
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        0t0 A01 = AnonymousClass0eN.A01(new C377179Kv(userSession, 9));
        boolean z = ((AnonymousClass9EX) A01.getValue()).A00;
        int i = AnonymousClass9EY.A00;
        if (28 == i || z) {
            0JL r5 = new 0JL();
            boolean z2 = ((AnonymousClass9EX) A01.getValue()).A00;
            if (28 - i == 0 || z2) {
                r5.A1D = ((AnonymousClass9EX) A01.getValue()).A01;
                r5.A1E = ((AnonymousClass9EX) A01.getValue()).A02;
            }
            if (!r5.equals(0JL.A2c)) {
                try {
                    dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(context.getFileStreamPath("risky_startup_config"), false)));
                    dataOutputStream.writeBoolean(r5.A18);
                    dataOutputStream.writeBoolean(r5.A0z);
                    dataOutputStream.writeBoolean(r5.A10);
                    dataOutputStream.writeBoolean(r5.A0y);
                    dataOutputStream.writeBoolean(r5.A0v);
                    dataOutputStream.writeInt(r5.A0E);
                    dataOutputStream.writeBoolean(r5.A0w);
                    dataOutputStream.writeInt(r5.A0F);
                    dataOutputStream.writeBoolean(r5.A0x);
                    dataOutputStream.writeInt(r5.A0G);
                    dataOutputStream.writeBoolean(r5.A2b);
                    dataOutputStream.writeInt(r5.A0n);
                    dataOutputStream.writeBoolean(r5.A28);
                    dataOutputStream.writeInt(r5.A0X);
                    dataOutputStream.writeBoolean(r5.A2F);
                    dataOutputStream.writeInt(r5.A0b);
                    dataOutputStream.writeBoolean(r5.A1G);
                    dataOutputStream.writeInt(r5.A0O);
                    dataOutputStream.writeBoolean(r5.A0u);
                    dataOutputStream.writeInt(r5.A0D);
                    dataOutputStream.writeBoolean(r5.A2W);
                    dataOutputStream.writeBoolean(r5.A2V);
                    dataOutputStream.writeBoolean(r5.A17);
                    dataOutputStream.writeBoolean(r5.A16);
                    dataOutputStream.writeBoolean(r5.A2T);
                    dataOutputStream.writeBoolean(r5.A2J);
                    dataOutputStream.writeBoolean(r5.A2P);
                    dataOutputStream.writeInt(r5.A0k);
                    dataOutputStream.writeBoolean(r5.A2S);
                    dataOutputStream.writeInt(r5.A0l);
                    dataOutputStream.writeBoolean(r5.A2K);
                    dataOutputStream.writeInt(r5.A0f);
                    dataOutputStream.writeBoolean(r5.A2N);
                    dataOutputStream.writeInt(r5.A0i);
                    dataOutputStream.writeBoolean(r5.A2M);
                    dataOutputStream.writeInt(r5.A0h);
                    dataOutputStream.writeBoolean(r5.A2O);
                    dataOutputStream.writeInt(r5.A0j);
                    dataOutputStream.writeBoolean(r5.A2L);
                    dataOutputStream.writeInt(r5.A0g);
                    dataOutputStream.writeBoolean(r5.A2R);
                    dataOutputStream.writeBoolean(r5.A2Q);
                    dataOutputStream.writeBoolean(r5.A2I);
                    dataOutputStream.writeBoolean(r5.A1g);
                    dataOutputStream.writeDouble(r5.A01);
                    dataOutputStream.writeDouble(r5.A02);
                    dataOutputStream.writeDouble(r5.A03);
                    dataOutputStream.writeDouble(r5.A09);
                    dataOutputStream.writeDouble(r5.A07);
                    dataOutputStream.writeDouble(r5.A08);
                    dataOutputStream.writeDouble(r5.A04);
                    dataOutputStream.writeDouble(r5.A00);
                    dataOutputStream.writeBoolean(r5.A19);
                    dataOutputStream.writeBoolean(r5.A1b);
                    dataOutputStream.writeBoolean(r5.A1f);
                    dataOutputStream.writeBoolean(r5.A2X);
                    dataOutputStream.writeBoolean(r5.A1K);
                    dataOutputStream.writeBoolean(r5.A1Z);
                    dataOutputStream.writeBoolean(r5.A1j);
                    dataOutputStream.writeBoolean(r5.A1W);
                    dataOutputStream.writeBoolean(r5.A1X);
                    dataOutputStream.writeBoolean(r5.A1O);
                    dataOutputStream.writeBoolean(r5.A1V);
                    dataOutputStream.writeBoolean(r5.A1h);
                    dataOutputStream.writeBoolean(r5.A1I);
                    dataOutputStream.writeBoolean(r5.A1c);
                    dataOutputStream.writeBoolean(r5.A1l);
                    dataOutputStream.writeBoolean(r5.A1Y);
                    dataOutputStream.writeBoolean(r5.A1k);
                    dataOutputStream.writeBoolean(r5.A1J);
                    dataOutputStream.writeBoolean(r5.A1e);
                    dataOutputStream.writeBoolean(r5.A1m);
                    dataOutputStream.writeDouble(r5.A05);
                    dataOutputStream.writeBoolean(r5.A1d);
                    dataOutputStream.writeInt(r5.A0P);
                    dataOutputStream.writeInt(r5.A0Q);
                    dataOutputStream.writeBoolean(r5.A1U);
                    dataOutputStream.writeBoolean(r5.A1M);
                    dataOutputStream.writeBoolean(r5.A1L);
                    dataOutputStream.writeBoolean(r5.A1P);
                    dataOutputStream.writeBoolean(r5.A1S);
                    dataOutputStream.writeBoolean(r5.A1a);
                    dataOutputStream.writeBoolean(r5.A1R);
                    dataOutputStream.writeBoolean(r5.A1Q);
                    dataOutputStream.writeBoolean(r5.A1H);
                    dataOutputStream.writeBoolean(r5.A1i);
                    dataOutputStream.writeBoolean(r5.A1T);
                    dataOutputStream.writeBoolean(r5.A1N);
                    dataOutputStream.writeBoolean(r5.A2Y);
                    dataOutputStream.writeDouble(r5.A06);
                    dataOutputStream.writeBoolean(r5.A1v);
                    dataOutputStream.writeInt(r5.A0S);
                    dataOutputStream.writeBoolean(r5.A1t);
                    dataOutputStream.writeInt(r5.A0R);
                    dataOutputStream.writeBoolean(r5.A1u);
                    dataOutputStream.writeLong(r5.A0o);
                    dataOutputStream.writeBoolean(r5.A1s);
                    dataOutputStream.writeFloat(r5.A0A);
                    dataOutputStream.writeBoolean(r5.A1z);
                    dataOutputStream.writeFloat(r5.A0C);
                    dataOutputStream.writeBoolean(r5.A1y);
                    dataOutputStream.writeFloat(r5.A0B);
                    dataOutputStream.writeBoolean(r5.A1x);
                    dataOutputStream.writeBoolean(r5.A1w);
                    dataOutputStream.writeBoolean(r5.A2E);
                    dataOutputStream.writeBoolean(r5.A2C);
                    dataOutputStream.writeBoolean(r5.A2D);
                    dataOutputStream.writeInt(r5.A0a);
                    dataOutputStream.writeBoolean(r5.A2B);
                    dataOutputStream.writeInt(r5.A0Z);
                    dataOutputStream.writeBoolean(r5.A2A);
                    dataOutputStream.writeInt(r5.A0Y);
                    dataOutputStream.writeBoolean(r5.A0s);
                    dataOutputStream.writeBoolean(r5.A29);
                    dataOutputStream.writeBoolean(r5.A11);
                    dataOutputStream.writeInt(r5.A0e);
                    dataOutputStream.writeBoolean(r5.A12);
                    dataOutputStream.writeInt(r5.A0m);
                    dataOutputStream.writeBoolean(r5.A2U);
                    dataOutputStream.writeBoolean(r5.A0p);
                    dataOutputStream.writeBoolean(r5.A0t);
                    dataOutputStream.writeBoolean(false);
                    dataOutputStream.writeBoolean(false);
                    dataOutputStream.writeBoolean(false);
                    dataOutputStream.writeBoolean(r5.A14);
                    dataOutputStream.writeBoolean(r5.A0r);
                    dataOutputStream.writeBoolean(r5.A0q);
                    dataOutputStream.writeBoolean(r5.A2G);
                    dataOutputStream.writeInt(r5.A0c);
                    dataOutputStream.writeBoolean(r5.A2H);
                    dataOutputStream.writeInt(r5.A0d);
                    dataOutputStream.writeBoolean(r5.A15);
                    dataOutputStream.writeBoolean(r5.A2a);
                    dataOutputStream.writeBoolean(false);
                    dataOutputStream.writeBoolean(false);
                    dataOutputStream.writeBoolean(false);
                    dataOutputStream.writeBoolean(r5.A1F);
                    dataOutputStream.writeInt(r5.A0N);
                    dataOutputStream.writeInt(r5.A0H);
                    dataOutputStream.writeInt(r5.A0M);
                    dataOutputStream.writeInt(r5.A0I);
                    dataOutputStream.writeInt(r5.A0J);
                    dataOutputStream.writeInt(r5.A0L);
                    dataOutputStream.writeInt(r5.A0K);
                    dataOutputStream.writeBoolean(r5.A1A);
                    dataOutputStream.writeBoolean(r5.A1B);
                    dataOutputStream.writeInt(IgNetworkConsentStorage.MAX_ENTRIES);
                    dataOutputStream.writeBoolean(false);
                    dataOutputStream.writeInt(4);
                    dataOutputStream.writeInt(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
                    dataOutputStream.writeInt(10);
                    dataOutputStream.writeBoolean(true);
                    dataOutputStream.writeInt(IgNetworkConsentStorage.MAX_ENTRIES);
                    dataOutputStream.writeBoolean(false);
                    dataOutputStream.writeBoolean(r5.A13);
                    dataOutputStream.writeBoolean(r5.A22);
                    dataOutputStream.writeBoolean(r5.A20);
                    dataOutputStream.writeBoolean(r5.A24);
                    dataOutputStream.writeBoolean(r5.A26);
                    dataOutputStream.writeInt(r5.A0W);
                    dataOutputStream.writeInt(r5.A0U);
                    dataOutputStream.writeBoolean(r5.A1C);
                    dataOutputStream.writeBoolean(r5.A23);
                    dataOutputStream.writeBoolean(r5.A21);
                    dataOutputStream.writeBoolean(r5.A25);
                    dataOutputStream.writeBoolean(r5.A27);
                    dataOutputStream.writeInt(r5.A0V);
                    dataOutputStream.writeInt(r5.A0T);
                    dataOutputStream.writeBoolean(r5.A1n);
                    dataOutputStream.writeBoolean(r5.A1o);
                    dataOutputStream.writeBoolean(r5.A2Z);
                    dataOutputStream.writeBoolean(r5.A1D);
                    dataOutputStream.writeBoolean(r5.A1E);
                    dataOutputStream.writeBoolean(false);
                    dataOutputStream.writeBoolean(false);
                    dataOutputStream.writeInt(42);
                    dataOutputStream.writeBoolean(r5.A1q);
                    dataOutputStream.writeBoolean(r5.A1r);
                    dataOutputStream.writeBoolean(r5.A1p);
                    dataOutputStream.close();
                } catch (IOException e) {
                    Log.e("RiskyStartupConfig", String.format("Cannot write to file %s", new Object[]{"risky_startup_config"}), e);
                } catch (Throwable th) {
                    086.A00(th, th);
                }
            }
            File A002 = AnonymousClass0eX.A00(context, 1832390025);
            A002.mkdirs();
            if (A002.exists()) {
                for (File file : A002.listFiles()) {
                    if (!file.delete()) {
                        Log.w("RiskyStartupConfig", String.format("Could not delete config read state: %s", new Object[]{file}));
                    }
                }
                if (!A002.delete()) {
                    Log.w("RiskyStartupConfig", "Could not delete all risky start up config state");
                    return;
                }
                return;
            }
            return;
        }
        return;
        throw th;
    }
}
