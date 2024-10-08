package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

/* renamed from: X.Dm2  reason: case insensitive filesystem */
public final class C46826Dm2 extends 2Rw {
    public List A00;
    public List A01;
    public final Context A02;
    public final UserSession A03;

    public final void onBindViewHolder(C249703kE r4, int i) {
        String str;
        0qQ.A0B(r4, 0);
        if (r4 instanceof C46986Doe) {
            Drawable drawable = this.A02.getDrawable(R.drawable.profile_anonymous_user);
            if (drawable != null) {
                ((C46986Doe) r4).A03.setAvatarViewDrawable(drawable);
            }
            C46986Doe doe = (C46986Doe) r4;
            IgTextView igTextView = doe.A01;
            C53374Gn4 gn4 = (C53374Gn4) 00k.A0O(this.A00, i);
            String str2 = null;
            if (gn4 != null) {
                str = gn4.A03;
            } else {
                str = null;
            }
            igTextView.setText(str);
            IgTextView igTextView2 = doe.A00;
            C53374Gn4 gn42 = (C53374Gn4) 00k.A0O(this.A00, i);
            if (gn42 != null) {
                str2 = gn42.A04;
            }
            igTextView2.setText(str2);
            AnonymousClass0fU.A00(new FNH(this, i, 1), doe.A02);
        }
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C46986Doe(DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.directshare_row_user, false));
    }

    public C46826Dm2(Context context, UserSession userSession, List list) {
        AnonymousClass7TG.A1P(userSession, list);
        this.A03 = userSession;
        this.A02 = context;
        this.A01 = list;
        this.A00 = list;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(621207621);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(-1115573073, A032);
        return size;
    }
}
