package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.FTc  reason: case insensitive filesystem */
public final class C50196FTc implements C74379Ptu {
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r3.length() == 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object AWX(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0009
            int r0 = r3.length()
            r1 = 0
            if (r0 != 0) goto L_0x000a
        L_0x0009:
            r1 = 1
        L_0x000a:
            r0 = 0
            if (r1 != 0) goto L_0x0015
            X.16F r1 = X.16P.A00(r3)     // Catch:{ IOException -> 0x0015 }
            X.DxR r0 = X.C48379Eda.parseFromJson(r1)     // Catch:{ IOException -> 0x0015 }
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50196FTc.AWX(java.lang.String):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ String FHB(Object obj) {
        DxR dxR = (DxR) obj;
        if (dxR == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0K = AnonymousClass7TF.A0K(stringWriter);
            if (dxR.A00 != null) {
                16P.A03(A0K, "cloud_accounts_list");
                for (F3D f3d : dxR.A00) {
                    if (f3d != null) {
                        A0K.A0c();
                        String str = f3d.A01;
                        if (str != null) {
                            A0K.A0R(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
                        }
                        String str2 = f3d.A02;
                        if (str2 != null) {
                            A0K.A0R(Dbg.A01(), str2);
                        }
                        String str3 = f3d.A00;
                        if (str3 != null) {
                            A0K.A0R("profile_pic_url", str3);
                        }
                        A0K.A0Z();
                    }
                }
                A0K.A0Y();
            }
            return AnonymousClass7TG.A0k(A0K, stringWriter);
        } catch (IOException unused) {
            return null;
        }
    }
}
