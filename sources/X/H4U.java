package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class H4U extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public H4U(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.A00 = i;
        this.A02 = obj;
        this.A06 = obj4;
        this.A04 = obj7;
        this.A05 = obj6;
        this.A03 = obj5;
        this.A07 = obj3;
        this.A01 = obj2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x00af: MOVE  (r3v4 X.1Xj) = (r3v3 X.1Xj)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onFail(X.C268654dm r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x00c3;
                case 1: goto L_0x0045;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 2104301830(0x7d6d1906, float:1.969731E37)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r4 = r10.A04
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r2 = r10.A06
            com.instagram.save.model.SavedCollection r2 = (com.instagram.save.model.SavedCollection) r2
            java.lang.Object r1 = r10.A03
            com.instagram.save.model.SavedCollection r1 = (com.instagram.save.model.SavedCollection) r1
            java.lang.Object r0 = r10.A07
            X.0lg r0 = (X.0lg) r0
            X.1Ng r0 = X.AnonymousClass1Nd.A00(r0)
            X.I32.A02(r2, r1, r4)
            X.C57077INr.A00(r0, r1, r4)
            java.lang.Object r3 = r10.A02
            android.content.Context r3 = (android.content.Context) r3
            r0 = 10
            X.IVl r2 = new X.IVl
            r2.<init>(r10, r0)
            java.lang.Object r1 = X.AnonymousClass7TE.A13(r4)
            X.1Xj r1 = (X.1Xj) r1
            int r0 = r4.size()
            X.I6V.A03(r3, r1, r2, r0)
            r0 = -1493097759(0xffffffffa70122e1, float:-1.7921254E-15)
        L_0x0041:
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x0045:
            r0 = -547742876(0xffffffffdf5a1b64, float:-1.5716265E19)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r6 = 0
            X.0qQ.A0B(r11, r6)
            java.lang.Object r4 = r10.A03
            X.Cvu r4 = (X.C45414Cvu) r4
            boolean r8 = r11 instanceof X.C268674do
            if (r8 == 0) goto L_0x008d
            java.lang.Object r0 = r10.A02
            X.1P0 r0 = (X.1P0) r0
            if (r0 == 0) goto L_0x0061
            r0.onFail(r11)
        L_0x0061:
            java.lang.Object r7 = r10.A07
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            java.lang.Object r3 = r10.A05
            X.1Xo r3 = (X.AnonymousClass1Xo) r3
            X.2f5 r0 = X.C225892f5.A00(r7)
            boolean r0 = r0.A0O(r3)
            if (r0 == 0) goto L_0x00bc
            X.3Ym r1 = X.C243373Ym.SAVED
            r2 = r1
            X.3Ym r0 = X.C243373Ym.NOT_SAVED
            r9 = r0
        L_0x0079:
            X.C55116HcP.A00(r7, r1, r0, r3)
            java.lang.Object r1 = r10.A06
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x00a7
            boolean r0 = r3 instanceof X.AnonymousClass3ZL
            if (r0 == 0) goto L_0x008d
            X.3ZL r3 = (X.AnonymousClass3ZL) r3
            if (r3 == 0) goto L_0x008d
            X.G9w.A1L(r7, r3)
        L_0x008d:
            if (r8 == 0) goto L_0x009a
            java.lang.Object r0 = r10.A07
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2f5 r0 = X.C225892f5.A00(r0)
            r0.A0N(r4, r6)
        L_0x009a:
            java.lang.Object r0 = r10.A01
            X.JPV r0 = (X.JPV) r0
            if (r0 == 0) goto L_0x00a3
            r0.onFail(r11)
        L_0x00a3:
            r0 = -886611846(0xffffffffcb27607a, float:-1.096921E7)
            goto L_0x0041
        L_0x00a7:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x008d
            boolean r0 = r3 instanceof X.1Xj
            if (r0 == 0) goto L_0x008d
            X.1Xj r3 = (X.1Xj) r3
            if (r3 == 0) goto L_0x008d
            java.lang.Object r0 = r10.A04
            if (r0 != r2) goto L_0x00b8
            r2 = r9
        L_0x00b8:
            X.C54995HaS.A00(r7, r3, r2)
            goto L_0x008d
        L_0x00bc:
            X.3Ym r1 = X.C243373Ym.NOT_SAVED
            r9 = r1
            X.3Ym r0 = X.C243373Ym.SAVED
            r2 = r0
            goto L_0x0079
        L_0x00c3:
            r0 = 617729978(0x24d1cfba, float:9.0991204E-17)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r4 = r10.A04
            java.util.concurrent.atomic.AtomicBoolean r4 = (java.util.concurrent.atomic.AtomicBoolean) r4
            r0 = 1
            r4.set(r0)
            java.lang.Object r0 = r10.A06
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            int r0 = r0.decrementAndGet()
            if (r0 != 0) goto L_0x00fd
            java.lang.Object r0 = r10.A03
            X.F3H r0 = (X.F3H) r0
            r0.A00()
            java.lang.Object r3 = r10.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r10.A07
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r1 = r10.A02
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r0 = r4.get()
            if (r0 == 0) goto L_0x0102
            r1 = 2131957569(0x7f131741, float:1.9551726E38)
            java.lang.String r0 = "delete_media_all_stories_failed"
            X.C59689JTv.A0F(r3, r0, r1)
        L_0x00fd:
            r0 = -405545999(0xffffffffe7d3dbf1, float:-2.000953E24)
            goto L_0x0041
        L_0x0102:
            X.C49102EpR.A00(r3, r2, r1)
            goto L_0x00fd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H4U.onFail(X.4dm):void");
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032;
        int i;
        AnonymousClass3ZL r1;
        switch (this.A00) {
            case 0:
                A032 = AnonymousClass0fD.A03(2025841190);
                int A033 = AnonymousClass0fD.A03(-1096494881);
                ArrayList arrayList = (ArrayList) this.A02;
                arrayList.add(this.A05);
                if (((AtomicInteger) this.A06).decrementAndGet() == 0) {
                    ((F3H) this.A03).A00();
                    Context context = (Context) this.A01;
                    UserSession userSession = (UserSession) this.A07;
                    if (((AtomicBoolean) this.A04).get()) {
                        C59689JTv.A0F(context, "delete_media_all_stories_failed", 2131957569);
                    } else {
                        C49102EpR.A00(context, userSession, arrayList);
                    }
                }
                AnonymousClass0fD.A0A(2117818324, A033);
                i = -1150835163;
                break;
            case 1:
                A032 = AnonymousClass0fD.A03(-1051801739);
                AnonymousClass1XT r10 = (AnonymousClass1XT) obj;
                int A0D = AnonymousClass7TG.A0D(r10, 1541692578);
                UserSession userSession2 = (UserSession) this.A07;
                C225892f5.A00(userSession2).A0N((C45414Cvu) this.A03, true);
                1P0 r0 = (1P0) this.A02;
                if (r0 != null) {
                    r0.onSuccess(r10);
                }
                if (this.A06 == AnonymousClass05K.A01) {
                    AnonymousClass1Xo r12 = (AnonymousClass1Xo) this.A05;
                    if ((r12 instanceof AnonymousClass3ZL) && (r1 = (AnonymousClass3ZL) r12) != null) {
                        r1.EjB((C243373Ym) this.A04);
                        G9w.A1L(userSession2, r1);
                    }
                }
                JPV jpv = (JPV) this.A01;
                if (jpv != null) {
                    jpv.DoH(r10);
                }
                AnonymousClass0fD.A0A(2000184820, A0D);
                i = 944263056;
                break;
            default:
                A032 = AnonymousClass0fD.A03(-1598083248);
                int A034 = AnonymousClass0fD.A03(873365116);
                Context context2 = (Context) this.A02;
                List list = (List) this.A04;
                1Xj A0T = DbZ.A0T(list, 0);
                int size = list.size();
                AnonymousClass7TF.A1B(context2, 0, A0T);
                C310336ap A0a = DbS.A0a();
                A0a.A0D = context2.getResources().getQuantityString(R.plurals.save_home_bulk_edit_move_success_notification, size, C51968G9o.A1Z(((SavedCollection) this.A06).A0G, size));
                C51970G9q.A1L(A0T, A0a);
                Dbb.A1Q(A0a);
                Runnable runnable = (Runnable) this.A05;
                if (runnable != null) {
                    runnable.run();
                }
                AnonymousClass0fD.A0A(926108422, A034);
                i = -1586673246;
                break;
        }
        AnonymousClass0fD.A0A(i, A032);
    }
}
