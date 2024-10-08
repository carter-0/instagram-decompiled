package X;

import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.OnLifecycleEvent;

/* renamed from: X.LZk  reason: case insensitive filesystem */
public final class C64310LZk implements AnonymousClass07Y {
    public static final /* synthetic */ AnonymousClass0YZ[] A0E;
    public final FragmentActivity A00;
    public final 2cs A01;
    public final C46362Dde A02;
    public final C46362Dde A03;
    public final C46362Dde A04;
    public final C46362Dde A05;
    public final C63656L1s A06;
    public final AnonymousClass57X A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09 = AnonymousClass0eN.A01(MML.A00(this, 12));
    public final AnonymousClass0eM A0A = AnonymousClass0eN.A01(MML.A00(this, 13));
    public final C71392co A0B;
    public final C64433Lbo A0C;
    public final C46362Dde A0D;

    public C64310LZk(FragmentActivity fragmentActivity, AnonymousClass57X r6) {
        0qQ.A0B(r6, 1);
        this.A07 = r6;
        this.A00 = fragmentActivity;
        C71392co A042 = C71392co.A04(80.0d, 7.0d);
        this.A0B = A042;
        2cs A0J = AnonymousClass7TF.A0J();
        A0J.A09(A042);
        this.A01 = A0J;
        this.A05 = new C46362Dde(fragmentActivity, MML.A00(this, 11));
        this.A08 = AnonymousClass0eN.A01(MML.A00(this, 9));
        this.A06 = new C63656L1s(this);
        this.A0D = new C46362Dde(fragmentActivity, MML.A00(this, 14));
        this.A04 = new C46362Dde(fragmentActivity, MML.A00(this, 10));
        this.A02 = new C46362Dde(fragmentActivity, MML.A00(this, 7));
        this.A03 = new C46362Dde(fragmentActivity, MML.A00(this, 8));
        this.A0C = new C64433Lbo(this, 2);
    }

    static {
        Class<C64310LZk> cls = C64310LZk.class;
        A0E = new AnonymousClass0YZ[]{new 01B(cls, "parent", "getParent()Landroid/view/View;", 0), new 01B(cls, "view", "getView()Landroid/view/View;", 0), new 01B(cls, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, "getIcon()Lcom/instagram/common/ui/base/IgSimpleImageView;", 0), new 01B(cls, "content", "getContent()Lcom/instagram/common/ui/base/IgTextView;", 0), new 01B(cls, "dismissButton", "getDismissButton()Landroid/view/View;", 0)};
    }

    public static final View A00(C64310LZk lZk) {
        return (View) lZk.A0D.A03(lZk, A0E[1]);
    }

    @OnLifecycleEvent(07T.ON_CREATE)
    public final void onCreate() {
        this.A01.A0A(this.A0C);
        AnonymousClass57X r5 = this.A07;
        2Fk r2 = r5.A06;
        FragmentActivity fragmentActivity = this.A00;
        DbV.A1F(fragmentActivity, r2, new MP7(this, 7), 20);
        DbV.A1F(fragmentActivity, r5.A05, new MP7(this, 8), 20);
    }

    @OnLifecycleEvent(07T.ON_DESTROY)
    public final void onDestroy() {
        this.A01.A0B(this.A0C);
    }
}
