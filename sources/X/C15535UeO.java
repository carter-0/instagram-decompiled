package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.follow.BlockButton;
import com.instagram.user.model.User;

/* renamed from: X.UeO  reason: case insensitive filesystem */
public final class C15535UeO extends C231632rz {
    public final Context A00;
    public final C15395Uby A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;

    public final void bindView(int i, View view, Object obj, Object obj2) {
        String fullName;
        int A032 = AnonymousClass0fD.A03(161155292);
        UserSession userSession = this.A03;
        AnonymousClass0iw r8 = this.A02;
        VZN vzn = (VZN) DbT.A0o(view);
        User user = (User) obj;
        boolean z = ((C66967Mg0) obj2).A0D;
        C15395Uby uby = this.A01;
        C51974G9v.A1O(userSession, r8, vzn, user);
        0qQ.A0B(uby, 5);
        DbU.A1S(r8, vzn.A03, user);
        TextView textView = vzn.A01;
        String B3O = user.A03.B3O();
        if (B3O == null || B3O.length() == 0) {
            fullName = user.getFullName();
        } else {
            fullName = user.A03.B3O();
        }
        textView.setText(fullName);
        TextView textView2 = vzn.A02;
        DbU.A1H(textView2, user);
        C244273av.A0B(textView2, user.isVerified());
        BlockButton blockButton = vzn.A04;
        if (!2R8.A04(userSession, user)) {
            blockButton.A00 = z;
            blockButton.setIsBlueButton(!z);
            blockButton.refreshDrawableState();
            blockButton.setVisibility(0);
            BlockButton.A02(blockButton, user);
            blockButton.setOnClickListener(new WBF(25, (Object) blockButton, (Object) uby, (Object) r8, (Object) user));
        } else {
            blockButton.setVisibility(8);
        }
        vzn.A00.setTag(vzn);
        AnonymousClass0fD.A0A(1931309176, A032);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C15535UeO(Context context, C15395Uby uby, AnonymousClass0iw r3, UserSession userSession) {
        this.A00 = context;
        this.A03 = userSession;
        this.A02 = r3;
        this.A01 = uby;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(-392205932);
        ViewGroup viewGroup2 = (ViewGroup) DbW.A09(LayoutInflater.from(this.A00), viewGroup, R.layout.row_search_user_with_block_button, false);
        viewGroup2.setTag(new VZN(viewGroup2));
        AnonymousClass0fD.A0A(-1574008362, A032);
        return viewGroup2;
    }
}
