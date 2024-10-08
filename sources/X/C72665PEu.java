package X;

import android.os.RemoteException;
import com.instagram.direct.stella.api.ISendDirectMessageCallback;

/* renamed from: X.PEu  reason: case insensitive filesystem */
public final class C72665PEu implements C74344PtK {
    public final /* synthetic */ Oy8 A00;
    public final /* synthetic */ ISendDirectMessageCallback A01;

    public C72665PEu(Oy8 oy8, ISendDirectMessageCallback iSendDirectMessageCallback) {
        this.A00 = oy8;
        this.A01 = iSendDirectMessageCallback;
    }

    public final void DRn(String str, boolean z, String str2) {
        boolean remove;
        ISendDirectMessageCallback iSendDirectMessageCallback;
        Oy8 oy8 = this.A00;
        synchronized (oy8.A01) {
            remove = oy8.A02.remove(str);
        }
        if (remove && (iSendDirectMessageCallback = this.A01) != null) {
            try {
                iSendDirectMessageCallback.DRm(str, z);
            } catch (RemoteException unused) {
            }
        }
    }
}
