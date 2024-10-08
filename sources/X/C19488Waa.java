package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Waa  reason: case insensitive filesystem */
public final class C19488Waa implements AnonymousClass6WJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ Reel A02;
    public final /* synthetic */ AnonymousClass3BQ A03;
    public final /* synthetic */ AnonymousClass32A A04;
    public final /* synthetic */ AnonymousClass3K2 A05;
    public final /* synthetic */ XC0 A06;
    public final /* synthetic */ ArrayList A07;
    public final /* synthetic */ ArrayList A08;
    public final /* synthetic */ List A09;

    public final void DaE(float f) {
    }

    public C19488Waa(FragmentActivity fragmentActivity, Reel reel, AnonymousClass3BQ r3, AnonymousClass32A r4, AnonymousClass3K2 r5, XC0 xc0, ArrayList arrayList, ArrayList arrayList2, List list, int i) {
        this.A04 = r4;
        this.A09 = list;
        this.A02 = reel;
        this.A07 = arrayList;
        this.A08 = arrayList2;
        this.A03 = r3;
        this.A00 = i;
        this.A05 = r5;
        this.A01 = fragmentActivity;
        this.A06 = xc0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.6Ye, java.lang.Object] */
    public final void Dfo(String str) {
        int i;
        AnonymousClass32A r3 = this.A04;
        Fragment B7p = r3.A0L.B7p();
        if (B7p == null || B7p.isAdded()) {
            if (r3.A0D != null) {
                r3.A0D = null;
            }
            if (r3.A04 == null) {
                UserSession userSession = r3.A0K;
                1OP r0 = 1OP.$redex_init_class;
                0qQ.A0B(userSession, 0);
                r3.A04 = new C315656kI(userSession);
            }
            1OP r02 = 1OP.$redex_init_class;
            ? obj = new Object();
            List list = this.A09;
            Reel reel = this.A02;
            String id = reel.getId();
            UserSession userSession2 = r3.A0K;
            obj.A02(userSession2, id, list);
            obj.A09(this.A07);
            obj.A0A(this.A08);
            obj.A03(this.A03);
            if (list.contains(reel)) {
                i = list.indexOf(reel);
            } else {
                i = 0;
            }
            obj.A00 = i;
            obj.A04(Integer.valueOf(this.A00));
            obj.A01(userSession2);
            obj.A05(this.A05.A0x);
            obj.A06(r3.A04.A02);
            obj.A03 = r3.A03;
            obj.A0K = r3.A0B;
            obj.A06 = r3.A08;
            String str2 = r3.A0C;
            if (str2 != null) {
                obj.A0N = str2;
            }
            AnonymousClass6UX r03 = r3.A05;
            if (r03 != null) {
                obj.A07(r03.A03);
            }
            Bundle A002 = obj.A00();
            FragmentActivity fragmentActivity = this.A01;
            AnonymousClass6W8.A01(fragmentActivity, A002, userSession2).A0C(fragmentActivity);
            this.A06.Ev3();
            return;
        }
        onCancel();
    }

    public final void onCancel() {
        this.A06.Ev3();
    }
}
