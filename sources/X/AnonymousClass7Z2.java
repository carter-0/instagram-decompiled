package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.7Z2  reason: invalid class name */
public final class AnonymousClass7Z2 implements 1wn {
    public final /* synthetic */ AnonymousClass7S6 A00;

    public AnonymousClass7Z2(AnonymousClass7S6 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(1902857524);
        int A032 = AnonymousClass0fD.A03(882225351);
        AnonymousClass7S6 r2 = this.A00;
        AnonymousClass7ZX r0 = r2.A04;
        AnonymousClass7LQ A01 = r0.A0n.A01(((C330837Ol) obj).A01);
        if (A01 == null) {
            0wb.A03("UpdateMessagePendingReactionEventListener", "DirectMessageRowData no longer exists for regenerateViewModelFromReactionStateChange");
        } else {
            r2.A04.A0X(r2.CC6(), (Integer) null, (List) null, (List) null, (List) null, Collections.singletonList(A01));
        }
        AnonymousClass0fD.A0A(476172276, A032);
        AnonymousClass0fD.A0A(-191436037, A03);
    }
}
