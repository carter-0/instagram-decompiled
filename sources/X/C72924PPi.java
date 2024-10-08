package X;

import android.os.Build;
import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.PPi  reason: case insensitive filesystem */
public final class C72924PPi implements 0Jp {
    public final void ATC(UserSession userSession, 0Jv r7) {
        AnonymousClass7TF.A1H(userSession, r7);
        CompletableFuture[] completableFutureArr = (CompletableFuture[]) C70115NxV.A00(userSession).A02.toArray(new CompletableFuture[0]);
        CompletableFuture<Void> allOf = CompletableFuture.allOf((CompletableFuture[]) Arrays.copyOf(completableFutureArr, completableFutureArr.length));
        0qQ.A07(allOf);
        CompletableFuture[] completableFutureArr2 = (CompletableFuture[]) 0sr.A1P(new CompletableFuture[]{allOf, O0F.A00(userSession).A00()}).toArray(new CompletableFuture[0]);
        CompletableFuture<Void> allOf2 = CompletableFuture.allOf((CompletableFuture[]) Arrays.copyOf(completableFutureArr2, completableFutureArr2.length));
        if (Build.VERSION.SDK_INT >= 31) {
            allOf2.completeOnTimeout((Object) null, 2, TimeUnit.MINUTES);
        }
        allOf2.thenRun(new PW8(r7));
    }
}
