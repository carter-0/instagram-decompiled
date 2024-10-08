package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.AccountSession;
import com.facebook.rsys.crypto.gen.CryptoContextHolder;

/* renamed from: X.Pg4  reason: case insensitive filesystem */
public final class C73574Pg4 extends 0Yk implements C62320sa {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73574Pg4(Object obj, int i) {
        super(0, obj, C71143Odx.class, "createCallComponents", "createCallComponents(Lcom/facebook/msys/mca/Mailbox;Lcom/facebook/msys/mci/AccountSession;Lcom/facebook/rsys/crypto/gen/CryptoContextHolder;)Lcom/instagram/rtc/interactor/rsys/RtcCallComponents;", 0);
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        return C71143Odx.A00((Mailbox) null, (AccountSession) null, (CryptoContextHolder) null, (C71143Odx) this.receiver);
    }
}
