package X;

import com.instagram.direct.send.mutation.DirectConfigureAnimatedMediaMessageMutationProcessor;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;

public final class KA5 extends 1P0 {
    public final /* synthetic */ DirectConfigureAnimatedMediaMessageMutationProcessor A00;
    public final /* synthetic */ 1fV A01;

    public KA5(DirectConfigureAnimatedMediaMessageMutationProcessor directConfigureAnimatedMediaMessageMutationProcessor, 1fV r2) {
        this.A00 = directConfigureAnimatedMediaMessageMutationProcessor;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(512659459);
        int A032 = AnonymousClass0fD.A03(-439142785);
        DirectConfigureAnimatedMediaMessageMutationProcessor directConfigureAnimatedMediaMessageMutationProcessor = this.A00;
        AnonymousClass3Q2 A033 = ((PendingMediaStore) directConfigureAnimatedMediaMessageMutationProcessor.A03.getValue()).A03(this.A01.A04);
        if (A033 != null && A033.A53) {
            A033.A0b(AnonymousClass3QD.CONFIGURED);
            ((PendingMediaStoreSerializer) directConfigureAnimatedMediaMessageMutationProcessor.A04.getValue()).A04();
        }
        AnonymousClass0fD.A0A(31436738, A032);
        AnonymousClass0fD.A0A(114562555, A03);
    }
}
