package X;

import com.instagram.mainactivity.InstagramMainActivity;

/* renamed from: X.Uf5  reason: case insensitive filesystem */
public final class C15577Uf5 extends 1P0 {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ InstagramMainActivity A01;

    public C15577Uf5(1Xj r1, InstagramMainActivity instagramMainActivity) {
        this.A01 = instagramMainActivity;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-417305040);
        UX3 ux3 = (UX3) obj;
        int A032 = AnonymousClass0fD.A03(720551621);
        0qQ.A0B(ux3, 0);
        if (ux3.A00) {
            InstagramMainActivity instagramMainActivity = this.A01;
            if (instagramMainActivity.A0Q) {
                instagramMainActivity.A0Q = false;
                InstagramMainActivity.A0Q(this.A00, instagramMainActivity, false);
                AnonymousClass0fD.A0A(-225230467, A032);
                AnonymousClass0fD.A0A(-1321027826, A03);
            }
        }
        InstagramMainActivity.A0O(this.A00, this.A01);
        AnonymousClass0fD.A0A(-225230467, A032);
        AnonymousClass0fD.A0A(-1321027826, A03);
    }
}
