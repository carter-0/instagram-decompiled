package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.GenAIToolInfoDict;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8Vq  reason: invalid class name and case insensitive filesystem */
public final class C356898Vq implements AnonymousClass1MK {
    public final /* synthetic */ C356858Vm A00;

    public final void CyF(C226952iF r13, AnonymousClass3LX r14) {
        CameraTool cameraTool;
        0qQ.A0B(r14, 1);
        Bitmap bitmap = r14.A01;
        if (bitmap != null) {
            C356858Vm r3 = this.A00;
            UserSession userSession = r3.A0H;
            Context applicationContext = r3.A0B.getApplicationContext();
            0qQ.A07(applicationContext);
            C352218Cl A002 = C363868kT.A00(applicationContext, bitmap, (C363848kR) null, userSession, (byte[]) null, bitmap.getWidth(), bitmap.getHeight(), false);
            A002.A0I = 0oY.A01(0oT.A01(bitmap, AnonymousClass05K.A00), 0);
            C376649Iu r1 = r14.A02;
            if (r1 != null) {
                C227792jv.A02(r1, A002.A03());
            }
            GenAIToolInfoDict genAIToolInfoDict = r3.A0M.A0I;
            if (!(genAIToolInfoDict == null || (cameraTool = genAIToolInfoDict.A00) == null)) {
                List singletonList = Collections.singletonList(new LMH(cameraTool, C63192Ksz.A00(genAIToolInfoDict)));
                0qQ.A07(singletonList);
                A002.A0p = singletonList;
            }
            r3.A0O.A03(A002, false);
        }
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public C356898Vq(C356858Vm r1) {
        this.A00 = r1;
    }
}
