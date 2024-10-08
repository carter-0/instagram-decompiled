package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

public final class LBK {
    public final Activity A00;
    public final Context A01;
    public final Fragment A02;
    public final AnonymousClass818 A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final ImageUrl A06;
    public final C363008it A07;
    public final C66461MSp A08;
    public final FBQ A09;
    public final LBI A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;

    public LBK(Activity activity, Context context, Fragment fragment, AnonymousClass818 r4, AnonymousClass0iw r5, UserSession userSession, ImageUrl imageUrl, C363008it r8, C66461MSp mSp, FBQ fbq, LBI lbi, String str, String str2, List list) {
        this.A00 = activity;
        this.A05 = userSession;
        this.A03 = r4;
        this.A08 = mSp;
        this.A04 = r5;
        this.A07 = r8;
        this.A0B = str;
        this.A0C = str2;
        this.A01 = context;
        this.A02 = fragment;
        this.A09 = fbq;
        this.A0A = lbi;
        this.A0D = list;
        this.A06 = imageUrl;
    }
}
