package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

public final class H5A extends C14097Tpp {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C57258IUt A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ AnonymousClass4EZ A04;

    public final int E2z() {
        return 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H5A(Context context, C57258IUt iUt, AnonymousClass0iw r3, C307786Rm r4, C276544tV r5, UserSession userSession, AnonymousClass4EZ r7) {
        super(r4, r5);
        this.A04 = r7;
        this.A00 = context;
        this.A01 = iUt;
        this.A03 = userSession;
        this.A02 = r3;
    }

    public final View A0J(Context context) {
        return this.A04.A04(this.A00, (ViewGroup) null);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.2rR, java.lang.Object, X.LrO] */
    /* JADX WARNING: type inference failed for: r13v0, types: [X.2s5, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object A0K(View view, C307786Rm r23, C276544tV r24, Object obj) {
        1Xj r3;
        C57258IUt iUt = this.A01;
        C252233om r0 = iUt.A06;
        C307786Rm r2 = r23;
        C308206Td.A0J(r2, r0);
        C308206Td.A0I(r2, r0);
        C276994uF r02 = (C276994uF) C276544tV.A00(r24, 44);
        if (r02 == null || (r3 = r02.A00) == null) {
            1Kn.A02("IgFeedVideoBinderUtils", "Media alien object has no media");
            return null;
        }
        Context context = this.A00;
        UserSession userSession = this.A03;
        AnonymousClass4EZ r6 = this.A04;
        AnonymousClass0iw r1 = this.A02;
        2el A0D = C308206Td.A0D(r2);
        if (iUt.A02 != null && iUt.A00 != null) {
            return null;
        }
        View view2 = view;
        AnonymousClass4EA r10 = (AnonymousClass4EA) view2.getTag();
        if (r10 == null) {
            r10 = r6.A06(view2, r1);
        }
        iUt.A00 = r10;
        ? obj2 = new Object();
        obj2.A00 = r3;
        AnonymousClass4DU r7 = iUt.A07;
        iUt.A02 = new AnonymousClass2xS(context, userSession, r7, obj2);
        AnonymousClass3W1 A18 = G9t.A18(r3);
        A18.A0D(0);
        iUt.A01 = A18;
        Context context2 = context;
        C246613et A002 = new C245813dW(userSession, new Object(), iUt, 0Pl.A04(context, userSession), (C249763kK) null).A00(context2, r3, r7, A18, iUt.A02);
        int position = A18.getPosition();
        int A032 = AnonymousClass0fD.A03(-1909690864);
        0qQ.A0B(r7, 3);
        r6.A07(r7, (AnonymousClass4JV) null, A002, r10, position, true);
        AnonymousClass0fD.A0A(-471273016, A032);
        iUt.A02.A07(r3, r10, A18);
        C232722uK r4 = iUt.A02.A0G;
        r4.A0P.add(iUt);
        r4.A0R.add(iUt);
        AnonymousClass30Y A0a = DbU.A0a(new WUA(r3, r10, A18, iUt.A02), AnonymousClass30Y.A00(r3, A18, r3.getId()));
        if (A0D == null) {
            return null;
        }
        A0D.A05(r10.A0T, A0a);
        return null;
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r5, C276544tV r6, Object obj, Object obj2) {
        AnonymousClass4EA r0;
        C57258IUt iUt = this.A01;
        C308206Td.A0J(r5, iUt.A06);
        AnonymousClass2xS r02 = iUt.A02;
        if (r02 != null) {
            r02.A0G.A0R.remove(iUt);
        }
        2el A0D = C308206Td.A0D(r5);
        if (A0D != null && (r0 = iUt.A00) != null) {
            A0D.A04(r0.A0T);
        }
    }

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        return A0J(context);
    }
}
