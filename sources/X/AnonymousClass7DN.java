package X;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7DN  reason: invalid class name */
public final class AnonymousClass7DN implements AnonymousClass7D2 {
    public final C333017Xi A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public AnonymousClass7DN(AnonymousClass0iw r2, UserSession userSession, C333017Xi r4) {
        0qQ.A0B(r2, 3);
        this.A00 = r4;
        this.A02 = userSession;
        this.A01 = r2;
    }

    /* renamed from: A00 */
    public final void ADp(AnonymousClass7EX r6, N8M n8m) {
        0qQ.A0B(r6, 0);
        if (n8m != null) {
            UserSession userSession = this.A02;
            AnonymousClass0iw r3 = this.A01;
            C252063oV r2 = r6.A00;
            r2.setVisibility(0);
            ImageView imageView = (ImageView) r2.getView();
            imageView.setBackgroundColor(n8m.A00);
            imageView.setImageTintList(ColorStateList.valueOf(n8m.A01));
            AnonymousClass0fU.A00(new C71351Oj1(r3, userSession, r6, n8m), r2.getView());
        }
    }

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.clips_stacks_shortcut_stub, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.ViewStub");
        return new AnonymousClass7EX(2b1.A01(inflate, false, false), this.A00);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r3) {
        AnonymousClass7EX r32 = (AnonymousClass7EX) r3;
        0qQ.A0B(r32, 0);
        C252063oV r1 = r32.A00;
        r1.setVisibility(8);
        if (r1.CVM()) {
            r1.getView().setOnClickListener((View.OnClickListener) null);
        }
    }
}
