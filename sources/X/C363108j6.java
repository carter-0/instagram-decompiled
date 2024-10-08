package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.models.interfaces.IManifestLoader;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.8j6  reason: invalid class name and case insensitive filesystem */
public final class C363108j6 implements IManifestLoader {
    public final 1vo A00;

    public final ListenableFuture load(String str, Map map) {
        0qQ.A0B(str, 0);
        0qQ.A0B(map, 1);
        return A00((Long) null, str, map);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture, X.1K2] */
    private final SettableFuture A00(Long l, String str, Map map) {
        ? obj = new Object();
        0Df A02 = GraphQlCallInput.A02.A02();
        0Df.A00(A02, str, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        if (l != null) {
            long longValue = l.longValue();
            if (longValue > 2147483647L || longValue < -2147483648L) {
                obj.setException(new ArithmeticException("Version number overflow! Valid version range is [-2147483648, 2147483647]."));
            }
            if (longValue != -1) {
                0Df.A00(A02, Integer.valueOf((int) longValue), "version");
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object add : map.keySet()) {
            arrayList.add(add);
        }
        2IV r2 = new 2IV();
        r2.A05("bytecodeVersion", new ArrayList());
        r2.A05("cachedModelAssets", arrayList);
        2IS r4 = new 2IS();
        r4.A00.A02().A0E(A02, "model_request_metadata");
        r4.A00(r2, "client_capability_metadata");
        C239113Fa r3 = new C239113Fa(r4, AnonymousClass9RK.class, "NativeMLModelQuery", false);
        this.A00.ATL(new AnonymousClass9RB(obj), new AnonymousClass9RC(obj), r3);
        return obj;
    }

    public C363108j6(1vo r1) {
        this.A00 = r1;
    }

    public final ListenableFuture load(String str, long j, Map map) {
        0qQ.A0B(str, 0);
        0qQ.A0B(map, 2);
        return A00(Long.valueOf(j), str, map);
    }
}
