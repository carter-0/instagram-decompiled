package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.LruCache;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.business.fragment.CategorySearchFragment;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Dj1  reason: case insensitive filesystem */
public final class C46672Dj1 extends Handler {
    public final int A00;
    public final Object A01;

    public C46672Dj1(C50423FbW fbW, int i) {
        this.A00 = i;
        this.A01 = fbW;
    }

    public final void handleMessage(Message message) {
        LruCache lruCache;
        1OC A06;
        List list;
        switch (this.A00) {
            case 0:
                0qQ.A0B(message, 0);
                if (message.what == 1) {
                    Object obj = message.obj;
                    DbS.A1Y(obj);
                    String str = (String) obj;
                    if (str.length() != 0) {
                        Fragment fragment = (CategorySearchFragment) this.A01;
                        CallerContext callerContext = CategorySearchFragment.A0U;
                        LruCache lruCache2 = FA3.A01;
                        AnonymousClass0wW r7 = fragment.A0A;
                        0qQ.A0A(r7);
                        Context requireContext = fragment.requireContext();
                        0gy A002 = AnonymousClass07i.A00(fragment);
                        boolean A03 = FG1.A03(fragment.A06);
                        C47674ECi eCi = new C47674ECi(fragment);
                        0qQ.A0B(r7, 0);
                        if (A03) {
                            lruCache = FA3.A02;
                        } else {
                            lruCache = FA3.A01;
                        }
                        Object obj2 = lruCache.get(str);
                        if (obj2 != null) {
                            eCi.onSuccess(obj2);
                            return;
                        }
                        C47689ECy eCy = new C47689ECy(eCi, str, A03);
                        2IS A04 = C41845B3m.A04();
                        A04.A04("query", str);
                        A04.A04("locale", AnonymousClass1Q2.A00());
                        A04.A01("filter_temp_deprecated_cat");
                        C239113Fa r2 = new C239113Fa(A04, C47077DqE.class, "CategoryTypeaheadQuery", false);
                        boolean z = r7 instanceof UserSession;
                        C239123Fb r0 = new C239123Fb(r7);
                        r0.A08(r2);
                        if (z) {
                            A06 = r0.A05();
                        } else {
                            A06 = r0.A06();
                        }
                        A06.A00 = eCy;
                        1ES.A00(requireContext, A002, A06);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (message.what == 1) {
                    String str2 = (String) message.obj;
                    if (!TextUtils.isEmpty(str2)) {
                        E6U e6u = (E6U) this.A01;
                        if (e6u.isVisible()) {
                            C239133Fc r1 = new C239133Fc(F60.class, "CityQuery", StringFormatUtil.formatStrLocaleSafe("{\"%s\":\"%s\"}", "0", str2), true);
                            C239123Fb A012 = C46479Dfi.A01(DbT.A0X(C227642jf.A02(e6u)));
                            A012.A09(r1);
                            Integer num = AnonymousClass05K.A00;
                            A012.A08 = AnonymousClass000.A00(65);
                            1OC A07 = A012.A07(num);
                            A07.A00 = new C47684ECt(e6u, str2);
                            e6u.schedule(A07);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                0qQ.A0B(message, 0);
                int i = message.what;
                if (i == 1) {
                    0nA.A0N(((C50423FbW) this.A01).A07);
                    return;
                } else if (i == 2) {
                    C50423FbW.A00((C50423FbW) this.A01);
                    return;
                } else {
                    return;
                }
            case 3:
                EEC eec = (EEC) this.A01;
                while (true) {
                    Deque deque = eec.A05;
                    if (!deque.isEmpty()) {
                        String str3 = (String) deque.removeFirst();
                        if (!(eec.A01 == null || str3 == null || (list = eec.A02) == null)) {
                            ArrayList A1C = AnonymousClass7TE.A1C();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                1OC A042 = FGQ.A04(eec.A00, 0mp.A06("friendships/%s/following/", new Object[]{DbT.A0k(it).getId()}), str3, "nux_follow_from_logged_in_accounts", (String) null);
                                A1C.add(A042);
                                A042.A00 = new EDL(eec, A042, str3, 9);
                                AnonymousClass4D6 r02 = eec.A04;
                                if (r02 != null) {
                                    r02.schedule(A042);
                                }
                            }
                            eec.A06.put(str3, A1C);
                        }
                    } else {
                        return;
                    }
                }
            case 4:
                super.handleMessage(message);
                if (message.what == 1) {
                    E3V.A01((E3V) this.A01);
                    return;
                }
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46672Dj1(Looper looper, Object obj, int i) {
        super(looper);
        this.A00 = i;
        this.A01 = obj;
    }
}
