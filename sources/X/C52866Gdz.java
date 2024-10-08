package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Gdz  reason: case insensitive filesystem */
public final class C52866Gdz extends BaseAdapter {
    public Context A00;
    public AnonymousClass3TS A01;
    public UserSession A02;
    public C282555Dn A03;
    public C274134nl A04;
    public AnonymousClass4GA A05;
    public C279094y4 A06;
    public AnonymousClass4GF A07;
    public 1Xj A08;
    public AnonymousClass3W1 A09;
    public AnonymousClass2xS A0A;
    public Boolean A0B;
    public HashMap A0C;
    public HashMap A0D;
    public HashMap A0E;
    public List A0F;
    public final AnonymousClass4DU A0G;

    public final int getViewTypeCount() {
        return 3;
    }

    public final int getCount() {
        return this.A0F.size();
    }

    public final Object getItem(int i) {
        return this.A0F.get(i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        Object A002;
        int i2 = i;
        View view2 = view;
        if (view == null) {
            ViewGroup viewGroup2 = viewGroup;
            if (getItemViewType(i2) != 1) {
                AnonymousClass4GF r7 = this.A07;
                Context context = this.A00;
                0qQ.A0B(context, 0);
                view2 = DbU.A0A(LayoutInflater.from(context), viewGroup2, R.layout.row_feed_carousel_media_video, false);
                A002 = AnonymousClass4GG.A00(context, view2, r7.A01, (ReboundViewPager) null, (AnonymousClass4G9) null);
            } else {
                AnonymousClass4GA r5 = this.A05;
                Context context2 = this.A00;
                0qQ.A0B(context2, 0);
                view2 = DbU.A0A(LayoutInflater.from(context2), viewGroup2, R.layout.row_feed_carousel_media_image, false);
                A002 = AnonymousClass4GB.A00(view2, r5.A00, (ReboundViewPager) null, (AnonymousClass4G9) null);
            }
            view2.setTag(A002);
        }
        if (getItemViewType(i2) != 1) {
            AnonymousClass3W1 r52 = this.A09;
            int i3 = r52.A02;
            List list = this.A0F;
            1Xj r3 = (1Xj) list.get(i3);
            C279094y4 r13 = this.A06;
            if (r13 == null) {
                r13 = new C279094y4(this.A02, this.A03, (0Pl) null);
                this.A06 = r13;
            }
            1Xj r15 = this.A08;
            AnonymousClass2xS r2 = this.A0A;
            AnonymousClass3TO A022 = r2.A02(r3);
            C245853da r19 = C245853da.HIDDEN;
            1Xj A0T = DbZ.A0T(list, i2);
            HashMap hashMap = this.A0D;
            HashMap hashMap2 = this.A0C;
            HashMap hashMap3 = this.A0E;
            Context context3 = this.A00;
            AnonymousClass4DU r9 = this.A0G;
            AnonymousClass3W1 r18 = r52;
            AnonymousClass4DU r17 = r9;
            C279104y5 A003 = r13.A00(context3, r15, A0T, r17, r18, r19, A022, (Float) null, (Integer) null, list, hashMap, hashMap2, hashMap3, i2, 0, true);
            AnonymousClass4GF r12 = this.A07;
            AnonymousClass3TS r132 = this.A01;
            C51974G9v.A1M(r52, r132, r9);
            AnonymousClass4GG r14 = AnonymousClass4GF.A06;
            Context context4 = r12.A00;
            UserSession userSession = r12.A01;
            boolean z = r12.A04;
            boolean z2 = r12.A05;
            Context context5 = context4;
            r14.A02(context5, view2, r132, userSession, r12.A02, A003, r12.A03, r9, r52, z, z2);
            if (i2 == i3) {
                Object tag = view2.getTag();
                tag.getClass();
                r2.A07(r3, (AnonymousClass3V3) tag, r52);
            }
            return view2;
        }
        List list2 = this.A0F;
        C275664qi BH3 = DbZ.A0T(list2, DbT.A02(list2, 1)).A0C.BH3();
        C274134nl r92 = this.A04;
        if (r92 == null) {
            r92 = new C274134nl(this.A02, this.A03, (0Pl) null);
            this.A04 = r92;
        }
        1Xj r11 = this.A08;
        AnonymousClass3W1 r133 = this.A09;
        boolean booleanValue = this.A0B.booleanValue();
        Context context6 = this.A00;
        AnonymousClass4DU r122 = this.A0G;
        HashMap hashMap4 = this.A0D;
        HashMap hashMap5 = hashMap4;
        List list3 = list2;
        C274154nn A004 = r92.A00(context6, r11, r122, r133, (Float) null, (Integer) null, list3, hashMap5, this.A0C, this.A0E, 0, i2, true, false, false, booleanValue);
        UserSession userSession2 = this.A02;
        C282555Dn r0 = this.A03;
        AnonymousClass4GA.A01.A02(context6, view2, BH3, userSession2, r0, r0, A004, r122, r122, r133);
        return view2;
    }

    public C52866Gdz(Context context, AnonymousClass3TS r9, UserSession userSession, C282555Dn r11, 1Xj r12, AnonymousClass4DU r13, AnonymousClass3W1 r14, AnonymousClass2xS r15, Boolean bool, HashMap hashMap, HashMap hashMap2, HashMap hashMap3, List list) {
        this.A00 = context;
        this.A08 = r12;
        this.A0G = r13;
        this.A0B = bool;
        this.A09 = r14;
        this.A05 = new AnonymousClass4GA(userSession);
        this.A07 = new AnonymousClass4GF(context, userSession, r11, r11, false, false);
        this.A0D = hashMap;
        this.A0C = hashMap2;
        this.A0E = hashMap3;
        this.A0F = list;
        this.A0A = r15;
        this.A03 = r11;
        this.A01 = r9;
        this.A02 = userSession;
    }

    public final long getItemId(int i) {
        String A1E = C51966G9m.A1E(getItem(i));
        A1E.getClass();
        return (long) A1E.hashCode();
    }

    public final int getItemViewType(int i) {
        if (((1Xj) getItem(i)).BR7() == 1iA.A0a) {
            return 2;
        }
        return 1;
    }
}
