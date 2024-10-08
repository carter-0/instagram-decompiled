package X;

import com.google.common.util.concurrent.SettableFuture;
import java.util.Map;

/* renamed from: X.Wln  reason: case insensitive filesystem */
public final class C20127Wln implements Runnable {
    public final /* synthetic */ C39896ADy A00;
    public final /* synthetic */ SettableFuture A01;

    public C20127Wln(C39896ADy aDy, SettableFuture settableFuture) {
        this.A00 = aDy;
        this.A01 = settableFuture;
    }

    public final void run() {
        C39896ADy aDy = this.A00;
        C39896ADy.A00(aDy);
        W1S w1s = VJQ.A00;
        long j = aDy.A01;
        A8N a8n = aDy.A05;
        Map map = aDy.A02;
        if (map == null) {
            0qQ.A0F("keysetHandles");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0B(a8n, 1);
        C18398Vqy.A00 = 824186200;
        02m r2 = C18398Vqy.A01;
        r2.markerStart(824186200);
        C18398Vqy.A00("get_encrypted_match_key_start");
        AnonymousClass59G A03 = w1s.A03(a8n, AnonymousClass05K.A01, "www.meta.com", map, j);
        C18398Vqy.A00("get_encrypted_match_key_end");
        C18398Vqy.A00("get_encrypted_reports_start");
        AnonymousClass59G A012 = W1S.A01(A03, new AnonymousClass59G((Object) null, (Object) null, (Object) null));
        C18398Vqy.A00("get_encrypted_reports_end");
        r2.markerEnd(C18398Vqy.A00, 2);
        aDy.A06.A00.add(new 0eP(C8906REz.MatchKey, A012));
        this.A01.set(A012);
    }
}
