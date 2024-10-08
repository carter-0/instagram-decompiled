package X;

import com.facebook.msys.mci.DataTask;

/* renamed from: X.NBh  reason: case insensitive filesystem */
public final class C68346NBh extends AnonymousClass45Y {
    public final /* synthetic */ C268654dm A00;
    public final /* synthetic */ C299365v1 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68346NBh(C268654dm r2, C299365v1 r3) {
        super("performDataTaskStreaming");
        this.A01 = r3;
        this.A00 = r2;
    }

    public final void run() {
        C299365v1 r1 = this.A01;
        DataTask dataTask = r1.A00;
        String str = dataTask.mTaskCategory;
        String str2 = dataTask.mTaskIdentifier;
        Object A002 = this.A00.A00();
        A002.getClass();
        C296045pM r0 = (C296045pM) A002;
        r1.A01.onDataTaskNewStreamingDataCallback(str, str2, r0.A00, r0.A02);
    }
}
