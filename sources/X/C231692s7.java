package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.2s7  reason: invalid class name and case insensitive filesystem */
public final class C231692s7 extends C231632rz {
    public AnonymousClass2xS A00;
    public C229802oH A01;
    public final Context A02;
    public final Handler A03 = new Handler(Looper.getMainLooper());
    public final C231702s8 A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final C228412ld A07;
    public final C229332nD A08;
    public final C229182my A09;

    public C231692s7(Context context, AnonymousClass0iw r4, UserSession userSession, C228412ld r6, C229332nD r7, C229182my r8) {
        0qQ.A0B(context, 1);
        0qQ.A0B(r7, 4);
        0qQ.A0B(r8, 5);
        0qQ.A0B(r6, 6);
        this.A02 = context;
        this.A06 = userSession;
        this.A05 = r4;
        this.A08 = r7;
        this.A09 = r8;
        this.A07 = r6;
        this.A04 = new C231702s8(r4, userSession);
    }

    public final String getBinderGroupName() {
        return "ClipsNetego";
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        return ((AnonymousClass3Y6) obj).getId().hashCode();
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        C229802oH r0;
        Object obj3 = obj;
        Object obj4 = obj2;
        int A032 = AnonymousClass0fD.A03(-123916424);
        View view2 = view;
        0qQ.A0B(view2, 1);
        0qQ.A0B(obj3, 2);
        0qQ.A0B(obj4, 3);
        AnonymousClass3Y6 r7 = (AnonymousClass3Y6) obj3;
        Context context = this.A02;
        UserSession userSession = this.A06;
        AnonymousClass0iw r14 = this.A05;
        Object tag = view2.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.mainfeed.clips.ClipsNetegoViewHolder");
        C229332nD r6 = this.A08;
        C231702s8 r5 = this.A04;
        Handler handler = this.A03;
        0qQ.A0B(r7, 0);
        C292805jY r1 = new C292805jY(r7.A06, r7.A09, r7.A0A, r7.A0M.size());
        C254133rz r22 = (C254133rz) tag;
        AnonymousClass0iw r15 = r14;
        Handler handler2 = handler;
        C231702s8 r142 = r5;
        Context context2 = context;
        AnonymousClass4CB.A01(context2, handler2, r142, r15, userSession, r7, (C292795jX) obj4, this.A00, r6, r1, r22);
        if (r7.A0P && (r0 = this.A01) != null) {
            r0.EBq(view2, (AnonymousClass3O9) obj3);
        }
        AnonymousClass0fD.A0A(-1634940130, A032);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r8, Object obj, Object obj2) {
        C229802oH r0;
        AnonymousClass3Y6 r9 = (AnonymousClass3Y6) obj;
        C292795jX r10 = (C292795jX) obj2;
        0qQ.A0B(r8, 0);
        0qQ.A0B(r9, 1);
        0qQ.A0B(r10, 2);
        if (new C292805jY(r9.A06, r9.A09, r9.A0A, r9.A0M.size()).A00()) {
            r8.A7U(1);
        } else {
            r8.A7U(0);
        }
        if (r9.A0P && (r0 = this.A01) != null) {
            r0.A9R(r9, r10);
        }
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(1115493596);
        0qQ.A0B(viewGroup, 1);
        Context context = this.A02;
        UserSession userSession = this.A06;
        View A002 = AnonymousClass4CB.A00(context, viewGroup, this.A04, this.A05, userSession, this.A07, this.A08, this.A09);
        AnonymousClass0fD.A0A(1604633409, A032);
        return A002;
    }
}
