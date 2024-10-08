package X;

import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.common.Feature;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.63i  reason: invalid class name and case insensitive filesystem */
public final class C3024463i {
    public static final byte[] A03 = new byte[0];
    public final C3024363h A00;
    public final AnonymousClass63F A01;
    public final ScheduledThreadPoolExecutor A02 = new ScheduledThreadPoolExecutor(1);

    public C3024463i(C3024363h r3, AnonymousClass63F r4) {
        this.A01 = r4;
        this.A00 = r3;
    }

    public static final C71087ObS A00(C74296PsV psV, C74377Pts pts, C3024463i r6, String str, boolean z) {
        C71087ObS obS = new C71087ObS();
        Integer Aey = pts.Aey();
        int intValue = Aey.intValue();
        if (intValue == 1) {
            str = "DEVICE_SCOPE_KEY_0";
        } else if (intValue != 0) {
            throw new RuntimeException();
        }
        A01(r6, Aey, str).A04(new C71533OmU(obS, psV, pts, r6, str, z));
        return obS;
    }

    public static final C71087ObS A01(C3024463i r7, Integer num, String str) {
        List singletonList;
        C71087ObS obS = new C71087ObS();
        int intValue = num.intValue();
        if (intValue == 1) {
            singletonList = Collections.singletonList(str);
            0qQ.A07(singletonList);
        } else if (intValue == 0) {
            singletonList = 0sr.A1P(new String[]{str, C66579MXk.A00(278)});
        } else {
            throw new RuntimeException();
        }
        AnonymousClass3Qk.A03(singletonList, "Keys cannot be set to null");
        RetrieveBytesRequest retrieveBytesRequest = new RetrieveBytesRequest(singletonList, false);
        AnonymousClass63D r3 = (AnonymousClass63D) r7.A01;
        SHO A002 = SFC.A00();
        A002.A03 = new Feature[]{C301135ya.A07};
        A002.A01 = new SxU(retrieveBytesRequest, r3);
        A002.A02 = false;
        A002.A00 = 1668;
        AnonymousClass63E.A00(r3, A002.A01(), 0).A03(new C71804Or5(obS, r7, singletonList));
        return obS;
    }

    public static final C71087ObS A02(C3024463i r3, String str, byte[] bArr, boolean z) {
        C71087ObS obS = new C71087ObS();
        if (bArr.length > 4096) {
            obS.A05(new NEG(new IOException("Storage full: can not save the backup data")));
            return obS;
        }
        r3.A03().A04(new Sm1(obS, r3, str, bArr, z));
        return obS;
    }

    public final C71087ObS A03() {
        C71087ObS obS = new C71087ObS();
        AnonymousClass63D r3 = (AnonymousClass63D) this.A01;
        SHO A002 = SFC.A00();
        A002.A03 = new Feature[]{C301135ya.A04};
        A002.A01 = new SxL(r3);
        A002.A02 = false;
        A002.A00 = 1651;
        AnonymousClass63E.A00(r3, A002.A01(), 0).A03(new C71803Or4(obS, this));
        return obS;
    }
}
