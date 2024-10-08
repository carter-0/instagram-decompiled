package X;

import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.EBr  reason: case insensitive filesystem */
public final class C47657EBr extends 1P0 {
    public final /* synthetic */ AnonymousClass440 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Map A02;

    public C47657EBr(AnonymousClass440 r1, String str, Map map) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = map;
    }

    public final void onFailInBackground(C268654dm r5) {
        int A03 = AnonymousClass0fD.A03(-892355843);
        AnonymousClass440.A00(this.A00, this.A01, this.A02);
        AnonymousClass0fD.A0A(1131201166, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1371420767);
        int A032 = AnonymousClass0fD.A03(-107315367);
        User user = ((DvP) obj).A00;
        if (user != null) {
            17h.A00(this.A00.A01).A01(user, true, false);
        }
        AnonymousClass440.A00(this.A00, this.A01, this.A02);
        AnonymousClass0fD.A0A(-1110410636, A032);
        AnonymousClass0fD.A0A(1684770415, A03);
    }
}
