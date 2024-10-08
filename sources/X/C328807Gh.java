package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;

/* renamed from: X.7Gh  reason: invalid class name and case insensitive filesystem */
public final class C328807Gh {
    public ImageUrl A00;
    public IgTextView A01;
    public StackedAvatarView A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public final Context A06;
    public final AnonymousClass4DH A07;
    public final UserSession A08;
    public final boolean A09;

    public C328807Gh(Context context, AnonymousClass4DH r3, UserSession userSession, String str) {
        0qQ.A0B(str, 4);
        this.A06 = context;
        this.A07 = r3;
        this.A08 = userSession;
        this.A09 = str.equals("follow_button");
    }
}
