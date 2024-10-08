package X;

import android.content.DialogInterface;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.common.session.UserSession;

/* renamed from: X.AKl  reason: case insensitive filesystem */
public final class C39945AKl implements DialogInterface.OnClickListener {
    public final /* synthetic */ C52971GgO A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C247733gp A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public C39945AKl(C52971GgO ggO, UserSession userSession, C247733gp r3, String str, String str2, boolean z, boolean z2) {
        this.A05 = z;
        this.A00 = ggO;
        this.A02 = r3;
        this.A03 = str;
        this.A04 = str2;
        this.A06 = z2;
        this.A01 = userSession;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C52971GgO ggO;
        C262224Cq r0;
        0sL mgn;
        dialogInterface.dismiss();
        if (this.A05) {
            ggO = this.A00;
            ggO.A0e(this.A02.A0G, AnonymousClass000.A00(4142));
            String str = this.A03;
            String str2 = this.A04;
            MediaCommentListRepository mediaCommentListRepository = ggO.A0A;
            r0 = mediaCommentListRepository.A01;
            mgn = new C66178MGp(mediaCommentListRepository, str, str2, (String) null, (AnonymousClass4D7) null);
        } else if (this.A06) {
            AAQ.A00(this.A01, this.A02, "confirm_unhide");
            ggO = this.A00;
            String str3 = this.A03;
            String str4 = this.A04;
            MediaCommentListRepository mediaCommentListRepository2 = ggO.A0A;
            r0 = mediaCommentListRepository2.A01;
            mgn = new MGN((Object) mediaCommentListRepository2, str3, str4, (AnonymousClass4D7) null, 5);
        } else {
            return;
        }
        AnonymousClass7TE.A1Z(mgn, r0);
        ggO.A0O.Epw(new AnonymousClass9IK(AXZ.A00));
    }
}
