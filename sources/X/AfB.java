package X;

import com.instagram.common.session.UserSession;

public final class AfB implements C337267fz {
    public 0sP A00;
    public final UserSession A01;
    public final AnonymousClass4D6 A02;

    public final /* synthetic */ 1OC AMw(C15050ULg uLg, String str) {
        return A1E.A00(uLg, this, str);
    }

    public final 1OC AMx(String str, String str2) {
        0qQ.A0B(str, 0);
        UserSession userSession = this.A01;
        String substring = str.substring(1);
        0qQ.A07(substring);
        return A1D.A00(userSession, substring, "story_hashtag_tag_page");
    }

    public final /* synthetic */ void DeG(C15050ULg uLg) {
        AnonymousClass9V2.A02(uLg, this);
    }

    public final void DeH(String str) {
    }

    public final /* synthetic */ void DeJ(C15050ULg uLg, C268654dm r2) {
        AnonymousClass9V2.A01(uLg, r2, this);
    }

    public final void DeM(C268654dm r1, String str) {
    }

    public final /* synthetic */ void DeT(C15050ULg uLg) {
        AnonymousClass9V2.A03(uLg, this);
    }

    public final void DeW(String str) {
    }

    public final /* synthetic */ void Dej(C15050ULg uLg) {
        AnonymousClass9V2.A04(uLg, this);
    }

    public final void Dem(String str) {
    }

    public final /* synthetic */ void Der(C15050ULg uLg, AnonymousClass1XT r2) {
        AnonymousClass9V2.A00(uLg, r2, this);
    }

    public final /* synthetic */ void Dnw(boolean z) {
    }

    public final AnonymousClass4D6 Bpf() {
        return this.A02;
    }

    public final /* synthetic */ boolean Cch() {
        return false;
    }

    public final /* bridge */ /* synthetic */ void Dev(AnonymousClass1XT r3, String str) {
        CGW cgw = (CGW) r3;
        0qQ.A0B(cgw, 1);
        0sP r1 = this.A00;
        if (r1 != null) {
            r1.invoke(cgw.getItems());
        }
    }

    public AfB(UserSession userSession, AnonymousClass4D6 r2) {
        this.A02 = r2;
        this.A01 = userSession;
    }

    public final /* synthetic */ 1GP AMy(C15050ULg uLg, String str) {
        return null;
    }
}
