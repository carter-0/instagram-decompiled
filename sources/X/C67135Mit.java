package X;

import com.instagram.user.model.User;
import java.util.HashSet;

/* renamed from: X.Mit  reason: case insensitive filesystem */
public final class C67135Mit implements 1wn {
    public final /* synthetic */ C74566PxF A00;

    public C67135Mit(C74566PxF pxF) {
        this.A00 = pxF;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1413486959);
        C67323Mlz mlz = (C67323Mlz) obj;
        int A0D = AnonymousClass7TG.A0D(mlz, -1216875136);
        HashSet A1F = AnonymousClass7TE.A1F();
        for (User id : mlz.A00) {
            A1F.add(id.getId());
        }
        this.A00.FMO(A1F);
        AnonymousClass0fD.A0A(-1393884729, A0D);
        AnonymousClass0fD.A0A(561716260, A03);
    }
}
