package X;

import com.instagram.user.model.User;

/* renamed from: X.78y  reason: invalid class name and case insensitive filesystem */
public final class C3269978y extends 1P0 {
    public final /* synthetic */ 02m A00;
    public final /* synthetic */ AnonymousClass789 A01;

    public C3269978y(02m r1, AnonymousClass789 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onFail(C268654dm r5) {
        String str;
        int A03 = AnonymousClass0fD.A03(372508369);
        0qQ.A0B(r5, 0);
        1XP r0 = (1XP) r5.A00();
        if (r0 == null || (str = r0.getErrorMessage()) == null) {
            str = "";
        }
        0wb.A03("CreatorUtil", 002.A0R("Could not fetch Creator Info: ", str));
        this.A00.markerEnd(190452164, 3);
        AnonymousClass0fD.A0A(-1020491179, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        boolean z;
        AnonymousClass16x AsZ;
        AnonymousClass16x AsZ2;
        int A03 = AnonymousClass0fD.A03(1033932109);
        AnonymousClass92o r6 = (AnonymousClass92o) obj;
        int A032 = AnonymousClass0fD.A03(1050683860);
        0qQ.A0B(r6, 0);
        User user = r6.A00;
        if (!(user == null || (AsZ2 = user.A03.AsZ()) == null)) {
            AsZ2.Ase();
        }
        User user2 = r6.A00;
        if (user2 == null || (AsZ = user2.A03.AsZ()) == null) {
            z = false;
        } else {
            z = 0qQ.A0K(AsZ.CQk(), true);
        }
        this.A01.DLh(z);
        this.A00.markerEnd(190452164, 2);
        AnonymousClass0fD.A0A(2087124955, A032);
        AnonymousClass0fD.A0A(-1121015738, A03);
    }
}
