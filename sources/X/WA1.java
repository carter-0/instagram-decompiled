package X;

import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public final class WA1 implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public WA1(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.A00 = i2;
        this.A02 = obj2;
        this.A03 = obj;
        this.A04 = obj3;
        this.A01 = i;
    }

    public final void onClick(View view) {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A05(2113491185);
                ((X8Q) this.A02).DKZ((UNB) ((List) this.A04).get(this.A01), (N3M) this.A03);
                i2 = 577616332;
                break;
            case 1:
                i = AnonymousClass0fD.A05(995718032);
                UA2 ua2 = (UA2) this.A04;
                C230062or r6 = ua2.A03;
                int i3 = this.A01;
                User user = (User) this.A03;
                String id = user.getId();
                DdQ.A00(r6.A01, r6.A02, id, i3);
                AnonymousClass7TE.A1Z(new MH0((Object) user, (Object) r6, (AnonymousClass4D7) null, 12), AnonymousClass07a.A00(r6.A00));
                UEI uei = (UEI) this.A02;
                FollowButton followButton = uei.A08;
                followButton.A0J.A03(ua2.A01, ua2.A02, user);
                uei.A02.setVisibility(8);
                followButton.setVisibility(0);
                WWQ wwq = ua2.A05;
                C230052oq r2 = r6.A03;
                QP6 qp6 = wwq.A01;
                String str = qp6.A05;
                if (str != null) {
                    VF8.A00(r2.A00, r2.A01, r2.A02, (Long) null, 1UQ.A0N.toString(), str, C273654mx.A00(644), qp6.A06);
                }
                i2 = -1903779034;
                break;
            case 2:
                i = AnonymousClass0fD.A05(-1522162127);
                UA2 ua22 = (UA2) this.A04;
                C230062or r5 = ua22.A03;
                int i4 = this.A01;
                User user2 = (User) this.A03;
                String id2 = user2.getId();
                DdQ.A01(r5.A01, r5.A02, id2, i4);
                AnonymousClass7TE.A1Z(new MH0((Object) user2, (Object) r5, (AnonymousClass4D7) null, 13), AnonymousClass07a.A00(r5.A00));
                int bindingAdapterPosition = ((C249703kE) this.A02).getBindingAdapterPosition();
                if (bindingAdapterPosition != -1) {
                    ua22.A06.remove(bindingAdapterPosition);
                    ua22.notifyItemRemoved(bindingAdapterPosition);
                }
                if (ua22.getItemCount() == 0) {
                    C16946VBy.A00(ua22.A04, 8, true);
                }
                WWQ wwq2 = ua22.A05;
                C230052oq r62 = r5.A03;
                QP6 qp62 = wwq2.A01;
                String str2 = qp62.A05;
                if (str2 != null && r62.A03.add(str2)) {
                    0Aj A0e = AnonymousClass7TE.A0e(r62.A01, C273654mx.A00(763));
                    if (A0e.isSampled()) {
                        A0e.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 1UQ.A0N.toString());
                        DbS.A1J(A0e, C273654mx.A00(645));
                        C51969G9p.A1A(A0e, r62.A00);
                        A0e.A9F("ig_userid", DbV.A0q(r62.A02.A06));
                        A0e.AAJ("netego_id", str2);
                        C51965G9l.A1L(A0e, qp62.A06);
                        A0e.Cgf();
                    }
                }
                i2 = 1129852009;
                break;
            default:
                C14625TzX tzX = (C14625TzX) this.A02;
                int i5 = this.A01;
                C255773uh r4 = (C255773uh) this.A03;
                tzX.A0A.A00(false);
                tzX.A08(i5, false);
                W0E A002 = C14639Tzl.A00(tzX.A07);
                A002.A02(r4, "viewers_icon_from_dashboard");
                String str3 = r4.A0j;
                A002.A03(str3);
                ArrayList A022 = C14625TzX.A02((C14629Tzb) this.A04, tzX);
                0qQ.A0B(str3, 0);
                if (W0E.A00(A002, str3) != null) {
                    A002.A00 = A022;
                    A002.A01 = true;
                    return;
                }
                return;
        }
        AnonymousClass0fD.A0C(i2, i);
    }
}
