package X;

import android.content.Context;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

public final class UsO extends PR9 {
    public final Context A00;
    public final CompoundButton.OnCheckedChangeListener A01;
    public final CompoundButton.OnCheckedChangeListener A02;
    public final Fragment A03;
    public final UserSession A04;
    public final C49882FBg A05;
    public final String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsO(Context context, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, Fragment fragment, UserSession userSession, C49882FBg fBg, CharSequence charSequence, String str, boolean z) {
        super((CompoundButton.OnCheckedChangeListener) null, charSequence, z);
        C51974G9v.A1P(context, userSession, fragment, fBg);
        0qQ.A0B(charSequence, 6);
        this.A00 = context;
        this.A04 = userSession;
        this.A03 = fragment;
        this.A05 = fBg;
        this.A06 = str;
        this.A01 = onCheckedChangeListener;
        C18921WCy wCy = new C18921WCy(this, 3);
        this.A02 = wCy;
        this.A08 = wCy;
    }
}
