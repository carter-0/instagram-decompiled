package X;

import android.widget.EditText;
import com.instagram.common.session.UserSession;

public final class AfA implements G9d {
    public EditText A00;
    public final C379049Sf A01;
    public final C337287g2 A02;
    public final UserSession A03;
    public final C14221Ts1 A04;

    public AfA(UserSession userSession, C379049Sf r9) {
        this.A01 = r9;
        this.A03 = userSession;
        AnonymousClass7g1 r4 = new AnonymousClass7g1();
        this.A02 = r4;
        this.A04 = C14225Ts5.A01((UserSession) null, (AnonymousClass4D6) null, (C337247fx) null, this, r4, AnonymousClass05K.A00, false);
    }

    public final /* synthetic */ 1OC AMw(C15050ULg uLg, String str) {
        return A1E.A00(uLg, this, str);
    }

    public final 1OC AMx(String str, String str2) {
        0qQ.A0B(str, 0);
        return A1D.A00(this.A01.A0C, str.substring(1), "story_hashtag_tag_page");
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

    public final void A00(EditText editText) {
        this.A00 = editText;
        String A002 = C39805AAc.A00(editText, false);
        if (A002 != null && A002.length() > 1 && A002.charAt(0) == '#') {
            this.A04.A06(A002);
        }
    }

    public final /* synthetic */ boolean Cch() {
        return false;
    }

    public final /* bridge */ /* synthetic */ void Dev(AnonymousClass1XT r3, String str) {
        CGW cgw = (CGW) r3;
        AnonymousClass7TG.A1N(str, cgw);
        EditText editText = this.A00;
        if (editText == null) {
            0qQ.A0F("editText");
            throw AnonymousClass00P.createAndThrow();
        }
        String A002 = C39805AAc.A00(editText, false);
        if (!cgw.getItems().isEmpty() && A002 != null && A002.length() != 0 && str.equals(A002)) {
            C379049Sf r0 = this.A01;
            r0.A0G.A00(cgw.getItems());
        }
    }

    public final /* synthetic */ 1GP AMy(C15050ULg uLg, String str) {
        return null;
    }
}
