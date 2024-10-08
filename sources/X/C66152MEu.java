package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.controller.helper.ClipsDirectSendHelper$sendVideoToDirect$2;
import java.util.List;

/* renamed from: X.MEu  reason: case insensitive filesystem */
public final class C66152MEu extends AnonymousClass1Ek implements 0sL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66152MEu(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, AnonymousClass4D7 r9, int i) {
        super(2, r9);
        this.A00 = i;
        this.A02 = obj;
        this.A04 = obj2;
        this.A06 = obj3;
        this.A05 = obj4;
        this.A03 = obj5;
        this.A01 = obj6;
        this.A07 = str;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.MEu, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r12) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        String str;
        Object obj6;
        Object obj7;
        int i;
        AnonymousClass4D7 r8 = r12;
        if (this.A00 != 0) {
            obj3 = this.A02;
            obj5 = this.A04;
            obj2 = this.A06;
            obj4 = this.A05;
            obj7 = this.A03;
            obj6 = this.A01;
            str = this.A07;
            i = 1;
        } else {
            obj2 = this.A06;
            obj3 = this.A02;
            obj4 = this.A05;
            obj5 = this.A04;
            str = this.A07;
            obj6 = this.A01;
            obj7 = this.A03;
            i = 0;
        }
        return new C66152MEu(obj3, obj5, obj2, obj4, obj7, obj6, str, r8, i);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.A00 != 0) {
            0eS.A00(obj);
            Context context = (Context) this.A02;
            FragmentActivity fragmentActivity = (FragmentActivity) this.A04;
            UserSession userSession = ((C60114Jfv) this.A06).A00;
            AnonymousClass3Q2 r7 = (AnonymousClass3Q2) this.A05;
            List list = (List) this.A03;
            C293505kq r6 = (C293505kq) this.A01;
            String str = this.A07;
            C51973G9u.A1E(context, fragmentActivity, userSession);
            0qQ.A0B(r7, 3);
            AnonymousClass7TG.A1S(list, r6);
            AnonymousClass7TE.A1Z(new ClipsDirectSendHelper$sendVideoToDirect$2(context, fragmentActivity, userSession, r6, r7, (String) null, str, list, (AnonymousClass4D7) null, false, true), 19E.A02(AnonymousClass12T.A00.AOJ(653905865, 3)));
        } else {
            0eS.A00(obj);
            C59963JcW jcW = (C59963JcW) this.A06;
            Context context2 = (Context) this.A02;
            jcW.A08(context2, (C353838Jj) this.A04, (AnonymousClass3Q2) this.A05, this.A07);
            boolean z = jcW.A0S;
            LIb.A00(context2, jcW.A09, (C3499582p) this.A01, (C273514mi) this.A03, z);
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C66152MEu) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
