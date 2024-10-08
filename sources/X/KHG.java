package X;

import android.graphics.Bitmap;
import com.instagram.base.activity.IgFragmentActivity;
import java.util.Map;

public final class KHG extends 2Cl {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public KHG(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A04 = obj2;
        this.A01 = obj;
        this.A03 = obj4;
        this.A05 = obj5;
        this.A02 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
        X.0wb.A06("GetClientMessageBloksSignature", "reset_password_flow_client_start_query_failed", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0055, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0056, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0057, code lost:
        X.0wb.A06("GetClientMessageBloksSignature", "reset_password_flow_start_query_failed", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005e, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f A[ExcHandler: 6GV | SecurityException (r1v3 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:3:0x0008] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r6 = this;
            int r0 = r6.A00
            if (r0 == 0) goto L_0x005f
            r4 = 0
            java.lang.String r5 = "reset_password_flow_client_start_query_failed"
            r3 = 0
            java.lang.Object r2 = r6.A05     // Catch:{ RemoteException -> 0x0056, 6GV | SecurityException -> 0x004f }
            X.LA9 r2 = (X.LA9) r2     // Catch:{ RemoteException -> 0x0056, 6GV | SecurityException -> 0x004f }
            X.LQW r1 = r2.A00     // Catch:{ RemoteException -> 0x0056, 6GV | SecurityException -> 0x004f }
            if (r1 != 0) goto L_0x001a
            java.lang.String r0 = "feO2Client"
            X.0qQ.A0F(r0)     // Catch:{ RemoteException -> 0x0056, 6GV | SecurityException -> 0x004f }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            goto L_0x004e
        L_0x001a:
            android.os.Bundle r0 = X.AnonymousClass7TE.A0a()     // Catch:{ RemoteException -> 0x0056, 6GV | SecurityException -> 0x004f }
            X.LSS.A01(r0)     // Catch:{ RemoteException -> 0x0056, 6GV | SecurityException -> 0x004f }
            android.os.Bundle r0 = X.LQW.A01(r0, r1)     // Catch:{ Exception -> 0x0047, 6GV | SecurityException -> 0x004f }
            if (r0 != 0) goto L_0x0028
            goto L_0x0031
        L_0x0028:
            android.os.Bundle r4 = r0.deepCopy()     // Catch:{ Exception -> 0x0047, 6GV | SecurityException -> 0x004f }
            X.C62990Kpg.A00(r4)     // Catch:{ Exception -> 0x0047, 6GV | SecurityException -> 0x004f }
            r0 = 1
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r0 == 0) goto L_0x008a
            X.S6k r2 = r2.A01     // Catch:{ RemoteException -> 0x0056, 6GV | SecurityException -> 0x004f }
            java.lang.String r1 = "startMessage"
            boolean r0 = r4.containsKey(r1)     // Catch:{ RemoteException -> 0x0056, 6GV | SecurityException -> 0x004f }
            if (r0 == 0) goto L_0x0049
            byte[] r0 = r4.getByteArray(r1)     // Catch:{ RemoteException -> 0x0056, 6GV | SecurityException -> 0x004f }
            java.lang.String r3 = r2.A02(r0)     // Catch:{ RemoteException -> 0x0056, 6GV | SecurityException -> 0x004f }
            return r3
        L_0x0047:
            r0 = move-exception
            goto L_0x004e
        L_0x0049:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ RemoteException -> 0x0056, 6GV | SecurityException -> 0x004f }
            r0.<init>()     // Catch:{ RemoteException -> 0x0056, 6GV | SecurityException -> 0x004f }
        L_0x004e:
            throw r0     // Catch:{ RemoteException -> 0x0056, 6GV | SecurityException -> 0x004f }
        L_0x004f:
            r1 = move-exception
            java.lang.String r0 = "GetClientMessageBloksSignature"
            X.0wb.A06(r0, r5, r1)
            return r3
        L_0x0056:
            r2 = move-exception
            java.lang.String r1 = "GetClientMessageBloksSignature"
            java.lang.String r0 = "reset_password_flow_start_query_failed"
            X.0wb.A06(r1, r0, r2)
            return r3
        L_0x005f:
            java.lang.Object r0 = r6.A04
            android.content.Context r0 = X.DbT.A08(r0)
            java.lang.Object r4 = r6.A01
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            X.1FG r3 = X.LNw.A00(r0)
            java.io.OutputStream r2 = r3.CGq()     // Catch:{ IOException -> 0x007c }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x007c }
            r0 = 100
            X.0fO.A02(r1, r4, r2, r0)     // Catch:{ IOException -> 0x007c }
            r3.AIX()     // Catch:{ IOException -> 0x007c }
            goto L_0x0086
        L_0x007c:
            r0 = move-exception
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "BKBloksActionTakeAndSaveScreenshotImpl"
            X.0wb.A03(r0, r1)
        L_0x0086:
            java.lang.Boolean r3 = X.AnonymousClass7TE.A0v()
        L_0x008a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KHG.call():java.lang.Object");
    }

    public final int getRunnableId() {
        if (this.A00 != 0) {
            return 1200830798;
        }
        return 258;
    }

    public final void onFail(Exception exc) {
        if (this.A00 != 0) {
            0qQ.A0B(exc, 0);
            0wb.A06("GetClientMessageBloksSignature", "reset_password_flow_client_start_query_failed", exc);
            return;
        }
        C308206Td.A0E((C307896Rx) this.A03, (C277014uI) this.A05, (C307786Rm) this.A02, false);
    }

    public final void onFinish() {
        if (this.A00 != 0) {
            KHG.super.onFinish();
            return;
        }
        KHG.super.onFinish();
        ((Bitmap) this.A01).recycle();
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (this.A00 != 0) {
            if (obj != null) {
                ((Map) this.A03).put("auto_conf_client_message", obj);
                C49944FFx.A01((0lg) this.A02, AnonymousClass000.A00(4506), "client_start_message_found", "registration_flow", AnonymousClass000.A00(1095));
            }
            IgFragmentActivity igFragmentActivity = (IgFragmentActivity) this.A01;
            Map map = (Map) this.A03;
            0lg r3 = (0lg) this.A02;
            DwG dwG = (DwG) this.A04;
            0qQ.A0B(map, 1);
            map.put(AnonymousClass000.A00(3721), dwG.A05);
            map.put(AnonymousClass000.A00(2919), dwG.A03);
            C360678ey A052 = C359988do.A05(r3, dwG.A00, map);
            E86.A01(A052, igFragmentActivity, r3, 25);
            igFragmentActivity.schedule(A052);
            return;
        }
        C308206Td.A0E((C307896Rx) this.A03, (C277014uI) this.A05, (C307786Rm) this.A02, obj);
    }
}
