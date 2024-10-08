package X;

import android.util.SparseArray;
import android.view.View;
import android.view.animation.Animation;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.6O1  reason: invalid class name */
public final class AnonymousClass6O1 implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SparseArray A01;
    public final /* synthetic */ Animation A02;
    public final /* synthetic */ AnonymousClass0iw A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C255773uh A05;
    public final /* synthetic */ C306886Nx A06;
    public final /* synthetic */ C317286n1 A07;
    public final /* synthetic */ C306866Nv A08;
    public final /* synthetic */ User A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ boolean A0C;

    public AnonymousClass6O1(SparseArray sparseArray, Animation animation, AnonymousClass0iw r3, UserSession userSession, C255773uh r5, C306886Nx r6, C317286n1 r7, C306866Nv r8, User user, String str, String str2, int i, boolean z) {
        this.A08 = r8;
        this.A02 = animation;
        this.A0C = z;
        this.A0A = str;
        this.A0B = str2;
        this.A07 = r7;
        this.A09 = user;
        this.A01 = sparseArray;
        this.A04 = userSession;
        this.A03 = r3;
        this.A00 = i;
        this.A06 = r6;
        this.A05 = r5;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void onClick(View view) {
        String str;
        int A052 = AnonymousClass0fD.A05(469946172);
        C306866Nv r3 = this.A08;
        View view2 = r3.A05;
        view2.clearAnimation();
        view2.startAnimation(this.A02);
        if (this.A0C) {
            str = this.A0A;
        } else {
            str = this.A0B;
        }
        C317286n1 r2 = this.A07;
        if (r2 != null) {
            User user = this.A09;
            String id = user.getId();
            ImageUrl Bh3 = user.Bh3();
            int i = r3.A00;
            r2.DpG(this.A01, r3.A0D, Bh3, id, str, 0, i);
        }
        UserSession userSession = this.A04;
        AnonymousClass0iw r32 = this.A03;
        int i2 = this.A00;
        String id2 = this.A09.getId();
        C306876Nw r0 = (C306876Nw) this.A06;
        String str2 = r0.A09;
        String str3 = r0.A0E;
        0qQ.A0B(str2, 4);
        String moduleName = r32.getModuleName();
        0qQ.A0B(moduleName, 3);
        String str4 = "";
        if (str3 != null) {
            str4 = str3;
        }
        0wc r33 = new C230012om(r32, userSession).A01;
        0Aj A002 = r33.A00(r33.A00, "recommended_username_tapped_unconfirmed");
        A002.AAJ("container_module", moduleName);
        A002.A9F("position", Long.valueOf((long) i2));
        A002.AAJ("view_module", "su_stories");
        A002.AAJ("target_id", id2);
        A002.AAJ("algorithm", str2);
        A002.AAJ("impression_uuid", str4);
        A002.Cgf();
        AnonymousClass0fD.A0C(1517940337, A052);
    }
}
