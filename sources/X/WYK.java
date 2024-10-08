package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.google.common.collect.ImmutableSet;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public final class WYK implements MVB {
    public C57962IjH A00;
    public C57815Igu A01;
    public 1Xj A02;
    public final C59608JQc A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final C15490Udf A06;
    public final C56029Hrb A07;
    public final boolean A08;
    public final Context A09;

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public final void A00(C247733gp r11) {
        int size;
        C15490Udf udf;
        HashSet hashSet;
        Integer num;
        Integer num2;
        if (r11 != null) {
            size = 1;
        } else {
            size = C13990Tnq.A0L(this.A06.A06.A00).size();
        }
        C310336ap r3 = new C310336ap();
        Context context = this.A09;
        Resources resources = context.getResources();
        boolean z = this.A08;
        int i = R.plurals.x_comments_deleted;
        if (z) {
            i = R.plurals.x_replies_deleted;
        }
        r3.A0D = DbY.A0d(resources, size, i);
        r3.A0G = AnonymousClass7TF.A0d(context.getResources(), 2131975851);
        r3.A0A = this;
        r3.A0L = true;
        r3.A06();
        DbY.A1N(r3);
        1Xj r0 = this.A02;
        if (r11 != null) {
            if (r0 != null) {
                hashSet = new HashSet();
                hashSet.add(r11);
                if (z) {
                    num2 = AnonymousClass05K.A0N;
                } else {
                    num2 = null;
                }
                udf = this.A06;
                udf.A06.A03.addAll(hashSet);
            } else {
                return;
            }
        } else if (r0 != null) {
            udf = this.A06;
            C18480VsW vsW = udf.A06;
            Wv0 wv0 = vsW.A00;
            hashSet = new HashSet(C13990Tnq.A0L(wv0));
            if (z) {
                num = AnonymousClass05K.A0N;
            } else {
                num = null;
            }
            vsW.A03.addAll(C13990Tnq.A0L(wv0));
            wv0.clear();
        } else {
            return;
        }
        this.A07.A01(AnonymousClass05K.A0C, num2, hashSet);
        1Xj r2 = this.A02;
        if (r2 != null) {
            this.A01 = I7G.A02(this.A03, this.A05, r2, hashSet);
        }
        1Xj r6 = this.A02;
        if (r6 != null) {
            ArrayList arrayList = A27.A00;
            UserSession userSession = this.A05;
            this.A00 = I7G.A01(this.A03, userSession, r6, this.A04.getModuleName(), hashSet, C48775Ejy.A00(userSession));
        }
        udf.A00();
    }

    public final void onButtonClick(View view) {
        Integer num;
        if (this.A08) {
            num = AnonymousClass05K.A0N;
        } else {
            num = null;
        }
        if (this.A02 != null) {
            C57962IjH ijH = this.A00;
            if (ijH != null && !ijH.A01) {
                ijH.A00 = true;
                I7G.A00.removeCallbacks(ijH);
            }
            C57815Igu igu = this.A01;
            if (igu != null && !igu.A00) {
                I7G.A00.removeCallbacks(igu);
            }
            C15490Udf udf = this.A06;
            C18480VsW vsW = udf.A06;
            Set set = vsW.A03;
            ImmutableSet A0L = C13990Tnq.A0L(set);
            Wv0 wv0 = vsW.A00;
            wv0.addAll(A0L);
            set.clear();
            this.A07.A01(AnonymousClass05K.A0N, num, C13990Tnq.A0L(wv0));
            1Xj r3 = this.A02;
            if (r3 != null) {
                I7G.A07(this.A03, r3, C13990Tnq.A0L(wv0), true);
            }
            this.A00 = null;
            this.A01 = null;
            udf.A00();
        }
    }

    public WYK(Context context, C59608JQc jQc, AnonymousClass0iw r4, UserSession userSession, 1Xj r6, C15490Udf udf, String str, boolean z) {
        C51972G9s.A1C(userSession, udf);
        this.A09 = context;
        this.A05 = userSession;
        this.A02 = r6;
        this.A06 = udf;
        this.A03 = jQc;
        this.A08 = z;
        this.A04 = r4;
        this.A07 = new C56029Hrb(r4, userSession, str);
    }
}
