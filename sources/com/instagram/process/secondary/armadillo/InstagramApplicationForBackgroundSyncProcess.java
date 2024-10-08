package com.instagram.process.secondary.armadillo;

import X.0KC;
import X.0eO;
import X.0qQ;
import X.0sr;
import X.0t9;
import X.122;
import X.12P;
import X.1RH;
import X.1a3;
import X.1ak;
import X.1al;
import X.1am;
import X.1an;
import X.AnonymousClass0aq;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass11c;
import X.AnonymousClass11w;
import X.AnonymousClass11y;
import X.AnonymousClass12G;
import X.AnonymousClass12H;
import X.AnonymousClass12K;
import X.AnonymousClass1au;
import X.AnonymousClass2VO;
import X.AnonymousClass7TF;
import X.C13331TVe;
import X.C51763G0f;
import X.C60960kU;
import X.C635413e;
import X.C636713v;
import X.C636813x;
import X.C66661pn;
import X.C9844RiG;
import X.MJ4;
import android.content.Context;
import android.content.res.Resources;
import android.provider.Settings;
import com.instagram.direct.msys.impl.MsysMailboxSessionManagerImpl;
import com.instagram.process.secondary.InstagramApplicationForSecondaryProcess;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class InstagramApplicationForBackgroundSyncProcess extends InstagramApplicationForSecondaryProcess implements AnonymousClass0aq {
    public static final C9844RiG Companion = new Object();
    public static final String TAG = "InstagramApplicationForBackgroundSyncProcess";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstagramApplicationForBackgroundSyncProcess(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }

    public void onCreate(String str, long j, long j2, long j3, long j4) {
        String str2 = str;
        0qQ.A0B(str2, 0);
        super.onCreate(str2, j, j2, j3, j4);
        Context context = this.context;
        C60960kU.A00 = context;
        1RH.A03 = new 1RH(context);
        0t9 r6 = new 0t9();
        MJ4 mj4 = new MJ4(18, r6, this);
        AnonymousClass11w r7 = AnonymousClass11w.A00;
        AnonymousClass11y r2 = new AnonymousClass11y(r7, mj4, 5);
        122 A00 = r2.A00();
        AnonymousClass11y r1 = new AnonymousClass11y(r7, new C51763G0f(this, 11), 44);
        122 A002 = r1.A00();
        12P r11 = new 12P(this.context, r2, r1, (AnonymousClass11y) null, false);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, C13331TVe.A00);
        AnonymousClass12H r12 = new AnonymousClass12H(this.context, r6, A003);
        AnonymousClass12G r13 = new AnonymousClass12G(this.context, r2, A003);
        AnonymousClass12K r14 = new AnonymousClass12K(this.context, r2, (AnonymousClass11y) null, A003);
        C635413e.A01();
        List<122> A1P = 0sr.A1P(new 122[]{A00, A002, r11, r12, r13, r14, new C636713v(r2, C635413e.A00(this.context)), new C636813x(this.context, r2)});
        0qQ.A07(String.format(Locale.US, "Initialization %d initializers sequentially", Arrays.copyOf(AnonymousClass7TF.A1b(A1P.size()), 1)));
        for (122 A03 : A1P) {
            A03.A03();
        }
        AnonymousClass2VO.A01.A00();
        MsysMailboxSessionManagerImpl msysMailboxSessionManagerImpl = new MsysMailboxSessionManagerImpl();
        if (1a3._instance != null) {
            0KC.A0E("MsysMailboxSessionManager", "Duplicate initialization of MsysMailboxSessionManager");
        } else {
            1a3._instance = msysMailboxSessionManagerImpl;
        }
        1an.A00 = new 1am(1al.A00, 1ak.A00);
        AnonymousClass1au.A00(this.context).A01(Settings.System.DEFAULT_NOTIFICATION_URI);
        C66661pn.A00();
    }

    public Resources getOverridingResources() {
        if (AnonymousClass11c.A01) {
            return AnonymousClass11c.A00().A01();
        }
        return null;
    }
}
