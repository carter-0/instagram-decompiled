package X;

import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.NetworkSession;

/* renamed from: X.5uz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C299345uz implements C299355v0 {
    public final /* synthetic */ DataTask A00;
    public final /* synthetic */ NetworkSession A01;

    public /* synthetic */ C299345uz(DataTask dataTask, NetworkSession networkSession) {
        this.A00 = dataTask;
        this.A01 = networkSession;
    }

    public final OFG AEJ(long j) {
        return new OFG(this.A01, this.A00.mTaskIdentifier, j);
    }
}
