package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.GraphGuardianContentImpl;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6wK  reason: invalid class name and case insensitive filesystem */
public abstract class C322736wK implements AnonymousClass2rX {
    public GraphGuardianContentImpl A00;
    public boolean A01;
    public final C273674n0 A02;
    public final C322186vO A03;
    public final C322706wH A04;
    public final C294255m9 A05;
    public final UserDetailFragment A06;
    public final List A07 = new ArrayList();
    public final boolean A08;

    public C322736wK(Context context, UserSession userSession, C322186vO r5, AnonymousClass4DU r6, C322706wH r7, C294255m9 r8, UserDetailFragment userDetailFragment, AnonymousClass32Q r10, Integer num, boolean z) {
        0qQ.A0B(r10, 9);
        this.A06 = userDetailFragment;
        this.A05 = r8;
        this.A03 = r5;
        this.A04 = r7;
        this.A08 = z;
        this.A02 = new C273674n0(new C324266yu(context, r6, userSession), r10, num);
    }

    public static final void A00(C322736wK r1) {
        for (AnonymousClass729 A002 : r1.A07) {
            A002.A00();
        }
    }

    public C49588Eyx A02() {
        String str;
        17M r2;
        if ((this instanceof C322726wJ) || (this instanceof C322746wL) || !(this instanceof C322756wM)) {
            return null;
        }
        C322756wM r5 = (C322756wM) this;
        UserSession userSession = r5.A03;
        if (!182.A06(0Tu.A05, userSession, 36315894107868825L)) {
            return null;
        }
        String str2 = userSession.A06;
        C322486vu r3 = r5.A04.A02.A0P;
        User user = r3.A0J;
        if (user != null) {
            str = user.getId();
        } else {
            str = null;
        }
        if (0qQ.A0K(str2, str)) {
            return null;
        }
        User user2 = r3.A0J;
        if (user2 != null) {
            r2 = user2.A02;
        } else {
            r2 = null;
        }
        if (r2 != 17M.A03) {
            return null;
        }
        FragmentActivity fragmentActivity = r5.A00;
        String string = fragmentActivity.getString(2131961992);
        0qQ.A07(string);
        User user3 = r3.A0J;
        if (user3 != null) {
            String string2 = fragmentActivity.getString(2131961991, new Object[]{user3.getUsername()});
            0qQ.A07(string2);
            return new C49588Eyx(new FLS(r5), string, string2, fragmentActivity.getString(2131962041));
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C3253572b A03() {
        C3253572b r4;
        String str;
        C322776wO fmZ;
        C322776wO fmX;
        boolean z;
        Context context;
        int i;
        if (this instanceof C322726wJ) {
            C322726wJ r2 = (C322726wJ) this;
            r4 = new C3253572b();
            if (r2.A08) {
                r4.A02 = R.drawable.empty_state_plus;
                UserSession userSession = r2.A01;
                0Tu r5 = 0Tu.A05;
                int A012 = (int) 182.A01(r5, userSession, 36599611057573470L);
                if (A012 == 1) {
                    context = r2.A00;
                    i = 2131973061;
                    r4.A0D = context.getString(i);
                    r4.A0C = context.getString(2131973059);
                    r4.A0K = true;
                    r4.A0I = true;
                    z = true;
                } else if (A012 != 2) {
                    context = r2.A00;
                    if (A012 != 3) {
                        r4.A0D = context.getString(2131973060);
                        r4.A07 = context.getString(2131973057);
                        r4.A0C = context.getString(2131973058);
                        z = false;
                    } else {
                        i = 2131973063;
                        r4.A0D = context.getString(i);
                        r4.A0C = context.getString(2131973059);
                        r4.A0K = true;
                        r4.A0I = true;
                        z = true;
                    }
                } else {
                    Context context2 = r2.A00;
                    r4.A0D = context2.getString(2131973062);
                    r4.A0C = context2.getString(2131973059);
                    r4.A0K = true;
                    r4.A0I = true;
                    r4.A0J = 182.A06(r5, userSession, 36318136081717134L);
                    z = true;
                }
                fmX = new C46384De3(r2, z);
            } else {
                r4.A02 = R.drawable.empty_state_camera;
                str = r2.A00.getString(2131968412);
                r4.A0D = str;
                return r4;
            }
        } else if (this instanceof C322746wL) {
            C322746wL r52 = (C322746wL) this;
            r4 = new C3253572b();
            r4.A02 = R.drawable.empty_state_tag;
            if (r52.A08) {
                boolean A062 = 182.A06(0Tu.A05, r52.A01, 36318136080996228L);
                Context context3 = r52.A00;
                Resources resources = context3.getResources();
                if (A062) {
                    r4.A0D = resources.getString(2131969695);
                    r4.A0K = true;
                    r4.A0I = true;
                    r4.A0C = context3.getResources().getString(2131960851);
                    fmX = new C50984FmX(r52);
                } else {
                    r4.A0D = resources.getString(2131969431);
                    r4.A07 = context3.getResources().getString(2131969432);
                    return r4;
                }
            } else {
                str = r52.A00.getResources().getString(2131969444);
                r4.A0D = str;
                return r4;
            }
        } else if (!(this instanceof C322756wM)) {
            return null;
        } else {
            C322756wM r6 = (C322756wM) this;
            User user = r6.A04.A02.A0P.A0J;
            r4 = null;
            if (user != null) {
                if (0qQ.A0K(user.getId(), r6.A03.A06)) {
                    return r6.A04;
                }
                17M r22 = user.A02;
                17M r1 = 17M.A06;
                C3253572b r42 = new C3253572b();
                r42.A02 = R.drawable.instagram_crown_outline_96;
                if (r22 == r1) {
                    r42.A0B = 2131962045;
                    r42.A07 = r6.A00.getResources().getString(2131962044, new Object[]{user.getUsername()});
                    fmZ = new C50983FmW(r6);
                } else {
                    FragmentActivity fragmentActivity = r6.A00;
                    r42.A0D = fragmentActivity.getResources().getString(2131962028);
                    r42.A07 = fragmentActivity.getResources().getString(2131962027, new Object[]{user.getUsername()});
                    r42.A0C = fragmentActivity.getResources().getString(2131962026);
                    fmZ = new C50986FmZ(r6, user);
                }
                r42.A06 = fmZ;
                return r42;
            }
            return r4;
        }
        r4.A06 = fmX;
        return r4;
    }

    public final Iterator Eaa(C228382la r2) {
        return this.A02.Eaa(r2);
    }
}
