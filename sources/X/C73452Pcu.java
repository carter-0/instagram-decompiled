package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

/* renamed from: X.Pcu  reason: case insensitive filesystem */
public final class C73452Pcu implements Consumer {
    public final int A00;
    public final Object A01;

    public C73452Pcu(int i, 0sP r2) {
        this.A00 = i;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
            case 14:
                this.A01 = r2;
                return;
            default:
                this.A01 = r2;
                return;
        }
    }

    public static void A00(CompletableFuture completableFuture, 0sP r2, int i) {
        completableFuture.thenAccept(new C73452Pcu(i, r2));
    }

    public final void accept(Object obj) {
        0sP r0;
        switch (this.A00) {
            case 0:
                ((Set) this.A01).remove(obj);
                return;
            case 15:
                Object obj2 = this.A01;
                AnonymousClass681 r02 = AnonymousClass632.A00;
                MailboxFeature mailboxFeature = new MailboxFeature(new C66794Mcg((Mailbox) obj));
                AnonymousClass68L ASa = mailboxFeature.mMailboxApiHandleMetaProvider.ASa(2);
                MailboxFutureImpl A0G = C66580MXl.A0G(ASa);
                C66582MXn.A1D(ASa, new C71723Oph(12, (Object) mailboxFeature, (Object) A0G), A0G);
                A0G.Eiu(C71722Opg.A00(obj2, 41));
                AnonymousClass68L A0F = C66580MXl.A0F(mailboxFeature, 2);
                MailboxFutureImpl A0G2 = C66580MXl.A0G(A0F);
                C66582MXn.A1D(A0F, new C71723Oph(11, (Object) mailboxFeature, (Object) A0G2), A0G2);
                A0G2.Eiu(C71722Opg.A00(obj2, 42));
                return;
            case 16:
                ((0sP) this.A01).invoke(new C66794Mcg((Mailbox) obj));
                return;
            case 17:
                0qQ.A0B(obj, 0);
                r0 = ((C72655PEi) this.A01).A05;
                break;
            default:
                r0 = (0sP) this.A01;
                break;
        }
        r0.invoke(obj);
    }

    public C73452Pcu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
