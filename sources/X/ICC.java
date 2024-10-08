package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

public final class ICC implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public ICC(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A03 = obj3;
        this.A04 = str;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void onClick(View view) {
        int i;
        int i2;
        0sL r0;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A05(-833715746);
                C56044Hrt A0C = C250563lf.A0C(28D.A1f);
                A0C.A0a = this.A04;
                A0C.A0n = true;
                A0C.A0p = true;
                A0C.A0o = true;
                A0C.A0w = true;
                Bundle A002 = A0C.A00();
                AnonymousClass6W8 A022 = AnonymousClass6W8.A02((Activity) this.A01, A002, (0lg) this.A03, TransparentModalActivity.class, "clips_camera");
                A022.A07();
                A022.A0C((Context) this.A02);
                i2 = 1626298824;
                break;
            case 1:
                i = AnonymousClass0fD.A05(-368599615);
                C55729HmQ hmQ = (C55729HmQ) this.A01;
                C61045Jvj jvj = (C61045Jvj) this.A02;
                String str = jvj.A03;
                String str2 = jvj.A04;
                if (!182.A06(0Tu.A05, hmQ.A02, 36327816937159390L) || str == null || str2 == null) {
                    str = jvj.A07;
                    str2 = jvj.A02;
                    if (str2 != null) {
                        r0 = hmQ.A00;
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    r0 = hmQ.A01;
                }
                if (r0 != null) {
                    r0.invoke(str, str2);
                }
                UserSession userSession = ((C56533I0e) this.A03).A00;
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(C56533I0e.A02, userSession), "ig_rights_management_media_notice_click");
                if (A0e.isSampled()) {
                    A0e.A9F("ig_user_id", DbV.A0q(userSession.A06));
                    A0e.A9F("media_igid", DbV.A0q(this.A04));
                    A0e.Cgf();
                }
                i2 = 580518634;
                break;
            case 2:
                i = AnonymousClass0fD.A05(-1018122958);
                N4t B8A = ((JOK) this.A01).B8A();
                if (B8A != null) {
                    Object obj = this.A03;
                    String str3 = this.A04;
                    0qQ.A0A(str3);
                    JSy jSy = (JSy) this.A02;
                    AnonymousClass7TE.A1Z(new C66174MGl((Object) jSy, obj, str3, (AnonymousClass4D7) null, 48), DbW.A0E(jSy));
                    0qQ.A0A(str3);
                    jSy.DbZ(B8A, str3);
                    i2 = 1236538758;
                    break;
                } else {
                    i2 = -292689364;
                    break;
                }
            case 3:
                i = AnonymousClass0fD.A05(1971542574);
                ((GHU) this.A03).A07.DzA((C52058GDe) this.A01, (1Xj) this.A02, this.A04);
                i2 = -2064762024;
                break;
            case 4:
                i = AnonymousClass0fD.A05(1420223093);
                UserSession userSession2 = (UserSession) this.A03;
                String str4 = this.A04;
                1NY A0a = AnonymousClass7TG.A0a(userSession2);
                A0a.A0A("clips/restore_original_audio_attribution/");
                A0a.A9m("clips_media_id", str4);
                1OC A0S = DbU.A0S(A0a, C54055Gye.class, C56249HvG.class);
                H51.A00(A0S, (FragmentActivity) this.A01, userSession2, 27);
                ((AnonymousClass4DH) this.A02).schedule(A0S);
                i2 = -131463295;
                break;
            default:
                return;
        }
        AnonymousClass0fD.A0C(i2, i);
    }
}
